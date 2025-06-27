package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvn extends zzgzv implements zzhbm {
    private static final zzgvn zza;
    private static volatile zzhbt zzb;
    private String zzc = "";

    static {
        zzgvn zzgvnVar = new zzgvn();
        zza = zzgvnVar;
        zzgzv.zzca(zzgvn.class, zzgvnVar);
    }

    private zzgvn() {
    }

    public static zzgvm zza() {
        return (zzgvm) zza.zzaZ();
    }

    public static zzgvn zzd() {
        return zza;
    }

    public static zzgvn zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvn) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzg(zzgvn zzgvnVar, String str) {
        str.getClass();
        zzgvnVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvl zzgvlVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvn();
            case NEW_BUILDER:
                return new zzgvm(zzgvlVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvn.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
