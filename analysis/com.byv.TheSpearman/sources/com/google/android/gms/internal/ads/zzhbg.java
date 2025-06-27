package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbg {
    zzhbg() {
    }

    public static final boolean zza(Object obj) {
        return !((zzhbf) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhbf zzhbfVarZzb = (zzhbf) obj;
        zzhbf zzhbfVar = (zzhbf) obj2;
        if (!zzhbfVar.isEmpty()) {
            if (!zzhbfVarZzb.zze()) {
                zzhbfVarZzb = zzhbfVarZzb.zzb();
            }
            zzhbfVarZzb.zzd(zzhbfVar);
        }
        return zzhbfVarZzb;
    }
}
