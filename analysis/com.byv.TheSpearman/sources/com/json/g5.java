package com.json;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.p;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class g5 implements Runnable {
    public static final String L = "sdkVersion";
    public static final String M = "AdvIdOptOutReason";
    private static final int N = 15;
    private static final int O = 840;
    private static final int P = -720;
    private Context J;

    /* renamed from: a, reason: collision with root package name */
    private final String f1788a = getClass().getSimpleName();
    private final String b = "bundleId";
    private final String c = td.h1;
    private final String d = "isLimitAdTrackingEnabled";
    private final String e = "appKey";
    private final String f = td.p0;
    private final String g = "osVersion";
    private final String h = "connectionType";
    private final String i = "language";
    private final String j = "deviceOEM";
    private final String k = "deviceModel";
    private final String l = "mobileCarrier";
    private final String m = "externalFreeMemory";
    private final String n = "internalFreeMemory";
    private final String o = "battery";
    private final String p = "gmtMinutesOffset";
    private final String q = "appVersion";
    private final String r = "sessionId";
    private final String s = "pluginType";
    private final String t = "pluginVersion";
    private final String u = "plugin_fw_v";
    private final String v = "jb";
    private final String w = "advertisingIdType";
    private final String x = "mt";
    private final String y = "firstSession";
    private final String z = "mcc";
    private final String A = "mnc";
    private final String B = "icc";
    private final String C = "tz";
    private final String D = "auid";
    private final String E = "userLat";
    private final String F = "publisherAPI";
    private final String G = "missingDependencies";
    private final String H = "missingManifest";
    private final String I = "other";
    private final b6 K = ca.h().c();

    private g5() {
    }

    public g5(Context context) {
        this.J = context.getApplicationContext();
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "missingDependencies" : !v3.f2345a.b() ? "publisherAPI" : !this.K.u(this.J) ? "missingManifest" : Boolean.parseBoolean(str) ? "userLat" : "other";
    }

    private Map<String, Object> a() {
        String str;
        boolean z;
        HashMap map = new HashMap();
        map.put("sessionId", IronSourceUtils.getSessionId());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = p0.b(this.J, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put("appVersion", strB);
            }
        }
        map.put("appKey", c());
        String strP = this.K.p(this.J);
        String strA = this.K.a(this.J);
        boolean z2 = false;
        if (TextUtils.isEmpty(strP)) {
            String strJ = this.K.J(this.J);
            str = !TextUtils.isEmpty(strJ) ? IronSourceConstants.TYPE_UUID : "";
            z = true;
            strP = strJ;
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!TextUtils.isEmpty(strP)) {
            map.put(td.h1, strP);
            map.put("advertisingIdType", str);
        }
        if (!TextUtils.isEmpty(strA)) {
            z2 = Boolean.parseBoolean(strA);
            map.put("isLimitAdTrackingEnabled", Boolean.valueOf(z2));
        }
        if (z || z2) {
            map.put(M, a(strA));
        }
        map.put(td.p0, h());
        if (!TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        String connectionType = IronSourceUtils.getConnectionType(this.J);
        if (!TextUtils.isEmpty(connectionType)) {
            map.put("connectionType", connectionType);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("deviceOEM", strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("deviceModel", strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put("mobileCarrier", strN);
        }
        map.put("internalFreeMemory", Long.valueOf(k()));
        map.put("externalFreeMemory", Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP2 = p();
        if (!TextUtils.isEmpty(strP2)) {
            map.put("pluginType", strP2);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.K.f());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put("jb", strValueOf);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            map.put("mt", strM);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.J));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put("firstSession", strValueOf2);
        }
        String strS = this.K.s(this.J);
        if (!TextUtils.isEmpty(strS)) {
            map.put("auid", strS);
        }
        map.put("mcc", Integer.valueOf(p2.b(this.J)));
        map.put("mnc", Integer.valueOf(p2.c(this.J)));
        String strN2 = this.K.n(this.J);
        if (!TextUtils.isEmpty(strN2)) {
            map.put("icc", strN2);
        }
        String strB2 = this.K.b();
        if (!TextUtils.isEmpty(strB2)) {
            map.put("tz", strB2);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private boolean a(int i) {
        return i <= O && i >= P && i % 15 == 0;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    private String c() {
        return p.p().q();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.J.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f1788a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    private String e() {
        try {
            return this.J.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    private String h() {
        return t2.e;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f1788a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    private String m() {
        return p.p().s();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.J.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f1788a + ":getMobileCarrier()", e);
            return "";
        }
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    private String r() {
        return IronSourceUtils.getSDKVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            f5.a().a(a());
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }
}
