package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.I;
import com.pgl.ssdk.J;

/* loaded from: classes4.dex */
public class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f4310a;
    private String b;

    public g(Context context, String str) {
        this.f4310a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) a.meta(222, this.f4310a, this.b);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i = J.f4291a;
            if (TextUtils.isEmpty(i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r")) {
                return;
            }
            new I(this.f4310a, null).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
