package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f4306a;
    private final Context b;

    public c0(Context context, d0 d0Var) {
        this.f4306a = d0Var;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        int i = J.f4291a;
        String str = i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token" : "https://ssdk-sg.pangle.io/ssdk/sd/token";
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.b, null);
        } catch (Throwable unused) {
            b0.f4305a = 501;
        }
        if (bArr == null || bArr.length <= 0) {
            b0.f4305a = 501;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new e0(this.b, null).a(1, 2, bArr);
        d0 d0Var = this.f4306a;
        if (d0Var != null) {
            d0Var.a(b0.a());
        }
    }
}
