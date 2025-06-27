package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvk extends zzgzv implements zzhbm {
    private static final zzgvk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgvn zze;

    static {
        zzgvk zzgvkVar = new zzgvk();
        zza = zzgvkVar;
        zzgzv.zzca(zzgvk.class, zzgvkVar);
    }

    private zzgvk() {
    }

    public static zzgvj zzc() {
        return (zzgvj) zza.zzaZ();
    }

    public static zzgvk zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvk) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzh(zzgvk zzgvkVar, zzgvn zzgvnVar) {
        zzgvnVar.getClass();
        zzgvkVar.zze = zzgvnVar;
        zzgvkVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvi zzgviVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvk();
            case NEW_BUILDER:
                return new zzgvj(zzgviVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvk.class) {
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

    public final zzgvn zzf() {
        zzgvn zzgvnVar = this.zze;
        return zzgvnVar == null ? zzgvn.zzd() : zzgvnVar;
    }
}
