package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvt extends zzgzv implements zzhbm {
    private static final zzgvt zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private String zzd = "";
    private zzguu zze;

    static {
        zzgvt zzgvtVar = new zzgvt();
        zza = zzgvtVar;
        zzgzv.zzca(zzgvt.class, zzgvtVar);
    }

    private zzgvt() {
    }

    public static zzgvs zzc() {
        return (zzgvs) zza.zzaZ();
    }

    public static zzgvt zze() {
        return zza;
    }

    public static zzgvt zzf(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvt) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzh(zzgvt zzgvtVar, String str) {
        str.getClass();
        zzgvtVar.zzd = str;
    }

    static /* synthetic */ void zzi(zzgvt zzgvtVar, zzguu zzguuVar) {
        zzguuVar.getClass();
        zzgvtVar.zze = zzguuVar;
        zzgvtVar.zzc |= 1;
    }

    public final zzguu zza() {
        zzguu zzguuVar = this.zze;
        return zzguuVar == null ? zzguu.zze() : zzguuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvr zzgvrVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvt();
            case NEW_BUILDER:
                return new zzgvs(zzgvrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvt.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
