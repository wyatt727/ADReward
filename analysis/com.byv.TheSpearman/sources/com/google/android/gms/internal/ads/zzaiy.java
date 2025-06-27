package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaiy extends zzaja {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaiy(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final String toString() {
        List list = this.zzb;
        return zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzaiy zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaiy zzaiyVar = (zzaiy) this.zzc.get(i2);
            if (zzaiyVar.zzd == i) {
                return zzaiyVar;
            }
        }
        return null;
    }

    public final zzaiz zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaiz zzaizVar = (zzaiz) this.zzb.get(i2);
            if (zzaizVar.zzd == i) {
                return zzaizVar;
            }
        }
        return null;
    }

    public final void zzc(zzaiy zzaiyVar) {
        this.zzc.add(zzaiyVar);
    }

    public final void zzd(zzaiz zzaizVar) {
        this.zzb.add(zzaizVar);
    }
}
