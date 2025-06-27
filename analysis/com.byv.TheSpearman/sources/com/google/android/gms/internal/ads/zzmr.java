package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzmr {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmr(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int iZza = zzahVar.zza(i);
            zzmq zzmqVar = (zzmq) sparseArray.get(iZza);
            Objects.requireNonNull(zzmqVar);
            sparseArray2.append(iZza, zzmqVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmq zzc(int i) {
        zzmq zzmqVar = (zzmq) this.zzb.get(i);
        Objects.requireNonNull(zzmqVar);
        return zzmqVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
