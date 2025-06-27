package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhiw implements zzhiv, zzhip {
    private static final zzhiw zza = new zzhiw(null);
    private final Object zzb;

    private zzhiw(Object obj) {
        this.zzb = obj;
    }

    public static zzhiv zza(Object obj) {
        zzhjd.zza(obj, "instance cannot be null");
        return new zzhiw(obj);
    }

    public static zzhiv zzc(Object obj) {
        return obj == null ? zza : new zzhiw(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final Object zzb() {
        return this.zzb;
    }
}
