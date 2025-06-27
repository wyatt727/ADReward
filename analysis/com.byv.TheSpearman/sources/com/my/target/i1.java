package com.my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.my.target.w;

/* loaded from: classes4.dex */
public class i1 implements w, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final q8 f3995a;
    public final a b;
    public final MediaPlayer c;
    public w.a d;
    public Surface e;
    public int f;
    public float g;
    public int h;
    public long i;
    public x j;
    public Uri k;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3996a;
        public i1 b;
        public w.a c;
        public int d;
        public float e;

        public a(int i) {
            this.f3996a = i;
        }

        public void a(i1 i1Var) {
            this.b = i1Var;
        }

        public void a(w.a aVar) {
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b == null) {
                return;
            }
            float position = r0.getPosition() / 1000.0f;
            float duration = this.b.getDuration();
            if (this.e == position) {
                this.d++;
            } else {
                w.a aVar = this.c;
                if (aVar != null) {
                    aVar.a(position, duration);
                }
                this.e = position;
                if (this.d > 0) {
                    this.d = 0;
                }
            }
            if (this.d > this.f3996a) {
                w.a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.h();
                }
                this.d = 0;
            }
        }
    }

    public i1() {
        this(new MediaPlayer(), new a(50));
    }

    public i1(MediaPlayer mediaPlayer, a aVar) {
        this.f3995a = q8.a(200);
        this.f = 0;
        this.g = 1.0f;
        this.i = 0L;
        this.c = mediaPlayer;
        this.b = aVar;
        aVar.a(this);
    }

    public static w j() {
        return new i1();
    }

    @Override // com.my.target.w
    public void a() {
        if (this.f == 2) {
            this.f3995a.a(this.b);
            try {
                this.c.start();
            } catch (Throwable unused) {
                ba.a("DefaultVideoPlayer: Media player's start method called in wrong state");
            }
            int i = this.h;
            if (i > 0) {
                try {
                    this.c.seekTo(i);
                } catch (Throwable unused2) {
                    ba.a("DefaultVideoPlayer: Media player's seek to method called in wrong state");
                }
                this.h = 0;
            }
            this.f = 1;
            w.a aVar = this.d;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // com.my.target.w
    public void a(Uri uri, Context context) {
        this.k = uri;
        ba.a("DefaultVideoPlayer: Play video in Android MediaPlayer - " + uri);
        if (this.f != 0) {
            try {
                this.c.reset();
            } catch (Throwable unused) {
                ba.a("DefaultVideoPlayer: Media player's reset method called in wrong state");
            }
            this.f = 0;
        }
        this.c.setOnCompletionListener(this);
        this.c.setOnErrorListener(this);
        this.c.setOnPreparedListener(this);
        this.c.setOnInfoListener(this);
        try {
            this.c.setDataSource(context, uri);
            w.a aVar = this.d;
            if (aVar != null) {
                aVar.e();
            }
            try {
                this.c.prepareAsync();
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: Media player's prepare async method called in wrong state, " + th.getMessage());
            }
            this.f3995a.a(this.b);
        } catch (Throwable th2) {
            if (this.d != null) {
                this.d.a("DefaultVideoPlayer data source error: " + th2.getMessage());
            }
            ba.a("DefaultVideoPlayer: Unable to parse video source, " + th2.getMessage());
            this.f = 5;
            th2.printStackTrace();
        }
    }

    @Override // com.my.target.w
    public void a(Uri uri, x xVar) {
        a(xVar);
        a(uri, xVar.getContext());
    }

    public final void a(Surface surface) {
        try {
            this.c.setSurface(surface);
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: Media player's set surface method called in wrong state, " + th.getMessage());
        }
        Surface surface2 = this.e;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.e = surface;
    }

    @Override // com.my.target.w
    public void a(w.a aVar) {
        this.d = aVar;
        this.b.a(aVar);
    }

    @Override // com.my.target.w
    public void a(x xVar) {
        k();
        if (!(xVar instanceof x)) {
            this.j = null;
            a((Surface) null);
            return;
        }
        this.j = xVar;
        TextureView textureView = xVar.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        a(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    @Override // com.my.target.w
    public void b() {
        if (this.g == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    @Override // com.my.target.w
    public boolean c() {
        return this.f == 2;
    }

    @Override // com.my.target.w
    public void d() {
        try {
            this.c.start();
            this.f = 1;
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
        seekTo(0L);
    }

    @Override // com.my.target.w
    public void destroy() {
        this.d = null;
        this.f = 5;
        this.f3995a.b(this.b);
        k();
        if (l()) {
            try {
                this.c.stop();
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
            }
        }
        try {
            this.c.release();
        } catch (Throwable th2) {
            ba.a("DefaultVideoPlayer: Media player's release method called in wrong state, " + th2.getMessage());
        }
        this.j = null;
    }

    @Override // com.my.target.w
    public boolean e() {
        return this.g == 0.0f;
    }

    @Override // com.my.target.w
    public void f() {
        setVolume(1.0f);
    }

    @Override // com.my.target.w
    public void g() {
        setVolume(0.2f);
    }

    @Override // com.my.target.w
    public float getDuration() {
        if (!l()) {
            return 0.0f;
        }
        try {
            return this.c.getDuration() / 1000.0f;
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: Media player's get duration method called in wrong state, " + th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.w
    public long getPosition() {
        if (!l() || this.f == 3) {
            return 0L;
        }
        try {
            return this.c.getCurrentPosition();
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: media player's get current position method called in wrong state, " + th.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.w
    public Uri getUri() {
        return this.k;
    }

    @Override // com.my.target.w
    public void h() {
        setVolume(0.0f);
    }

    @Override // com.my.target.w
    public boolean i() {
        int i = this.f;
        return i >= 1 && i < 3;
    }

    @Override // com.my.target.w
    public boolean isPlaying() {
        return this.f == 1;
    }

    public final void k() {
        x xVar = this.j;
        TextureView textureView = xVar != null ? xVar.getTextureView() : null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this) {
                Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                textureView.setSurfaceTextureListener(null);
            }
        }
    }

    public final boolean l() {
        int i = this.f;
        return i >= 1 && i <= 4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        w.a aVar;
        float duration = getDuration();
        this.f = 4;
        if (duration > 0.0f && (aVar = this.d) != null) {
            aVar.a(duration, duration);
        }
        w.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.onVideoCompleted();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f3995a.b(this.b);
        k();
        a((Surface) null);
        String str = (i == 100 ? "Server died" : "Unknown error") + " (reason: " + (i2 == -1004 ? "IO error" : i2 == -1007 ? "Malformed error" : i2 == -1010 ? "Unsupported error" : i2 == -110 ? "Timed out error" : i2 == Integer.MIN_VALUE ? "Low-level system error" : "Unknown") + ")";
        ba.a("DefaultVideoPlayer: Video error - " + str);
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(str);
        }
        if (this.f > 0) {
            try {
                this.c.reset();
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: Media player's reset method called in wrong state, " + th.getMessage());
            }
        }
        this.f = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        w.a aVar = this.d;
        if (aVar == null) {
            return true;
        }
        aVar.i();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f = this.g;
            mediaPlayer.setVolume(f, f);
            this.f = 1;
            mediaPlayer.start();
            long j = this.i;
            if (j > 0) {
                seekTo(j);
            }
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th.getMessage());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        a(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a((Surface) null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.my.target.w
    public void pause() {
        if (this.f == 1) {
            this.f3995a.b(this.b);
            try {
                this.h = this.c.getCurrentPosition();
                this.c.pause();
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: Media player's pause or get current position method called in wrong state, " + th.getMessage());
            }
            this.f = 2;
            w.a aVar = this.d;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    @Override // com.my.target.w
    public void seekTo(long j) {
        this.i = j;
        if (l()) {
            try {
                this.c.seekTo((int) j);
                this.i = 0L;
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: media player's seek to method called in wrong state, " + th.getMessage());
            }
        }
    }

    @Override // com.my.target.w
    public void setVolume(float f) {
        this.g = f;
        if (l()) {
            try {
                this.c.setVolume(f, f);
            } catch (Throwable th) {
                ba.a("DefaultVideoPlayer: Media player's set volume method called in wrong state, " + th.getMessage());
            }
        }
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.a(f);
        }
    }

    @Override // com.my.target.w
    public void stop() {
        this.f3995a.b(this.b);
        try {
            this.c.stop();
        } catch (Throwable th) {
            ba.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th.getMessage());
        }
        w.a aVar = this.d;
        if (aVar != null) {
            aVar.n();
        }
        this.f = 3;
    }
}
