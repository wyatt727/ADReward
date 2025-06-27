package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes4.dex */
public class e0 extends L {
    private Context n;

    public e0(Context context, String str) {
        super(context, null);
        this.n = null;
        this.n = context;
        this.b = J.b() + b();
    }

    @Override // com.pgl.ssdk.L
    public boolean a(int i, byte[] bArr) {
        Object objA;
        try {
            objA = b0.a(bArr);
        } catch (Throwable unused) {
        }
        if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
            b0.f4305a = 200;
            return true;
        }
        if (objA instanceof String) {
            b0.c = (String) objA;
            b0.f4305a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + b0.b + "&did=" + com.pgl.ssdk.ces.f.c() + "&app_ver=" + AbstractC1403d.a(this.n) + "&platform=android&ver=5.9.0.0.overseas-rc.8&mode=1";
    }
}
