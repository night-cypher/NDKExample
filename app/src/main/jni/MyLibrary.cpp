//
// Created by HP on 17/7/2016.
//
#include "com_example_questdot_ndkexample_TestNDK.h"

JNIEXPORT jstring JNICALL Java_com_example_questdot_ndkexample_TestNDK_getNDKString
  (JNIEnv* env, jobject obj){
  return (*env).NewStringUTF("My Jni Text");
  }