package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbc implements zzhbj {
    private final zzhbj[] zza;

    zzhbc(zzhbj... zzhbjVarArr) {
        this.zza = zzhbjVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    public final zzhbi zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhbj zzhbjVar = this.zza[i];
            if (zzhbjVar.zzc(cls)) {
                return zzhbjVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
