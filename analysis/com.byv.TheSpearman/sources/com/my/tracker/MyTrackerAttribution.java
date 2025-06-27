package com.my.tracker;

/* loaded from: classes4.dex */
public final class MyTrackerAttribution {
    private final String deeplink;

    private MyTrackerAttribution(String str) {
        this.deeplink = str;
    }

    public static MyTrackerAttribution newAttribution(String str) {
        return new MyTrackerAttribution(str);
    }

    public String getDeeplink() {
        return this.deeplink;
    }
}
