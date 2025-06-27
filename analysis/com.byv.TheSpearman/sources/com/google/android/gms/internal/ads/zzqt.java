package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzqt {
    public static zzps zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzps.zza;
        }
        zzpq zzpqVar = new zzpq();
        zzpqVar.zza(true);
        zzpqVar.zzc(z);
        return zzpqVar.zzd();
    }
}
