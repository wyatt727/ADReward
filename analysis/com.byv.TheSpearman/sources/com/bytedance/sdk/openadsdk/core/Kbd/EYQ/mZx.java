package com.bytedance.sdk.openadsdk.core.Kbd.EYQ;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.json.t2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdShowCheckForSec.java */
/* loaded from: classes2.dex */
public class mZx {
    private static volatile mZx EYQ;
    private final ArrayList<String> mZx = new ArrayList<>();
    private final AtomicBoolean Td = new AtomicBoolean(false);
    private long Pm = System.currentTimeMillis();
    private long Kbd = 0;
    private long IPb = 0;
    private String VwS = "";
    private String QQ = "";
    private String HX = "";
    private boolean tp = false;
    private boolean MxO = false;

    public static mZx EYQ(Application application) {
        if (EYQ == null) {
            synchronized (mZx.class) {
                if (EYQ == null) {
                    mZx mzx = new mZx();
                    EYQ = mzx;
                    mzx.tp = EYQ((Context) application);
                    EYQ.MxO = EYQ(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    EYQ.EYQ();
                }
            }
        }
        return EYQ;
    }

    private static int EYQ(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return Build.VERSION.SDK_INT >= 23 ? -1 : 0;
        }
    }

    private static boolean EYQ(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void EYQ(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.mZx.size() == 0) {
            this.VwS = localClassName;
            this.Kbd = System.currentTimeMillis();
            this.IPb = System.currentTimeMillis() - this.Pm;
            this.Td.set(false);
        }
        if (!this.mZx.contains(localClassName)) {
            this.mZx.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.HX = localClassName;
    }

    public void mZx(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.mZx.contains(localClassName)) {
            this.mZx.remove(localClassName);
        }
        if (this.mZx.size() == 0) {
            this.Pm = System.currentTimeMillis();
            this.Td.set(true);
            this.QQ = localClassName;
        }
    }

    private void EYQ() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int size;
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
                if (arrayMap != null && (size = arrayMap.size()) > 0) {
                    Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                    Field declaredField2 = cls2.getDeclaredField(t2.h.i0);
                    declaredField2.setAccessible(true);
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    for (int i = 0; i < size; i++) {
                        Object objValueAt = arrayMap.valueAt(i);
                        if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                            String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                            if (!this.mZx.contains(localClassName)) {
                                this.mZx.add(localClassName);
                            }
                        }
                    }
                    this.Td.set(this.mZx.size() <= 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public String EYQ(String str, long j, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.Kbd;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.Td.get() && this.MxO) {
            i2 |= 2;
        }
        if (!this.Td.get() && this.IPb >= 5000 && j2 < 1000) {
            i2 = this.QQ.equals(this.HX) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.IPb).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.Td).put("alert", this.MxO).put(NotificationCompat.CATEGORY_SYSTEM, this.tp).put("actsize", this.mZx.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.mZx.Td()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.VwS = "";
        this.IPb = 0L;
        this.Kbd = 0L;
        this.Pm = System.currentTimeMillis();
        return string;
    }
}
