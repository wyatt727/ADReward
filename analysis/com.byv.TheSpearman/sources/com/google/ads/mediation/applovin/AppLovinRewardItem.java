package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class AppLovinRewardItem implements RewardItem {
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_CURRENCY = "currency";
    private final int amount;
    private final String type;

    public AppLovinRewardItem(int i, String str) {
        this.amount = i;
        this.type = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.amount;
    }
}
