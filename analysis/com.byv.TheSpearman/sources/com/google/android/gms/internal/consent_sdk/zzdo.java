package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
public final class zzdo implements zzdn {
    private static final zzdo zza = new zzdo(null);
    private final Object zzb;

    private zzdo(Object obj) {
        this.zzb = obj;
    }

    public static zzdn zzb(Object obj) {
        Objects.requireNonNull(obj, "instance cannot be null");
        return new zzdo(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb;
    }
}
