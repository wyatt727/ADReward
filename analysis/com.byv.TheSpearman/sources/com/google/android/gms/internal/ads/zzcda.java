package com.google.android.gms.internal.ads;

import com.json.x6;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcda implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcdb zzb;

    zzcda(zzcdb zzcdbVar, boolean z) {
        this.zza = z;
        this.zzb = zzcdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", x6.k, String.valueOf(this.zza));
    }
}
