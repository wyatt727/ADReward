package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafa implements zzaev {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzafa(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzafa zzb(zzfo zzfoVar) {
        int iZzi = zzfoVar.zzi();
        zzfoVar.zzL(8);
        int iZzi2 = zzfoVar.zzi();
        int iZzi3 = zzfoVar.zzi();
        zzfoVar.zzL(4);
        int iZzi4 = zzfoVar.zzi();
        zzfoVar.zzL(12);
        return new zzafa(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return AviExtractor.FOURCC_avih;
    }
}
