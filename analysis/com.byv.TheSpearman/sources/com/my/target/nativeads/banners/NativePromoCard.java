package com.my.target.nativeads.banners;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import com.my.target.f6;

/* loaded from: classes4.dex */
public class NativePromoCard {
    private final String ctaText;
    private final String description;
    private final String discount;
    private final ImageData image;
    private final String title;

    private NativePromoCard(f6 f6Var) {
        if (TextUtils.isEmpty(f6Var.getTitle())) {
            this.title = null;
        } else {
            this.title = f6Var.getTitle();
        }
        if (TextUtils.isEmpty(f6Var.getDescription())) {
            this.description = null;
        } else {
            this.description = f6Var.getDescription();
        }
        if (TextUtils.isEmpty(f6Var.getCtaText())) {
            this.ctaText = null;
        } else {
            this.ctaText = f6Var.getCtaText();
        }
        this.discount = f6Var.getDiscount();
        this.image = f6Var.getImage();
    }

    public static NativePromoCard newCard(f6 f6Var) {
        return new NativePromoCard(f6Var);
    }

    public String getCtaText() {
        return this.ctaText;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDiscount() {
        return this.discount;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }
}
