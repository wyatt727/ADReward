package com.google.android.gms.internal.ads;

import com.json.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzis {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzis(String str, zzam zzamVar, zzam zzamVar2, int i, int i2) {
        boolean z = false;
        if (i == 0) {
            z = true;
        } else if (i2 == 0) {
            i2 = 0;
            z = true;
        }
        zzek.zzd(z);
        zzek.zzc(str);
        this.zza = str;
        this.zzb = zzamVar;
        Objects.requireNonNull(zzamVar2);
        this.zzc = zzamVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzis zzisVar = (zzis) obj;
            if (this.zzd == zzisVar.zzd && this.zze == zzisVar.zze && this.zza.equals(zzisVar.zza) && this.zzb.equals(zzisVar.zzb) && this.zzc.equals(zzisVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
