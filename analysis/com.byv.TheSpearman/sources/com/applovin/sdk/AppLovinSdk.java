package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t0;
import com.applovin.impl.ve;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final k coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static class a extends AppLovinSdkSettings {
        a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(k kVar) {
        this.coreSdk = kVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (t0.a(context).a("applovin.sdk.key", (String) null) != null) {
            return getInstance(new a(context), context);
        }
        synchronized (instanceLock) {
            if (instance == null) {
                k kVar = new k(context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(kVar);
                kVar.a(appLovinSdk2);
                instance = appLovinSdk2;
            }
            appLovinSdk = instance;
        }
        return appLovinSdk;
    }

    private static Collection<AppLovinSdk> getInstances() {
        Collection<AppLovinSdk> collectionValues;
        AppLovinSdk appLovinSdk = instance;
        if (appLovinSdk != null) {
            return Arrays.asList(appLovinSdk);
        }
        synchronized (sdkInstancesLock) {
            collectionValues = sdkInstances.values();
        }
        return collectionValues;
    }

    private static String getVersion() {
        return "12.5.0";
    }

    private static int getVersionCode() {
        return 12050099;
    }

    private void reinitialize(Boolean bool, Boolean bool2, Boolean bool3) {
        this.coreSdk.S0();
        this.coreSdk.P0();
        if (bool != null) {
            this.coreSdk.L();
            if (t.a()) {
                this.coreSdk.L().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.L();
            if (t.a()) {
                this.coreSdk.L().d(TAG, "Toggled 'aru' to " + bool2);
            }
            getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
        }
        if (bool3 != null) {
            this.coreSdk.L();
            if (t.a()) {
                this.coreSdk.L().d(TAG, "Toggled 'dns' to " + bool3);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            Iterator<AppLovinSdk> it = getInstances().iterator();
            while (it.hasNext()) {
                it.next().reinitialize(bool, bool2, bool3);
            }
        }
    }

    public k a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.i();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayA = ve.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i = 0; i < jSONArrayA.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayA, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.n();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.q();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.C();
    }

    public String getMediationProvider() {
        return this.coreSdk.Q();
    }

    @Deprecated
    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.a0();
    }

    public String getSdkKey() {
        return this.coreSdk.d0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.g0();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.j0();
    }

    @Deprecated
    public String getUserIdentifier() {
        return this.coreSdk.q0();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.r0();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.s0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    @Deprecated
    public void initializeSdk() {
    }

    public boolean isInitialized() {
        return this.coreSdk.y0();
    }

    @Deprecated
    public void setMediationProvider(String str) {
        this.coreSdk.e(str);
    }

    @Deprecated
    public void setPluginVersion(String str) {
        this.coreSdk.f(str);
    }

    @Deprecated
    public void setUserIdentifier(String str) {
        this.coreSdk.g(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.W0();
    }

    public void showMediationDebugger() {
        this.coreSdk.X0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.z0() + AbstractJsonLexerKt.END_OBJ;
    }

    @Deprecated
    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    @Deprecated
    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    @Deprecated
    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk appLovinSdk = getInstance(context);
            if (appLovinSdk != null) {
                appLovinSdk.initializeSdk(sdkInitializationListener);
                return;
            } else {
                t.h(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
                return;
            }
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Deprecated
    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(t0.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Deprecated
    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        AppLovinSdk appLovinSdk;
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        }
        if (context != null) {
            synchronized (instanceLock) {
                AppLovinSdk appLovinSdk2 = instance;
                if (appLovinSdk2 != null && str.equals(appLovinSdk2.getSdkKey())) {
                    return instance;
                }
                synchronized (sdkInstancesLock) {
                    Map<String, AppLovinSdk> map = sdkInstances;
                    if (map.containsKey(str)) {
                        appLovinSdk = map.get(str);
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = File.separator;
                            if (str.contains(str2)) {
                                t.h(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                                if (!map.isEmpty()) {
                                    return map.values().iterator().next();
                                }
                                str = str.replace(str2, "");
                            }
                        }
                        k kVar = new k(context);
                        kVar.a(str, appLovinSdkSettings);
                        AppLovinSdk appLovinSdk3 = new AppLovinSdk(kVar);
                        kVar.a(appLovinSdk3);
                        appLovinSdkSettings.attachAppLovinSdk(kVar);
                        map.put(str, appLovinSdk3);
                        appLovinSdk = appLovinSdk3;
                    }
                    return appLovinSdk;
                }
            }
        }
        throw new IllegalArgumentException("No context specified");
    }
}
