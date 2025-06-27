package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvb extends zzgzv implements zzhbm {
    private static final zzgvb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgup zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgvb zzgvbVar = new zzgvb();
        zza = zzgvbVar;
        zzgzv.zzca(zzgvb.class, zzgvbVar);
    }

    private zzgvb() {
    }

    public static zzgva zze() {
        return (zzgva) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzgvb zzgvbVar, zzgup zzgupVar) {
        zzgupVar.getClass();
        zzgvbVar.zzd = zzgupVar;
        zzgvbVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgup zzc() {
        zzgup zzgupVar = this.zzd;
        return zzgupVar == null ? zzgup.zze() : zzgupVar;
    }

    public final zzgur zzd() {
        zzgur zzgurVarZzb = zzgur.zzb(this.zze);
        return zzgurVarZzb == null ? zzgur.UNRECOGNIZED : zzgurVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzguy zzguyVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvb();
            case NEW_BUILDER:
                return new zzgva(zzguyVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvb.class) {
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
        zzgvv zzgvvVarZzb = zzgvv.zzb(this.zzg);
        return zzgvvVarZzb == null ? zzgvv.UNRECOGNIZED : zzgvvVarZzb;
    }

    public final boolean zzl() {
        return (this.zzc & 1) != 0;
    }
}
