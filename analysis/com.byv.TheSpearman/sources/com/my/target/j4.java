package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import com.my.target.common.models.VideoData;
import com.my.target.d8;
import com.my.target.q4;

/* loaded from: classes4.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final b5<VideoData> f4013a;
    public final a b;
    public final t4 c;
    public final qa d;
    public final o7 e;
    public final q4.c f;
    public final q4.b g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m = true;

    public class a implements d8.a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            j4.this.a(i);
        }

        public void a() {
            j4 j4Var = j4.this;
            if (j4Var.i) {
                j4Var.i();
                j4.this.e.b(true);
                j4.this.i = false;
            } else {
                j4Var.c();
                j4.this.e.b(false);
                j4.this.i = true;
            }
        }

        @Override // com.my.target.w.a
        public void a(float f) {
            j4.this.c.b(f <= 0.0f);
        }

        @Override // com.my.target.w.a
        public void a(float f, float f2) {
            j4.this.c.setTimeChanged(f);
            j4 j4Var = j4.this;
            j4Var.l = false;
            if (!j4Var.k) {
                j4Var.k = true;
            }
            if (j4Var.j && j4Var.f4013a.isAutoPlay() && j4.this.f4013a.getAllowCloseDelay() <= f) {
                j4.this.c.d();
            }
            j4 j4Var2 = j4.this;
            float f3 = j4Var2.h;
            if (f > f3) {
                a(f3, f3);
                return;
            }
            j4Var2.a(f, f2);
            if (f == j4.this.h) {
                onVideoCompleted();
            }
        }

        @Override // com.my.target.w.a
        public void a(String str) {
            ba.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing error: " + str);
            j4.this.e.f();
            j4 j4Var = j4.this;
            if (!j4Var.m) {
                j4Var.a();
                j4.this.g.b();
            } else {
                ba.a("InterstitialMediaPresenter$MyMediaViewListener: Try to play video stream from URL");
                j4 j4Var2 = j4.this;
                j4Var2.m = false;
                j4Var2.f();
            }
        }

        @Override // com.my.target.w.a
        public void d() {
        }

        @Override // com.my.target.w.a
        public void e() {
        }

        @Override // com.my.target.w.a
        public void f() {
        }

        @Override // com.my.target.w.a
        public void h() {
            j4.this.e.g();
            j4.this.a();
            ba.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing timeout");
            j4.this.g.b();
        }

        @Override // com.my.target.w.a
        public void i() {
            j4 j4Var = j4.this;
            if (j4Var.j && j4Var.f4013a.getAllowCloseDelay() == 0.0f) {
                j4.this.c.d();
            }
            j4.this.c.b();
        }

        @Override // com.my.target.d8.a
        public void j() {
            j4 j4Var = j4.this;
            j4Var.a(j4Var.c.getView().getContext());
            j4.this.e.e();
            j4.this.c.pause();
        }

        @Override // com.my.target.d8.a
        public void l() {
            j4.this.e.h();
            j4.this.c.a();
            j4 j4Var = j4.this;
            if (j4Var.i) {
                j4Var.c();
            } else {
                j4Var.i();
            }
        }

        @Override // com.my.target.d8.a
        public void m() {
            j4.this.f();
        }

        @Override // com.my.target.w.a
        public void n() {
        }

        @Override // com.my.target.d8.a
        public void o() {
            j4 j4Var = j4.this;
            if (!j4Var.i) {
                j4Var.b(j4Var.c.getView().getContext());
            }
            j4.this.f();
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
                j4.this.a(i);
            } else {
                c0.d(new Runnable() { // from class: com.my.target.j4$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(i);
                    }
                });
            }
        }

        @Override // com.my.target.w.a
        public void onVideoCompleted() {
            j4 j4Var = j4.this;
            if (j4Var.l) {
                return;
            }
            j4Var.l = true;
            ba.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing complete");
            j4.this.h();
            j4 j4Var2 = j4.this;
            j4Var2.f.a(j4Var2.c.getView().getContext());
            j4.this.c.d();
            j4.this.c.e();
            j4.this.e.c();
        }
    }

    public j4(b8 b8Var, b5<VideoData> b5Var, t4 t4Var, q4.c cVar, q4.b bVar) {
        this.f4013a = b5Var;
        this.f = cVar;
        this.g = bVar;
        a aVar = new a();
        this.b = aVar;
        this.c = t4Var;
        t4Var.setMediaListener(aVar);
        qa qaVarA = qa.a(b5Var.getStatHolder());
        this.d = qaVarA;
        qaVarA.a(t4Var.getPromoMediaView());
        this.e = b8Var.a(b5Var);
    }

    public static j4 a(b8 b8Var, b5<VideoData> b5Var, t4 t4Var, q4.c cVar, q4.b bVar) {
        return new j4(b8Var, b5Var, t4Var, cVar, bVar);
    }

    public void a() {
        a(this.c.getView().getContext());
        this.c.destroy();
    }

    public final void a(float f, float f2) {
        this.d.a(f, f2);
        this.e.a(f, f2);
    }

    public final void a(int i) {
        if (i == -3) {
            ba.a("InterstitialMediaPresenter: Audiofocus loss can duck, set volume to 0.3");
            if (this.i) {
                return;
            }
            b();
            return;
        }
        if (i == -2 || i == -1) {
            e();
            ba.a("InterstitialMediaPresenter: Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            ba.a("InterstitialMediaPresenter: Audiofocus gain, unmuting");
            if (this.i) {
                return;
            }
            i();
        }
    }

    public final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.b);
        }
    }

    public void a(b5<VideoData> b5Var, Context context) {
        VideoData videoData = (VideoData) b5Var.getMediaData();
        if (videoData != null && videoData.getData() == null) {
            this.m = false;
        }
        boolean zIsAllowClose = b5Var.isAllowClose();
        this.j = zIsAllowClose;
        if (zIsAllowClose && b5Var.getAllowCloseDelay() == 0.0f && b5Var.isAutoPlay()) {
            ba.a("InterstitialMediaPresenter: Banner is allowed to close");
            this.c.d();
        }
        this.h = b5Var.getDuration();
        boolean zIsAutoMute = b5Var.isAutoMute();
        this.i = zIsAutoMute;
        if (zIsAutoMute) {
            this.c.a(0);
            return;
        }
        if (b5Var.isAutoPlay()) {
            b(context);
        }
        this.c.a(2);
    }

    public void a(z3 z3Var) {
        this.c.d();
        this.c.a(z3Var);
    }

    public final void b() {
        this.c.a(1);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.b, 3, 2);
        }
    }

    public final void c() {
        a(this.c.getView().getContext());
        this.c.a(0);
    }

    public void d() {
        this.c.a(true);
        a(this.c.getView().getContext());
        if (this.k) {
            this.e.d();
        }
    }

    public void e() {
        this.c.pause();
        a(this.c.getView().getContext());
        if (!this.c.isPlaying() || this.c.c()) {
            return;
        }
        this.e.e();
    }

    public final void f() {
        this.c.c(this.m);
    }

    public void g() {
        a(this.c.getView().getContext());
    }

    public final void h() {
        this.c.d();
        a(this.c.getView().getContext());
        this.c.a(this.f4013a.isAllowReplay());
    }

    public final void i() {
        if (this.c.isPlaying()) {
            b(this.c.getView().getContext());
        }
        this.c.a(2);
    }
}
