package com.json;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.events.ISErrorListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.p;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.n4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class z1 implements e6 {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private f K;
    private IronSourceSegment L;
    private oc M;
    private ISErrorListener N;
    private boolean l;
    private k3 p;
    private com.json.e q;
    private ArrayList<l4> r;
    private int t;
    private String u;
    private Context v;
    private int[] z;

    /* renamed from: a, reason: collision with root package name */
    final int f2463a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = i5.r0;
    private final String k = "mt";
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object O = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z1.this.a();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4 f2465a;
        final /* synthetic */ IronSource.AD_UNIT b;

        b(l4 l4Var, IronSource.AD_UNIT ad_unit) {
            this.f2465a = l4Var;
            this.b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            this.f2465a.a("eventSessionId", z1.this.u);
            String connectionType = IronSourceUtils.getConnectionType(z1.this.v);
            if (z1.this.g(this.f2465a)) {
                this.f2465a.a("connectionType", connectionType);
            }
            if (z1.this.a(connectionType, this.f2465a)) {
                l4 l4Var = this.f2465a;
                l4Var.a(z1.this.b(l4Var));
            }
            int iA = z1.this.a(this.f2465a.c(), this.b);
            if (iA != e.NOT_SUPPORTED.a()) {
                this.f2465a.a("adUnit", Integer.valueOf(iA));
            }
            z1.this.a(this.f2465a, "reason");
            z1.this.a(this.f2465a, IronSourceConstants.EVENTS_EXT1);
            if (!z1.this.E.isEmpty()) {
                for (Map.Entry entry : z1.this.E.entrySet()) {
                    if (!this.f2465a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f2465a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (z1.this.i(this.f2465a)) {
                if (z1.this.h(this.f2465a) && !z1.this.e(this.f2465a)) {
                    this.f2465a.a("sessionDepth", Integer.valueOf(z1.this.c(this.f2465a)));
                }
                if (z1.this.j(this.f2465a)) {
                    z1.this.f(this.f2465a);
                } else if (!TextUtils.isEmpty(z1.this.e(this.f2465a.c())) && z1.this.k(this.f2465a)) {
                    l4 l4Var2 = this.f2465a;
                    l4Var2.a("placement", z1.this.e(l4Var2.c()));
                }
                long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(z1.this.v);
                if (firstSessionTimestamp != -1) {
                    this.f2465a.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                }
                IronLog.EVENT.verbose(this.f2465a.toString());
                z1.this.r.add(this.f2465a);
                z1.d(z1.this);
            }
            z1 z1Var = z1.this;
            boolean zA = z1Var.a(z1Var.B) ? z1.this.a(this.f2465a.c(), z1.this.B) : z1.this.d(this.f2465a);
            if (!z1.this.m && zA) {
                z1.this.m = true;
            }
            if (z1.this.p != null) {
                if (z1.this.g()) {
                    z1.this.f();
                    return;
                }
                z1 z1Var2 = z1.this;
                if (z1Var2.b((ArrayList<l4>) z1Var2.r) || zA) {
                    z1.this.a();
                }
            }
        }
    }

    class c implements f6 {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f2467a;
            final /* synthetic */ ArrayList b;

            a(boolean z, ArrayList arrayList) {
                this.f2467a = z;
                this.b = arrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (this.f2467a) {
                        ArrayList<l4> arrayListA = z1.this.p.a(z1.this.I);
                        z1.this.t = arrayListA.size() + z1.this.r.size();
                    } else {
                        IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                        z1.this.a(this.b);
                    }
                } catch (Exception e) {
                    if (z1.this.N != null) {
                        z1.this.N.onError(new IllegalStateException("Error on sending data ", e));
                    }
                }
                c.this.a(this.b);
            }
        }

        c() {
        }

        public void a(ArrayList<l4> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.json.f6
        public synchronized void a(ArrayList<l4> arrayList, boolean z) {
            z1.this.K.a(new a(z, arrayList));
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z1.this.f();
        }
    }

    public enum e {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a, reason: collision with root package name */
        private int f2469a;

        e(int i) {
            this.f2469a = i;
        }

        public int a() {
            return this.f2469a;
        }
    }

    private class f extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f2470a;

        f(String str) {
            super(str);
        }

        void a() {
            this.f2470a = new Handler(getLooper());
        }

        void a(Runnable runnable) {
            this.f2470a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, IronSource.AD_UNIT ad_unit) {
        e eVar;
        int iA = e.NOT_SUPPORTED.a();
        if (ad_unit == IronSource.AD_UNIT.OFFERWALL || i == 15 || (i >= 300 && i < 400)) {
            eVar = e.OFFERWALL;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000))) {
            eVar = e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000))) {
            eVar = e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
            eVar = e.BANNER;
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i < 4000 || i >= 5000) && (i < 94000 || i >= 95000))) {
                return iA;
            }
            eVar = e.NATIVE_AD;
        }
        return eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l4 l4Var, String str) {
        a(l4Var, str, 1024);
    }

    private void a(l4 l4Var, String str, int i) {
        JSONObject jSONObjectB = l4Var.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            String strOptString = jSONObjectB.optString(str, null);
            if (strOptString != null) {
                l4Var.a(str, strOptString.substring(0, Math.min(strOptString.length(), i)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(JSONObject jSONObject) throws JSONException {
        try {
            IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put("age", this.L.getAge());
                }
                if (!TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    jSONObject.put("iapt", this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.L.getUcd());
                }
            }
            oc ocVar = this.M;
            if (ocVar != null) {
                String strB = ocVar.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, l4 l4Var) {
        if (str.equalsIgnoreCase("none")) {
            return a(this.C) ? a(l4Var.c(), this.C) : this.J.contains(Integer.valueOf(l4Var.c()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(l4 l4Var) {
        return l4Var.c() + 90000;
    }

    private void b(String str) {
        com.json.e eVar = this.q;
        if (eVar == null || !eVar.c().equals(str)) {
            this.q = p4.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<l4> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    static /* synthetic */ int d(z1 z1Var) {
        int i = z1Var.t;
        z1Var.t = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(l4 l4Var) {
        JSONObject jSONObjectB = l4Var.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<l4> arrayListA;
        try {
            this.m = false;
            ArrayList<l4> arrayList = new ArrayList<>();
            try {
                synchronized (this.O) {
                    arrayListA = this.p.a(this.I);
                    this.p.b(this.I);
                }
                n4.c cVar = new n4.c(new n4.a(arrayListA, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject jSONObjectB = f5.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put(i5.r0, strB);
                    }
                    String strS = p.p().s();
                    if (!TextUtils.isEmpty(strS)) {
                        jSONObjectB.put("mt", strS);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new r4().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th2) {
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strA = this.q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.n) {
                    try {
                        strA = Base64.encodeToString(u8.a(strA, this.o), 0);
                    } catch (Exception e2) {
                        ISErrorListener iSErrorListener3 = this.N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e2));
                        }
                    }
                }
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new s4(new c(), strA, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(l4 l4Var) {
        if (l4Var == null) {
            return false;
        }
        if (a(this.z)) {
            return true ^ a(l4Var.c(), this.z);
        }
        if (a(this.A)) {
            return a(l4Var.c(), this.A);
        }
        return true;
    }

    @Override // com.json.e6
    public void a(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    public synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.I, this.H);
        this.H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.q.a(IronSourceUtils.getDefaultEventsURL(context, this.I, null));
        this.p = k3.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.getDefaultOptOutEvents(context, this.I);
        this.A = IronSourceUtils.getDefaultOptInEvents(context, this.I);
        this.B = IronSourceUtils.getDefaultTriggerEvents(context, this.I);
        this.C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.I);
        this.L = ironSourceSegment;
        this.v = context;
    }

    @Override // com.json.e6
    public synchronized void a(l4 l4Var) {
        a(l4Var, (IronSource.AD_UNIT) null);
    }

    public synchronized void a(l4 l4Var, IronSource.AD_UNIT ad_unit) {
        if (l4Var != null) {
            if (this.s) {
                this.K.a(new b(l4Var, ad_unit));
            }
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.N = iSErrorListener;
    }

    public synchronized void a(oc ocVar) {
        this.M = ocVar;
    }

    public void a(String str) {
        this.F = str;
    }

    @Override // com.json.e6
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.I, str);
        b(str);
    }

    protected void a(ArrayList<l4> arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    @Override // com.json.e6
    public void a(boolean z) {
        this.n = z;
    }

    @Override // com.json.e6
    public void a(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.I, iArr);
    }

    public String b() {
        return this.F;
    }

    @Override // com.json.e6
    public void b(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.json.e6
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.json.e eVar = this.q;
        if (eVar != null) {
            eVar.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.I, str);
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.json.e6
    public void b(boolean z) {
        this.s = z;
    }

    @Override // com.json.e6
    public void b(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.I, iArr);
    }

    protected abstract int c(l4 l4Var);

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.json.e6
    public void c(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    @Override // com.json.e6
    public void c(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.json.e6
    public void d(int i) {
        this.o = i;
    }

    @Override // com.json.e6
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.I, iArr);
    }

    protected abstract boolean d(l4 l4Var);

    protected abstract String e(int i);

    void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = p4.a(this.H, this.G);
        f fVar = new f(this.I + "EventThread");
        this.K = fVar;
        fVar.start();
        this.K.a();
        this.u = IronSourceUtils.getSessionId();
        this.J = new HashSet();
        d();
    }

    protected int f(int i) {
        return a(i, (IronSource.AD_UNIT) null);
    }

    protected abstract void f(l4 l4Var);

    protected boolean g(l4 l4Var) {
        return (l4Var.c() == 40 || l4Var.c() == 41 || l4Var.c() == 50 || l4Var.c() == 51 || l4Var.c() == 52) ? false : true;
    }

    public void h() {
        this.K.a(new d());
    }

    protected boolean h(l4 l4Var) {
        return (l4Var.c() == 14 || l4Var.c() == 114 || l4Var.c() == 514 || l4Var.c() == 140 || l4Var.c() == 40 || l4Var.c() == 41 || l4Var.c() == 50 || l4Var.c() == 51 || l4Var.c() == 52) ? false : true;
    }

    protected abstract boolean j(l4 l4Var);

    protected abstract boolean k(l4 l4Var);
}
