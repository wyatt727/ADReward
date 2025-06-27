package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgte extends zzgzv implements zzhbm {
    private static final zzgte zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgth zzd;
    private int zze;

    static {
        zzgte zzgteVar = new zzgte();
        zza = zzgteVar;
        zzgzv.zzca(zzgte.class, zzgteVar);
    }

    private zzgte() {
    }

    public static zzgtd zzc() {
        return (zzgtd) zza.zzaZ();
    }

    public static zzgte zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgte) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzg(zzgte zzgteVar, zzgth zzgthVar) {
        zzgthVar.getClass();
        zzgteVar.zzd = zzgthVar;
        zzgteVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgtc zzgtcVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgte();
            case NEW_BUILDER:
                return new zzgtd(zzgtcVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgte.class) {
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
        zzgth zzgthVar = this.zzd;
        return zzgthVar == null ? zzgth.zze() : zzgthVar;
    }
}
