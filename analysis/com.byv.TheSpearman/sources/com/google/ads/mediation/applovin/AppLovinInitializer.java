package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class AppLovinInitializer {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    private static final String TAG = "AppLovinInitializer";
    public static final int UNINITIALIZED = 0;
    private static AppLovinInitializer instance;
    private final AppLovinSdkWrapper appLovinSdkWrapper;
    private final HashMap<String, Integer> initializationStatus;
    private final HashMap<String, ArrayList<OnInitializeSuccessListener>> initializerListeners;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InitializationStatus {
    }

    public interface OnInitializeSuccessListener {
        void onInitializeSuccess(String str);
    }

    private AppLovinInitializer() {
        this.initializationStatus = new HashMap<>();
        this.initializerListeners = new HashMap<>();
        this.appLovinSdkWrapper = new AppLovinSdkWrapper();
    }

    AppLovinInitializer(AppLovinSdkWrapper appLovinSdkWrapper) {
        this.initializationStatus = new HashMap<>();
        this.initializerListeners = new HashMap<>();
        this.appLovinSdkWrapper = appLovinSdkWrapper;
    }

    public static AppLovinInitializer getInstance() {
        if (instance == null) {
            instance = new AppLovinInitializer();
        }
        return instance;
    }

    public void initialize(Context context, final String str, OnInitializeSuccessListener onInitializeSuccessListener) {
        if (!this.initializationStatus.containsKey(str)) {
            this.initializationStatus.put(str, 0);
            this.initializerListeners.put(str, new ArrayList<>());
        }
        Integer num = 2;
        if (num.equals(this.initializationStatus.get(str))) {
            onInitializeSuccessListener.onInitializeSuccess(str);
            return;
        }
        this.initializerListeners.get(str).add(onInitializeSuccessListener);
        Integer num2 = 1;
        if (num2.equals(this.initializationStatus.get(str))) {
            return;
        }
        this.initializationStatus.put(str, 1);
        Log.d(TAG, String.format("Attempting to initialize SDK with SDK Key: %s", str));
        AppLovinSdk appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(str, this.appLovinSdkWrapper.getSdkSettings(context), context);
        appLovinSdkWrapper.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdkWrapper.setMediationProvider(AppLovinMediationProvider.ADMOB);
        appLovinSdkWrapper.initializeSdk(new AppLovinSdk.SdkInitializationListener() { // from class: com.google.ads.mediation.applovin.AppLovinInitializer.1
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                AppLovinInitializer.this.initializationStatus.put(str, 2);
                ArrayList arrayList = (ArrayList) AppLovinInitializer.this.initializerListeners.get(str);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((OnInitializeSuccessListener) it.next()).onInitializeSuccess(str);
                    }
                    arrayList.clear();
                }
            }
        });
    }

    public AppLovinSdk retrieveSdk(Bundle bundle, Context context) {
        AppLovinSdk appLovinSdkWrapper;
        String string = bundle != null ? bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY) : null;
        AppLovinSdkSettings sdkSettings = this.appLovinSdkWrapper.getSdkSettings(context);
        if (!TextUtils.isEmpty(string)) {
            appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(string, sdkSettings, context);
        } else {
            appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(sdkSettings, context);
        }
        appLovinSdkWrapper.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdkWrapper.setMediationProvider(AppLovinMediationProvider.ADMOB);
        return appLovinSdkWrapper;
    }
}
