package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.e.w;
import com.my.target.ads.Reward;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Global.java */
/* loaded from: classes4.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private static x f2725a = null;
    private static String o = "";
    private final String b;
    private final m c;
    private Context d;
    private w e;
    private JSONObject f;
    private List<String> g;
    private List<String> h;
    private volatile c i;
    private volatile l j;
    private volatile d k;
    private volatile j l;
    private volatile r m;
    private volatile boolean n = true;
    private n p;

    k(String str, m mVar) {
        this.b = str;
        this.c = mVar;
    }

    final String a() {
        if (!y.a((Object) this.d) && !y.a(this.e)) {
            try {
                o().a();
                this.n = false;
                if (TextUtils.isEmpty(o)) {
                    o = UUID.randomUUID().toString();
                }
                if (!y.a(f2725a)) {
                    try {
                        f2725a.a(b(), this.b, this.c);
                        t.a().b();
                    } catch (Exception e) {
                        if (a.f2688a) {
                            Log.e("TrackManager", "track manager start exception", e);
                        }
                    }
                }
                return o;
            } catch (Exception e2) {
                if (a.f2688a) {
                    Log.e("TrackManager", "start error", e2);
                }
                this.n = true;
            }
        }
        return "";
    }

    final String b() {
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String string = UUID.randomUUID().toString();
        o = string;
        return string;
    }

    final String c() {
        return this.b;
    }

    final void a(Context context) {
        this.d = context;
    }

    final void a(w wVar) {
        this.e = wVar;
    }

    final w d() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar;
        }
        w wVarA = new w.a().a();
        this.e = wVarA;
        return wVarA;
    }

    final Context e() {
        return this.d;
    }

    final void a(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    final JSONObject f() {
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f = jSONObject2;
        return jSONObject2;
    }

    final c g() {
        String str;
        if (y.a(this.i)) {
            synchronized (k.class) {
                if (y.a(this.i)) {
                    Context context = this.d;
                    if (TextUtils.isEmpty(this.b)) {
                        str = String.format("track_manager_%s.db", Reward.DEFAULT);
                    } else {
                        str = String.format("track_manager_%s.db", this.b);
                    }
                    this.i = new c(new b(context, str, "event_table"), "event_table");
                }
            }
        }
        return this.i;
    }

    final l h() {
        if (y.a(this.j)) {
            synchronized (k.class) {
                if (y.a(this.j)) {
                    this.j = new p(new g(g(), o(), i()));
                }
            }
        }
        return this.j;
    }

    final j i() {
        if (y.a(this.l)) {
            synchronized (k.class) {
                if (y.a(this.l)) {
                    this.l = new j();
                }
            }
        }
        return this.l;
    }

    final d j() {
        if (y.a(this.k)) {
            this.k = d().h;
        }
        return this.k;
    }

    final m k() {
        return this.c;
    }

    final int l() {
        if (d().f2742a < 0) {
            return 50;
        }
        return d().f2742a;
    }

    final int m() {
        return Math.max(d().b, 0);
    }

    final int n() {
        return Math.max(d().e, 0);
    }

    final r o() {
        if (y.a(this.m)) {
            synchronized (k.class) {
                if (y.a(this.m)) {
                    this.m = new r(this);
                }
            }
        }
        return this.m;
    }

    final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "event filter apply exception", e);
                }
            }
        }
        String strA = eVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.h != null) {
            try {
                return !r0.contains(strA);
            } catch (Exception e2) {
                if (a.f2688a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e2);
                }
            }
        }
        List<String> list = this.g;
        if (list != null) {
            try {
                return list.contains(strA);
            } catch (Exception e3) {
                if (a.f2688a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e3);
                }
            }
        }
        return true;
    }

    final boolean p() throws IllegalStateException {
        if (y.a(d())) {
            throw new IllegalStateException("config can not be null");
        }
        if (y.a(j())) {
            throw new IllegalStateException("decorate can not be null");
        }
        if (y.a(d().i)) {
            throw new IllegalStateException("responseHandler can not be null");
        }
        if (y.a(d().g) || y.a(d().g.c())) {
            throw new IllegalStateException("networkStackConfig or stack can not be null");
        }
        if (TextUtils.isEmpty(d().g.b())) {
            throw new IllegalStateException("report url is null");
        }
        return true;
    }

    final n q() {
        if (y.a(this.p)) {
            synchronized (k.class) {
                if (y.a(this.p)) {
                    this.p = new n(d().d <= 0 ? 2 : d().d, d().g, d().i, d().c);
                }
            }
        }
        return this.p;
    }

    final boolean r() {
        return this.n;
    }
}
