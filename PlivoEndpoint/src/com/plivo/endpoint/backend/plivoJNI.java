/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.plivo.endpoint.backend;

public class plivoJNI {
  public final static native int plivoStart();
  public final static native void plivoDestroy();
  public final static native int plivoRestart();
  public final static native void delete_PlivoAppCallback(long jarg1);
  public final static native void PlivoAppCallback_onStarted(long jarg1, PlivoAppCallback jarg1_, String jarg2);
  public final static native void PlivoAppCallback_onStartedSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, String jarg2);
  public final static native void PlivoAppCallback_onStopped(long jarg1, PlivoAppCallback jarg1_, int jarg2);
  public final static native void PlivoAppCallback_onStoppedSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2);
  public final static native void PlivoAppCallback_onLogin(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onLoginSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onLogout(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onLogoutSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onLoginFailed(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onLoginFailedSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_);
  public final static native void PlivoAppCallback_onDebugMessage(long jarg1, PlivoAppCallback jarg1_, String jarg2);
  public final static native void PlivoAppCallback_onDebugMessageSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, String jarg2);
  public final static native void PlivoAppCallback_onIncomingCall(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3, String jarg4, String jarg5, String jarg6);
  public final static native void PlivoAppCallback_onIncomingCallSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3, String jarg4, String jarg5, String jarg6);
  public final static native void PlivoAppCallback_onIncomingCallHangup(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onIncomingCallHangupSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onIncomingCallRejected(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onIncomingCallRejectedSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCall(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallRinging(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallRingingSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallRejected(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallRejectedSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallAnswered(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallAnsweredSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallHangup(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallHangupSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallInvalid(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onOutgoingCallInvalidSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2, String jarg3);
  public final static native void PlivoAppCallback_onIncomingDigitNotification(long jarg1, PlivoAppCallback jarg1_, int jarg2);
  public final static native void PlivoAppCallback_onIncomingDigitNotificationSwigExplicitPlivoAppCallback(long jarg1, PlivoAppCallback jarg1_, int jarg2);
  public final static native long new_PlivoAppCallback();
  public final static native void PlivoAppCallback_director_connect(PlivoAppCallback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void PlivoAppCallback_change_ownership(PlivoAppCallback obj, long cptr, boolean take_or_release);
  public final static native int Call(String jarg1);
  public final static native int CallH(String jarg1, String jarg2);
  public final static native int Login(String jarg1, String jarg2);
  public final static native int Logout();
  public final static native void keepAlive();
  public final static native void resetEndpoint();
  public final static native int Answer(int jarg1);
  public final static native int Hangup(int jarg1);
  public final static native int Reject(int jarg1);
  public final static native int SendDTMF(int jarg1, String jarg2);
  public final static native int Mute(int jarg1);
  public final static native int UnMute(int jarg1);
  public final static native void setCallbackObject(long jarg1, PlivoAppCallback jarg1_);
  public final static native void registerToken(String jarg1);
  public final static native void relayVoipPushNotification(String jarg1);

  public static void SwigDirector_PlivoAppCallback_onStarted(PlivoAppCallback jself, String msg) {
    jself.onStarted(msg);
  }
  public static void SwigDirector_PlivoAppCallback_onStopped(PlivoAppCallback jself, int restart) {
    jself.onStopped(restart);
  }
  public static void SwigDirector_PlivoAppCallback_onLogin(PlivoAppCallback jself) {
    jself.onLogin();
  }
  public static void SwigDirector_PlivoAppCallback_onLogout(PlivoAppCallback jself) {
    jself.onLogout();
  }
  public static void SwigDirector_PlivoAppCallback_onLoginFailed(PlivoAppCallback jself) {
    jself.onLoginFailed();
  }
  public static void SwigDirector_PlivoAppCallback_onDebugMessage(PlivoAppCallback jself, String msg) {
    jself.onDebugMessage(msg);
  }
  public static void SwigDirector_PlivoAppCallback_onIncomingCall(PlivoAppCallback jself, int callId, String sipCallId, String fromContact, String toContact, String header) {
    jself.onIncomingCall(callId, sipCallId, fromContact, toContact, header);
  }
  public static void SwigDirector_PlivoAppCallback_onIncomingCallHangup(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onIncomingCallHangup(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onIncomingCallRejected(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onIncomingCallRejected(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCall(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCall(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCallRinging(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCallRinging(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCallRejected(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCallRejected(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCallAnswered(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCallAnswered(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCallHangup(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCallHangup(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onOutgoingCallInvalid(PlivoAppCallback jself, int callId, String sipCallId) {
    jself.onOutgoingCallInvalid(callId, sipCallId);
  }
  public static void SwigDirector_PlivoAppCallback_onIncomingDigitNotification(PlivoAppCallback jself, int digit) {
    jself.onIncomingDigitNotification(digit);
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
