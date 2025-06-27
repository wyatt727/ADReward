package com.my.target.ads;

/* loaded from: classes4.dex */
public class Reward {
    public static final String DEFAULT = "default";
    public final String type;

    private Reward(String str) {
        this.type = str;
    }

    public static Reward getDefault() {
        return new Reward(DEFAULT);
    }
}
