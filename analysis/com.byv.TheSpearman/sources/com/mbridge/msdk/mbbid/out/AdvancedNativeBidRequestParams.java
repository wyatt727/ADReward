package com.mbridge.msdk.mbbid.out;

/* loaded from: classes4.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a, reason: collision with root package name */
    private int f3092a;
    private int b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f3092a = i2;
        this.b = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f3092a = i2;
        this.b = i;
    }

    public int getHeight() {
        return this.f3092a;
    }

    public void setHeight(int i) {
        this.f3092a = i;
    }

    public int getWidth() {
        return this.b;
    }

    public void setWidth(int i) {
        this.b = i;
    }
}
