package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f969a;
    private final t b;
    private final int c;
    private final c d;
    private final Object f = new Object();
    private final List g;
    private final Set h;
    private final List i;

    class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f970a;
        final /* synthetic */ AppLovinPostbackListener b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f970a = dVar;
            this.b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            t unused = b.this.b;
            if (t.a()) {
                b.this.b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f970a + " with error code: " + i + "; will retry later...");
            }
            b.this.d(this.f970a);
            bc.a(this.b, str, i);
            if (this.f970a.c() == 1) {
                b.this.f969a.B().a("dispatchPostback", str, i);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f970a);
            t unused = b.this.b;
            if (t.a()) {
                b.this.b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f970a);
            }
            b.this.c();
            bc.a(this.b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.h = new HashSet();
        this.i = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f969a = kVar;
        this.b = kVar.L();
        int iIntValue = ((Integer) kVar.a(oj.W2)).intValue();
        this.c = iIntValue;
        if (!((Boolean) kVar.a(oj.Z2)).booleanValue()) {
            this.d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.d = cVar;
        if (zp.a(oj.n1, kVar) && zp.h()) {
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.f();
                }
            }, true, true);
        } else {
            arrayList.addAll(cVar.a(iIntValue));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        synchronized (this.f) {
            this.g.addAll(0, this.d.a(this.c));
        }
    }

    protected List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            if (((Boolean) this.f969a.a(oj.Y2)).booleanValue()) {
                arrayList.ensureCapacity(this.i.size());
                arrayList.addAll(this.i);
            } else {
                arrayList.ensureCapacity(this.g.size());
                arrayList.addAll(this.g);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f969a.l0().a((xl) this.d, sm.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f) {
            while (this.g.size() > this.c) {
                this.g.remove(0);
            }
            this.g.add(dVar);
        }
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f) {
            Iterator it = new ArrayList(this.g).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z) {
        a(dVar, z, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(dVar, appLovinPostbackListener);
                }
            }, zp.h(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f) {
            this.h.remove(dVar);
            this.i.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f) {
            this.g.clear();
            this.i.clear();
        }
        this.f969a.l0().a((xl) this.d, sm.b.OTHER);
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f969a.A0() && !dVar.m()) {
            if (t.a()) {
                this.b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f) {
            if (this.h.contains(dVar)) {
                if (t.a()) {
                    this.b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            Integer num = (Integer) this.f969a.a(oj.V2);
            if (dVar.c() > num.intValue()) {
                if (t.a()) {
                    this.b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
                return;
            }
            synchronized (this.f) {
                this.h.add(dVar);
            }
            e eVarB = e.b(this.f969a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
            if (t.a()) {
                this.b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
            }
            this.f969a.a0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f) {
            this.h.remove(dVar);
            this.g.remove(dVar);
        }
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z, boolean z2) {
        if (z) {
            this.f969a.l0().a((xl) new kn(this.f969a, z2, "runPostbackTask", runnable), sm.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
