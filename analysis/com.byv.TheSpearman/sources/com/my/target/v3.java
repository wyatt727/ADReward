package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetActivity;
import com.my.target.f2;
import com.my.target.k7;
import com.my.target.w4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class v3 extends s3 {
    public final u3 h;
    public final e4 i;
    public final ArrayList<t7> j;
    public WeakReference<w4> k;
    public pa l;
    public k7 m;

    public static class a implements w4.a {

        /* renamed from: a, reason: collision with root package name */
        public final v3 f4159a;
        public final u3 b;
        public final f2.a c;

        public a(v3 v3Var, u3 u3Var, f2.a aVar) {
            this.f4159a = v3Var;
            this.b = u3Var;
            this.c = aVar;
        }

        @Override // com.my.target.m4.a
        public void a() {
            this.f4159a.dismiss();
        }

        @Override // com.my.target.w4.a
        public void a(WebView webView) {
            this.f4159a.a(webView);
        }

        @Override // com.my.target.w4.a
        public void a(b bVar, float f, float f2, Context context) {
            this.f4159a.a(f, f2, context);
        }

        @Override // com.my.target.m4.a
        public void a(b bVar, Context context) {
            this.f4159a.a(bVar, context);
        }

        @Override // com.my.target.m4.a
        public void a(b bVar, View view) {
            ba.a("InterstitialAdHtmlEngine$InterstitialWebViewPresenterListener: Ad shown, banner Id = " + this.b.getId());
            this.f4159a.a(bVar, view);
        }

        @Override // com.my.target.m4.a
        public void a(b bVar, String str, Context context) {
            y0 y0VarA = y0.a();
            if (TextUtils.isEmpty(str)) {
                y0VarA.a(this.b, context);
            } else {
                y0VarA.a(this.b, str, context);
            }
            this.c.onClick();
        }

        @Override // com.my.target.w4.a
        public void a(z4 z4Var) {
            if (z4Var != null) {
                this.f4159a.a(z4Var);
            }
            a();
        }

        @Override // com.my.target.w4.a
        public void a(String str) {
            this.f4159a.dismiss();
        }

        @Override // com.my.target.w4.a
        public void b(Context context) {
            this.f4159a.b(context);
        }

        @Override // com.my.target.w4.a
        public void b(b bVar, String str, Context context) {
            this.f4159a.a(bVar, str, context);
        }
    }

    public v3(u3 u3Var, e4 e4Var, f2.a aVar) {
        super(aVar);
        this.h = u3Var;
        this.i = e4Var;
        ArrayList<t7> arrayList = new ArrayList<>();
        this.j = arrayList;
        arrayList.addAll(u3Var.getStatHolder().c());
    }

    public static v3 a(u3 u3Var, e4 e4Var, f2.a aVar) {
        return new v3(u3Var, e4Var, aVar);
    }

    public void a(float f, float f2, Context context) {
        if (this.j.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        ArrayList arrayList = new ArrayList();
        Iterator<t7> it = this.j.iterator();
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

    public final void a(ViewGroup viewGroup) {
        this.m = k7.a(this.h, 1, null, viewGroup.getContext());
        w4 w4VarA = CampaignEx.JSON_KEY_MRAID.equals(this.h.getType()) ? l4.a(viewGroup.getContext()) : g4.a(viewGroup.getContext());
        this.k = new WeakReference<>(w4VarA);
        w4VarA.a(new a(this, this.h, this.f4120a));
        w4VarA.a(this.i, this.h);
        viewGroup.addView(w4VarA.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(WebView webView) {
        w4 w4VarE;
        if (this.m == null || (w4VarE = e()) == null) {
            return;
        }
        this.m.a(webView, new k7.b[0]);
        View closeButton = w4VarE.getCloseButton();
        if (closeButton != null) {
            this.m.a(new k7.b(closeButton, 0));
        }
        this.m.c();
    }

    public void a(b bVar, View view) {
        pa paVar = this.l;
        if (paVar != null) {
            paVar.d();
        }
        pa paVarB = pa.b(this.h.getViewability(), this.h.getStatHolder());
        this.l = paVarB;
        if (this.b) {
            paVarB.b(view);
        }
        ba.a("InterstitialAdHtmlEngine: Ad shown, banner Id = " + bVar.getId());
        w9.a(bVar.getStatHolder().b("playbackStarted"), view.getContext());
    }

    public void a(b bVar, String str, Context context) {
        w9.a(bVar.getStatHolder().b(str), context);
    }

    public void b(Context context) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f4120a.onVideoCompleted();
        w9.a(this.h.getStatHolder().b("reward"), context);
        f2.b bVarA = a();
        if (bVarA != null) {
            bVarA.onReward(Reward.getDefault());
        }
    }

    @Override // com.my.target.s3
    public boolean d() {
        return this.h.isAllowBackButton();
    }

    public w4 e() {
        WeakReference<w4> weakReference = this.k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        w4 w4Var;
        super.onActivityDestroy();
        pa paVar = this.l;
        if (paVar != null) {
            paVar.d();
            this.l = null;
        }
        k7 k7Var = this.m;
        if (k7Var != null) {
            k7Var.a();
        }
        WeakReference<w4> weakReference = this.k;
        if (weakReference != null && (w4Var = weakReference.get()) != null) {
            w4Var.a(this.m != null ? 7000 : 0);
        }
        this.k = null;
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        w4 w4Var;
        super.onActivityPause();
        WeakReference<w4> weakReference = this.k;
        if (weakReference != null && (w4Var = weakReference.get()) != null) {
            w4Var.pause();
        }
        pa paVar = this.l;
        if (paVar != null) {
            paVar.d();
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        w4 w4Var;
        super.onActivityResume();
        WeakReference<w4> weakReference = this.k;
        if (weakReference == null || (w4Var = weakReference.get()) == null) {
            return;
        }
        w4Var.a();
        pa paVar = this.l;
        if (paVar != null) {
            paVar.b(w4Var.i());
        }
    }
}
