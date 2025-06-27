package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzn {
    private final Class<?> zza;
    private final Api.ApiOptions zzb = null;

    zzn(GoogleApi<?> googleApi, Api.ApiOptions apiOptions) {
        this.zza = googleApi.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzn) {
            zzn zznVar = (zzn) obj;
            if (Objects.equal(this.zza, zznVar.zza)) {
                Api.ApiOptions apiOptions = zznVar.zzb;
                if (Objects.equal(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null);
    }
}
