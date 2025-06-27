package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpi {
    public static void zza(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        Objects.requireNonNull(audioManager);
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    public static void zzb(Context context, AudioDeviceCallback audioDeviceCallback) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        Objects.requireNonNull(audioManager);
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
