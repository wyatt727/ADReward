package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzali implements zzadi {
    private final zzadi zzb;
    private final zzalf zzc;
    private final SparseArray zzd = new SparseArray();

    public zzali(zzadi zzadiVar, zzalf zzalfVar) {
        this.zzb = zzadiVar;
        this.zzc = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzO(zzaef zzaefVar) {
        this.zzb.zzO(zzaefVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzaem zzw(int i, int i2) {
        if (i2 != 3) {
            return this.zzb.zzw(i, i2);
        }
        zzalk zzalkVar = (zzalk) this.zzd.get(i);
        if (zzalkVar != null) {
            return zzalkVar;
        }
        zzalk zzalkVar2 = new zzalk(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzalkVar2);
        return zzalkVar2;
    }
}
