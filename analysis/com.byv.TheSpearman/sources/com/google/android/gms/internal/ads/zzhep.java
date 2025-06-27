package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhep extends zzgzv implements zzhbm {
    private static final zzhae zza = new zzhdy();
    private static final zzhae zzb = new zzhdz();
    private static final zzhep zzc;
    private static volatile zzhbt zzd;
    private boolean zzA;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzo;
    private int zzp;
    private int zzu;
    private boolean zzv;
    private boolean zzx;
    private long zzy;
    private String zzh = "";
    private zzhah zzi = zzgzv.zzbK();
    private String zzn = "";
    private zzhah zzw = zzbK();
    private zzhad zzz = zzbG();
    private zzhad zzB = zzbG();

    static {
        zzhep zzhepVar = new zzhep();
        zzc = zzhepVar;
        zzgzv.zzca(zzhep.class, zzhepVar);
    }

    private zzhep() {
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
                return zzbR(zzc, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zze", "zzf", zzhen.zza, "zzg", "zzh", "zzi", "zzj", zzheh.zza, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", zzhef.class, "zzx", "zzy", "zzz", zzhdr.zzb(), "zzA", "zzB", zzhek.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzhep();
            case NEW_BUILDER:
                return new zzhea(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                zzhbt zzgzqVar = zzd;
                if (zzgzqVar == null) {
                    synchronized (zzhep.class) {
                        zzgzqVar = zzd;
                        if (zzgzqVar == null) {
                            zzgzqVar = new zzgzq(zzc);
                            zzd = zzgzqVar;
                        }
                    }
                }
                return zzgzqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
