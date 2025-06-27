package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsp extends zzgzv implements zzhbm {
    private static final zzgsp zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgsv zzd;
    private zzguh zze;

    static {
        zzgsp zzgspVar = new zzgsp();
        zza = zzgspVar;
        zzgzv.zzca(zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static zzgso zza() {
        return (zzgso) zza.zzaZ();
    }

    public static zzgsp zzd(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsp) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzg(zzgsp zzgspVar, zzgsv zzgsvVar) {
        zzgsvVar.getClass();
        zzgspVar.zzd = zzgsvVar;
        zzgspVar.zzc |= 1;
    }

    static /* synthetic */ void zzh(zzgsp zzgspVar, zzguh zzguhVar) {
        zzguhVar.getClass();
        zzgspVar.zze = zzguhVar;
        zzgspVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgsn zzgsnVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsp();
            case NEW_BUILDER:
                return new zzgso(zzgsnVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgsp.class) {
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

    public final zzgsv zze() {
        zzgsv zzgsvVar = this.zzd;
        return zzgsvVar == null ? zzgsv.zze() : zzgsvVar;
    }

    public final zzguh zzf() {
        zzguh zzguhVar = this.zze;
        return zzguhVar == null ? zzguh.zzf() : zzguhVar;
    }
}
