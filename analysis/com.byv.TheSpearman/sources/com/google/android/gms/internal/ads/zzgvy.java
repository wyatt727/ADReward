package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzgvy extends zzgzv implements zzhbm {
    private static final zzgvy zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzhah zzd = zzbK();

    static {
        zzgvy zzgvyVar = new zzgvy();
        zza = zzgvyVar;
        zzgzv.zzca(zzgvy.class, zzgvyVar);
    }

    private zzgvy() {
    }

    public static zzgvy zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvw zzgvwVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzc", "zzd", zzgux.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvy();
            case NEW_BUILDER:
                return new zzgvx(zzgvwVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvy.class) {
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
