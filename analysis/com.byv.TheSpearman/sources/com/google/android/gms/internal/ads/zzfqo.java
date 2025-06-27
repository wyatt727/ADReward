package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqo extends zzgzv implements zzhbm {
    private static final zzhae zza = new zzfqj();
    private static final zzfqo zzb;
    private static volatile zzhbt zzc;
    private int zzd;
    private zzhad zze = zzbG();
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzfqo zzfqoVar = new zzfqo();
        zzb = zzfqoVar;
        zzgzv.zzca(zzfqo.class, zzfqoVar);
    }

    private zzfqo() {
    }

    public static zzfqn zza() {
        return (zzfqn) zzb.zzaZ();
    }

    static /* synthetic */ void zzd(zzfqo zzfqoVar, zzfqm zzfqmVar) {
        zzfqmVar.getClass();
        zzhad zzhadVar = zzfqoVar.zze;
        if (!zzhadVar.zzc()) {
            zzfqoVar.zze = zzgzv.zzbH(zzhadVar);
        }
        zzfqoVar.zze.zzi(zzfqmVar.zza());
    }

    static /* synthetic */ void zze(zzfqo zzfqoVar, String str) {
        str.getClass();
        zzfqoVar.zzd |= 1;
        zzfqoVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzfqj zzfqjVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzd", "zze", zzfql.zza, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfqo();
            case NEW_BUILDER:
                return new zzfqn(zzfqjVar);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhbt zzgzqVar = zzc;
                if (zzgzqVar == null) {
                    synchronized (zzfqo.class) {
                        zzgzqVar = zzc;
                        if (zzgzqVar == null) {
                            zzgzqVar = new zzgzq(zzb);
                            zzc = zzgzqVar;
                        }
                    }
                }
                return zzgzqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
