package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfsc extends zzfsj {
    private String zza;
    private byte zzb;
    private int zzc;

    zzfsc() {
    }

    public final zzfsj zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final zzfsj zzb(boolean z) {
        this.zzb = (byte) (this.zzb | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final zzfsj zzc(boolean z) {
        this.zzb = (byte) (this.zzb | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final zzfsk zzd() {
        if (this.zzb == 3 && this.zza != null && this.zzc != 0) {
            return new zzfse(this.zza, false, false, null, null, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if ((this.zzb & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.zzb & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.zzc == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final zzfsj zze(int i) {
        this.zzc = 1;
        return this;
    }
}
