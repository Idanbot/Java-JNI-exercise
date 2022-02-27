#include <iostream>
#include <jni.h>
#include "JniFact.h"

long long calculate(int num) {
    long long result = 1;

    while (num > 1)
    {
        result *= num--;
    }

    return result;
}

JNIEXPORT jlong JNICALL Java_JniFact_calculate
(JNIEnv *env, jobject obj, jint num) {
    return calculate(num);
}