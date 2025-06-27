package com.bykv.vk.openvk.component.video.EYQ.Pm;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.json.t2;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: AndroidMediaPlayer.java */
/* loaded from: classes.dex */
public class mZx extends com.bykv.vk.openvk.component.video.EYQ.Pm.EYQ {
    private final Object IPb;
    private Surface Kbd;
    private com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ Pm;
    private final EYQ Td;
    private volatile boolean VwS;
    private final MediaPlayer mZx;

    public mZx() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.IPb = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.mZx = mediaPlayer;
        }
        EYQ(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.Td = new EYQ(this);
        hu();
    }

    private void EYQ(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT < 19 || Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.component.video.api.Td.EYQ(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.IPb) {
            try {
                if (!this.VwS && surfaceHolder != null && surfaceHolder.getSurface() != null && this.EYQ) {
                    this.mZx.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(Surface surface) {
        UB();
        this.Kbd = surface;
        this.mZx.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(com.bykv.vk.openvk.component.video.api.mZx mzx) throws Throwable {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mZx.setPlaybackParams(this.mZx.getPlaybackParams().setSpeed(mzx.EYQ()));
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(t2.h.b)) {
            this.mZx.setDataSource(uri.getPath());
        } else {
            this.mZx.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(FileDescriptor fileDescriptor) throws Throwable {
        this.mZx.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public synchronized void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        this.Pm = com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.EYQ(com.bykv.vk.openvk.component.video.api.Td.EYQ(), td);
        com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.Td.EYQ(td);
        this.mZx.setDataSource(this.Pm);
    }

    private void KO() {
        com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ eyq;
        if (Build.VERSION.SDK_INT < 23 || (eyq = this.Pm) == null) {
            return;
        }
        try {
            eyq.close();
        } catch (Throwable unused) {
        }
        this.Pm = null;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void Kbd() throws Throwable {
        this.mZx.start();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void IPb() throws Throwable {
        this.mZx.stop();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void VwS() throws Throwable {
        this.mZx.pause();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void QQ() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mZx;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void mZx(boolean z) throws Throwable {
        this.mZx.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void EYQ(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.mZx.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.mZx.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.mZx.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.mZx.seekTo((int) j, 2);
        } else if (i == 3) {
            this.mZx.seekTo((int) j, 3);
        } else {
            this.mZx.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public long HX() {
        try {
            return this.mZx.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public long tp() {
        try {
            return this.mZx.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void MxO() throws Throwable {
        synchronized (this.IPb) {
            if (!this.VwS) {
                this.mZx.release();
                this.VwS = true;
                UB();
                KO();
                EYQ();
                hu();
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void tsL() throws Throwable {
        try {
            this.mZx.reset();
        } catch (Throwable unused) {
        }
        KO();
        EYQ();
        hu();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void Td(boolean z) throws Throwable {
        this.mZx.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public void Pm(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.mZx;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public int pi() {
        MediaPlayer mediaPlayer = this.mZx;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td
    public int nWX() {
        MediaPlayer mediaPlayer = this.mZx;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void hu() {
        this.mZx.setOnPreparedListener(this.Td);
        this.mZx.setOnBufferingUpdateListener(this.Td);
        this.mZx.setOnCompletionListener(this.Td);
        this.mZx.setOnSeekCompleteListener(this.Td);
        this.mZx.setOnVideoSizeChangedListener(this.Td);
        this.mZx.setOnErrorListener(this.Td);
        this.mZx.setOnInfoListener(this.Td);
    }

    /* compiled from: AndroidMediaPlayer.java */
    private static class EYQ implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<mZx> EYQ;

        public EYQ(mZx mzx) {
            this.EYQ = new WeakReference<>(mzx);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    return mzx.mZx(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                Integer.valueOf(i);
                Integer.valueOf(i2);
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    return mzx.EYQ(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    mzx.EYQ(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    mzx.Pm();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    mzx.EYQ(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    mzx.Td();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                mZx mzx = this.EYQ.get();
                if (mzx != null) {
                    mzx.mZx();
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        UB();
    }

    private void UB() {
        try {
            Surface surface = this.Kbd;
            if (surface != null) {
                surface.release();
                this.Kbd = null;
            }
        } catch (Throwable unused) {
        }
    }
}
