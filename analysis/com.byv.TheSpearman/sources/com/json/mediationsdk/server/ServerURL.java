package com.json.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.json.b6;
import com.json.ca;
import com.json.f8;
import com.json.h4;
import com.json.i5;
import com.json.m9;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.metadata.a;
import com.json.mediationsdk.utils.IronSourceAES;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.p0;
import com.json.p2;
import com.json.t;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ServerURL {
    private static final String AMPERSAND = "&";
    private static final String ANDROID = "android";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String APPLICATION_USER_ID = "applicationUserId";
    private static final String APPLICATION_VERSION = "appVer";
    private static final String AUID = "auid";
    private static String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String BASE_URL_SUFFIX = "?request=";
    private static final String BROWSER_USER_AGENT = "browserUserAgent";
    private static final String BUNDLE_ID = "bundleId";
    private static final String CONNECTION_TYPE = "connType";
    private static final String COPPA = "coppa";
    private static final String DEVICE_LANG = "deviceLang";
    private static final String DEVICE_MAKE = "devMake";
    private static final String DEVICE_MODEL = "devModel";
    private static final String EQUAL = "=";
    private static final String FIRST_SESSION = "fs";
    private static final String GAID = "advId";
    private static final String GOOGLE_FAMILY_SUPPORT = "dff";
    private static final String IMPRESSION = "impression";
    private static final String ISO_COUNTRY_CODE = "icc";
    private static final String IS_DEMAND_ONLY = "isDemandOnly";
    private static final String MEDIATION_TYPE = "mt";
    private static final String MOBILE_CARRIER = "mCar";
    private static final String MOBILE_COUNTRY_CODE = "mcc";
    private static final String MOBILE_NETWORK_CODE = "mnc";
    private static final String OS_VERSION = "osVer";
    private static final String PLACEMENT = "placementId";
    private static final String PLATFORM_KEY = "platform";
    private static final String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final String PLUGIN_TYPE = "pluginType";
    private static final String PLUGIN_VERSION = "pluginVersion";
    private static final String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SERR = "serr";
    private static final String TEST_SUITE = "ts";
    private static final String TIME_ZONE_ID = "tz";
    private static final String TIME_ZONE_OFFSET = "tzOff";

    private static String createURLParams(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, C.UTF8_NAME);
        }
        return str;
    }

    private static String getBaseUrl(String str) {
        return BASE_URL_PREFIX + str + BASE_URL_SUFFIX;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z, List<Pair<String, String>> list, boolean z2) throws UnsupportedEncodingException {
        List<String> list2;
        b6 b6VarC = ca.h().c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(PLATFORM_KEY, "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z) {
            arrayList.add(new Pair(REWARDED_VIDEO_MANUAL_MODE, "1"));
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            arrayList.add(new Pair(SERR, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(PLUGIN_TYPE, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(PLUGIN_VERSION, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(PLUGIN_FW_VERSION, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String strB = p0.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            arrayList.add(new Pair(APPLICATION_VERSION, strB));
        }
        arrayList.add(new Pair(OS_VERSION, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(DEVICE_MAKE, Build.MANUFACTURER));
        arrayList.add(new Pair(DEVICE_MODEL, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.getFirstSession(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = m9.b().c();
        if (concurrentHashMapC.containsKey(a.b)) {
            arrayList.add(new Pair(COPPA, concurrentHashMapC.get(a.b).get(0)));
        }
        if (concurrentHashMapC.containsKey(a.f)) {
            String str5 = concurrentHashMapC.get(a.f).get(0);
            if (!TextUtils.isEmpty(str5) && str5.equalsIgnoreCase(a.i)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (concurrentHashMapC.containsKey(a.d)) {
            String str6 = concurrentHashMapC.get(a.d).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(a.g)) {
                arrayList.add(new Pair(GOOGLE_FAMILY_SUPPORT, "1"));
            }
        }
        if (concurrentHashMapC.containsKey(a.e) && (list2 = concurrentHashMapC.get(a.e)) != null) {
            arrayList.add(new Pair(a.e, list2.get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            arrayList.add(new Pair(CONNECTION_TYPE, connectionType));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = b6VarC.s();
        if (strS.length() != 0) {
            arrayList.add(new Pair(BROWSER_USER_AGENT, strS));
        }
        String str7 = null;
        try {
            str7 = b6VarC.b(context) + "-" + b6VarC.F(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str7 != null && str7.length() != 0) {
            arrayList.add(new Pair(DEVICE_LANG, str7));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + p2.b(context)));
        arrayList.add(new Pair("mnc", "" + p2.c(context)));
        String strN = b6VarC.n(context);
        if (!TextUtils.isEmpty(strN)) {
            arrayList.add(new Pair("icc", strN));
        }
        String strJ = b6VarC.j(context);
        if (!TextUtils.isEmpty(strJ)) {
            arrayList.add(new Pair("mCar", strJ));
        }
        String strB2 = b6VarC.b();
        if (!TextUtils.isEmpty(strB2)) {
            arrayList.add(new Pair("tz", strB2));
        }
        arrayList.add(new Pair("tzOff", "" + b6VarC.p()));
        String strS2 = b6VarC.s(context);
        if (!TextUtils.isEmpty(strS2)) {
            arrayList.add(new Pair("auid", strS2));
        }
        if (z2) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(i5.V, String.valueOf(t.a())));
        arrayList.addAll(IronSourceUtils.parseJsonToPairList(new f8().a()));
        return getBaseUrl(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(h4.b().c(), createURLParams(arrayList)), C.UTF8_NAME);
    }

    public static String getRequestURL(String str, boolean z, int i) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z)));
        arrayList.add(new Pair("placementId", Integer.toString(i)));
        return str + "&" + createURLParams(arrayList);
    }

    private static void setBaseUrlPrefix(String str) {
        BASE_URL_PREFIX = str;
    }
}
