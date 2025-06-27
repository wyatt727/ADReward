package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.json.t2;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.k;
import com.my.target.q5;
import com.my.target.s9;
import com.my.target.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class t5 implements s9, k.a {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f4129a;
    public final Context b;
    public final u5 c;
    public final z0.a d;
    public final a e;
    public final q5.a f;
    public final q5 g;
    public final WeakReference<Activity> h;
    public String i;
    public q5 j;
    public v5 k;
    public s9.a l;
    public c m;
    public j9 n;
    public boolean o;
    public z0 p;
    public k q;
    public ViewGroup r;
    public f s;
    public v5 t;
    public Uri u;
    public e v;

    public final class a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final q5 f4130a;

        public a(q5 q5Var) {
            this.f4130a = q5Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            t5 t5Var = t5.this;
            t5Var.s = null;
            t5Var.c();
            this.f4130a.a(t5.this.c);
        }
    }

    public final class b implements z0.a {
        public b() {
        }

        @Override // com.my.target.z0.a
        public void c() {
            k kVar = t5.this.q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }
    }

    public interface c {
        void a(float f, float f2, j9 j9Var, Context context);

        void a(String str, j9 j9Var, Context context);

        void b();

        void c();

        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);
    }

    public static final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final q5 f4132a;
        public final j9 b;
        public final Context c;
        public final k d;
        public final Uri e;

        public d(j9 j9Var, k kVar, Uri uri, q5 q5Var, Context context) {
            this.b = j9Var;
            this.c = context.getApplicationContext();
            this.d = kVar;
            this.e = uri;
            this.f4132a = q5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f4132a.f(str);
            } else {
                this.f4132a.a("expand", "Failed to handling mraid");
                this.d.dismiss();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strA = a1.a(this.b.getMraidJs(), x1.a().a(this.e.toString(), null, this.c).c());
            c0.d(new Runnable() { // from class: com.my.target.t5$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(strA);
                }
            });
        }
    }

    public final class e implements q5.a {

        /* renamed from: a, reason: collision with root package name */
        public final q5 f4133a;
        public final String b;

        public e(q5 q5Var, String str) {
            this.f4133a = q5Var;
            this.b = str;
        }

        public void a() {
            t5 t5Var = t5.this;
            z0 z0Var = t5Var.p;
            if (z0Var == null || t5Var.k == null) {
                return;
            }
            if (z0Var.getParent() != null) {
                ((ViewGroup) t5.this.p.getParent()).removeView(t5.this.p);
                t5.this.p.removeAllViews();
                t5.this.p.setOnCloseListener(null);
                t5 t5Var2 = t5.this;
                t5Var2.p = null;
                t5Var2.a(t5Var2.k);
                t5.this.a(Reward.DEFAULT);
            }
            c cVar = t5.this.m;
            if (cVar != null) {
                cVar.c();
            }
        }

        @Override // com.my.target.q5.a
        public void a(Uri uri) {
            j9 j9Var;
            t5 t5Var = t5.this;
            s9.a aVar = t5Var.l;
            if (aVar == null || (j9Var = t5Var.n) == null) {
                return;
            }
            aVar.a(j9Var, uri.toString());
        }

        @Override // com.my.target.q5.a
        public void a(q5 q5Var, WebView webView) {
            t5 t5Var;
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("MraidPresenter$MyMraidBridgeListener: onPageLoaded callback from ");
            sb.append(q5Var == t5.this.j ? " second " : " primary ");
            sb.append(t2.h.K);
            ba.a(sb.toString());
            ArrayList<String> arrayList = new ArrayList<>();
            if (t5.this.b()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            q5Var.a(arrayList);
            q5Var.d(this.b);
            q5Var.a(q5Var.c());
            k kVar = t5.this.q;
            if (kVar == null || !kVar.isShowing()) {
                t5Var = t5.this;
                str = Reward.DEFAULT;
            } else {
                t5Var = t5.this;
                str = "expanded";
            }
            t5Var.a(str);
            q5Var.d();
            t5 t5Var2 = t5.this;
            if (q5Var != t5Var2.j) {
                c cVar = t5Var2.m;
                if (cVar != null) {
                    cVar.onLoad();
                }
                s9.a aVar = t5.this.l;
                if (aVar != null) {
                    aVar.a(webView);
                }
            }
        }

        @Override // com.my.target.q5.a
        public void a(boolean z) {
            if (!z || t5.this.q == null) {
                this.f4133a.a(z);
            }
        }

        @Override // com.my.target.q5.a
        public boolean a(float f, float f2) {
            c cVar;
            j9 j9Var;
            t5 t5Var = t5.this;
            if (!t5Var.o) {
                this.f4133a.a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            if (f < 0.0f || f2 < 0.0f || (cVar = t5Var.m) == null || (j9Var = t5Var.n) == null) {
                return true;
            }
            cVar.a(f, f2, j9Var, t5Var.b);
            return true;
        }

        @Override // com.my.target.q5.a
        public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
            q5 q5Var;
            String str;
            t5.this.s = new f();
            t5 t5Var = t5.this;
            if (t5Var.r == null) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: container view for resize is not defined");
                q5Var = this.f4133a;
                str = "container view for resize is not defined";
            } else if (i < 50 || i2 < 50) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: properties cannot be less than closeable container");
                q5Var = this.f4133a;
                str = "properties cannot be less than closeable container";
            } else {
                ca caVarE = ca.e(t5Var.b);
                t5.this.s.a(z);
                t5.this.s.a(caVarE.b(i), caVarE.b(i2), caVarE.b(i3), caVarE.b(i4), i5);
                if (z) {
                    return true;
                }
                Rect rect = new Rect();
                t5.this.r.getGlobalVisibleRect(rect);
                if (t5.this.s.a(rect)) {
                    return true;
                }
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + "," + rect.height() + ") resize properties: (" + t5.this.s.b() + "," + t5.this.s.a() + ")");
                q5Var = this.f4133a;
                str = "resize properties with allowOffscreen false out of viewport";
            }
            q5Var.a("setResizeProperties", str);
            t5.this.s = null;
            return false;
        }

        @Override // com.my.target.q5.a
        public boolean a(ConsoleMessage consoleMessage, q5 q5Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("MraidPresenter$MyMraidBridgeListener: Console message: from ");
            sb.append(q5Var == t5.this.j ? " second " : " primary ");
            sb.append("webview: ");
            sb.append(consoleMessage.message());
            ba.a(sb.toString());
            return true;
        }

        @Override // com.my.target.q5.a
        public boolean a(String str) {
            j9 j9Var;
            t5 t5Var = t5.this;
            if (!t5Var.o) {
                this.f4133a.a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            c cVar = t5Var.m;
            if (cVar == null || (j9Var = t5Var.n) == null) {
                return true;
            }
            cVar.a(str, j9Var, t5Var.b);
            return true;
        }

        @Override // com.my.target.q5.a
        public boolean a(String str, JsResult jsResult) {
            ba.a("MraidPresenter$MyMraidBridgeListener: JS Alert - " + str);
            jsResult.confirm();
            return true;
        }

        @Override // com.my.target.q5.a
        public boolean a(boolean z, s5 s5Var) {
            ba.a("MraidPresenter$MyMraidBridgeListener: Orientation properties isn't supported in standard banners");
            return false;
        }

        @Override // com.my.target.q5.a
        public void b() {
        }

        @Override // com.my.target.q5.a
        public boolean b(Uri uri) {
            return t5.this.a(uri);
        }

        @Override // com.my.target.q5.a
        public void c() {
            k kVar = t5.this.q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }

        @Override // com.my.target.q5.a
        public void d() {
            t5.this.o = true;
        }

        @Override // com.my.target.q5.a
        public boolean e() {
            v5 v5Var;
            if (!t5.this.i.equals(Reward.DEFAULT)) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - wrong state for resize - " + t5.this.i);
                this.f4133a.a("resize", "wrong state for resize " + t5.this.i);
                return false;
            }
            t5 t5Var = t5.this;
            f fVar = t5Var.s;
            if (fVar == null) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - resize properties not set");
                this.f4133a.a("resize", "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = t5Var.r;
            if (viewGroup == null || (v5Var = t5Var.k) == null) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not initialized");
                this.f4133a.a("resize", "views not initialized");
                return false;
            }
            if (!fVar.a(viewGroup, v5Var)) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not visible");
                this.f4133a.a("resize", "views not visible");
                return false;
            }
            t5.this.p = new z0(t5.this.b);
            t5 t5Var2 = t5.this;
            t5Var2.s.a(t5Var2.p);
            t5 t5Var3 = t5.this;
            if (!t5Var3.s.b(t5Var3.p)) {
                ba.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - close button is out of visible range");
                this.f4133a.a("resize", "close button is out of visible range");
                t5.this.p = null;
                return false;
            }
            ViewGroup viewGroup2 = (ViewGroup) t5.this.k.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(t5.this.k);
            }
            t5 t5Var4 = t5.this;
            t5Var4.p.addView(t5Var4.k, new FrameLayout.LayoutParams(-1, -1));
            t5.this.p.setOnCloseListener(new z0.a() { // from class: com.my.target.t5$e$$ExternalSyntheticLambda0
                @Override // com.my.target.z0.a
                public final void c() {
                    this.f$0.a();
                }
            });
            t5 t5Var5 = t5.this;
            t5Var5.r.addView(t5Var5.p);
            t5.this.a("resized");
            c cVar = t5.this.m;
            if (cVar == null) {
                return true;
            }
            cVar.b();
            return true;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4134a = true;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public Rect i;
        public Rect j;

        public int a() {
            return this.e;
        }

        public void a(int i, int i2, int i3, int i4, int i5) {
            this.d = i;
            this.e = i2;
            this.b = i3;
            this.c = i4;
            this.f = i5;
        }

        public void a(z0 z0Var) {
            Rect rect;
            Rect rect2 = this.j;
            if (rect2 == null || (rect = this.i) == null) {
                ba.a("MraidPresenter$ResizeHelper: Setup views before resizing");
                return;
            }
            int i = (rect2.top - rect.top) + this.c;
            this.g = i;
            this.h = (rect2.left - rect.left) + this.b;
            if (!this.f4134a) {
                if (i + this.e > rect.height()) {
                    ba.a("MraidPresenter$ResizeHelper: Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                    this.g = this.i.height() - this.e;
                }
                if (this.h + this.d > this.i.width()) {
                    ba.a("MraidPresenter$ResizeHelper: Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                    this.h = this.i.width() - this.d;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d, this.e);
            layoutParams.topMargin = this.g;
            layoutParams.leftMargin = this.h;
            z0Var.setLayoutParams(layoutParams);
            z0Var.setCloseGravity(this.f);
        }

        public void a(boolean z) {
            this.f4134a = z;
        }

        public boolean a(Rect rect) {
            return this.d <= rect.width() && this.e <= rect.height();
        }

        public boolean a(ViewGroup viewGroup, v5 v5Var) {
            this.i = new Rect();
            this.j = new Rect();
            return viewGroup.getGlobalVisibleRect(this.i) && v5Var.getGlobalVisibleRect(this.j);
        }

        public int b() {
            return this.d;
        }

        public boolean b(z0 z0Var) {
            if (this.i == null) {
                return false;
            }
            int i = this.h;
            int i2 = this.g;
            Rect rect = this.i;
            Rect rect2 = new Rect(i, i2, rect.right, rect.bottom);
            int i3 = this.h;
            int i4 = this.g;
            Rect rect3 = new Rect(i3, i4, this.d + i3, this.e + i4);
            Rect rect4 = new Rect();
            z0Var.b(this.f, rect3, rect4);
            return rect2.contains(rect4);
        }
    }

    public t5(ViewGroup viewGroup) {
        this(q5.b("inline"), new v5(viewGroup.getContext()), new f1(viewGroup.getContext()), viewGroup);
    }

    public t5(q5 q5Var, v5 v5Var, f1 f1Var, ViewGroup viewGroup) {
        View rootView;
        this.d = new b();
        this.g = q5Var;
        this.k = v5Var;
        this.f4129a = f1Var;
        Context context = viewGroup.getContext();
        this.b = context;
        if (!(context instanceof Activity)) {
            this.h = new WeakReference<>(null);
            rootView = viewGroup.getRootView();
            if (rootView != null) {
                ViewGroup viewGroup2 = (ViewGroup) rootView.findViewById(android.R.id.content);
                this.r = viewGroup2;
                if (viewGroup2 == null) {
                }
            }
            this.i = "loading";
            this.c = u5.e();
            e eVar = new e(q5Var, "inline");
            this.f = eVar;
            q5Var.a(eVar);
            a aVar = new a(q5Var);
            this.e = aVar;
            this.k.addOnLayoutChangeListener(aVar);
            a(v5Var);
        }
        Activity activity = (Activity) context;
        this.h = new WeakReference<>(activity);
        rootView = activity.getWindow().getDecorView().findViewById(android.R.id.content);
        this.r = (ViewGroup) rootView;
        this.i = "loading";
        this.c = u5.e();
        e eVar2 = new e(q5Var, "inline");
        this.f = eVar2;
        q5Var.a(eVar2);
        a aVar2 = new a(q5Var);
        this.e = aVar2;
        this.k.addOnLayoutChangeListener(aVar2);
        a(v5Var);
    }

    public static t5 a(ViewGroup viewGroup) {
        return new t5(viewGroup);
    }

    @Override // com.my.target.s9
    public void a() {
        v5 v5Var;
        if ((this.q == null || this.j != null) && (v5Var = this.k) != null) {
            v5Var.e();
        }
    }

    @Override // com.my.target.s9
    public void a(int i) {
        a("hidden");
        a((c) null);
        a((s9.a) null);
        this.g.a();
        z0 z0Var = this.p;
        if (z0Var != null) {
            z0Var.removeAllViews();
            this.p.setOnCloseListener(null);
            ViewParent parent = this.p.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.p);
            }
            this.p = null;
        }
        v5 v5Var = this.k;
        if (v5Var != null) {
            if (i <= 0) {
                v5Var.a(true);
            }
            if (this.k.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
            }
            this.k.a(i);
            this.k = null;
        }
        q5 q5Var = this.j;
        if (q5Var != null) {
            q5Var.a();
            this.j = null;
        }
        v5 v5Var2 = this.t;
        if (v5Var2 != null) {
            v5Var2.a(true);
            if (this.t.getParent() != null) {
                ((ViewGroup) this.t.getParent()).removeView(this.t);
            }
            this.t.a(0);
            this.t = null;
        }
    }

    public final void a(IAdLoadingError iAdLoadingError) {
        c cVar = this.m;
        if (cVar != null) {
            cVar.onNoAd(iAdLoadingError);
        }
    }

    @Override // com.my.target.s9
    public void a(j9 j9Var) {
        v5 v5Var;
        this.n = j9Var;
        String source = j9Var.getSource();
        if (source == null || (v5Var = this.k) == null) {
            a(m.q);
        } else {
            this.g.a(v5Var);
            this.g.f(source);
        }
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        this.q = kVar;
        z0 z0Var = this.p;
        if (z0Var != null && z0Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        z0 z0Var2 = new z0(this.b);
        this.p = z0Var2;
        a(z0Var2, frameLayout);
    }

    public void a(q5 q5Var, v5 v5Var, z0 z0Var) {
        Uri uri;
        e eVar = new e(q5Var, "inline");
        this.v = eVar;
        q5Var.a(eVar);
        z0Var.addView(v5Var, new ViewGroup.LayoutParams(-1, -1));
        q5Var.a(v5Var);
        k kVar = this.q;
        if (kVar == null) {
            return;
        }
        j9 j9Var = this.n;
        if (j9Var == null || (uri = this.u) == null) {
            kVar.dismiss();
        } else {
            c0.b(new d(j9Var, kVar, uri, q5Var, this.b));
        }
    }

    @Override // com.my.target.s9
    public void a(s9.a aVar) {
        this.l = aVar;
    }

    public void a(c cVar) {
        this.m = cVar;
    }

    public void a(v5 v5Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.f4129a.addView(v5Var, 0);
        v5Var.setLayoutParams(layoutParams);
    }

    public void a(z0 z0Var, FrameLayout frameLayout) {
        this.f4129a.setVisibility(8);
        frameLayout.addView(z0Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.u != null) {
            this.j = q5.b("inline");
            v5 v5Var = new v5(this.b);
            this.t = v5Var;
            a(this.j, v5Var, z0Var);
        } else {
            v5 v5Var2 = this.k;
            if (v5Var2 != null && v5Var2.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
                z0Var.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
                a("expanded");
            }
        }
        z0Var.setCloseVisible(true);
        z0Var.setOnCloseListener(this.d);
        c cVar = this.m;
        if (cVar != null && this.u == null) {
            cVar.b();
        }
        ba.a("MraidPresenter: MRAID dialog create");
    }

    public void a(String str) {
        ba.a("MraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.g.e(str);
        q5 q5Var = this.j;
        if (q5Var != null) {
            q5Var.e(str);
        }
        if ("hidden".equals(str)) {
            ba.a("MraidPresenter: Mraid on close");
        }
    }

    @Override // com.my.target.s9
    public void a(boolean z) {
        v5 v5Var;
        if ((this.q == null || this.j != null) && (v5Var = this.k) != null) {
            v5Var.a(z);
        }
    }

    public boolean a(Uri uri) {
        if (this.k == null) {
            ba.a("MraidPresenter: Cannot expand - webview destroyed");
            return false;
        }
        if (!this.i.equals(Reward.DEFAULT) && !this.i.equals("resized")) {
            return false;
        }
        this.u = uri;
        k.a(this, this.b).show();
        return true;
    }

    @Override // com.my.target.k.a
    public void b(boolean z) {
        q5 q5Var = this.j;
        if (q5Var == null) {
            q5Var = this.g;
        }
        q5Var.a(z);
        v5 v5Var = this.t;
        if (v5Var == null) {
            return;
        }
        if (z) {
            v5Var.e();
        } else {
            v5Var.a(false);
        }
    }

    public boolean b() {
        v5 v5Var;
        Activity activity = this.h.get();
        if (activity == null || (v5Var = this.k) == null) {
            return false;
        }
        return ca.a(activity, v5Var);
    }

    public void c() {
        u5 u5Var;
        int i;
        int i2;
        int measuredWidth;
        int i3;
        v5 v5Var;
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.c.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            u5 u5Var2 = this.c;
            int i4 = iArr[0];
            u5Var2.c(i4, iArr[1], this.r.getMeasuredWidth() + i4, iArr[1] + this.r.getMeasuredHeight());
        }
        if (!this.i.equals("expanded") && !this.i.equals("resized")) {
            this.f4129a.getLocationOnScreen(iArr);
            u5 u5Var3 = this.c;
            int i5 = iArr[0];
            u5Var3.b(i5, iArr[1], this.f4129a.getMeasuredWidth() + i5, iArr[1] + this.f4129a.getMeasuredHeight());
        }
        v5 v5Var2 = this.t;
        if (v5Var2 != null) {
            v5Var2.getLocationOnScreen(iArr);
            u5Var = this.c;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = this.t.getMeasuredWidth() + i;
            i3 = iArr[1];
            v5Var = this.t;
        } else {
            v5 v5Var3 = this.k;
            if (v5Var3 == null) {
                return;
            }
            v5Var3.getLocationOnScreen(iArr);
            u5Var = this.c;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = this.k.getMeasuredWidth() + i;
            i3 = iArr[1];
            v5Var = this.k;
        }
        u5Var.a(i, i2, measuredWidth, i3 + v5Var.getMeasuredHeight());
    }

    @Override // com.my.target.s9
    public f1 getView() {
        return this.f4129a;
    }

    @Override // com.my.target.s9
    public void pause() {
        v5 v5Var;
        if ((this.q == null || this.j != null) && (v5Var = this.k) != null) {
            v5Var.a(false);
        }
    }

    @Override // com.my.target.k.a
    public void q() {
        this.f4129a.setVisibility(0);
        if (this.u != null) {
            this.u = null;
            q5 q5Var = this.j;
            if (q5Var != null) {
                q5Var.a(false);
                this.j.e("hidden");
                this.j.a();
                this.j = null;
                this.g.a(true);
            }
            v5 v5Var = this.t;
            if (v5Var != null) {
                v5Var.a(true);
                if (this.t.getParent() != null) {
                    ((ViewGroup) this.t.getParent()).removeView(this.t);
                }
                this.t.a(0);
                this.t = null;
            }
        } else {
            v5 v5Var2 = this.k;
            if (v5Var2 != null) {
                if (v5Var2.getParent() != null) {
                    ((ViewGroup) this.k.getParent()).removeView(this.k);
                }
                a(this.k);
            }
        }
        z0 z0Var = this.p;
        if (z0Var != null && z0Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        this.p = null;
        a(Reward.DEFAULT);
        c cVar = this.m;
        if (cVar != null) {
            cVar.c();
        }
        c();
        this.g.a(this.c);
        v5 v5Var3 = this.k;
        if (v5Var3 != null) {
            v5Var3.e();
        }
    }

    @Override // com.my.target.s9
    public void start() {
        j9 j9Var;
        s9.a aVar = this.l;
        if (aVar == null || (j9Var = this.n) == null) {
            return;
        }
        aVar.a(j9Var);
    }
}
