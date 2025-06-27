package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean K = false;
    private static long Q;
    private AdSession A;
    private AdEvents B;
    private MediaEvents C;
    private a D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean L;
    private boolean M;
    private boolean N;
    private RelativeLayout O;
    private ProgressBar P;
    private PlayerView p;
    private SoundImageView q;
    private TextView r;
    private View s;
    private FeedBackButton t;
    private ImageView u;
    private WebView v;
    private com.mbridge.msdk.videocommon.download.a w;
    private int x;
    private int y;
    private int z;

    public void setCreateWebView(WebView webView) {
        this.v = webView;
    }

    public void setOrientation(int i) {
        this.I = i;
    }

    public AdSession getAdSession() {
        return this.A;
    }

    public void setAdSession(AdSession adSession) {
        this.A = adSession;
    }

    public MediaEvents getVideoEvents() {
        return this.C;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.C = mediaEvents;
        a aVar = this.D;
        if (aVar != null) {
            aVar.c = mediaEvents;
        }
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public AdEvents getAdEvents() {
        return this.B;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.B = adEvents;
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.L = false;
        this.M = false;
        this.N = false;
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.L = false;
        this.M = false;
        this.N = false;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(c.m().c(), 30.0f));
            int iA = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(iA, 0, 0, 0);
            this.r.setPadding(iA, 0, iA, 0);
            this.r.setLayoutParams(layoutParams);
            return;
        }
        this.r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.h) {
            this.E = i;
            if (i == 1) {
                this.q.setSoundStatus(false);
                this.p.closeSound();
            } else if (i == 2) {
                this.q.setSoundStatus(true);
                this.p.openSound();
            }
            if (i2 == 1) {
                this.q.setVisibility(8);
            } else if (i2 == 2) {
                this.q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.p.getVolume());
                } catch (Exception e) {
                    ad.b("omsdk", e.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (iFindLayout > 0) {
            this.f.inflate(iFindLayout, this);
            this.h = c();
            if (!this.h) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        K = false;
    }

    public void onResume() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.p.setIsCovered(false);
            if (this.M) {
                this.p.start(true);
            }
            this.p.resumeOMSDK();
        }
    }

    public void onPause() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.M = zIsPlayIng;
            this.p.setIsBTVideoPlaying(zIsPlayIng);
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                this.p.setVideoEvents(mediaEvents);
            }
            this.p.onPause();
        }
    }

    public void onStop() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.N) {
            this.H = d.c().e(this.c);
        }
        View view = this.s;
        if (view != null) {
            view.setVisibility(this.y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.z == 0 ? 8 : 0);
        }
        if (this.b != null) {
            this.b.setCampaignUnitId(this.c);
            b.a().a(this.c + "_1", this.b);
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setVisibility(this.x != 0 ? 0 : 8);
            if (this.r.getVisibility() == 0 && b.a().b()) {
                b.a().a(this.c + "_1", this.t);
            }
        }
        if (this.A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.A.removeFriendlyObstruction(rootView);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null && this.v != null) {
                playerView.closeSound();
                this.q.setSoundStatus(false);
                this.E = 1;
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e) {
                    ad.a("OMSDK", e.getMessage());
                }
                a(this.v, "onPlayerMute", this.d);
                return true;
            }
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage());
        }
        return false;
    }

    public int getMute() {
        return this.E;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.p;
            if (playerView == null || this.v == null) {
                return false;
            }
            playerView.openSound();
            this.q.setSoundStatus(true);
            this.E = 2;
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e) {
                ad.a("OMSDK", e.getMessage());
            }
            a(this.v, "onUnmute", this.d);
            return true;
        } catch (Exception e2) {
            ad.b(BTBaseView.TAG, e2.getMessage());
            return false;
        }
    }

    public void play() {
        a aVar;
        try {
            if (!this.N) {
                String strD = d();
                this.J = strD;
                this.p.initVFPData(strD, this.b.getVideoUrlEncode(), this.D);
                if (this.H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    if (this.B != null) {
                        ad.b("omsdk", "bt impressionOccurred");
                        this.B.impressionOccurred();
                    }
                } catch (Throwable th) {
                    ad.a(BTBaseView.TAG, th.getMessage());
                }
                if (!this.p.playVideo() && (aVar = this.D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.N = true;
                return;
            }
            if (this.G) {
                this.p.playVideo(0);
                this.G = false;
            } else {
                this.p.start(false);
            }
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.resume();
                    ad.a("omsdk", "btv play2:  videoEvents.resume()");
                }
            } catch (Throwable th2) {
                ad.a(BTBaseView.TAG, th2.getMessage());
            }
            WebView webView = this.v;
            if (webView != null) {
                a(webView, "onPlayerPlay", this.d);
                return;
            }
            return;
        } catch (Exception e) {
            ad.a(BTBaseView.TAG, e.getMessage(), e);
        }
        ad.a(BTBaseView.TAG, e.getMessage(), e);
    }

    public void resume() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        ad.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    ad.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.v;
                if (webView != null) {
                    a(webView, "onPlayerResume", this.d);
                }
            }
        } catch (Exception e) {
            ad.b(BTBaseView.TAG, e.getMessage());
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.v;
                if (webView != null) {
                    a(webView, "onPlayerPause", this.d);
                }
            }
        } catch (Exception e) {
            ad.a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                playerView.pause();
                this.p.stop();
                this.G = true;
                WebView webView = this.v;
                if (webView != null) {
                    a(webView, "onPlayerStop", this.d);
                }
            }
        } catch (Exception e) {
            ad.a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.p != null) {
                AdSession adSession = this.A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.p.setOnClickListener(null);
                this.p.release();
                this.p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
            }
            SoundImageView soundImageView = this.q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.v != null) {
                this.v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    private boolean c() {
        try {
            this.p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.s = findViewById(findID("mbridge_rl_playing_close"));
            this.O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.p.setIsBTVideo(true);
            this.t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.p, this.q, this.r, this.s);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private String d() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.w;
            if (aVar == null) {
                return videoUrlEncode;
            }
            String strH = aVar.h();
            return !an.a(strH) ? new File(strH).exists() ? strH : videoUrlEncode : videoUrlEncode;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return videoUrlEncode;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
            if (aVarB == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            iH = aVarB != null ? (int) aVarB.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + iH);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return iH;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    protected final void a() {
        super.a();
        if (this.h) {
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    boolean zIsSilent = MBridgeBTVideoView.this.p.isSilent();
                    if (MBridgeBTVideoView.this.v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.n);
                            jSONObject.put("id", MBridgeBTVideoView.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                            jSONObject.put("data", jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.E);
                        } catch (Exception e) {
                            d.c().a(MBridgeBTVideoView.this.v, e.getMessage());
                        }
                    }
                }
            });
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeBTVideoView.this.v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeBTVideoView.this.C != null) {
                        try {
                            MBridgeBTVideoView.this.C.adUserInteraction(InteractionType.CLICK);
                            ad.a("omsdk", "btv adUserInteraction click");
                        } catch (Exception e) {
                            ad.b("omsdk", e.getMessage());
                        }
                    }
                    if (MBridgeBTVideoView.this.v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.n);
                            jSONObject.put("id", MBridgeBTVideoView.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.v, "onClicked", MBridgeBTVideoView.this.d);
                        }
                    }
                }
            });
        }
    }

    private static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f3602a;
        private WebView b;
        private MediaEvents c;
        private String d;
        private String e;
        private int f;
        private int g;
        private boolean h;
        private int l;
        private int m;
        private boolean i = false;
        private boolean j = false;
        private boolean k = false;
        private boolean n = false;
        private boolean o = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f3602a = mBridgeBTVideoView;
            this.b = webView;
            this.c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.d = mBridgeBTVideoView.d;
                this.e = mBridgeBTVideoView.c;
            }
        }

        public final void a(int i, int i2) {
            int i3;
            MBridgeBTVideoView mBridgeBTVideoView;
            String str;
            this.l = i;
            this.m = i2;
            if (!af.a().a("h_c_r_w_p_c", false) || (i3 = this.l) == 100 || this.m != 0 || this.n || i3 == 0 || (mBridgeBTVideoView = this.f3602a) == null || mBridgeBTVideoView.b == null) {
                return;
            }
            try {
                if (this.f3602a.b.getAdType() == 94 || this.f3602a.b.getAdType() == 287) {
                    str = this.f3602a.b.getRequestId() + this.f3602a.b.getId() + this.f3602a.b.getVideoUrlEncode();
                } else {
                    str = this.f3602a.b.getId() + this.f3602a.b.getVideoUrlEncode() + this.f3602a.b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                if (aVarA != null) {
                    aVarA.p();
                    this.n = true;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultVideoPlayerStatusListener", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) throws JSONException {
            super.onPlayStarted(i);
            if (!this.h) {
                this.f3602a.P.setMax(i);
                WebView webView = this.b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.d);
                }
                this.h = true;
                if (this.c != null) {
                    float volume = 0.0f;
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f3602a;
                        if (mBridgeBTVideoView != null && mBridgeBTVideoView.p != null) {
                            volume = this.f3602a.p.getVolume();
                        }
                        this.c.start(i, volume);
                        ad.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e) {
                        ad.b("omsdk", e.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.K = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() throws JSONException {
            super.onPlayCompleted();
            if (this.f3602a.b == null || this.f3602a.b.getVideoCompleteTime() <= 0) {
                this.f3602a.r.setText("0");
            } else {
                this.f3602a.r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
            }
            this.f3602a.p.setClickable(false);
            WebView webView = this.b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.d);
            }
            MediaEvents mediaEvents = this.c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f = this.g;
            boolean unused = MBridgeBTVideoView.K = true;
            this.f3602a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) throws JSONException {
            super.onPlayError(str);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.o);
                    jSONObject.put("id", this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.d);
                    jSONObject.put("data", jSONObject2);
                    g.a().a(this.b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    d.c().a(this.b, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) throws JSONException {
            int i3;
            int i4;
            String str;
            StringBuilder sb;
            String str2;
            String string;
            super.onPlayProgress(i, i2);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            if (this.f3602a.h) {
                int videoCompleteTime = 0;
                if (this.f3602a.b != null) {
                    videoCompleteTime = this.f3602a.b.getVideoCompleteTime();
                    b.a().b(this.f3602a.b.getCampaignUnitId() + "_1", i);
                }
                if (videoCompleteTime > i2 || videoCompleteTime <= 0) {
                    videoCompleteTime = i2;
                }
                int i5 = videoCompleteTime <= 0 ? i2 - i : videoCompleteTime - i;
                if (i5 <= 0) {
                    string = videoCompleteTime <= 0 ? "0" : (String) this.f3602a.getContext().getResources().getText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    if (videoCompleteTime <= 0) {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str2 = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str2 = (String) this.f3602a.getContext().getResources().getText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                    }
                    sb.append(str2);
                    string = sb.toString();
                }
                if (this.f3602a.b != null && this.f3602a.b.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f3602a.b.getVst(), i2);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i6 = videoCompleteTime - i;
                        if (this.f3602a.b.getAdType() == 287) {
                            if (i6 > 0) {
                                string = i6 + ((String) this.f3602a.getContext().getResources().getText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                            } else if (i6 == 0) {
                                this.f3602a.r.setVisibility(4);
                            }
                        }
                    } else {
                        int i7 = iMin - i;
                        if (i7 > 0) {
                            string = i7 + ((String) this.f3602a.getContext().getResources().getText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                        } else if (this.f3602a.b.getAdType() == 287 && i7 == 0) {
                            this.f3602a.r.setVisibility(4);
                        }
                    }
                }
                this.f3602a.r.setText(string);
            }
            this.g = i2;
            this.f = i;
            this.f3602a.P.setMax(this.g);
            this.f3602a.P.setProgress(this.f);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.n);
                    jSONObject.put("id", this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.d);
                    jSONObject2.put("progress", MBridgeBTVideoView.b(i, i2));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i2));
                    jSONObject.put("data", jSONObject2);
                    g.a().a(this.b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    d.c().a(this.b, e.getMessage());
                }
            }
            MediaEvents mediaEvents = this.c;
            if (mediaEvents != null) {
                int i8 = (i * 100) / i2;
                int i9 = ((i + 1) * 100) / i2;
                if (i8 <= 25 && 25 < i9 && !this.i) {
                    this.i = true;
                    mediaEvents.firstQuartile();
                    ad.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i8 <= 50 && 50 < i9 && !this.j) {
                    this.j = true;
                    mediaEvents.midpoint();
                    ad.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i8 <= 75 && 75 < i9 && !this.k) {
                    this.k = true;
                    mediaEvents.thirdQuartile();
                    ad.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            try {
                int i10 = this.l;
                if (i10 == 100 || this.n || i10 == 0 || (i3 = this.m) < 0 || i < (i4 = (i2 * i3) / 100)) {
                    return;
                }
                if (this.f3602a.b.getAdType() == 94 || this.f3602a.b.getAdType() == 287) {
                    str = this.f3602a.b.getRequestId() + this.f3602a.b.getId() + this.f3602a.b.getVideoUrlEncode();
                } else {
                    str = this.f3602a.b.getId() + this.f3602a.b.getVideoUrlEncode() + this.f3602a.b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                if (aVarA != null) {
                    aVarA.p();
                    this.n = true;
                    ad.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i4 + " and start download !");
                }
            } catch (Exception e2) {
                ad.b("DefaultVideoPlayerStatusListener", e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) throws JSONException {
            try {
                ad.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.c != null) {
                    ad.b("omsdk", "bt onBufferingStart");
                    this.c.bufferStart();
                    this.o = true;
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.n);
                        jSONObject.put("id", this.d);
                        jSONObject.put("data", new JSONObject());
                        g.a().a(this.b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        d.c().a(this.b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.c == null || !this.o) {
                    return;
                }
                ad.b("omsdk", "bt onBufferingEnd");
                this.o = false;
                this.c.bufferFinish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }
    }

    public void setSoundImageViewVisble(int i) {
        this.q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCloseViewVisable(int i) {
        this.s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setShowClose(int i) {
        this.y = i;
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.P;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
            if (this.b == null || this.b.getProgressBarShow() != 1) {
                return;
            }
            this.P.setVisibility(0);
        }
    }

    public void setShowMute(int i) {
        this.z = i;
    }

    public void setShowTime(int i) {
        this.x = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i2) {
        if (i2 != 0) {
            try {
                return ai.a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.O.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.O.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.O.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.O.setPadding(i, i3, i2, i4);
    }

    public void preLoadData() {
        String str;
        int iR;
        if (this.b.getAdType() == 94 || this.b.getAdType() == 287) {
            str = this.b.getRequestId() + this.b.getId() + this.b.getVideoUrlEncode();
        } else {
            str = this.b.getId() + this.b.getVideoUrlEncode() + this.b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.c, str);
        if (aVarA != null) {
            this.w = aVarA;
        }
        this.F = e();
        this.J = d();
        if (this.h && !TextUtils.isEmpty(this.J) && this.b != null) {
            AdSession adSession = this.A;
            if (adSession != null) {
                adSession.registerAdView(this.p);
                this.A.addFriendlyObstruction(this.q, FriendlyObstructionPurpose.OTHER, null);
                this.A.addFriendlyObstruction(this.r, FriendlyObstructionPurpose.OTHER, null);
                this.A.addFriendlyObstruction(this.s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            a aVar = new a(this, this.v, this.C);
            this.D = aVar;
            CampaignEx campaignEx = this.b;
            if (campaignEx != null && campaignEx.getReady_rate() != -1) {
                iR = campaignEx.getReady_rate();
            } else {
                iR = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.c, false).r();
            }
            aVar.a(iR, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.c, false).s());
            this.p.setDesk(false);
            this.p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        K = false;
    }
}
