package com.json;

import com.json.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ea {

    /* renamed from: a, reason: collision with root package name */
    private String f1755a;

    public ea(String str) {
        this.f1755a = str;
    }

    private o7 a() throws Exception {
        o7 o7Var = new o7(this.f1755a, "metadata.json");
        if (!o7Var.exists()) {
            a(o7Var);
        }
        return o7Var;
    }

    private void a(o7 o7Var) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), o7Var.getPath());
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(String str) throws Exception {
        JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    boolean a(ArrayList<o7> arrayList) throws Exception {
        Iterator<o7> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            jSONObjectB.putOpt(str, jSONObject);
        }
        return a(jSONObjectB);
    }
}
