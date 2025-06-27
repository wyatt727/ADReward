package com.json;

import android.text.TextUtils;
import com.json.f7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, t3> f2323a = new LinkedHashMap();
    private final Map<String, t3> b = new LinkedHashMap();
    private final Map<String, t3> c = new LinkedHashMap();

    private void a(f7.e eVar, String str, t3 t3Var) {
        Map<String, t3> mapB;
        if (TextUtils.isEmpty(str) || t3Var == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, t3Var);
    }

    private Map<String, t3> b(f7.e eVar) {
        if (eVar.name().equalsIgnoreCase(f7.e.RewardedVideo.name())) {
            return this.f2323a;
        }
        if (eVar.name().equalsIgnoreCase(f7.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(f7.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public t3 a(f7.e eVar, q8 q8Var) {
        t3 t3Var = new t3(q8Var);
        a(eVar, q8Var.d(), t3Var);
        return t3Var;
    }

    public t3 a(f7.e eVar, String str) {
        Map<String, t3> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    public t3 a(f7.e eVar, String str, Map<String, String> map, wa waVar) {
        t3 t3Var = new t3(str, str, map, waVar);
        a(eVar, str, t3Var);
        return t3Var;
    }

    public Collection<t3> a(f7.e eVar) {
        Map<String, t3> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public void b(f7.e eVar, String str) {
        Map<String, t3> mapB;
        t3 t3VarRemove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (t3VarRemove = mapB.remove(str)) == null) {
            return;
        }
        t3VarRemove.a();
    }
}
