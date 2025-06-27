package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzafu implements zzadf {
    private final zzfo zza = new zzfo(4);
    private final zzaeh zzb = new zzaeh(-1, -1, MimeTypes.IMAGE_HEIF);

    private final boolean zza(zzadg zzadgVar, int i) throws IOException {
        this.zza.zzH(4);
        ((zzact) zzadgVar).zzm(this.zza.zzM(), 0, 4, false);
        return this.zza.zzu() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        return this.zzb.zzb(zzadgVar, zzaecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzb.zzd(zzadiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        ((zzact) zzadgVar).zzl(4, false);
        return zza(zzadgVar, Atom.TYPE_ftyp) && zza(zzadgVar, Sniffer.BRAND_HEIC);
    }
}
