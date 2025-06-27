package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pj {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f784a;
    protected final Context b;
    protected final SharedPreferences c;
    private final Map d = new HashMap();
    private final Object e = new Object();

    public pj(com.applovin.impl.sdk.k kVar) {
        this.f784a = kVar;
        Context contextK = com.applovin.impl.sdk.k.k();
        this.b = contextK;
        this.c = contextK.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(oj.class.getName());
            Class.forName(qe.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public List c(oj ojVar) {
        return CollectionUtils.explode((String) a(ojVar));
    }

    public List b(oj ojVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(ojVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    private String b() {
        return "com.applovin.sdk." + zp.e(this.f784a.d0()) + ".";
    }

    public void e() {
        String strB = b();
        synchronized (this.e) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            for (oj ojVar : oj.c()) {
                Object obj = this.d.get(ojVar.b());
                if (obj != null) {
                    this.f784a.a(strB + ojVar.b(), obj, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public void d() {
        String strB = b();
        synchronized (this.e) {
            for (oj ojVar : oj.c()) {
                try {
                    Object objA = this.f784a.a(strB + ojVar.b(), null, ojVar.a().getClass(), this.c);
                    if (objA != null) {
                        this.d.put(ojVar.b(), objA);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.t.c("SettingsManager", "Unable to load \"" + ojVar.b() + "\"", th);
                    this.f784a.B().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.f784a.a(this.c);
    }

    public Object a(oj ojVar) {
        if (ojVar != null) {
            synchronized (this.e) {
                Object obj = this.d.get(ojVar.b());
                if (obj == null) {
                    return ojVar.a();
                }
                return ojVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public boolean c() {
        return this.f784a.g0().isVerboseLoggingEnabled() || ((Boolean) a(oj.l)).booleanValue();
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, oj.K.b(), Boolean.FALSE).booleanValue();
            HashMap map = zBooleanValue ? new HashMap() : null;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && next.length() > 0) {
                    try {
                        try {
                            oj ojVarA = a(next, (oj) null);
                            if (ojVarA != null) {
                                Object objA = zBooleanValue ? a(ojVarA) : null;
                                Object objA2 = a(next, jSONObject, ojVarA.a());
                                this.d.put(ojVarA.b(), objA2);
                                if (ojVarA == oj.E5) {
                                    this.d.put(oj.F5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objA2.equals(objA)) {
                                    map.put(ojVarA, objA);
                                }
                            }
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.t.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f784a.B().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    } catch (JSONException e) {
                        com.applovin.impl.sdk.t.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        this.f784a.B().a("SettingsManager", "loadSettingsException", e);
                    }
                }
            }
            if (zBooleanValue && map.size() > 0) {
                lc lcVar = new lc();
                lcVar.a("========== UPDATED SETTINGS ==========");
                for (oj ojVar : map.keySet()) {
                    lcVar.a(ojVar.b(), a(ojVar) + " (" + map.get(ojVar) + ")");
                }
                lcVar.a("========== END ==========");
                this.f784a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f784a.L().a("SettingsManager", lcVar.toString());
                }
            }
        }
    }

    public oj a(String str, oj ojVar) {
        synchronized (this.e) {
            for (oj ojVar2 : oj.c()) {
                if (ojVar2.b().equals(str)) {
                    return ojVar2;
                }
            }
            return ojVar;
        }
    }

    public void a(oj ojVar, Object obj) {
        if (ojVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(ojVar.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }
}
