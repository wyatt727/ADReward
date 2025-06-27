package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpe {
    public static zzph zza(AudioManager audioManager, zzk zzkVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzkVar.zza().zza);
        HashMap map = new HashMap();
        map.put(2, new HashSet(zzgcl.zzf(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (zzfx.zzK(format) || zzph.zzb.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        Objects.requireNonNull(set);
                        set.addAll(zzgcl.zzf(audioProfile.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(zzgcl.zzf(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        zzfzk zzfzkVar = new zzfzk();
        for (Map.Entry entry : map.entrySet()) {
            zzfzkVar.zzf(new zzpf(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzph(zzfzkVar.zzi());
    }

    public static zzpp zzb(AudioManager audioManager, zzk zzkVar) {
        Objects.requireNonNull(audioManager);
        try {
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzkVar.zza().zza);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new zzpp(audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
