package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccj implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzccr zzb;

    zzccj(zzccr zzccrVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzccr.zzl(this.zzb, this.zza);
        zzccr zzccrVar = this.zzb;
        if (zzccrVar.zzq != null) {
            zzccrVar.zzq.zzf();
        }
    }
}
