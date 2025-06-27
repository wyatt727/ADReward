package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.ke;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.zl;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f687a;
    private final t b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final JSONArray d = new JSONArray();
    private final LinkedHashMap e = new LinkedHashMap();
    private final Object f = new Object();
    private List g;

    public e(k kVar) {
        this.f687a = kVar;
        this.b = kVar.L();
    }

    public JSONArray b() {
        JSONArray jSONArray;
        synchronized (this.f) {
            jSONArray = this.d;
        }
        return jSONArray;
    }

    public boolean c() {
        return this.c.get();
    }

    void a(ke keVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f) {
            z = !a(keVar);
            if (z) {
                this.e.put(keVar.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", keVar.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.d.put(jSONObject);
            }
        }
        if (z) {
            this.f687a.a(keVar);
            this.f687a.S().processAdapterInitializationPostback(keVar, j, initializationStatus, str);
            this.f687a.o().a(initializationStatus, keVar.b());
        }
    }

    public void a(ke keVar, Activity activity) {
        a(keVar, activity, null);
    }

    public void a(ke keVar, Activity activity, Runnable runnable) {
        List list;
        if (this.f687a.n0().c() && (list = this.g) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    keVar = null;
                    break;
                }
                ke keVar2 = (ke) it.next();
                if (keVar2.b().equals(keVar.b())) {
                    keVar = keVar2;
                    break;
                }
            }
        }
        if (keVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g gVarA = this.f687a.O().a(keVar);
        if (gVarA == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + keVar);
        }
        gVarA.a(MaxAdapterParametersImpl.a(keVar), activity, runnable);
    }

    boolean a(ke keVar) {
        boolean zContainsKey;
        synchronized (this.f) {
            zContainsKey = this.e.containsKey(keVar.b());
        }
        return zContainsKey;
    }

    public void a(Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            String str = (String) this.f687a.a(qj.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List listA = a(JsonUtils.getJSONArray(jSONObject, this.f687a.n0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.g = listA;
                    long j = StringUtils.parseLong(this.f687a.g0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    zl zlVar = new zl(listA, activity, this.f687a);
                    if (j > 0) {
                        this.f687a.l0().a(zlVar, sm.b.MEDIATION, j);
                    } else {
                        this.f687a.l0().a(zlVar);
                    }
                } catch (JSONException e) {
                    if (t.a()) {
                        this.b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    public LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f) {
            linkedHashMap = this.e;
        }
        return linkedHashMap;
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new ke(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f687a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f) {
            this.e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f687a.o().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
