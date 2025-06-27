package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcep implements Runnable {
    final /* synthetic */ zzceq zza;

    zzcep(zzceq zzceqVar) {
        this.zza = zzceqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzu.zzy().zzc(this.zza);
    }
}
