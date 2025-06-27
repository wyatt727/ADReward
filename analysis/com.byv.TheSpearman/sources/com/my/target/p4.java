package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import com.my.target.common.models.VideoData;
import com.my.target.w;
import com.my.target.x;

/* loaded from: classes4.dex */
public class p4 implements k4, AudioManager.OnAudioFocusChangeListener, w.a, x.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f4091a;
    public final b5<VideoData> b;
    public final w c;
    public final qa d;
    public final o7 e;
    public final float f;
    public x g;
    public boolean h;

    public interface a {
        void a(float f, float f2);

        void b();

        void d();

        void e();

        void f();

        void j();

        void n();

        void onVideoCompleted();

        void onVolumeChanged(float f);
    }

    public p4(b5<VideoData> b5Var, x xVar, a aVar, c8 c8Var, w wVar) {
        this.f4091a = aVar;
        this.g = xVar;
        this.c = wVar;
        xVar.setAdVideoViewListener(this);
        this.b = b5Var;
        qa qaVarA = qa.a(b5Var.getStatHolder());
        this.d = qaVarA;
        this.e = c8Var.a(b5Var);
        qaVarA.a(xVar);
        this.f = b5Var.getDuration();
        wVar.a(this);
        wVar.setVolume(b5Var.isAutoMute() ? 0.0f : 1.0f);
    }

    public static p4 a(b5<VideoData> b5Var, x xVar, a aVar, c8 c8Var, w wVar) {
        return new p4(b5Var, xVar, aVar, c8Var, wVar);
    }

    @Override // com.my.target.k4
    public void a() {
        a(this.g.getContext());
        this.c.pause();
    }

    @Override // com.my.target.w.a
    public void a(float f) {
        this.f4091a.onVolumeChanged(f);
    }

    @Override // com.my.target.w.a
    public void a(float f, float f2) {
        float f3 = this.f;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != 0.0f) {
            this.f4091a.a(f, f2);
            this.e.a(f, f2);
            this.d.a(f, f2);
        }
        if (f == f2) {
            if (this.c.isPlaying()) {
                onVideoCompleted();
            }
            this.c.stop();
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(int i) {
        if (i == -2 || i == -1) {
            a();
            ba.a("InterstitialPromoMediaPresenterS2: Audiofocus loss, pausing");
        }
    }

    public final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    public final void a(VideoData videoData) {
        String data = videoData.getData();
        this.g.a(videoData.getWidth(), videoData.getHeight());
        if (data != null) {
            this.h = true;
            this.c.a(Uri.parse(data), this.g.getContext());
        } else {
            this.h = false;
            this.c.a(Uri.parse(videoData.getUrl()), this.g.getContext());
        }
    }

    @Override // com.my.target.w.a
    public void a(String str) {
        ba.a("InterstitialPromoMediaPresenterS2: Video playing error - " + str);
        this.e.f();
        if (this.h) {
            ba.a("InterstitialPromoMediaPresenterS2: Try to play video stream from URL");
            this.h = false;
            VideoData videoData = (VideoData) this.b.getMediaData();
            if (videoData != null) {
                this.c.a(Uri.parse(videoData.getUrl()), this.g.getContext());
                return;
            }
        }
        this.f4091a.b();
        this.c.stop();
        this.c.destroy();
    }

    @Override // com.my.target.k4
    public void b() {
        this.c.b();
        this.e.b(!this.c.e());
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    @Override // com.my.target.k4
    public void c() {
        if (!this.b.isAutoPlay()) {
            this.f4091a.n();
        } else {
            this.f4091a.e();
            q();
        }
    }

    @Override // com.my.target.w.a
    public void d() {
        this.f4091a.d();
    }

    @Override // com.my.target.k4
    public void destroy() {
        a();
        this.c.destroy();
        this.d.a();
    }

    @Override // com.my.target.w.a
    public void e() {
        this.f4091a.e();
    }

    @Override // com.my.target.w.a
    public void f() {
        this.f4091a.f();
    }

    @Override // com.my.target.k4
    public void g() {
        this.e.d();
        destroy();
    }

    @Override // com.my.target.w.a
    public void h() {
        ba.a("InterstitialPromoMediaPresenterS2: Video playing timeout");
        this.e.g();
        this.f4091a.b();
        this.c.stop();
        this.c.destroy();
    }

    @Override // com.my.target.w.a
    public void i() {
        this.f4091a.j();
    }

    @Override // com.my.target.k4
    public void k() {
        if (this.c.isPlaying()) {
            a();
            this.e.e();
        } else if (this.c.getPosition() <= 0) {
            q();
        } else {
            r();
            this.e.h();
        }
    }

    @Override // com.my.target.w.a
    public void n() {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(i);
        } else {
            c0.d(new Runnable() { // from class: com.my.target.p4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(i);
                }
            });
        }
    }

    @Override // com.my.target.w.a
    public void onVideoCompleted() {
        this.f4091a.onVideoCompleted();
        this.c.stop();
    }

    @Override // com.my.target.x.a
    public void p() {
        if (!(this.c instanceof o1)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        this.g.setViewMode(1);
        this.c.a(this.g);
        VideoData videoData = (VideoData) this.b.getMediaData();
        if (!this.c.isPlaying() || videoData == null) {
            return;
        }
        if (videoData.getData() != null) {
            this.h = true;
        }
        a(videoData);
    }

    public void q() {
        VideoData videoData = (VideoData) this.b.getMediaData();
        this.e.c();
        if (videoData != null) {
            if (!this.c.e()) {
                b(this.g.getContext());
            }
            this.c.a(this);
            this.c.a(this.g);
            a(videoData);
        }
    }

    public void r() {
        this.c.a();
        if (this.c.e()) {
            a(this.g.getContext());
        } else if (this.c.isPlaying()) {
            b(this.g.getContext());
        }
    }
}
