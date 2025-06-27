package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: InternalContainer.java */
/* loaded from: classes2.dex */
public class hu {
    private static volatile Context EYQ = null;
    private static int Td = -1;
    private static volatile UB<com.bytedance.sdk.openadsdk.mZx.EYQ> mZx;

    public static Context EYQ() {
        if (EYQ == null) {
            EYQ(null);
        }
        return EYQ;
    }

    public static void EYQ(Context context) {
        if (EYQ == null) {
            synchronized (hu.class) {
                if (EYQ == null) {
                    if (context != null) {
                        EYQ = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            EYQ = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application applicationEYQ = EYQ.EYQ();
                        if (applicationEYQ != null) {
                            EYQ = applicationEYQ;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static int mZx() {
        Context contextEYQ;
        if (Td < 0 && (contextEYQ = EYQ()) != null) {
            Td = ViewConfiguration.get(contextEYQ).getScaledTouchSlop();
        }
        return Td;
    }

    public static UB<com.bytedance.sdk.openadsdk.mZx.EYQ> Td() {
        if (mZx == null) {
            synchronized (hu.class) {
                if (mZx == null) {
                    mZx = new Uc(EYQ);
                }
            }
        }
        return mZx;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.Kbd Pm() {
        return com.bytedance.sdk.openadsdk.core.settings.KO.Jpu();
    }

    public static com.bytedance.sdk.openadsdk.tp.Td.EYQ Kbd() {
        if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
            return com.bytedance.sdk.openadsdk.tp.Td.mZx.EYQ();
        }
        return com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ();
    }

    /* compiled from: InternalContainer.java */
    private static class EYQ {
        private static volatile Application EYQ;

        public static Application EYQ() {
            return EYQ;
        }

        static {
            try {
                Object objMZx = mZx();
                EYQ = (Application) objMZx.getClass().getMethod("getApplication", new Class[0]).invoke(objMZx, new Object[0]);
                com.bytedance.sdk.component.utils.pi.EYQ("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("MyApplication", "application get failed", th);
            }
        }

        private static Object mZx() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
