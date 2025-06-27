package com.json.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.json.IronSourceAdvId;
import com.json.b6;
import com.json.ca;
import com.json.f5;
import com.json.g8;
import com.json.jb;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.logger.d;
import com.json.mediationsdk.p;
import com.json.p2;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceUtils {
    private static final String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final String DEFAULT_PXL_EVENTS_URL = "default_pxl_events_url";
    private static final String DEFAULT_PXL_TRIGGER_EVENTS = "default_pxl_trigger_events";
    private static final String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final String GENERAL_PROPERTIES = "general_properties";
    private static final String LAST_RESPONSE = "last_response";
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;
    private static final String PROVIDER_PRIORITY = "providerPriority";
    private static final String SDK_VERSION = "7.9.0";
    private static final String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static int serr = 1;
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static String mSessionId = null;
    private static Boolean mFirstSession = null;
    private static IronSourceUtils instance = new IronSourceUtils();

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new d());
        thread.start();
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getBase64Auth(String str, String str2) {
        return "Basic " + Base64.encodeToString((str + ":" + str2).getBytes(), 10);
    }

    static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z);
    }

    @Deprecated
    private static JSONObject getCachedInitResponse(Context context) {
        try {
            return new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        return getCachedInitResponse(context).optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return p2.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return p2.g;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return p2.b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return p2.g;
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            IronLog.NATIVE.error("failed to connection type - exception = " + e);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_URL : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_EVENTS_URL : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_EVENTS_URL : "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_FORMATTER_TYPE : (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? DEFAULT_RV_EVENTS_FORMATTER_TYPE : "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_NON_CONNECTIVITY_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_NON_CONNECTIVITY_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_IN_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_IN_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_OUT_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_OUT_EVENTS : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_TRIGGER_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_TRIGGER_EVENTS : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_TRIGGER_EVENTS : "";
    }

    public static String getDeviceType(Context context) {
        return ca.h().c().r(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!g8.a(context));
        }
        return mFirstSession.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1L;
        }
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong("firstSessionTimestamp", -1L);
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    static int getIntFromSharedPrefs(Context context, String str, int i) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i);
    }

    public static IronSourceAdvId getIronSourceAdvId(Context context) {
        String str;
        b6 b6VarC = ca.h().c();
        if (context == null) {
            return null;
        }
        String strB = p.p().b(context);
        if (TextUtils.isEmpty(strB)) {
            strB = b6VarC.J(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new IronSourceAdvId(strB, str);
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i < list.size() && i2 < list2.size(); i2++) {
                String str2 = list.get(i);
                String str3 = list2.get(i2);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    static long getLongFromSharedPrefs(Context context, String str, long j) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j);
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z, boolean z2, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put("isDemandOnly", 1);
            }
            if (z2 && i != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return f5.a().a("userId");
    }

    public static String getSDKVersion() {
        return "7.9.0";
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        if (mDidCreateSessionID.compareAndSet(false, true)) {
            mSessionId = UUID.randomUUID().toString();
        }
        return mSessionId;
    }

    static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j, String str) {
        return getSHA256(String.format("%s%s%s", Long.valueOf(j), p.p().q(), str));
    }

    public static String getUserIdForNetworks() {
        String strA = f5.a().a("userId");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static boolean isEncryptedResponse() {
        return serr == 1;
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return jb.d(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        return (TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "appKey")) || TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, c.Y1))) ? false : true;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static List<Pair<String, String>> parseJsonToPairList(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    static void saveBooleanToSharedPrefs(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultFormatterTypeByEventType(str), str2);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultEventsUrlByEventType(str), str2);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            }
            editorEdit.putString(getDefaultNonConnectivityEventsByEventType(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            }
            editorEdit.putString(getDefaultOptInEventsByEventType(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            }
            editorEdit.putString(getDefaultOptOutEventsByEventType(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb = new StringBuilder();
                for (int i : iArr) {
                    sb.append(i);
                    sb.append(",");
                }
                string = sb.toString();
            }
            editorEdit.putString(getDefaultTriggerEventsByEventType(str), string);
            editorEdit.apply();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e);
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putLong("firstSessionTimestamp", j);
        editorEdit.apply();
    }

    static void saveIntToSharedPrefs(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(LAST_RESPONSE, str);
        editorEdit.apply();
    }

    static void saveLongToSharedPrefs(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i) {
        serr = i;
    }
}
