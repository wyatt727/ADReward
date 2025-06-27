package com.mbridge.msdk.splash.a;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: ReportData.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f3470a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private boolean i;
    private int j;

    public final c a(boolean z) {
        this.i = z;
        return this;
    }

    private c() {
    }

    public static c a() {
        return new c();
    }

    public final c a(String str) {
        this.f3470a = str;
        return this;
    }

    public final void a(int i) {
        this.j = i;
    }

    public final c b(String str) {
        this.b = str;
        return this;
    }

    public final c c(String str) {
        this.c = str;
        return this;
    }

    public final c d(String str) {
        this.d = str;
        return this;
    }

    public final c e(String str) {
        this.f = str;
        return this;
    }

    public final c f(String str) {
        this.g = str;
        return this;
    }

    public final c b(int i) {
        this.h = i;
        return this;
    }

    public final c g(String str) {
        this.e = str;
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append("unit_id=");
            sb.append(this.b);
            sb.append(t2.i.c);
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append("cid=");
            sb.append(this.c);
            sb.append(t2.i.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append("rid=");
            sb.append(this.d);
            sb.append(t2.i.c);
        }
        if (!TextUtils.isEmpty(this.e)) {
            sb.append("rid_n=");
            sb.append(this.e);
            sb.append(t2.i.c);
        }
        if (!TextUtils.isEmpty(this.f)) {
            sb.append("creative_id=");
            sb.append(this.f);
            sb.append(t2.i.c);
        }
        if (!TextUtils.isEmpty(this.g)) {
            sb.append("reason=");
            sb.append(this.g);
            sb.append(t2.i.c);
        }
        if (this.h != 0) {
            sb.append("result=");
            sb.append(this.h);
            sb.append(t2.i.c);
        }
        if (this.i) {
            sb.append("hb=1");
            sb.append(t2.i.c);
        }
        if (this.j != 0) {
            sb.append("close_type=");
            sb.append(this.j);
            sb.append(t2.i.c);
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append(t2.i.c);
        if (!TextUtils.isEmpty(this.f3470a)) {
            sb.append("key=");
            sb.append(this.f3470a);
        }
        return sb.toString();
    }
}
