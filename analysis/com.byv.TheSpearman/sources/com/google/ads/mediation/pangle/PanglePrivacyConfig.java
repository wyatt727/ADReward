package com.google.ads.mediation.pangle;

/* loaded from: classes2.dex */
public class PanglePrivacyConfig {
    private static int coppa = -1;
    private final PangleSdkWrapper pangleSdkWrapper;

    public PanglePrivacyConfig(PangleSdkWrapper pangleSdkWrapper) {
        this.pangleSdkWrapper = pangleSdkWrapper;
    }

    public void setCoppa(int i) {
        if (i == 0) {
            if (this.pangleSdkWrapper.isInitSuccess()) {
                this.pangleSdkWrapper.setChildDirected(0);
            }
            coppa = 0;
        } else if (i == 1) {
            if (this.pangleSdkWrapper.isInitSuccess()) {
                this.pangleSdkWrapper.setChildDirected(1);
            }
            coppa = 1;
        } else {
            if (this.pangleSdkWrapper.isInitSuccess()) {
                this.pangleSdkWrapper.setChildDirected(-1);
            }
            coppa = -1;
        }
    }

    public static int getCoppa() {
        return coppa;
    }
}
