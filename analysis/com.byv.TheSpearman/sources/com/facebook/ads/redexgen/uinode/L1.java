package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L1 {
    public static AdError A00(C0813Jb c0813Jb) {
        if (c0813Jb.A03().isPublicError()) {
            return new AdError(c0813Jb.A03().getErrorCode(), c0813Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
