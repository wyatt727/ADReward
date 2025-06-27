package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaki implements zzakp {
    private final zzako zza;
    private final long zzb;
    private final long zzc;
    private final zzaku zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaki(zzaku zzakuVar, long j, long j2, long j3, long j4, boolean z) {
        zzek.zzd(j >= 0 && j2 > j);
        this.zzd = zzakuVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzako();
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final /* bridge */ /* synthetic */ zzaef zze() {
        zzakg zzakgVar = null;
        if (this.zzf != 0) {
            return new zzakh(this, zzakgVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzakp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadg r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaki.zzd(com.google.android.gms.internal.ads.zzadg):long");
    }
}
