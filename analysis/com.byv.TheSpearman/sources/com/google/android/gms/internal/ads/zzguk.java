package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzguk extends zzgzv implements zzhbm {
    private static final zzguk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;

    static {
        zzguk zzgukVar = new zzguk();
        zza = zzgukVar;
        zzgzv.zzca(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzguj zzd() {
        return (zzguj) zza.zzaZ();
    }

    public static zzguk zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgub zzc() {
        zzgub zzgubVarZzb = zzgub.zzb(this.zzc);
        return zzgubVarZzb == null ? zzgub.UNRECOGNIZED : zzgubVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzgui zzguiVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguk();
            case NEW_BUILDER:
                return new zzguj(zzguiVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzguk.class) {
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
}
