package com.my.target;

/* loaded from: classes4.dex */
public class u3 extends p3 {
    private boolean forceMediaPlayback;
    private String source;
    private float timeToReward;

    private u3() {
    }

    public static u3 fromCompanion(e1 e1Var) {
        u3 u3VarNewBanner = newBanner();
        u3VarNewBanner.setId(e1Var.getId());
        u3VarNewBanner.setSource(e1Var.getHtmlResource());
        u3VarNewBanner.getStatHolder().a(e1Var.getStatHolder(), 0.0f);
        u3VarNewBanner.trackingLink = e1Var.trackingLink;
        return u3VarNewBanner;
    }

    public static u3 newBanner() {
        return new u3();
    }

    public boolean getForceMediaPlayback() {
        return this.forceMediaPlayback;
    }

    public String getSource() {
        return this.source;
    }

    public float getTimeToReward() {
        return this.timeToReward;
    }

    public void setForceMediaPlayback(boolean z) {
        this.forceMediaPlayback = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTimeToReward(float f) {
        this.timeToReward = f;
    }
}
