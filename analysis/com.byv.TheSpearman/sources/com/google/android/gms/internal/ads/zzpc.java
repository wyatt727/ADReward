package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpc {
    private static zzfzs<Integer> zzb() {
        zzfzr zzfzrVar = new zzfzr();
        zzfzrVar.zzg(8, 7);
        if (zzfx.zza >= 31) {
            zzfzrVar.zzg(26, 27);
        }
        if (zzfx.zza >= 33) {
            zzfzrVar.zzf((Object) 30);
        }
        return zzfzrVar.zzi();
    }

    public static boolean zza(AudioManager audioManager, zzpp zzppVar) {
        AudioDeviceInfo[] devices;
        if (zzppVar == null) {
            Objects.requireNonNull(audioManager);
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{zzppVar.zza};
        }
        zzfzs<Integer> zzfzsVarZzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzfzsVarZzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
