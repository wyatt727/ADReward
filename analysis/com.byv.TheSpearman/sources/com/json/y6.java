package com.json;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.json.sdk.utils.Logger;
import com.json.t2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class y6 extends FrameLayout implements w7 {
    private static final String b = "IronSourceAdContainer";

    /* renamed from: a, reason: collision with root package name */
    private d7 f2459a;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2460a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.f2460a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            y6 y6Var = y6.this;
            y6Var.removeView(y6Var.f2459a.getPresentingView());
            y6.this.f2459a.a(this.f2460a, this.b);
            y6.this.f2459a = null;
        }
    }

    public y6(Context context) {
        super(context);
    }

    public y6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public y6(d7 d7Var, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(d7Var.d().c(), d7Var.d().a()));
        this.f2459a = d7Var;
        addView(d7Var.getPresentingView());
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f2459a.c().a().getJSONObject(x6.p).getJSONObject(x6.s);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f2459a.b());
        this.f2459a.c().a(t2.g.Y, jSONObject);
    }

    public void a() throws Exception {
        d7 d7Var = this.f2459a;
        if (d7Var == null || d7Var.c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.json.w7
    public synchronized void a(String str, String str2) {
        d7 d7Var = this.f2459a;
        if (d7Var != null && d7Var.c() != null && this.f2459a.getPresentingView() != null) {
            this.f2459a.c().e();
            o6.f2043a.c(new a(str, str2));
        }
    }

    @Override // com.json.w7
    public void a(String str, String str2, String str3) {
        d7 d7Var = this.f2459a;
        if (d7Var == null) {
            return;
        }
        d7Var.a(str, str2, str3);
    }

    @Override // com.json.w7
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f2459a.a(jSONObject, str, str2);
    }

    @Override // com.json.w7
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f2459a.b(jSONObject, str, str2);
    }

    @Override // com.json.w7
    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        this.f2459a.c(jSONObject, str, str2);
    }

    @Override // com.json.w7
    public WebView getPresentingView() {
        return this.f2459a.getPresentingView();
    }

    public w6 getSize() {
        d7 d7Var = this.f2459a;
        return d7Var != null ? d7Var.d() : new w6();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        d7 d7Var = this.f2459a;
        if (d7Var == null) {
            return;
        }
        try {
            d7Var.c().a(x6.k, i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        d7 d7Var = this.f2459a;
        if (d7Var == null) {
            return;
        }
        try {
            d7Var.c().a(x6.l, i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
