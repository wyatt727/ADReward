package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public /* synthetic */ class C03750t {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[AdPlacementType.values().length];
        A00 = iArr;
        try {
            iArr[AdPlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            A00[AdPlacementType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            A00[AdPlacementType.NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            A00[AdPlacementType.NATIVE_BANNER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            A00[AdPlacementType.REWARDED_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
