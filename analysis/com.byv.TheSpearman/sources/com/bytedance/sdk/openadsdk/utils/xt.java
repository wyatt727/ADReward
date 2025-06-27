package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.VwS.Td.Kbd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: ThreadUtils.java */
/* loaded from: classes2.dex */
public class xt {
    private static volatile ThreadPoolExecutor EYQ;
    private static volatile com.bytedance.sdk.component.VwS.Td.Kbd IPb;
    private static volatile com.bytedance.sdk.component.VwS.Td.Kbd Kbd;
    private static volatile com.bytedance.sdk.component.VwS.Td.Kbd Pm;
    private static volatile com.bytedance.sdk.component.VwS.Td.Kbd Td;
    private static volatile com.bytedance.sdk.component.VwS.Td.Kbd VwS;
    private static volatile boolean mZx;

    static {
        com.bytedance.sdk.component.VwS.Td.mZx.EYQ(new com.bytedance.sdk.component.VwS.Td.Pm() { // from class: com.bytedance.sdk.openadsdk.utils.xt.1
            @Override // com.bytedance.sdk.component.VwS.Td.Pm
            public void EYQ(final com.bytedance.sdk.component.VwS.Td.Kbd kbd) {
                if (kbd != null) {
                    try {
                        LinkedHashMap<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ> linkedHashMapEYQ = kbd.EYQ();
                        if (linkedHashMapEYQ == null || linkedHashMapEYQ.size() <= 0) {
                            return;
                        }
                        Iterator<Map.Entry<String, com.bytedance.sdk.component.VwS.Td.EYQ.EYQ>> it = linkedHashMapEYQ.entrySet().iterator();
                        while (it.hasNext()) {
                            final com.bytedance.sdk.component.VwS.Td.EYQ.EYQ value = it.next().getValue();
                            if (value != null) {
                                com.bytedance.sdk.openadsdk.tp.Td.EYQ();
                                com.bytedance.sdk.openadsdk.tp.Td.EYQ("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.utils.xt.1.1
                                    @Override // com.bytedance.sdk.openadsdk.tp.mZx
                                    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("name", value.EYQ());
                                            jSONObject.put("times", value.mZx());
                                            jSONObject.put("runMaxTime", value.IPb());
                                            jSONObject.put("waitMaxTime", value.Kbd());
                                            long jMZx = value.mZx() == 0 ? 1 : value.mZx();
                                            jSONObject.put("avgRunTime", value.Pm() / jMZx);
                                            jSONObject.put("avgWaitTime", value.Td() / jMZx);
                                            jSONObject.put("poolType", kbd.mZx());
                                        } catch (Exception e) {
                                            com.bytedance.sdk.component.utils.pi.EYQ("ThreadUtils", "run: ", e);
                                        }
                                        return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("pag_thread_pool_state").mZx(jSONObject.toString());
                                    }
                                });
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        });
        EYQ = null;
        mZx = false;
    }

    public static ScheduledExecutorService EYQ() {
        return com.bytedance.sdk.component.VwS.IPb.IPb();
    }

    public static ExecutorService mZx() {
        return com.bytedance.sdk.component.VwS.IPb.tp();
    }

    public static ExecutorService Td() {
        if (nWX()) {
            return MxO();
        }
        return com.bytedance.sdk.component.VwS.IPb.Pm();
    }

    public static ExecutorService Pm() {
        if (nWX()) {
            return QQ();
        }
        return com.bytedance.sdk.component.VwS.IPb.mZx();
    }

    public static boolean Kbd() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean IPb() {
        String str = nWX() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static void EYQ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Kbd()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.pi.Td().post(runnable);
        }
    }

    public static void EYQ(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (nWX()) {
            QQ().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.2
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
        } else {
            com.bytedance.sdk.component.VwS.IPb.EYQ(qq);
        }
    }

    public static ExecutorService VwS() {
        if (nWX()) {
            return pi();
        }
        return com.bytedance.sdk.component.VwS.IPb.Td();
    }

    public static void mZx(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (nWX()) {
            pi().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.3
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
        } else {
            com.bytedance.sdk.component.VwS.IPb.mZx(qq);
        }
    }

    public static void EYQ(final com.bytedance.sdk.component.VwS.QQ qq, int i) {
        if (qq == null) {
            return;
        }
        if (nWX()) {
            com.bytedance.sdk.component.VwS.Td.EYQ eyq = new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.4
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            };
            eyq.EYQ(i);
            pi().execute(eyq);
            return;
        }
        com.bytedance.sdk.component.VwS.IPb.EYQ(qq, 5, i);
    }

    public static void Td(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (qq == null) {
            return;
        }
        if (nWX()) {
            MxO().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.5
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
        } else {
            com.bytedance.sdk.component.VwS.IPb.Td(qq);
        }
    }

