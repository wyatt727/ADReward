package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzguu extends zzgzv implements zzhbm {
    private static final zzguu zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzgyj zzd = zzgyj.zzb;
    private int zze;

    static {
        zzguu zzguuVar = new zzguu();
        zza = zzguuVar;
        zzgzv.zzca(zzguu.class, zzguuVar);
    }

    private zzguu() {
    }

    public static zzgut zza() {
        return (zzgut) zza.zzaZ();
    }

    public static zzgut zzc(zzguu zzguuVar) {
        return (zzgut) zza.zzba(zzguuVar);
    }

    public static zzguu zze() {
        return zza;
    }

    public static zzguu zzf(byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        return (zzguu) zzgzv.zzbx(zza, bArr, zzgzfVar);
    }

    static /* synthetic */ void zzj(zzguu zzguuVar, String str) {
        str.getClass();
        zzguuVar.zzc = str;
    }

    static /* synthetic */ void zzk(zzguu zzguuVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzguuVar.zzd = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgus zzgusVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguu();
            case NEW_BUILDER:
                return new zzgut(zzgusVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzguu.class) {
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

    public final zzgvv zzg() {
        zzgvv zzgvvVarZzb = zzgvv.zzb(this.zze);
        return zzgvvVarZzb == null ? zzgvv.UNRECOGNIZED : zzgvvVarZzb;
    }

    public final zzgyj zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
