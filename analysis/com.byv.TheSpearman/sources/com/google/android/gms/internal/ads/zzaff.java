package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaff implements zzaev {
    public final String zza;

    private zzaff(String str) {
        this.zza = str;
    }

    public static zzaff zzb(zzfo zzfoVar) {
        return new zzaff(zzfoVar.zzA(zzfoVar.zzb(), zzfwd.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return AviExtractor.FOURCC_strn;
    }
}
