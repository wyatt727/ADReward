package com.bytedance.sdk.openadsdk.core.Kbd.EYQ;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ActivityLifecycleCallbackForSec.java */
/* loaded from: classes2.dex */
public class EYQ implements Application.ActivityLifecycleCallbacks {
    private static volatile EYQ EYQ;
    private final mZx mZx;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private EYQ(Application application) {
        this.mZx = mZx.EYQ(application);
    }

    public static EYQ EYQ(Application application) {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ(application);
                    application.registerActivityLifecycleCallbacks(EYQ);
                }
            }
        }
        return EYQ;
    }

    public String EYQ(String str, long j, int i) {
        mZx mzx = this.mZx;
        return mzx != null ? mzx.EYQ(str, j, i) : AbstractJsonLexerKt.NULL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        mZx mzx = this.mZx;
        if (mzx != null) {
            mzx.EYQ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        mZx mzx = this.mZx;
        if (mzx != null) {
            mzx.mZx(activity);
        }
    }
}
