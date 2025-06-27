package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajf implements zzajd {
    private final int zza;
    private final int zzb;
    private final zzfo zzc;

    public zzajf(zzaiz zzaizVar, zzam zzamVar) {
        zzfo zzfoVar = zzaizVar.zza;
        this.zzc = zzfoVar;
        zzfoVar.zzK(12);
        int iZzp = zzfoVar.zzp();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int iZzm = zzfx.zzm(zzamVar.zzB, zzamVar.zzz);
            if (iZzp == 0 || iZzp % iZzm != 0) {
                zzfe.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzm + ", stsz sample size: " + iZzp);
                iZzp = iZzm;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzfoVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