    public static void mZx(final com.bytedance.sdk.component.VwS.QQ qq, int i) {
        if (qq == null) {
            return;
        }
        if (nWX()) {
            com.bytedance.sdk.component.VwS.Td.EYQ eyq = new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.6
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            };
            eyq.EYQ(i);
            MxO().execute(eyq);
            return;
        }
        com.bytedance.sdk.component.VwS.IPb.mZx(qq, i);
    }

    public static void Pm(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (qq == null) {
            return;
        }
        if (nWX()) {
            tp().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.7
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
        } else {
            com.bytedance.sdk.component.VwS.IPb.Kbd(qq);
        }
    }

    public static void Td(final com.bytedance.sdk.component.VwS.QQ qq, int i) {
        if (qq == null) {
            return;
        }
        if (nWX()) {
            tsL().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.xt.8
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
        } else {
            com.bytedance.sdk.component.VwS.IPb.Td(qq, i);
        }
    }

    public static void Kbd(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (nWX()) {
            tp().execute(new com.bytedance.sdk.component.VwS.Td.EYQ(qq.getName(), qq) { // from class: com.bytedance.sdk.openadsdk.utils.xt.9
                @Override // java.lang.Runnable
                public void run() {
                    qq.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutorHX = HX();
        threadPoolExecutorHX.execute(qq);
        if (mZx || !com.bytedance.sdk.openadsdk.core.settings.KO.PP()) {
            return;
        }
        mZx = true;
        threadPoolExecutorHX.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().XT());
    }

    private static ThreadPoolExecutor HX() {
        if (EYQ == null) {
            synchronized (xt.class) {
                if (EYQ == null) {
                    int iXT = 4;
                    if (com.bytedance.sdk.openadsdk.core.settings.KO.PP()) {
                        iXT = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().XT();
                        mZx = true;
                    }
                    EYQ = new ThreadPoolExecutor(iXT, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    Integer.valueOf(iXT);
                }
            }
        }
        return EYQ;
    }

    private static ThreadPoolExecutor tp() {
        com.bytedance.sdk.component.VwS.Td.Kbd kbd;
        com.bytedance.sdk.component.VwS.Td.Kbd kbd2 = Td;
        if (!EYQ(kbd2)) {
            return kbd2;
        }
        synchronized (xt.class) {
            if (EYQ(Td)) {
                try {
                    JSONObject jSONObjectEYQ = EYQ("ad");
                    Td = new Kbd.EYQ().EYQ("ad").EYQ(jSONObjectEYQ.optInt("coreSize", 4)).mZx(jSONObjectEYQ.optInt("maxSize", 8)).Td(jSONObjectEYQ.optInt("createSize", 10000)).EYQ(jSONObjectEYQ.optInt("keepAlive", 30000)).EYQ(jSONObjectEYQ.optBoolean("allowCoreTimeOut", true)).Kbd(com.bytedance.sdk.openadsdk.core.QQ.mZx().tPj() ? jSONObjectEYQ.optInt("reportLogThreshold", -1) : -1).Pm(jSONObjectEYQ.optInt("logTaskCount", 10)).mZx(jSONObjectEYQ.optBoolean("isUseConfig", false)).EYQ();
                } catch (Throwable th) {
                    th.getMessage();
                }
                kbd = Td;
            } else {
                kbd = Td;
            }
        }
        return kbd;
    }

    private static boolean EYQ(com.bytedance.sdk.component.VwS.Td.Kbd kbd) {
        if (kbd != null) {
            return !kbd.Td() && com.bytedance.sdk.openadsdk.core.settings.KO.PP();
        }
        return true;
    }

    public static com.bytedance.sdk.component.VwS.Td.Kbd QQ() {
        com.bytedance.sdk.component.VwS.Td.Kbd kbd;
        com.bytedance.sdk.component.VwS.Td.Kbd kbd2 = IPb;
        if (!EYQ(kbd2)) {
            return kbd2;
        }
        synchronized (xt.class) {
            if (EYQ(IPb)) {
                try {
                    JSONObject jSONObjectEYQ = EYQ("cache");
                    IPb = new Kbd.EYQ().EYQ("cache").EYQ(jSONObjectEYQ.optInt("coreSize", 0)).mZx(jSONObjectEYQ.optInt("maxSize", 0)).Td(jSONObjectEYQ.optInt("createSize", 0)).EYQ(jSONObjectEYQ.optInt("keepAlive", 30000)).EYQ(jSONObjectEYQ.optBoolean("allowCoreTimeOut", true)).Kbd(com.bytedance.sdk.openadsdk.core.QQ.mZx().tPj() ? jSONObjectEYQ.optInt("reportLogThreshold", -1) : -1).Pm(jSONObjectEYQ.optInt("logTaskCount", 10)).mZx(jSONObjectEYQ.optBoolean("isUseConfig", false)).EYQ();
                } catch (Throwable th) {
                    th.getMessage();
                }
                kbd = IPb;
            } else {
                kbd = IPb;
            }
        }
        return kbd;
    }

    private static com.bytedance.sdk.component.VwS.Td.Kbd MxO() {
        com.bytedance.sdk.component.VwS.Td.Kbd kbd;
        com.bytedance.sdk.component.VwS.Td.Kbd kbd2 = Pm;
        if (!EYQ(kbd2)) {
            return kbd2;
        }
        synchronized (xt.class) {
            if (EYQ(Pm)) {
                try {
                    JSONObject jSONObjectEYQ = EYQ("log");
                    Pm = new Kbd.EYQ().EYQ("log").EYQ(jSONObjectEYQ.optInt("coreSize", 8)).mZx(jSONObjectEYQ.optInt("maxSize", 16)).Td(jSONObjectEYQ.optInt("createSize", 2)).EYQ(jSONObjectEYQ.optInt("keepAlive", 20000)).EYQ(jSONObjectEYQ.optBoolean("allowCoreTimeOut", true)).Kbd(com.bytedance.sdk.openadsdk.core.QQ.mZx().tPj() ? jSONObjectEYQ.optInt("reportLogThreshold", -1) : -1).Pm(jSONObjectEYQ.optInt("logTaskCount", 10)).mZx(jSONObjectEYQ.optBoolean("isUseConfig", false)).EYQ();
                } catch (Throwable th) {
                    th.getMessage();
                }
                kbd = Pm;
            } else {
                kbd = Pm;
            }
        }
        return kbd;
    }

    private static com.bytedance.sdk.component.VwS.Td.Kbd tsL() {
        com.bytedance.sdk.component.VwS.Td.Kbd kbd;
        com.bytedance.sdk.component.VwS.Td.Kbd kbd2 = Kbd;
        if (!EYQ(kbd2)) {
            return kbd2;
        }
        synchronized (xt.class) {
            if (EYQ(Kbd)) {
                try {
                    JSONObject jSONObjectEYQ = EYQ("aidl");
                    Kbd = new Kbd.EYQ().EYQ("aidl").EYQ(jSONObjectEYQ.optInt("coreSize", 4)).mZx(jSONObjectEYQ.optInt("maxSize", 8)).Td(jSONObjectEYQ.optInt("createSize", 0)).EYQ(jSONObjectEYQ.optInt("keepAlive", 30000)).EYQ(jSONObjectEYQ.optBoolean("allowCoreTimeOut", true)).Kbd(com.bytedance.sdk.openadsdk.core.QQ.mZx().tPj() ? jSONObjectEYQ.optInt("reportLogThreshold", -1) : -1).Pm(jSONObjectEYQ.optInt("logTaskCount", 10)).mZx(jSONObjectEYQ.optBoolean("isUseConfig", false)).EYQ();
                } catch (Throwable th) {
                    th.getMessage();
                }
                kbd = Kbd;
            } else {
                kbd = Kbd;
            }
        }
        return kbd;
    }

    private static com.bytedance.sdk.component.VwS.Td.Kbd pi() {
        com.bytedance.sdk.component.VwS.Td.Kbd kbd;
        com.bytedance.sdk.component.VwS.Td.Kbd kbd2 = VwS;
        if (!EYQ(kbd2)) {
            return kbd2;
        }
        synchronized (xt.class) {
            if (EYQ(VwS)) {
                try {
                    JSONObject jSONObjectEYQ = EYQ("io");
                    VwS = new Kbd.EYQ().EYQ("io").EYQ(jSONObjectEYQ.optInt("coreSize", 4)).mZx(jSONObjectEYQ.optInt("maxSize", 16)).Td(jSONObjectEYQ.optInt("createSize", 0)).EYQ(jSONObjectEYQ.optInt("keepAlive", 20000)).EYQ(jSONObjectEYQ.optBoolean("allowCoreTimeOut", true)).Kbd(com.bytedance.sdk.openadsdk.core.QQ.mZx().tPj() ? jSONObjectEYQ.optInt("reportLogThreshold", -1) : -1).Pm(jSONObjectEYQ.optInt("logTaskCount", 10)).mZx(jSONObjectEYQ.optBoolean("isUseConfig", false)).EYQ();
                } catch (Throwable th) {
                    th.getMessage();
                }
                kbd = VwS;
            } else {
                kbd = VwS;
            }
        }
        return kbd;
    }

    private static JSONObject EYQ(String str) {
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.KO.PP()) {
                JSONObject jSONObjectVC = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().VC();
                jSONObjectOptJSONObject = jSONObjectVC != null ? jSONObjectVC.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                jSONObjectOptJSONObject.put("isUseConfig", true);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    private static boolean nWX() {
        if (com.bytedance.sdk.openadsdk.core.settings.KO.PP()) {
            return com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().dub();
        }
        return false;
    }
}
