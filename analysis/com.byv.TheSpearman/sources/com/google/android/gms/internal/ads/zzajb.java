package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajb {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfo zzf;
    private final zzfo zzg;
    private int zzh;
    private int zzi;

    public zzajb(zzfo zzfoVar, zzfo zzfoVar2, boolean z) throws zzcc {
        this.zzg = zzfoVar;
        this.zzf = zzfoVar2;
        this.zze = z;
        zzfoVar2.zzK(12);
        this.zza = zzfoVar2.zzp();
        zzfoVar.zzK(12);
        this.zzi = zzfoVar.zzp();
        zzadj.zzb(zzfoVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzv() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzL(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
