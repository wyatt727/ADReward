package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.my.target.common.MyTargetActivity;
import com.my.target.f2;
import com.my.target.k7;
import com.my.target.m4;
import com.my.target.pa;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class y3 extends s3 {
    public final w3 h;
    public pa i;
    public WeakReference<h4> j;
    public k7 k;

    public class a extends pa.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4190a;

        public a(View view) {
            this.f4190a = view;
        }

        @Override // com.my.target.pa.a
        public void a() {
            View closeButton;
            super.a();
            k7 k7Var = y3.this.k;
            if (k7Var != null) {
                k7Var.a(this.f4190a, new k7.b[0]);
                WeakReference<h4> weakReference = y3.this.j;
                if (weakReference != null && (closeButton = weakReference.get().getCloseButton()) != null) {
                    y3.this.k.a(new k7.b(closeButton, 0));
                }
                y3.this.k.c();
            }
        }
    }

    public static class b implements m4.a {

        /* renamed from: a, reason: collision with root package name */
        public final y3 f4191a;

        public b(y3 y3Var) {
            this.f4191a = y3Var;
        }

        @Override // com.my.target.m4.a
        public void a() {
            this.f4191a.e();
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, Context context) {
            this.f4191a.a(bVar, context);
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, View view) {
            ba.a("InterstitialAdImagineEngine$InterstitialImageListener: Ad shown, banner Id = " + bVar.getId());
            this.f4191a.a(bVar, view);
        }

        @Override // com.my.target.m4.a
        public void a(com.my.target.b bVar, String str, Context context) {
            this.f4191a.b(context);
        }
    }

    public y3(w3 w3Var, f2.a aVar) {
        super(aVar);
        this.h = w3Var;
    }

    public static y3 a(w3 w3Var, f2.a aVar) {
        return new y3(w3Var, aVar);
    }

    public final void a(ViewGroup viewGroup) {
        this.k = k7.a(this.h, 2, null, viewGroup.getContext());
        h4 h4VarA = h4.a(viewGroup.getContext(), new b(this));
        this.j = new WeakReference<>(h4VarA);
        h4VarA.a(this.h);
        viewGroup.addView(h4VarA.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(com.my.target.b bVar, View view) {
        pa paVar = this.i;
        if (paVar != null) {
            paVar.d();
        }
        pa paVarB = pa.b(this.h.getViewability(), this.h.getStatHolder());
        this.i = paVarB;
        paVarB.a(new a(view));
        if (this.b) {
            this.i.b(view);
        }
        ba.a("InterstitialAdImagineEngine: Ad shown, banner Id = " + bVar.getId());
        w9.a(bVar.getStatHolder().b("playbackStarted"), view.getContext());
    }

    public void b(Context context) {
        y0.a().a(this.h, context);
        this.f4120a.onClick();
        dismiss();
    }

    @Override // com.my.target.s3
    public boolean d() {
        return this.h.isAllowBackButton();
    }

    public void e() {
        dismiss();
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        a(frameLayout);
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        super.onActivityDestroy();
        pa paVar = this.i;
        if (paVar != null) {
            paVar.d();
            this.i = null;
        }
        k7 k7Var = this.k;
        if (k7Var != null) {
            k7Var.a();
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        super.onActivityPause();
        pa paVar = this.i;
        if (paVar != null) {
            paVar.d();
        }
    }

    @Override // com.my.target.s3, com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        h4 h4Var;
        pa paVar;
        super.onActivityResume();
        WeakReference<h4> weakReference = this.j;
        if (weakReference == null || (h4Var = weakReference.get()) == null || (paVar = this.i) == null) {
            return;
        }
        paVar.b(h4Var.i());
    }
}
