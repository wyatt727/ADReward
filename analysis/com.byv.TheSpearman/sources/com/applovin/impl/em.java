package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.vj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class em extends xl {
    private static JSONObject m;
    private static final Object n = new Object();
    private static final Map o = Collections.synchronizedMap(new HashMap());
    private final String h;
    private final MaxAdFormat i;
    private final Map j;
    private final Context k;
    private final b l;

    public interface b {
        void a(JSONArray jSONArray);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (n) {
                jSONArray = JsonUtils.getJSONArray(m, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (o.size() > 0) {
                    a(jSONArray, m);
                    return;
                } else {
                    a(jSONArray.length(), jSONArray, m);
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f1179a.a(qj.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (o.size() > 0) {
                    a(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2.length(), jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
            this.f1179a.B().a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
            this.f1179a.B().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f1179a.B().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    public em(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.h = str;
        this.i = maxAdFormat;
        this.j = map;
        this.k = context;
        this.l = bVar;
    }

    private void a(final wj wjVar, final vj.a aVar) {
        if (wjVar.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.em$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(wjVar, aVar);
                }
            });
        } else {
            this.f1179a.S().collectSignal(this.h, this.i, wjVar, this.k, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(wj wjVar, vj.a aVar) {
        this.f1179a.S().collectSignal(this.h, this.i, wjVar, this.k, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements vj.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f392a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection f;
        private final com.applovin.impl.sdk.k g;
        private final com.applovin.impl.sdk.t h;

        private c(int i, b bVar, com.applovin.impl.sdk.k kVar) {
            this.c = i;
            this.f392a = bVar;
            this.g = kVar;
            this.h = kVar.L();
            this.b = new Object();
            this.f = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList<vj> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.f);
            }
            JSONArray jSONArray = new JSONArray();
            for (vj vjVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    wj wjVarF = vjVar.f();
                    jSONObject.put("name", wjVarF.c());
                    jSONObject.put("class", wjVarF.b());
                    jSONObject.put("adapter_version", vjVar.a());
                    jSONObject.put("sdk_version", vjVar.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = vjVar.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", vjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", vjVar.b());
                    jSONObject2.put("is_cached", vjVar.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.t.a()) {
                        this.h.a("TaskCollectSignals", "Collected signal from " + wjVarF);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.h.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.g.B().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f392a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.vj.a
        public void a(vj vjVar) throws JSONException {
            boolean z;
            synchronized (this.b) {
                this.f.add(vjVar);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (zp.h() && ((Boolean) this.g.a(oj.Q)).booleanValue()) {
                    this.g.l0().a((xl) new kn(this.g, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.em$c$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            this.f$0.a();
                        }
                    }), sm.b.MEDIATION);
                } else {
                    a();
                }
            }
        }
    }

    private void a(int i, JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(i, this.l, this.f1179a);
        this.f1179a.l0().a(new kn(this.f1179a, "timeoutCollectSignal", cVar), sm.b.TIMEOUT, ((Long) this.f1179a.a(qe.P6)).longValue());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(new wj(this.j, jSONArray.getJSONObject(i2), jSONObject, this.f1179a), cVar);
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    o.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            com.applovin.impl.sdk.t.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            kVar.B().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) o.get(this.h);
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            if (((Boolean) this.f1179a.a(qe.Q6)).booleanValue()) {
                a(jSONArray2.length(), jSONArray2, jSONObject);
                return;
            } else {
                a(set.size(), jSONArray2, jSONObject);
                return;
            }
        }
        a("No signal providers found for ad unit: " + this.h, (Throwable) null);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "No signals collected: " + str, th);
        }
        b bVar = this.l;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (n) {
            m = jSONObject;
        }
    }
}
