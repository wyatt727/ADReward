package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzvy extends zzup {
    private static final zzbp zza;
    private final zzvj[] zzb;
    private final zzcx[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzgal zzf;
    private int zzg;
    private long[][] zzh;
    private zzvx zzi;
    private final zzus zzj;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("MergingMediaSource");
        zza = zzarVar.zzc();
    }

    public zzvy(boolean z, boolean z2, zzvj... zzvjVarArr) {
        zzus zzusVar = new zzus();
        this.zzb = zzvjVarArr;
        this.zzj = zzusVar;
        this.zzd = new ArrayList(Arrays.asList(zzvjVarArr));
        this.zzg = -1;
        this.zzc = new zzcx[zzvjVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzgat.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    protected final /* bridge */ /* synthetic */ void zzA(Object obj, zzvj zzvjVar, zzcx zzcxVar) {
        int iZzb;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            iZzb = zzcxVar.zzb();
            this.zzg = iZzb;
        } else {
            int iZzb2 = zzcxVar.zzb();
            int i = this.zzg;
            if (iZzb2 != i) {
                this.zzi = new zzvx(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) long.class, iZzb, this.zzc.length);
        }
        this.zzd.remove(zzvjVar);
        this.zzc[((Integer) obj).intValue()] = zzcxVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        zzvw zzvwVar = (zzvw) zzvfVar;
        int i = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzb;
            if (i >= zzvjVarArr.length) {
                return;
            }
            zzvjVarArr[i].zzG(zzvwVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzvf zzI(zzvh zzvhVar, zzzo zzzoVar, long j) {
        zzcx[] zzcxVarArr = this.zzc;
        int length = this.zzb.length;
        zzvf[] zzvfVarArr = new zzvf[length];
        int iZza = zzcxVarArr[0].zza(zzvhVar.zza);
        for (int i = 0; i < length; i++) {
            zzvfVarArr[i] = this.zzb[i].zzI(zzvhVar.zza(this.zzc[i].zzf(iZza)), zzzoVar, j - this.zzh[iZza][i]);
        }
        return new zzvw(this.zzj, this.zzh[iZza], zzvfVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzbp zzJ() {
        zzvj[] zzvjVarArr = this.zzb;
        return zzvjVarArr.length > 0 ? zzvjVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzuh
    protected final void zzn(zzhy zzhyVar) {
        super.zzn(zzhyVar);
        int i = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzb;
            if (i >= zzvjVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i), zzvjVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzuh
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuh, com.google.android.gms.internal.ads.zzvj
    public final void zzt(zzbp zzbpVar) {
        this.zzb[0].zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    protected final /* bridge */ /* synthetic */ zzvh zzy(Object obj, zzvh zzvhVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzvhVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzvj
    public final void zzz() throws IOException {
        zzvx zzvxVar = this.zzi;
        if (zzvxVar != null) {
            throw zzvxVar;
        }
        super.zzz();
    }
}
