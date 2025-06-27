package com.my.target;

/* loaded from: classes4.dex */
public class h6 extends b {
    private final String source;

    private h6(String str) {
        this.source = str;
    }

    public static h6 newContent(d6 d6Var, String str) {
        h6 h6Var = new h6(str);
        h6Var.id = d6Var.id;
        h6Var.trackingLink = d6Var.trackingLink;
        h6Var.deeplink = d6Var.deeplink;
        h6Var.urlscheme = d6Var.urlscheme;
        h6Var.bundleId = d6Var.bundleId;
        h6Var.navigationType = d6Var.navigationType;
        h6Var.directLink = d6Var.directLink;
        h6Var.openInBrowser = d6Var.openInBrowser;
        return h6Var;
    }

    public String getSource() {
        return this.source;
    }
}
