package com.iab.omid.library.ironsrc.adsession;

import com.my.tracker.ads.AdFormat;

/* loaded from: classes4.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(AdFormat.NATIVE),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
