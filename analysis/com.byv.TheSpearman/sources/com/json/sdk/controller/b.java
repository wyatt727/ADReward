package com.json.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.json.sdk.controller.v;
import com.json.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: classes4.dex */
class b {
    private static final String b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final v.u f2147a;

    b(v.u uVar) {
        this.f2147a = uVar;
    }

    void a(String str) {
        v.u uVar = this.f2147a;
        if (uVar != null) {
            uVar.b(str);
        }
    }

    synchronized void a(String str, String str2) throws Exception {
        if (this.f2147a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.u.class.getDeclaredMethod(str, String.class);
        if (Build.VERSION.SDK_INT >= 17 && !declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.f2147a, str2);
    }
}
