package com.mbridge.msdk.foundation.db.a;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.same.a.b;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ReplaceTempDaoMiddle.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f2782a;
    private m b;

    private a() {
        this.f2782a = new b(1000);
        try {
            m mVarA = m.a(h.a(c.m().c()));
            this.b = mVarA;
            a(mVarA.a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject, final boolean z) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            final b bVar = new b(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f2782a.a(next, jSONObjectOptJSONObject);
                bVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.db.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!z || a.this.b == null) {
                        return;
                    }
                    for (String str : bVar.a()) {
                        a.this.b.a(str, a.this.f2782a.b(str));
                    }
                }
            });
        }
    }

    public static a a() {
        return C0265a.f2784a;
    }

    public final JSONArray b() {
        return new JSONArray((Collection) this.f2782a.a());
    }

    public final JSONObject a(String str) {
        m mVar;
        JSONObject jSONObjectB = this.f2782a.b(str);
        if (jSONObjectB != null || (mVar = this.b) == null) {
            return jSONObjectB;
        }
        JSONObject jSONObjectA = mVar.a(str);
        if (jSONObjectA != null) {
            this.f2782a.a(str, jSONObjectA);
        }
        return jSONObjectA;
    }

    /* compiled from: ReplaceTempDaoMiddle.java */
    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a, reason: collision with other inner class name */
    private static class C0265a {

        /* renamed from: a, reason: collision with root package name */
        private static a f2784a = new a();
    }
}
