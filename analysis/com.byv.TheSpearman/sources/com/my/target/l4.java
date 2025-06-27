package com.my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.Reward;
import com.my.target.c;
import com.my.target.d;
import com.my.target.q5;
import com.my.target.w4;
import com.my.target.z0;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class l4 implements w4, q5.a {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f4038a;
    public final u5 b;
    public final q5 c;
    public final WeakReference<Activity> d;
    public final Context e;
    public final Handler f;
    public final c g;
    public final i h;
    public String i;
    public Integer j;
    public f k;
    public v5 l;
    public w4.a m;
    public u3 n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public s5 t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l4.this.g();
        }
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f4040a;

        public b(com.my.target.b bVar) {
            this.f4040a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            w4.a aVar = l4.this.m;
            if (aVar != null) {
                aVar.a(this.f4040a, context);
            }
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final z0 f4041a;

        public c(z0 z0Var) {
            this.f4041a = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ba.a("InterstitialMraidPresenter$ShowCloseButtonRunnable: Banner became just closeable");
            this.f4041a.setCloseVisible(true);
        }
    }

    public l4(Context context) {
        this(q5.b("interstitial"), new Handler(Looper.getMainLooper()), new z0(context), context);
    }

    public l4(q5 q5Var, Handler handler, z0 z0Var, Context context) {
        this.s = true;
        this.t = s5.b();
        this.c = q5Var;
        this.e = context.getApplicationContext();
        this.f = handler;
        this.f4038a = z0Var;
        this.d = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.i = "loading";
        this.b = u5.e();
        z0Var.setOnCloseListener(new z0.a() { // from class: com.my.target.l4$$ExternalSyntheticLambda0
            @Override // com.my.target.z0.a
            public final void c() {
                this.f$0.h();
            }
        });
        this.g = new c(z0Var);
        this.h = new i(context);
        q5Var.a(this);
    }

    public static l4 a(Context context) {
        return new l4(context);
    }

    @Override // com.my.target.m4
    public void a() {
        this.o = false;
        v5 v5Var = this.l;
        if (v5Var != null) {
            v5Var.e();
        }
        long j = this.p;
        if (j > 0) {
            a(j);
        }
    }

    @Override // com.my.target.w4
    public void a(int i) {
        v5 v5Var;
        this.f.removeCallbacks(this.g);
        if (!this.o) {
            this.o = true;
            if (i <= 0 && (v5Var = this.l) != null) {
                v5Var.a(true);
            }
        }
        ViewParent parent = this.f4038a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f4038a);
        }
        this.c.a();
        v5 v5Var2 = this.l;
        if (v5Var2 != null) {
            v5Var2.a(i);
            this.l = null;
        }
        this.f4038a.removeAllViews();
    }

    public final void a(long j) {
        this.f.removeCallbacks(this.g);
        this.q = System.currentTimeMillis();
        this.f.postDelayed(this.g, j);
    }

    @Override // com.my.target.q5.a
    public void a(Uri uri) {
        w4.a aVar = this.m;
        if (aVar != null) {
            aVar.a(this.n, uri.toString(), this.f4038a.getContext());
        }
    }

    public final void a(com.my.target.b bVar) {
        com.my.target.c adChoices = bVar.getAdChoices();
        if (adChoices == null) {
            this.h.setVisibility(8);
            return;
        }
        if (this.h.getParent() != null) {
            return;
        }
        int iA = ca.a(10, this.e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iA, iA, iA, iA);
        this.f4038a.addView(this.h, layoutParams);
        this.h.setImageBitmap(adChoices.c().getBitmap());
        this.h.setOnClickListener(new a());
        List<c.a> listA = adChoices.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new h1());
        this.k = fVarA;
        fVarA.a(new b(bVar));
    }

    @Override // com.my.target.w4
    public void a(e4 e4Var, u3 u3Var) {
        this.n = u3Var;
        long allowCloseDelay = (long) (u3Var.getAllowCloseDelay() * 1000.0f);
        this.p = allowCloseDelay;
        if (allowCloseDelay > 0) {
            this.f4038a.setCloseVisible(false);
            ba.a("InterstitialMraidPresenter: Banner will be allowed to close in " + this.p + " millis");
            a(this.p);
        } else {
            ba.a("InterstitialMraidPresenter: Banner is allowed to close");
            this.f4038a.setCloseVisible(true);
        }
        String source = u3Var.getSource();
        if (source != null) {
            b(source);
        }
        a(u3Var);
    }

    @Override // com.my.target.q5.a
    public void a(q5 q5Var, WebView webView) {
        u3 u3Var;
        this.i = Reward.DEFAULT;
        l();
        ArrayList<String> arrayList = new ArrayList<>();
        if (j()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        q5Var.a(arrayList);
        q5Var.d("interstitial");
        q5Var.a(q5Var.c());
        c(Reward.DEFAULT);
        q5Var.d();
        q5Var.a(this.b);
        w4.a aVar = this.m;
        if (aVar == null || (u3Var = this.n) == null) {
            return;
        }
        aVar.a(u3Var, this.f4038a);
        this.m.a(webView);
    }

    @Override // com.my.target.w4
    public void a(w4.a aVar) {
        this.m = aVar;
    }

    @Override // com.my.target.q5.a
    public void a(boolean z) {
        this.c.a(z);
    }

    @Override // com.my.target.q5.a
    public boolean a(float f, float f2) {
        w4.a aVar;
        u3 u3Var;
        if (!this.r) {
            this.c.a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        if (f < 0.0f || f2 < 0.0f || (aVar = this.m) == null || (u3Var = this.n) == null) {
            return true;
        }
        aVar.a(u3Var, f, f2, this.e);
        return true;
    }

    public final boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    @Override // com.my.target.q5.a
    public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
        ba.a("InterstitialMraidPresenter: SetResizeProperties method not used with interstitials");
        return false;
    }

    @Override // com.my.target.q5.a
    public boolean a(ConsoleMessage consoleMessage, q5 q5Var) {
        ba.a("InterstitialMraidPresenter: Console message - " + consoleMessage.message());
        return true;
    }

    public boolean a(s5 s5Var) {
        if ("none".equals(s5Var.toString())) {
            return true;
        }
        Activity activity = this.d.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i = activityInfo.screenOrientation;
            return i != -1 ? i == s5Var.a() : a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.my.target.q5.a
    public boolean a(String str) {
        if (!this.r) {
            this.c.a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        w4.a aVar = this.m;
        boolean z = aVar != null;
        u3 u3Var = this.n;
        if ((u3Var != null) & z) {
            aVar.b(u3Var, str, this.e);
        }
        return true;
    }

    @Override // com.my.target.q5.a
    public boolean a(String str, JsResult jsResult) {
        ba.a("InterstitialMraidPresenter: JS Alert - " + str);
        jsResult.confirm();
        return true;
    }

    @Override // com.my.target.q5.a
    public boolean a(boolean z, s5 s5Var) {
        if (a(s5Var)) {
            this.s = z;
            this.t = s5Var;
            return f();
        }
        this.c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Unable to force orientation to " + s5Var);
        return false;
    }

    @Override // com.my.target.q5.a
    public void b() {
        l();
    }

    public void b(String str) {
        v5 v5Var = new v5(this.e);
        this.l = v5Var;
        this.c.a(v5Var);
        this.f4038a.addView(this.l, new FrameLayout.LayoutParams(-1, -1));
        this.c.f(str);
    }

    public boolean b(int i) {
        Activity activity = this.d.get();
        if (activity != null && a(this.t)) {
            if (this.j == null) {
                this.j = Integer.valueOf(activity.getRequestedOrientation());
            }
            activity.setRequestedOrientation(i);
            return true;
        }
        this.c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Attempted to lock orientation to unsupported value: " + this.t.toString());
        return false;
    }

    @Override // com.my.target.q5.a
    public boolean b(Uri uri) {
        ba.a("InterstitialMraidPresenter: Expand method not used with interstitials");
        return false;
    }

    @Override // com.my.target.q5.a
    public void c() {
        h();
    }

    public final void c(String str) {
        ba.a("InterstitialMraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.c.e(str);
        if ("hidden".equals(str)) {
            ba.a("InterstitialMraidPresenter: Mraid on close");
            w4.a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.my.target.q5.a
    public void d() {
        this.r = true;
    }

    @Override // com.my.target.m4
    public void destroy() {
        a(0);
    }

    @Override // com.my.target.q5.a
    public boolean e() {
        ba.a("InterstitialMraidPresenter: Resize method not used with interstitials");
        return false;
    }

    public boolean f() {
        if (!"none".equals(this.t.toString())) {
            return b(this.t.a());
        }
        if (this.s) {
            k();
            return true;
        }
        Activity activity = this.d.get();
        if (activity != null) {
            return b(ca.a(activity));
        }
        this.c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    public void g() {
        com.my.target.c adChoices;
        u3 u3Var = this.n;
        if (u3Var == null || (adChoices = u3Var.getAdChoices()) == null) {
            return;
        }
        f fVar = this.k;
        if (fVar == null || !fVar.b()) {
            Activity activity = this.d.get();
            if (fVar == null || activity == null) {
                j3.a(adChoices.b(), this.e);
            } else {
                fVar.a(activity);
            }
        }
    }

    @Override // com.my.target.m4
    public View getCloseButton() {
        return null;
    }

    public void h() {
        if (this.l == null || "loading".equals(this.i) || "hidden".equals(this.i)) {
            return;
        }
        k();
        if (Reward.DEFAULT.equals(this.i)) {
            this.f4038a.setVisibility(4);
            c("hidden");
        }
    }

    @Override // com.my.target.m4
    public View i() {
        return this.f4038a;
    }

    public final boolean j() {
        v5 v5Var;
        Activity activity = this.d.get();
        if (activity == null || (v5Var = this.l) == null) {
            return false;
        }
        return ca.a(activity, v5Var);
    }

    public void k() {
        Integer num;
        Activity activity = this.d.get();
        if (activity != null && (num = this.j) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.j = null;
    }

    public final void l() {
        DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
        this.b.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // com.my.target.m4
    public void pause() {
        this.o = true;
        v5 v5Var = this.l;
        if (v5Var != null) {
            v5Var.a(false);
        }
        this.f.removeCallbacks(this.g);
        if (this.q > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.q;
            if (jCurrentTimeMillis > 0) {
                long j = this.p;
                if (jCurrentTimeMillis < j) {
                    this.p = j - jCurrentTimeMillis;
                    return;
                }
            }
            this.p = 0L;
        }
    }

    @Override // com.my.target.m4
    public void stop() {
        this.o = true;
        v5 v5Var = this.l;
        if (v5Var != null) {
            v5Var.a(false);
        }
    }
}
