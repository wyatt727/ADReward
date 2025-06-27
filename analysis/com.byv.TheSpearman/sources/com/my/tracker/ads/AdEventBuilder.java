package com.my.tracker.ads;

/* loaded from: classes4.dex */
public final class AdEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f4203a;
    final int b;
    final double c;
    final String d;
    String e;
    String f;
    String g;
    String h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.f4203a = i;
        this.b = i2;
        this.c = d;
        this.d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d, String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f4203a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.e = str;
        return this;
    }
}
