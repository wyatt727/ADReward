package com.bytedance.sdk.openadsdk.core.VwS.EYQ;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: VastErrorCode.java */
/* loaded from: classes2.dex */
public enum EYQ {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(TypedValues.Custom.TYPE_INT);

    private final int QQ;

    EYQ(int i) {
        this.QQ = i;
    }

    public String EYQ() {
        return String.valueOf(this.QQ);
    }
}
