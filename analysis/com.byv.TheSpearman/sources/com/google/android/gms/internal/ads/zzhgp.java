package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhgp extends zzgzv implements zzhbm {
    private static final zzhgp zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgyj zzf = zzgyj.zzb;
    private zzgyj zzg = zzgyj.zzb;

    static {
        zzhgp zzhgpVar = new zzhgp();
        zza = zzhgpVar;
        zzgzv.zzca(zzhgp.class, zzhgpVar);
    }

    private zzhgp() {
    }

    public static zzhgl zzc() {
        return (zzhgl) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhgp zzhgpVar, zzhgo zzhgoVar) {
        zzhgpVar.zzd = zzhgoVar.zza();
        zzhgpVar.zzc |= 1;
    }

    static /* synthetic */ void zzg(zzhgp zzhgpVar, String str) {
        zzhgpVar.zzc |= 2;
        zzhgpVar.zze = MimeTypes.IMAGE_PNG;
    }

    static /* synthetic */ void zzh(zzhgp zzhgpVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzhgpVar.zzc |= 4;
        zzhgpVar.zzf = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhdx zzhdxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhgn.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgp();
            case NEW_BUILDER:
                return new zzhgl(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhgp.class) {
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
