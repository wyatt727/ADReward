package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhgz extends zzgzv implements zzhbm {
    private static final zzhgz zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhgz zzhgzVar = new zzhgz();
        zza = zzhgzVar;
        zzgzv.zzca(zzhgz.class, zzhgzVar);
    }

    private zzhgz() {
    }

    public static zzhgy zzc() {
        return (zzhgy) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhgz zzhgzVar, String str) {
        zzhgzVar.zzc |= 1;
        zzhgzVar.zzd = str;
    }

    static /* synthetic */ void zzg(zzhgz zzhgzVar, long j) {
        zzhgzVar.zzc |= 2;
        zzhgzVar.zze = j;
    }

    static /* synthetic */ void zzh(zzhgz zzhgzVar, boolean z) {
        zzhgzVar.zzc |= 4;
        zzhgzVar.zzf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhdx zzhdxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhhb.zza, "zzh", "zzi", "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgz();
            case NEW_BUILDER:
                return new zzhgy(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhgz.class) {
                        zzgzqVar = zzb;
                        if (zzgzqVar == null) {
                            zzgzqVar = new zzgzq(zza);
                            zzb = zzgzqVar;
                        }
                    }
                }
                return zzgzqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
