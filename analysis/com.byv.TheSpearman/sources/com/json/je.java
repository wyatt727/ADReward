package com.json;

import android.text.TextUtils;
import com.json.d0;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.json.mediationsdk.logger.IronLog;
import com.json.y1;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class je<Smash extends y1<?>> {
    private y1<?> d;
    private final List<String> e;
    private final int f;
    ke h;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f1832a = new ConcurrentHashMap<>();
    private String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1833a;

        a(String str) {
            this.f1833a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f1833a + " from memory");
                je.this.f1832a.remove(this.f1833a);
                ironLog.verbose("waterfall size is currently " + je.this.f1832a.size());
                ironLog.verbose("removing adInfo with id " + this.f1833a + " from memory");
            } finally {
                cancel();
            }
        }
    }

    public je(List<String> list, int i, ke keVar) {
        this.e = list;
        this.f = i;
        this.h = keVar;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.d)) {
                smash.L();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.y1<?> r0 = r2.d     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            boolean r0 = r0.B()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            com.ironsource.y1<?> r0 = r2.d     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.h()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.je.e():boolean");
    }

    private synchronized void f() {
        y1<?> y1Var = this.d;
        if (y1Var != null) {
            y1Var.L();
        }
    }

    public void a(d0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == d0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f1832a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new a(this.c), this.f);
            }
        } else {
            this.f1832a.clear();
            this.f1832a.put(str, copyOnWriteArrayList);
        }
        this.c = this.b;
        this.b = str;
        if (this.f1832a.size() > 5) {
            this.h.a(this.f1832a.size());
        }
    }

    public synchronized void a(y1<?> y1Var) {
        IronLog.INTERNAL.verbose();
        y1<?> y1Var2 = this.d;
        if (y1Var2 != null && !y1Var2.equals(y1Var)) {
            f();
        }
        this.d = y1Var;
    }

    public synchronized boolean a(d0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit) {
        boolean z;
        y1<?> y1Var;
        boolean zA = a(adapterBaseInterface, ad_unit, str);
        z = true;
        if (zA || (aVar == d0.a.AUTOMATIC_LOAD_WHILE_SHOW && (y1Var = this.d) != null && y1Var.B() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.e.contains(str2)) && this.d.n().equals(str2))))) {
            z = false;
        }
        if (!z) {
            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
        }
        return z;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f1832a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String c() {
        return this.b;
    }

    public y1<?> d() {
        return this.d;
    }
}
