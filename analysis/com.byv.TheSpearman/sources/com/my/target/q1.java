package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.n1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class q1 {
    public static final q1 n = new q1();

    /* renamed from: a, reason: collision with root package name */
    public final z f4097a = new z();
    public final k1 b = new k1();
    public final n1 c = new n1();
    public final v1 d = new v1();
    public final g7 e = new g7();
    public final e2 f = new e2();
    public final m0 g = new m0();
    public final j0 h = new j0();
    public final i0 i = new i0();
    public final sa j = new sa();
    public final b6 k = new b6();
    public volatile String l = null;
    public volatile String m = null;

    public static q1 b() {
        return n;
    }

    public final long a(o5 o5Var, int i, long j) {
        if (o5Var == null) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        o5Var.b(i, jCurrentTimeMillis - j);
        return jCurrentTimeMillis;
    }

    public j1 a() {
        return this.b.a();
    }

    public String a(Context context) {
        return this.b.a(context);
    }

    public String a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, Context context) {
        if (c0.a()) {
            ba.a("FingerprintDataProvider: You must not call getBidderToken method from main thread");
            return "";
        }
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    HashMap map = new HashMap();
                    map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
                    map.putAll(this.b.a(myTargetConfig, context));
                    this.l = m1.a(map);
                    map.putAll(this.d.a(myTargetConfig, context));
                    map.putAll(this.f.a(myTargetConfig, context));
                    this.m = m1.a(map);
                }
            }
        }
        String str = myTargetPrivacy.isConsent() ? this.m : this.l;
        return str != null ? str : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    public Map<String, String> a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, o5 o5Var, Context context) {
        Map<String, String> mapA;
        Map<String, String> map;
        Map<String, String> mapA2;
        Map<String, String> mapA3;
        HashMap map2;
        if (c0.a()) {
            ba.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return Collections.emptyMap();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> mapA4 = this.f4097a.a(myTargetConfig, context);
        a(o5Var, 23, jCurrentTimeMillis);
        Map<String, String> mapA5 = this.b.a(myTargetConfig, context);
        long jA = a(o5Var, 10, jCurrentTimeMillis);
        Map<String, String> mapA6 = this.j.a(myTargetConfig, context);
        a(o5Var, 21, jA);
        Map<String, String> mapA7 = this.i.a(myTargetConfig, context);
        long jA2 = a(o5Var, 16, jA);
        Map<String, String> mapA8 = this.k.a(myTargetConfig, context);
        a(o5Var, 22, jA2);
        HashMap map3 = new HashMap();
        if (myTargetPrivacy.isConsent()) {
            this.c.b(myTargetConfig, context);
            long jA3 = a(o5Var, 15, jA2);
            Map<String, String> mapA9 = this.d.a(myTargetConfig, context);
            long jA4 = a(o5Var, 11, jA3);
            ?? A = this.e.a(myTargetConfig, context);
            long jA5 = a(o5Var, 14, jA4);
            mapA2 = this.f.a(myTargetConfig, context);
            long jA6 = a(o5Var, 13, jA5);
            mapA3 = this.h.a(myTargetConfig, context);
            long jA7 = a(o5Var, 17, jA6);
            mapA = this.g.a(myTargetConfig, context);
            a(o5Var, 18, jA7);
            map = mapA9;
            map3 = A;
        } else {
            mapA = map3;
            map = mapA;
            mapA2 = map;
            mapA3 = mapA2;
        }
        synchronized (this) {
            map2 = new HashMap();
            map2.putAll(mapA4);
            map2.putAll(mapA5);
            map2.putAll(mapA6);
            map2.putAll(mapA7);
            map2.putAll(mapA8);
            if (myTargetPrivacy.isConsent()) {
                n1.d dVarA = this.c.a();
                if (o5Var != null) {
                    o5Var.b(15, dVarA.a());
                }
                map2.putAll(dVarA.b());
                map2.putAll(map);
                map2.putAll(map3);
                map2.putAll(mapA2);
                map2.putAll(mapA3);
                map2.putAll(mapA);
            }
        }
        return map2;
    }

    public void a(MyTargetConfig myTargetConfig, Context context) {
        if (c0.a()) {
            ba.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return;
        }
        this.f4097a.a(myTargetConfig, context);
        this.b.a(myTargetConfig, context);
        this.d.a(myTargetConfig, context);
        this.f.a(myTargetConfig, context);
    }
}
