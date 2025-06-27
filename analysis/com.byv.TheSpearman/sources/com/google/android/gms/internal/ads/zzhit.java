package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhit implements zzhiv {
    private zzhje zza;

    public static void zza(zzhje zzhjeVar, zzhje zzhjeVar2) {
        zzhit zzhitVar = (zzhit) zzhjeVar;
        if (zzhitVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhitVar.zza = zzhjeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final Object zzb() {
        zzhje zzhjeVar = this.zza;
        if (zzhjeVar != null) {
            return zzhjeVar.zzb();
        }
        throw new IllegalStateException();
    }
}
