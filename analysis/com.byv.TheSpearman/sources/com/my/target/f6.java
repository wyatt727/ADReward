package com.my.target;

/* loaded from: classes4.dex */
public class f6 extends b {
    private String discount;

    private f6() {
    }

    public static f6 newCard(d6 d6Var) {
        f6 f6Var = new f6();
        f6Var.ctaText = d6Var.ctaText;
        f6Var.navigationType = d6Var.navigationType;
        f6Var.urlscheme = d6Var.urlscheme;
        f6Var.bundleId = d6Var.bundleId;
        f6Var.directLink = d6Var.directLink;
        f6Var.openInBrowser = d6Var.openInBrowser;
        f6Var.deeplink = d6Var.deeplink;
        f6Var.clickArea = d6Var.clickArea;
        f6Var.rating = d6Var.rating;
        f6Var.votes = d6Var.votes;
        f6Var.domain = d6Var.domain;
        f6Var.category = d6Var.category;
        f6Var.subCategory = d6Var.subCategory;
        return f6Var;
    }

    public String getDiscount() {
        return this.discount;
    }

    public void setDiscount(String str) {
        this.discount = str;
    }
}
