package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtb extends zzgzv implements zzhbm {
    private static final zzgtb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgth zze;
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzgtb zzgtbVar = new zzgtb();
        zza = zzgtbVar;
        zzgzv.zzca(zzgtb.class, zzgtbVar);
    }

    private zzgtb() {
    }

    public static zzgta zzc() {
        return (zzgta) zza.zzaZ();
    }

    public static zzgtb zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtb) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzh() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzi(zzgtb zzgtbVar, zzgth zzgthVar) {
        zzgthVar.getClass();
        zzgtbVar.zze = zzgthVar;
        zzgtbVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgsz zzgszVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtb();
            case NEW_BUILDER:
                return new zzgta(zzgszVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgtb.class) {
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

    public final zzgth zzf() {
        zzgth zzgthVar = this.zze;
        return zzgthVar == null ? zzgth.zze() : zzgthVar;
    }

    public final zzgyj zzg() {
        return this.zzf;
    }
}
