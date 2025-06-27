package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.C;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeVideoView extends MBridgeBaseView implements j {
    private static long aS = 0;
    private static int n = 0;
    private static int o = 0;
    private static int p = 0;
    private static int q = 0;
    private static int r = 0;
    private static boolean s = false;
    private FeedBackButton A;
    private ImageView B;
    private MBridgeSegmentsProgressBar C;
    private com.mbridge.msdk.video.module.a.a D;
    private a E;
    private boolean F;
    private com.mbridge.msdk.video.dynview.e.a G;
    private int H;
    private boolean I;
    private FrameLayout J;
    private MBridgeClickCTAView K;
    private com.mbridge.msdk.video.signal.factory.b L;
    private int M;
    private int N;
    private RelativeLayout O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private String S;
    private int T;
    private int U;
    private int V;
    private MBAlertDialog W;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private AlphaAnimation aF;
    private MBridgeBaitClickView aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private AcquireRewardPopViewParameters aL;
    private MBAcquireRewardPopView aM;
    private boolean aN;
    private RelativeLayout aO;
    private CollapsibleWebView aP;
    private RelativeLayout aQ;
    private boolean aR;
    private int aT;
    private boolean aU;
    private c aV;
    private boolean aW;
    private Runnable aX;
    private final Runnable aY;
    private com.mbridge.msdk.widget.dialog.a aa;
    private String ab;
    private double ac;
    private double ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private int an;
    private boolean ao;
    private int ap;
    private AdSession aq;
    private MediaEvents ar;
    private String as;
    private int at;
    private int au;
    private int av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    private PlayerView t;
    private SoundImageView u;
    private TextView v;
    private View w;
    private RelativeLayout x;
    private ImageView y;
    private ProgressBar z;

    public interface a {
        void a();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    static /* synthetic */ int aa(MBridgeVideoView mBridgeVideoView) {
        int i = mBridgeVideoView.aI;
        mBridgeVideoView.aI = i - 1;
        return i;
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.F = false;
        this.H = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.ab = "";
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.ao = false;
        this.ap = 2;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = true;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aH = 0;
        this.aI = 5;
        this.aJ = 5;
        this.aK = 5;
        this.aN = false;
        this.aR = false;
        this.aT = 0;
        this.aU = false;
        this.aV = new c(this);
        this.aW = false;
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.J != null) {
                    MBridgeVideoView.this.J.setVisibility(8);
                }
            }
        };
        this.aY = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aI <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aY);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aY, 1000L);
                }
            }
        };
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.F = false;
        this.H = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.ab = "";
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.ao = false;
        this.ap = 2;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = true;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aH = 0;
        this.aI = 5;
        this.aJ = 5;
        this.aK = 5;
        this.aN = false;
        this.aR = false;
        this.aT = 0;
        this.aU = false;
        this.aV = new c(this);
        this.aW = false;
        this.aX = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.J != null) {
                    MBridgeVideoView.this.J.setVisibility(8);
                }
            }
        };
        this.aY = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.13
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeVideoView.this.aI <= 0) {
                    MBridgeVideoView.this.showRewardPopView();
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.removeCallbacks(mBridgeVideoView.aY);
                } else {
                    MBridgeVideoView.aa(MBridgeVideoView.this);
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.postDelayed(mBridgeVideoView2.aY, 1000L);
                }
            }
        };
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        this.D = aVar;
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, List<CampaignEx> list, int i, int i2) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.G = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i;
        this.H = i2;
        this.mCampOrderViewData = list;
        if (this.b != null && this.b.getDynamicTempCode() == 5) {
            MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.C;
            if (mBridgeSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
                return;
            }
            if (this.mCampaignSize > 1) {
                mBridgeSegmentsProgressBar2.setVisibility(0);
                this.C.init(this.mCampaignSize, 2);
                for (int i3 = 0; i3 < this.mCampOrderViewData.size(); i3++) {
                    int videoPlayProgress = this.mCampOrderViewData.get(i3).getVideoPlayProgress();
                    if (videoPlayProgress > 0) {
                        this.C.setProgress(videoPlayProgress, i3);
                    }
                    if (this.mCampOrderViewData.get(i3).isRewardPopViewShowed) {
                        this.P = true;
                    }
                }
                return;
            }
            if (this.b != null && this.b.getProgressBarShow() == 1) {
                MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.C;
                if (mBridgeSegmentsProgressBar3 != null) {
                    mBridgeSegmentsProgressBar3.init(1, 3);
                    this.C.setVisibility(0);
                    return;
                }
                return;
            }
            this.C.setVisibility(8);
            return;
        }
        if (this.b == null || this.b.getProgressBarShow() != 1 || (mBridgeSegmentsProgressBar = this.C) == null) {
            return;
        }
        mBridgeSegmentsProgressBar.init(1, 3);
        this.C.setVisibility(0);
    }

    public boolean isShowingAlertView() {
        return this.Q;
    }

    public boolean isRewardPopViewShowing() {
        return this.R;
    }

    public String getUnitId() {
        return this.ab;
    }

    public void setUnitId(String str) {
        this.ab = str;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public boolean isMiniCardShowing() {
        return this.ah;
    }

    public boolean isShowingTransparent() {
        return this.am;
    }

    public void setShowingTransparent(boolean z) {
        this.am = z;
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.b = campaignEx;
            this.i = campaignEx.isDynamicView();
        }
        if (this.i) {
            final com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.j.c().a(this, campaignEx);
            com.mbridge.msdk.video.dynview.b.a().a(cVarA, new g() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12
                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        if (this != null && aVar.a() != null) {
                            aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            this.addView(aVar.a());
                        }
                        if (aVar.b() != null) {
                            Iterator<View> it = aVar.b().iterator();
                            while (it.hasNext()) {
                                it.next().setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.12.1
                                    @Override // com.mbridge.msdk.widget.a
                                    protected final void a(View view) throws JSONException {
                                        if (view instanceof TextView) {
                                            MBridgeVideoView.this.b.setTriggerClickSource(1);
                                        } else {
                                            MBridgeVideoView.this.b.setTriggerClickSource(2);
                                        }
                                        if (MBridgeVideoView.this.b.getRewardTemplateMode() != null && MBridgeVideoView.this.b.getRewardTemplateMode().f() == 902) {
                                            MBridgeVideoView.b(MBridgeVideoView.this);
                                        } else {
                                            MBridgeVideoView.a(MBridgeVideoView.this, "video_play_click");
                                        }
                                    }
                                });
                            }
                        }
                        MBridgeVideoView.this.aE = aVar.c();
                        MBridgeVideoView.this.b();
                        boolean unused = MBridgeVideoView.s = false;
                        if (MBridgeVideoView.this.b != null) {
                            MBridgeVideoView.this.b.setTemplateRenderSucc(MBridgeVideoView.this.aE);
                        }
                        MBridgeVideoView.this.M = cVarA.j();
                        MBridgeVideoView.this.N = cVarA.m();
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.b());
                }
            });
            return;
        }
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (iFindLayout > 0) {
            this.c.inflate(iFindLayout, this);
            b();
        }
        s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PlayerView playerView;
        this.f = f();
        if (!this.f) {
            ad.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (af.a().a("i_l_s_t_r_i", false) && (playerView = this.t) != null) {
            playerView.setNotifyListener(new PlayerView.OnPlayerViewVisibleListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.14
                @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
                public final void playerViewVisibleCallback() {
                    if (MBridgeVideoView.this.F) {
                        return;
                    }
                    MBridgeVideoView.this.F = true;
                    if (MBridgeVideoView.this.e == null || MBridgeVideoView.this.E == null) {
                        return;
                    }
                    MBridgeVideoView.this.e.a(20, MBridgeVideoView.this.E);
                }
            });
        }
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.aF = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    public void setIsIV(boolean z) {
        this.ao = z;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        int iR;
        super.setCampaign(campaignEx);
        c cVar = this.aV;
        if (cVar != null) {
            cVar.a(campaignEx);
            c cVar2 = this.aV;
            if (campaignEx != null && campaignEx.getReady_rate() != -1) {
                iR = campaignEx.getReady_rate();
            } else {
                iR = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false).r();
            }
            cVar2.a(iR, com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false).s());
        }
    }

    public void setSoundState(int i) {
        this.ap = i;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        super.c();
        if (this.f) {
            if (this.i) {
                if (com.mbridge.msdk.video.dynview.i.a.a(this.b) == -1 || com.mbridge.msdk.video.dynview.i.a.a(this.b) == 100) {
                    this.t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws JSONException {
                            if (MBridgeVideoView.this.e != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(com.mbridge.msdk.foundation.same.a.j, MBridgeVideoView.this.t.buildH5JsonObject(0));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                MBridgeVideoView.this.b.setClickTempSource(1);
                                MBridgeVideoView.this.b.setTriggerClickSource(2);
                                MBridgeVideoView.this.e.a(1, jSONObject);
                            }
                            if (MBridgeVideoView.this.ar != null) {
                                try {
                                    MBridgeVideoView.this.ar.adUserInteraction(InteractionType.CLICK);
                                    ad.a("omsdk", "play video view:  click");
                                } catch (Exception e2) {
                                    ad.b("omsdk", e2.getMessage());
                                }
                            }
                            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
                        }
                    });
                }
            } else {
                this.t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws JSONException {
                        if (MBridgeVideoView.this.e != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.j, MBridgeVideoView.this.t.buildH5JsonObject(0));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            MBridgeVideoView.this.b.setClickTempSource(1);
                            MBridgeVideoView.this.b.setTriggerClickSource(2);
                            MBridgeVideoView.this.e.a(1, jSONObject);
                        }
                    }
                });
            }
            SoundImageView soundImageView = this.u;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Integer num = 2;
                        if (MBridgeVideoView.this.t != null && MBridgeVideoView.this.t.isSilent()) {
                            num = 1;
                        }
                        if (num.intValue() == 1) {
                            MBridgeVideoView.this.mMuteSwitch = 2;
                        } else {
                            MBridgeVideoView.this.mMuteSwitch = 1;
                        }
                        if (MBridgeVideoView.this.e != null) {
                            MBridgeVideoView.this.e.a(5, num);
                        }
                    }
                });
            }
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        d dVar = new d();
                        dVar.a("type", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", MBridgeVideoView.this.b, dVar);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (MBridgeVideoView.this.ao) {
                        MBridgeVideoView.this.aD = true;
                        if (MBridgeVideoView.this.b == null || MBridgeVideoView.this.b.getRewardTemplateMode() == null || MBridgeVideoView.this.b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.aA) {
                            if (MBridgeVideoView.this.az) {
                                MBridgeVideoView.this.e();
                                return;
                            } else {
                                if (MBridgeVideoView.this.e != null) {
                                    MBridgeVideoView.this.e.a(123, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (MBridgeVideoView.this.e != null) {
                            MBridgeVideoView.this.aU = true;
                            com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.e;
                            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                            aVar.a(2, mBridgeVideoView.b(mBridgeVideoView.aA));
                            return;
                        }
                        return;
                    }
                    if (MBridgeVideoView.this.b == null || MBridgeVideoView.this.b.getRewardTemplateMode() == null || MBridgeVideoView.this.b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.aA) {
                        MBridgeVideoView.this.e();
                    } else if (MBridgeVideoView.this.e != null) {
                        MBridgeVideoView.this.aU = true;
                        com.mbridge.msdk.video.module.a.a aVar2 = MBridgeVideoView.this.e;
                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                        aVar2.a(2, mBridgeVideoView2.b(mBridgeVideoView2.aA));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.b != null && this.b.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010 && this.aU && !this.aA) {
                if (this.e != null) {
                    this.aU = true;
                    this.e.a(2, b(this.aA));
                    return;
                }
                return;
            }
            if (this.ao && (this.at == com.mbridge.msdk.foundation.same.a.G || this.at == com.mbridge.msdk.foundation.same.a.H)) {
                if (this.aw) {
                    if (this.at != com.mbridge.msdk.foundation.same.a.H || this.e == null) {
                        return;
                    }
                    this.aU = true;
                    this.e.a(2, b(this.aA));
                    return;
                }
                if (this.at == com.mbridge.msdk.foundation.same.a.H && this.aD) {
                    if (this.e != null) {
                        this.aU = true;
                        this.e.a(2, b(this.aA));
                        return;
                    }
                    return;
                }
                if (this.az) {
                    int curPosition = this.t.getCurPosition() / 1000;
                    int videoLength = (int) ((curPosition / (this.t.getDuration() == 0 ? this.b.getVideoLength() : this.t.getDuration())) * 100.0f);
                    if (this.at == com.mbridge.msdk.foundation.same.a.G) {
                        g();
                        if (this.au == com.mbridge.msdk.foundation.same.a.I && videoLength >= this.av) {
                            if (this.e != null) {
                                this.aU = true;
                                this.e.a(2, b(this.aA));
                                return;
                            }
                            return;
                        }
                        if (this.au == com.mbridge.msdk.foundation.same.a.J && curPosition >= this.av) {
                            if (this.e != null) {
                                this.aU = true;
                                this.e.a(2, b(this.aA));
                                return;
                            }
                            return;
                        }
                        if (this.e != null) {
                            this.e.a(8, "");
                        }
                    }
                    if (this.at == com.mbridge.msdk.foundation.same.a.H) {
                        if (this.au == com.mbridge.msdk.foundation.same.a.I && videoLength >= this.av) {
                            g();
                            if (this.e != null) {
                                this.e.a(8, "");
                                return;
                            }
                            return;
                        }
                        if (this.au != com.mbridge.msdk.foundation.same.a.J || curPosition < this.av) {
                            return;
                        }
                        g();
                        if (this.e != null) {
                            this.e.a(8, "");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.b != null && this.b.getAdSpaceT() != 2) {
                int iO = o();
                int curPosition2 = this.t.getCurPosition() / 1000;
                boolean z = false;
                if (this.b.getDynamicTempCode() != 5 || this.mCurrPlayNum <= 1 ? !((iO <= 0 || curPosition2 >= iO) && iO != 0) : !(iO == 0 || iO <= 0 || curPosition2 >= iO)) {
                    z = true;
                }
                if (z && this.V == 1 && !this.am) {
                    g();
                    if (this.e != null) {
                        this.e.a(8, "");
                        return;
                    }
                    return;
                }
                if (this.e != null) {
                    this.aU = true;
                    this.e.a(2, "");
                    return;
                }
                return;
            }
            if (this.e != null) {
                this.aU = true;
                this.e.a(2, "");
            }
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i) {
        if (this.Q) {
            this.Q = false;
            this.aw = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false);
            k.a(this.f3680a, this.b, com.mbridge.msdk.videocommon.d.c.f3883a, this.ab, 1, i, 1);
            if (i == 0) {
                h();
                if (this.ao) {
                    if (this.at == com.mbridge.msdk.foundation.same.a.H || this.at == com.mbridge.msdk.foundation.same.a.G) {
                        this.ax = true;
                        if (this.e != null) {
                            this.e.a(124, "");
                        }
                        if (this.b != null && this.b.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010) {
                            j();
                            return;
                        } else {
                            this.aC = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.ay = true;
            if (this.ao && this.at == com.mbridge.msdk.foundation.same.a.H) {
                h();
                return;
            }
            if (this.ao && this.at == com.mbridge.msdk.foundation.same.a.G) {
                if (this.e != null) {
                    this.aU = true;
                    this.e.a(2, b(this.aA));
                    return;
                }
                return;
            }
            if (this.e != null) {
                this.aU = true;
                this.e.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.Q = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.W;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        if (this.e != null) {
            this.e.a(125, "");
        }
    }

    public void setInstDialogState(boolean z) {
        PlayerView playerView;
        this.aN = z;
        if (!com.mbridge.msdk.f.b.a() || (playerView = this.t) == null) {
            return;
        }
        playerView.setIsCovered(z);
    }

    public boolean isInstDialogShowing() {
        return this.aN;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        if (this.ah) {
            return;
        }
        if (this.aa == null) {
            this.aa = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.19
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    MBridgeVideoView.this.Q = false;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.Q);
                    if (MBridgeVideoView.this.ao && (MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.H || MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.G)) {
                        MBridgeVideoView.this.ax = true;
                        if (MBridgeVideoView.this.e != null) {
                            MBridgeVideoView.this.e.a(124, "");
                        }
                        MBridgeVideoView.this.aC = true;
                        MBridgeVideoView.this.gonePlayingCloseView();
                    }
                    MBridgeVideoView.this.h();
                    k.a(MBridgeVideoView.this.f3680a, MBridgeVideoView.this.b, MBridgeVideoView.this.as, MBridgeVideoView.this.ab, 1, 0, 1);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    MBridgeVideoView.this.Q = false;
                    MBridgeVideoView.this.ay = true;
                    MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                    mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.Q);
                    k.a(MBridgeVideoView.this.f3680a, MBridgeVideoView.this.b, MBridgeVideoView.this.as, MBridgeVideoView.this.ab, 1, 1, 1);
                    if (!MBridgeVideoView.this.ao || MBridgeVideoView.this.at != com.mbridge.msdk.foundation.same.a.G) {
                        if (MBridgeVideoView.this.ao && MBridgeVideoView.this.at == com.mbridge.msdk.foundation.same.a.H) {
                            MBridgeVideoView.this.h();
                            return;
                        } else {
                            if (MBridgeVideoView.this.e != null) {
                                MBridgeVideoView.this.aU = true;
                                MBridgeVideoView.this.e.a(2, "");
                                return;
                            }
                            return;
                        }
                    }
                    if (MBridgeVideoView.this.e != null) {
                        MBridgeVideoView.this.aU = true;
                        com.mbridge.msdk.video.module.a.a aVar = MBridgeVideoView.this.e;
                        MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                        aVar.a(2, mBridgeVideoView2.b(mBridgeVideoView2.aA));
                    }
                }
            };
        }
        if (this.W == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.aa);
            this.W = mBAlertDialog;
            AdSession adSession = this.aq;
            if (adSession != null) {
                adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        if (this.ao) {
            this.W.makeIVAlertView(this.at, this.ab);
        } else {
            this.W.makeRVAlertView(this.ab);
        }
        PlayerView playerView = this.t;
        if (playerView != null) {
            if (playerView.isComplete() && (this.b == null || this.b.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010)) {
                return;
            }
            this.W.show();
            this.aw = true;
            this.Q = true;
            setShowingAlertViewCover(true);
            com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.ab, false);
            this.as = com.mbridge.msdk.videocommon.d.c.f3883a;
            k.a(this.f3680a, this.b, this.as, this.ab, 1, 1);
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.L = bVar;
        if (this.f) {
            if (!TextUtils.isEmpty(this.S) && this.b != null) {
                AdSession adSession = this.aq;
                if (adSession != null) {
                    adSession.registerAdView(this.t);
                    SoundImageView soundImageView = this.u;
                    if (soundImageView != null) {
                        this.aq.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, null);
                    }
                    this.aq.addFriendlyObstruction(this.v, FriendlyObstructionPurpose.OTHER, null);
                    this.aq.addFriendlyObstruction(this.w, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                }
                if (this.b != null && an.b(this.b.getVideoResolution())) {
                    String videoResolution = this.b.getVideoResolution();
                    ad.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                    String[] strArrSplit = videoResolution.split("x");
                    if (strArrSplit.length == 2) {
                        if (ai.m(strArrSplit[0]) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            this.ac = ai.m(strArrSplit[0]);
                        }
                        if (ai.m(strArrSplit[1]) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            this.ad = ai.m(strArrSplit[1]);
                        }
                        ad.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.ac + "  mVideoH:" + this.ad);
                    }
                    if (this.ac <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.ac = 1280.0d;
                    }
                    if (this.ad <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.ad = 720.0d;
                    }
                }
                this.t.initBufferIngParam(this.U);
                this.t.initVFPData(this.S, this.b.getVideoUrlEncode(), this.aV);
                soundOperate(this.ap, -1, null);
            }
        } else if (this.e != null) {
            this.e.a(12, "MBridgeVideoView initSuccess false");
        }
        s = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.ae = true;
        showVideoLocation(0, 0, ai.f(this.f3680a), ai.e(this.f3680a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.T == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ad.c(MBridgeBaseView.TAG, "showVideoLocation marginTop:" + i + " marginLeft:" + i2 + " width:" + i3 + "  height:" + i4 + " radius:" + i5 + " borderTop:" + i6 + " borderLeft:" + i7 + " borderWidth:" + i8 + " borderHeight:" + i9);
        if (this.f) {
            this.x.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.x.getVisibility() != 0) {
                this.x.setVisibility(0);
            }
            if (this.v.getVisibility() == 0) {
                m();
            }
            if ((i3 > 0 && i4 > 0 && ai.f(this.f3680a) >= i3 && ai.e(this.f3680a) >= i4) && !this.ae) {
                o = i6;
                p = i7;
                q = i8 + 4;
                r = i9 + 4;
                float f = i3 / i4;
                float f2 = 0.0f;
                try {
                    f2 = (float) (this.ac / this.ad);
                } catch (Throwable th) {
                    ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                }
                if (i5 > 0) {
                    n = i5;
                    if (i5 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(ai.a(getContext(), i5));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        if (Build.VERSION.SDK_INT >= 16) {
                            setBackground(gradientDrawable);
                            this.t.setBackground(gradientDrawable);
                        } else {
                            setBackgroundDrawable(gradientDrawable);
                            this.t.setBackgroundDrawable(gradientDrawable);
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            setClipToOutline(true);
                            this.t.setClipToOutline(true);
                        }
                    }
                }
                if (Math.abs(f - f2) <= 0.1f || this.an == 1) {
                    k();
                    if (this.am) {
                        setLayoutCenter(i3, i4);
                        if (s) {
                            this.e.a(114, "");
                            return;
                        } else {
                            this.e.a(116, "");
                            return;
                        }
                    }
                    setLayoutParam(i2, i, i3, i4);
                    return;
                }
                k();
                videoOperate(1);
                return;
            }
            k();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2, String str) {
        SoundImageView soundImageView;
        if (this.f) {
            this.ap = i;
            if (i == 1) {
                SoundImageView soundImageView2 = this.u;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.t.closeSound();
                try {
                    MediaEvents mediaEvents = this.ar;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                        ad.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e) {
                    ad.a("OMSDK", e.getMessage());
                }
            } else if (i == 2) {
                SoundImageView soundImageView3 = this.u;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.t.openSound();
                try {
                    MediaEvents mediaEvents2 = this.ar;
                    if (mediaEvents2 != null) {
                        mediaEvents2.volumeChange(1.0f);
                        ad.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e2) {
                    ad.a("OMSDK", e2.getMessage());
                }
            }
            if (this.b != null && this.b.isDynamicView()) {
                SoundImageView soundImageView4 = this.u;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i2 == 1) {
                SoundImageView soundImageView5 = this.u;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i2 == 2 && (soundImageView = this.u) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || this.e == null) {
            return;
        }
        this.e.a(7, Integer.valueOf(i));
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i) {
        ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i);
        if (this.f) {
            if (i == 1) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.aQ;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.Q || com.mbridge.msdk.foundation.d.b.c) {
                        return;
                    }
                    if (com.mbridge.msdk.f.b.a()) {
                        if (this.ah || this.aN) {
                            return;
                        }
                        h();
                        return;
                    }
                    h();
                    return;
                }
                return;
            }
            if (i == 2) {
                if (getVisibility() == 0 && isfront()) {
                    ad.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    g();
                    return;
                }
                return;
            }
            if (i == 3) {
                if (this.ag) {
                    return;
                }
                this.t.stop();
                if (this.b == null || this.b.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010) {
                    this.t.release();
                    this.ag = true;
                    d dVar = new d();
                    dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aS));
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
                    return;
                }
                return;
            }
            if (i == 5) {
                if (com.mbridge.msdk.f.b.a()) {
                    this.aN = true;
                    if (this.ag) {
                        return;
                    }
                    g();
                    return;
                }
                return;
            }
            if (i == 4) {
                if (com.mbridge.msdk.f.b.a()) {
                    this.aN = false;
                    if (this.ag || isMiniCardShowing()) {
                        return;
                    }
                    h();
                    return;
                }
                return;
            }
            if (i != 6 || this.ag) {
                return;
            }
            this.t.release();
            this.ag = true;
            d dVar2 = new d();
            dVar2.a("duration", Long.valueOf(System.currentTimeMillis() - aS));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.aD = true;
            if (getVisibility() == 0) {
                e();
            }
            try {
                d dVar = new d();
                dVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000148", this.b, dVar);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 == 2) {
            if (this.aC && getVisibility() == 0) {
                return;
            }
            j();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (this.f) {
            if (i == 1) {
                ProgressBar progressBar2 = this.z;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i != 2 || (progressBar = this.z) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i, int i2) {
        if (this.f) {
            ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i);
            int videoLength = this.b != null ? this.b.getVideoLength() : 0;
            if (i > 0 && i <= videoLength && this.t != null) {
                ad.c(MBridgeBaseView.TAG, "progressOperate progress:" + i);
                this.t.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.v.setVisibility(8);
            } else if (i2 == 2) {
                this.v.setVisibility(0);
            }
            if (this.v.getVisibility() == 0) {
                m();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        try {
            int iA = this.aV.a();
            int videoLength = this.b != null ? this.b.getVideoLength() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(iA, videoLength));
            jSONObject.put("time", iA);
            jSONObject.put("duration", videoLength + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i) {
        this.an = i;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i) {
        setVisibility(i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z) {
        if (this.f) {
            this.t.setIsCovered(z);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z) {
        this.ah = z;
    }

    public void setShowingAlertViewCover(boolean z) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z && (mBAcquireRewardPopView = this.aM) != null && this.R && this.Q) {
            mBAcquireRewardPopView.onPause();
        }
        this.t.setIsCovered(z);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < ai.e(this.f3680a.getApplicationContext());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return r;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return q;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return p;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return o;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return n;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.b == null || !this.b.isDynamicView()) && this.f && this.ae) {
            k();
        }
    }

    private String a(int i, int i2) {
        if (i2 != 0) {
            try {
                return ai.a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public int getCloseAlert() {
        return this.V;
    }

    public void setCloseAlert(int i) {
        this.V = i;
    }

    public int getVideoSkipTime() {
        return this.T;
    }

    public void setVideoSkipTime(int i) {
        this.T = i;
    }

    public void setPlayURL(String str) {
        this.S = str;
    }

    public void setBufferTimeout(int i) {
        this.U = i;
    }

    private boolean f() {
        try {
            this.t = (PlayerView) findViewById(filterFindViewId(this.aE, "mbridge_vfpv"));
            this.u = (SoundImageView) findViewById(filterFindViewId(this.aE, "mbridge_sound_switch"));
            this.v = (TextView) findViewById(filterFindViewId(this.aE, "mbridge_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.aE, "mbridge_rl_playing_close"));
            this.w = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            this.x = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_top_control"));
            this.y = (ImageView) findViewById(filterFindViewId(this.aE, "mbridge_videoview_bg"));
            this.z = (ProgressBar) findViewById(filterFindViewId(this.aE, "mbridge_video_progress_bar"));
            this.A = (FeedBackButton) findViewById(filterFindViewId(this.aE, "mbridge_native_endcard_feed_btn"));
            this.B = (ImageView) findViewById(filterFindViewId(this.aE, "mbridge_iv_link"));
            this.aO = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_scale_webview_layout"));
            this.aQ = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_header_layout"));
            if (this.aO != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.aP = collapsibleWebView;
                this.aO.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            ai.a(1, this.B, this.b, this.f3680a, false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.20
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeVideoView.this.g();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeVideoView.this.h();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeVideoView.this.h();
                }
            });
            this.C = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.aE, "mbridge_reward_segment_progressbar"));
            this.J = (FrameLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_cta_layout"));
            this.aG = (MBridgeBaitClickView) findViewById(filterFindViewId(this.aE, "mbridge_animation_click_view"));
            this.O = (RelativeLayout) findViewById(filterFindViewId(this.aE, "mbridge_reward_moreoffer_layout"));
            this.aM = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.aE, "mbridge_reward_popview"));
            return isNotNULL(this.t, this.u, this.v, this.w);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = iIndexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.ah) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            PlayerView playerView = this.t;
            if (playerView != null) {
                playerView.onPause();
                if (this.b != null && !this.b.isRewardPopViewShowed) {
                    removeCallbacks(this.aY);
                }
                if (com.mbridge.msdk.f.b.a()) {
                    this.t.setIsCovered(this.aN || this.Q || this.R);
                }
                if (this.b == null || this.b.getNativeVideoTracking() == null || this.b.isHasReportAdTrackPause()) {
                    return;
                }
                this.b.setHasReportAdTrackPause(true);
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.ab, this.b.getNativeVideoTracking().m(), false, false);
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c cVar;
        RelativeLayout relativeLayout;
        try {
            if (this.b == null || this.b.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 5002010 || (relativeLayout = this.aQ) == null || relativeLayout.getVisibility() == 0) {
                if (!this.af) {
                    boolean zPlayVideo = this.t.playVideo();
                    if (this.b != null && this.b.getPlayable_ads_without_video() != 2 && !zPlayVideo && (cVar = this.aV) != null) {
                        cVar.onPlayError("play video failed");
                    }
                    this.af = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
                if (mBAcquireRewardPopView != null && this.R) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.R) {
                    return;
                }
                if (com.mbridge.msdk.f.b.a()) {
                    if (this.aN || this.Q) {
                        return;
                    }
                    this.t.setIsCovered(false);
                    i();
                    return;
                }
                i();
            }
        } catch (Exception e) {
            ad.a(MBridgeBaseView.TAG, e.getMessage(), e);
        }
    }

    private void i() {
        if (this.aA) {
            if (!this.aB) {
                this.t.seekToEndFrame();
            }
            this.aB = true;
        } else {
            this.t.onResume();
        }
        if (this.b == null || this.b.isRewardPopViewShowed) {
            return;
        }
        post(this.aY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.f || this.w.getVisibility() == 0) {
            return;
        }
        if (!this.i || this.I) {
            this.w.setVisibility(0);
        }
        this.ai = true;
    }

    public void gonePlayingCloseView() {
        if (this.f && this.w.getVisibility() != 8) {
            this.w.setVisibility(8);
            this.ai = false;
        }
        if (this.aW || this.al || this.aj) {
            return;
        }
        this.aW = true;
        int i = this.T;
        if (i < 0) {
            return;
        }
        if (i == 0) {
            this.al = true;
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.2
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeVideoView.this.al = true;
                }
            }, this.T * 1000);
        }
    }

    private void k() {
        int iF;
        int iB;
        float f;
        float f2 = ai.f(this.f3680a);
        float fE = ai.e(this.f3680a);
        int iA = ai.a(getContext(), 58.0f);
        int iA2 = ai.a(getContext(), 104.0f);
        if (this.b != null && this.b.getAdSpaceT() == 2) {
            int iB2 = this.b.getRewardTemplateMode() != null ? this.b.getRewardTemplateMode().b() : 1;
            if (iB2 == 1) {
                f2 -= iA * 2;
                fE -= iA2 * 2;
            }
            if (iB2 == 2) {
                f2 -= iA2 * 2;
                fE -= iA * 2;
            }
            if (iB2 == 0) {
                if (this.d == 1) {
                    f2 -= iA * 2;
                    f = iA2 * 2;
                } else {
                    f2 -= iA2 * 2;
                    f = iA * 2;
                }
                fE -= f;
            }
        }
        double d = this.ac;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d2 = this.ad;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && f2 > 0.0f && fE > 0.0f) {
                double d3 = d / d2;
                double d4 = f2 / fE;
                ad.c(MBridgeBaseView.TAG, "videoWHDivide:" + d3 + "  screenWHDivide:" + d4);
                double dA = ai.a(Double.valueOf(d3));
                double dA2 = ai.a(Double.valueOf(d4));
                ad.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + dA + "  screenWHDivideFinal:" + dA2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.t.getLayoutParams();
                if (dA > dA2) {
                    double d5 = (f2 * this.ad) / this.ac;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d5;
                    layoutParams.gravity = 17;
                } else if (dA < dA2) {
                    layoutParams.width = (int) (fE * d3);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    if (this.b != null && this.b.isDynamicView()) {
                        if (this.b.getRewardTemplateMode() != null) {
                            iF = this.b.getRewardTemplateMode().f();
                            iB = this.b.getRewardTemplateMode().b();
                        } else {
                            iF = TypedValues.Custom.TYPE_BOOLEAN;
                            iB = this.f3680a.getResources().getConfiguration().orientation;
                        }
                        if (iF == 102 || iF == 202) {
                            if (iB == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.ad / (this.ac / f2));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (fE * d3);
                            }
                        }
                        if (iF == 202 && !TextUtils.isEmpty(this.b.getImageUrl())) {
                            a(this.b.getImageUrl());
                        }
                        if (iF == 302 || iF == 802 || iF == 5002010) {
                            if (this.ac / this.ad > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((this.ad * f2) / this.ac);
                            } else {
                                int iA3 = ai.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.ac * iA3) / this.ad);
                                layoutParams.height = iA3;
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
                this.t.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        l();
    }

    private void l() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.t.getLayoutParams();
            int iF = ai.f(this.f3680a);
            layoutParams.width = -1;
            layoutParams.height = (iF * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onBackPress() {
        if (this.ah || this.Q || this.ax) {
            return;
        }
        if (this.b != null && this.b.getRewardTemplateMode() != null && this.b.getRewardTemplateMode().f() == 5002010 && this.aA) {
            if (this.e != null) {
                this.aU = true;
                this.e.a(2, b(this.aA));
                return;
            }
            return;
        }
        if (this.ai) {
            e();
            return;
        }
        boolean z = this.aj;
        if (z && this.ak) {
            e();
        } else {
            if (z || !this.al) {
                return;
            }
            e();
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.aj = true;
            this.al = false;
        } else if (i == 1) {
            this.ak = true;
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.e.a(8, "");
    }

    public void notifyVideoClose() {
        this.aU = true;
        this.e.a(2, "");
    }

    public void setAdSession(AdSession adSession) {
        this.aq = adSession;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.ar = mediaEvents;
        c cVar = this.aV;
        if (cVar != null) {
            cVar.f = mediaEvents;
        }
        PlayerView playerView = this.t;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public int getMute() {
        return this.ap;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.at = i;
        this.au = i2;
        this.av = i3;
    }

    public void setDialogRole(int i) {
        this.az = i == 1;
        ad.b(MBridgeBaseView.TAG, i + " " + this.az);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z) throws JSONException {
        if (!this.ao) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.aw) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.F);
            }
            if (this.ay) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.D);
            }
            if (this.ax) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.E);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            ad.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    public void setNotchPadding(final int i, final int i2, final int i3, final int i4) {
        RelativeLayout relativeLayout;
        try {
            ad.b(MBridgeBaseView.TAG, "NOTCH VideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i5 = layoutParams.leftMargin;
            int i6 = layoutParams.rightMargin;
            int i7 = layoutParams.topMargin;
            int i8 = layoutParams.bottomMargin;
            this.aT = i3;
            if (!(Math.max(Math.max(i5, i6), Math.max(i7, i8)) > Math.max(Math.max(i, i2), Math.max(i3, i4))) && (relativeLayout = this.x) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MBridgeVideoView.this.x == null) {
                            return;
                        }
                        MBridgeVideoView.this.x.setVisibility(0);
                        if (MBridgeVideoView.this.b == null || MBridgeVideoView.this.b.getAdSpaceT() == 2) {
                            return;
                        }
                        MBridgeVideoView.this.x.setPadding(i, i3, i2, i4);
                        MBridgeVideoView.this.x.startAnimation(MBridgeVideoView.this.aF);
                    }
                }, 200L);
            }
            if (this.v.getVisibility() == 0) {
                m();
            }
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.b != null) {
            this.b.setCampaignUnitId(this.ab);
            com.mbridge.msdk.foundation.d.b.a().a(this.ab + "_1", this.b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            if (this.A != null) {
                com.mbridge.msdk.foundation.d.b.a().a(this.ab + "_1", this.A);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = this.A;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$4, reason: invalid class name */
    final class AnonymousClass4 implements com.mbridge.msdk.foundation.same.c.c {
        AnonymousClass4() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(final Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || MBridgeVideoView.this.y == null) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                final Bitmap bitmapA = o.a(bitmap, 10);
                                MBridgeVideoView.this.y.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.4.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MBridgeVideoView.this.y.setVisibility(0);
                                        MBridgeVideoView.this.y.setImageBitmap(bitmapA);
                                    }
                                });
                            } catch (Exception e) {
                                ad.b(MBridgeBaseView.TAG, e.getMessage());
                            }
                        }
                    });
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            ad.b(MBridgeBaseView.TAG, str);
        }
    }

    private void a(String str) {
        com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, new AnonymousClass4());
    }

    private void n() {
        if (this.J == null) {
            return;
        }
        if (this.K == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.K = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.b);
            this.K.setUnitId(this.ab);
            com.mbridge.msdk.video.module.a.a aVar = this.D;
            if (aVar != null) {
                this.K.setNotifyListener(new i(aVar));
            }
            this.K.preLoadData(this.L);
        }
        this.J.addView(this.K);
    }

    public void setCTALayoutVisibleOrGone() {
        if (this.b == null || !this.b.isDynamicView() || this.J == null) {
            return;
        }
        if (this.b.getRewardTemplateMode() == null || this.b.getRewardTemplateMode().f() != 902) {
            int i = this.N;
            if (i != -5) {
                if (i == -3) {
                    return;
                }
                if (this.K == null) {
                    n();
                }
                if (this.N == -1) {
                    if (this.J.getVisibility() != 0) {
                        this.J.setVisibility(0);
                        postDelayed(this.aX, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    } else {
                        this.J.setVisibility(8);
                        getHandler().removeCallbacks(this.aX);
                    }
                }
                if (this.N >= 0) {
                    this.J.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.M < -1) {
                return;
            }
            if (this.K == null) {
                n();
            }
            int i2 = this.M;
            if (i2 >= 0) {
                this.J.setVisibility(0);
                return;
            }
            if (i2 == -1) {
                if (this.J.getVisibility() != 0) {
                    this.J.setVisibility(0);
                    postDelayed(this.aX, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } else {
                    this.J.setVisibility(8);
                    getHandler().removeCallbacks(this.aX);
                }
            }
        }
    }

    public void showMoreOfferInPlayTemplate() {
        if (this.b == null || this.O == null || !this.b.isDynamicView() || this.b.getRewardTemplateMode() == null) {
            return;
        }
        String strE = this.b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = ao.a(strE, "mof");
            if (TextUtils.isEmpty(strA) || Integer.parseInt(strA) != 1) {
                return;
            }
            com.mbridge.msdk.video.dynview.moffer.a.a().a(this.b, this, new i(this.D), 1);
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void showBaitClickView() {
        int i;
        MBridgeBaitClickView mBridgeBaitClickView;
        if (this.b == null || !this.b.isDynamicView() || this.b.getRewardTemplateMode() == null) {
            return;
        }
        String strE = this.b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = ao.a(strE, "bait_click");
            if (TextUtils.isEmpty(strA) || (i = Integer.parseInt(strA)) == 0 || (mBridgeBaitClickView = this.aG) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.aG.init(i);
            this.aG.startAnimation();
            this.aG.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeVideoView.this.e != null) {
                        MBridgeVideoView.this.b.setTriggerClickSource(2);
                        MBridgeVideoView.a(MBridgeVideoView.this, "bait_click_clicked");
                    }
                }
            });
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.aL) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.aM.setVisibility(0);
            setCover(true);
            g();
            this.R = true;
            if (this.b != null) {
                this.b.isRewardPopViewShowed = true;
            }
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.aM;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        int iP;
        int videoCompleteTime = 0;
        try {
            iP = p();
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
        if (this.b == null) {
            return iP;
        }
        videoCompleteTime = this.b.getVideoCompleteTime();
        if (this.b.getDynamicTempCode() != 5 && videoCompleteTime > iP) {
            videoCompleteTime = iP;
        }
        if (videoCompleteTime <= 0) {
            return iP;
        }
        return videoCompleteTime;
    }

    private int p() {
        try {
            c cVar = this.aV;
            int iB = cVar != null ? cVar.b() : 0;
            return iB == 0 ? this.b.getVideoLength() : iB;
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
            return 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.aX != null) {
                getHandler().removeCallbacks(this.aX);
            }
            if (this.aH != 0) {
                removeCallbacks(this.aY);
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.t;
            if (playerView != null && !this.ag) {
                playerView.release();
                d dVar = new d();
                dVar.a("duration", Long.valueOf(System.currentTimeMillis() - aS));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.b, dVar);
            }
            c cVar = this.aV;
            if (cVar != null) {
                cVar.c();
            }
            if (this.D != null) {
                this.D = null;
            }
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setPlayerViewAttachListener(a aVar) {
        this.E = aVar;
    }

    private static final class c extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f3749a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private MediaEvents f;
        private boolean k;
        private String l;
        private CampaignEx m;
        private int n;
        private int o;
        private b g = new b();
        private boolean h = false;
        private boolean i = false;
        private boolean j = false;
        private boolean p = false;

        public c(MBridgeVideoView mBridgeVideoView) {
            this.f3749a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.l = mBridgeVideoView.getUnitId();
                this.m = mBridgeVideoView.getCampaign();
            }
        }

        public final void a(CampaignEx campaignEx) {
            this.m = campaignEx;
        }

        public final void a(boolean z) {
            this.k = z;
        }

        public final void a(String str) {
            this.l = str;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final void a(int i, int i2) {
            int i3;
            CampaignEx campaignEx;
            String str;
            this.n = i;
            this.o = i2;
            if (!af.a().a("h_c_r_w_p_c", false) || (i3 = this.n) == 100 || this.o != 0 || this.p || i3 == 0 || (campaignEx = this.m) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.m.getAdType() == 287) {
                    str = this.m.getRequestId() + this.m.getId() + this.m.getVideoUrlEncode();
                } else {
                    str = this.m.getId() + this.m.getVideoUrlEncode() + this.m.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l, str);
                if (aVarA != null) {
                    aVarA.p();
                    this.p = true;
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
        public final void onPlayStarted(int i) {
            CampaignEx campaignEx;
            super.onPlayStarted(i);
            MBridgeVideoView mBridgeVideoView = this.f3749a;
            if (mBridgeVideoView != null) {
                MBridgeVideoView.D(mBridgeVideoView);
            }
            if (!this.e) {
                MBridgeVideoView mBridgeVideoView2 = this.f3749a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.I = true;
                    this.f3749a.e.a(10, this.g);
                }
                this.e = true;
            }
            this.d = i;
            CampaignEx campaignEx2 = this.m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i;
                }
                String str = "mbridge_reward_shape_progress";
                if (this.m.isDynamicView()) {
                    MBridgeVideoView mBridgeVideoView3 = this.f3749a;
                    if (mBridgeVideoView3 != null && mBridgeVideoView3.v != null) {
                        if (this.m.getDynamicTempCode() == 5 && this.f3749a.mCurrPlayNum > 1 && videoCompleteTime <= 0) {
                            this.f3749a.v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                            d();
                        } else {
                            if (videoCompleteTime > 0) {
                                if (!this.k || this.m.getDynamicTempCode() == 5) {
                                    d();
                                }
                                str = "mbridge_reward_video_time_count_num_bg";
                            }
                            CampaignEx campaignEx3 = this.m;
                            if (campaignEx3 != null && campaignEx3.getUseSkipTime() == 1 && this.k) {
                                d();
                            }
                            this.f3749a.v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "drawable"));
                        }
                    }
                } else if (videoCompleteTime > 0) {
                    this.f3749a.v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 30.0f));
                    int iA = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 5.0f);
                    layoutParams.addRule(1, v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(iA, 0, 0, 0);
                    this.f3749a.v.setPadding(iA, 0, iA, 0);
                    this.f3749a.v.setLayoutParams(layoutParams);
                } else {
                    this.f3749a.v.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_shape_progress", "drawable"));
                }
            }
            MBridgeVideoView mBridgeVideoView4 = this.f3749a;
            if (mBridgeVideoView4 != null && mBridgeVideoView4.z != null) {
                this.f3749a.z.setMax(i);
            }
            MBridgeVideoView mBridgeVideoView5 = this.f3749a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.x != null && (campaignEx = this.m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f3749a.x.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView6 = this.f3749a;
            if (mBridgeVideoView6 != null && mBridgeVideoView6.v != null && this.f3749a.v.getVisibility() == 0) {
                this.f3749a.m();
            }
            boolean unused = MBridgeVideoView.s = false;
            MBridgeVideoView mBridgeVideoView7 = this.f3749a;
            if (mBridgeVideoView7 != null) {
                if (mBridgeVideoView7.N != -5) {
                    if (this.f3749a.N == 0) {
                        this.f3749a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f3749a.M == 0) {
                    this.f3749a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView8 = this.f3749a;
            if (mBridgeVideoView8 != null) {
                mBridgeVideoView8.showMoreOfferInPlayTemplate();
                this.f3749a.showBaitClickView();
                MBridgeVideoView.J(this.f3749a);
            }
            if (this.f != null) {
                float volume = 0.0f;
                try {
                    MBridgeVideoView mBridgeVideoView9 = this.f3749a;
                    if (mBridgeVideoView9 != null && mBridgeVideoView9.t != null) {
                        volume = this.f3749a.t.getVolume();
                    }
                    this.f.start(i, volume);
                    ad.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e) {
                    ad.b("omsdk", e.getMessage());
                }
            }
        }

        private void d() {
            MBridgeVideoView mBridgeVideoView = this.f3749a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.v.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 25.0f);
                this.f3749a.v.setLayoutParams(layoutParams);
            }
            int iA = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 5.0f);
            this.f3749a.v.setPadding(iA, 0, iA, 0);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() throws JSONException {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f3749a.aA = true;
            CampaignEx campaignEx = this.m;
            if (campaignEx == null) {
                this.f3749a.v.setText("0");
            } else {
                if (!this.k || campaignEx.getRewardTemplateMode() == null || this.m.getRewardTemplateMode().f() != 5002010) {
                    this.f3749a.v.setText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    this.f3749a.v.setText("0");
                }
                this.m.setVideoPlayProgress(100);
                if (this.m.getAdSpaceT() == 2) {
                    this.f3749a.w.setVisibility(4);
                    if (this.f3749a.A != null) {
                        this.f3749a.A.setClickable(false);
                    }
                    if (this.f3749a.u != null) {
                        this.f3749a.u.setClickable(false);
                    }
                }
            }
            MediaEvents mediaEvents = this.f;
            if (mediaEvents != null) {
                mediaEvents.complete();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f3749a.t.setClickable(false);
            String strB = this.f3749a.b(true);
            CampaignEx campaignEx2 = this.m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.m.getRewardTemplateMode().f() == 5002010) {
                this.f3749a.j();
            }
            CampaignEx campaignEx3 = this.m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f3749a) != null && mBridgeVideoView.G != null && this.f3749a.mCampaignSize > this.f3749a.mCurrPlayNum) {
                HashMap map = new HashMap();
                map.put(t2.h.L, Integer.valueOf(this.f3749a.mCurrPlayNum));
                if (this.f3749a.mMuteSwitch != 0) {
                    map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(this.f3749a.mMuteSwitch));
                }
                this.f3749a.G.a(map);
                return;
            }
            MBridgeVideoView mBridgeVideoView2 = this.f3749a;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.e.a(121, "");
                this.f3749a.e.a(11, strB);
            }
            int i = this.c;
            this.b = i;
            this.f3749a.mCurrentPlayProgressTime = i;
            boolean unused = MBridgeVideoView.s = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            ad.b("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f3749a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.e.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) {
            int i3;
            String str;
            int videoCompleteTime;
            StringBuilder sb;
            String str2;
            int i4;
            StringBuilder sb2;
            String str3;
            super.onPlayProgress(i, i2);
            if (MBridgeVideoView.aS == 0) {
                long unused = MBridgeVideoView.aS = System.currentTimeMillis();
            }
            if (this.f3749a.f) {
                CampaignEx campaignEx = this.m;
                int i5 = 0;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    if (videoCompleteTime <= 0) {
                        videoCompleteTime = i2;
                    }
                    com.mbridge.msdk.foundation.d.b.a().b(this.m.getCampaignUnitId() + "_1", i);
                } else {
                    videoCompleteTime = 0;
                }
                CampaignEx campaignEx2 = this.m;
                String string = "0";
                if (campaignEx2 != null && campaignEx2.isDynamicView() && this.m.getDynamicTempCode() == 5) {
                    try {
                        int i6 = this.f3749a.H;
                        MBridgeVideoView mBridgeVideoView = this.f3749a;
                        if (mBridgeVideoView != null) {
                            String string2 = (String) mBridgeVideoView.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                            String str4 = (String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                            if (videoCompleteTime >= 0) {
                                if (this.m.getUseSkipTime() == 1) {
                                    int iMin = Math.min(this.f3749a.T, videoCompleteTime);
                                    if (iMin >= videoCompleteTime || iMin <= 0) {
                                        i4 = videoCompleteTime - i;
                                        if (this.k) {
                                            if (i4 <= 0) {
                                                this.f3749a.v.setVisibility(4);
                                            } else {
                                                str3 = (String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                                                str4 = str3;
                                            }
                                        }
                                    } else {
                                        i4 = iMin - i;
                                        if (i4 <= 0) {
                                            i4 = videoCompleteTime - i;
                                            if (this.k) {
                                                this.f3749a.v.setVisibility(4);
                                            }
                                        } else {
                                            str3 = (String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                                            str4 = str3;
                                        }
                                    }
                                } else {
                                    i4 = videoCompleteTime - i;
                                }
                                if (i4 > 0) {
                                    string2 = i4 + str4;
                                }
                            } else {
                                i4 = i6 - i;
                                if (i4 <= 0) {
                                    if (videoCompleteTime <= 0) {
                                    }
                                    this.g.f3748a = i;
                                    this.f3749a.v.setText(string);
                                    if (this.f3749a.z != null && this.f3749a.z.getVisibility() == 0) {
                                        this.f3749a.z.setProgress(i);
                                    }
                                    if (i4 < this.f3749a.aK && this.f3749a.aM != null && this.f3749a.R) {
                                        this.f3749a.aM.onTimeLessThanReduce(i4);
                                    }
                                } else {
                                    if (videoCompleteTime <= 0) {
                                        sb2 = new StringBuilder();
                                        sb2.append(i4);
                                        sb2.append("");
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(i4);
                                        sb2.append(str4);
                                    }
                                    string2 = sb2.toString();
                                }
                            }
                            string = string2;
                            this.g.f3748a = i;
                            this.f3749a.v.setText(string);
                            if (this.f3749a.z != null) {
                                this.f3749a.z.setProgress(i);
                            }
                            if (i4 < this.f3749a.aK) {
                                this.f3749a.aM.onTimeLessThanReduce(i4);
                            }
                        }
                    } catch (Exception e) {
                        ad.b("DefaultVideoPlayerStatusListener", e.getMessage());
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView2 = this.f3749a;
                    if (mBridgeVideoView2 != null) {
                        if (this.k) {
                            str2 = String.format("%s", Integer.valueOf(i2 - i));
                        } else {
                            if (videoCompleteTime > i2) {
                                videoCompleteTime = i2;
                            }
                            int i7 = videoCompleteTime <= 0 ? i2 - i : videoCompleteTime - i;
                            if (i7 > 0) {
                                if (videoCompleteTime <= 0) {
                                    sb = new StringBuilder();
                                    sb.append(i7);
                                    sb.append("");
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(i7);
                                    sb.append((String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING)));
                                }
                                string = sb.toString();
                                i5 = i7;
                            } else if (videoCompleteTime > 0) {
                                string = (String) mBridgeVideoView2.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                            }
                            if (i5 < this.f3749a.aK && this.f3749a.aM != null && this.f3749a.R) {
                                this.f3749a.aM.onTimeLessThanReduce(i5);
                            }
                            str2 = string;
                        }
                        CampaignEx campaignEx3 = this.m;
                        if (campaignEx3 != null && campaignEx3.getUseSkipTime() == 1) {
                            int iMin2 = Math.min(this.f3749a.T, i2);
                            if (iMin2 >= videoCompleteTime || iMin2 < 0) {
                                int i8 = videoCompleteTime - i;
                                if (this.k) {
                                    if (i8 > 0) {
                                        str2 = i8 + ((String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                                    } else if (i8 == 0) {
                                        this.f3749a.v.setVisibility(4);
                                    }
                                }
                            } else {
                                int i9 = iMin2 - i;
                                if (i9 > 0) {
                                    str2 = i9 + ((String) this.f3749a.getContext().getResources().getText(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                                } else if (this.k && i9 == 0) {
                                    this.f3749a.v.setVisibility(4);
                                }
                            }
                        }
                        this.f3749a.v.setText(str2);
                        if (this.f3749a.z != null && this.f3749a.z.getVisibility() == 0) {
                            this.f3749a.z.setProgress(i);
                        }
                    }
                    this.g.f3748a = i;
                }
            }
            this.c = i2;
            this.g.b = i2;
            this.g.c = this.f3749a.aC;
            this.b = i;
            if (this.f3749a.B != null) {
                this.f3749a.B.setTag("" + this.b);
            }
            this.f3749a.mCurrentPlayProgressTime = i;
            this.f3749a.e.a(15, this.g);
            MediaEvents mediaEvents = this.f;
            if (mediaEvents != null) {
                int i10 = (i * 100) / i2;
                int i11 = ((i + 1) * 100) / i2;
                if (i10 <= 25 && 25 < i11 && !this.h) {
                    this.h = true;
                    mediaEvents.firstQuartile();
                    ad.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i10 <= 50 && 50 < i11 && !this.i) {
                    this.i = true;
                    mediaEvents.midpoint();
                    ad.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i10 <= 75 && 75 < i11 && !this.j) {
                    this.j = true;
                    mediaEvents.thirdQuartile();
                    ad.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f3749a.ao && !this.f3749a.aw && this.f3749a.at == com.mbridge.msdk.foundation.same.a.H) {
                this.f3749a.e();
            }
            try {
                MBridgeVideoView mBridgeVideoView3 = this.f3749a;
                if (mBridgeVideoView3 != null && mBridgeVideoView3.C != null) {
                    int i12 = (i * 100) / i2;
                    this.f3749a.C.setProgress(i12, this.f3749a.mCurrPlayNum - 1);
                    this.m.setVideoPlayProgress(i12);
                }
                MBridgeVideoView mBridgeVideoView4 = this.f3749a;
                if (mBridgeVideoView4 != null) {
                    int i13 = mBridgeVideoView4.N != -5 ? this.f3749a.N : this.f3749a.M;
                    if (i13 != -1 && i == i13 && this.f3749a.b != null && this.f3749a.b.isDynamicView()) {
                        this.f3749a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                ad.b("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            int i14 = this.n;
            if (i14 == 100 || this.p || i14 == 0) {
                return;
            }
            if (this.o > i14) {
                this.o = i14 / 2;
            }
            int i15 = this.o;
            if (i15 < 0 || i < (i3 = (i2 * i15) / 100)) {
                return;
            }
            if (this.m.getAdType() == 94 || this.m.getAdType() == 287) {
                str = this.m.getRequestId() + this.m.getId() + this.m.getVideoUrlEncode();
            } else {
                str = this.m.getId() + this.m.getVideoUrlEncode() + this.m.getBidToken();
            }
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l, str);
            if (aVarA != null) {
                aVarA.p();
                this.p = true;
                ad.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i3 + " and start download !");
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f != null) {
                    ad.a("omsdk", "play:  videoEvents.bufferStart()");
                    this.f.bufferStart();
                }
                this.f3749a.e.a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                MediaEvents mediaEvents = this.f;
                if (mediaEvents != null) {
                    mediaEvents.bufferFinish();
                    ad.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f3749a.e.a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        public final void c() {
            this.f3749a = null;
            boolean unused = MBridgeVideoView.s = false;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3748a;
        public int b;
        public boolean c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f3748a + ", allDuration=" + this.b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static /* synthetic */ void b(MBridgeVideoView mBridgeVideoView) {
        if (mBridgeVideoView.b == null || !mBridgeVideoView.b.isDynamicView() || mBridgeVideoView.J == null) {
            return;
        }
        if (mBridgeVideoView.K == null) {
            mBridgeVideoView.n();
        }
        if (mBridgeVideoView.J.getVisibility() != 0) {
            mBridgeVideoView.J.setVisibility(0);
            mBridgeVideoView.postDelayed(mBridgeVideoView.aX, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            mBridgeVideoView.J.setVisibility(8);
            mBridgeVideoView.getHandler().removeCallbacks(mBridgeVideoView.aX);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeVideoView r9, java.lang.String r10) throws org.json.JSONException {
        /*
            com.mbridge.msdk.video.module.a.a r0 = r9.D
            if (r0 == 0) goto L9c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.b
            if (r0 == 0) goto L55
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.b
            r1 = 1
            r0.setClickTempSource(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.b     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = ""
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            int r0 = r0.f()     // Catch: java.lang.Exception -> L51
            r2.append(r0)     // Catch: java.lang.Exception -> L51
            r2.append(r1)     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L51
        L2b:
            r7 = r1
            android.content.Context r0 = r9.f3680a     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r1.getCampaignUnitId()     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L51
            boolean r3 = r1.isBidCampaign()     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L51
            java.lang.String r4 = r1.getRequestId()     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = r1.getRequestIdNotice()     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r9.b     // Catch: java.lang.Exception -> L51
            java.lang.String r6 = r1.getId()     // Catch: java.lang.Exception -> L51
            r1 = r10
            com.mbridge.msdk.foundation.same.report.k.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r10 = move-exception
            r10.printStackTrace()
        L55:
            r10 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68
            r0.<init>()     // Catch: org.json.JSONException -> L68
            java.lang.String r10 = com.mbridge.msdk.foundation.same.a.j     // Catch: org.json.JSONException -> L66
            r1 = 0
            org.json.JSONObject r1 = r9.a(r1)     // Catch: org.json.JSONException -> L66
            r0.put(r10, r1)     // Catch: org.json.JSONException -> L66
            goto L6f
        L66:
            r10 = move-exception
            goto L6c
        L68:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L6c:
            r10.printStackTrace()
        L6f:
            com.mbridge.msdk.video.module.a.a r10 = r9.D
            r1 = 105(0x69, float:1.47E-43)
            r10.a(r1, r0)
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r10 = r10.c()
            if (r10 == 0) goto L9c
            com.mbridge.msdk.foundation.controller.c r10 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.c()     // Catch: java.lang.Exception -> L92
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.b     // Catch: java.lang.Exception -> L92
            com.mbridge.msdk.video.module.b.b.d(r10, r9)     // Catch: java.lang.Exception -> L92
            goto L9c
        L92:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.a(com.mbridge.msdk.video.module.MBridgeVideoView, java.lang.String):void");
    }

    static /* synthetic */ void D(MBridgeVideoView mBridgeVideoView) {
        if (mBridgeVideoView.aP == null || mBridgeVideoView.b == null || !TextUtils.isEmpty(mBridgeVideoView.aP.getUrl())) {
            return;
        }
        mBridgeVideoView.aP.loadUrl(mBridgeVideoView.b.getClickURL());
        mBridgeVideoView.aP.setToolBarTitle(mBridgeVideoView.b.getAppName());
        com.mbridge.msdk.c.g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = com.mbridge.msdk.c.i.a();
        }
        mBridgeVideoView.aP.setPageLoadTimtout((int) gVarB.aq());
        mBridgeVideoView.aP.setPageLoadListener(new CollapsibleWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.5
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
            public final void b(View view, Map<String, String> map) {
            }

            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
            public final void a(View view, String str) throws JSONException {
                JSONObject jSONObject;
                if (MBridgeVideoView.this.aR) {
                    return;
                }
                MBridgeVideoView.this.aR = true;
                if (MBridgeVideoView.this.aO != null && MBridgeVideoView.this.aO.getVisibility() != 0) {
                    MBridgeVideoView.this.aO.setVisibility(0);
                }
                com.mbridge.msdk.click.a.a(MBridgeVideoView.this.getContext(), MBridgeVideoView.this.b, MBridgeVideoView.this.getUnitId(), MBridgeVideoView.this.b.getNoticeUrl(), true, false, com.mbridge.msdk.click.a.a.i);
                com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c().getApplicationContext(), MBridgeVideoView.this.b);
                d dVar = new d();
                dVar.a("result", 1);
                if (MBridgeVideoView.this.D != null) {
                    JSONObject jSONObject2 = null;
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put(com.mbridge.msdk.foundation.same.a.j, MBridgeVideoView.this.a(0));
                        } catch (JSONException e) {
                            e = e;
                            jSONObject2 = jSONObject;
                            e.printStackTrace();
                            jSONObject = jSONObject2;
                            MBridgeVideoView.this.D.a(131, jSONObject);
                            MBridgeVideoView.this.b.setClickType(1);
                            MBridgeVideoView.this.b.setClickTempSource(1);
                            MBridgeVideoView.this.b.setTriggerClickSource(2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.b);
                            dVar.a("type", 9);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("web_view");
                            dVar.a("click_path", arrayList.toString());
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.b, dVar);
                            dVar.a("url", str);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                    }
                    MBridgeVideoView.this.D.a(131, jSONObject);
                    MBridgeVideoView.this.b.setClickType(1);
                    MBridgeVideoView.this.b.setClickTempSource(1);
                    MBridgeVideoView.this.b.setTriggerClickSource(2);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", MBridgeVideoView.this.b);
                    dVar.a("type", 9);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("web_view");
                    dVar.a("click_path", arrayList2.toString());
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", MBridgeVideoView.this.b, dVar);
                }
                dVar.a("url", str);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
            public final void a(View view, Map<String, String> map) {
                String str;
                String str2;
                str = "";
                if (map != null) {
                    String str3 = map.get("url");
                    str = str3 != null ? str3 : "";
                    str2 = map.get("description");
                } else {
                    str2 = "";
                }
                a(str, str2);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.a
            public final void b(View view, String str) {
                a(str, "timeout");
            }

            private void a(String str, String str2) {
                if (MBridgeVideoView.this.aR) {
                    return;
                }
                MBridgeVideoView.this.aR = true;
                if (str == null) {
                    str = "";
                }
                if (MBridgeVideoView.this.aO != null && MBridgeVideoView.this.aO.getVisibility() == 0) {
                    MBridgeVideoView.this.aO.setVisibility(8);
                }
                d dVar = new d();
                dVar.a("result", 2);
                dVar.a("url", str);
                if (Build.VERSION.SDK_INT >= 23) {
                    dVar.a("reason", str2);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_render", MBridgeVideoView.this.b, dVar);
            }
        });
        mBridgeVideoView.aP.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.6
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            }
        });
        mBridgeVideoView.aP.setCollapseListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.7
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
            public final void a() {
                if (MBridgeVideoView.this.aQ != null) {
                    MBridgeVideoView.this.aQ.setVisibility(0);
                    d dVar = new d();
                    dVar.a("status", 1);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.b, dVar);
                }
                if (MBridgeVideoView.this.aP != null) {
                    MBridgeVideoView.this.aP.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
                }
                MBridgeVideoView.this.h();
            }
        });
        mBridgeVideoView.aP.setExpandListener(new CommonWebView.a() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.8
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a
            public final void a() {
                if (MBridgeVideoView.this.aQ != null) {
                    MBridgeVideoView.this.aQ.setVisibility(8);
                    d dVar = new d();
                    dVar.a("status", 2);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_webview_zoom", MBridgeVideoView.this.b, dVar);
                }
                if (MBridgeVideoView.this.aP != null) {
                    MBridgeVideoView.this.aP.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.aT, 0, 0);
                }
                MBridgeVideoView.this.g();
            }
        });
        mBridgeVideoView.aP.setExitsClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MBridgeVideoView.this.aQ != null) {
                    MBridgeVideoView.this.aQ.setVisibility(0);
                }
                if (MBridgeVideoView.this.aO != null) {
                    MBridgeVideoView.this.aO.setVisibility(8);
                }
                if (MBridgeVideoView.this.aA) {
                    return;
                }
                MBridgeVideoView.this.h();
            }
        });
    }

    static /* synthetic */ void J(MBridgeVideoView mBridgeVideoView) {
        String strE;
        if (mBridgeVideoView.b == null || !mBridgeVideoView.b.isDynamicView() || mBridgeVideoView.P) {
            return;
        }
        if (!TextUtils.isEmpty(mBridgeVideoView.b.getMof_template_url())) {
            strE = mBridgeVideoView.b.getMof_template_url();
        } else if (mBridgeVideoView.b.getRewardTemplateMode() == null) {
            return;
        } else {
            strE = mBridgeVideoView.b.getRewardTemplateMode().e();
        }
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = ao.a(strE, "guideShow");
            String strA2 = ao.a(strE, "guideDelay");
            String strA3 = ao.a(strE, "guideTime");
            String strA4 = ao.a(strE, "guideRewardTime");
            if (!TextUtils.isEmpty(strA)) {
                mBridgeVideoView.aH = Integer.parseInt(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                int i = Integer.parseInt(strA2);
                mBridgeVideoView.aI = i;
                if (i > 10 || i < 3) {
                    mBridgeVideoView.aI = 5;
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                int i2 = Integer.parseInt(strA3);
                mBridgeVideoView.aJ = i2;
                if (i2 > 10 || i2 < 3) {
                    mBridgeVideoView.aJ = 5;
                }
            }
            if (!TextUtils.isEmpty(strA4)) {
                int i3 = Integer.parseInt(strA4);
                mBridgeVideoView.aK = i3;
                if (i3 > 10 || i3 < 5) {
                    mBridgeVideoView.aK = 5;
                }
            }
            int i4 = mBridgeVideoView.aH;
            if (i4 > 0 && i4 <= 2) {
                int iO = mBridgeVideoView.o();
                if (iO == 0 || iO > mBridgeVideoView.aI) {
                    int i5 = iO - mBridgeVideoView.aI;
                    if (i5 >= 0 && mBridgeVideoView.aK > i5) {
                        mBridgeVideoView.aK = i5;
                    }
                    int iP = mBridgeVideoView.p();
                    if (mBridgeVideoView.aK >= iP) {
                        mBridgeVideoView.aK = iP - mBridgeVideoView.aI;
                    }
                    if (mBridgeVideoView.aI >= iP) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(mBridgeVideoView.b.getAppName());
                    com.mbridge.msdk.c.g gVarA = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                    mBridgeVideoView.aL = new AcquireRewardPopViewParameters.Builder("", mBridgeVideoView.ab, mBridgeVideoView.aH, gVarA != null ? gVarA.o() : "US").setAutoDismissTime(mBridgeVideoView.aJ).setReduceTime(mBridgeVideoView.aK).setBehaviourListener(new AcquireRewardPopViewBehaviourListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoView.11
                        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                        public final void onReceivedSuccess(int i6) {
                            MBridgeVideoView.this.R = false;
                            if (com.mbridge.msdk.f.b.b()) {
                                MBridgeVideoView.this.setCover(false);
                            }
                            int iO2 = MBridgeVideoView.this.o() - i6;
                            MBridgeVideoView.this.b.setVideoCompleteTime(iO2);
                            MBridgeVideoView.this.h();
                            if (MBridgeVideoView.this.e != null) {
                                MBridgeVideoView.this.e.a(130, Integer.valueOf(iO2));
                            }
                            k.a(MBridgeVideoView.this.b, MBridgeVideoView.this.ab, MBridgeVideoView.this.aH, 1, "");
                        }

                        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                        public final void onReceivedFail(String str) {
                            MBridgeVideoView.this.R = false;
                            if (com.mbridge.msdk.f.b.b()) {
                                MBridgeVideoView.this.setCover(false);
                            }
                            MBridgeVideoView.this.h();
                            k.a(MBridgeVideoView.this.b, MBridgeVideoView.this.ab, MBridgeVideoView.this.aH, 2, str);
                        }

                        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
                        public final void onOutOfContentClicked(float f, float f2) {
                            if (MBridgeVideoView.this.D != null) {
                                MBridgeVideoView.this.D.a(105, "");
                            }
                        }
                    }).setRightAnswerList(arrayList).build();
                    mBridgeVideoView.postDelayed(mBridgeVideoView.aY, 1000L);
                }
            }
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }
}
