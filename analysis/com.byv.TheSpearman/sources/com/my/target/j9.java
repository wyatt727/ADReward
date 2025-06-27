package com.my.target;

/* loaded from: classes4.dex */
public class j9 extends b {
    private String mraidJs;
    private String source;
    private int timeout = 60;

    private j9() {
    }

    public static j9 newBanner() {
        return new j9();
    }

    public String getMraidJs() {
        return this.mraidJs;
    }

    public String getSource() {
        return this.source;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setMraidJs(String str) {
        this.mraidJs = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }
}
