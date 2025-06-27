package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgzt<ContainingType extends zzhbl, Type> extends zzgzd<ContainingType, Type> {
    final zzhbl zza;
    final Object zzb;
    final zzhbl zzc;
    final zzgzs zzd;

    zzgzt(zzhbl zzhblVar, Object obj, zzhbl zzhblVar2, zzgzs zzgzsVar, Class cls) {
        if (zzhblVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zzgzsVar.zzc == zzhdn.MESSAGE && zzhblVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = zzhblVar;
        this.zzb = obj;
        this.zzc = zzhblVar2;
        this.zzd = zzgzsVar;
    }
}
