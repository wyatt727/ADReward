package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzazn extends zzgzv implements zzhbm {
    private static final zzazn zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzazn zzaznVar = new zzazn();
        zza = zzaznVar;
        zzgzv.zzca(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    public static zzazm zze() {
        return (zzazm) zza.zzaZ();
    }

    public static zzazn zzg() {
        return zza;
    }

    public static zzazn zzh(zzgyj zzgyjVar) throws zzhak {
        return (zzazn) zzgzv.zzbm(zza, zzgyjVar);
    }

    public static zzazn zzi(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzazn) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    static /* synthetic */ void zzl(zzazn zzaznVar, String str) {
        str.getClass();
        zzaznVar.zzc |= 1;
        zzaznVar.zzd = str;
    }

    static /* synthetic */ void zzm(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 16;
        zzaznVar.zzh = j;
    }

    static /* synthetic */ void zzn(zzazn zzaznVar, String str) {
        str.getClass();
        zzaznVar.zzc |= 2;
        zzaznVar.zze = str;
    }

    static /* synthetic */ void zzo(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 4;
        zzaznVar.zzf = j;
    }

    static /* synthetic */ void zzp(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 8;
        zzaznVar.zzg = j;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzazl zzazlVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzazn();
            case NEW_BUILDER:
                return new zzazm(zzazlVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzazn.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
