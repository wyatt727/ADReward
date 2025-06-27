package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t7;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.json.t2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", t2.h.f0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f906a;
    private final Map b;
    private final AtomicBoolean c = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f906a = kVar;
        if (((Boolean) kVar.a(oj.S0)).booleanValue()) {
            this.b = JsonUtils.toStringObjectMap((String) kVar.a(qj.C, JsonUtils.EMPTY_JSON));
        } else {
            this.b = new HashMap();
            kVar.b(qj.C, JsonUtils.EMPTY_JSON);
        }
    }

    private String b() {
        return ((String) this.f906a.a(oj.M0)) + "4.0/pix";
    }

    private void c() {
        if (((Boolean) this.f906a.a(oj.S0)).booleanValue()) {
            this.f906a.b(qj.C, CollectionUtils.toJsonString(this.b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.c.compareAndSet(false, true)) {
            this.f906a.C().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.b.remove(str);
            c();
            return;
        }
        List listC = this.f906a.c(oj.R0);
        if (zp.a(obj, listC, this.f906a)) {
            this.b.put(str, zp.a(obj, this.f906a));
            c();
            return;
        }
        t.h("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + listC);
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f906a.L();
        if (t.a()) {
            this.f906a.L().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        t7 t7Var = new t7(str, new HashMap(), this.b);
        Map mapA = a(t7Var, true);
        Map mapD = t7Var.d();
        if (((Boolean) this.f906a.a(oj.B5)).booleanValue() || ((Boolean) this.f906a.a(oj.w5)).booleanValue()) {
            mapD.putAll(mapA);
            mapA = null;
        }
        this.f906a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(mapA).c(mapD).a(a(t7Var, (Map) null)).c(((Boolean) this.f906a.a(oj.L5)).booleanValue()).a(((Boolean) this.f906a.a(oj.j5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            t.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f906a.B().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f906a.L();
        if (t.a()) {
            this.f906a.L().a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final t7 t7Var = new t7(str, map, this.b);
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f906a.l0().a((xl) new kn(this.f906a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(t7Var, map2, zContains);
                }
            }), sm.b.OTHER);
        } catch (Throwable th) {
            this.f906a.L();
            if (t.a()) {
                this.f906a.L().a("AppLovinEventService", "Unable to track event: " + t7Var, th);
            }
            this.f906a.B().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private Map a(t7 t7Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean zContains = this.f906a.c(oj.Q0).contains(t7Var.c());
        map2.put("AppLovin-Event", zContains ? t7Var.c() : "postinstall");
        if (!zContains) {
            map2.put("AppLovin-Sub-Event", t7Var.c());
        }
        return map2;
    }

    private Map a(t7 t7Var, boolean z) {
        Map mapA;
        boolean zContains = this.f906a.c(oj.Q0).contains(t7Var.c());
        if (this.f906a.y() != null) {
            mapA = this.f906a.y().a(null, z, false);
        } else {
            mapA = this.f906a.x().a(null, z, false);
        }
        mapA.put(NotificationCompat.CATEGORY_EVENT, zContains ? t7Var.c() : "postinstall");
        mapA.put("event_id", t7Var.b());
        mapA.put("ts", Long.toString(t7Var.a()));
        if (!zContains) {
            mapA.put("sub_event", t7Var.c());
        }
        return zp.a(mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t7 t7Var, Map map, boolean z) {
        Map mapA = a(t7Var, false);
        Map mapD = t7Var.d();
        if (((Boolean) this.f906a.a(oj.B5)).booleanValue() || ((Boolean) this.f906a.a(oj.w5)).booleanValue()) {
            mapD.putAll(mapA);
            mapA = null;
        }
        this.f906a.Z().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(mapA).c(mapD).a(a(t7Var, map)).c(((Boolean) this.f906a.a(oj.L5)).booleanValue()).a(((Boolean) this.f906a.a(oj.j5)).booleanValue()).d(z).a(qi.a.a(((Integer) this.f906a.a(oj.t5)).intValue())).a());
    }

    private String a() {
        return ((String) this.f906a.a(oj.N0)) + "4.0/pix";
    }
}
