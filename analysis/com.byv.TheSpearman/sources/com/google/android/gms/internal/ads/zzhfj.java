package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhfj extends zzgzv implements zzhbm {
    private static final zzhfj zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private byte zzf = 2;
    private zzgyj zzd = zzgyj.zzb;
    private zzgyj zze = zzgyj.zzb;

    static {
        zzhfj zzhfjVar = new zzhfj();
        zza = zzhfjVar;
        zzgzv.zzca(zzhfj.class, zzhfjVar);
    }

    private zzhfj() {
    }

    public static zzhfi zzc() {
        return (zzhfi) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhfj zzhfjVar, zzgyj zzgyjVar) {
        zzhfjVar.zzc |= 1;
        zzhfjVar.zzd = zzgyjVar;
    }

    static /* synthetic */ void zzg(zzhfj zzhfjVar, zzgyj zzgyjVar) {
        zzhfjVar.zzc |= 2;
        zzhfjVar.zze = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhdx zzhdxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhfj();
            case NEW_BUILDER:
                return new zzhfi(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhfj.class) {
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
