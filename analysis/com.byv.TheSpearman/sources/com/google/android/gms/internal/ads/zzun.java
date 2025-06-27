package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzun implements zzvr, zzsh {
    final /* synthetic */ zzup zza;
    private final Object zzb;
    private zzvq zzc;
    private zzsg zzd;

    public zzun(zzup zzupVar, Object obj) {
        this.zza = zzupVar;
        this.zzc = zzupVar.zze(null);
        this.zzd = zzupVar.zzc(null);
        this.zzb = obj;
    }

    private final zzvd zzf(zzvd zzvdVar, zzvh zzvhVar) {
        zzup zzupVar = this.zza;
        Object obj = this.zzb;
        long j = zzvdVar.zzc;
        zzupVar.zzx(obj, j, zzvhVar);
        zzup zzupVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzvdVar.zzd;
        zzupVar2.zzx(obj2, j2, zzvhVar);
        return (j == zzvdVar.zzc && j2 == zzvdVar.zzd) ? zzvdVar : new zzvd(1, zzvdVar.zza, zzvdVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzvh zzvhVar) {
        zzvh zzvhVarZzy;
        if (zzvhVar != null) {
            zzvhVarZzy = this.zza.zzy(this.zzb, zzvhVar);
            if (zzvhVarZzy == null) {
                return false;
            }
        } else {
            zzvhVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzvq zzvqVar = this.zzc;
        int i2 = zzvqVar.zza;
        if (!zzfx.zzG(zzvqVar.zzb, zzvhVarZzy)) {
            this.zzc = this.zza.zzf(0, zzvhVarZzy);
        }
        zzsg zzsgVar = this.zzd;
        int i3 = zzsgVar.zza;
        if (zzfx.zzG(zzsgVar.zzb, zzvhVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzvhVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzae(int i, zzvh zzvhVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            this.zzc.zzc(zzf(zzvdVar, zzvhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzaf(int i, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            this.zzc.zzd(zzuyVar, zzf(zzvdVar, zzvhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzag(int i, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            this.zzc.zze(zzuyVar, zzf(zzvdVar, zzvhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzah(int i, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z) {
        if (zzg(0, zzvhVar)) {
            this.zzc.zzf(zzuyVar, zzf(zzvdVar, zzvhVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzai(int i, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            this.zzc.zzg(zzuyVar, zzf(zzvdVar, zzvhVar));
        }
    }
}
