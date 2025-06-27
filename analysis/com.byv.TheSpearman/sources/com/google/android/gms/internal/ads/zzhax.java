package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhax extends zzhaz {
    private zzhax() {
        super(null);
    }

    /* synthetic */ zzhax(zzhaw zzhawVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final List zza(Object obj, long j) {
        zzhah zzhahVar = (zzhah) zzhdh.zzh(obj, j);
        if (zzhahVar.zzc()) {
            return zzhahVar;
        }
        int size = zzhahVar.size();
        zzhah zzhahVarZzf = zzhahVar.zzf(size == 0 ? 10 : size + size);
        zzhdh.zzv(obj, j, zzhahVarZzf);
        return zzhahVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzb(Object obj, long j) {
        ((zzhah) zzhdh.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzc(Object obj, Object obj2, long j) {
        zzhah zzhahVarZzf = (zzhah) zzhdh.zzh(obj, j);
        zzhah zzhahVar = (zzhah) zzhdh.zzh(obj2, j);
        int size = zzhahVarZzf.size();
        int size2 = zzhahVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzhahVarZzf.zzc()) {
                zzhahVarZzf = zzhahVarZzf.zzf(size2 + size);
            }
            zzhahVarZzf.addAll(zzhahVar);
        }
        if (size > 0) {
            zzhahVar = zzhahVarZzf;
        }
        zzhdh.zzv(obj, j, zzhahVar);
    }
}
