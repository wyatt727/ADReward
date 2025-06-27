package com.mbridge.msdk.mbbid.common;

/* compiled from: BidRequestParams.java */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f3090a;
    private String b;
    private String c;

    public c(String str, String str2) {
        this.f3090a = str;
        this.b = str2;
    }

    public c(String str, String str2, String str3) {
        this.f3090a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getmUnitId() {
        return this.b;
    }

    public void setmUnitId(String str) {
        this.b = str;
    }

    public String getmFloorPrice() {
        return this.c;
    }

    public void setmFloorPrice(String str) {
        this.c = str;
    }

    public String getmPlacementId() {
        return this.f3090a;
    }

    public void setmPlacementId(String str) {
        this.f3090a = str;
    }
}
