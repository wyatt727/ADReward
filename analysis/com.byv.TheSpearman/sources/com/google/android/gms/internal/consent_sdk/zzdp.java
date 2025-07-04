package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
public final class zzdp {
    public static Object zza(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static void zzb(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
