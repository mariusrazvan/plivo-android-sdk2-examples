package com.plivo.endpoint;

import com.plivo.endpoint.backend.PlivoAppCallback;

import java.util.ArrayList;
import java.util.List;

public class BackendListener extends PlivoAppCallback {
	/**
	 * Endpoint object: root of the sdk usage
	 */
	private Endpoint endpoint;

	/**
	 * EventListener interface that need to be implemented by user.
	 */
	private EventListener eventListener;

	/**
	 * Holds the outgoing/incoming calls for multiple call handlings.
	 */
	private List<Outgoing> outgoingList;
	private List<Incoming> incomingList;

	private boolean isLoggedIn;

	public BackendListener(boolean debug, Endpoint endpoint, EventListener eventListener) {
		super();

		this.endpoint = endpoint;
		this.eventListener = eventListener;
		this.isLoggedIn = false;
	}

	private void logDebug(String str) {
		Log.D("[backend-logs]" + str);
	}

	private void addToIncomingList(Incoming incoming) {
		if (incomingList == null) {
			incomingList = new ArrayList<>();
		}

		if (incomingList.contains(incoming)) {
			incomingList.remove(incoming);
		}
		incomingList.add(incoming);
		logDebug("addToIncomingList " + incoming.getCallId());
	}

	private void addToOutgoingList(Outgoing outgoing) {
		if (outgoingList == null) {
			outgoingList = new ArrayList<>();
		}

		if (outgoingList.contains(outgoing)) {
			outgoingList.remove(outgoing);
		}
		outgoingList.add(outgoing);
		logDebug("addToIncomingList " + outgoing.getCallId());
	}

	private Incoming getIncoming(String callId) {
		if (incomingList == null) return null;

		for (Incoming call : incomingList) {
			if (call.getCallId().equals(callId)) {
				return call;
			}
		}

		return null;
	}

	private Outgoing getOutgoing(String callId) {
		if (outgoingList == null) return null;

		for (Outgoing call : outgoingList) {
			if (call.getCallId().equals(callId)) {
				return call;
			}
		}

		return null;
	}

	@Override
	public void onStarted(String msg) {
		logDebug("onStarted : " + msg);
	}

	@Override
	public void onStopped(int restart) {
		logDebug("onStopped: " + restart);
	}

	@Override
	public void onLogin() {
		logDebug("onLogin");

		if (!this.isLoggedIn) {
			if(eventListener != null) {
				eventListener.onLogin();
			}
			this.isLoggedIn = true;
		}
	}

	@Override
	public void onLogout() {
		logDebug("onLogout");
		this.isLoggedIn = false;
		if (eventListener != null) {
			eventListener.onLogout();
		}
	}

	@Override
	public void onLoginFailed() {
		Log.E("onLoginFailed");
		this.isLoggedIn = false;
		if (eventListener != null) {
			eventListener.onLoginFailed();
		}
	}

	@Override
	public void onDebugMessage(String message) {
		logDebug("[onDebugMessage]" + message);
	}

	@Override
	public void onIncomingCall(int pjsuaCallId, String callId, String fromContact, String toContact, String header) {
		logDebug("onIncomingCall " + pjsuaCallId + " callId: " + callId);

		Incoming incoming = new Incoming(pjsuaCallId, callId, fromContact, toContact, header);
		addToIncomingList(incoming);
		if (eventListener != null)
			eventListener.onIncomingCall(incoming);
	}

	@Override
	public void onIncomingCallHangup(int pjsuaCallId, String callId) {
		logDebug("onIncomingCallHangup " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null)
			eventListener.onIncomingCallHangup(getIncoming(callId));
	}

	@Override
	public void onIncomingCallRejected(int pjsuaCallId, String callId) {
		logDebug("onIncomingCallRejected " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null)
			eventListener.onIncomingCallRejected(getIncoming(callId));
	}

	@Override
	public void onOutgoingCall(int pjsuaCallId, String callId) {
		logDebug("onOutgoingCall " + pjsuaCallId + " callId: " + callId);
		Outgoing out = this.endpoint.getOutgoing();
		addToOutgoingList(out);
		out.pjsuaCallId = pjsuaCallId;
		out.setCallId(callId);
		if (eventListener != null) {
			eventListener.onOutgoingCall(out);
		}
	}
	@Override
	public void onOutgoingCallAnswered(int pjsuaCallId, String callId) {
		logDebug("onOutgoingCallAnswered " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null) {
			eventListener.onOutgoingCallAnswered(getOutgoing(callId));
		}
	}

	@Override
	public void onOutgoingCallHangup(int pjsuaCallId, String callId) {
		logDebug("onOutgoingCallHangup " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null) {
			eventListener.onOutgoingCallHangup(getOutgoing(callId));
		}
	}
	@Override
	public void onOutgoingCallRejected(int pjsuaCallId, String callId) {
		logDebug("onOutgoingCallRejected " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null) {
			eventListener.onOutgoingCallRejected(getOutgoing(callId));
		}
	}
	@Override
	public void onOutgoingCallInvalid(int pjsuaCallId, String callId) {
		Log.E("onOutgoingCallInvalid " + pjsuaCallId + " callId: " + callId);
		if (eventListener != null) {
			eventListener.onOutgoingCallInvalid(getOutgoing(callId));
		}
	}

	@Override
	public void onIncomingDigitNotification(int digit) {
		logDebug("onIncomingDigitNotification " + digit);
		String new_digit = Integer.toString(digit);
		if (eventListener != null) {
			eventListener.onIncomingDigitNotification(new_digit);
		}
	}
}

