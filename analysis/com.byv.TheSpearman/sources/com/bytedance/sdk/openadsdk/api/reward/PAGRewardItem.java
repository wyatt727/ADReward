package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes2.dex */
public class PAGRewardItem {
    private final int EYQ;
    private final String mZx;

    public PAGRewardItem(int i, String str) {
        this.EYQ = i;
        this.mZx = str;
    }

    public int getRewardAmount() {
        return this.EYQ;
    }

    public String getRewardName() {
        return this.mZx;
    }
}
