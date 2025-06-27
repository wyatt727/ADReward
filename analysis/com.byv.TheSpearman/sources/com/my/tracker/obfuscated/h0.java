package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.p;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f4230a = new AtomicBoolean();
    final a1 b;
    final Application c;
    final p d;
    final com.my.tracker.obfuscated.a e;
    final h f;
    final l g;
    final v0 h;
    final w0 i;
    p0 j;

    final class a implements p.b {
        a() {
        }

        @Override // com.my.tracker.obfuscated.p.b
        public void a() {
            h0.this.e.e();
        }

        @Override // com.my.tracker.obfuscated.p.b
        public void a(String str) {
            h0.this.f.b(str);
        }
    }

    h0(a1 a1Var, Application application) {
        this.b = a1Var;
        this.c = application;
        z0.c("MyTracker created, version: 3.1.2");
        p pVarA = p.a(a1Var, new a(), application);
        this.d = pVarA;
        w0 w0VarA = w0.a(pVarA, a1Var.a(), application);
        this.i = w0VarA;
        this.e = com.my.tracker.obfuscated.a.a(pVarA, a1Var, w0VarA, application);
        this.f = h.a(a1Var, application);
        this.g = l.a(pVarA);
        this.h = v0.a(pVarA, application);
    }

    public static h0 a(String str, a1 a1Var, Application application) {
        a1Var.b(str);
        return new h0(a1Var, application);
    }

    public String a(Intent intent) {
        return this.g.a(intent);
    }

    public void a() {
        a((MyTracker.FlushListener) null);
    }

    public void a(int i, Intent intent) {
        if (b()) {
            return;
        }
        if (this.b.n()) {
            this.h.b(i, intent);
        } else {
            z0.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        }
    }

    public void a(int i, List<Object> list) {
        if (b()) {
            return;
        }
        if (this.b.n()) {
            this.h.a(i, list);
        } else {
            z0.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        }
    }

    public void a(int i, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.a(i, map);
    }

    public void a(Activity activity) {
        if (b()) {
            return;
        }
        this.e.d(activity);
    }

    public void a(MyTracker.FlushListener flushListener) {
        if (b()) {
            return;
        }
        this.d.a(flushListener);
    }

    public void a(AdEvent adEvent) {
        if (b()) {
            return;
        }
        this.d.a(adEvent);
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (b()) {
            return;
        }
        this.d.a(miniAppEvent);
    }

    public void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        if (b()) {
            return;
        }
        if (this.b.n()) {
            z0.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.h.a(obj, str, str2, str3, map);
        }
    }

    public void a(String str, String str2, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.a(str, str2, map);
    }

    public void a(String str, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.a(str, map);
    }

    public void a(List<MyTrackerPluginConfig> list) {
        if (!this.f4230a.compareAndSet(false, true)) {
            z0.a("MyTracker: tracker has already been initialized");
            return;
        }
        z0.c("MyTracker is initialized with id: " + this.b.g());
        g0.c(this.c);
        this.d.c();
        c0.a(this.b, this.d, this.i, this.c);
        w.a(this.d, this.f, this.c);
        b0.a(this.d, this.f, this.c);
        this.e.a();
        this.h.a();
        if (list.isEmpty()) {
            return;
        }
        p0 p0VarA = p0.a(this.d, this.c);
        this.j = p0VarA;
        p0VarA.a(list);
    }

    public void a(Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.c(map);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        if (b()) {
            return;
        }
        if (this.b.n()) {
            z0.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.h.a(jSONObject, jSONObject2, str, map);
        }
    }

    public void b(String str, String str2, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.b(str, str2, map);
    }

    public void b(Map<String, String> map) {
        if (b()) {
            return;
        }
        this.d.d(map);
    }

    boolean b() {
        boolean z = !this.f4230a.get();
        if (z) {
            z0.b("MyTracker error: tracker hasn't been initialized");
        }
        return z;
    }
}
