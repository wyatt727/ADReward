package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
final class zzd extends Thread {
    final /* synthetic */ String zza;

    zzd(zzf zzfVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzr(null).zza(this.zza);
    }
}
