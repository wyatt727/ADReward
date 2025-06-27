package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhdw extends zzgzv implements zzhbm {
    private static final zzhdw zza;
    private static volatile zzhbt zzb;
    private zzhah zzc = zzbK();

    static {
        zzhdw zzhdwVar = new zzhdw();
        zza = zzhdwVar;
        zzgzv.zzca(zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
    }

    public static zzhdv zzc() {
        return (zzhdv) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhdw zzhdwVar, zzhdu zzhduVar) {
        zzhduVar.getClass();
        zzhah zzhahVar = zzhdwVar.zzc;
        if (!zzhahVar.zzc()) {
            zzhdwVar.zzc = zzgzv.zzbL(zzhahVar);
        }
        zzhdwVar.zzc.add(zzhduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhds zzhdsVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhdu.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdw();
            case NEW_BUILDER:
                return new zzhdv(zzhdsVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhdw.class) {
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
