package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzqu {
    public static zzps zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzps.zza;
        }
        zzpq zzpqVar = new zzpq();
        boolean z2 = false;
        if (zzfx.zza > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        zzpqVar.zza(true);
        zzpqVar.zzb(z2);
        zzpqVar.zzc(z);
        return zzpqVar.zzd();
    }
}
