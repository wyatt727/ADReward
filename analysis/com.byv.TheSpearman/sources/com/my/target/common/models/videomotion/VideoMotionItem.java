package com.my.target.common.models.videomotion;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class VideoMotionItem {
    public final String ctaText;
    public final String currency;
    public final String id;
    public final String image;
    public final String oldPrice;
    public final String price;
    public final String text;

    public VideoMotionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.id = str;
        this.price = str2;
        this.oldPrice = str3;
        this.currency = str4;
        this.image = str5;
        this.text = str6;
        this.ctaText = str7;
    }

    public String toString() {
        return "VideoMotionItem{id='" + this.id + "', price='" + this.price + "', oldPrice='" + this.oldPrice + "', currency='" + this.currency + "', image='" + this.image + "', text='" + this.text + "', ctaText='" + this.ctaText + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
