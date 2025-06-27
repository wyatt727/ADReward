package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtz extends zzgzv implements zzhbm {
    private static final zzgtz zza;
    private static volatile zzhbt zzb;

    static {
        zzgtz zzgtzVar = new zzgtz();
        zza = zzgtzVar;
        zzgzv.zzca(zzgtz.class, zzgtzVar);
    }

    private zzgtz() {
    }

    public static zzgtz zzc() {
        return zza;
    }

    public static zzgtz zzd(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtz) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgtx zzgtxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgtz();
            case NEW_BUILDER:
                return new zzgty(zzgtxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgtz.class) {
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
