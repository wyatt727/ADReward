package com.json.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.json.bb;
import com.json.f7;
import com.json.h3;
import com.json.i3;
import com.json.j3;
import com.json.o6;
import com.json.sdk.controller.f;
import com.json.sdk.controller.l;
import com.json.t3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class n implements com.json.sdk.controller.l {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f2192a;
    private final String b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f2193a;
        final /* synthetic */ t3 b;

        a(i3 i3Var, t3 t3Var) {
            this.f2193a = i3Var;
            this.b = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2193a.b(this.b.h(), n.this.b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3 f2194a;
        final /* synthetic */ Map b;

        b(h3 h3Var, Map map) {
            this.f2194a = h3Var;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2194a.a((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3 f2195a;
        final /* synthetic */ JSONObject b;

        c(h3 h3Var, JSONObject jSONObject) {
            this.f2195a = h3Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2195a.a(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f2196a;
        final /* synthetic */ f.MessageToController b;

        d(l.a aVar, f.MessageToController messageToController) {
            this.f2196a = aVar;
            this.b = messageToController;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (this.f2196a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.b);
                this.f2196a.a(new f.CallbackToNative(this.b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), jSONObject));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bb f2197a;

        e(bb bbVar) {
            this.f2197a = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2197a.onOfferwallInitFail(n.this.b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bb f2198a;

        f(bb bbVar) {
            this.f2198a = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2198a.onOWShowFail(n.this.b);
            this.f2198a.onOfferwallInitFail(n.this.b);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bb f2199a;

        g(bb bbVar) {
            this.f2199a = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2199a.onGetOWCreditsFailed(n.this.b);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f2200a;
        final /* synthetic */ t3 b;

        h(j3 j3Var, t3 t3Var) {
            this.f2200a = j3Var;
            this.b = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2200a.a(f7.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f2201a;
        final /* synthetic */ JSONObject b;

        i(j3 j3Var, JSONObject jSONObject) {
            this.f2201a = j3Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2201a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f2202a;
        final /* synthetic */ t3 b;

        j(i3 i3Var, t3 t3Var) {
            this.f2202a = i3Var;
            this.b = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2202a.a(f7.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f2203a;
        final /* synthetic */ String b;

        k(i3 i3Var, String str) {
            this.f2203a = i3Var;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2203a.c(this.b, n.this.b);
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f2204a;
        final /* synthetic */ t3 b;

        l(i3 i3Var, t3 t3Var) {
            this.f2204a = i3Var;
            this.b = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2204a.c(this.b.h(), n.this.b);
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f2205a;
        final /* synthetic */ JSONObject b;

        m(i3 i3Var, JSONObject jSONObject) {
            this.f2205a = i3Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2205a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    n(String str, o6 o6Var) {
        this.f2192a = o6Var;
        this.b = str;
    }

    @Override // com.json.sdk.controller.l
    public void a() {
    }

    @Override // com.json.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.json.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.json.sdk.controller.l
    public void a(f.MessageToController messageToController, l.a aVar) {
        a(new d(aVar, messageToController));
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var) {
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, h3 h3Var) {
        if (h3Var != null) {
            a(new b(h3Var, map));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, i3 i3Var) {
        if (i3Var != null) {
            a(new a(i3Var, t3Var));
        }
    }

    void a(Runnable runnable) {
        o6 o6Var = this.f2192a;
        if (o6Var != null) {
            o6Var.b(runnable);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, i3 i3Var) {
        if (i3Var != null) {
            a(new k(i3Var, str));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, bb bbVar) {
        if (bbVar != null) {
            a(new g(bbVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, h3 h3Var) {
        if (h3Var != null) {
            h3Var.a(f7.e.Banner, t3Var.h(), this.b);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, i3 i3Var) {
        if (i3Var != null) {
            a(new j(i3Var, t3Var));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, j3 j3Var) {
        if (j3Var != null) {
            a(new h(j3Var, t3Var));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, Map<String, String> map, bb bbVar) {
        if (bbVar != null) {
            a(new e(bbVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(Map<String, String> map, bb bbVar) {
        if (bbVar != null) {
            a(new f(bbVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, h3 h3Var) {
        if (h3Var != null) {
            a(new c(h3Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, i3 i3Var) {
        if (i3Var != null) {
            a(new m(i3Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, j3 j3Var) {
        if (j3Var != null) {
            a(new i(j3Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.json.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var) {
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var, Map<String, String> map, i3 i3Var) {
        if (i3Var != null) {
            a(new l(i3Var, t3Var));
        }
    }

    @Override // com.json.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.l
    public void d() {
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
    }

    @Override // com.json.sdk.controller.l
    public void e() {
    }

    @Override // com.json.sdk.controller.l
    public void f() {
    }

    @Override // com.json.sdk.controller.l
    public f7.c g() {
        return f7.c.Native;
    }
}
