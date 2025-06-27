package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwp extends zzuh implements zzwg {
    private final zzgu zza;
    private final zzsm zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhy zzh;
    private zzbp zzi;
    private final zzwm zzj;
    private final zzzs zzk;

    /* synthetic */ zzwp(zzbp zzbpVar, zzgu zzguVar, zzwm zzwmVar, zzsm zzsmVar, zzzs zzzsVar, int i, zzwo zzwoVar) {
        this.zzi = zzbpVar;
        this.zza = zzguVar;
        this.zzj = zzwmVar;
        this.zzb = zzsmVar;
        this.zzk = zzzsVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzbp zzbpVarZzJ = zzJ();
        zzxc zzxcVar = new zzxc(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbpVarZzJ, z2 ? zzbpVarZzJ.zzf : null);
        zzo(this.zzd ? new zzwl(this, zzxcVar) : zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        ((zzwk) zzvfVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzvf zzI(zzvh zzvhVar, zzzo zzzoVar, long j) {
        zzgv zzgvVarZza = this.zza.zza();
        zzhy zzhyVar = this.zzh;
        if (zzhyVar != null) {
            zzgvVarZza.zzf(zzhyVar);
        }
        zzbi zzbiVar = zzJ().zzd;
        Objects.requireNonNull(zzbiVar);
        zzwm zzwmVar = this.zzj;
        zzb();
        return new zzwk(zzbiVar.zzb, zzgvVarZza, new zzuj(zzwmVar.zza), this.zzb, zzc(zzvhVar), this.zzk, zze(zzvhVar), this, zzzoVar, null, this.zzc, zzfx.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzn(zzhy zzhyVar) {
        this.zzh = zzhyVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzuh, com.google.android.gms.internal.ads.zzvj
    public final synchronized void zzt(zzbp zzbpVar) {
        this.zzi = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzz() {
    }
}
