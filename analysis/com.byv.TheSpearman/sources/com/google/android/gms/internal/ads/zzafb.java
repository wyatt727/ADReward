package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafb implements zzaev {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafb(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzafb zzb(zzfo zzfoVar) {
        int iZzi = zzfoVar.zzi();
        zzfoVar.zzL(12);
        int iZzi2 = zzfoVar.zzi();
        int iZzi3 = zzfoVar.zzi();
        int iZzi4 = zzfoVar.zzi();
        zzfoVar.zzL(4);
        int iZzi5 = zzfoVar.zzi();
        int iZzi6 = zzfoVar.zzi();
        zzfoVar.zzL(8);
        return new zzafb(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return AviExtractor.FOURCC_strh;
    }
}
