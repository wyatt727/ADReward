package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzra {
    public static void zza(AudioTrack audioTrack, zzpp zzppVar) {
        audioTrack.setPreferredDevice(zzppVar == null ? null : zzppVar.zza);
    }
}
