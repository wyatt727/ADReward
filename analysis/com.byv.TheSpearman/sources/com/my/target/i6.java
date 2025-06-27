package com.my.target;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.my.target.e0;
import com.my.target.k;
import com.my.target.k7;
import com.my.target.z0;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class i6 implements k.a, e0.a {

    /* renamed from: a, reason: collision with root package name */
    public final h6 f4000a;
    public pa b;
    public WeakReference<k> c;
    public WeakReference<e0> d;
    public a e;
    public k7 f;
    public e0 g;
    public boolean h;
    public boolean i;

    public interface a {
        void a(h6 h6Var, String str, Context context);
    }

    public i6(h6 h6Var) {
        this.f4000a = h6Var;
    }

    public static i6 a(h6 h6Var) {
        return new i6(h6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProgressBar progressBar) {
        a(this.g, progressBar);
    }

    public void a(Context context) {
        k kVarA = k.a(this, context);
        this.c = new WeakReference<>(kVarA);
        try {
            kVarA.show();
        } catch (Throwable th) {
            th.printStackTrace();
            ba.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            q();
        }
    }

    @Override // com.my.target.e0.a
    public void a(WebView webView) {
        k7 k7Var = this.f;
        if (k7Var == null) {
            return;
        }
        k7Var.a(webView, new k7.b[0]);
        this.f.c();
    }

    public final void a(e0 e0Var, ProgressBar progressBar) {
        this.f = k7.a(this.f4000a, 1, null, e0Var.getContext());
        this.d = new WeakReference<>(e0Var);
        progressBar.setVisibility(8);
        e0Var.setVisibility(0);
        pa paVar = this.b;
        if (paVar != null) {
            paVar.d();
        }
        pa paVarB = pa.b(this.f4000a.getViewability(), this.f4000a.getStatHolder());
        this.b = paVarB;
        if (this.i) {
            paVarB.b(e0Var);
        }
        w9.a(this.f4000a.getStatHolder().b("playbackStarted"), e0Var.getContext());
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(k kVar) {
        if (kVar.isShowing()) {
            kVar.dismiss();
        }
    }

    @Override // com.my.target.k.a
    public void a(final k kVar, FrameLayout frameLayout) {
        z0 z0Var = new z0(frameLayout.getContext());
        z0Var.setOnCloseListener(new z0.a() { // from class: com.my.target.i6$$ExternalSyntheticLambda0
            @Override // com.my.target.z0.a
            public final void c() {
                this.f$0.b(kVar);
            }
        });
        frameLayout.addView(z0Var, -1, -1);
        e0 e0Var = new e0(frameLayout.getContext());
        this.g = e0Var;
        e0Var.setVisibility(8);
        this.g.setBannerWebViewListener(this);
        z0Var.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
        this.g.setData(this.f4000a.getSource());
        final ProgressBar progressBar = new ProgressBar(frameLayout.getContext(), null, android.R.attr.progressBarStyle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new Runnable() { // from class: com.my.target.i6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(progressBar);
            }
        }, 555L);
    }

    @Override // com.my.target.e0.a
    public void a(String str) {
        ba.a("NativeAdContentController: Content JS error - " + str);
    }

    @Override // com.my.target.e0.a
    public void b() {
    }

    @Override // com.my.target.e0.a
    public void b(String str) {
        k kVar;
        WeakReference<k> weakReference = this.c;
        if (weakReference == null || (kVar = weakReference.get()) == null) {
            return;
        }
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(this.f4000a, str, kVar.getContext());
        }
        this.h = true;
        b(kVar);
    }

    @Override // com.my.target.k.a
    public void b(boolean z) {
        e0 e0Var;
        if (z == this.i) {
            return;
        }
        this.i = z;
        pa paVar = this.b;
        if (paVar == null) {
            return;
        }
        if (!z) {
            paVar.d();
            return;
        }
        WeakReference<e0> weakReference = this.d;
        if (weakReference == null || (e0Var = weakReference.get()) == null) {
            return;
        }
        this.b.b(e0Var);
    }

    @Override // com.my.target.k.a
    public void q() {
        WeakReference<k> weakReference = this.c;
        if (weakReference != null) {
            k kVar = weakReference.get();
            if (!this.h) {
                w9.a(this.f4000a.getStatHolder().b("closedByUser"), kVar.getContext());
            }
            this.c.clear();
            this.c = null;
        }
        pa paVar = this.b;
        if (paVar != null) {
            paVar.d();
            this.b = null;
        }
        WeakReference<e0> weakReference2 = this.d;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.d = null;
        }
        k7 k7Var = this.f;
        if (k7Var != null) {
            k7Var.a();
        }
        e0 e0Var = this.g;
        if (e0Var != null) {
            e0Var.a(this.f != null ? 7000 : 0);
        }
    }
}
