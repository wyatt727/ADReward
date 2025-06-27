package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzauw extends zzgzv implements zzhbm {
    private static final zzauw zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();
    private zzgyj zze = zzgyj.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzauw zzauwVar = new zzauw();
        zza = zzauwVar;
        zzgzv.zzca(zzauw.class, zzauwVar);
    }

    private zzauw() {
    }

    public static zzauv zza() {
        return (zzauv) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzauw zzauwVar, zzgyj zzgyjVar) {
        zzhah zzhahVar = zzauwVar.zzd;
        if (!zzhahVar.zzc()) {
            zzauwVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzauwVar.zzd.add(zzgyjVar);
    }

    static /* synthetic */ void zze(zzauw zzauwVar, zzgyj zzgyjVar) {
        zzauwVar.zzc |= 1;
        zzauwVar.zze = zzgyjVar;
    }

    static /* synthetic */ void zzf(zzauw zzauwVar, zzauk zzaukVar) {
        zzauwVar.zzg = zzaukVar.zza();
        zzauwVar.zzc |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzasz zzaszVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzaup.zza, "zzg", zzauj.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzauw();
            case NEW_BUILDER:
                return new zzauv(zzaszVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzauw.class) {
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
