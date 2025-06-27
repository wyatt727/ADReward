package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhgx extends zzgzv implements zzhbm {
    private static final zzhgx zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzhfn zzf;
    private zzhfr zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzhad zzi = zzbG();
    private String zzj = "";
    private zzhah zzl = zzgzv.zzbK();

    static {
        zzhgx zzhgxVar = new zzhgx();
        zza = zzhgxVar;
        zzgzv.zzca(zzhgx.class, zzhgxVar);
    }

    private zzhgx() {
    }

    public static zzhgw zze() {
        return (zzhgw) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzhgx zzhgxVar, int i) {
        zzhgxVar.zzc |= 1;
        zzhgxVar.zzd = i;
    }

    static /* synthetic */ void zzi(zzhgx zzhgxVar, String str) {
        str.getClass();
        zzhgxVar.zzc |= 2;
        zzhgxVar.zze = str;
    }

    static /* synthetic */ void zzj(zzhgx zzhgxVar, zzhfn zzhfnVar) {
        zzhfnVar.getClass();
        zzhgxVar.zzf = zzhfnVar;
        zzhgxVar.zzc |= 4;
    }

    static /* synthetic */ void zzk(zzhgx zzhgxVar, zzhgv zzhgvVar) {
        zzhgxVar.zzk = zzhgvVar.zza();
        zzhgxVar.zzc |= 64;
    }

    static /* synthetic */ void zzl(zzhgx zzhgxVar, String str) {
        str.getClass();
        zzhah zzhahVar = zzhgxVar.zzl;
        if (!zzhahVar.zzc()) {
            zzhgxVar.zzl = zzgzv.zzbL(zzhahVar);
        }
        zzhgxVar.zzl.add(str);
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhdx zzhdxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhgu.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgx();
            case NEW_BUILDER:
                return new zzhgw(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhgx.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
