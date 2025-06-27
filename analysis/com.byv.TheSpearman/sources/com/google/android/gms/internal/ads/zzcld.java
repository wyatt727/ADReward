package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcld {
    private zzcin zza;
    private zzcmq zzb;
    private zzfkr zzc;
    private zzcnc zzd;
    private zzfhl zze;

    private zzcld() {
    }

    /* synthetic */ zzcld(zzclc zzclcVar) {
    }

    public final zzcik zza() {
        zzhjd.zzc(this.zza, zzcin.class);
        zzhjd.zzc(this.zzb, zzcmq.class);
        if (this.zzc == null) {
            this.zzc = new zzfkr();
        }
        if (this.zzd == null) {
            this.zzd = new zzcnc();
        }
        if (this.zze == null) {
            this.zze = new zzfhl();
        }
        return new zzckh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcld zzb(zzcin zzcinVar) {
        this.zza = zzcinVar;
        return this;
    }

    public final zzcld zzc(zzcmq zzcmqVar) {
        this.zzb = zzcmqVar;
        return this;
    }
}
