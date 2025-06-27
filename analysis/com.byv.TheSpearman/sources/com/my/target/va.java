package com.my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e0;
import com.my.target.s9;
import com.my.target.t9;

/* loaded from: classes4.dex */
public class va implements t9, e0.a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f4167a;
    public final f1 b;
    public s9.a c;
    public t9.a d;
    public j9 e;

    public va(Context context) {
        this(new e0(context), new f1(context));
    }

    public va(e0 e0Var, f1 f1Var) {
        this.f4167a = e0Var;
        this.b = f1Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        f1Var.addView(e0Var, 0);
        e0Var.setLayoutParams(layoutParams);
        e0Var.setBannerWebViewListener(this);
    }

    public static va a(Context context) {
        return new va(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        e(str);
        this.f4167a.setOnLayoutListener(null);
    }

    @Override // com.my.target.s9
    public void a() {
    }

    @Override // com.my.target.s9
    public void a(int i) {
        a((t9.a) null);
        a((s9.a) null);
        if (this.f4167a.getParent() != null) {
            ((ViewGroup) this.f4167a.getParent()).removeView(this.f4167a);
        }
        this.f4167a.a(i);
    }

    @Override // com.my.target.e0.a
    public void a(WebView webView) {
        s9.a aVar = this.c;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    public final void a(IAdLoadingError iAdLoadingError) {
        t9.a aVar = this.d;
        if (aVar != null) {
            aVar.onNoAd(iAdLoadingError);
        }
    }

    @Override // com.my.target.s9
    public void a(j9 j9Var) {
        this.e = j9Var;
        final String source = j9Var.getSource();
        if (source == null) {
            a(m.q);
            return;
        }
        if (this.f4167a.getMeasuredHeight() == 0 || this.f4167a.getMeasuredWidth() == 0) {
            this.f4167a.setOnLayoutListener(new e0.d() { // from class: com.my.target.va$$ExternalSyntheticLambda0
                @Override // com.my.target.e0.d
                public final void a() {
                    this.f$0.d(source);
                }
            });
        } else {
            e(source);
        }
        t9.a aVar = this.d;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    @Override // com.my.target.s9
    public void a(s9.a aVar) {
        this.c = aVar;
    }

    @Override // com.my.target.t9
    public void a(t9.a aVar) {
        this.d = aVar;
    }

    @Override // com.my.target.e0.a
    public void a(String str) {
    }

    @Override // com.my.target.s9
    public void a(boolean z) {
    }

    @Override // com.my.target.e0.a
    public void b() {
        s9.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        z4 z4VarE = z4.a("WebView error").e("WebView renderer crashed");
        j9 j9Var = this.e;
        z4 z4VarD = z4VarE.d(j9Var == null ? null : j9Var.getSource());
        j9 j9Var2 = this.e;
        aVar.a(z4VarD.c(j9Var2 != null ? j9Var2.getId() : null));
    }

    @Override // com.my.target.e0.a
    public void b(String str) {
        if (this.e != null) {
            c(str);
        }
    }

    public final void c(String str) {
        j9 j9Var;
        s9.a aVar = this.c;
        if (aVar == null || (j9Var = this.e) == null) {
            return;
        }
        aVar.a(j9Var, str);
    }

    public final void e(String str) {
        this.f4167a.setData(str);
    }

    @Override // com.my.target.s9
    public f1 getView() {
        return this.b;
    }

    @Override // com.my.target.s9
    public void pause() {
    }

    @Override // com.my.target.s9
    public void start() {
        j9 j9Var;
        s9.a aVar = this.c;
        if (aVar == null || (j9Var = this.e) == null) {
            return;
        }
        aVar.a(j9Var);
    }
}
