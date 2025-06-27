package com.json.mediationsdk;

import com.google.android.gms.nearby.messages.Strategy;

/* loaded from: classes4.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f1898a;
    private final int b;
    private final String c;
    public ISContainerParams containerParams;
    private boolean d;
    public static final ISBannerSize BANNER = l.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = l.a("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = l.a("RECTANGLE", Strategy.TTL_SECONDS_DEFAULT, 250);
    protected static final ISBannerSize e = l.a();
    public static final ISBannerSize SMART = l.a("SMART", 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.c = str;
        this.f1898a = i;
        this.b = i2;
        this.containerParams = new ISContainerParams(i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return l.a(i);
    }

    public String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.f1898a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (l.a(iSContainerParams, this.f1898a, this.b)) {
            this.containerParams = iSContainerParams;
        }
    }
}
