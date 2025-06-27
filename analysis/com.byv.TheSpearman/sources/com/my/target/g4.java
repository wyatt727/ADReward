package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.my.target.c;
import com.my.target.common.models.ImageData;
import com.my.target.d;
import com.my.target.e0;
import com.my.target.w4;
import java.util.List;

/* loaded from: classes4.dex */
public class g4 implements e0.a, w4 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f3976a;
    public final l2 b;
    public final FrameLayout c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final i e;
    public e f;
    public d g;
    public w4.a h;
    public long i;
    public long j;
    public u3 k;
    public long l;
    public long m;
    public f n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g4.this.c();
        }
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f3978a;

        public b(com.my.target.b bVar) {
            this.f3978a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            w4.a aVar = g4.this.h;
            if (aVar != null) {
                aVar.a(this.f3978a, context);
            }
        }
    }

    public static class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final g4 f3979a;

        public c(g4 g4Var) {
            this.f3979a = g4Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w4.a aVarD = this.f3979a.d();
            if (aVarD != null) {
                aVarD.a();
            }
        }
    }

    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final g4 f3980a;

        public d(g4 g4Var) {
            this.f3980a = g4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w4.a aVarD = this.f3980a.d();
            if (aVarD != null) {
                aVarD.b(this.f3980a.c.getContext());
            }
        }
    }

    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final l2 f3981a;

        public e(l2 l2Var) {
            this.f3981a = l2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ba.a("InterstitialHtmlPresenter: Banner became just closeable");
            this.f3981a.setVisibility(0);
        }
    }

    public g4(Context context) {
        e0 e0Var = new e0(context);
        this.f3976a = e0Var;
        l2 l2Var = new l2(context);
        this.b = l2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        l2Var.setContentDescription("Close");
        ca.b(l2Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        l2Var.setVisibility(8);
        l2Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        e0Var.setLayoutParams(layoutParams2);
        frameLayout.addView(e0Var);
        if (l2Var.getParent() == null) {
            frameLayout.addView(l2Var);
        }
        Bitmap bitmapA = g0.a(ca.e(context).b(28));
        if (bitmapA != null) {
            l2Var.a(bitmapA, false);
        }
        i iVar = new i(context);
        this.e = iVar;
        int iA = ca.a(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(iA, iA, iA, iA);
        frameLayout.addView(iVar, layoutParams3);
    }

    public static g4 a(Context context) {
        return new g4(context);
    }

    @Override // com.my.target.m4
    public void a() {
        long j = this.j;
        if (j > 0) {
            a(j);
        }
        long j2 = this.m;
        if (j2 > 0) {
            b(j2);
        }
    }

    @Override // com.my.target.w4
    public void a(int i) {
        this.f3976a.b("window.playerDestroy && window.playerDestroy();");
        this.c.removeView(this.f3976a);
        this.f3976a.a(i);
    }

    public final void a(long j) {
        e eVar = this.f;
        if (eVar == null) {
            return;
        }
        this.d.removeCallbacks(eVar);
        this.i = System.currentTimeMillis();
        this.d.postDelayed(this.f, j);
    }

    @Override // com.my.target.e0.a
    public void a(WebView webView) {
        w4.a aVar = this.h;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    public final void a(com.my.target.b bVar) {
        com.my.target.c adChoices = bVar.getAdChoices();
        if (adChoices == null) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setImageBitmap(adChoices.c().getBitmap());
        this.e.setOnClickListener(new a());
        List<c.a> listA = adChoices.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new h1());
        this.n = fVarA;
        fVarA.a(new b(bVar));
    }

    @Override // com.my.target.w4
    public void a(e4 e4Var, u3 u3Var) {
        this.k = u3Var;
        this.f3976a.setBannerWebViewListener(this);
        String source = u3Var.getSource();
        if (source == null) {
            c("failed to load, null source");
            return;
        }
        this.f3976a.setData(source);
        this.f3976a.setForceMediaPlayback(u3Var.getForceMediaPlayback());
        ImageData closeIcon = u3Var.getCloseIcon();
        if (closeIcon != null) {
            this.b.a(closeIcon.getBitmap(), false);
        }
        this.b.setOnClickListener(new c(this));
        if (u3Var.getAllowCloseDelay() > 0.0f) {
            ba.a("InterstitialHtmlPresenter: Banner will be allowed to close in " + u3Var.getAllowCloseDelay() + " seconds");
            this.f = new e(this.b);
            long allowCloseDelay = (long) (u3Var.getAllowCloseDelay() * 1000.0f);
            this.j = allowCloseDelay;
            a(allowCloseDelay);
        } else {
            ba.a("InterstitialHtmlPresenter: Banner is allowed to close");
            this.b.setVisibility(0);
        }
        float timeToReward = u3Var.getTimeToReward();
        if (timeToReward > 0.0f) {
            this.g = new d(this);
            long j = ((long) timeToReward) * 1000;
            this.m = j;
            b(j);
        }
        a(u3Var);
        w4.a aVar = this.h;
        if (aVar != null) {
            aVar.a(u3Var, i());
        }
    }

    @Override // com.my.target.w4
    public void a(w4.a aVar) {
        this.h = aVar;
    }

    @Override // com.my.target.e0.a
    public void a(String str) {
        c(str);
    }

    @Override // com.my.target.e0.a
    public void b() {
        w4.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        z4 z4VarE = z4.a("WebView error").e("InterstitialHtml WebView renderer crashed");
        u3 u3Var = this.k;
        z4 z4VarD = z4VarE.d(u3Var == null ? null : u3Var.getSource());
        u3 u3Var2 = this.k;
        aVar.a(z4VarD.c(u3Var2 != null ? u3Var2.getId() : null));
    }

    public final void b(long j) {
        d dVar = this.g;
        if (dVar == null) {
            return;
        }
        this.d.removeCallbacks(dVar);
        this.l = System.currentTimeMillis();
        this.d.postDelayed(this.g, j);
    }

    @Override // com.my.target.e0.a
    public void b(String str) {
        w4.a aVar = this.h;
        if (aVar != null) {
            aVar.a(this.k, str, i().getContext());
        }
    }

    public void c() {
        com.my.target.c adChoices;
        u3 u3Var = this.k;
        if (u3Var == null || (adChoices = u3Var.getAdChoices()) == null) {
            return;
        }
        f fVar = this.n;
        if (fVar == null || !fVar.b()) {
            Context context = i().getContext();
            if (fVar == null) {
                j3.a(adChoices.b(), context);
            } else {
                fVar.a(context);
            }
        }
    }

    public final void c(String str) {
        w4.a aVar = this.h;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public w4.a d() {
        return this.h;
    }

    @Override // com.my.target.m4
    public void destroy() {
        a(0);
    }

    @Override // com.my.target.m4
    public View getCloseButton() {
        return this.b;
    }

    @Override // com.my.target.m4
    public View i() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // com.my.target.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pause() {
        /*
            r7 = this;
            long r0 = r7.i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.i
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            long r4 = r7.j
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1d
            long r4 = r4 - r0
            r7.j = r4
            goto L1f
        L1d:
            r7.j = r2
        L1f:
            long r0 = r7.l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.l
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3a
            long r4 = r7.m
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3a
            long r4 = r4 - r0
            r7.m = r4
            goto L3c
        L3a:
            r7.m = r2
        L3c:
            com.my.target.g4$d r0 = r7.g
            if (r0 == 0) goto L45
            android.os.Handler r1 = r7.d
            r1.removeCallbacks(r0)
        L45:
            com.my.target.g4$e r0 = r7.f
            if (r0 == 0) goto L4e
            android.os.Handler r1 = r7.d
            r1.removeCallbacks(r0)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.g4.pause():void");
    }

    @Override // com.my.target.m4
    public void stop() {
    }
}
