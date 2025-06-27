package com.mbridge.msdk.c;

import org.json.JSONObject;

/* compiled from: EventLibMonitorSetting.java */
/* loaded from: classes4.dex */
public final class d {
    private String f;
    private String g;
    private int h;

    /* renamed from: a, reason: collision with root package name */
    private int f2505a = 1;
    private int b = 1;
    private int c = 0;
    private int d = 30;
    private int e = 0;
    private int i = 0;

    public static d a(String str) {
        Exception e;
        d dVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            dVar = new d();
        } catch (Exception e2) {
            e = e2;
            dVar = null;
        }
        try {
            dVar.f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.g.d.f().e);
            dVar.g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.g.d.f().j);
            dVar.h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.g.d.f().n);
            dVar.i = jSONObject.optInt("type", 1);
            dVar.d = jSONObject.optInt("d_t", 30);
            dVar.c = jSONObject.optInt("d_a", 0);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return dVar;
        }
        return dVar;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.g;
    }

    public final int e() {
        return this.h;
    }
}
