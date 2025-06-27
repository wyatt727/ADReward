package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuz implements zzvf, zzve {
    public final zzvh zza;
    private final long zzb;
    private zzvj zzc;
    private zzvf zzd;
    private zzve zze;
    private long zzf = -9223372036854775807L;
    private final zzzo zzg;

    public zzuz(zzvh zzvhVar, zzzo zzzoVar, long j) {
        this.zza = zzvhVar;
        this.zzg = zzzoVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zza(j, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyz[] zzyzVarArr, boolean[] zArr, zzwy[] zzwyVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzf = -9223372036854775807L;
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zzf(zzyzVarArr, zArr, zzwyVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ void zzg(zzxa zzxaVar) {
        zzve zzveVar = this.zze;
        int i = zzfx.zza;
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        return zzvfVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzi(zzvf zzvfVar) {
        zzve zzveVar = this.zze;
        int i = zzfx.zza;
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        zzvfVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        try {
            zzvf zzvfVar = this.zzd;
            if (zzvfVar != null) {
                zzvfVar.zzk();
                return;
            }
            zzvj zzvjVar = this.zzc;
            if (zzvjVar != null) {
                zzvjVar.zzz();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zze = zzveVar;
        zzvf zzvfVar = this.zzd;
        if (zzvfVar != null) {
            zzvfVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        zzvf zzvfVar = this.zzd;
        int i = zzfx.zza;
        zzvfVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        zzvf zzvfVar = this.zzd;
        return zzvfVar != null && zzvfVar.zzo(zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        zzvf zzvfVar = this.zzd;
        return zzvfVar != null && zzvfVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvh zzvhVar) {
        long jZzv = zzv(this.zzb);
        zzvj zzvjVar = this.zzc;
        Objects.requireNonNull(zzvjVar);
        zzvf zzvfVarZzI = zzvjVar.zzI(zzvhVar, this.zzg, jZzv);
        this.zzd = zzvfVarZzI;
        if (this.zze != null) {
            zzvfVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzvj zzvjVar) {
        zzek.zzf(this.zzc == null);
        this.zzc = zzvjVar;
    }

    public final void zzt() {
        zzvf zzvfVar = this.zzd;
        if (zzvfVar != null) {
            zzvj zzvjVar = this.zzc;
            Objects.requireNonNull(zzvjVar);
            zzvjVar.zzG(zzvfVar);
        }
    }
}
