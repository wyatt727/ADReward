package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzazk extends zzgzv implements zzhbm {
    private static final zzazk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzazn zzd;
    private zzgyj zze = zzgyj.zzb;
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzazk zzazkVar = new zzazk();
        zza = zzazkVar;
        zzgzv.zzca(zzazk.class, zzazkVar);
    }

    private zzazk() {
    }

    public static zzazk zzc(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzazk) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public final zzazn zzd() {
        zzazn zzaznVar = this.zzd;
        return zzaznVar == null ? zzazn.zzg() : zzaznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzazi zzaziVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzazk();
            case NEW_BUILDER:
                return new zzazj(zzaziVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzazk.class) {
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

    public final zzgyj zze() {
        return this.zzf;
    }

    public final zzgyj zzf() {
        return this.zze;
    }
}
