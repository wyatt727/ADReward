package com.apm.insight.k;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f90a;
    private String b;
    private JSONObject c;
    private byte[] d;

    public l(int i) {
        this.f90a = i;
    }

    public l(int i, String str) {
        this.f90a = i;
        this.b = str;
    }

    public l(int i, Throwable th) {
        this.f90a = i;
        if (th != null) {
            this.b = th.getMessage();
        }
    }

    public l(int i, JSONObject jSONObject) {
        this.f90a = i;
        this.c = jSONObject;
    }

    public l(int i, byte[] bArr) {
        this.f90a = i;
        this.d = bArr;
    }

    public boolean a() {
        return this.f90a != 207;
    }

    public byte[] b() {
        return this.d;
    }
}
