package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvq extends zzgzv implements zzhbm {
    private static final zzgvq zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgvt zze;

    static {
        zzgvq zzgvqVar = new zzgvq();
        zza = zzgvqVar;
        zzgzv.zzca(zzgvq.class, zzgvqVar);
    }

    private zzgvq() {
    }

    public static zzgvp zzc() {
        return (zzgvp) zza.zzaZ();
    }

    public static zzgvq zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvq) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzh(zzgvq zzgvqVar, zzgvt zzgvtVar) {
        zzgvtVar.getClass();
        zzgvqVar.zze = zzgvtVar;
        zzgvqVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgvo zzgvoVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvq();
            case NEW_BUILDER:
                return new zzgvp(zzgvoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvq.class) {
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

    public final zzgvt zzf() {
        zzgvt zzgvtVar = this.zze;
        return zzgvtVar == null ? zzgvt.zze() : zzgvtVar;
    }
}
