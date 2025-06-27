package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzes implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzet zza;
    private final WeakReference<Activity> zzb;

    zzes(zzet zzetVar, WeakReference<Activity> weakReference) {
        this.zza = zzetVar;
        this.zzb = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == this.zzb.get()) {
            this.zza.zze = true;
            Log.d("NearbyConnections", "Activity is visible.");
            this.zza.zzg();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.zzb.get()) {
            this.zza.zze = false;
            Log.d("NearbyConnections", "Activity is hidden.");
            this.zza.zzg();
        }
    }
}
