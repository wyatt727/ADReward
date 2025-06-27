package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmb extends zzgzv implements zzhbm {
    private static final zzfmb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzflx zzd;

    static {
        zzfmb zzfmbVar = new zzfmb();
        zza = zzfmbVar;
        zzgzv.zzca(zzfmb.class, zzfmbVar);
    }

    private zzfmb() {
    }

    public static zzfma zza() {
        return (zzfma) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzfmb zzfmbVar, zzflx zzflxVar) {
        zzflxVar.getClass();
        zzfmbVar.zzd = zzflxVar;
        zzfmbVar.zzc |= 1;
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
                return zzbR(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfmb();
            case NEW_BUILDER:
                return new zzfma(zzflyVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzfmb.class) {
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
