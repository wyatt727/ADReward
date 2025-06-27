package com.json;

import com.json.mediationsdk.utils.d;

/* loaded from: classes4.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private v0 f2036a;
    private oc b;
    private d c;
    private boolean d;
    private q0 e;
    private ApplicationGeneralSettings f;
    private ApplicationExternalSettings g;
    private PixelSettings h;
    private ApplicationAuctionSettings i;
    private String j;

    public o0() {
        this.f2036a = new v0();
    }

    public o0(v0 v0Var, oc ocVar, d dVar, boolean z, q0 q0Var, ApplicationGeneralSettings applicationGeneralSettings, ApplicationExternalSettings applicationExternalSettings, PixelSettings pixelSettings, ApplicationAuctionSettings applicationAuctionSettings, String str) {
        this.f2036a = v0Var;
        this.b = ocVar;
        this.c = dVar;
        this.d = z;
        this.e = q0Var;
        this.f = applicationGeneralSettings;
        this.g = applicationExternalSettings;
        this.h = pixelSettings;
        this.i = applicationAuctionSettings;
        this.j = str;
    }

    public String a() {
        return this.j;
    }

    public ApplicationAuctionSettings b() {
        return this.i;
    }

    public q0 c() {
        return this.e;
    }

    public ApplicationExternalSettings d() {
        return this.g;
    }

    public ApplicationGeneralSettings e() {
        return this.f;
    }

    public boolean f() {
        return this.d;
    }

    public v0 g() {
        return this.f2036a;
    }

    public PixelSettings h() {
        return this.h;
    }

    public oc i() {
        return this.b;
    }

    public d j() {
        return this.c;
    }
}
