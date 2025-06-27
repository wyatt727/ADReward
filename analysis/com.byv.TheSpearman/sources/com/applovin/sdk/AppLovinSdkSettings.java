package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.AppLovinSdkSettingsBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings extends AppLovinSdkSettingsBase {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1280a;
    private boolean b;
    private String g;
    private String h;
    private k l;
    private String m;
    private boolean f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();
    private List i = Collections.emptyList();
    private List j = Collections.emptyList();
    private final Map k = Collections.synchronizedMap(new HashMap());
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;

    public AppLovinSdkSettings(Context context) {
        this.m = "";
        if (context == null) {
            t.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextD = zp.d(context);
        this.f1280a = zp.k(contextD);
        this.backingConsentFlowSettings = f4.a(contextD);
        this.m = contextD.getPackageName();
        a(contextD);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = zp.a(identifier, context, (k) null);
        this.k.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.l = kVar;
        if (StringUtils.isValidString(this.g)) {
            kVar.n0().a(Arrays.asList(this.g.split(",")));
            this.g = null;
        }
        if (this.h != null) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinSdkSettings", "Setting user id: " + this.h);
            }
            kVar.t0().a(this.h);
            this.h = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.k) {
            map = CollectionUtils.map(this.k);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.j;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.UNIFIED);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public AppLovinTermsFlowSettings getTermsFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.TERMS);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public List<String> getTestDeviceAdvertisingIds() {
        return this.i;
    }

    public String getUserIdentifier() {
        k kVar = this.l;
        return kVar == null ? this.h : kVar.t0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.e;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f1280a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        t.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.c == z) {
            return;
        }
        this.c = z;
        k kVar = this.l;
        if (kVar == null) {
            return;
        }
        if (z) {
            kVar.v().l();
        } else {
            kVar.v().k();
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z) {
        t.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
        this.d = z;
    }

    public void setExtraParameter(String str, String str2) {
        t.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.l == null) {
                this.g = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.l.n0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.l.n0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.m.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            t.a(Boolean.parseBoolean(strTrim));
        }
        this.k.put(str, strTrim);
    }

    @Deprecated
    public void setInitializationAdUnitIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list == null) {
            this.j = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    t.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.j = arrayList;
    }

    public void setLocationCollectionEnabled(boolean z) {
        t.e("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z + ")");
        this.e = z;
    }

    public void setMuted(boolean z) {
        t.e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        t.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f = z;
    }

    @Deprecated
    public void setTestDeviceAdvertisingIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list == null) {
            this.i = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str == null || str.length() != 36) {
                t.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.i = arrayList;
    }

    public void setUserIdentifier(String str) {
        t.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        k kVar = this.l;
        if (kVar == null) {
            this.h = str;
            return;
        }
        kVar.L();
        if (t.a()) {
            this.l.L().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.l.t0().a(str);
    }

    public void setVerboseLogging(boolean z) {
        t.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!zp.k()) {
            this.f1280a = z;
            return;
        }
        t.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (zp.k(null) != z) {
            t.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f1280a + ", muted=" + this.b + ", testDeviceAdvertisingIds=" + this.i.toString() + ", initializationAdUnitIds=" + this.j.toString() + ", creativeDebuggerEnabled=" + this.c + ", exceptionHandlerEnabled=" + this.d + ", locationCollectionEnabled=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
