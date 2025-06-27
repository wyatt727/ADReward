package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.webkit.ProxyConfig;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler F = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a G;
    private VideoNativePlayer H;
    private a I;
    private AdSession J;
    private MediaEvents K;
    private boolean L;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3224a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private volatile int l;
    private boolean m;
    private boolean n;
    private TextureView o;
    private LinearLayout p;
    private Surface q;
    private ProgressBar r;
    private MyImageView s;
    private ImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private View x;
    private AnimationDrawable y;
    private AlphaAnimation z;

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    public void setMediaViewPlayListener(a aVar) {
        this.I = aVar;
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f3224a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = -1;
        this.m = true;
        this.n = true;
        this.J = null;
        this.K = null;
        this.L = false;
        a();
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3224a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = -1;
        this.m = true;
        this.n = true;
        this.J = null;
        this.K = null;
        this.L = false;
        a();
    }

    private void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    private void b() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.H = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void c() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_playerview", "layout"), (ViewGroup) null);
            if (viewInflate != null) {
                this.p = (LinearLayout) viewInflate.findViewById(v.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(v.a(getContext(), "mbridge_textureview", "id"));
                this.o = textureView;
                textureView.setKeepScreenOn(true);
                this.o.setSurfaceTextureListener(new b());
                this.r = (ProgressBar) viewInflate.findViewById(v.a(getContext(), "mbridge_progress", "id"));
                this.s = (MyImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.t = (ImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_iv_play", "id"));
                this.u = (ImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_iv_pause", "id"));
                this.v = (ImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_iv_sound", "id"));
                this.x = viewInflate.findViewById(v.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.y = animationDrawable;
                animationDrawable.start();
                d();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
            this.f3224a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.B = str;
        this.b = z;
        this.C = campaignEx;
        this.G = aVar;
        this.A = str2;
        this.H.initParameter(campaignEx.getVideoUrlEncode(), true, this.j, this.s, videoPlayerStatusListener);
        try {
            CampaignEx campaignEx2 = this.C;
            if (campaignEx2 != null) {
                String imageUrl = campaignEx2.getImageUrl();
                if (!an.a(imageUrl) && getContext() != null) {
                    if (com.mbridge.msdk.foundation.same.c.b.a(getContext()).c(imageUrl)) {
                        Bitmap bitmapB = com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).b(imageUrl);
                        MyImageView myImageView = this.s;
                        if (myImageView != null && bitmapB != null) {
                            myImageView.setImageUrl(imageUrl);
                            this.s.setImageBitmap(bitmapB);
                            this.s.setVisibility(0);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.c.b.a(getContext()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.6
                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onFailedLoad(String str3, String str4) {
                            }

                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onSuccessLoad(Bitmap bitmap, String str3) {
                                if (MediaViewPlayerView.this.s == null || bitmap == null) {
                                    return;
                                }
                                MediaViewPlayerView.this.s.setImageUrl(str3);
                                MediaViewPlayerView.this.s.setImageBitmap(bitmap);
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
        this.f3224a = true;
        return true;
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.f3224a && this.H != null) {
                if (!this.g) {
                    e();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith(ProxyConfig.MATCH_HTTP)) || this.B.startsWith("https")) {
                    this.B = m();
                }
                f();
                this.H.play(getContext(), this.B, this.q);
                if ((this.f || this.e) && (mediaEvents = this.K) != null) {
                    this.f = false;
                    mediaEvents.resume();
                }
                if (this.k) {
                    this.H.openSound();
                } else {
                    this.H.closeSound();
                }
                this.c = false;
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void startOrPlayVideo() {
        MediaEvents mediaEvents;
        try {
            if (!this.g) {
                e();
                return;
            }
            if (!hasPrepare()) {
                playVideo();
                return;
            }
            try {
                if (this.H == null) {
                    return;
                }
                f();
                if (this.i) {
                    this.H.start(this.q);
                    this.i = false;
                } else {
                    this.H.start();
                }
                if ((this.f || this.e) && (mediaEvents = this.K) != null) {
                    this.f = false;
                    mediaEvents.resume();
                }
            } catch (Throwable th) {
                ad.a("MediaViewPlayerView", th.getMessage(), th);
            }
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f = true;
            }
            if (this.K != null) {
                ad.b("omsdk", "mediaviewplayerview pause");
                this.K.pause();
            }
            h();
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            h();
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.H = null;
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void openSound() {
        this.k = true;
        try {
            if (this.H != null) {
                this.v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.H.openSound();
            }
            try {
                MediaEvents mediaEvents = this.K;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e) {
                ad.a("OMSDK", e.getMessage());
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void closeSound() {
        this.k = false;
        try {
            if (this.H != null) {
                this.v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.H.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.K;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                }
            } catch (IllegalArgumentException e) {
                ad.a("OMSDK", e.getMessage());
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.loadingViewIsVisible();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void setIsComplete(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setEnterFullScreen() {
        try {
            ad.c("MediaViewPlayerView", "setEnterFullScreen");
            this.d = true;
            this.h = true;
            this.v.setVisibility(0);
            h();
        } catch (Throwable th) {
            ad.a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.d = false;
            this.c = false;
            this.v.setVisibility(8);
            g();
            f();
        } catch (Throwable th) {
            ad.a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public boolean curIsFullScreen() {
        return this.d;
    }

    public void setIsActivePause(boolean z) {
        this.e = z;
    }

    public boolean getIsActiviePause() {
        return this.e;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public void setAllowLoopPlay(boolean z) {
        this.j = z;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    private void d() {
        this.v.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    if (MediaViewPlayerView.this.k) {
                        MediaViewPlayerView.this.closeSound();
                        if (MediaViewPlayerView.this.D != null) {
                            MediaViewPlayerView.this.D.a();
                        }
                    } else {
                        MediaViewPlayerView.this.openSound();
                        if (MediaViewPlayerView.this.D != null) {
                            MediaViewPlayerView.this.D.b();
                        }
                    }
                } catch (Throwable th) {
                    ad.b("MediaViewPlayerView", th.getMessage());
                }
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    MediaViewPlayerView.this.pause();
                    MediaViewPlayerView.this.t.setVisibility(0);
                    MediaViewPlayerView.this.i();
                    MediaViewPlayerView.this.k();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.c();
                    }
                    MediaViewPlayerView.this.e = true;
                } catch (Throwable th) {
                    ad.a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        });
        this.t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaViewPlayerView.this.onClickPlayButton();
            }
        });
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            f();
            j();
            setIsComplete(false);
            if (this.f) {
                this.H.play();
            } else if (hasPrepare() && !this.c) {
                ad.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.c);
                startOrPlayVideo();
            } else {
                ad.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.H.replaySameSource(getContext(), this.B, this.q);
            }
            if (this.e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.e = false;
        } catch (Throwable th) {
            ad.a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    l();
                    return;
                }
                AlphaAnimation alphaAnimation = this.z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.z.setInterpolator(new DecelerateInterpolator());
                this.z.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.4
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        MediaViewPlayerView.this.u.setVisibility(0);
                        MediaViewPlayerView.g(MediaViewPlayerView.this);
                    }
                });
                i();
                this.x.startAnimation(this.z);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void showPlayView() {
        this.t.setVisibility(0);
    }

    public void gonePauseView() {
        Handler handler = F;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MediaViewPlayerView.this.k();
                        MediaViewPlayerView.this.j();
                    } catch (Exception e) {
                        ad.b("MediaViewPlayerView", e.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            i();
            k();
            this.r.setVisibility(8);
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void f() {
        try {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            j();
            showProgressView(this.n);
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void g() {
        ImageView imageView;
        if (this.d || (imageView = this.w) == null || imageView.getVisibility() == 0 || !this.m) {
            return;
        }
        this.w.setVisibility(0);
    }

    private void h() {
        if (this.w.getVisibility() == 0) {
            this.w.setVisibility(8);
        }
    }

    public void showProgressView(boolean z) {
        this.n = z;
        ProgressBar progressBar = this.r;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z) {
        this.m = z;
        if (z) {
            g();
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.x.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.t.getVisibility() != 0) {
            this.x.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.u.setVisibility(8);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.a(this.B);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        try {
            f();
            g();
            this.e = false;
            this.c = false;
            this.l = i;
        } catch (Throwable th) {
            ad.a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.b(this.B);
        }
        a aVar = this.I;
        if (aVar != null) {
            aVar.a();
            return;
        }
        try {
            if (this.j) {
                return;
            }
            this.c = true;
            e();
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.c = true;
            e();
            if (this.L) {
                return;
            }
            this.H.play(getContext(), this.B, this.q);
            this.L = true;
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.c = true;
            try {
                if (!URLUtil.isNetworkUrl(this.B)) {
                    String videoUrlEncode = this.C.getVideoUrlEncode();
                    if (an.b(videoUrlEncode)) {
                        this.B = videoUrlEncode;
                    }
                }
            } catch (Throwable th) {
                ad.b("MediaViewPlayerView", th.getMessage());
            }
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    private void l() {
        try {
            Handler handler = F;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
    }

    private String m() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.C;
        } catch (Exception e) {
            ad.b("MediaViewPlayerView", e.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.G == null) {
                if (campaignEx.getAdType() == 287 || this.C.getAdType() == 94) {
                    str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                } else {
                    str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                }
                this.G = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.G;
        if (aVar != null && aVar.k() == 5) {
            String strH = this.G.h();
            if (new File(strH).exists()) {
                return strH;
            }
        }
        String videoUrlEncode = this.C.getVideoUrlEncode();
        if (an.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f3232a;

        public a(MediaViewPlayerView mediaViewPlayerView) {
            this.f3232a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f3232a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.j) {
                    return;
                }
                ad.c("MediaViewPlayerView", "play end and display endcardView");
                this.f3232a.e();
            } catch (Exception e) {
                ad.b("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    private class b implements TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                MediaViewPlayerView.this.q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.g = true;
                MediaViewPlayerView.this.i = true;
                if (MediaViewPlayerView.this.d) {
                    if (MediaViewPlayerView.this.h) {
                        MediaViewPlayerView.this.c = false;
                        MediaViewPlayerView.this.h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.e();
                    return;
                }
                if (MediaViewPlayerView.this.b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.e();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.e();
            } catch (Exception e) {
                ad.b("MediaViewPlayerView", e.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ad.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.H != null && MediaViewPlayerView.this.H.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.c = true;
                MediaViewPlayerView.this.g = false;
            } catch (Throwable th) {
                ad.b("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }
    }

    public void registerView(AdSession adSession) {
        this.J = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            adSession.addFriendlyObstruction(this.p, FriendlyObstructionPurpose.OTHER, null);
            adSession.addFriendlyObstruction(this.r, FriendlyObstructionPurpose.OTHER, null);
            adSession.addFriendlyObstruction(this.s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            adSession.addFriendlyObstruction(this.t, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            adSession.addFriendlyObstruction(this.u, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            adSession.addFriendlyObstruction(this.v, FriendlyObstructionPurpose.OTHER, null);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.K = mediaEvents;
    }

    public void unregisterView() {
        AdSession adSession = this.J;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
        try {
            ProgressBar progressBar = this.r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i2 > 0) {
                this.r.setMax(i2);
            }
            if (i >= 0) {
                this.r.setProgress(i + 1);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    static /* synthetic */ void g(MediaViewPlayerView mediaViewPlayerView) {
        mediaViewPlayerView.l();
        mediaViewPlayerView.E = new Timer();
        mediaViewPlayerView.E.schedule(new TimerTask() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.7
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                try {
                    MediaViewPlayerView.this.gonePauseView();
                } catch (Throwable th) {
                    ad.a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        }, 2000L);
    }
}
