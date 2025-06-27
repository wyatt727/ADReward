package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.views.MediaAdView;

/* loaded from: classes4.dex */
public class ia extends ViewGroup {
    public static final int A = ca.c();
    public static final int B = ca.c();
    public static final int C = ca.c();
    public static final int D = ca.c();
    public static final int E = ca.c();
    public static final int F = ca.c();
    public static final int G = ca.c();
    public static final int H = ca.c();
    public static final int I = ca.c();
    public static final int J = ca.c();
    public static final int K = ca.c();
    public static final int L = ca.c();
    public static final int M = ca.c();

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4007a;
    public final StarsRatingView b;
    public final Button c;
    public final Button d;
    public final ca e;
    public final LinearLayout f;
    public final TextView g;
    public final FrameLayout h;
    public final MediaAdView i;
    public final TextView j;
    public final la k;
    public final l2 l;
    public final x m;
    public final u1 n;
    public final u1 o;
    public final u1 p;
    public final Runnable q;
    public final c r;
    public final View.OnClickListener s;
    public final Bitmap t;
    public final Bitmap u;
    public final int v;
    public final int w;
    public d x;
    public int y;
    public boolean z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ia.this.x != null) {
                int id = view.getId();
                if (id == ia.B) {
                    ia.this.x.a(view);
                    return;
                }
                if (id == ia.C) {
                    ia.this.x.c();
                    return;
                }
                if (id == ia.E) {
                    ia.this.x.a();
                    return;
                }
                if (id == ia.D) {
                    ia.this.x.k();
                } else if (id == ia.A) {
                    ia.this.x.g();
                } else if (id == ia.J) {
                    ia.this.x.b();
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ia iaVar = ia.this;
            if (iaVar.y == 2) {
                iaVar.a();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ia iaVar = ia.this;
            iaVar.removeCallbacks(iaVar.q);
            ia iaVar2 = ia.this;
            int i = iaVar2.y;
            if (i == 2) {
                iaVar2.a();
                return;
            }
            if (i == 0) {
                iaVar2.c();
            }
            ia iaVar3 = ia.this;
            iaVar3.postDelayed(iaVar3.q, 4000L);
        }
    }

    public interface d {
        void a();

        void a(View view);

        void b();

        void c();

        void g();

        void k();
    }

    public ia(Context context) {
        super(context);
        Button button = new Button(context);
        this.d = button;
        TextView textView = new TextView(context);
        this.f4007a = textView;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.b = starsRatingView;
        Button button2 = new Button(context);
        this.c = button2;
        TextView textView2 = new TextView(context);
        this.g = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        u1 u1Var = new u1(context);
        this.n = u1Var;
        u1 u1Var2 = new u1(context);
        this.o = u1Var2;
        u1 u1Var3 = new u1(context);
        this.p = u1Var3;
        TextView textView3 = new TextView(context);
        this.j = textView3;
        MediaAdView mediaAdView = new MediaAdView(context);
        this.i = mediaAdView;
        la laVar = new la(context);
        this.k = laVar;
        l2 l2Var = new l2(context);
        this.l = l2Var;
        this.f = new LinearLayout(context);
        ca caVarE = ca.e(context);
        this.e = caVarE;
        this.q = new b();
        this.r = new c();
        this.s = new a();
        this.m = new x(context);
        this.t = n6.c(caVarE.b(28));
        this.u = n6.b(caVarE.b(28));
        ca.b(button, "dismiss_button");
        ca.b(textView, "title_text");
        ca.b(starsRatingView, "stars_view");
        ca.b(button2, "cta_button");
        ca.b(textView2, "replay_text");
        ca.b(frameLayout, "shadow");
        ca.b(u1Var, "pause_button");
        ca.b(u1Var2, "play_button");
        ca.b(u1Var3, "replay_button");
        ca.b(textView3, "domain_text");
        ca.b(mediaAdView, "media_view");
        ca.b(laVar, "video_progress_wheel");
        ca.b(l2Var, "sound_button");
        this.w = caVarE.b(28);
        this.v = caVarE.b(16);
        b();
    }

    public final void a() {
        if (this.y != 0) {
            this.y = 0;
            this.i.getImageView().setVisibility(8);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    public void a(float f, float f2) {
        if (this.k.getVisibility() != 0) {
            this.k.setVisibility(0);
        }
        this.k.setProgress(f / f2);
        this.k.setDigit((int) Math.ceil(f2 - f));
    }

    public void a(d6 d6Var, VideoData videoData) {
        b5<VideoData> videoBanner = d6Var.getVideoBanner();
        if (videoBanner == null) {
            return;
        }
        this.k.setMax(d6Var.getDuration());
        this.z = videoBanner.isAllowReplay();
        this.c.setText(d6Var.getCtaText());
        this.f4007a.setText(d6Var.getTitle());
        if ("store".equals(d6Var.getNavigationType())) {
            this.j.setVisibility(8);
            if (d6Var.getVotes() == 0 || d6Var.getRating() <= 0.0f) {
                this.b.setVisibility(8);
            } else {
                this.b.setVisibility(0);
                this.b.setRating(d6Var.getRating());
            }
        } else {
            this.b.setVisibility(8);
            this.j.setVisibility(0);
            this.j.setText(d6Var.getDomain());
        }
        this.d.setText(videoBanner.getCloseActionText());
        this.g.setText(videoBanner.getReplayActionText());
        Bitmap bitmapC = n6.c();
        if (bitmapC != null) {
            this.p.setImageBitmap(bitmapC);
        }
        this.i.setPlaceHolderDimension(videoData.getWidth(), videoData.getHeight());
        ImageData image = d6Var.getImage();
        if (image != null) {
            this.i.getImageView().setImageBitmap(image.getBitmap());
        }
    }

    public void a(boolean z) {
        l2 l2Var;
        String str;
        if (z) {
            this.l.a(this.u, false);
            l2Var = this.l;
            str = "sound off";
        } else {
            this.l.a(this.t, false);
            l2Var = this.l;
            str = "sound on";
        }
        l2Var.setContentDescription(str);
    }

    public final void b() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.v;
        this.l.setId(J);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.i.setId(M);
        this.i.setLayoutParams(layoutParams);
        this.i.setId(I);
        this.i.setOnClickListener(this.r);
        this.i.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.h.setBackgroundColor(-1728053248);
        this.h.setVisibility(8);
        this.d.setId(A);
        this.d.setTextSize(2, 16.0f);
        this.d.setTransformationMethod(null);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setMaxLines(2);
        this.d.setPadding(i, i, i, i);
        this.d.setTextColor(-1);
        ca.a(this.d, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.f4007a.setId(G);
        this.f4007a.setMaxLines(2);
        this.f4007a.setEllipsize(TextUtils.TruncateAt.END);
        this.f4007a.setTextSize(2, 18.0f);
        this.f4007a.setTextColor(-1);
        ca.a(this.c, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.c.setId(B);
        this.c.setTextColor(-1);
        this.c.setTransformationMethod(null);
        this.c.setGravity(1);
        this.c.setTextSize(2, 16.0f);
        this.c.setLines(1);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setMinimumWidth(this.e.b(100));
        this.c.setPadding(i, i, i, i);
        this.f4007a.setShadowLayer(this.e.b(1), this.e.b(1), this.e.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.j.setId(H);
        this.j.setTextColor(-3355444);
        this.j.setMaxEms(10);
        this.j.setShadowLayer(this.e.b(1), this.e.b(1), this.e.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f.setId(C);
        this.f.setOnClickListener(this.s);
        this.f.setGravity(17);
        this.f.setVisibility(8);
        this.f.setPadding(this.e.b(8), 0, this.e.b(8), 0);
        this.g.setSingleLine();
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.g;
        textView.setTypeface(textView.getTypeface(), 1);
        this.g.setTextColor(-1);
        this.g.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.e.b(4);
        this.p.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.n.setId(E);
        this.n.setOnClickListener(this.s);
        this.n.setVisibility(8);
        this.n.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.o.setId(D);
        this.o.setOnClickListener(this.s);
        this.o.setVisibility(8);
        this.o.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.h.setId(K);
        Bitmap bitmapB = n6.b();
        if (bitmapB != null) {
            this.o.setImageBitmap(bitmapB);
        }
        Bitmap bitmapA = n6.a();
        if (bitmapA != null) {
            this.n.setImageBitmap(bitmapA);
        }
        ca.a(this.n, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        ca.a(this.o, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        ca.a(this.p, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.b.setId(L);
        this.b.setStarSize(this.e.b(12));
        this.k.setId(F);
        this.k.setVisibility(8);
        this.i.addView(this.m, new ViewGroup.LayoutParams(-1, -1));
        addView(this.i);
        addView(this.h);
        addView(this.l);
        addView(this.d);
        addView(this.k);
        addView(this.f);
        addView(this.n);
        addView(this.o);
        addView(this.b);
        addView(this.j);
        addView(this.c);
        addView(this.f4007a);
        this.f.addView(this.p);
        this.f.addView(this.g, layoutParams2);
        this.c.setOnClickListener(this.s);
        this.d.setOnClickListener(this.s);
        this.l.setOnClickListener(this.s);
    }

    public final void c() {
        if (this.y != 2) {
            this.y = 2;
            this.i.getImageView().setVisibility(8);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(0);
            this.h.setVisibility(8);
        }
    }

    public void d() {
        if (this.y != 3) {
            this.y = 3;
            this.i.getProgressBarView().setVisibility(0);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    public void e() {
        if (this.y != 1) {
            this.y = 1;
            this.i.getImageView().setVisibility(0);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            this.h.setVisibility(0);
        }
    }

    public void f() {
        int i = this.y;
        if (i == 0 || i == 2) {
            return;
        }
        this.y = 0;
        this.i.getImageView().setVisibility(8);
        this.i.getProgressBarView().setVisibility(8);
        this.f.setVisibility(8);
        this.o.setVisibility(8);
        if (this.y != 2) {
            this.n.setVisibility(8);
        }
    }

    public void g() {
        this.i.getImageView().setVisibility(0);
    }

    public x getAdVideoView() {
        return this.m;
    }

    public MediaAdView getMediaAdView() {
        return this.i;
    }

    public void h() {
        if (this.y != 4) {
            this.y = 4;
            this.i.getImageView().setVisibility(0);
            this.i.getProgressBarView().setVisibility(8);
            if (this.z) {
                this.f.setVisibility(0);
                this.h.setVisibility(0);
            }
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.i.getMeasuredWidth();
        int measuredHeight = this.i.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.i.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.h.layout(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
        int measuredWidth2 = this.o.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.o.getMeasuredHeight() >> 1;
        this.o.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.n.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.n.getMeasuredHeight() >> 1;
        this.n.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f.getMeasuredHeight() >> 1;
        this.f.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        Button button = this.d;
        int i14 = this.v;
        button.layout(i14, i14, button.getMeasuredWidth() + i14, this.v + this.d.getMeasuredHeight());
        if (i5 <= i6) {
            this.l.layout(((this.i.getRight() - this.v) - this.l.getMeasuredWidth()) + this.l.getPadding(), ((this.i.getBottom() - this.v) - this.l.getMeasuredHeight()) + this.l.getPadding(), (this.i.getRight() - this.v) + this.l.getPadding(), (this.i.getBottom() - this.v) + this.l.getPadding());
            TextView textView = this.f4007a;
            int i15 = i5 >> 1;
            textView.layout(i15 - (textView.getMeasuredWidth() >> 1), this.i.getBottom() + this.v, (this.f4007a.getMeasuredWidth() >> 1) + i15, this.i.getBottom() + this.v + this.f4007a.getMeasuredHeight());
            StarsRatingView starsRatingView = this.b;
            starsRatingView.layout(i15 - (starsRatingView.getMeasuredWidth() >> 1), this.f4007a.getBottom() + this.v, (this.b.getMeasuredWidth() >> 1) + i15, this.f4007a.getBottom() + this.v + this.b.getMeasuredHeight());
            TextView textView2 = this.j;
            textView2.layout(i15 - (textView2.getMeasuredWidth() >> 1), this.f4007a.getBottom() + this.v, (this.j.getMeasuredWidth() >> 1) + i15, this.f4007a.getBottom() + this.v + this.j.getMeasuredHeight());
            Button button2 = this.c;
            button2.layout(i15 - (button2.getMeasuredWidth() >> 1), this.b.getBottom() + this.v, i15 + (this.c.getMeasuredWidth() >> 1), this.b.getBottom() + this.v + this.c.getMeasuredHeight());
            this.k.layout(this.v, (this.i.getBottom() - this.v) - this.k.getMeasuredHeight(), this.v + this.k.getMeasuredWidth(), this.i.getBottom() - this.v);
            return;
        }
        int iMax = Math.max(this.c.getMeasuredHeight(), Math.max(this.f4007a.getMeasuredHeight(), this.b.getMeasuredHeight()));
        Button button3 = this.c;
        int measuredWidth5 = (i5 - this.v) - button3.getMeasuredWidth();
        int measuredHeight5 = ((i6 - this.v) - this.c.getMeasuredHeight()) - ((iMax - this.c.getMeasuredHeight()) >> 1);
        int i16 = this.v;
        button3.layout(measuredWidth5, measuredHeight5, i5 - i16, (i6 - i16) - ((iMax - this.c.getMeasuredHeight()) >> 1));
        this.l.layout((this.c.getRight() - this.l.getMeasuredWidth()) + this.l.getPadding(), (((this.i.getBottom() - (this.v << 1)) - this.l.getMeasuredHeight()) - iMax) + this.l.getPadding(), this.c.getRight() + this.l.getPadding(), ((this.i.getBottom() - (this.v << 1)) - iMax) + this.l.getPadding());
        StarsRatingView starsRatingView2 = this.b;
        int left = (this.c.getLeft() - this.v) - this.b.getMeasuredWidth();
        int measuredHeight6 = ((i6 - this.v) - this.b.getMeasuredHeight()) - ((iMax - this.b.getMeasuredHeight()) >> 1);
        int left2 = this.c.getLeft();
        int i17 = this.v;
        starsRatingView2.layout(left, measuredHeight6, left2 - i17, (i6 - i17) - ((iMax - this.b.getMeasuredHeight()) >> 1));
        TextView textView3 = this.j;
        int left3 = (this.c.getLeft() - this.v) - this.j.getMeasuredWidth();
        int measuredHeight7 = ((i6 - this.v) - this.j.getMeasuredHeight()) - ((iMax - this.j.getMeasuredHeight()) >> 1);
        int left4 = this.c.getLeft();
        int i18 = this.v;
        textView3.layout(left3, measuredHeight7, left4 - i18, (i6 - i18) - ((iMax - this.j.getMeasuredHeight()) >> 1));
        int iMin = Math.min(this.b.getLeft(), this.j.getLeft());
        TextView textView4 = this.f4007a;
        int measuredWidth6 = (iMin - this.v) - textView4.getMeasuredWidth();
        int measuredHeight8 = ((i6 - this.v) - this.f4007a.getMeasuredHeight()) - ((iMax - this.f4007a.getMeasuredHeight()) >> 1);
        int i19 = this.v;
        textView4.layout(measuredWidth6, measuredHeight8, iMin - i19, (i6 - i19) - ((iMax - this.f4007a.getMeasuredHeight()) >> 1));
        la laVar = this.k;
        int i20 = this.v;
        laVar.layout(i20, ((i6 - i20) - laVar.getMeasuredHeight()) - ((iMax - this.k.getMeasuredHeight()) >> 1), this.v + this.k.getMeasuredWidth(), (i6 - this.v) - ((iMax - this.k.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.l.measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.w, 1073741824));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.w, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.v << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredHeight(), 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f4007a.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.c.getMeasuredWidth();
            int measuredWidth2 = this.f4007a.getMeasuredWidth();
            if (this.k.getMeasuredWidth() + measuredWidth2 + Math.max(this.b.getMeasuredWidth(), this.j.getMeasuredWidth()) + measuredWidth + (this.v * 3) > i4) {
                int measuredWidth3 = (i4 - this.k.getMeasuredWidth()) - (this.v * 3);
                int i6 = measuredWidth3 / 3;
                this.c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.b.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f4007a.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.c.getMeasuredWidth()) - this.j.getMeasuredWidth()) - this.b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(d dVar) {
        this.x = dVar;
    }
}
