package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.w;
import com.my.target.x;

/* loaded from: classes4.dex */
public class d8 extends ViewGroup implements x.a {

    /* renamed from: a, reason: collision with root package name */
    public final i9 f3949a;
    public final ca b;
    public final l2 c;
    public final b d;
    public final x e;
    public final FrameLayout f;
    public final ProgressBar g;
    public final boolean h;
    public final boolean i;
    public w j;
    public VideoData k;
    public Bitmap l;
    public int m;
    public int n;
    public boolean o;
    public a p;

    public interface a extends AudioManager.OnAudioFocusChangeListener, w.a {
        void j();

        void l();

        void m();

        void o();
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d8 d8Var = d8.this;
            if (d8Var.p == null) {
                return;
            }
            if (!d8Var.e() && !d8.this.d()) {
                d8.this.p.o();
            } else if (d8.this.d()) {
                d8.this.p.l();
            } else {
                d8.this.p.j();
            }
        }
    }

    public d8(Context context, ca caVar, boolean z, boolean z2) {
        super(context);
        this.o = true;
        this.b = caVar;
        this.h = z;
        this.i = z2;
        this.f3949a = new i9(context);
        this.c = new l2(context);
        this.g = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.f = new FrameLayout(context);
        x xVar = new x(context);
        this.e = xVar;
        xVar.setAdVideoViewListener(this);
        this.d = new b();
    }

    public void a() {
        w wVar = this.j;
        if (wVar != null) {
            wVar.destroy();
        }
        this.j = null;
    }

    public void a(int i) {
        w wVar = this.j;
        if (wVar != null) {
            if (i == 0) {
                wVar.h();
            } else if (i != 1) {
                wVar.f();
            } else {
                wVar.g();
            }
        }
    }

    public final void a(z3 z3Var) {
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setVisibility(8);
        this.f3949a.setVisibility(0);
        ImageData image = z3Var.getImage();
        if (image == null || image.getData() == null) {
            return;
        }
        this.n = image.getWidth();
        int height = image.getHeight();
        this.m = height;
        if (this.n == 0 || height == 0) {
            this.n = image.getData().getWidth();
            this.m = image.getData().getHeight();
        }
        this.f3949a.setImageBitmap(image.getData());
        this.f3949a.setClickable(false);
    }

    public final void a(z3 z3Var, int i) {
        ca caVar;
        int i2;
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner == null) {
            return;
        }
        VideoData videoData = (VideoData) videoBanner.getMediaData();
        this.k = videoData;
        if (videoData == null) {
            return;
        }
        w wVarA = d5.a(this.i, getContext());
        this.j = wVarA;
        wVarA.a(this.p);
        if (videoBanner.isAutoMute()) {
            this.j.setVolume(0.0f);
        }
        this.n = this.k.getWidth();
        this.m = this.k.getHeight();
        ImageData preview = videoBanner.getPreview();
        if (preview != null) {
            this.l = preview.getData();
            if (this.n <= 0 || this.m <= 0) {
                this.n = preview.getWidth();
                this.m = preview.getHeight();
            }
            this.f3949a.setImageBitmap(this.l);
        } else {
            ImageData image = z3Var.getImage();
            if (image != null) {
                if (this.n <= 0 || this.m <= 0) {
                    this.n = image.getWidth();
                    this.m = image.getHeight();
                }
                Bitmap data = image.getData();
                this.l = data;
                this.f3949a.setImageBitmap(data);
            }
        }
        if (i != 1) {
            if (this.h) {
                caVar = this.b;
                i2 = 140;
            } else {
                caVar = this.b;
                i2 = 96;
            }
            this.c.a(b4.a(caVar.b(i2)), false);
        }
    }

    public void a(boolean z) {
        w wVar;
        w wVar2;
        this.c.setVisibility(8);
        this.g.setVisibility(0);
        if (this.k == null || (wVar = this.j) == null) {
            return;
        }
        wVar.a(this.p);
        this.j.a(this.e);
        this.e.a(this.k.getWidth(), this.k.getHeight());
        String data = this.k.getData();
        if (!z || data == null) {
            wVar2 = this.j;
            data = this.k.getUrl();
        } else {
            wVar2 = this.j;
        }
        wVar2.a(Uri.parse(data), this.e.getContext());
    }

    public void b() {
        getClickableLayout().setOnClickListener(this.d);
    }

    public void b(z3 z3Var) {
        a();
        a(z3Var);
    }

    public void b(z3 z3Var, int i) {
        if (z3Var.getVideoBanner() != null) {
            a(z3Var, i);
        } else {
            a(z3Var);
        }
    }

    public void b(boolean z) {
        w wVar = this.j;
        if (wVar != null) {
            wVar.stop();
        }
        this.g.setVisibility(8);
        this.f3949a.setVisibility(0);
        this.f3949a.setImageBitmap(this.l);
        this.o = z;
        if (z) {
            this.c.setVisibility(0);
            return;
        }
        this.f3949a.setOnClickListener(null);
        this.c.setOnClickListener(null);
        setOnClickListener(null);
    }

    public void c() {
        ca.b(this.c, "play_button");
        ca.b(this.f3949a, "media_image");
        ca.b(this.e, "video_texture");
        ca.b(this.f, "clickable_layout");
        this.f3949a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f3949a.setAdjustViewBounds(true);
        addView(this.e);
        this.g.setVisibility(8);
        addView(this.f3949a);
        addView(this.g);
        addView(this.f);
        addView(this.c);
    }

    public boolean d() {
        w wVar = this.j;
        return wVar != null && wVar.c();
    }

    public boolean e() {
        w wVar = this.j;
        return wVar != null && wVar.isPlaying();
    }

    public void f() {
        w wVar = this.j;
        if (wVar == null) {
            return;
        }
        wVar.pause();
        this.f3949a.setVisibility(0);
        Bitmap screenShot = this.e.getScreenShot();
        if (screenShot != null && this.j.i()) {
            this.f3949a.setImageBitmap(screenShot);
        }
        if (this.o) {
            this.c.setVisibility(0);
        }
    }

    public void g() {
        this.c.setVisibility(8);
        w wVar = this.j;
        if (wVar == null || this.k == null) {
            return;
        }
        wVar.a();
        this.f3949a.setVisibility(8);
    }

    public FrameLayout getClickableLayout() {
        return this.f;
    }

    public i9 getImageView() {
        return this.f3949a;
    }

    public w getVideoPlayer() {
        return this.j;
    }

    public void h() {
        this.c.setOnClickListener(this.d);
    }

    public void i() {
        this.f3949a.setVisibility(8);
        this.g.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.m;
        if (i4 == 0 || (i3 = this.n) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i4;
            size = i3;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((size / i3) * i4);
        }
        if (size == 0 || mode == 0) {
            size = (int) ((size2 / i4) * i3);
        }
        float f = i3 / i4;
        float f2 = size / f;
        float f3 = size2;
        if (f2 > f3) {
            size = (int) (f * f3);
        } else {
            size2 = (int) f2;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = (childAt == this.f3949a || childAt == this.f || childAt == this.e) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i6), View.MeasureSpec.makeMeasureSpec(size2, i6));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.x.a
    public void p() {
        a aVar;
        if (!(this.j instanceof o1)) {
            a aVar2 = this.p;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        this.e.setViewMode(1);
        VideoData videoData = this.k;
        if (videoData != null) {
            this.e.a(videoData.getWidth(), this.k.getHeight());
        }
        this.j.a(this.e);
        if (!this.j.isPlaying() || (aVar = this.p) == null) {
            return;
        }
        aVar.m();
    }

    public void setInterstitialPromoViewListener(a aVar) {
        this.p = aVar;
        w wVar = this.j;
        if (wVar != null) {
            wVar.a(aVar);
        }
    }
}
