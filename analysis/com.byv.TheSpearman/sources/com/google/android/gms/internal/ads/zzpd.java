package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.OpusUtil;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpd {
    public static int zza(int i, int i2, zzk zzkVar) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzh = zzfx.zzh(i3);
            if (iZzh != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iZzh).build(), zzkVar.zza().zza)) {
                return i3;
            }
        }
        return 0;
    }

    public static zzfzn<Integer> zzb(zzk zzkVar) {
        zzfzk zzfzkVar = new zzfzk();
        zzgbt it = zzph.zzb.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzfx.zza >= zzfx.zzg(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), zzkVar.zza().zza)) {
                zzfzkVar.zzf(Integer.valueOf(iIntValue));
            }
        }
        zzfzkVar.zzf((Object) 2);
        return zzfzkVar.zzi();
    }
}
