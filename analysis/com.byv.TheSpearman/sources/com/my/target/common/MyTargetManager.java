package com.my.target.common;

import android.content.Context;
import com.my.target.a5;
import com.my.target.ba;
import com.my.target.c0;
import com.my.target.c6;
import com.my.target.common.MyTargetConfig;
import com.my.target.q1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class MyTargetManager {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static volatile MyTargetConfig myTargetConfig = new MyTargetConfig.Builder().build();

    public static String getBidderToken(Context context) {
        return q1.b().a(myTargetConfig, MyTargetPrivacy.currentPrivacy(), context);
    }

    public static MyTargetConfig getSdkConfig() {
        return myTargetConfig;
    }

    public static void initSdk(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            ba.c("MyTarget cannot be initialized due to a null application context");
        } else if (INITIALIZED.compareAndSet(false, true)) {
            ba.c("MyTarget initialization");
            c0.b(new Runnable() { // from class: com.my.target.common.MyTargetManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MyTargetManager.lambda$initSdk$0(applicationContext);
                }
            });
        }
    }

    public static boolean isSdkInitialized() {
        return INITIALIZED.get();
    }

    static /* synthetic */ void lambda$initSdk$0(Context context) {
        a5.c(context);
        q1.b().a(myTargetConfig, context);
        c6.a(context);
        c0.b();
    }

    public static void setDebugMode(boolean z) {
        ba.f3930a = z;
        if (z) {
            ba.a("Debug mode enabled");
        }
    }

    public static void setSdkConfig(MyTargetConfig myTargetConfig2) {
        myTargetConfig = myTargetConfig2;
    }
}
