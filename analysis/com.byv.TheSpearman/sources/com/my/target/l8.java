package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.json.t2;
import com.my.target.common.models.ImageData;
import com.my.target.k8;

/* loaded from: classes4.dex */
public abstract class l8 extends ViewGroup implements k8, View.OnClickListener {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public View K;
    public int L;
    public int M;
    public int N;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public final k2 f4043a;
    public final w8 b;
    public final k2 c;
    public final View d;
    public final View e;
    public final k8.a f;
    public final t1 g;
    public final Button h;
    public final i9 i;
    public final i9 j;
    public final i k;
    public final ProgressBar l;
    public final View m;
    public final View n;
    public final View o;
    public final Button p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ka t;
    public final Bitmap u;
    public final Bitmap v;
    public final Bitmap w;
    public final Bitmap x;
    public final Bitmap y;
    public final int z;

    public l8(View view, View view2, k8.a aVar, View view3, w8 w8Var, Context context) {
        super(context);
        this.f = aVar;
        this.K = view3;
        this.e = view2;
        this.d = view;
        this.b = w8Var;
        int iA = w8Var.a(w8.i);
        this.D = iA;
        int iA2 = w8Var.a(w8.U);
        this.J = iA2;
        this.G = w8Var.a(w8.S);
        this.H = w8Var.a(w8.G);
        this.I = w8Var.a(w8.V);
        this.E = w8Var.a(w8.X);
        k2 k2Var = new k2(context);
        this.c = k2Var;
        k2Var.setVisibility(8);
        k2Var.setOnClickListener(this);
        k2Var.setPadding(iA);
        t1 t1Var = new t1(context);
        this.g = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnClickListener(this);
        ca.a(t1Var, -2013265920, -1, -1, w8Var.a(w8.d), w8Var.a(w8.e));
        Button button = new Button(context);
        this.h = button;
        button.setTextColor(-1);
        button.setLines(w8Var.a(w8.f));
        button.setTextSize(1, w8Var.a(w8.g));
        button.setMaxWidth(w8Var.a(w8.c));
        button.setOnClickListener(this);
        button.setBackgroundColor(0);
        button.setIncludeFontPadding(false);
        int iA3 = w8Var.a(w8.h);
        this.z = iA3;
        this.A = w8Var.a(w8.l);
        this.B = w8Var.a(w8.m);
        int iA4 = w8Var.a(w8.q);
        this.C = iA4;
        this.N = w8Var.a(w8.n);
        this.F = w8Var.a(w8.o);
        i iVar = new i(context);
        this.k = iVar;
        iVar.setFixedHeight(iA4);
        this.w = b4.c(context);
        this.x = b4.d(context);
        this.y = b4.b(context);
        this.u = b4.f(context);
        this.v = b4.e(context);
        i9 i9Var = new i9(context);
        this.i = i9Var;
        ProgressBar progressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.l = progressBar;
        progressBar.setVisibility(8);
        View view4 = new View(context);
        this.m = view4;
        view4.setBackgroundColor(-1728053248);
        view4.setVisibility(8);
        View view5 = new View(context);
        this.o = view5;
        View view6 = new View(context);
        this.n = view6;
        TextView textView = new TextView(context);
        this.q = textView;
        textView.setTextSize(1, w8Var.a(w8.r));
        textView.setTextColor(-1);
        textView.setMaxLines(w8Var.a(w8.s));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, w8Var.a(w8.t));
        textView2.setTextColor(-1);
        textView2.setMaxLines(w8Var.a(w8.u));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        Button button2 = new Button(context);
        this.p = button2;
        button2.setLines(1);
        button2.setTextSize(1, w8Var.a(w8.v));
        button2.setEllipsize(TextUtils.TruncateAt.END);
        button2.setIncludeFontPadding(false);
        button2.setMinimumWidth(iA2);
        button2.setPadding(iA3, 0, iA3, 0);
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setPadding(w8Var.a(w8.x), 0, 0, 0);
        textView3.setTextColor(-1);
        textView3.setMaxLines(w8Var.a(w8.A));
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, w8Var.a(w8.W));
        ka kaVar = new ka(context);
        this.t = kaVar;
        k2 k2Var2 = new k2(context);
        this.f4043a = k2Var2;
        k2Var2.setPadding(iA);
        i9 i9Var2 = new i9(context);
        this.j = i9Var2;
        ca.a(this, "ad_view");
        ca.a(textView, "title");
        ca.a(textView2, "description");
        ca.a(i9Var, "image");
        ca.a(button2, t2.h.G0);
        ca.a(k2Var, "dismiss");
        ca.a(t1Var, "play");
        ca.a(i9Var2, "ads_logo");
        ca.a(view4, "media_dim");
        ca.a(view6, "top_dim");
        ca.a(view5, "bot_dim");
        ca.a(textView3, "age_bordering");
        ca.a(iVar, "ad_choices");
        ca.b(k2Var2, "sound_button");
        if (view3 != null) {
            addView(view3);
        }
        addView(i9Var);
        addView(view4);
        addView(view5);
        addView(view6);
        addView(view);
        addView(k2Var);
        addView(textView);
        addView(textView2);
        addView(button2);
        addView(textView3);
        addView(i9Var2);
        addView(iVar);
        addView(kaVar);
    }

    private void setClickArea(x0 x0Var) {
        if (x0Var.m) {
            setOnClickListener(this);
            this.p.setOnClickListener(this);
            return;
        }
        setOnClickListener(x0Var.l ? this : null);
        this.p.setEnabled(x0Var.g);
        this.p.setOnClickListener(x0Var.g ? this : null);
        this.q.setOnClickListener(x0Var.f4179a ? this : null);
        this.s.setOnClickListener((x0Var.h || x0Var.i) ? this : null);
        this.r.setOnClickListener(x0Var.b ? this : null);
        this.i.setOnClickListener(x0Var.d ? this : null);
    }

    @Override // com.my.target.k8
    public View a() {
        return this;
    }

    @Override // com.my.target.k8
    public void a(int i, float f) {
        this.t.setDigit(i);
        this.t.setProgress(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.my.target.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            com.my.target.t1 r0 = r3.g
            r1 = 0
            r0.setVisibility(r1)
            r0 = 1
            if (r4 != r0) goto L13
            com.my.target.t1 r4 = r3.g
            android.graphics.Bitmap r2 = r3.y
        Ld:
            r4.setImageBitmap(r2)
            r3.O = r0
            goto L24
        L13:
            r0 = 2
            if (r4 != r0) goto L1b
            com.my.target.t1 r4 = r3.g
            android.graphics.Bitmap r2 = r3.x
            goto Ld
        L1b:
            com.my.target.t1 r4 = r3.g
            android.graphics.Bitmap r0 = r3.w
            r4.setImageBitmap(r0)
            r3.O = r1
        L24:
            android.widget.Button r4 = r3.h
            if (r5 == 0) goto L31
            r4.setVisibility(r1)
            android.widget.Button r4 = r3.h
            r4.setText(r5)
            goto L36
        L31:
            r5 = 8
            r4.setVisibility(r5)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.l8.a(int, java.lang.String):void");
    }

    @Override // com.my.target.k8
    public void a(boolean z) {
        this.i.setVisibility(z ? 0 : 4);
    }

    public boolean a(int i) {
        int[] iArr = new int[2];
        View view = this.K;
        iArr[0] = view != null ? view.getMeasuredWidth() : 0;
        iArr[1] = this.i.getMeasuredWidth();
        return ((double) ca.a(iArr)) * 1.6d <= ((double) i);
    }

    @Override // com.my.target.k8
    public void b() {
        this.c.setVisibility(0);
        this.t.setVisibility(8);
    }

    @Override // com.my.target.k8
    public void b(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
    }

    @Override // com.my.target.k8
    public void c(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
    }

    @Override // com.my.target.k8
    public void d() {
        this.t.setVisibility(8);
    }

    @Override // com.my.target.k8
    public void e() {
        this.g.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // com.my.target.k8
    public void g() {
        this.f4043a.setVisibility(8);
    }

    @Override // com.my.target.k8
    public View getCloseButton() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.c) {
            this.f.k();
            return;
        }
        if (view == this.f4043a) {
            this.f.g();
            return;
        }
        if (view == this.g || view == this.h) {
            this.f.b(this.O);
            return;
        }
        if (view == this.K) {
            this.f.m();
            return;
        }
        if (view == this.m) {
            this.f.h();
            return;
        }
        if (view == this.j) {
            this.f.l();
        } else if (view == this.k) {
            this.f.c();
        } else {
            this.f.a((b) null);
        }
    }

    @Override // com.my.target.k8
    public void setBackgroundImage(ImageData imageData) {
        this.i.setImageData(imageData);
    }

    @Override // com.my.target.k8
    public void setBanner(z3 z3Var) {
        j8 promoStyleSettings = z3Var.getPromoStyleSettings();
        setBackgroundColor(promoStyleSettings.a());
        int iJ = promoStyleSettings.j();
        this.q.setTextColor(promoStyleSettings.k());
        this.r.setTextColor(iJ);
        if (TextUtils.isEmpty(z3Var.getAgeRestrictions()) && TextUtils.isEmpty(z3Var.getAdvertisingLabel())) {
            this.s.setVisibility(8);
        } else {
            String advertisingLabel = z3Var.getAdvertisingLabel();
            if (!TextUtils.isEmpty(z3Var.getAgeRestrictions()) && !TextUtils.isEmpty(z3Var.getAdvertisingLabel())) {
                advertisingLabel = advertisingLabel + " ";
            }
            String str = advertisingLabel + z3Var.getAgeRestrictions();
            this.s.setVisibility(0);
            this.s.setText(str);
        }
        ImageData closeIcon = z3Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap bitmapA = g0.a(this.b.a(w8.q));
            if (bitmapA != null) {
                this.c.a(bitmapA, false);
            }
        } else {
            this.c.a(closeIcon.getData(), true);
        }
        ca.b(this.p, promoStyleSettings.d(), promoStyleSettings.f(), this.N);
        this.p.setTextColor(promoStyleSettings.j());
        this.p.setText(z3Var.getCtaText());
        this.q.setText(z3Var.getTitle());
        this.r.setText(z3Var.getDescription());
        ImageData adIcon = z3Var.getAdIcon();
        if (adIcon != null && adIcon.getBitmap() != null) {
            this.j.setImageData(adIcon);
            this.j.setOnClickListener(this);
        }
        c adChoices = z3Var.getAdChoices();
        if (adChoices != null) {
            this.k.setImageBitmap(adChoices.c().getBitmap());
            this.k.setOnClickListener(this);
        } else {
            this.k.setVisibility(8);
        }
        setClickArea(z3Var.getClickArea());
    }

    @Override // com.my.target.k8
    public void setPanelColor(int i) {
        this.o.setBackgroundColor(i);
        this.n.setBackgroundColor(i);
    }

    @Override // com.my.target.k8
    public void setSoundState(boolean z) {
        k2 k2Var;
        String str;
        if (z) {
            this.f4043a.a(this.u, false);
            k2Var = this.f4043a;
            str = "sound_on";
        } else {
            this.f4043a.a(this.v, false);
            k2Var = this.f4043a;
            str = "sound_off";
        }
        k2Var.setContentDescription(str);
    }
}
