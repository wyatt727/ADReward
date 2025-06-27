package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.utils.Kbd;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.json.i5;
import com.my.tracker.ads.AdFormat;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeviceUtils {
    public static String EYQ = "";
    private static int HX;
    private static int MxO;
    private static int QQ;
    private static int pi;
    private static int tp;
    private static int tsL;
    private static volatile long mZx = System.currentTimeMillis();
    private static volatile boolean Td = false;
    private static volatile boolean Pm = false;
    private static volatile boolean Kbd = false;
    private static volatile boolean IPb = true;
    private static long VwS = 0;

    public static void EYQ(Context context) {
        if (Td) {
            return;
        }
        try {
            mZx mzx = new mZx();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(mzx, intentFilter);
            Td = true;
        } catch (Throwable unused) {
        }
    }

    public static long EYQ() {
        return mZx;
    }

    @JProtect
    public static boolean mZx() {
        if (SystemClock.elapsedRealtime() - VwS >= 20000) {
            VwS = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("power");
                if (powerManager != null) {
                    if (Build.VERSION.SDK_INT >= 20) {
                        IPb = powerManager.isInteractive();
                    } else {
                        IPb = powerManager.isScreenOn();
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return IPb;
    }

    public static boolean mZx(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean Td(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int Pm(Context context) {
        if (Td(context)) {
            return 3;
        }
        return mZx(context) ? 2 : 1;
    }

    private static void EYQ(JSONObject jSONObject) throws JSONException {
        mZx(jSONObject);
    }

    private static void mZx(JSONObject jSONObject) throws JSONException {
        jSONObject.put(i5.u, Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.hu.Pm().lEs(i5.w0)) {
            jSONObject.put(i5.w0, com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
        }
    }

    @JProtect
    public static JSONObject EYQ(Context context, boolean z) throws JSONException {
        String strMZx;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", IPb(context));
            EYQ(jSONObject);
            jSONObject.put("type", Pm(context));
            jSONObject.put(i5.x, 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", FH.tsL(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.Td.Td());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.Td.mZx());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.Td.Pm());
            jSONObject.put("screen_width", tr.Td(context));
            jSONObject.put("screen_height", tr.Pm(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.Kbd.Td.Kbd());
            com.bytedance.sdk.openadsdk.core.settings.Kbd kbdPm = com.bytedance.sdk.openadsdk.core.hu.Pm();
            if (kbdPm.lEs("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.MxO.Td(context));
            jSONObject.put("rom_version", WU.EYQ());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.MxO.mZx(context));
            jSONObject.put("timezone", FH.Uc());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.MxO.EYQ());
            jSONObject.put("carrier_name", XN.EYQ());
            if (z) {
                strMZx = FH.EYQ(context);
            } else {
                strMZx = FH.mZx(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strMZx) * 1024));
            jSONObject.put("locale_language", Pm());
            jSONObject.put("screen_bright", Math.ceil(Kbd() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", mZx() ? 0 : 1);
            jSONObject.put("cpu_num", IPb.EYQ(context));
            jSONObject.put("cpu_max_freq", IPb.mZx(context));
            jSONObject.put("cpu_min_freq", IPb.Td(context));
            Kbd.EYQ EYQ2 = Kbd.EYQ();
            jSONObject.put("battery_remaining_pct", (int) EYQ2.mZx);
            jSONObject.put("is_charging", EYQ2.EYQ);
            jSONObject.put("total_space", String.valueOf(FH.Td(context)));
            jSONObject.put("free_space_in", String.valueOf(FH.Pm(context)));
            jSONObject.put("sdcard_size", String.valueOf(FH.Kbd(context)));
            jSONObject.put("rooted", FH.IPb(context));
            jSONObject.put("enable_assisted_clicking", IPb());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.zF.EYQ(context, "tt_choose_language"));
            jSONObject.put("airplane", VwS(context));
            jSONObject.put("darkmode", nWX(context));
            jSONObject.put("headset", KO(context));
            jSONObject.put("ringmute", QQ(context));
            jSONObject.put("screenscale", hu(context));
            jSONObject.put("volume", QQ());
            jSONObject.put("low_power_mode", UB(context));
            if (kbdPm.lEs("mnc")) {
                jSONObject.put("mnc", XN.Td());
            }
            if (kbdPm.lEs("mcc")) {
                jSONObject.put("mcc", XN.mZx());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.EYQ.mZx(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.EYQ.EYQ());
            String strTd = com.bytedance.sdk.openadsdk.core.Kbd.Td.Td();
            if (!TextUtils.isEmpty(strTd)) {
                jSONObject.put("sof_chara", strTd);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject Kbd(Context context) {
        return EYQ(context, false);
    }

    public static int Td() {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).mZx("limit_ad_track", -1);
    }

    public static String Pm() {
        if (Build.VERSION.SDK_INT >= 21) {
            String languageTag = Locale.getDefault().toLanguageTag();
            return !TextUtils.isEmpty(languageTag) ? languageTag : "";
        }
        return Locale.getDefault().getLanguage();
    }

    public static float Kbd() {
        int i = -1;
        try {
            Context contextEYQ = com.bytedance.sdk.openadsdk.core.hu.EYQ();
            if (contextEYQ != null) {
                i = Settings.System.getInt(contextEYQ.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int IPb() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int IPb(Context context) {
        int i = -1;
        if (context == null) {
            return -1;
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                i = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
            } else {
                i = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.DeviceUtils", th.getMessage());
        }
        return i;
    }

    public static int VwS(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int nWX(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    private static int KO(Context context) {
        return tsL;
    }

    public static int QQ(Context context) {
        return QQ;
    }

    private static float hu(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int VwS() {
        return tp;
    }

    public static int QQ() {
        return MxO;
    }

    public static int HX() {
        return HX;
    }

    private static int UB(Context context) {
        return pi;
    }

    public static String HX(Context context) {
        if (TextUtils.isEmpty(EYQ)) {
            EYQ = com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("framework_name", "");
        }
        return EYQ;
    }

    @JProtect
    public static void tp() {
        new Td().run();
        Context contextEYQ = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        if (contextEYQ != null) {
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("cpu_count", IPb.EYQ());
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("cpu_max_frequency", IPb.EYQ(IPb.EYQ()));
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("cpu_min_frequency", IPb.mZx(IPb.EYQ()));
            String strHX = FH.HX();
            if (strHX != null) {
                com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("total_memory", strHX);
            }
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("total_internal_storage", FH.tp());
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("free_internal_storage", com.bytedance.sdk.component.utils.nWX.EYQ());
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("total_sdcard_storage", FH.MxO());
            com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("is_root", FH.tsL() ? 1 : 0);
            if (TextUtils.isEmpty(HX(contextEYQ))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    EYQ = "unity";
                } catch (ClassNotFoundException unused) {
                    EYQ = AdFormat.NATIVE;
                }
                com.bytedance.sdk.openadsdk.core.Td.EYQ(contextEYQ).EYQ("framework_name", EYQ);
            }
            MxO();
            Uc(contextEYQ);
            pi = zF(contextEYQ);
        }
    }

    public static void MxO() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                QQ = 1;
            } else if (ringerMode == 1) {
                QQ = 2;
            } else {
                QQ = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void Uc(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            HX = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            tp = streamVolume;
            MxO = (int) ((streamVolume / HX) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hYh(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        xt.mZx(new com.bytedance.sdk.component.VwS.QQ("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.pi = DeviceUtils.zF(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zF(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
            }
            return WU(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int WU(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L35
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != r1) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            r2 = r1
            goto L34
        L1c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L34
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L35
            r0 = 4
            if (r4 != r0) goto L19
            goto L1a
        L34:
            return r2
        L35:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.DeviceUtils.WU(android.content.Context):int");
    }

    public static void tp(Context context) {
        AudioInfoReceiver.mZx(context);
    }

    public static void MxO(Context context) {
        Context applicationContext;
        if (Kbd || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                XN(applicationContext);
            } else {
                EYQ.mZx(applicationContext);
            }
            Kbd = true;
        } catch (Throwable unused) {
        }
    }

    private static void XN(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.hYh(applicationContext);
            }
        });
    }

    static class mZx extends BroadcastReceiver {
        mZx() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.IPb = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.IPb = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.mZx = System.currentTimeMillis();
            }
        }
    }

    public static class Td implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.hu.EYQ());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (com.bytedance.sdk.openadsdk.core.hu.Pm().lEs(i5.w0)) {
                        String id = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id)) {
                            com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx(id);
                            com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ(id);
                            com.bytedance.sdk.openadsdk.core.Kbd.Td.EYQ(id);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    com.bytedance.sdk.openadsdk.core.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).EYQ("limit_ad_track", i);
                }
            } catch (IOException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.HX.IPb> EYQ = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void mZx(Context context) {
            if (DeviceUtils.Pm || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                boolean unused = DeviceUtils.Pm = true;
            } catch (Throwable unused2) {
            }
        }

        public static void EYQ(com.bytedance.sdk.openadsdk.HX.IPb iPb) {
            if (iPb != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.HX.IPb> copyOnWriteArrayList = EYQ;
                if (copyOnWriteArrayList.contains(iPb)) {
                    return;
                }
                copyOnWriteArrayList.add(iPb);
            }
        }

        public static void mZx(com.bytedance.sdk.openadsdk.HX.IPb iPb) {
            if (iPb == null) {
                return;
            }
            EYQ.remove(iPb);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.tp = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        Iterator<com.bytedance.sdk.openadsdk.HX.IPb> it = EYQ.iterator();
                        while (it.hasNext()) {
                            it.next().EYQ(DeviceUtils.tp);
                        }
                        if (DeviceUtils.HX != 0) {
                            int unused2 = DeviceUtils.MxO = (int) ((DeviceUtils.tp / DeviceUtils.HX) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.tsL = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static class EYQ extends BroadcastReceiver {
        private EYQ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void mZx(Context context) {
            if (Build.VERSION.SDK_INT < 21 || context == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(new EYQ(), intentFilter, 2);
            } else {
                context.registerReceiver(new EYQ(), intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.hYh(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.pi = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }
}
