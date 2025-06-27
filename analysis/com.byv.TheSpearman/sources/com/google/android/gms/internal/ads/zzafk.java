package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafk extends zzacp {
    public zzafk(final zzads zzadsVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzadsVar);
        zzacm zzacmVar = new zzacm() { // from class: com.google.android.gms.internal.ads.zzafh
            @Override // com.google.android.gms.internal.ads.zzacm
            public final long zza(long j4) {
                return zzadsVar.zzb(j4);
            }
        };
        zzafj zzafjVar = new zzafj(zzadsVar, i, null);
        long jZza = zzadsVar.zza();
        long j4 = zzadsVar.zzj;
        int i2 = zzadsVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzadsVar.zzc) / 2) + 1;
        } else {
            int i3 = zzadsVar.zza;
            int i4 = zzadsVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzadsVar.zzg) * zzadsVar.zzh) / 8) + 64;
        }
        super(zzacmVar, zzafjVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzadsVar.zzc));
    }
}
