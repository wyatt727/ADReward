package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtt extends zzgzv implements zzhbm {
    private static final zzgtt zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtt zzgttVar = new zzgtt();
        zza = zzgttVar;
        zzgzv.zzca(zzgtt.class, zzgttVar);
    }

    private zzgtt() {
    }

    public static zzgts zzd() {
        return (zzgts) zza.zzaZ();
    }

    public static zzgtt zzf(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtt) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgtr zzgtrVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtt();
            case NEW_BUILDER:
                return new zzgts(zzgtrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgtt.class) {
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
