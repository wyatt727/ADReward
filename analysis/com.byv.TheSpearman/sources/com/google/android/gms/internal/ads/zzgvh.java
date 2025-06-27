package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvh extends zzgzv implements zzhbm {
    private static final zzgvh zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();

    static {
        zzgvh zzgvhVar = new zzgvh();
        zza = zzgvhVar;
        zzgzv.zzca(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    public static zzgve zza() {
        return (zzgve) zza.zzaZ();
    }

    static /* synthetic */ void zze(zzgvh zzgvhVar, zzgvg zzgvgVar) {
        zzgvgVar.getClass();
        zzhah zzhahVar = zzgvhVar.zzd;
        if (!zzhahVar.zzc()) {
            zzgvhVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzgvhVar.zzd.add(zzgvgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvd zzgvdVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgvg.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvh();
            case NEW_BUILDER:
                return new zzgve(zzgvdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvh.class) {
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
