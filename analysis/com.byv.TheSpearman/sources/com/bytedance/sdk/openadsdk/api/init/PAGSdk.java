package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.component.VwS.HX;
import com.bytedance.sdk.component.VwS.IPb;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.mZx;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.Td.EYQ;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.NZ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.nativeexpress.tp;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.settings.Kbd;
import com.bytedance.sdk.openadsdk.core.settings.MxO;
import com.bytedance.sdk.openadsdk.core.tsL;
import com.bytedance.sdk.openadsdk.mZx.EYQ.Pm;
import com.bytedance.sdk.openadsdk.multipro.Td;
import com.bytedance.sdk.openadsdk.nWX.EYQ.VwS;
import com.bytedance.sdk.openadsdk.pi.EYQ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.nWX;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGSdk {
    private static long EYQ = 0;
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            mZx.EYQ.EYQ(xt.Pm());
        }
        xt.EYQ(new QQ("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                PAGInitHelper.initMemoryData();
            }
        });
        pi.EYQ(System.currentTimeMillis());
        pi.mZx();
        SSWebView.setWebViewProvider(new SSWebView.Td() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
            @Override // com.bytedance.sdk.component.widget.SSWebView.Td
            public WebView createWebView(Context context, AttributeSet attributeSet, int i) {
                if (!(context instanceof MutableContextWrapper)) {
                    context = context.getApplicationContext();
                }
                try {
                    return i == 0 ? new PangleWebView(context, attributeSet) : new PangleWebView(context, attributeSet, i);
                } catch (Exception unused) {
                    return i == 0 ? new PangleWebView(context, attributeSet) : new PangleWebView(context, attributeSet, i);
                }
            }
        });
        EYQ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        EYQ = SystemClock.elapsedRealtime();
        hu.EYQ(context);
        if (pAGInitCallback != null) {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                if (!PAGInitHelper.CALLBACK_LIST.contains(pAGInitCallback)) {
                    PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
                    if (pi.Pm() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            mZx(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            Pm();
            return;
        }
        pi.EYQ(3);
        if (context == null) {
            mZx(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            mZx(4000, "PAGConfig is null, please check.");
            return;
        }
        Pm(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.QQ.EYQ(new tsL() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                public void success() {
                    PAGSdk.Pm();
                }

                @Override // com.bytedance.sdk.openadsdk.core.tsL
                public void fail(int i, String str) {
                    PAGSdk.mZx(i, str);
                }
            });
            try {
                zF.EYQ(hu.EYQ(), "tt_ad_logo_txt");
                if (zF.Pm(context, "tt_ad_logo") == 0) {
                    EYQ(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        Pm();
                        return;
                    }
                    return;
                }
                final EYQ eyq = new EYQ();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return eyq;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    mZx(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().EYQ(new com.bytedance.sdk.openadsdk.multipro.aidl.mZx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.mZx
                        public void onServiceConnected() {
                            pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    PAGSdk.mZx(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().Td();
                }
            } catch (Throwable unused) {
                EYQ(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            mZx(4000, "Internal Error, setting exception. ");
        }
    }

    private static void EYQ(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        pi.EYQ(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                mZx(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                mZx(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(Context context, InitConfig initConfig) {
        long jElapsedRealtime;
        try {
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.PAGSdk", th.getMessage());
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - EYQ;
            mZx(4000, th.getMessage());
            jElapsedRealtime = jElapsedRealtime2;
        }
        if (isInitSuccess()) {
            Pm();
            return;
        }
        Kbd(context, initConfig);
        KO.Jpu().XN();
        jElapsedRealtime = SystemClock.elapsedRealtime() - EYQ;
        Pm();
        IPb(context, initConfig);
        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - EYQ;
        EYQ(context, isInitSuccess(), initConfig, jElapsedRealtime3, jElapsedRealtime);
        Long.valueOf(jElapsedRealtime);
        Long.valueOf(jElapsedRealtime3);
    }

    private static void Td(Context context, InitConfig initConfig) {
        pi.EYQ = true;
        NZ.EYQ().EYQ(initConfig.getAppId()).mZx(initConfig.getCoppa()).Td(initConfig.getGdpr()).Pm(initConfig.getCcpa()).IPb(initConfig.getAppIconId()).EYQ(initConfig.getTitleBarTheme()).EYQ(initConfig.isUseTextureView());
        com.bytedance.sdk.openadsdk.core.QQ.NZ();
        if (initConfig instanceof PAGConfig) {
            NZ.EYQ().Kbd(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (mZx(initConfig)) {
                NZ.EYQ().EYQ();
                com.bytedance.sdk.openadsdk.utils.tsL.EYQ();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.QQ.EYQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mZx(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    private static void Pm(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            zF.EYQ(initConfig.getPackageName());
        } else {
            zF.EYQ((String) null);
        }
        hu.EYQ(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.mZx.EYQ();
        } else {
            com.bytedance.sdk.openadsdk.multipro.mZx.mZx();
        }
        tp.EYQ();
        com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ(context);
    }

    private static void Kbd(Context context, InitConfig initConfig) {
        if (MxO.EYQ()) {
            IPb.Td(-1);
            IPb.EYQ(new com.bytedance.sdk.component.VwS.tp() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                @Override // com.bytedance.sdk.component.VwS.tp
                public HX createThreadFactory(int i, String str) {
                    return new HX(i, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                        @Override // com.bytedance.sdk.component.VwS.HX, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            int iTZE = KO.Jpu().TZE();
                            if (iTZE >= -524288 && iTZE < 0) {
                                Thread thread = new Thread(this.EYQ, runnable, this.mZx, iTZE);
                                if (thread.isDaemon()) {
                                    thread.setDaemon(false);
                                }
                                if (this.Td > 10 || this.Td <= 0) {
                                    this.Td = 5;
                                }
                                thread.setPriority(this.Td);
                                return thread;
                            }
                            return super.newThread(runnable);
                        }
                    };
                }
            });
            Td.EYQ(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) xt.Pm();
            com.bytedance.sdk.component.IPb.Td.EYQ.EYQ(threadPoolExecutor);
            com.bytedance.sdk.openadsdk.Pm.mZx.EYQ(threadPoolExecutor);
            pi.mZx.set(true);
            try {
                com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().EYQ(new com.bytedance.sdk.openadsdk.IPb.EYQ());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.PAGSdk", e.getMessage());
            }
            Td(initConfig);
            Td(context, initConfig);
            com.bykv.vk.openvk.component.video.api.Td.EYQ(context, null);
            com.bykv.vk.openvk.component.video.api.Td.EYQ(2);
            com.bykv.vk.openvk.component.video.api.Td.EYQ(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.component.video.api.Td.EYQ(com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Kbd());
            if (Build.VERSION.SDK_INT < 23) {
                com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ(context);
            }
        }
    }

    private static void IPb(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        xt.EYQ(new QQ("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
            @Override // java.lang.Runnable
            public void run() throws ClassNotFoundException {
                new com.bytedance.sdk.openadsdk.utils.tp();
                com.bytedance.sdk.component.adexpress.EYQ.mZx.IPb.EYQ(nWX.EYQ() * 10);
                Pm.EYQ(context, initConfig.isSupportMultiProcess());
                com.bytedance.sdk.openadsdk.core.nWX.EYQ().mZx();
                com.bytedance.sdk.openadsdk.core.Kbd.Td.EYQ();
                com.bytedance.sdk.openadsdk.pi.EYQ.EYQ(new EYQ.InterfaceC0136EYQ() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                    public void onGdprChanged(int i) {
                        PAGConfig.setGDPRConsent(i);
                    }
                });
                KO.EYQ = KO.Td(context);
                VwS.mZx();
                com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ(hu.Pm().Dd());
                com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ(CacheDirFactory.getICacheDir(0));
                Kbd kbdPm = hu.Pm();
                if (!kbdPm.OtA()) {
                    synchronized (kbdPm) {
                        if (!kbdPm.OtA()) {
                            kbdPm.mZx();
                            kbdPm.FH();
                        }
                    }
                }
                DeviceUtils.tp();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                IPb.EYQ(true);
                IPb.EYQ(new com.bytedance.sdk.openadsdk.tp.mZx.EYQ());
                DeviceUtils.EYQ(context);
                DeviceUtils.tp(context);
                DeviceUtils.MxO(context);
                com.com.bytedance.overseas.sdk.EYQ.mZx.EYQ(context);
                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
                com.bytedance.sdk.openadsdk.core.settings.Td.EYQ();
                com.bytedance.sdk.openadsdk.tp.Td.Td();
                FH.pi(context);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ();
                PAGSdk.Td();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextEYQ = hu.EYQ();
                if (contextEYQ == null || (shortcutManager = (ShortcutManager) contextEYQ.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void Td(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.QQ.mZx().mZx(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm(mZx(initConfig));
    }

    private static void EYQ(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ();
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zTd = com.bytedance.sdk.openadsdk.core.QQ.mZx().Td();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.mZx(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zTd);
                    jSONObject.put("minSdkVersion", FH.MxO(context));
                    jSONObject.put("targetSdkVersion", FH.tp(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    com.bytedance.sdk.openadsdk.core.QQ.mZx().mZx(false);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("pangle_sdk_init").mZx(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Pm() {
        pi.EYQ(1);
        try {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                Iterator<PAGInitCallback> it = PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(int i, String str) {
        pi.EYQ(2);
        try {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                Iterator<PAGInitCallback> it = PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i, str);
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.mZx(context, pAGConfig, pAGInitCallback);
            }
        });
    }

    public static boolean isInitSuccess() {
        return pi.Pm() == 1;
    }

    public static String getSDKVersion() {
        return NZ.EYQ() != null ? NZ.EYQ().Pm() : "";
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            return null;
        }
        hu.EYQ(context);
        return getBiddingToken(str);
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            xt.Kbd(new QQ("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            xt.Kbd(new QQ("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            return null;
        }
        return (hu.EYQ() == null || NZ.EYQ() == null) ? "" : NZ.EYQ().Td(str);
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            return null;
        }
        hu.EYQ(context);
        return getBiddingToken();
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.mZx.EYQ()) {
            return null;
        }
        return (hu.EYQ() == null || NZ.EYQ() == null) ? "" : NZ.EYQ().Kbd();
    }

    public static boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (NZ.EYQ() != null) {
            return NZ.EYQ().EYQ(str, i, str2, str3, str4);
        }
        return false;
    }

    public static String getApplicationName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static void closeMultiWebViewFileLock() {
        Td.EYQ();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && pi.Pm() == 0) {
            PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zF.EYQ(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && hu.Pm().hYh() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        com.bytedance.sdk.openadsdk.common.mZx.EYQ(z);
    }
}
