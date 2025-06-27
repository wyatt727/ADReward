package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsg extends zzgzv implements zzhbm {
    private static final zzgsg zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgsj zze;

    static {
        zzgsg zzgsgVar = new zzgsg();
        zza = zzgsgVar;
        zzgzv.zzca(zzgsg.class, zzgsgVar);
    }

    private zzgsg() {
    }

    public static zzgsf zzc() {
        return (zzgsf) zza.zzaZ();
    }

    public static zzgsg zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsg) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzh(zzgsg zzgsgVar, zzgsj zzgsjVar) {
        zzgsjVar.getClass();
        zzgsgVar.zze = zzgsjVar;
        zzgsgVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgse zzgseVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsg();
            case NEW_BUILDER:
                return new zzgsf(zzgseVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgsg.class) {
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

    public final zzgsj zzf() {
        zzgsj zzgsjVar = this.zze;
        return zzgsjVar == null ? zzgsj.zze() : zzgsjVar;
    }
}
