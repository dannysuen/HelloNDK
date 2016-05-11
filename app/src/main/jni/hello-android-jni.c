#include <jni.h>


JNIEXPORT jstring JNICALL
Java_com_example_hellondk_MainActivity_sayHello(JNIEnv *env, jobject instance) {

   // TODO

   return (*env)->NewStringUTF(env, "Hello from JNI");
}