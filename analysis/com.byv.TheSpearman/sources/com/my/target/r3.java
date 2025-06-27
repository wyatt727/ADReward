package com.my.target;

/* loaded from: classes4.dex */
public class r3 extends b {
    private boolean imageOnly;

    private r3() {
        this.clickArea = x0.q;
    }

    public static r3 newCard(p3 p3Var) {
        r3 r3Var = new r3();
        r3Var.id = p3Var.id;
        r3Var.ctaText = p3Var.ctaText;
        r3Var.navigationType = p3Var.navigationType;
        r3Var.urlscheme = p3Var.urlscheme;
        r3Var.bundleId = p3Var.bundleId;
        r3Var.directLink = p3Var.directLink;
        r3Var.openInBrowser = p3Var.openInBrowser;
        r3Var.deeplink = p3Var.deeplink;
        r3Var.clickArea = p3Var.clickArea;
        r3Var.rating = p3Var.rating;
        r3Var.votes = p3Var.votes;
        r3Var.domain = p3Var.domain;
        r3Var.category = p3Var.category;
        r3Var.subCategory = p3Var.subCategory;
        return r3Var;
    }

    public boolean isImageOnly() {
        return this.imageOnly;
    }

    public void setImageOnly(boolean z) {
        this.imageOnly = z;
    }
}
