package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.0 */
/* loaded from: classes2.dex */
final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.zza.zzb.zze();
    }

    zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
