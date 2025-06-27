package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes2.dex */
public class PAGErrorModel {
    private final int EYQ;
    private final String mZx;

    public PAGErrorModel(int i, String str) {
        this.EYQ = i;
        this.mZx = str;
    }

    public int getErrorCode() {
        return this.EYQ;
    }

    public String getErrorMessage() {
        return this.mZx;
    }
}
