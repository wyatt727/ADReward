package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaud extends zzgzv implements zzhbm {
    private static final zzaud zza;
    private static volatile zzhbt zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private zzauf zzP;
    private zzaty zzaF;
    private long zzaL;
    private zzatn zzaO;
    private zzatp zzaP;
    private int zzaS;
    private long zzaT;
    private boolean zzaW;
    private long zzaY;
    private zzaus zzaZ;
    private zzaua zzah;
    private zzauc zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzauu zzax;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = "";
    private String zzg = "";
    private String zzv = "";
    private String zzF = "";
    private String zzG = "D";
    private String zzH = "";
    private String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;
    private zzhah zzai = zzbK();
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private String zzas = "D";
    private long zzat = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private zzhah zzaC = zzbK();
    private int zzaD = 1000;
    private zzhah zzaE = zzbK();
    private String zzaG = "";
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaM = -1;
    private String zzaN = "";
    private long zzaQ = -1;
    private long zzaR = -1;
    private String zzaU = "";
    private int zzaV = 2;
    private String zzaX = "";
    private long zzba = -1;
    private String zzbb = "";

    static {
        zzaud zzaudVar = new zzaud();
        zza = zzaudVar;
        zzgzv.zzca(zzaud.class, zzaudVar);
    }

    private zzaud() {
    }

    static /* synthetic */ void zzA(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 67108864;
        zzaudVar.zzJ = j;
    }

    static /* synthetic */ void zzB(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= C.BUFFER_FLAG_FIRST_SAMPLE;
        zzaudVar.zzK = j;
    }

    static /* synthetic */ void zzC(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzc |= 268435456;
        zzaudVar.zzL = str;
    }

    static /* synthetic */ void zzD(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 536870912;
        zzaudVar.zzM = j;
    }

    static /* synthetic */ void zzE(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 1073741824;
        zzaudVar.zzN = j;
    }

    static /* synthetic */ void zzF(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= Integer.MIN_VALUE;
        zzaudVar.zzO = j;
    }

    static /* synthetic */ void zzG(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 2;
        zzaudVar.zzQ = j;
    }

    static /* synthetic */ void zzH(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 4;
        zzaudVar.zzR = j;
    }

    static /* synthetic */ void zzI(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 8;
        zzaudVar.zzS = j;
    }

    static /* synthetic */ void zzJ(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 16;
        zzaudVar.zzT = j;
    }

    static /* synthetic */ void zzK(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 32;
        zzaudVar.zzU = j;
    }

    static /* synthetic */ void zzL(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 64;
        zzaudVar.zzV = j;
    }

    static /* synthetic */ void zzM(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzd |= 128;
        zzaudVar.zzW = str;
    }

    static /* synthetic */ void zzN(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzd |= 256;
        zzaudVar.zzX = str;
    }

    static /* synthetic */ void zzO(zzaud zzaudVar, zzaun zzaunVar) {
        zzaudVar.zzZ = zzaunVar.zza();
        zzaudVar.zzd |= 1024;
    }

    static /* synthetic */ void zzP(zzaud zzaudVar, zzaun zzaunVar) {
        zzaudVar.zzaa = zzaunVar.zza();
        zzaudVar.zzd |= 2048;
    }

    static /* synthetic */ void zzQ(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 4096;
        zzaudVar.zzab = j;
    }

    static /* synthetic */ void zzR(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 8192;
        zzaudVar.zzac = j;
    }

    static /* synthetic */ void zzS(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 16384;
        zzaudVar.zzad = j;
    }

    static /* synthetic */ void zzT(zzaud zzaudVar, zzaun zzaunVar) {
        zzaudVar.zzag = zzaunVar.zza();
        zzaudVar.zzd |= 131072;
    }

    static /* synthetic */ void zzU(zzaud zzaudVar, zzaua zzauaVar) {
        zzauaVar.getClass();
        zzaudVar.zzah = zzauaVar;
        zzaudVar.zzd |= 262144;
    }

    static /* synthetic */ void zzV(zzaud zzaudVar, zzaua zzauaVar) {
        zzauaVar.getClass();
        zzhah zzhahVar = zzaudVar.zzai;
        if (!zzhahVar.zzc()) {
            zzaudVar.zzai = zzgzv.zzbL(zzhahVar);
        }
        zzaudVar.zzai.add(zzauaVar);
    }

    static /* synthetic */ void zzX(zzaud zzaudVar, zzauc zzaucVar) {
        zzaucVar.getClass();
        zzaudVar.zzaj = zzaucVar;
        zzaudVar.zzd |= 524288;
    }

    static /* synthetic */ void zzY(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 2097152;
        zzaudVar.zzal = j;
    }

    static /* synthetic */ void zzZ(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 4194304;
        zzaudVar.zzam = j;
    }

    public static zzata zza() {
        return (zzata) zza.zzaZ();
    }

    static /* synthetic */ void zzaa(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 8388608;
        zzaudVar.zzan = j;
    }

    static /* synthetic */ void zzab(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= 67108864;
        zzaudVar.zzaq = j;
    }

    static /* synthetic */ void zzac(zzaud zzaudVar, long j) {
        zzaudVar.zzd |= C.BUFFER_FLAG_FIRST_SAMPLE;
        zzaudVar.zzar = j;
    }

    static /* synthetic */ void zzad(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzd |= 268435456;
        zzaudVar.zzas = str;
    }

    static /* synthetic */ void zzae(zzaud zzaudVar, zzaun zzaunVar) {
        zzaudVar.zzaz = zzaunVar.zza();
        zzaudVar.zze |= 8;
    }

    static /* synthetic */ void zzaf(zzaud zzaudVar, zzaun zzaunVar) {
        zzaudVar.zzaA = zzaunVar.zza();
        zzaudVar.zze |= 16;
    }

    static /* synthetic */ void zzag(zzaud zzaudVar, long j) {
        zzaudVar.zze |= 512;
        zzaudVar.zzaH = j;
    }

    static /* synthetic */ void zzah(zzaud zzaudVar, long j) {
        zzaudVar.zze |= 1024;
        zzaudVar.zzaI = j;
    }

    static /* synthetic */ void zzai(zzaud zzaudVar, long j) {
        zzaudVar.zze |= 2048;
        zzaudVar.zzaJ = j;
    }

    static /* synthetic */ void zzaj(zzaud zzaudVar, long j) {
        zzaudVar.zze |= 4096;
        zzaudVar.zzaK = j;
    }

    static /* synthetic */ void zzak(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zze |= 32768;
        zzaudVar.zzaN = str;
    }

    static /* synthetic */ void zzal(zzaud zzaudVar, zzats zzatsVar) {
        zzaudVar.zzaS = zzatsVar.zza();
        zzaudVar.zze |= 1048576;
    }

    static /* synthetic */ void zzam(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zze |= 4194304;
        zzaudVar.zzaU = str;
    }

    static /* synthetic */ void zzan(zzaud zzaudVar, zzati zzatiVar) {
        zzaudVar.zzaV = zzatiVar.zza();
        zzaudVar.zze |= 8388608;
    }

    static /* synthetic */ void zzao(zzaud zzaudVar, boolean z) {
        zzaudVar.zze |= 16777216;
        zzaudVar.zzaW = z;
    }

    static /* synthetic */ void zzap(zzaud zzaudVar, long j) {
        zzaudVar.zze |= 67108864;
        zzaudVar.zzaY = j;
    }

    public static zzaud zze() {
        return zza;
    }

    public static zzaud zzf(byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        return (zzaud) zzgzv.zzbx(zza, bArr, zzgzfVar);
    }

    static /* synthetic */ void zzj(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzc |= 1;
        zzaudVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzc |= 2;
        zzaudVar.zzg = str;
    }

    static /* synthetic */ void zzl(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 4;
        zzaudVar.zzh = j;
    }

    static /* synthetic */ void zzm(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 16;
        zzaudVar.zzj = j;
    }

    static /* synthetic */ void zzn(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 32;
        zzaudVar.zzk = j;
    }

    static /* synthetic */ void zzo(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 1024;
        zzaudVar.zzp = j;
    }

    static /* synthetic */ void zzp(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 2048;
        zzaudVar.zzu = j;
    }

    static /* synthetic */ void zzq(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 8192;
        zzaudVar.zzw = j;
    }

    static /* synthetic */ void zzr(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 16384;
        zzaudVar.zzx = j;
    }

    static /* synthetic */ void zzs(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 32768;
        zzaudVar.zzy = j;
    }

    static /* synthetic */ void zzt(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 65536;
        zzaudVar.zzz = j;
    }

    static /* synthetic */ void zzu(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 524288;
        zzaudVar.zzC = j;
    }

    static /* synthetic */ void zzv(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 1048576;
        zzaudVar.zzD = j;
    }

    static /* synthetic */ void zzw(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 2097152;
        zzaudVar.zzE = j;
    }

    static /* synthetic */ void zzx(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzc |= 4194304;
        zzaudVar.zzF = str;
    }

    static /* synthetic */ void zzy(zzaud zzaudVar, String str) {
        str.getClass();
        zzaudVar.zzc |= 16777216;
        zzaudVar.zzH = str;
    }

    static /* synthetic */ void zzz(zzaud zzaudVar, long j) {
        zzaudVar.zzc |= 33554432;
        zzaudVar.zzI = j;
    }

    public final boolean zzaq() {
        return this.zzaW;
    }

    public final boolean zzar() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzas() {
        return (this.zze & C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final zzati zzc() {
        zzati zzatiVarZzb = zzati.zzb(this.zzaV);
        return zzatiVarZzb == null ? zzati.DEVICE_IDENTIFIER_GLOBAL_ID : zzatiVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzasz zzaszVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhab zzhabVar = zzaum.zza;
                zzhab zzhabVar2 = zzaum.zza;
                return zzbR(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", zzath.zza, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", zzaua.class, "zzU", "zzV", "zzW", "zzX", "zzZ", zzaum.zza, "zzaa", zzhabVar, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", zzhabVar, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", zzauj.zza, "zzav", zzaup.zza, "zzas", "zzaw", zzatc.zza, "zzax", "zzay", "zzao", "zzap", "zzaz", zzhabVar2, "zzY", "zzG", "zzaA", zzhabVar2, "zzaB", "zzaC", zzatw.class, "zzaD", zzhabVar2, "zzaE", zzatf.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", zzatr.zza, "zzaZ", "zzba", "zzbb"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaud();
            case NEW_BUILDER:
                return new zzata(zzaszVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzaud.class) {
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

    public final zzaus zzg() {
        zzaus zzausVar = this.zzaZ;
        return zzausVar == null ? zzaus.zzd() : zzausVar;
    }

    public final String zzh() {
        return this.zzaU;
    }

    public final String zzi() {
        return this.zzF;
    }
}
