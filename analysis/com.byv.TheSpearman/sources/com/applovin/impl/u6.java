package com.applovin.impl;

/* loaded from: classes.dex */
public class u6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f1057a;
    private final Object b;
    private String c;
    private String d;

    public u6(Object obj, long j) {
        this.b = obj;
        this.f1057a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.d = "AppLovin";
        } else if (obj instanceof be) {
            be beVar = (be) obj;
            this.c = beVar.getFormat().getLabel();
            this.d = beVar.getNetworkName();
        }
    }

    public String c() {
        String str = this.c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.d;
        return str != null ? str : "Unknown";
    }

    public Object a() {
        return this.b;
    }

    public long b() {
        return this.f1057a;
    }
}
