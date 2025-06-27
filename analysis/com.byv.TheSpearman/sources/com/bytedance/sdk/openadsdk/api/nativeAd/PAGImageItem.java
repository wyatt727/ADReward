package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes2.dex */
public class PAGImageItem {
    private final int EYQ;
    private float Pm;
    private final String Td;
    private final int mZx;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.Pm = 0.0f;
        this.EYQ = i;
        this.mZx = i2;
        this.Td = str;
        this.Pm = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }

    public int getHeight() {
        return this.EYQ;
    }

    public int getWidth() {
        return this.mZx;
    }

    public String getImageUrl() {
        return this.Td;
    }

    public float getDuration() {
        return this.Pm;
    }
}
