package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.v;
import com.apm.insight.l.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected CrashType f124a;
    protected Context b;
    protected ICommonParams c = com.apm.insight.i.a().c();
    protected b d;
    protected d e;

    public interface a {
        com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar, boolean z);

        void a(Throwable th);
    }

    c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f124a = crashType;
        this.b = context;
        this.d = bVar;
        this.e = dVar;
    }

    private void i(com.apm.insight.entity.a aVar) {
        List<AttachUserData> listA = com.apm.insight.i.b().a(this.f124a);
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = aVar.h().optJSONObject("custom");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            aVar.a("custom", jSONObjectOptJSONObject);
        }
        if (listA != null) {
            for (int i = 0; i < listA.size(); i++) {
                try {
                    AttachUserData attachUserData = listA.get(i);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f124a));
                    map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                } catch (Throwable th) {
                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th);
                }
            }
        }
        try {
            jSONObjectOptJSONObject.put("fd_count", com.apm.insight.l.h.a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> listB = com.apm.insight.i.b().b(this.f124a);
        if (listB != null) {
            JSONObject jSONObjectOptJSONObject2 = aVar.h().optJSONObject("custom_long");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
                aVar.a("custom_long", jSONObjectOptJSONObject2);
            }
            for (int i2 = 0; i2 < listB.size(); i2++) {
                try {
                    AttachUserData attachUserData2 = listB.get(i2);
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f124a));
                    map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                } catch (Throwable th2) {
                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i == 0) {
            b(aVar);
        } else if (i == 1) {
            c(aVar);
            i(aVar);
        } else if (i == 2) {
            e(aVar);
        } else if (i == 4) {
            f(aVar);
        } else if (i == 5) {
            d(aVar);
        }
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, a aVar2, boolean z) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVarA = aVar;
        for (int i = 0; i < b(); i++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVarA = aVar2.a(i, aVarA);
                } catch (Throwable th) {
                    aVar2.a(th);
                }
            }
            try {
                aVarA = a(i, aVarA);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != b() - 1) {
                        z2 = false;
                    }
                    aVarA = aVar2.a(i, aVarA, z2);
                } catch (Throwable th3) {
                    aVar2.a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar.c(aVarA.h());
                    } else {
                        aVar = aVarA;
                    }
                    aVarA = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    protected boolean a() {
        return false;
    }

    public int b() {
        return 6;
    }

    public com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) throws JSONException {
        aVar.a(com.apm.insight.i.p(), com.apm.insight.i.q());
        if (com.apm.insight.i.m()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + v.a(th), 0);
                aVar.a(map);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.i.o());
        aVar.a("process_name", com.apm.insight.l.a.c(com.apm.insight.i.g()));
        return aVar;
    }

    public com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) throws JSONException {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.i.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.i.j());
        if (c() && (bVar = this.d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + v.a(th)));
            } catch (Throwable unused) {
            }
        }
        String strK = com.apm.insight.i.k();
        if (strK != null) {
            aVar.a("business", (Object) strK);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a(this.b)));
        return aVar;
    }

    protected boolean c() {
        return true;
    }

    public com.apm.insight.entity.a d(com.apm.insight.entity.a aVar) {
        if (d()) {
            aVar.b(w.a(this.b));
        }
        return aVar;
    }

    protected boolean d() {
        return true;
    }

    public com.apm.insight.entity.a e(com.apm.insight.entity.a aVar) throws JSONException {
        d dVar = this.e;
        aVar.a("battery", Integer.valueOf(dVar == null ? 0 : dVar.a()));
        aVar.c(com.apm.insight.i.b().a());
        return aVar;
    }

    public com.apm.insight.entity.a f(com.apm.insight.entity.a aVar) {
        if (a()) {
            h(aVar);
        }
        return aVar;
    }

    void g(com.apm.insight.entity.a aVar) {
    }

    protected void h(com.apm.insight.entity.a aVar) {
    }
}
