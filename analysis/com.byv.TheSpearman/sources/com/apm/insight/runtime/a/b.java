package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.json.t2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f121a = true;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = 1;
    private static boolean e = false;
    private static long f = -1;
    private static volatile b z;
    private int B;
    private Application g;
    private Context h;
    private String n;
    private long o;
    private String p;
    private long q;
    private String r;
    private long s;
    private String t;
    private long u;
    private String v;
    private long w;
    private List<String> i = new ArrayList();
    private List<Long> j = new ArrayList();
    private List<String> k = new ArrayList();
    private List<Long> l = new ArrayList();
    private LinkedList<a> m = new LinkedList<>();
    private boolean x = false;
    private long y = -1;
    private int A = 50;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f123a;
        String b;
        long c;

        a(String str, String str2, long j) {
            this.b = str2;
            this.c = j;
            this.f123a = str;
        }

        public String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.c)) + " : " + this.f123a + ' ' + this.b;
        }
    }

    private b(Application application) {
        this.h = application;
        this.g = application;
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    private a a(String str, String str2, long j) {
        a aVarPoll;
        if (this.m.size() >= this.A) {
            aVarPoll = this.m.poll();
            if (aVarPoll != null) {
                this.m.add(aVarPoll);
            }
        } else {
            aVarPoll = null;
        }
        if (aVarPoll != null) {
            return aVarPoll;
        }
        a aVar = new a(str, str2, j);
        this.m.add(aVar);
        return aVar;
    }

    private JSONObject a(String str, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, String str2) {
        try {
            a aVarA = a(str, str2, j);
            aVarA.b = str2;
            aVarA.f123a = str;
            aVarA.c = j;
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int i = d;
        return i == 1 ? e ? 2 : 1 : i;
    }

    public static long c() {
        return f;
    }

    public static b d() {
        if (z == null) {
            synchronized (b.class) {
                if (z == null) {
                    z = new b(com.apm.insight.i.h());
                }
            }
        }
        return z;
    }

    static /* synthetic */ int g(b bVar) {
        int i = bVar.B;
        bVar.B = i + 1;
        return i;
    }

    static /* synthetic */ int l(b bVar) {
        int i = bVar.B;
        bVar.B = i - 1;
        return i;
    }

    private void m() {
        if (Build.VERSION.SDK_INT < 14 || this.g == null) {
            return;
        }
        this.g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                b.this.n = activity.getClass().getName();
                b.this.o = System.currentTimeMillis();
                boolean unused = b.b = bundle != null;
                boolean unused2 = b.c = true;
                b.this.i.add(b.this.n);
                b.this.j.add(Long.valueOf(b.this.o));
                b bVar = b.this;
                bVar.a(bVar.n, b.this.o, "onCreate");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                String name = activity.getClass().getName();
                int iIndexOf = b.this.i.indexOf(name);
                if (iIndexOf > -1 && iIndexOf < b.this.i.size()) {
                    b.this.i.remove(iIndexOf);
                    b.this.j.remove(iIndexOf);
                }
                b.this.k.add(name);
                long jCurrentTimeMillis = System.currentTimeMillis();
                b.this.l.add(Long.valueOf(jCurrentTimeMillis));
                b.this.a(name, jCurrentTimeMillis, "onDestroy");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                b.this.t = activity.getClass().getName();
                b.this.u = System.currentTimeMillis();
                b.l(b.this);
                if (b.this.B == 0) {
                    b.this.x = false;
                    boolean unused = b.c = false;
                    b.this.y = SystemClock.uptimeMillis();
                } else if (b.this.B < 0) {
                    b.this.B = 0;
                    b.this.x = false;
                    boolean unused2 = b.c = false;
                    b.this.y = SystemClock.uptimeMillis();
                }
                b bVar = b.this;
                bVar.a(bVar.t, b.this.u, t2.h.t0);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                b.this.r = activity.getClass().getName();
                b.this.s = System.currentTimeMillis();
                b.g(b.this);
                if (!b.this.x) {
                    if (b.f121a) {
                        boolean unused = b.f121a = false;
                        int unused2 = b.d = 1;
                        long unused3 = b.f = b.this.s;
                    }
                    if (!b.this.r.equals(b.this.t)) {
                        return;
                    }
                    if (b.c && !b.b) {
                        int unused4 = b.d = 4;
                        long unused5 = b.f = b.this.s;
                        return;
                    } else if (!b.c) {
                        int unused6 = b.d = 3;
                        long unused7 = b.f = b.this.s;
                        return;
                    }
                }
                b.this.x = true;
                b bVar = b.this;
                bVar.a(bVar.r, b.this.s, t2.h.u0);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                b.this.p = activity.getClass().getName();
                b.this.q = System.currentTimeMillis();
                b bVar = b.this;
                bVar.a(bVar.p, b.this.q, "onStart");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                b.this.v = activity.getClass().getName();
                b.this.w = System.currentTimeMillis();
                b bVar = b.this;
                bVar.a(bVar.v, b.this.w, "onStop");
            }
        });
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.i;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.i.size(); i++) {
                try {
                    jSONArray.put(a(this.i.get(i), this.j.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.k.size(); i++) {
                try {
                    jSONArray.put(a(this.k.get(i), this.l.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public long e() {
        return SystemClock.uptimeMillis() - this.y;
    }

    public boolean f() {
        return this.x;
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.n, this.o));
            jSONObject.put("last_start_activity", a(this.p, this.q));
            jSONObject.put("last_resume_activity", a(this.r, this.s));
            jSONObject.put("last_pause_activity", a(this.t, this.u));
            jSONObject.put("last_stop_activity", a(this.v, this.w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String h() {
        return String.valueOf(this.r);
    }

    public JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }
}
