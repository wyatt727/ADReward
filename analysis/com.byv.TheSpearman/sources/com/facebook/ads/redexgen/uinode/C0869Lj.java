package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public /* synthetic */ class C0869Lj {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[VideoStartReason.values().length];
        A00 = iArr;
        try {
            iArr[VideoStartReason.AUTO_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            A00[VideoStartReason.NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            A00[VideoStartReason.USER_STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
