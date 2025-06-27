package com.mbridge.msdk.e;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Event.java */
/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f2717a;
    private JSONObject d;
    private h i;
    private int b = 0;
    private int c = 0;
    private long g = 0;
    private long h = 604800000;
    private boolean j = false;
    private boolean k = false;
    private long f = System.currentTimeMillis();
    private String e = UUID.randomUUID().toString();

    public e(String str) {
        this.f2717a = str;
    }

    public final String a() {
        return this.f2717a;
    }

    public final int b() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final int c() {
        return this.c;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.d = jSONObject2;
        return jSONObject2;
    }

    public final void a(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public final String e() {
        return this.e;
    }

    final void a(String str) {
        this.e = str;
    }

    public final long f() {
        return this.f;
    }

    public final void a(long j) {
        this.f = j;
    }

    public final long g() {
        return this.g;
    }

    public final void b(long j) {
        this.g = j;
    }

    final void c(long j) {
        this.h = j;
    }

    public final long h() {
        return this.h;
    }

    public final h i() {
        return this.i;
    }

    public final void a(h hVar) {
        this.i = hVar;
    }

    public final boolean j() {
        return this.j;
    }

    public final void a(boolean z) {
        this.k = z;
    }

    public final boolean k() {
        return this.k;
    }
}
