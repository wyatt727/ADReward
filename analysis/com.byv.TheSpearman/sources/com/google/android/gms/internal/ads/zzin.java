package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzin implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzip zza;
    private final Handler zzb;

    public zzin(zzip zzipVar, Handler handler) {
        this.zza = zzipVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzim
            @Override // java.lang.Runnable
            public final void run() {
                zzip.zzc(this.zza.zza, i);
            }
        });
    }
}
