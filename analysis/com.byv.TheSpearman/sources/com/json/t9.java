package com.json;

import android.text.TextUtils;
import com.json.mediationsdk.LoadWhileShowSupportState;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.r;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class t9 {
    private static final String i = "WaterfallLifeCycleHolder";
    private r d;
    private final List<String> e;
    private final int f;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<r>> f2309a = new ConcurrentHashMap<>();
    private String b = "";
    private String c = "";
    private final Timer g = new Timer();
    ConcurrentHashMap<String, AdInfo> h = new ConcurrentHashMap<>();

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2310a;

        a(String str) {
            this.f2310a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f2310a + " from memory");
                t9.this.f2309a.remove(this.f2310a);
                ironLog.verbose("waterfall size is currently " + t9.this.f2309a.size());
                ironLog.verbose("removing adInfo with id " + this.f2310a + " from memory");
                t9.this.h.remove(this.f2310a);
                ironLog.verbose("adInfo size is currently " + t9.this.h.size());
            } finally {
                cancel();
            }
        }
    }

    public t9(List<String> list, int i2) {
        this.e = list;
        this.f = i2;
    }

    private void b() {
        Iterator<r> it = c().iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (!next.equals(this.d)) {
                next.q();
            }
        }
    }

    public AdInfo a(String str) {
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }

    public synchronized void a(r rVar) {
        IronLog.INTERNAL.verbose();
        r rVar2 = this.d;
        if (rVar2 != null && !rVar2.equals(rVar)) {
            this.d.q();
        }
        this.d = rVar;
    }

    public void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.h.put(str, new AdInfo(impressionData));
    }

    public void a(CopyOnWriteArrayList<r> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f2309a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                String str2 = this.b;
                this.b = this.c;
                this.c = str2;
            }
            this.g.schedule(new a(this.c), this.f);
        }
        this.c = this.b;
        this.b = str;
    }

    public boolean a() {
        return this.f2309a.size() > 5;
    }

    public synchronized boolean b(r rVar) {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        z = false;
        if (rVar == null || rVar.o() || (this.d != null && ((rVar.w() == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(rVar.c())) || ((rVar.w() == LoadWhileShowSupportState.NONE || this.e.contains(rVar.j())) && this.d.j().equals(rVar.j()))))) {
            z = true;
        }
        if (z && rVar != null) {
            ironLog.verbose(rVar.c() + " will not be added to the auction request");
        }
        return !z;
    }

    public CopyOnWriteArrayList<r> c() {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = this.f2309a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.f2309a.size();
    }

    public r f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.r r0 = r2.d     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.u()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.t9.g():boolean");
    }
}
