package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzcg extends zzcm {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private zzcl zzd;
    private byte zze;

    public final zzcm zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(zzcl zzclVar) {
        Objects.requireNonNull(zzclVar, "Null filePurpose");
        this.zzd = zzclVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(boolean z) {
        this.zzb = false;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zzb(boolean z) {
        this.zzc = false;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcj zza() {
        if (this.zze != 3 || this.zza == null || this.zzd == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" fileOwner");
            }
            if ((this.zze & 1) == 0) {
                sb.append(" hasDifferentDmaOwner");
            }
            if ((this.zze & 2) == 0) {
                sb.append(" skipChecks");
            }
            if (this.zzd == null) {
                sb.append(" filePurpose");
            }
            throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
        }
        return new zzcd(this.zza, this.zzd);
    }

    zzcg() {
    }
}
