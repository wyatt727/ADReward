package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.j4;
import com.my.target.u4;

/* loaded from: classes4.dex */
public class a8 extends RelativeLayout implements t4 {
    public static final int u = ca.c();

    /* renamed from: a, reason: collision with root package name */
    public final a f3922a;
    public final i9 b;
    public final ha c;
    public final d8 d;
    public final n7 e;
    public final l2 f;
    public final ka g;
    public final ca h;
    public final l2 i;
    public final i j;
    public final Bitmap k;
    public final Bitmap l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public u4.a r;
    public float s;
    public j4.a t;

    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u4.a aVar;
            if (!view.isEnabled() || (aVar = a8.this.r) == null) {
                return;
            }
            aVar.d();
        }
    }

    public a8(Context context, b8 b8Var) {
        super(context);
        boolean z = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        ca caVarE = ca.e(context);
        this.h = caVarE;
        i9 i9Var = new i9(context);
        this.b = i9Var;
        ha haVarB = b8Var.b(caVarE, z);
        this.c = haVarB;
        d8 d8VarA = b8Var.a(caVarE, z);
        this.d = d8VarA;
        int i = u;
        d8VarA.setId(i);
        l2 l2Var = new l2(context);
        this.f = l2Var;
        ka kaVar = new ka(context);
        this.g = kaVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        n7 n7Var = new n7(context, caVarE);
        this.e = n7Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        n7Var.setLayoutParams(layoutParams3);
        l2 l2Var2 = new l2(context);
        this.i = l2Var2;
        this.k = b4.f(context);
        this.l = b4.e(context);
        this.f3922a = new a();
        this.m = caVarE.b(64);
        this.n = caVarE.b(20);
        i iVar = new i(context);
        this.j = iVar;
        int iB = caVarE.b(28);
        this.q = iB;
        iVar.setFixedHeight(iB);
        ca.b(i9Var, "icon_image");
        ca.b(l2Var2, "sound_button");
        ca.b(haVarB, "vertical_view");
        ca.b(d8VarA, "media_view");
        ca.b(n7Var, "panel_view");
        ca.b(l2Var, "close_button");
        ca.b(kaVar, "progress_wheel");
        addView(n7Var, 0);
        addView(i9Var, 0);
        addView(haVarB, 0, layoutParams);
        addView(d8VarA, 0, layoutParams2);
        addView(l2Var2);
        addView(iVar);
        addView(l2Var);
        addView(kaVar);
        this.o = caVarE.b(28);
        this.p = caVarE.b(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        u4.a aVar = this.r;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        j4.a aVar = this.t;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.e.b(this.i);
    }

    @Override // com.my.target.t4
    public void a() {
        this.e.a(this.i);
        this.d.g();
    }

    @Override // com.my.target.t4
    public void a(int i) {
        this.d.a(i);
    }

    public final void a(c cVar) {
        this.j.setImageBitmap(cVar.c().getBitmap());
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a8$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
    }

    @Override // com.my.target.t4
    public void a(z3 z3Var) {
        this.i.setVisibility(8);
        this.f.setVisibility(0);
        a(false);
        this.d.b(z3Var);
    }

    @Override // com.my.target.t4
    public void a(boolean z) {
        this.g.setVisibility(8);
        this.e.e(this.i);
        this.d.b(z);
    }

    @Override // com.my.target.t4
    public void b() {
        this.d.i();
    }

    @Override // com.my.target.t4
    public final void b(boolean z) {
        l2 l2Var;
        String str;
        if (z) {
            this.i.a(this.l, false);
            l2Var = this.i;
            str = "sound_off";
        } else {
            this.i.a(this.k, false);
            l2Var = this.i;
            str = "sound_on";
        }
        l2Var.setContentDescription(str);
    }

    public final boolean b(z3 z3Var) {
        com.my.target.core.models.a image;
        int height;
        int width;
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner == null ? (image = z3Var.getImage()) == null : (image = (VideoData) videoBanner.getMediaData()) == null) {
            width = 0;
            height = 0;
        } else {
            height = image.getHeight();
            width = image.getWidth();
        }
        if (height <= 0 || width <= 0) {
            return false;
        }
        return height > width || ((float) width) / ((float) height) < 1.4f;
    }

    @Override // com.my.target.t4
    public void c(boolean z) {
        this.e.a(this.i);
        this.d.a(z);
    }

    @Override // com.my.target.t4
    public boolean c() {
        return this.d.d();
    }

    @Override // com.my.target.u4
    public void d() {
        this.f.setVisibility(0);
    }

    @Override // com.my.target.t4
    public void destroy() {
        this.d.a();
    }

    @Override // com.my.target.t4
    public void e() {
    }

    @Override // com.my.target.u4
    public View getCloseButton() {
        return this.f;
    }

    @Override // com.my.target.t4
    public d8 getPromoMediaView() {
        return this.d;
    }

    @Override // com.my.target.u4
    public View getView() {
        return this;
    }

    @Override // com.my.target.t4
    public boolean isPlaying() {
        return this.d.e();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        l2 l2Var = this.f;
        l2Var.layout(i3 - l2Var.getMeasuredWidth(), 0, i3, this.f.getMeasuredHeight());
        ka kaVar = this.g;
        int i5 = this.p;
        kaVar.layout(i5, i5, kaVar.getMeasuredWidth() + this.p, this.g.getMeasuredHeight() + this.p);
        ca.a(this.j, this.f.getLeft() - this.j.getMeasuredWidth(), this.f.getTop(), this.f.getLeft(), this.f.getBottom());
        if (i4 <= i3) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            int measuredWidth = (i3 - this.d.getMeasuredWidth()) / 2;
            int measuredHeight = (i4 - this.d.getMeasuredHeight()) / 2;
            d8 d8Var = this.d;
            d8Var.layout(measuredWidth, measuredHeight, d8Var.getMeasuredWidth() + measuredWidth, this.d.getMeasuredHeight() + measuredHeight);
            this.b.layout(0, 0, 0, 0);
            this.c.layout(0, 0, 0, 0);
            n7 n7Var = this.e;
            n7Var.layout(0, i4 - n7Var.getMeasuredHeight(), i3, i4);
            l2 l2Var2 = this.i;
            l2Var2.layout(i3 - l2Var2.getMeasuredWidth(), this.e.getTop() - this.i.getMeasuredHeight(), i3, this.e.getTop());
            if (this.d.e()) {
                this.e.b(this.i);
                return;
            }
            return;
        }
        if (this.i.getTranslationY() > 0.0f) {
            this.i.setTranslationY(0.0f);
        }
        setBackgroundColor(-1);
        int measuredWidth2 = (i3 - this.d.getMeasuredWidth()) / 2;
        d8 d8Var2 = this.d;
        d8Var2.layout(measuredWidth2, 0, d8Var2.getMeasuredWidth() + measuredWidth2, this.d.getMeasuredHeight());
        this.c.layout(0, this.d.getBottom(), i3, i4);
        int bottom = this.n;
        if (this.d.getMeasuredHeight() != 0) {
            bottom = this.d.getBottom() - (this.b.getMeasuredHeight() / 2);
        }
        i9 i9Var = this.b;
        int i6 = this.n;
        i9Var.layout(i6, bottom, i9Var.getMeasuredWidth() + i6, this.b.getMeasuredHeight() + bottom);
        this.e.layout(0, 0, 0, 0);
        l2 l2Var3 = this.i;
        l2Var3.layout(i3 - l2Var3.getMeasuredWidth(), this.d.getBottom() - this.i.getMeasuredHeight(), i3, this.d.getBottom());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.i.measure(i, i2);
        this.f.measure(i, i2);
        this.g.measure(View.MeasureSpec.makeMeasureSpec(this.o, 1073741824), View.MeasureSpec.makeMeasureSpec(this.o, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        i iVar = this.j;
        int i3 = this.q;
        ca.a(iVar, i3, i3, 1073741824);
        if (size2 > size) {
            this.d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - this.d.getMeasuredHeight(), Integer.MIN_VALUE));
            this.b.measure(View.MeasureSpec.makeMeasureSpec(this.m, Integer.MIN_VALUE), iMakeMeasureSpec2);
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), iMakeMeasureSpec2);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // com.my.target.t4
    public void pause() {
        this.e.e(this.i);
        this.d.f();
    }

    @Override // com.my.target.u4
    public void setBanner(z3 z3Var) {
        int width;
        int height;
        l2 l2Var;
        String str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.o, this.h.b(28));
        layoutParams.addRule(9);
        layoutParams.topMargin = this.h.b(10);
        layoutParams.leftMargin = this.h.b(10);
        this.g.setLayoutParams(layoutParams);
        this.g.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.f.setVisibility(8);
        this.f.setLayoutParams(layoutParams2);
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner == null) {
            this.i.setVisibility(8);
        }
        Point pointB = ca.b(getContext());
        boolean z = pointB.x + pointB.y < 1280 || b(z3Var);
        this.e.a();
        this.e.setBanner(z3Var);
        this.c.a(pointB.x, pointB.y, z);
        this.c.setBanner(z3Var);
        this.d.c();
        this.d.b(z3Var, 0);
        ImageData closeIcon = z3Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap bitmapA = g0.a(this.q);
            if (bitmapA != null) {
                this.f.a(bitmapA, false);
            }
        } else {
            this.f.a(closeIcon.getData(), true);
        }
        ImageData icon = z3Var.getIcon();
        if (icon != null) {
            width = icon.getWidth();
            height = icon.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = this.h.b(4);
        if (width != 0 && height != 0) {
            int iB = (int) (this.h.b(64) * (height / width));
            layoutParams3.width = this.m;
            layoutParams3.height = iB;
            if (!z) {
                layoutParams3.bottomMargin = (-iB) / 2;
            }
        }
        layoutParams3.addRule(8, u);
        layoutParams3.setMarginStart(this.h.b(20));
        this.b.setLayoutParams(layoutParams3);
        if (icon != null) {
            this.b.setImageBitmap(icon.getData());
        }
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            c(true);
            post(new Runnable() { // from class: com.my.target.a8$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.f();
                }
            });
        }
        if (videoBanner != null) {
            this.s = videoBanner.getDuration();
            if (videoBanner.isAutoMute()) {
                this.i.a(this.l, false);
                l2Var = this.i;
                str = "sound_off";
            } else {
                this.i.a(this.k, false);
                l2Var = this.i;
                str = "sound_on";
            }
            l2Var.setContentDescription(str);
        }
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a8$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.b(view);
            }
        });
        c adChoices = z3Var.getAdChoices();
        if (adChoices != null) {
            a(adChoices);
        } else {
            this.j.setVisibility(8);
        }
    }

    @Override // com.my.target.u4
    public void setClickArea(x0 x0Var) {
        ba.a("PromoDefaultStyleView: Apply click area " + x0Var.a() + " to view");
        this.b.setOnClickListener((x0Var.c || x0Var.m) ? this.f3922a : null);
        this.d.getImageView().setOnClickListener((x0Var.m || x0Var.d) ? this.f3922a : null);
        if (x0Var.m || x0Var.n) {
            this.d.getClickableLayout().setOnClickListener(this.f3922a);
        } else {
            this.d.b();
        }
        this.c.a(x0Var, this.f3922a);
        this.e.a(x0Var, this.f3922a);
    }

    @Override // com.my.target.u4
    public void setInterstitialPromoViewListener(u4.a aVar) {
        this.r = aVar;
    }

    @Override // com.my.target.t4
    public void setMediaListener(j4.a aVar) {
        this.t = aVar;
        this.d.setInterstitialPromoViewListener(aVar);
        this.d.h();
    }

    @Override // com.my.target.t4
    public void setTimeChanged(float f) {
        this.g.setVisibility(0);
        float f2 = this.s;
        if (f2 > 0.0f) {
            this.g.setProgress(f / f2);
        }
        this.g.setDigit((int) ((this.s - f) + 1.0f));
    }
}
