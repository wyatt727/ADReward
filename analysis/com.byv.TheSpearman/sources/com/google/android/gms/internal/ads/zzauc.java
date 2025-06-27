package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzauc extends zzgzv implements zzhbm {
    private static final zzauc zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzauc zzaucVar = new zzauc();
        zza = zzaucVar;
        zzgzv.zzca(zzauc.class, zzaucVar);
    }

    private zzauc() {
    }

    public static zzaub zza() {
        return (zzaub) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzauc zzaucVar, long j) {
        zzaucVar.zzc |= 1;
        zzaucVar.zzd = j;
    }

    static /* synthetic */ void zze(zzauc zzaucVar, long j) {
        zzaucVar.zzc |= 4;
        zzaucVar.zzf = j;
    }

    static /* synthetic */ void zzf(zzauc zzaucVar, long j) {
        zzaucVar.zzc |= 8;
        zzaucVar.zzg = j;
    }

    static /* synthetic */ void zzg(zzauc zzaucVar, long j) {
        zzaucVar.zzc |= 16;
        zzaucVar.zzh = j;
    }

    static /* synthetic */ void zzh(zzauc zzaucVar, long j) {
        zzaucVar.zzc |= 32;
        zzaucVar.zzi = j;
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
                return zzbR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case NEW_MUTABLE_INSTANCE:
                return new zzauc();
            case NEW_BUILDER:
                return new zzaub(zzaszVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzauc.class) {
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
