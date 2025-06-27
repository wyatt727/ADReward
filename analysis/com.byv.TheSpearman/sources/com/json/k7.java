package com.json;

import android.content.Context;
import android.text.TextUtils;
import com.json.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class k7 implements w5 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f1859a = new HashMap();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        String f1860a;
        String b;
        String c;
        Context d;
        String e;

        b a(Context context) {
            this.d = context;
            return this;
        }

        b a(String str) {
            this.b = str;
            return this;
        }

        public k7 a() {
            return new k7(this);
        }

        b b(String str) {
            this.c = str;
            return this;
        }

        b c(String str) {
            this.f1860a = str;
            return this;
        }

        b d(String str) {
            this.e = str;
            return this;
        }
    }

    private k7(b bVar) {
        a(bVar);
        a(bVar.d);
    }

    private void a(Context context) {
        f1859a.put(m4.e, q2.b(context));
    }

    private void a(b bVar) {
        Context context = bVar.d;
        x3 x3VarB = x3.b(context);
        f1859a.put(m4.i, SDKUtils.encodeString(x3VarB.e()));
        f1859a.put(m4.j, SDKUtils.encodeString(x3VarB.f()));
        f1859a.put(m4.k, Integer.valueOf(x3VarB.a()));
        f1859a.put(m4.l, SDKUtils.encodeString(x3VarB.d()));
        f1859a.put(m4.m, SDKUtils.encodeString(x3VarB.c()));
        f1859a.put(m4.d, SDKUtils.encodeString(context.getPackageName()));
        f1859a.put(m4.f, SDKUtils.encodeString(bVar.b));
        f1859a.put("sessionid", SDKUtils.encodeString(bVar.f1860a));
        f1859a.put(m4.b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f1859a.put(m4.n, m4.s);
        f1859a.put("origin", m4.p);
        if (TextUtils.isEmpty(bVar.e)) {
            return;
        }
        f1859a.put(m4.h, SDKUtils.encodeString(bVar.e));
    }

    public static void a(String str) {
        f1859a.put(m4.e, SDKUtils.encodeString(str));
    }

    @Override // com.json.w5
    public Map<String, Object> a() {
        return f1859a;
    }
}
