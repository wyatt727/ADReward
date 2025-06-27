package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflx extends zzgzv implements zzhbm {
    private static final zzhae zza = new zzfll();
    private static final zzflx zzb;
    private static volatile zzhbt zzc;
    private int zzA;
    private int zzE;
    private int zzF;
    private long zzG;
    private int zzH;
    private int zzM;
    private long zzU;
    private int zzV;
    private int zzW;
    private zzfmm zzX;
    private zzfmf zzY;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzu;
    private String zzg = "";
    private zzhad zzk = zzbG();
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private zzhag zzD = zzbI();
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzR = "";
    private String zzS = "";
    private String zzT = "";

    static {
        zzflx zzflxVar = new zzflx();
        zzb = zzflxVar;
        zzgzv.zzca(zzflx.class, zzflxVar);
    }

    private zzflx() {
    }

    public static zzflm zza() {
        return (zzflm) zzb.zzaZ();
    }

    static /* synthetic */ void zzd(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzS = str;
    }

    static /* synthetic */ void zze(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzT = str;
    }

    static /* synthetic */ void zzk(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzv = str;
    }

    static /* synthetic */ void zzl(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzy = str;
    }

    static /* synthetic */ void zzm(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzz = str;
    }

    static /* synthetic */ void zzo(zzflx zzflxVar, Iterable iterable) {
        zzhag zzhagVar = zzflxVar.zzD;
        if (!zzhagVar.zzc()) {
            zzflxVar.zzD = zzgzv.zzbJ(zzhagVar);
        }
        zzgxq.zzaQ(iterable, zzflxVar.zzD);
    }

    static /* synthetic */ void zzt(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzI = str;
    }

    static /* synthetic */ void zzu(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzJ = str;
    }

    static /* synthetic */ void zzv(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzO = str;
    }

    static /* synthetic */ void zzx(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzQ = str;
    }

    static /* synthetic */ void zzy(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzR = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzfll zzfllVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zzb, "\u0000+\u0000\u0001\u0001++\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0000*ဉ\u0001+\u0004", new Object[]{"zzd", "zze", "zzl", "zzm", "zzu", "zzv", "zzy", "zzz", "zzA", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzw", "zzx", "zzB", "zzC", "zzD", "zzK", "zzL", "zzN", "zzU", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzV", "zzW", "zzf", "zzX", "zzY", "zzM"});
            case NEW_MUTABLE_INSTANCE:
                return new zzflx();
            case NEW_BUILDER:
                return new zzflm(zzfllVar);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhbt zzgzqVar = zzc;
                if (zzgzqVar == null) {
                    synchronized (zzflx.class) {
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
