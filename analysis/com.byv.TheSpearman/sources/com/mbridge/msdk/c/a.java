package com.mbridge.msdk.c;

import org.json.JSONObject;

/* compiled from: BCP.java */
/* loaded from: classes4.dex */
public final class a {
    private String e;
    private String f;
    private int g;

    /* renamed from: a, reason: collision with root package name */
    private int f2493a = 1;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int h = 0;

    public static a a(String str) {
        Exception e;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e2) {
            e = e2;
            aVar = null;
        }
        try {
            aVar.e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.g.d.f().g);
            aVar.f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.g.d.f().k);
            aVar.g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.g.d.f().o);
            aVar.h = jSONObject.optInt("type", 0);
            int i = 1;
            int iOptInt = jSONObject.optInt("batch_size", 1);
            if (iOptInt >= 1) {
                i = iOptInt;
            }
            aVar.f2493a = i;
            aVar.c = jSONObject.optInt("duration", 0);
            aVar.b = jSONObject.optInt("disable", 0);
            aVar.d = jSONObject.optInt("e_t_l", 0);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return aVar;
        }
        return aVar;
    }

    public final int a() {
        return this.f2493a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }
}
