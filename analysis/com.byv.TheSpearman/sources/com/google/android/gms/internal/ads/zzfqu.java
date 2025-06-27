package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqu extends zzgzv implements zzhbm {
    private static final zzfqu zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfqo zzg;

    static {
        zzfqu zzfquVar = new zzfqu();
        zza = zzfquVar;
        zzgzv.zzca(zzfqu.class, zzfquVar);
    }

    private zzfqu() {
    }

    public static zzfqq zza() {
        return (zzfqq) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzfqu zzfquVar, zzfqt zzfqtVar) {
        zzfquVar.zzd = zzfqtVar.zza();
        zzfquVar.zzc |= 1;
    }

    static /* synthetic */ void zze(zzfqu zzfquVar, String str) {
        str.getClass();
        zzfquVar.zzc |= 2;
        zzfquVar.zze = str;
    }

    static /* synthetic */ void zzf(zzfqu zzfquVar, zzfqo zzfqoVar) {
        zzfqoVar.getClass();
        zzfquVar.zzg = zzfqoVar;
        zzfquVar.zzc |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzfqp zzfqpVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfqs.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfqu();
            case NEW_BUILDER:
                return new zzfqq(zzfqpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzfqu.class) {
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
