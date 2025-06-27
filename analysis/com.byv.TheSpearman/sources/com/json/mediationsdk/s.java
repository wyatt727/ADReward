package com.json.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.json.ApplicationGeneralSettings;
import com.json.e3;
import com.json.environment.ContextProvider;
import com.json.environment.NetworkStateReceiver;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f5;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.integration.IntegrationHelper;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.p;
import com.json.mediationsdk.sdk.SegmentListener;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.o0;
import com.json.oc;
import com.json.q0;
import com.json.qa;
import com.json.qc;
import com.json.v3;
import com.json.x8;
import com.json.za;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
class s implements qa {
    private static s A;

    /* renamed from: a, reason: collision with root package name */
    private qc f1988a;
    private NetworkStateReceiver o;
    private CountDownTimer p;
    private String s;
    private com.json.mediationsdk.utils.c t;
    private SegmentListener v;
    private long x;
    private int b = e.f;
    private final String c = "appKey";
    private final String d = getClass().getSimpleName();
    private boolean k = false;
    private boolean m = false;
    private List<za> q = new ArrayList();
    private String r = "";
    private f z = new a();
    private d u = d.NOT_INIT;
    private Handler l = IronSourceThreadManager.INSTANCE.getInitHandler();
    private int e = 1;
    private int f = 0;
    private int g = 62;
    private int h = 12;
    private int i = 5;
    private AtomicBoolean n = new AtomicBoolean(true);
    private boolean j = false;
    private boolean w = false;
    private x8 y = new x8();

