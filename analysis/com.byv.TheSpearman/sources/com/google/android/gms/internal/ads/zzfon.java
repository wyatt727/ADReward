package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfon {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfom(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfoj.zza() != zzfne.CTV) {
            return 2;
        }
        return zza;
    }
}
