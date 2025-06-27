package com.my.target.common.models;

/* loaded from: classes4.dex */
public abstract class ShoppableAdsItem {
    public final String deeplink;
    public final String deeplinkFallbackUrl;
    public final String id;
    public final String oldPrice;
    public final String picture;
    public final String price;
    public final String text;
    public final String url;

    public ShoppableAdsItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.url = str;
        this.id = str2;
        this.picture = str3;
        this.text = str4;
        this.price = str5;
        this.oldPrice = str6;
        this.deeplink = str7;
        this.deeplinkFallbackUrl = str8;
    }
}
