package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwe extends zzgzv implements zzhbm {
    private static final zzgwe zza;
    private static volatile zzhbt zzb;
    private int zzc;

    static {
        zzgwe zzgweVar = new zzgwe();
        zza = zzgweVar;
        zzgzv.zzca(zzgwe.class, zzgweVar);
    }

    private zzgwe() {
    }

    public static zzgwe zzd() {
        return zza;
    }

    public static zzgwe zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgwe) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgwc zzgwcVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwe();
            case NEW_BUILDER:
                return new zzgwd(zzgwcVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgwe.class) {
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
