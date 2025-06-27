package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "hasPendingForeground", "", "getHasPendingForeground$com_google_firebase_firebase_sessions$annotations", "getHasPendingForeground$com_google_firebase_firebase_sessions", "()Z", "setHasPendingForeground$com_google_firebase_firebase_sessions", "(Z)V", "lifecycleClient", "Lcom/google/firebase/sessions/SessionLifecycleClient;", "getLifecycleClient", "()Lcom/google/firebase/sessions/SessionLifecycleClient;", "setLifecycleClient", "(Lcom/google/firebase/sessions/SessionLifecycleClient;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final SessionsActivityLifecycleCallbacks INSTANCE = new SessionsActivityLifecycleCallbacks();
    private static boolean hasPendingForeground;
    private static SessionLifecycleClient lifecycleClient;

    public static /* synthetic */ void getHasPendingForeground$com_google_firebase_firebase_sessions$annotations() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    private SessionsActivityLifecycleCallbacks() {
    }

    public final boolean getHasPendingForeground$com_google_firebase_firebase_sessions() {
        return hasPendingForeground;
    }

    public final void setHasPendingForeground$com_google_firebase_firebase_sessions(boolean z) {
        hasPendingForeground = z;
    }

    public final SessionLifecycleClient getLifecycleClient() {
        return lifecycleClient;
    }

    public final void setLifecycleClient(SessionLifecycleClient sessionLifecycleClient) {
        lifecycleClient = sessionLifecycleClient;
        if (sessionLifecycleClient == null || !hasPendingForeground) {
            return;
        }
        hasPendingForeground = false;
        sessionLifecycleClient.foregrounded();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.foregrounded();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            hasPendingForeground = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.backgrounded();
        }
    }
}
