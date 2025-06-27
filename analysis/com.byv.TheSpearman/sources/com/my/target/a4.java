package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.models.VideoData;
import com.my.target.f2;
import com.my.target.k7;
import com.my.target.pa;
import com.my.target.q4;
import com.my.target.r4;
import com.my.target.w4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a4 extends s3 {
    public final e4 h;
    public final ArrayList<t7> i;
    public final boolean j;
    public k7 k;
    public z3 l;
    public WeakReference<m4> m;
    public pa n;

    public class a extends pa.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3919a;

        public a(View view) {
            this.f3919a = view;
        }

        @Override // com.my.target.pa.a
        public void a() {
            View closeButton;
            super.a();
            k7 k7Var = a4.this.k;
            if (k7Var == null || k7Var.b()) {
                return;
            }
            a4.this.k.a(this.f3919a, new k7.b[0]);
            m4 m4VarE = a4.this.e();
            if (m4VarE != null && (closeButton = m4VarE.getCloseButton()) != null) {
                a4.this.k.a(new k7.b(closeButton, 0));
            }
            a4.this.k.c();
        }
    }

    public static class b implements q4.c, w4.a, r4.b {

        /* renamed from: a, reason: collision with root package name */
        public final a4 f3920a;

        public b(a4 a4Var) {
            this.f3920a = a4Var;
        }

        @Override // com.my.target.m4.a
        public void a() {
            this.f3920a.f();
        }

        @Override // com.my.target.q4.c, com.my.target.r4.b
        public void a(Context context) {
            this.f3920a.b(context);
        }

        @Override // com.my.target.w4.a
        public void a(WebView webView) {
            this.f3920a.a(webView);
        }

        @Override // com.my.target.w4.a
        public void a(com.my.target.b bVar, float f, float f2, Context context) {
            this.f3920a.a(f, f2, context);
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, Context context) {
            this.f3920a.a(bVar, context);
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, View view) {
            this.f3920a.a(bVar, view);
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, String str, Context context) {
            if (bVar != null) {
                this.f3920a.a(bVar, str, context);
            }
        }

        @Override // com.my.target.w4.a
        public void a(z4 z4Var) {
            if (z4Var != null) {
                this.f3920a.a(z4Var);
            }
            a();
        }

        @Override // com.my.target.w4.a
        public void a(String str) {
        }

        @Override // com.my.target.w4.a
        public void b(Context context) {
        }

        @Override // com.my.target.w4.a
        public void b(com.my.target.b bVar, String str, Context context) {
            this.f3920a.b(bVar, str, context);
        }
    }

    public a4(z3 z3Var, e4 e4Var, boolean z, f2.a aVar) {
        super(aVar);
        this.l = z3Var;
        this.h = e4Var;
        this.j = z;
        ArrayList<t7> arrayList = new ArrayList<>();
        this.i = arrayList;
        arrayList.addAll(z3Var.getStatHolder().c());
    }

    public static a4 a(z3 z3Var, e4 e4Var, boolean z, f2.a aVar) {
        return new a4(z3Var, e4Var, z, aVar);
    }

    public void a(float f, float f2, Context context) {
        if (this.i.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        ArrayList arrayList = new ArrayList();
        Iterator<t7> it = this.i.iterator();
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
        k7 k7Var = this.k;
        if (k7Var == null || !k7Var.b()) {
            return;
        }
        this.k.a(webView, new k7.b[0]);
        m4 m4VarE = e();
        if (m4VarE == null) {
            return;
        }
        View closeButton = m4VarE.getCloseButton();
        if (closeButton != null) {
            this.k.a(new k7.b(closeButton, 0));
        }
        this.k.c();
    }

    public void a(com.my.target.b bVar, View view) {
        pa paVar = this.n;
        if (paVar != null) {
            paVar.d();
        }
        pa paVarB = pa.b(bVar.getViewability(), bVar.getStatHolder());
        this.n = paVarB;
        paVarB.a(new a(view));
        if (this.b) {
            this.n.b(view);
        }
        ba.a("InterstitialAdPromoEngine: Ad shown, banner Id = " + bVar.getId());
        w9.a(bVar.getStatHolder().b("playbackStarted"), view.getContext());
    }

    public void a(com.my.target.b bVar, String str, Context context) {
        if (e() == null) {
            return;
        }
        y0 y0VarA = y0.a();
        if (TextUtils.isEmpty(str)) {
            y0VarA.a(bVar, context);
        } else {
            y0VarA.a(bVar, str, context);
        }
        boolean z = bVar instanceof r3;
        if (z) {
            w9.a(this.l.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
        }
        this.f4120a.onClick();
        if ((z || (bVar instanceof z3)) && this.l.isCloseOnClick()) {
            dismiss();
        }
    }

    public final void a(p3 p3Var, ViewGroup viewGroup) {
        m4 m4VarE = e();
        if (m4VarE != null) {
            m4VarE.destroy();
        }
        if (p3Var instanceof u3) {
            viewGroup.removeAllViews();
            b(p3Var, viewGroup);
        } else if (p3Var instanceof w3) {
            viewGroup.removeAllViews();
            a((w3) p3Var, viewGroup);
        } else if (p3Var instanceof z3) {
            viewGroup.removeAllViews();
            a((z3) p3Var, viewGroup);
        }
    }

    public final void a(w3 w3Var, ViewGroup viewGroup) {
        k7 k7Var = this.k;
        if (k7Var != null) {
            k7Var.a();
        }
        this.k = k7.a(w3Var, 2, null, viewGroup.getContext());
        h4 h4VarA = h4.a(viewGroup.getContext(), new b(this));
        this.m = new WeakReference<>(h4VarA);
        h4VarA.a(w3Var);
        viewGroup.addView(h4VarA.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(z3 z3Var, ViewGroup viewGroup) {
        m4 m4VarA;
        k7 k7Var = this.k;
        if (k7Var != null) {
            k7Var.a();
        }
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        this.k = k7.a(z3Var, videoBanner != null ? 3 : 2, videoBanner, viewGroup.getContext());
        if (z3Var.getStyle() != 2) {
            b8 b8VarA = b8.a(this.k, viewGroup.getContext());
            b8VarA.a(this.j);
            m4VarA = q4.a(b8VarA, z3Var, new b(this), viewGroup.getContext());
        } else {
            c8 c8VarA = c8.a(z3Var.getPromoStyleSettings(), this.k, viewGroup.getContext());
            c8VarA.a(this.j);
            r4 r4VarA = r4.a(c8VarA, z3Var, new b(this));
            r4VarA.s();
            m4VarA = r4VarA;
        }
        this.m = new WeakReference<>(m4VarA);
        viewGroup.addView(m4VarA.i(), new FrameLayout.LayoutParams(-1, -1));
        this.l = z3Var;
    }

    public void b(Context context) {
        this.f4120a.onVideoCompleted();
        if (!this.c) {
            this.c = true;
            w9.a(this.l.getStatHolder().b("reward"), context);
            f2.b bVarA = a();
            if (bVarA != null) {
                bVarA.onReward(Reward.getDefault());
            }
        }
        p3 endCard = this.l.getEndCard();
        m4 m4VarE = e();
        ViewParent parent = m4VarE != null ? m4VarE.i().getParent() : null;
        if (endCard == null || !(parent instanceof ViewGroup)) {
            return;
        }
        a(endCard, (ViewGroup) parent);
    }

    public void b(com.my.target.b bVar, String str, Context context) {
        w9.a(bVar.getStatHolder().b(str), context);
    }

    public final void b(p3 p3Var, ViewGroup viewGroup) {
        k7 k7Var = this.k;
        if (k7Var != null) {
            k7Var.a();
        }
        this.k = k7.a(p3Var, 2, null, viewGroup.getContext());
        w4 w4VarA = CampaignEx.JSON_KEY_MRAID.equals(p3Var.getType()) ? l4.a(viewGroup.getContext()) : g4.a(viewGroup.getContext());
        this.m = new WeakReference<>(w4VarA);
        w4VarA.a(new b(this));
        w4VarA.a(this.h, (u3) p3Var);
        viewGroup.addView(w4VarA.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.my.target.s3
    public boolean d() {
        return this.l.isAllowBackButton();
    }

    public m4 e() {
        WeakReference<m4> weakReference = this.m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void f() {
        dismiss();
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(this.l, (ViewGroup) frameLayout);
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        WeakReference<m4> weakReference = this.m;
        if (weakReference != null) {
            m4 m4Var = weakReference.get();
            if (m4Var != null) {
                View viewI = m4Var.i();
                ViewParent parent = viewI.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewI);
                }
                m4Var.destroy();
            }
            this.m.clear();
            this.m = null;
        }
        pa paVar = this.n;
        if (paVar != null) {
            paVar.d();
            this.n = null;
        }
        k7 k7Var = this.k;
        if (k7Var != null) {
            k7Var.a();
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        m4 m4VarE = e();
        if (m4VarE != null) {
            m4VarE.pause();
        }
        pa paVar = this.n;
        if (paVar != null) {
            paVar.d();
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        super.onActivityResume();
        m4 m4VarE = e();
        if (m4VarE != null) {
            m4VarE.a();
            pa paVar = this.n;
            if (paVar != null) {
                paVar.b(m4VarE.i());
            }
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStop() {
        super.onActivityStop();
        m4 m4VarE = e();
        if (m4VarE != null) {
            m4VarE.stop();
        }
    }
}
