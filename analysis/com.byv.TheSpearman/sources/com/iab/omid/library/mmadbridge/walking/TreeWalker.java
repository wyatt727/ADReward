package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.processor.a;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import com.iab.omid.library.mmadbridge.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0221a {
    private static TreeWalker i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;
    private static final Runnable l = new b();
    private static final Runnable m = new c();
    private int b;
    private long h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f1609a = new ArrayList();
    private boolean c = false;
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> d = new ArrayList();
    private com.iab.omid.library.mmadbridge.walking.a f = new com.iab.omid.library.mmadbridge.walking.a();
    private com.iab.omid.library.mmadbridge.processor.b e = new com.iab.omid.library.mmadbridge.processor.b();
    private com.iab.omid.library.mmadbridge.walking.b g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.k != null) {
                TreeWalker.k.post(TreeWalker.l);
                TreeWalker.k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void a(long j2) {
        if (this.f1609a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f1609a) {
                treeWalkerTimeLogger.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.b, j2);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z);
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.e.b();
        String strB = this.f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0223a c0223aB = this.f.b(view);
        if (c0223aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0223aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f.c(strC)));
        this.f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.h);
    }

    private void e() {
        this.b = 0;
        this.d.clear();
        this.c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.c = true;
                break;
            }
        }
        this.h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0221a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z) throws JSONException {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z2 = z || a(view, jSONObjectA);
                if (this.c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z2) {
                    this.d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z2);
            }
            this.b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f1609a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f1609a.add(treeWalkerTimeLogger);
    }

    void f() throws JSONException {
        this.f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.e.a();
        if (this.f.b().size() > 0) {
            Iterator<String> it = this.f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f.a(next), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            this.g.b(jSONObjectA2, this.f.c(), jB);
            if (this.c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it2 = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.d);
                }
            }
        } else {
            this.g.b();
        }
        this.f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f1609a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f1609a.contains(treeWalkerTimeLogger)) {
            this.f1609a.remove(treeWalkerTimeLogger);
        }
    }
}
