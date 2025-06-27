package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public class zzbff {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbff(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbff zza(String str, double d) {
        return new zzbff(str, Double.valueOf(d), 3);
    }

    public static zzbff zzb(String str, long j) {
        return new zzbff(str, Long.valueOf(j), 2);
    }

    public static zzbff zzc(String str, String str2) {
        return new zzbff(str, str2, 4);
    }

    public static zzbff zzd(String str, boolean z) {
        return new zzbff(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbgi zzbgiVarZza = zzbgk.zza();
        if (zzbgiVarZza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zzbgiVarZza.zzd(this.zza, (String) this.zzb) : zzbgiVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zzbgiVarZza.zzc(this.zza, ((Long) this.zzb).longValue()) : zzbgiVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbgk.zzb() != null) {
            zzbgk.zzb().zza();
        }
        return this.zzb;
    }
}
