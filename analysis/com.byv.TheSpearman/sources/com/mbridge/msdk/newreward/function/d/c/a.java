package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* compiled from: BaseCampaignResource.java */
/* loaded from: classes4.dex */
public abstract class a<Resource> implements o {
    private final com.mbridge.msdk.newreward.function.d.a.b b;
    private final com.mbridge.msdk.newreward.function.d.a.a c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f3351a = false;

    public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.b;
    }

    public final com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.c;
    }

    public final void a(boolean z) {
        this.f3351a = z;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return TextUtils.isEmpty(j()) || g() || this.e;
    }

    public boolean d() {
        return TextUtils.isEmpty(j()) || i() || this.f;
    }

    public final int e() {
        return this.d;
    }

    public final void a(int i) {
        this.d = i;
    }
}
