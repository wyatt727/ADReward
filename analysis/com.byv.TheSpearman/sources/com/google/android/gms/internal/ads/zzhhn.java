package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhhn extends zzgzv implements zzhbm {
    private static final zzhhn zza;
    private static volatile zzhbt zzb;
    private zzhhh zzC;
    private zzhez zzE;
    private zzhep zzG;
    private zzhfy zzI;
    private int zzJ;
    private long zzM;
    private zzhhm zzN;
    private zzhgf zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhev zzi;
    private zzhgp zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhgz zzx;
    private boolean zzy;
    private byte zzP = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzhah zzj = zzbK();
    private zzhah zzk = zzbK();
    private String zzl = "";
    private zzhah zzo = zzgzv.zzbK();
    private String zzp = "";
    private zzgyj zzw = zzgyj.zzb;
    private String zzz = "";
    private zzhah zzA = zzgzv.zzbK();
    private zzhah zzB = zzgzv.zzbK();
    private zzhah zzD = zzbK();
    private String zzF = "";
    private zzhah zzH = zzbK();
    private zzhah zzK = zzbK();
    private zzhah zzL = zzbK();

    static {
        zzhhn zzhhnVar = new zzhhn();
        zza = zzhhnVar;
        zzgzv.zzca(zzhhn.class, zzhhnVar);
    }

    private zzhhn() {
    }

    public static zzhet zzc() {
        return (zzhet) zza.zzaZ();
    }

    static /* synthetic */ void zzi(zzhhn zzhhnVar, zzhgs zzhgsVar) {
        zzhhnVar.zzd = zzhgsVar.zza();
        zzhhnVar.zzc |= 1;
    }

    static /* synthetic */ void zzj(zzhhn zzhhnVar, String str) {
        str.getClass();
        zzhhnVar.zzc |= 4;
        zzhhnVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzhhn zzhhnVar, String str) {
        str.getClass();
        zzhhnVar.zzc |= 8;
        zzhhnVar.zzg = str;
    }

    static /* synthetic */ void zzl(zzhhn zzhhnVar, zzhev zzhevVar) {
        zzhevVar.getClass();
        zzhhnVar.zzi = zzhevVar;
        zzhhnVar.zzc |= 32;
    }

    static /* synthetic */ void zzm(zzhhn zzhhnVar, zzhgx zzhgxVar) {
        zzhgxVar.getClass();
        zzhah zzhahVar = zzhhnVar.zzj;
        if (!zzhahVar.zzc()) {
            zzhhnVar.zzj = zzgzv.zzbL(zzhahVar);
        }
        zzhhnVar.zzj.add(zzhgxVar);
    }

    static /* synthetic */ void zzn(zzhhn zzhhnVar, String str) {
        zzhhnVar.zzc |= 64;
        zzhhnVar.zzl = str;
    }

    static /* synthetic */ void zzo(zzhhn zzhhnVar) {
        zzhhnVar.zzc &= -65;
        zzhhnVar.zzl = zza.zzl;
    }

    static /* synthetic */ void zzp(zzhhn zzhhnVar, zzhgp zzhgpVar) {
        zzhgpVar.getClass();
        zzhhnVar.zzm = zzhgpVar;
        zzhhnVar.zzc |= 128;
    }

    static /* synthetic */ void zzq(zzhhn zzhhnVar, zzhgz zzhgzVar) {
        zzhgzVar.getClass();
        zzhhnVar.zzx = zzhgzVar;
        zzhhnVar.zzc |= 8192;
    }

    static /* synthetic */ void zzr(zzhhn zzhhnVar, Iterable iterable) {
        zzhah zzhahVar = zzhhnVar.zzA;
        if (!zzhahVar.zzc()) {
            zzhhnVar.zzA = zzgzv.zzbL(zzhahVar);
        }
        zzgxq.zzaQ(iterable, zzhhnVar.zzA);
    }

    static /* synthetic */ void zzs(zzhhn zzhhnVar, Iterable iterable) {
        zzhah zzhahVar = zzhhnVar.zzB;
        if (!zzhahVar.zzc()) {
            zzhhnVar.zzB = zzgzv.zzbL(zzhahVar);
        }
        zzgxq.zzaQ(iterable, zzhhnVar.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzhdx zzhdxVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzP);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzP = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhgx.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhgr.zza, "zze", zzher.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhhr.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhib.class, "zzE", "zzF", "zzG", "zzH", zzhfh.class, "zzI", "zzJ", zzhhe.zza, "zzK", zzhgd.class, "zzL", zzhgk.class, "zzM", "zzN", "zzO"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhn();
            case NEW_BUILDER:
                return new zzhet(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzhhn.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
