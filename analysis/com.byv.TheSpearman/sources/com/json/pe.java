package com.json;

import android.content.Context;
import com.json.f7;
import com.json.sdk.controller.FeaturesManager;
import com.json.sdk.utils.Logger;
import com.json.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pe {

    /* renamed from: a, reason: collision with root package name */
    private final String f2067a;
    private Context b;
    private wd c;
    private v2 d;
    private u3 e;
    private int f;
    private c4 g;
    private int h;
    private int i;
    private final String j = "pe";
    private a k;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public pe(Context context, v2 v2Var, wd wdVar, u3 u3Var, int i, c4 c4Var, String str) {
        a aVarH = h();
        this.k = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.b = context;
            this.d = v2Var;
            this.c = wdVar;
            this.e = u3Var;
            this.f = i;
            this.g = c4Var;
            this.h = 0;
        }
        this.f2067a = str;
    }

    private a h() {
        this.i = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.j, "getInitialState mMaxAllowedTrials: " + this.i);
        if (this.i > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.j, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void k() {
        if (this.h != this.i) {
            this.k = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.j, "handleRecoveringEndedFailed | Reached max trials");
        this.k = a.NOT_ALLOWED;
        a();
    }

    private void l() {
        a();
        this.k = a.RECOVERED;
    }

    public void a() {
        this.b = null;
        this.d = null;
        this.c = null;
        this.e = null;
        this.g = null;
    }

    public void a(boolean z) {
        if (this.k != a.IN_RECOVERING) {
            return;
        }
        if (z) {
            l();
        } else {
            k();
        }
    }

    public boolean a(f7.c cVar, f7.b bVar) {
        Logger.i(this.j, "shouldRecoverWebController: ");
        a aVar = this.k;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.j, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != f7.c.Native) {
            Logger.i(this.j, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == f7.b.Loading || bVar == f7.b.None) {
            Logger.i(this.j, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.j, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.j, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.b == null || this.d == null || this.c == null || this.e == null) {
            Logger.i(this.j, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.j, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.b;
    }

    public String c() {
        return this.f2067a;
    }

    public v2 d() {
        return this.d;
    }

    public int e() {
        return this.f;
    }

    public u3 f() {
        return this.e;
    }

    public c4 g() {
        return this.g;
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(t2.h.A0, n());
            jSONObject.put(t2.h.B0, this.h);
            jSONObject.put(t2.h.C0, this.i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public wd j() {
        return this.c;
    }

    public boolean m() {
        return this.k == a.IN_RECOVERING;
    }

    public boolean n() {
        return this.k == a.RECOVERED;
    }

    public void o() {
        a aVar = this.k;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.h++;
            Logger.i(this.j, "recoveringStarted - trial number " + this.h);
            this.k = aVar2;
        }
    }
}
