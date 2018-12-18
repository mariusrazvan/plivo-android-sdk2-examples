#!/bin/bash
#for VARIIABLE in "mips" "x86" "mips64" "x86_64" "arm64-v8a" "armeabi-v7a"
for VARIABLE in "mips64"
do
    #./opensslbuild.sh $ANDROID_NDK $PWD/openssl/openssl-1.0.2k 24 $VARIABLE $NDK_TOOLCHAIN_VERSION $PWD/openssl/$VARIABLE
	SSLPATH=$PWD/openssl/$VARIABLE
	echo $SSLPATH
	cd ./pjsip
    export TARGET_ABI=$VARIABLE
	./build_pjsip.sh $VARIABLE $SSLPATH
	echo $TARGET_ABI
	#cd ../
	#cd ./pjsip-jni/jni
	#mkdir ../src/libs
	#make clean
	#make
	#cd ../../
	#mkdir -p ./libs/$TARGET_ABI
	#cp ./pjsip-jni/src/libs/libpjplivo.so ./libs/$TARGET_ABI
done
#mkdir -p ./PlivoEndpoint/src/main/jniLibs/
#cp -r libs/* ./PlivoEndpoint/src/main/jniLibs/
#cp pjsip-jni/src/com/plivo/endpoint/backend/*.java ./PlivoEndpoint/src/com/plivo/endpoint/backend/
#cd ./PlivoEndpoint
#gradle clean
#gradle build
