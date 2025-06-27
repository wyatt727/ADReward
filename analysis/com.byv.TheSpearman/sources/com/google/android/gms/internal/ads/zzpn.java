package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpn extends BroadcastReceiver {
    final /* synthetic */ zzpo zza;

    /* synthetic */ zzpn(zzpo zzpoVar, zzpm zzpmVar) {
        this.zza = zzpoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzph.zzd(context, intent, zzpoVar.zzh, zzpoVar.zzg));
    }
}
