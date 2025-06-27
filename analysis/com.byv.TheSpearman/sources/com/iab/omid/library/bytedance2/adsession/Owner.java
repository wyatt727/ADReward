package com.iab.omid.library.bytedance2.adsession;

import com.my.tracker.ads.AdFormat;

/* loaded from: classes4.dex */
public enum Owner {
    NATIVE(AdFormat.NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
