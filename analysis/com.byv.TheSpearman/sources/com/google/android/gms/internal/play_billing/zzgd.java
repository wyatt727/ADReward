package com.google.android.gms.internal.play_billing;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public enum zzgd {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzcc.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzgd(Object obj) {
        this.zzk = obj;
    }
}
