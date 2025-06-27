package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ba {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f291a;
    private final Map b = new HashMap();

    public ba(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f291a = kVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        f();
    }

    public void b() {
        synchronized (this.b) {
            Iterator it = aa.a().iterator();
            while (it.hasNext()) {
                this.b.remove(((aa) it.next()).b());
            }
            f();
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.b) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.b.entrySet()) {
                JsonUtils.putLong(jSONObject, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
            }
        }
        return jSONObject;
    }

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f291a.a(qj.z, JsonUtils.EMPTY_JSON));
            synchronized (this.b) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        this.b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f291a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f291a.L().a("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    private void f() {
        this.f291a.l0().a(new Runnable() { // from class: com.applovin.impl.ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        }, sm.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            this.f291a.b(qj.z, c().toString());
        } catch (Throwable th) {
            this.f291a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f291a.L().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    public long c(aa aaVar) {
        return a(aaVar, 1L);
    }

    public long b(aa aaVar) {
        long jLongValue;
        synchronized (this.b) {
            Long l = (Long) this.b.get(aaVar.b());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue();
        }
        return jLongValue;
    }

    public void a(aa aaVar) {
        synchronized (this.b) {
            this.b.remove(aaVar.b());
        }
        f();
    }

    long a(aa aaVar, long j) {
        long jLongValue;
        synchronized (this.b) {
            Long l = (Long) this.b.get(aaVar.b());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue() + j;
            this.b.put(aaVar.b(), Long.valueOf(jLongValue));
        }
        f();
        return jLongValue;
    }

    public void b(aa aaVar, long j) {
        synchronized (this.b) {
            this.b.put(aaVar.b(), Long.valueOf(j));
        }
        f();
    }
}
