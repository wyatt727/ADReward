package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzwq implements zzzi {
    public long zza;
    public long zzb;
    public zzzh zzc;
    public zzwq zzd;

    public zzwq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzwq zzb() {
        this.zzc = null;
        zzwq zzwqVar = this.zzd;
        this.zzd = null;
        return zzwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final zzzh zzc() {
        zzzh zzzhVar = this.zzc;
        Objects.requireNonNull(zzzhVar);
        return zzzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final zzzi zzd() {
        zzwq zzwqVar = this.zzd;
        if (zzwqVar == null || zzwqVar.zzc == null) {
            return null;
        }
        return zzwqVar;
    }

    public final void zze(long j, int i) {
        zzek.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
