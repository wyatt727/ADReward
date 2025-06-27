package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.d;
import com.my.target.i2;
import com.my.target.k7;
import com.my.target.o5;
import com.my.target.pa;
import com.my.target.s9;
import com.my.target.t5;
import com.my.target.t9;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class l9 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final k7 f4044a;
    public final MyTargetView b;
    public final j9 c;
    public final Context d;
    public final s9.a e = new c(this);
    public final ArrayList<t7> f;
    public final pa g;
    public final com.my.target.d h;
    public final o5.a i;
    public s9 j;
    public i2.a k;
    public boolean l;
    public o5 m;

    public class a extends pa.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f4045a;

        public a(com.my.target.b bVar) {
            this.f4045a = bVar;
        }

        @Override // com.my.target.pa.a
        public void a() {
            ba.a("StandardAdEngine: Ad shown, banner Id = " + this.f4045a.getId());
            o5 o5Var = l9.this.m;
            if (o5Var != null) {
                o5Var.b();
                l9 l9Var = l9.this;
                l9Var.m.b(l9Var.d);
            }
            i2.a aVar = l9.this.k;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public class b implements d.a {
        public b() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            l9.this.d();
        }
    }

    public static class c implements s9.a {

        /* renamed from: a, reason: collision with root package name */
        public final l9 f4047a;

        public c(l9 l9Var) {
            this.f4047a = l9Var;
        }

        @Override // com.my.target.s9.a
        public void a(WebView webView) {
            this.f4047a.a(webView);
        }

        @Override // com.my.target.s9.a
        public void a(com.my.target.b bVar) {
            this.f4047a.a(bVar);
        }

        @Override // com.my.target.s9.a
        public void a(com.my.target.b bVar, String str) {
            this.f4047a.a(bVar, str);
        }

        @Override // com.my.target.s9.a
        public void a(z4 z4Var) {
            this.f4047a.a(z4Var);
        }
    }

    public static class d implements t9.a {

        /* renamed from: a, reason: collision with root package name */
        public final l9 f4048a;

        public d(l9 l9Var) {
            this.f4048a = l9Var;
        }

        @Override // com.my.target.t9.a
        public void onLoad() {
            this.f4048a.g();
        }

        @Override // com.my.target.t9.a
        public void onNoAd(IAdLoadingError iAdLoadingError) {
            this.f4048a.a(iAdLoadingError);
        }
    }

    public static class e implements t5.c {

        /* renamed from: a, reason: collision with root package name */
        public final l9 f4049a;

        public e(l9 l9Var) {
            this.f4049a = l9Var;
        }

        @Override // com.my.target.t5.c
        public void a(float f, float f2, j9 j9Var, Context context) {
            this.f4049a.a(f, f2, context);
        }

        @Override // com.my.target.t5.c
        public void a(String str, j9 j9Var, Context context) {
            this.f4049a.a(str, j9Var, context);
        }

        @Override // com.my.target.t5.c
        public void b() {
            this.f4049a.f();
        }

        @Override // com.my.target.t5.c
        public void c() {
            this.f4049a.e();
        }

        @Override // com.my.target.t5.c
        public void onLoad() {
            this.f4049a.g();
        }

        @Override // com.my.target.t5.c
        public void onNoAd(IAdLoadingError iAdLoadingError) {
            this.f4049a.a(iAdLoadingError);
        }
    }

    public l9(MyTargetView myTargetView, j9 j9Var, o5.a aVar) {
        this.b = myTargetView;
        this.c = j9Var;
        this.d = myTargetView.getContext();
        this.i = aVar;
        ArrayList<t7> arrayList = new ArrayList<>();
        this.f = arrayList;
        arrayList.addAll(j9Var.getStatHolder().c());
        this.g = pa.b(j9Var.getViewability(), j9Var.getStatHolder());
        this.h = com.my.target.d.a(j9Var.getAdChoices());
        this.f4044a = k7.a(j9Var, 1, null, myTargetView.getContext());
    }

    public static l9 a(MyTargetView myTargetView, j9 j9Var, o5.a aVar) {
        return new l9(myTargetView, j9Var, aVar);
    }

    @Override // com.my.target.i2
    public void a() {
        s9 s9Var = this.j;
        if (s9Var != null) {
            s9Var.a();
        }
        this.l = true;
        this.g.b(this.b);
    }

    public void a(float f, float f2, Context context) {
        if (this.f.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        ArrayList arrayList = new ArrayList();
        Iterator<t7> it = this.f.iterator();
        while (it.hasNext()) {
            t7 next = it.next();
            float fE = next.e();
            if (fE < 0.0f && next.d() >= 0.0f) {
                fE = (f2 / 100.0f) * next.d();
            }
            if (fE >= 0.0f && fE <= f3) {
                arrayList.add(next);
                it.remove();
            }
        }
        w9.a(arrayList, context);
    }

    public void a(WebView webView) {
        s9 s9Var;
        if (this.f4044a == null || (s9Var = this.j) == null) {
            return;
        }
        this.f4044a.a(webView, new k7.b(s9Var.getView().getAdChoicesView(), 3));
        this.f4044a.c();
    }

    @Override // com.my.target.i2
    public void a(MyTargetView.AdSize adSize) {
        s9 s9Var = this.j;
        if (s9Var == null) {
            return;
        }
        s9Var.getView().a(adSize.getWidthPixels(), adSize.getHeightPixels());
    }

    public void a(com.my.target.b bVar) {
        this.g.d();
        this.g.a(new a(bVar));
        if (this.l) {
            this.g.b(this.b);
        }
        w9.a(bVar.getStatHolder().b("playbackStarted"), this.b.getContext());
    }

    public void a(com.my.target.b bVar, String str) {
        i2.a aVar = this.k;
        if (aVar != null) {
            aVar.onClick();
        }
        y0 y0VarA = y0.a();
        if (TextUtils.isEmpty(str)) {
            y0VarA.a(bVar, this.b.getContext());
        } else {
            y0VarA.a(bVar, str, this.b.getContext());
        }
    }

    public void a(IAdLoadingError iAdLoadingError) {
        i2.a aVar = this.k;
        if (aVar != null) {
            aVar.onNoAd(iAdLoadingError);
        }
    }

    public final void a(f1 f1Var) {
        if (this.j != null) {
            MyTargetView.AdSize size = this.b.getSize();
            this.j.getView().a(size.getWidthPixels(), size.getHeightPixels());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        f1Var.setLayoutParams(layoutParams);
        this.b.removeAllViews();
        this.b.addView(f1Var);
        if (this.c.getAdChoices() == null) {
            return;
        }
        this.h.a(f1Var.getAdChoicesView(), new b());
    }

    @Override // com.my.target.i2
    public void a(i2.a aVar) {
        this.k = aVar;
    }

    public void a(z4 z4Var) {
        i2.a aVar = this.k;
        if (aVar == null) {
            return;
        }
        aVar.a(z4Var);
    }

    public void a(String str, j9 j9Var, Context context) {
        w9.a(j9Var.getStatHolder().b(str), context);
    }

    @Override // com.my.target.i2
    public String b() {
        return "myTarget";
    }

    @Override // com.my.target.i2
    public float c() {
        return 0.0f;
    }

    public void d() {
        w9.a(this.c.getStatHolder().b("closedByUser"), this.d);
        i2.a aVar = this.k;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    @Override // com.my.target.i2
    public void destroy() {
        this.g.d();
        this.h.a();
        k7 k7Var = this.f4044a;
        if (k7Var != null) {
            k7Var.a();
        }
        s9 s9Var = this.j;
        if (s9Var != null) {
            s9Var.a(this.f4044a != null ? 7000 : 0);
            this.j = null;
        }
    }

    public void e() {
        i2.a aVar = this.k;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void f() {
        i2.a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void g() {
        i2.a aVar = this.k;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    public final void h() {
        t5 t5VarA;
        s9 s9Var = this.j;
        if (s9Var instanceof t5) {
            t5VarA = (t5) s9Var;
        } else {
            if (s9Var != null) {
                s9Var.a((s9.a) null);
                this.j.a(this.f4044a != null ? 7000 : 0);
            }
            t5VarA = t5.a(this.b);
            t5VarA.a(this.e);
            this.j = t5VarA;
            a(t5VarA.getView());
        }
        t5VarA.a(new e(this));
        t5VarA.a(this.c);
    }

    public final void i() {
        t9 t9VarA;
        s9 s9Var = this.j;
        if (s9Var instanceof va) {
            t9VarA = (t9) s9Var;
        } else {
            if (s9Var != null) {
                s9Var.a((s9.a) null);
                this.j.a(this.f4044a != null ? 7000 : 0);
            }
            t9VarA = va.a(this.d);
            t9VarA.a(this.e);
            this.j = t9VarA;
            a(t9VarA.getView());
        }
        t9VarA.a(new d(this));
        t9VarA.a(this.c);
    }

    @Override // com.my.target.i2
    public void pause() {
        s9 s9Var = this.j;
        if (s9Var != null) {
            s9Var.pause();
        }
        this.l = false;
        this.g.d();
    }

    @Override // com.my.target.i2
    public void prepare() {
        this.m = this.i.b();
        if (CampaignEx.JSON_KEY_MRAID.equals(this.c.getType())) {
            h();
        } else {
            i();
        }
    }

    @Override // com.my.target.i2
    public void start() {
        this.l = true;
        s9 s9Var = this.j;
        if (s9Var != null) {
            s9Var.start();
        }
    }

    @Override // com.my.target.i2
    public void stop() {
        s9 s9Var = this.j;
        if (s9Var != null) {
            s9Var.a(this.f4044a == null);
        }
    }
}
