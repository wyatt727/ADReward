package com.json.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.json.MessageToNative;
import com.json.a5;
import com.json.ab;
import com.json.b5;
import com.json.bb;
import com.json.c4;
import com.json.ea;
import com.json.f7;
import com.json.g7;
import com.json.h3;
import com.json.h7;
import com.json.hc;
import com.json.i3;
import com.json.j2;
import com.json.j3;
import com.json.m4;
import com.json.m7;
import com.json.n7;
import com.json.o6;
import com.json.pa;
import com.json.pe;
import com.json.q5;
import com.json.s5;
import com.json.sdk.IronSourceNetwork;
import com.json.sdk.controller.f;
import com.json.sdk.controller.l;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import com.json.t2;
import com.json.t3;
import com.json.u3;
import com.json.v2;
import com.json.wd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e implements com.json.sdk.controller.c, com.json.sdk.controller.l {
    private com.json.sdk.controller.l b;
    private CountDownTimer d;
    private final o6 g;
    private final pe h;
    private final pa k;

    /* renamed from: a, reason: collision with root package name */
    private final String f2153a = "e";
    private f7.b c = f7.b.None;
    private final j2 e = new j2("NativeCommandExecutor");
    private final j2 f = new j2("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2154a;
        final /* synthetic */ String b;
        final /* synthetic */ bb c;

        a(String str, String str2, bb bbVar) {
            this.f2154a = str;
            this.b = str2;
            this.c = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2154a, this.b, this.c);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2155a;
        final /* synthetic */ String b;
        final /* synthetic */ t3 c;
        final /* synthetic */ j3 d;

        b(String str, String str2, t3 t3Var, j3 j3Var) {
            this.f2155a = str;
            this.b = str2;
            this.c = t3Var;
            this.d = j3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2155a, this.b, this.c, this.d);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2156a;
        final /* synthetic */ j3 b;

        c(JSONObject jSONObject, j3 j3Var) {
            this.f2156a = jSONObject;
            this.b = j3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2156a, this.b);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2157a;
        final /* synthetic */ String b;
        final /* synthetic */ t3 c;
        final /* synthetic */ i3 d;

        d(String str, String str2, t3 t3Var, i3 i3Var) {
            this.f2157a = str;
            this.b = str2;
            this.c = t3Var;
            this.d = i3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2157a, this.b, this.c, this.d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0244e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2158a;
        final /* synthetic */ i3 b;

        RunnableC0244e(String str, i3 i3Var) {
            this.f2158a = str;
            this.b = i3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2158a, this.b);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2159a;
        final /* synthetic */ Map b;
        final /* synthetic */ i3 c;

        f(t3 t3Var, Map map, i3 i3Var) {
            this.f2159a = t3Var;
            this.b = map;
            this.c = i3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            m7.a(hc.j, new h7().a(m4.u, this.f2159a.f()).a(m4.v, n7.a(this.f2159a, f7.e.Interstitial)).a(m4.w, Boolean.valueOf(n7.a(this.f2159a))).a(m4.H, Long.valueOf(com.json.n.f2025a.b(this.f2159a.h()))).a());
            if (e.this.b != null) {
                e.this.b.b(this.f2159a, this.b, this.c);
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2160a;
        final /* synthetic */ i3 b;

        g(JSONObject jSONObject, i3 i3Var) {
            this.f2160a = jSONObject;
            this.b = i3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2160a, this.b);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2161a;
        final /* synthetic */ Map b;
        final /* synthetic */ i3 c;

        h(t3 t3Var, Map map, i3 i3Var) {
            this.f2161a = t3Var;
            this.b = map;
            this.c = i3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2161a, this.b, this.c);
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2162a;
        final /* synthetic */ String b;
        final /* synthetic */ t3 c;
        final /* synthetic */ h3 d;

        i(String str, String str2, t3 t3Var, h3 h3Var) {
            this.f2162a = str;
            this.b = str2;
            this.c = t3Var;
            this.d = h3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2162a, this.b, this.c, this.d);
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2163a;
        final /* synthetic */ h3 b;

        j(JSONObject jSONObject, h3 h3Var) {
            this.f2163a = jSONObject;
            this.b = h3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2163a, this.b);
            }
        }
    }

    class k implements l.a {
        k() {
        }

        @Override // com.ironsource.sdk.controller.l.a
        public void a(f.CallbackToNative callbackToNative) {
            l.a aVar = (l.a) e.this.i.remove(callbackToNative.c());
            if (aVar != null) {
                aVar.a(callbackToNative);
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2165a;

        l(t3 t3Var) {
            this.f2165a = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2165a);
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2166a;

        m(t3 t3Var) {
            this.f2166a = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.b(this.f2166a);
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2167a;
        final /* synthetic */ Map b;
        final /* synthetic */ h3 c;

        n(t3 t3Var, Map map, h3 h3Var) {
            this.f2167a = t3Var;
            this.b = map;
            this.c = h3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2167a, this.b, this.c);
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f2168a;
        final /* synthetic */ f.MessageToController b;

        o(l.a aVar, f.MessageToController messageToController) {
            this.f2168a = aVar;
            this.b = messageToController;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                if (this.f2168a != null) {
                    e.this.i.put(this.b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), this.f2168a);
                }
                e.this.b.a(this.b, this.f2168a);
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2169a;

        p(JSONObject jSONObject) {
            this.f2169a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2169a);
            }
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.destroy();
                e.this.b = null;
            }
        }
    }

    class r implements l.b {
        r() {
        }

        @Override // com.ironsource.sdk.controller.l.b
        public void a(MessageToNative messageToNative) {
            l.b bVar = (l.b) e.this.j.get(messageToNative.d());
            if (bVar != null) {
                bVar.a(messageToNative);
            }
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2172a;
        final /* synthetic */ v2 b;
        final /* synthetic */ wd c;
        final /* synthetic */ u3 d;
        final /* synthetic */ int e;
        final /* synthetic */ c4 f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;

        s(Context context, v2 v2Var, wd wdVar, u3 u3Var, int i, c4 c4Var, String str, String str2, String str3) {
            this.f2172a = context;
            this.b = v2Var;
            this.c = wdVar;
            this.d = u3Var;
            this.e = i;
            this.f = c4Var;
            this.g = str;
            this.h = str2;
            this.i = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(this.f2172a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
                e.this.b.a();
            } catch (Throwable th) {
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class t extends CountDownTimer {
        t(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f2153a, "Global Controller Timer Finish");
            e.this.d(t2.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.f2153a, "Global Controller Timer Tick " + j);
        }
    }

    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c();
        }
    }

    class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2175a;
        final /* synthetic */ String b;

        v(String str, String str2) {
            this.f2175a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.j(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.f2175a, this.b);
                e.this.b.a();
            } catch (Throwable th) {
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class w extends CountDownTimer {
        w(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f2153a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(t2.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.i(e.this.f2153a, "Recovered Controller | Global Controller Timer Tick " + j);
        }
    }

    class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2177a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;
        final /* synthetic */ bb d;

        x(String str, String str2, Map map, bb bbVar) {
            this.f2177a = str;
            this.b = str2;
            this.c = map;
            this.d = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2177a, this.b, this.c, this.d);
            }
        }
    }

    class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2178a;
        final /* synthetic */ bb b;

        y(Map map, bb bbVar) {
            this.f2178a = map;
            this.b = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b != null) {
                e.this.b.a(this.f2178a, this.b);
            }
        }
    }

    public e(Context context, v2 v2Var, wd wdVar, u3 u3Var, o6 o6Var, int i2, JSONObject jSONObject, String str, String str2, pa paVar) {
        this.k = paVar;
        this.g = o6Var;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        c4 c4VarA = c4.a(networkStorageDir, o6Var, jSONObject);
        this.h = new pe(context, v2Var, wdVar, u3Var, i2, c4VarA, networkStorageDir);
        a(context, v2Var, wdVar, u3Var, i2, c4VarA, networkStorageDir, str, str2);
    }

    private void a(Context context, v2 v2Var, wd wdVar, u3 u3Var, int i2, c4 c4Var, String str, String str2, String str3) {
        b(new s(context, v2Var, wdVar, u3Var, i2, c4Var, str, str2, str3));
        this.d = new t(200000L, 1000L).start();
    }

    private void a(f7.e eVar, t3 t3Var, String str, String str2) {
        Logger.i(this.f2153a, "recoverWebController for product: " + eVar.toString());
        h7 h7Var = new h7();
        h7Var.a(m4.v, eVar.toString());
        h7Var.a(m4.u, t3Var.f());
        m7.a(hc.b, h7Var.a());
        this.h.o();
        destroy();
        b(new v(str, str2));
        this.d = new w(200000L, 1000L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.json.sdk.controller.v b(Context context, v2 v2Var, wd wdVar, u3 u3Var, int i2, c4 c4Var, String str, String str2, String str3) throws Throwable {
        m7.a(hc.c);
        com.json.sdk.controller.v vVar = new com.json.sdk.controller.v(context, u3Var, v2Var, this, this.g, i2, c4Var, str, h(), i(), str2, str3);
        b5 b5Var = new b5(context, c4Var, new a5(this.g.a()), new ea(c4Var.a()));
        vVar.a(new com.json.sdk.controller.u(context, wdVar));
        vVar.a(new com.json.sdk.controller.o(context));
        vVar.a(new com.json.sdk.controller.q(context));
        vVar.a(new com.json.sdk.controller.i(context));
        vVar.a(new com.json.sdk.controller.a(context));
        vVar.a(new com.json.sdk.controller.j(c4Var.a(), b5Var));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        m7.a(hc.d, new h7().a(m4.z, str).a());
        this.c = f7.b.Loading;
        this.b = new com.json.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        o6 o6Var = this.g;
        if (o6Var != null) {
            o6Var.b(new u());
        }
    }

    private void e(String str) {
        ab initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new g7(1001, str));
            IronSourceNetwork.setInitListener(null);
        }
    }

    private l.a h() {
        return new k();
    }

    private l.b i() {
        return new r();
    }

    private void k() {
        Logger.i(this.f2153a, "handleReadyState");
        this.c = f7.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
        this.f.c();
        this.f.a();
        com.json.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.e();
        }
    }

    private boolean l() {
        return f7.b.Ready.equals(this.c);
    }

    private void m() {
        this.h.a(true);
        com.json.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.b(this.h.i());
        }
    }

    private void n() {
        ab initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onSuccess();
            IronSourceNetwork.setInitListener(null);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a() {
    }

    @Override // com.json.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }

    @Override // com.json.sdk.controller.l
    public void a(Context context) {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.json.u5
    public void a(q5 q5Var) {
        hc.a aVar;
        h7 h7Var;
        StringBuilder sb;
        s5 strategy = q5Var.getStrategy();
        if (strategy == s5.SendEvent) {
            aVar = hc.A;
            h7Var = new h7();
            sb = new StringBuilder();
        } else {
            if (strategy != s5.NativeController) {
                return;
            }
            com.json.sdk.controller.n nVar = new com.json.sdk.controller.n(q5Var.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.g());
            m7.a(hc.d, new h7().a(m4.z, q5Var.a() + " : strategy: " + strategy).a());
            aVar = hc.A;
            h7Var = new h7();
            sb = new StringBuilder();
        }
        sb.append(q5Var.a());
        sb.append(" : strategy: ");
        sb.append(strategy);
        m7.a(aVar, h7Var.a(m4.x, sb.toString()).a());
    }

    @Override // com.json.sdk.controller.l
    public void a(f.MessageToController messageToController, l.a aVar) {
        this.f.a(new o(aVar, messageToController));
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var) {
        this.f.a(new l(t3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, h3 h3Var) {
        this.f.a(new n(t3Var, map, h3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(t3 t3Var, Map<String, String> map, i3 i3Var) {
        this.f.a(new h(t3Var, map, i3Var));
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, i3 i3Var) {
        Logger.i(this.f2153a, "load interstitial");
        this.f.a(new RunnableC0244e(str, i3Var));
    }

    public void a(String str, l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, bb bbVar) {
        this.f.a(new a(str, str2, bbVar));
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, h3 h3Var) {
        if (this.h.a(g(), this.c)) {
            a(f7.e.Banner, t3Var, str, str2);
        }
        this.f.a(new i(str, str2, t3Var, h3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, i3 i3Var) {
        if (this.h.a(g(), this.c)) {
            a(f7.e.Interstitial, t3Var, str, str2);
        }
        this.f.a(new d(str, str2, t3Var, i3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, t3 t3Var, j3 j3Var) {
        if (this.h.a(g(), this.c)) {
            a(f7.e.RewardedVideo, t3Var, str, str2);
        }
        this.f.a(new b(str, str2, t3Var, j3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(String str, String str2, Map<String, String> map, bb bbVar) {
        this.f.a(new x(str, str2, map, bbVar));
    }

    @Override // com.json.sdk.controller.l
    public void a(Map<String, String> map, bb bbVar) {
        this.f.a(new y(map, bbVar));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject) {
        this.f.a(new p(jSONObject));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, h3 h3Var) {
        this.f.a(new j(jSONObject, h3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, i3 i3Var) {
        this.f.a(new g(jSONObject, i3Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(JSONObject jSONObject, j3 j3Var) {
        this.f.a(new c(jSONObject, j3Var));
    }

    @Override // com.json.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !l()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.json.sdk.controller.c
    public void b() {
        Logger.i(this.f2153a, "handleControllerLoaded");
        this.c = f7.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.json.sdk.controller.l
    public void b(Context context) {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var) {
        this.f.a(new m(t3Var));
    }

    @Override // com.json.sdk.controller.l
    public void b(t3 t3Var, Map<String, String> map, i3 i3Var) {
        this.f.a(new f(t3Var, map, i3Var));
    }

    void b(Runnable runnable) {
        o6 o6Var = this.g;
        if (o6Var != null) {
            o6Var.c(runnable);
        } else {
            Logger.e(this.f2153a, "mThreadManager = null");
        }
    }

    @Override // com.json.sdk.controller.c
    public void b(String str) {
        Logger.i(this.f2153a, "handleControllerFailed ");
        h7 h7Var = new h7();
        h7Var.a(m4.z, str);
        h7Var.a(m4.x, String.valueOf(this.h.m()));
        m7.a(hc.o, h7Var.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.f2153a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.json.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.c
    public void c() {
        Logger.i(this.f2153a, "handleControllerReady ");
        this.k.a(g());
        if (f7.c.Web.equals(g())) {
            m7.a(hc.e, new h7().a(m4.x, String.valueOf(this.h.m())).a());
            n();
        }
        k();
    }

    @Override // com.json.sdk.controller.c
    public void c(String str) {
        m7.a(hc.y, new h7().a(m4.x, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.json.sdk.controller.l
    public void d() {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.d();
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
        Logger.i(this.f2153a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        j2 j2Var = this.f;
        if (j2Var != null) {
            j2Var.b();
        }
        this.d = null;
        b(new q());
    }

    @Override // com.json.sdk.controller.l
    @Deprecated
    public void e() {
    }

    @Override // com.json.sdk.controller.l
    public void f() {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.f();
    }

    @Override // com.json.sdk.controller.l
    public f7.c g() {
        com.json.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.g() : f7.c.None;
    }

    public com.json.sdk.controller.l j() {
        return this.b;
    }
}
