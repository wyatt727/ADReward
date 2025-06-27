package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ke {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f598a;
    private final JSONObject b;
    protected final JSONObject d;
    private final Map g;
    private final ql h;
    protected final ql i;
    private String j;
    private String k;
    private final Object c = new Object();
    protected final Object f = new Object();

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + q() + AbstractJsonLexerKt.END_OBJ;
    }

    public ke(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject != null) {
            this.f598a = kVar;
            if (((Boolean) kVar.a(oj.q6)).booleanValue()) {
                this.h = new ql(jSONObject2);
                this.i = new ql(jSONObject);
                this.b = null;
                this.d = null;
            } else {
                this.b = jSONObject2;
                this.d = jSONObject;
                this.h = null;
                this.i = null;
            }
            this.g = map;
            return;
        }
        throw new IllegalArgumentException("No ad object specified");
    }

    public JSONObject g() {
        JSONObject jSONObject;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.c) {
            jSONObject = this.b;
        }
        return jSONObject;
    }

    protected JSONObject a() {
        JSONObject jSONObject;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f) {
            jSONObject = this.d;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b(MintegralConstants.AD_UNIT_ID, "");
    }

    public String b() {
        return a("class", (String) null);
    }

    protected Boolean a(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f) {
            bool2 = JsonUtils.getBoolean(this.d, str, bool);
        }
        return bool2;
    }

    public String c() {
        return a("name", (String) null);
    }

    public String k() {
        return c().split("_")[0];
    }

    public boolean q() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public Boolean n() {
        String str = this.f598a.g0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", Boolean.FALSE);
        }
        return b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f598a.g0().getExtraParameters().get("aru");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("aru")) {
            return a("aru", Boolean.FALSE);
        }
        return b("aru", (Boolean) null);
    }

    public Boolean p() {
        String str = this.f598a.g0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("dns")) {
            return a("dns", Boolean.FALSE);
        }
        return b("dns", (Boolean) null);
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f598a.m0().k();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public Map i() {
        return this.g;
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            ql qlVar = this.i;
            if (qlVar != null) {
                bundle = (Bundle) qlVar.a(new Function() { // from class: com.applovin.impl.ke$$ExternalSyntheticLambda0
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return ke.a((ql) obj);
                    }
                });
            } else {
                bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
            }
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f598a.g0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    protected Boolean b(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.c) {
            bool2 = JsonUtils.getBoolean(this.b, str, bool);
        }
        return bool2;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f598a.a(qe.u7)).intValue()));
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f598a.a(qe.R6)).longValue());
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public String getPlacement() {
        return this.j;
    }

    protected boolean d(String str) {
        boolean zHas;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.c) {
            zHas = this.b.has(str);
        }
        return zHas;
    }

    public String e() {
        return this.k;
    }

    protected boolean c(String str) {
        boolean zHas;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f) {
            zHas = this.d.has(str);
        }
        return zHas;
    }

    protected double a(String str, float f) {
        double d;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, f);
        }
        synchronized (this.f) {
            d = JsonUtils.getDouble(this.d, str, f);
        }
        return d;
    }

    public void g(String str) {
        this.j = str;
    }

    protected float b(String str, float f) {
        float f2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, f);
        }
        synchronized (this.f) {
            f2 = JsonUtils.getFloat(this.d, str, f);
        }
        return f2;
    }

    protected int b(String str, int i) {
        int i2;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str, i);
        }
        synchronized (this.c) {
            i2 = JsonUtils.getInt(this.b, str, i);
        }
        return i2;
    }

    protected Object e(String str) {
        Object objOpt;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.b(str);
        }
        synchronized (this.f) {
            objOpt = this.d.opt(str);
        }
        return objOpt;
    }

    protected int a(String str, int i) {
        int i2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, i);
        }
        synchronized (this.f) {
            i2 = JsonUtils.getInt(this.d, str, i);
        }
        return i2;
    }

    protected void c(String str, int i) {
        ql qlVar = this.i;
        if (qlVar != null) {
            qlVar.b(str, i);
            return;
        }
        synchronized (this.f) {
            JsonUtils.putInt(this.d, str, i);
        }
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.c) {
            jSONArray2 = JsonUtils.getJSONArray(this.b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void f(String str) {
        this.k = str;
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f) {
            jSONArray2 = JsonUtils.getJSONArray(this.d, str, jSONArray);
        }
        return jSONArray2;
    }

    protected long b(String str, long j) {
        long j2;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str, j);
        }
        synchronized (this.c) {
            j2 = JsonUtils.getLong(this.b, str, j);
        }
        return j2;
    }

    protected void c(String str, long j) {
        ql qlVar = this.i;
        if (qlVar != null) {
            qlVar.b(str, j);
            return;
        }
        synchronized (this.f) {
            JsonUtils.putLong(this.d, str, j);
        }
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.f) {
            jSONObject2 = JsonUtils.getJSONObject(this.d, str, jSONObject);
        }
        return jSONObject2;
    }

    protected void c(String str, String str2) {
        ql qlVar = this.i;
        if (qlVar != null) {
            qlVar.b(str, str2);
            return;
        }
        synchronized (this.f) {
            JsonUtils.putString(this.d, str, str2);
        }
    }

    protected long a(String str, long j) {
        long j2;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, j);
        }
        synchronized (this.f) {
            j2 = JsonUtils.getLong(this.d, str, j);
        }
        return j2;
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            ql qlVar = this.h;
            if (qlVar != null) {
                listOptList = qlVar.b(str, Collections.emptyList());
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            ql qlVar2 = this.i;
            if (qlVar2 != null) {
                listOptList2 = qlVar2.b(str, Collections.emptyList());
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    protected String b(String str, String str2) {
        String string;
        ql qlVar = this.h;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.c) {
            string = JsonUtils.getString(this.b, str, str2);
        }
        return string;
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }

    protected String a(String str, String str2) {
        String string;
        ql qlVar = this.i;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f) {
            string = JsonUtils.getString(this.d, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(ql qlVar) {
        return JsonUtils.toBundle(qlVar.a("server_parameters", (JSONObject) null));
    }

    protected void a(String str, Object obj) {
        ql qlVar = this.i;
        if (qlVar != null) {
            qlVar.a(str, obj);
            return;
        }
        synchronized (this.f) {
            JsonUtils.putObject(this.d, str, obj);
        }
    }
}
