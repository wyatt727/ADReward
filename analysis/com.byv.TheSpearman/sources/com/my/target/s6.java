package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.ia;
import com.my.target.k;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.w;
import com.my.target.x;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class s6 implements w.a, k.a, ia.d, x.a {

    /* renamed from: a, reason: collision with root package name */
    public final e7 f4123a;
    public final b5<VideoData> b;
    public final VideoData c;
    public final AudioManager.OnAudioFocusChangeListener d = new a();
    public final d6 e;
    public final qa f;
    public final o7 g;
    public WeakReference<MediaAdView> h;
    public WeakReference<k> i;
    public WeakReference<ia> j;
    public w k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public Uri r;
    public View.OnClickListener s;
    public WeakReference<Context> t;
    public b u;
    public long v;
    public boolean w;
    public boolean x;

    public final class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3) {
                s6.this.s();
                return;
            }
            if (i == -2 || i == -1) {
                s6.this.w();
                ba.a("NativeAdVideoController$AfChangeListener: Audiofocus loss, pausing");
            } else if ((i == 1 || i == 2 || i == 4) && s6.this.n) {
                ba.a("NativeAdVideoController$AfChangeListener: Audiofocus gain, unmuting");
                s6.this.d(false);
            }
        }
    }

    public interface b {
        void a();

        void b();

        void d();

        void e();
    }

    public s6(d6 d6Var, b5<VideoData> b5Var, VideoData videoData, e7 e7Var) {
        this.b = b5Var;
        this.e = d6Var;
        this.f4123a = e7Var;
        this.c = videoData;
        this.m = b5Var.isAutoPlay();
        this.p = b5Var.isAutoMute();
        this.f = qa.a(b5Var.getStatHolder());
        this.g = e7Var.a(b5Var);
        String data = videoData.getData();
        this.r = Uri.parse(data == null ? videoData.getUrl() : data);
    }

    @Override // com.my.target.ia.d
    public void a() {
        if (this.q != 1) {
            return;
        }
        w();
        this.q = 2;
        WeakReference<k> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.g.e();
    }

    @Override // com.my.target.w.a
    public void a(float f) {
        ia iaVar;
        WeakReference<ia> weakReference = this.j;
        if (weakReference == null || (iaVar = weakReference.get()) == null) {
            return;
        }
        iaVar.a(f <= 0.0f);
    }

    @Override // com.my.target.w.a
    public void a(float f, float f2) {
        ia iaVar;
        i();
        this.f.a(f, f2);
        this.g.a(f, f2);
        if (!this.o) {
            b bVar = this.u;
            if (bVar != null) {
                bVar.e();
            }
            this.o = true;
        }
        float duration = this.b.getDuration();
        WeakReference<ia> weakReference = this.j;
        if (weakReference != null && (iaVar = weakReference.get()) != null) {
            iaVar.a(f, duration);
        }
        int iA = r1.a(f, duration);
        if (iA == 1) {
            a(duration, duration);
            return;
        }
        if (this.k == null) {
            return;
        }
        if (r1.a(f, 0.0f) == 1) {
            this.v = this.k.getPosition();
        }
        if (iA == -1) {
            return;
        }
        if (this.x) {
            this.k.d();
            return;
        }
        n();
        this.q = 3;
        this.k.stop();
        this.m = false;
        b bVar2 = this.u;
        if (bVar2 != null) {
            bVar2.a();
        }
        this.g.c();
    }

    public final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.d);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.s = onClickListener;
    }

    @Override // com.my.target.ia.d
    public void a(View view) {
        if (this.q == 1) {
            w wVar = this.k;
            if (wVar != null) {
                wVar.pause();
            }
            d();
        }
        View.OnClickListener onClickListener = this.s;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        a(kVar, frameLayout, new ia(frameLayout.getContext()));
    }

    public void a(k kVar, FrameLayout frameLayout, ia iaVar) {
        this.q = 4;
        this.i = new WeakReference<>(kVar);
        iaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(iaVar);
        this.j = new WeakReference<>(iaVar);
        iaVar.a(this.e, this.c);
        iaVar.setVideoDialogViewListener(this);
        iaVar.a(this.p);
        this.g.a(true);
        a(iaVar.getAdVideoView(), this.p);
    }

    public void a(MediaAdView mediaAdView, Context context) {
        x xVar;
        WeakReference<Context> weakReference;
        ba.a("NativeAdVideoController: Register video ad with view " + mediaAdView);
        if (this.n) {
            return;
        }
        WeakReference<MediaAdView> weakReference2 = this.h;
        if (weakReference2 != null && weakReference2.get() == mediaAdView && (weakReference = this.t) != null && weakReference.get() == context && (mediaAdView.getChildAt(1) instanceof x)) {
            xVar = (x) mediaAdView.getChildAt(1);
        } else {
            y();
            this.g.a(context);
            this.h = new WeakReference<>(mediaAdView);
            this.t = new WeakReference<>(context);
            x xVar2 = new x(mediaAdView.getContext().getApplicationContext());
            mediaAdView.addView(xVar2, 1);
            xVar = xVar2;
        }
        xVar.setAdVideoViewListener(this);
        this.f.a(xVar);
        if (this.m) {
            e();
        } else {
            n();
        }
    }

    public void a(b bVar) {
        this.u = bVar;
    }

    public final void a(x xVar, boolean z) {
        if (this.k == null) {
            w wVarA = this.f4123a.a();
            this.k = wVarA;
            wVarA.a(this);
        }
        d(z);
        this.k.a(xVar);
        xVar.a(this.c.getWidth(), this.c.getHeight());
        if (this.k.isPlaying()) {
            i();
            return;
        }
        this.k.a(this.r, xVar.getContext());
        long j = this.v;
        if (j > 0) {
            this.k.seekTo(j);
        }
    }

    @Override // com.my.target.w.a
    public void a(String str) {
        this.g.f();
        VideoData videoData = (VideoData) this.b.getMediaData();
        if (videoData == null || !this.r.toString().equals(videoData.getData())) {
            b bVar = this.u;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        ba.a("NativeAdVideoController: Try to play video stream from URL");
        this.r = Uri.parse(videoData.getUrl());
        WeakReference<Context> weakReference = this.t;
        Context context = weakReference != null ? weakReference.get() : null;
        w wVar = this.k;
        if (wVar == null || context == null) {
            return;
        }
        wVar.a(this.r, context);
    }

    public void a(boolean z) {
        this.x = z;
    }

    @Override // com.my.target.ia.d
    public void b() {
        w wVar = this.k;
        if (wVar == null) {
            this.p = !this.p;
            return;
        }
        if (wVar.e()) {
            this.k.f();
            this.g.b(true);
            this.p = false;
        } else {
            this.k.h();
            this.g.b(false);
            this.p = true;
        }
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.d, 3, 2);
        }
    }

    public void b(View view) {
        WeakReference<Context> weakReference = this.t;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context == null) {
            context = view.getContext();
        }
        b(context);
        if (this.w) {
            return;
        }
        if (this.q == 1) {
            this.q = 4;
        }
        try {
            k.a(this, context).show();
            this.n = true;
        } catch (Throwable th) {
            th.printStackTrace();
            ba.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            q();
        }
    }

    @Override // com.my.target.k.a
    public void b(boolean z) {
        w wVar = this.k;
        if (wVar == null || z) {
            return;
        }
        this.v = wVar.getPosition();
        r();
        d();
    }

    @Override // com.my.target.ia.d
    public void c() {
        ia iaVar;
        x();
        WeakReference<ia> weakReference = this.j;
        if (weakReference != null && (iaVar = weakReference.get()) != null) {
            iaVar.g();
        }
        b bVar = this.u;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void c(boolean z) {
        this.w = z;
    }

    @Override // com.my.target.w.a
    public void d() {
        Context context;
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT != null) {
            context = mediaAdViewT.getContext();
            if (!this.w) {
                mediaAdViewT.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewT.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        w();
        if (mediaAdViewT != null) {
            a(context);
        }
        b bVar = this.u;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void d(boolean z) {
        w wVar = this.k;
        if (wVar == null) {
            return;
        }
        if (z) {
            wVar.h();
        } else {
            wVar.f();
        }
    }

    @Override // com.my.target.w.a
    public void e() {
        WeakReference<ia> weakReference;
        ia iaVar;
        this.q = 4;
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT != null) {
            if (!this.w) {
                mediaAdViewT.getProgressBarView().setVisibility(0);
            }
            mediaAdViewT.getPlayButtonView().setVisibility(8);
        }
        if (!this.n || (weakReference = this.j) == null || (iaVar = weakReference.get()) == null) {
            return;
        }
        iaVar.d();
    }

    @Override // com.my.target.w.a
    public void f() {
    }

    @Override // com.my.target.ia.d
    public void g() {
        WeakReference<k> weakReference = this.i;
        k kVar = weakReference == null ? null : weakReference.get();
        if (kVar == null || !kVar.isShowing()) {
            return;
        }
        kVar.dismiss();
    }

    @Override // com.my.target.w.a
    public void h() {
        this.g.g();
        b bVar = this.u;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.my.target.w.a
    public void i() {
        WeakReference<ia> weakReference;
        ia iaVar;
        if (this.q == 1) {
            return;
        }
        this.q = 1;
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT != null) {
            mediaAdViewT.getProgressBarView().setVisibility(8);
            mediaAdViewT.getPlayButtonView().setVisibility(8);
        }
        if (!this.n || (weakReference = this.j) == null || (iaVar = weakReference.get()) == null) {
            return;
        }
        if (this.k != null) {
            x adVideoView = iaVar.getAdVideoView();
            adVideoView.a(this.c.getWidth(), this.c.getHeight());
            this.k.a(adVideoView);
        }
        iaVar.f();
    }

    @Override // com.my.target.ia.d
    public void k() {
        WeakReference<k> weakReference = this.i;
        if (weakReference != null && weakReference.get() != null) {
            x();
            this.g.h();
        }
        b bVar = this.u;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.my.target.w.a
    public void n() {
        Context context;
        WeakReference<ia> weakReference;
        ia iaVar;
        this.o = false;
        this.v = 0L;
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT != null) {
            ImageView imageView = mediaAdViewT.getImageView();
            ImageData image = this.b.getImage();
            if (image != null) {
                imageView.setImageBitmap(image.getBitmap());
            }
            imageView.setVisibility(0);
            if (!this.w) {
                mediaAdViewT.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewT.getProgressBarView().setVisibility(8);
            context = mediaAdViewT.getContext();
        } else {
            context = null;
        }
        if (this.n && (weakReference = this.j) != null && (iaVar = weakReference.get()) != null) {
            iaVar.h();
            context = iaVar.getContext();
        }
        if (context != null) {
            a(context);
        }
    }

    @Override // com.my.target.w.a
    public void onVideoCompleted() {
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT != null) {
            mediaAdViewT.getProgressBarView().setVisibility(8);
            if (!this.w) {
                mediaAdViewT.getPlayButtonView().setVisibility(0);
            }
        }
        this.v = 0L;
    }

    @Override // com.my.target.x.a
    public void p() {
        ba.a("NativeAdVideoController: Native Ad Views without hardware acceleration is not currently supported");
        b bVar = this.u;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[PHI: r3
      0x0058: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v4 android.view.View) binds: [B:21:0x0056, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.my.target.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r7 = this;
            java.lang.String r0 = "NativeAdVideoController: Dismiss dialog"
            com.my.target.ba.a(r0)
            r0 = 0
            r7.i = r0
            r1 = 0
            r7.n = r1
            r2 = 1
            r7.d(r2)
            com.my.target.nativeads.views.MediaAdView r3 = r7.t()
            if (r3 != 0) goto L16
            return
        L16:
            android.content.Context r4 = r3.getContext()
            r7.a(r4)
            int r4 = r7.q
            r5 = 4
            if (r4 == r2) goto L41
            r6 = 2
            if (r4 == r6) goto L3b
            r6 = 3
            if (r4 == r6) goto L3b
            if (r4 == r5) goto L2d
            r7.m = r1
            goto L5d
        L2d:
            r7.m = r2
            r7.e()
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof com.my.target.x
            if (r4 == 0) goto L5d
            goto L58
        L3b:
            r7.m = r1
            r7.n()
            goto L5d
        L41:
            r7.q = r5
            r7.i()
            com.my.target.b5<com.my.target.common.models.VideoData> r4 = r7.b
            boolean r4 = r4.isAutoPlay()
            if (r4 == 0) goto L50
            r7.m = r2
        L50:
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof com.my.target.x
            if (r4 == 0) goto L5d
        L58:
            com.my.target.x r3 = (com.my.target.x) r3
            r7.a(r3, r2)
        L5d:
            com.my.target.o7 r2 = r7.g
            r2.a(r1)
            r7.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.s6.q():void");
    }

    public final void r() {
        w wVar = this.k;
        if (wVar == null) {
            return;
        }
        wVar.a((w.a) null);
        this.k.destroy();
        this.k = null;
    }

    public void s() {
        w wVar = this.k;
        if (wVar == null || this.p) {
            return;
        }
        wVar.g();
    }

    public final MediaAdView t() {
        WeakReference<MediaAdView> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void u() {
        w wVar;
        if (!this.l || this.n) {
            return;
        }
        this.l = false;
        if (this.q == 1 && (wVar = this.k) != null) {
            wVar.pause();
            this.q = 2;
        }
        w wVar2 = this.k;
        if (wVar2 != null) {
            wVar2.a((w.a) null);
            this.k.a((x) null);
        }
    }

    public void v() {
        MediaAdView mediaAdViewT = t();
        if (mediaAdViewT == null) {
            ba.a("NativeAdVideoController: Trying to play video in unregistered view");
            r();
            return;
        }
        if (mediaAdViewT.getWindowVisibility() != 0) {
            if (this.q != 1) {
                r();
                return;
            }
            w wVar = this.k;
            if (wVar != null) {
                this.v = wVar.getPosition();
            }
            r();
            this.q = 4;
            this.l = false;
            e();
            return;
        }
        if (this.l) {
            return;
        }
        WeakReference<Context> weakReference = this.t;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            a(mediaAdViewT, context);
        }
        this.l = true;
        x xVar = mediaAdViewT.getChildAt(1) instanceof x ? (x) mediaAdViewT.getChildAt(1) : null;
        if (xVar == null) {
            r();
            return;
        }
        w wVar2 = this.k;
        if (wVar2 != null && !this.r.equals(wVar2.getUri())) {
            r();
        }
        if (!this.m) {
            if (!this.w) {
                mediaAdViewT.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewT.getProgressBarView().setVisibility(8);
        }
        if (!this.m || this.n) {
            return;
        }
        w wVar3 = this.k;
        if (wVar3 == null || !wVar3.c()) {
            a(xVar, true);
        } else {
            this.k.a(xVar);
            xVar.a(this.c.getWidth(), this.c.getHeight());
            this.k.a(this);
            this.k.a();
        }
        d(true);
    }

    public void w() {
        WeakReference<ia> weakReference;
        if (!this.n || (weakReference = this.j) == null) {
            return;
        }
        this.q = 2;
        ia iaVar = weakReference.get();
        if (iaVar == null) {
            return;
        }
        w wVar = this.k;
        if (wVar != null) {
            wVar.pause();
        }
        iaVar.e();
    }

    public final void x() {
        WeakReference<ia> weakReference;
        WeakReference<ia> weakReference2;
        w wVar = this.k;
        if (wVar != null && wVar.c()) {
            MediaAdView mediaAdViewT = t();
            if (mediaAdViewT == null) {
                ba.a("NativeAdVideoController: Trying to play video in unregistered view");
                r();
                return;
            }
            x adVideoView = null;
            if (this.n && (weakReference2 = this.j) != null) {
                adVideoView = weakReference2.get().getAdVideoView();
            } else if (mediaAdViewT.getChildAt(1) instanceof x) {
                adVideoView = (x) mediaAdViewT.getChildAt(1);
            }
            if (adVideoView == null) {
                r();
                return;
            } else {
                adVideoView.a(this.c.getWidth(), this.c.getHeight());
                this.k.a(adVideoView);
                this.k.a();
            }
        } else if (this.n && (weakReference = this.j) != null) {
            a(weakReference.get().getAdVideoView(), this.p);
        }
        e();
    }

    public void y() {
        MediaAdView mediaAdView;
        u();
        this.f.a((View) null);
        this.g.a((Context) null);
        r();
        WeakReference<MediaAdView> weakReference = this.h;
        if (weakReference == null || (mediaAdView = weakReference.get()) == null || !(mediaAdView.getChildAt(1) instanceof x)) {
            return;
        }
        mediaAdView.removeViewAt(1);
    }
}
