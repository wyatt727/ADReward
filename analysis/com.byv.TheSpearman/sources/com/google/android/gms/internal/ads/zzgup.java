package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgup extends zzgzv implements zzhbm {
    private static final zzgup zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzgyj zzd = zzgyj.zzb;
    private int zze;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzgzv.zzca(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzgum zza() {
        return (zzgum) zza.zzaZ();
    }

    public static zzgup zze() {
        return zza;
    }

    static /* synthetic */ void zzh(zzgup zzgupVar, String str) {
        str.getClass();
        zzgupVar.zzc = str;
    }

    static /* synthetic */ void zzi(zzgup zzgupVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzgupVar.zzd = zzgyjVar;
    }

    public final zzguo zzc() {
        zzguo zzguoVarZzb = zzguo.zzb(this.zze);
        return zzguoVarZzb == null ? zzguo.UNRECOGNIZED : zzguoVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgul zzgulVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgup();
            case NEW_BUILDER:
                return new zzgum(zzgulVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgup.class) {
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

    public final zzgyj zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
