package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzlt implements zzvr, zzsh {
    final /* synthetic */ zzlx zza;
    private final zzlv zzb;

    public zzlt(zzlx zzlxVar, zzlv zzlvVar) {
        this.zza = zzlxVar;
        this.zzb = zzlvVar;
    }

    private final Pair zzf(int i, zzvh zzvhVar) {
        zzvh zzvhVarZza;
        zzvh zzvhVar2 = null;
        if (zzvhVar != null) {
            zzlv zzlvVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzlvVar.zzc.size()) {
                    zzvhVarZza = null;
                    break;
                }
                if (((zzvh) zzlvVar.zzc.get(i2)).zzd == zzvhVar.zzd) {
                    zzvhVarZza = zzvhVar.zza(Pair.create(zzlvVar.zzb, zzvhVar.zza));
                    break;
                }
                i2++;
            }
            if (zzvhVarZza == null) {
                return null;
            }
            zzvhVar2 = zzvhVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzvhVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzae(int i, zzvh zzvhVar, final zzvd zzvdVar) {
        final Pair pairZzf = zzf(0, zzvhVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlr
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzae(((Integer) pair.first).intValue(), (zzvh) pair.second, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzaf(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final Pair pairZzf = zzf(0, zzvhVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzag(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final Pair pairZzf = zzf(0, zzvhVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzah(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zzvhVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlo
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzai(int i, zzvh zzvhVar, final zzuy zzuyVar, final zzvd zzvdVar) {
        final Pair pairZzf = zzf(0, zzvhVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlq
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzvh) pair.second, zzuyVar, zzvdVar);
                }
            });
        }
    }
}
