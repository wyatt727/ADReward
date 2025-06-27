package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzhw {
    private final boolean zza;

    public zzhw(zzhv zzhvVar) {
        Preconditions.checkNotNull(zzhvVar, "BuildInfo must be non-null");
        this.zza = !zzhvVar.zza();
    }

    public final boolean zza(String str) {
        Preconditions.checkNotNull(str, "flagName must not be null");
        if (this.zza) {
            return zzhy.zza.get().containsValue(str);
        }
        return true;
    }
}
