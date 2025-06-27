package com.my.tracker.recsys;

/* loaded from: classes4.dex */
public final class Offer {
    public final double discountPrice;
    public final int discountValue;
    public final String itemId;
    public final String placementId;
    public final double price;
    public final int splitId;
    public final int testId;
    public final int value;

    Offer(String str, String str2, double d, double d2, int i, int i2, int i3, int i4) {
        this.placementId = str;
        this.itemId = str2;
        this.price = d;
        this.discountPrice = d2;
        this.value = i;
        this.discountValue = i2;
        this.testId = i3;
        this.splitId = i4;
    }
}
