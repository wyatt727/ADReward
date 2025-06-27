package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhjk implements zzhje {
    private static final Object zza = new Object();
    private volatile zzhje zzb;
    private volatile Object zzc = zza;

    private zzhjk(zzhje zzhjeVar) {
        this.zzb = zzhjeVar;
    }

    public static zzhje zza(zzhje zzhjeVar) {
        return ((zzhjeVar instanceof zzhjk) || (zzhjeVar instanceof zzhiu)) ? zzhjeVar : new zzhjk(zzhjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhje zzhjeVar = this.zzb;
        if (zzhjeVar == null) {
            return this.zzc;
        }
        Object objZzb = zzhjeVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
