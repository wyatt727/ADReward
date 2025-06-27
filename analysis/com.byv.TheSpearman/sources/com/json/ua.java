package com.json;

import android.text.TextUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ua {
    private static final int e = 0;
    private static final String f = "adapterName";

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<va> f2332a = new ArrayList<>();
    private va b;
    private r0 c;
    private JSONObject d;

    public ua(r0 r0Var) {
        this.c = r0Var;
    }

    public va a() {
        Iterator<va> it = this.f2332a.iterator();
        while (it.hasNext()) {
            va next = it.next();
            if (next.getIsDefault()) {
                return next;
            }
        }
        return this.b;
    }

    public va a(String str) {
        Iterator<va> it = this.f2332a.iterator();
        while (it.hasNext()) {
            va next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(va vaVar) {
        if (vaVar != null) {
            this.f2332a.add(vaVar);
            if (this.b == null || vaVar.isPlacementId(0)) {
                this.b = vaVar;
            }
        }
    }

    public void a(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public String b() {
        JSONObject jSONObject = this.d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString(f))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.d.optString(f);
    }

    public r0 c() {
        return this.c;
    }
}
