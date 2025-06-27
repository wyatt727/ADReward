package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsm extends zzgzv implements zzhbm {
    private static final zzgsm zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgss zze;
    private zzgue zzf;

    static {
        zzgsm zzgsmVar = new zzgsm();
        zza = zzgsmVar;
        zzgzv.zzca(zzgsm.class, zzgsmVar);
    }

    private zzgsm() {
    }

    public static zzgsl zzc() {
        return (zzgsl) zza.zzaZ();
    }

    public static zzgsm zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsm) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzh() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzi(zzgsm zzgsmVar, zzgss zzgssVar) {
        zzgssVar.getClass();
        zzgsmVar.zze = zzgssVar;
        zzgsmVar.zzc |= 1;
    }

    static /* synthetic */ void zzj(zzgsm zzgsmVar, zzgue zzgueVar) {
        zzgueVar.getClass();
        zzgsmVar.zzf = zzgueVar;
        zzgsmVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgsk zzgskVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsm();
            case NEW_BUILDER:
                return new zzgsl(zzgskVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgsm.class) {
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

    public final zzgss zzf() {
        zzgss zzgssVar = this.zze;
        return zzgssVar == null ? zzgss.zze() : zzgssVar;
    }

    public final zzgue zzg() {
        zzgue zzgueVar = this.zzf;
        return zzgueVar == null ? zzgue.zze() : zzgueVar;
    }
}