    class a extends f {
        a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            oc ocVarI;
            try {
                p pVarP = p.p();
                c0.f().a();
                if (!TextUtils.isEmpty(s.this.r)) {
                    f5.a().a("userId", s.this.r);
                }
                if (!TextUtils.isEmpty(s.this.s)) {
                    f5.a().a("appKey", s.this.s);
                }
                s.this.y.h(s.this.r);
                s.this.x = new Date().getTime();
                s.this.t = pVarP.b(ContextProvider.getInstance().getApplicationContext(), s.this.r, this.c);
                if (s.this.t == null) {
                    if (s.this.f == 3) {
                        s.this.w = true;
                        Iterator it = s.this.q.iterator();
                        while (it.hasNext()) {
                            ((za) it.next()).a();
                        }
                    }
                    if (this.f1994a && s.this.f < s.this.g) {
                        s.this.j = true;
                        s.this.l.postDelayed(this, s.this.e * 1000);
                        if (s.this.f < s.this.h) {
                            s.a(s.this, 2);
                        }
                    }
                    if ((!this.f1994a || s.this.f == s.this.i) && !s.this.k) {
                        s.this.k = true;
                        if (TextUtils.isEmpty(this.b)) {
                            this.b = IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_SERVER_RESPONSE;
                        }
                        Iterator it2 = s.this.q.iterator();
                        while (it2.hasNext()) {
                            ((za) it2.next()).d(this.b);
                        }
                        s.this.b(d.INIT_FAILED);
                        s.this.f();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    s.f(s.this);
                    return;
                }
                s.this.l.removeCallbacks(this);
                if (!s.this.t.m()) {
                    if (s.this.k) {
                        return;
                    }
                    s.this.b(d.INIT_FAILED);
                    s.this.f();
                    s.this.k = true;
                    Iterator it3 = s.this.q.iterator();
                    while (it3.hasNext()) {
                        ((za) it3.next()).d(IronSourceConstants.FALSE_AVAILABILITY_REASON_SERVER_RESPONSE_IS_NOT_VALID);
                    }
                    return;
                }
                s.this.b(d.INITIATED);
                s.this.f();
                s.this.b(pVarP.C());
                ApplicationGeneralSettings applicationGeneralSettingsE = s.this.t.b().getApplicationConfigurations().e();
                if (applicationGeneralSettingsE != null) {
                    v3 v3Var = v3.f2345a;
                    v3Var.c(applicationGeneralSettingsE.getShouldUseAppSet());
                    v3Var.a(applicationGeneralSettingsE.getShouldReuseAdvId());
                    v3Var.a(applicationGeneralSettingsE.getUserAgentExpirationThresholdInHours());
                    IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(applicationGeneralSettingsE.getShouldUseSharedThreadPool());
                }
                s.this.a(ContextProvider.getInstance().getApplicationContext(), s.this.t);
                pVarP.a(new Date().getTime() - s.this.x);
                s.this.f1988a = new qc();
                s.this.f1988a.a();
                if (s.this.t.b().getApplicationConfigurations().f() && ContextProvider.getInstance().getApplicationContext() != null) {
                    IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                }
                List<IronSource.AD_UNIT> listE = s.this.t.e();
                Iterator it4 = s.this.q.iterator();
                while (it4.hasNext()) {
                    ((za) it4.next()).a(listE, s.this.g(), s.this.t.b());
                }
                if (s.this.v != null && (ocVarI = s.this.t.b().getApplicationConfigurations().i()) != null && !TextUtils.isEmpty(ocVarI.c())) {
                    s.this.v.onSegmentReceived(ocVarI.c());
                }
                q0 q0VarC = s.this.t.b().getApplicationConfigurations().c();
                if (q0VarC.f()) {
                    e3.d().a(ContextProvider.getInstance(), q0VarC.b(), q0VarC.d(), q0VarC.c(), q0VarC.e(), IronSourceUtils.getSessionId(), q0VarC.a(), q0VarC.g());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class b implements Runnable {

        class a extends CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (s.this.k) {
                    return;
                }
                s.this.k = true;
                Iterator it = s.this.q.iterator();
                while (it.hasNext()) {
                    ((za) it.next()).d(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    s.this.w = true;
                    Iterator it = s.this.q.iterator();
                    while (it.hasNext()) {
                        ((za) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.p = new a(60000L, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS).start();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1991a;

        static {
            int[] iArr = new int[d.values().length];
            f1991a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1991a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1991a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static int f1993a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    abstract class f implements Runnable {
        String b;

        /* renamed from: a, reason: collision with root package name */
        boolean f1994a = true;
        protected p.c c = new a();

        class a implements p.c {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.f1994a = false;
                fVar.b = str;
            }
        }

        f() {
        }
    }

    private s() {
    }

    private static int a(d dVar) {
        int i = c.f1991a[dVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? e.f1993a : e.b : e.e : e.d;
    }

    static /* synthetic */ int a(s sVar, int i) {
        int i2 = sVar.e * i;
        sVar.e = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + this.u + ", new status: " + dVar + ")");
        this.u = dVar;
    }

    public static synchronized s c() {
        if (A == null) {
            A = new s();
        }
        return A;
    }

    static /* synthetic */ int f(s sVar) {
        int i = sVar.f;
        sVar.f = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.j;
    }

    public synchronized d a() {
        return this.u;
    }

    public void a(Context context, com.json.mediationsdk.utils.c cVar) {
        this.y.h(cVar.d().h());
        this.y.b(cVar.d().d());
        o0 applicationConfigurations = cVar.b().getApplicationConfigurations();
        this.y.a(applicationConfigurations.a());
        this.y.c(applicationConfigurations.b().b());
        this.y.b(applicationConfigurations.j().b());
        this.y.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        this.y.b(cVar.b().getApplicationConfigurations().e().getCmpId());
    }

    public synchronized void a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            AtomicBoolean atomicBoolean = this.n;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.d + ": Multiple calls to init are not allowed", 2);
            } else {
                b(d.INIT_IN_PROGRESS);
                this.r = str2;
                this.s = str;
                if (IronSourceUtils.isNetworkConnected(context)) {
                    this.l.post(this.z);
                } else {
                    this.m = true;
                    if (this.o == null) {
                        this.o = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(SegmentListener segmentListener) {
        this.v = segmentListener;
    }

    public void a(za zaVar) {
        if (zaVar == null) {
            return;
        }
        this.q.add(zaVar);
    }

    @Override // com.json.qa
    public void a(boolean z) {
        if (this.m && z) {
            CountDownTimer countDownTimer = this.p;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.m = false;
            this.j = true;
            this.l.post(this.z);
        }
    }

    public int b() {
        return this.b;
    }

    public void b(za zaVar) {
        if (zaVar == null || this.q.size() == 0) {
            return;
        }
        this.q.remove(zaVar);
    }

    public void b(boolean z) {
        Map<String, String> mapB;
        if (z && TextUtils.isEmpty(p.p().s()) && (mapB = this.t.b().getApplicationConfigurations().d().b()) != null && !mapB.isEmpty()) {
            for (String str : mapB.keySet()) {
                if (IronSourceUtils.doesClassExist(str)) {
                    String str2 = mapB.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    p.p().h(str);
                    return;
                }
            }
        }
    }

    public synchronized boolean d() {
        return this.w;
    }

    void e() {
        b(d.INIT_FAILED);
        f();
    }

    public synchronized void f() {
        int iA = a(this.u);
        this.b = iA;
        this.y.c(iA);
    }
}
