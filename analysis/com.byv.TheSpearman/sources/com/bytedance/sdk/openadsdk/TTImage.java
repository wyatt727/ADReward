package com.bytedance.sdk.openadsdk;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class TTImage {
    private final int EYQ;
    private double Pm;
    private final String Td;
    private final int mZx;

    public TTImage(int i, int i2, String str, double d) {
        this.Pm = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.EYQ = i;
        this.mZx = i2;
        this.Td = str;
        this.Pm = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
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

    public double getDuration() {
        return this.Pm;
    }

    public boolean isValid() {
        String str;
        return this.EYQ > 0 && this.mZx > 0 && (str = this.Td) != null && str.length() > 0;
    }
}
