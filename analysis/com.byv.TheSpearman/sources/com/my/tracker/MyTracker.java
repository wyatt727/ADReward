package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.a1;
import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.h0;
import com.my.tracker.obfuscated.z0;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MyTracker {
    public static final String VERSION = "3.1.2";

    /* renamed from: a, reason: collision with root package name */
    private static final List<MyTrackerPluginConfig> f4201a = Collections.synchronizedList(new ArrayList());
    private static volatile h0 b;

    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    public interface FlushListener {
        void onResult(boolean z);
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final a1 f4202a;
        static final MyTrackerParams b;
        static final MyTrackerConfig c;

        static {
            a1 a1VarT = a1.t();
            f4202a = a1VarT;
            c = MyTrackerConfig.newConfig(a1VarT);
            b = a1VarT.j();
        }
    }

    private MyTracker() {
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f4201a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a();
        }
    }

    public static void flush(FlushListener flushListener) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(flushListener);
        }
    }

    public static String getInstanceId(Context context) {
        return b1.a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return a.c;
    }

    public static MyTrackerParams getTrackerParams() {
        return a.b;
    }

    public static String handleDeeplink(Intent intent) {
        h0 h0Var = b;
        if (h0Var != null) {
            return h0Var.a(intent);
        }
        z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            z0.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (b != null) {
            z0.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            if (b != null) {
                z0.c("MyTracker has already been initialized");
                return;
            }
            a1 a1Var = a.f4202a;
            ArrayList arrayList = new ArrayList(f4201a);
            h0 h0VarA = h0.a(str, a1Var, application);
            h0VarA.a(arrayList);
            b = h0VarA;
        }
    }

    public static boolean isDebugMode() {
        return z0.a();
    }

    public static void onActivityResult(int i, Intent intent) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        a.f4202a.a(attributionListener, handler);
    }

    public static void setDebugMode(boolean z) {
        z0.a(z);
    }

    public static void trackAdEvent(AdEvent adEvent) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(str, map);
        }
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackInviteEvent(Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(map);
        }
    }

    public static void trackLaunchManually(Activity activity) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(i, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.b(map);
        }
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(str, str2, map);
        }
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        h0 h0Var = b;
        if (h0Var == null) {
            z0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            h0Var.b(str, str2, map);
        }
    }
}
