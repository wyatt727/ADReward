package com.json;

import android.os.Handler;
import android.os.Message;
import com.json.sdk.utils.IronSourceStorageUtils;

/* loaded from: classes4.dex */
class uc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f2334a;
    private final z3 b;

    uc(z3 z3Var, Handler handler) {
        this.b = z3Var;
        this.f2334a = handler;
    }

    Message a() {
        return new Message();
    }

    d5 a(z3 z3Var, String str, long j) {
        return new d5(z3Var, str, j);
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        int iB;
        o7 o7Var = new o7(this.b.b().getParent(), this.b.b().getName());
        Message messageA = a();
        messageA.obj = o7Var;
        String strA = a(o7Var.getParent());
        if (strA == null) {
            iB = 1020;
        } else {
            a4 a4VarCall = a(new z3(o7Var, this.b.e(), this.b.a(), this.b.c(), this.b.d()), strA, 3L).call();
            iB = a4VarCall.b() == 200 ? 1016 : a4VarCall.b();
        }
        messageA.what = iB;
        this.f2334a.sendMessage(messageA);
    }
}
