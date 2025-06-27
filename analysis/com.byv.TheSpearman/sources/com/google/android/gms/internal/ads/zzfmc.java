package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmc extends zzgzv implements zzhbm {
    private static final zzfmc zza;
    private static volatile zzhbt zzb;
    private zzhah zzc = zzbK();

    static {
        zzfmc zzfmcVar = new zzfmc();
        zza = zzfmcVar;
        zzgzv.zzca(zzfmc.class, zzfmcVar);
    }

    private zzfmc() {
    }

    public static zzflz zzc() {
        return (zzflz) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzfmc zzfmcVar, zzfmb zzfmbVar) {
        zzfmbVar.getClass();
        zzhah zzhahVar = zzfmcVar.zzc;
        if (!zzhahVar.zzc()) {
            zzfmcVar.zzc = zzgzv.zzbL(zzhahVar);
        }
        zzfmcVar.zzc.add(zzfmbVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzfly zzflyVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfmb.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfmc();
            case NEW_BUILDER:
                return new zzflz(zzflyVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzfmc.class) {
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
