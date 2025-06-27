package com.my.target;

/* loaded from: classes4.dex */
public class b9 extends b {
    private final long interactionTimeoutMillis;
    private final String source;

    private b9(String str, long j) {
        this.interactionTimeoutMillis = j;
        this.type = "shoppable";
        this.source = str;
    }

    public static b9 newBanner(String str, long j) {
        return new b9(str, j);
    }

    public long getInteractionTimeoutMillis() {
        return this.interactionTimeoutMillis;
    }

    public String getSource() {
        return this.source;
    }
}
