package com.mbridge.msdk.out;

/* loaded from: classes4.dex */
public enum ZoomOutTypeEnum {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int index;

    ZoomOutTypeEnum(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
