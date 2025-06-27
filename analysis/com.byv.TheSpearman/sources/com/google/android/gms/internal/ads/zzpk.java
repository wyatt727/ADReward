package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpk extends AudioDeviceCallback {
    final /* synthetic */ zzpo zza;

    /* synthetic */ zzpk(zzpo zzpoVar, zzpj zzpjVar) {
        this.zza = zzpoVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpoVar = this.zza;
        this.zza.zzj(zzph.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpp zzppVar = this.zza.zzg;
        int i = zzfx.zza;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (zzfx.zzG(audioDeviceInfoArr[i2], zzppVar)) {
                this.zza.zzg = null;
                break;
            }
            i2++;
        }
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzph.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }
}
