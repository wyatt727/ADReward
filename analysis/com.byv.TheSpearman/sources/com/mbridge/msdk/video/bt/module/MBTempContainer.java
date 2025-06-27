package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.m;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBTempContainer extends MBTempContainerDiff {
    private static final String x = "MBTempContainer";
    private com.mbridge.msdk.videocommon.download.a A;
    private h B;
    private com.mbridge.msdk.video.bt.module.a.b C;
    private com.mbridge.msdk.video.dynview.e.a D;
    private int E;
    private String F;
    private com.mbridge.msdk.video.signal.factory.b G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private String Q;
    private List<CampaignEx> R;
    private int S;
    private com.mbridge.msdk.foundation.same.report.d.b T;
    private LayoutInflater U;
    private int V;
    private int W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f3570a;
    private View aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private com.mbridge.msdk.mbsignalcommon.mraid.d al;
    private AdSession am;
    private MediaEvents an;
    private AdEvents ao;
    private Runnable ap;
    private boolean aq;
    protected boolean b;
    protected a c;
    protected WindVaneWebView d;
    protected MBridgeContainerView e;
    protected Handler f;
    protected Runnable g;
    protected Runnable h;
    private View y;
    private CampaignEx z;

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context) {
        super(context);
        this.E = 1;
        this.F = "";
        this.H = com.mbridge.msdk.foundation.same.a.F;
        this.J = false;
        this.P = "";
        this.R = new ArrayList();
        this.S = 0;
        this.f3570a = false;
        this.b = false;
        this.c = new a.C0301a();
        this.f = new Handler();
        this.V = 0;
        this.W = 0;
        this.g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = 1;
        this.F = "";
        this.H = com.mbridge.msdk.foundation.same.a.F;
        this.J = false;
        this.P = "";
        this.R = new ArrayList();
        this.S = 0;
        this.f3570a = false;
        this.b = false;
        this.c = new a.C0301a();
        this.f = new Handler();
        this.V = 0;
        this.W = 0;
        this.g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }

    public void init(Context context) {
        this.U = LayoutInflater.from(context);
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i) {
        if (list != null) {
            this.R = list;
        }
        this.S = i;
    }

    public void registerErrorListener(a aVar) {
        this.c = aVar;
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, "layout");
    }

    public interface a {
        void a(String str);

        void a(boolean z);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a, reason: collision with other inner class name */
        public static class C0301a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f3580a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public void a(String str) {
                ad.b("ActivityErrorListener", str);
                this.f3580a = true;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public final void a(boolean z) {
                this.f3580a = z;
            }
        }
    }

    public boolean isLoadSuccess() {
        return this.b;
    }

    private int c() {
        k kVarB = b(this.z);
        if (kVarB != null) {
            return kVarB.m();
        }
        return 0;
    }

    private boolean d() {
        k kVarB = b(this.z);
        if (kVarB != null) {
            return kVarB.p();
        }
        return false;
    }

    private boolean e() {
        if (this.mbridgeVideoView != null) {
            return com.mbridge.msdk.f.b.a() ? this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing() : this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    public void superDefaultLoad(int i, String str) {
        this.f.removeCallbacks(this.g);
        this.f.removeCallbacks(this.h);
        this.c.a(true);
        WindVaneWebView windVaneWebView = this.d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public AdEvents getAdEvents() {
        return this.ao;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.ao = adEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.G;
        if (bVar == null || bVar.getJSCommon() == null) {
            return;
        }
        this.G.getJSCommon().a(adEvents);
    }

    public AdSession getAdSession() {
        return this.am;
    }

    public void setAdSession(AdSession adSession) {
        this.am = adSession;
        com.mbridge.msdk.video.signal.factory.b bVar = this.G;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.G.getJSCommon().a(adSession);
        }
        if (this.mbridgeVideoView != null) {
            this.mbridgeVideoView.setAdSession(adSession);
        }
    }

    public MediaEvents getVideoEvents() {
        return this.an;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.an = mediaEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.G;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.G.getJSCommon().a(mediaEvents);
        }
        if (this.mbridgeVideoView != null) {
            this.mbridgeVideoView.setVideoEvents(mediaEvents);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected final void a(String str) {
        h hVar = this.B;
        if (hVar != null) {
            hVar.a(this.T, str);
        }
        super.a(str);
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.ad = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            if (this.mbridgeVideoView != null) {
                this.mbridgeVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            ad.a(x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        super.onResume();
        int i = this.V;
        if (i == -3) {
            runnable = this.g;
        } else {
            runnable = i == -4 ? this.h : null;
        }
        if (runnable != null) {
            runnable.run();
            this.V = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !e() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.d.b.c) {
                this.mbridgeVideoView.setCover(false);
            }
            if (this.mbridgeVideoView != null) {
                this.mbridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.ad && !e() && !com.mbridge.msdk.foundation.d.b.c) {
                getJSVideoModule().videoOperate(1);
            }
            if (this.i != null) {
                ai.a(this.i.getWindow().getDecorView());
            }
            if (this.af && this.ag && this.i != null) {
                this.i.finish();
            }
        } catch (Throwable th) {
            ad.a(x, th.getMessage(), th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        if (this.mbridgeVideoView != null) {
            this.mbridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        CampaignEx campaignEx;
        if (this.J) {
            return;
        }
        boolean z = true;
        this.J = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.f.b.a()) {
                setChinaDestroy();
            }
            if (this.mbridgeVideoView != null) {
                this.mbridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.d;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.d.clearWebView();
                this.d.release();
            }
            if (this.C != null) {
                this.C = null;
            }
            this.f.removeCallbacks(this.g);
            this.f.removeCallbacks(this.h);
            getJSCommon().e();
            if (this.q) {
                com.mbridge.msdk.c.h.a().e(this.j);
            }
            if (!this.ab) {
                try {
                    this.ab = true;
                    CampaignEx campaignEx2 = this.z;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                        this.ac = true;
                    }
                    MediaEvents mediaEvents = this.an;
                    if (mediaEvents != null && !this.ac) {
                        try {
                            mediaEvents.skipped();
                        } catch (Exception e2) {
                            ad.a("omsdk", e2.getMessage());
                        }
                    }
                    if (this.B != null) {
                        if (this.q && (this.s == com.mbridge.msdk.foundation.same.a.G || this.s == com.mbridge.msdk.foundation.same.a.H)) {
                            h hVar = this.B;
                            if (this.I != 1) {
                                z = false;
                            }
                            hVar.a(z, this.H);
                        }
                        if (!this.ac) {
                            this.n.a(0);
                        }
                        this.T.a(this.z);
                        this.B.a(this.T, this.ac, this.n);
                    }
                    this.f.removeCallbacks(this.ap);
                    if (((!this.q && !this.v) || ((campaignEx = this.z) != null && campaignEx.isDynamicView())) && this.ac && (!com.mbridge.msdk.f.b.a() || !checkChinaSendToServerDiff(this.B))) {
                        ad.a(x, "sendToServerRewardInfo");
                        com.mbridge.msdk.video.module.b.b.a(this.z, this.n, this.j, this.m, this.Q);
                    }
                    if (!this.v) {
                        if (this.q) {
                            com.mbridge.msdk.videocommon.a.b(287, this.z);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(94, this.z);
                        }
                    }
                    MBridgeContainerView mBridgeContainerView = this.e;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.release();
                    }
                } catch (Throwable th) {
                    ad.a(x, th.getMessage(), th);
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.al;
            if (dVar != null) {
                dVar.d();
            }
            if (this.am != null) {
                ad.b("omsdk", "tc onDestroy");
                this.am.removeAllFriendlyObstructions();
                this.am.finish();
                this.am = null;
            }
            if (!this.v) {
                if (isLoadSuccess()) {
                    this.f.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (MBTempContainer.this.i != null) {
                                MBTempContainer.this.i.finish();
                            }
                        }
                    }, 100L);
                } else if (this.i != null) {
                    this.i.finish();
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.F);
        } catch (Throwable th2) {
            ad.a(x, th2.getMessage());
        }
    }

    private void f() {
        i iVar = new i(getContext());
        CampaignEx campaignEx = this.z;
        if (campaignEx != null) {
            iVar.b(campaignEx.getRequestId(), this.z.getRequestIdNotice(), this.z.getId(), this.j, com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.z.getId()), this.z.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.z.getId());
            this.ae = true;
        }
    }

    public void setShowingTransparent() {
        int iA;
        boolean zD = d();
        this.af = zD;
        if (zD || (iA = v.a(getContext(), "mbridge_reward_theme", "style")) <= 1 || this.i == null) {
            return;
        }
        this.i.setTheme(iA);
    }

    private void g() {
        AdSession adSession = this.am;
        if (adSession != null) {
            try {
                adSession.addFriendlyObstruction(this.e, FriendlyObstructionPurpose.OTHER, null);
                View view = this.aa;
                if (view != null) {
                    this.am.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
                }
                WindVaneWebView windVaneWebView = this.d;
                if (windVaneWebView != null) {
                    this.am.addFriendlyObstruction(windVaneWebView, FriendlyObstructionPurpose.OTHER, null);
                }
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.am.start();
                if (this.ao != null) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    ad.a("omsdk", "bt:   adEvents.loaded");
                    this.ao.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    this.ao.impressionOccurred();
                }
            } catch (Exception e2) {
                ad.a("omsdk", e2.getMessage());
            }
        }
    }

    public void receiveSuccess() {
        ad.a(x, "receiveSuccess ,start hybrid");
        this.f.removeCallbacks(this.h);
        this.f.postDelayed(this.ap, 250L);
    }

    public void defaultLoad(int i, String str) {
        int iE;
        int i2;
        superDefaultLoad(i, str);
        CampaignEx campaignEx = this.z;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.z.setTemplateRenderSucc(false);
        }
        if (isLoadSuccess()) {
            if (this.z.getPlayable_ads_without_video() == 2) {
                this.e.setCampaign(this.z);
                this.e.addOrderViewData(this.R);
                this.e.setUnitID(this.j);
                this.e.setCloseDelayTime(i());
                this.e.setPlayCloseBtnTm(this.l.h());
                this.e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.z, this.A, this.n, b(), this.j, new d(), this.l.y(), this.v));
                this.e.preLoadData(this.G);
                this.e.showPlayableView();
            } else {
                a(i, str);
                this.aa.setVisibility(8);
                loadModuleDatas();
                int iF = this.l.f();
                int iC = c();
                int i3 = iC != 0 ? iC : iF;
                CampaignEx campaignEx2 = this.z;
                if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                    this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.i, this.z));
                }
                CampaignEx campaignEx3 = this.z;
                if (campaignEx3 != null && campaignEx3.getVst() > -2) {
                    iE = this.z.getVst();
                } else {
                    iE = this.l.e();
                }
                CampaignEx campaignEx4 = this.z;
                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i2 = this.E) > 1) {
                    iE = a(iE, i2);
                    this.z.setVst(iE);
                }
                int i4 = iE;
                this.mbridgeVideoView.setVideoSkipTime(i4);
                this.mbridgeVideoView.setNotifyListener(new m(this.mbridgeVideoView, this.e, this.z, this.n, this.A, b(), this.j, i3, i4, new f(), this.l.y(), this.v, this.l.C()));
                this.mbridgeVideoView.setAdSession(this.am);
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.mbridgeVideoView.defaultShow();
                this.e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.b(this.mbridgeVideoView, this.e, this.z, this.n, this.A, b(), this.j, new c(this.i, this.z), this.l.y(), this.v));
                this.e.defaultShow();
            }
            g();
            return;
        }
        a(i, str);
        if (this.i != null) {
            this.i.finish();
        }
    }

    public int getLayoutID() {
        return findLayout(this.af ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public WindVaneWebView findWindVaneWebView() {
        a.C0310a c0310aA;
        try {
            if (this.v) {
                CampaignEx campaignEx = this.z;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
                    return null;
                }
                a.C0310a c0310aA2 = com.mbridge.msdk.videocommon.a.a(this.j + "_" + this.z.getId() + "_" + this.z.getRequestId() + "_" + this.z.getRewardTemplateMode().e());
                if (c0310aA2 != null) {
                    return c0310aA2.a();
                }
                return null;
            }
            if (this.q) {
                c0310aA = com.mbridge.msdk.videocommon.a.a(287, this.z);
            } else {
                c0310aA = com.mbridge.msdk.videocommon.a.a(94, this.z);
            }
            if (c0310aA == null || !c0310aA.c()) {
                return null;
            }
            if (this.q) {
                com.mbridge.msdk.videocommon.a.b(287, this.z);
            } else {
                com.mbridge.msdk.videocommon.a.b(94, this.z);
            }
            WindVaneWebView windVaneWebViewA = c0310aA.a();
            if (this.af) {
                windVaneWebViewA.setWebViewTransparent();
            }
            return windVaneWebViewA;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.aa = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.e;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        if (this.af && this.mbridgeVideoView != null) {
            this.mbridgeVideoView.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.z;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.z.getRewardTemplateMode().f() == 5002010) || this.ah) && this.mbridgeVideoView != null) {
            if (this.mbridgeVideoView.isMiniCardShowing()) {
                MBridgeContainerView mBridgeContainerView3 = this.e;
                if (mBridgeContainerView3 != null) {
                    mBridgeContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.mbridgeVideoView.onBackPress();
            return;
        }
        if (this.aj && (mBridgeContainerView2 = this.e) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.ai && (mBridgeContainerView = this.e) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (canBackPress()) {
            if (this.i == null || this.v || this.ak) {
                return;
            }
            this.ak = true;
            this.i.onBackPressed();
            return;
        }
        ad.a(x, "onBackPressed can't excute");
    }

    private void a(int i, String str) {
        try {
            n nVar = new n();
            nVar.a("2000037");
            nVar.r("code=" + i + ",desc=" + str);
            CampaignEx campaignEx = this.z;
            nVar.q((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.z.getRewardTemplateMode().e());
            nVar.c(this.j);
            CampaignEx campaignEx2 = this.z;
            nVar.e(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.z;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.f(this.z.getRequestId());
            }
            CampaignEx campaignEx4 = this.z;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.g(this.z.getRequestIdNotice());
            }
            int iL = z.l(getContext());
            nVar.a(iL);
            nVar.k(z.a(getContext(), iL));
            com.mbridge.msdk.video.module.b.b.a(n.h(nVar), this.j);
        } catch (Throwable th) {
            ad.a(x, th.getMessage(), th);
        }
    }

    private int h() {
        try {
            com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
            if (aVarB == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            if (aVarB != null) {
                return (int) aVarB.h();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private int i() {
        CampaignEx campaignEx = this.z;
        if (campaignEx == null) {
            return 1;
        }
        boolean zA = ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iC = ai.c(this.z.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (zA && iC >= 0) {
            return iC;
        }
        if (this.z.getCbd() > -2) {
            return this.z.getCbd();
        }
        return this.l.p();
    }

    private int a(int i, int i2) {
        List<CampaignEx> list;
        if (i < 0 || (list = this.R) == null || list.size() == 0 || i2 <= 1) {
            return i;
        }
        int videoLength = 0;
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            if (this.R.get(i3) != null) {
                videoLength += this.R.get(i3).getVideoLength();
            }
        }
        if (i > videoLength) {
            return i - videoLength;
        }
        return 0;
    }

    private final class f extends com.mbridge.msdk.video.module.a.a.f {
        private f() {
        }

        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (MBTempContainer.this.q) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            MBTempContainer.this.H = jSONObject.getInt("Alert_window_status");
                            MBTempContainer.this.I = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e) {
                    ad.b("NotifyListener", e.getMessage());
                }
            }
            if (i != 2) {
                if (i == 121) {
                    MBTempContainer.this.ac = true;
                    MBTempContainer.this.B.a(MBTempContainer.this.k, MBTempContainer.this.j);
                    MBTempContainer.this.ah = false;
                    return;
                }
                if (i == 16) {
                    if (com.mbridge.msdk.f.b.a()) {
                        MBTempContainer.p(MBTempContainer.this);
                        return;
                    } else {
                        MBTempContainer.this.getJSCommon().d();
                        return;
                    }
                }
                if (i != 17) {
                    switch (i) {
                        case 10:
                            MBTempContainer.this.ah = true;
                            if (MBTempContainer.this.z != null && !af.a().a("i_l_s_t_r_i", false)) {
                                if (!MBTempContainer.this.z.isDynamicView() || !MBTempContainer.this.v || MBTempContainer.this.z.isCampaignIsFiltered()) {
                                    MBTempContainer.this.B.a(MBTempContainer.this.T);
                                }
                                com.mbridge.msdk.video.bt.module.b.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.z, MBTempContainer.this.j, MBTempContainer.this.E);
                                break;
                            }
                            break;
                    }
                }
                MBTempContainer.this.ac = true;
                if (MBTempContainer.this.e != null) {
                    MBTempContainer.this.e.setRewardStatus(true);
                    return;
                }
                return;
            }
            if (i == 12) {
                String string = "Play error but has no message.";
                try {
                    if (obj instanceof String) {
                        string = obj.toString();
                    }
                } catch (Throwable th) {
                    ad.b("NotifyListener", th.getMessage());
                }
                com.mbridge.msdk.video.bt.module.b.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.z, MBTempContainer.this.j, string, MBTempContainer.this.E);
                if (!MBTempContainer.this.ah) {
                    if (MBTempContainer.this.l.C() == 0) {
                        MBTempContainer.this.B.a(MBTempContainer.this.T, "play error");
                        MBTempContainer.this.ah = false;
                        MBTempContainer.p(MBTempContainer.this);
                        return;
                    } else if (MBTempContainer.this.z == null || !MBTempContainer.this.z.isDynamicView() || !MBTempContainer.this.v || MBTempContainer.this.z.isCampaignIsFiltered()) {
                        MBTempContainer.this.B.a(MBTempContainer.this.T);
                    }
                }
            }
            MBTempContainer.this.getJSVideoModule().videoOperate(i == 2 ? 6 : 3);
            MBTempContainer.this.ah = false;
            if (MBTempContainer.this.an == null || i != 2) {
                return;
            }
            ad.b("omsdk", "mbtc skip");
            try {
                MBTempContainer.this.an.skipped();
            } catch (Exception e2) {
                ad.a("omsdk", e2.getMessage());
            }
        }
    }

    private final class c extends com.mbridge.msdk.video.module.a.a.a {
        public c(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
        @Override // com.mbridge.msdk.video.module.a.a.a, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.c.a(int, java.lang.Object):void");
        }
    }

    private final class d extends com.mbridge.msdk.video.module.a.a.f {
        private d() {
        }

        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i, Object obj) {
            String string;
            super.a(i, obj);
            try {
                if (obj instanceof JSONObject) {
                    string = obj.toString();
                } else {
                    string = (String) obj;
                }
                if (MBTempContainer.this.q && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (iOptInt == 2) {
                        MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.D;
                    } else if (iOptInt != 3) {
                        MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.F;
                    } else {
                        MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.E;
                    }
                    MBTempContainer.this.I = iOptInt2;
                }
            } catch (Exception unused) {
                ad.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i == 120) {
                MBTempContainer.this.B.b(MBTempContainer.this.k, MBTempContainer.this.j);
                return;
            }
            if (i == 131) {
                MBTempContainer.this.getJSCommon().click(4, obj != null ? obj.toString() : "");
                return;
            }
            if (i == 126) {
                MBTempContainer.this.B.a(false, MBTempContainer.this.k, MBTempContainer.this.j);
                return;
            }
            if (i != 127) {
                switch (i) {
                    case 100:
                        MBTempContainer.this.aj = true;
                        MBTempContainer.this.f.postDelayed(MBTempContainer.this.ap, 250L);
                        MBTempContainer.this.B.a(MBTempContainer.this.T);
                        break;
                    case 101:
                    case 102:
                        MBTempContainer.this.getJSCommon().d();
                        break;
                    case 103:
                        MBTempContainer.this.ac = true;
                        if (MBTempContainer.this.z.isMraid()) {
                            MBTempContainer.p(MBTempContainer.this);
                            break;
                        } else {
                            MBTempContainer.this.getJSCommon().d();
                            break;
                        }
                    case 104:
                        MBTempContainer.p(MBTempContainer.this);
                        break;
                    case 105:
                        if (com.mbridge.msdk.f.b.a()) {
                            MBTempContainer.this.setChinaCTACallBack();
                        }
                        MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                }
                return;
            }
            MBTempContainer.this.ac = true;
            MBTempContainer.this.B.a(MBTempContainer.this.T);
            MBTempContainer.this.B.b(MBTempContainer.this.k, MBTempContainer.this.j);
            MBTempContainer.this.getJSContainerModule().showEndcard(100);
        }
    }

    private class e extends a.C0309a {
        private e() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a() {
            super.a();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.N(MBTempContainer.this);
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.ag = true;
            MBTempContainer.P(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String strOptString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals("1.0") && MBTempContainer.this.i != null) {
                        if (!MBTempContainer.this.v) {
                            MBTempContainer.this.i.finish();
                        } else {
                            MBTempContainer.p(MBTempContainer.this);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.P(MBTempContainer.this);
            MBTempContainer.this.ag = true;
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(boolean z) {
            if (MBTempContainer.this.an != null) {
                try {
                    MBTempContainer.this.an.adUserInteraction(InteractionType.CLICK);
                    ad.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e) {
                    ad.b("omsdk", e.getMessage());
                }
            }
            super.a(z);
            MBTempContainer.this.B.a(z, MBTempContainer.this.k, MBTempContainer.this.j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(int i, String str) {
            super.a(i, str);
            MBTempContainer.this.defaultLoad(i, str);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void b() {
            super.b();
            if (MBTempContainer.this.f != null) {
                MBTempContainer.this.f.removeCallbacks(MBTempContainer.this.g);
            }
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.z = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.d.b bVarB = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            this.T = bVarB;
            if (bVarB == null) {
                this.T = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.T.c(campaignEx.getCurrentLocalRid());
            this.T.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.j)) {
                campaignEx.setCampaignUnitId(this.j);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.aq = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.d.b.a().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public CampaignEx getCampaign() {
        return this.z;
    }

    public void setCampaignExpired(boolean z) {
        try {
            CampaignEx campaignEx = this.z;
            if (campaignEx != null) {
                if (z) {
                    campaignEx.setSpareOfferFlag(1);
                    if (com.mbridge.msdk.f.b.a()) {
                        if (this.r) {
                            this.z.setCbt(0);
                        } else if (this.l != null) {
                            if (this.l.y() == 1) {
                                this.z.setCbt(1);
                            } else {
                                this.z.setCbt(0);
                            }
                        }
                    } else if (this.l != null) {
                        if (this.l.y() == 1) {
                            this.z.setCbt(1);
                        } else {
                            this.z.setCbt(0);
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.z.setCbt(0);
                }
            }
        } catch (Exception e2) {
            ad.b(x, e2.getMessage());
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.A = aVar;
    }

    public void setShowRewardListener(h hVar) {
        this.B = hVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.a.b bVar) {
        this.C = bVar;
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, int i) {
        this.D = aVar;
        this.E = i;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.G = bVar;
    }

    public void setInstanceId(String str) {
        this.F = str;
    }

    public String getInstanceId() {
        return this.F;
    }

    public void setWebViewFront(int i) {
        this.W = i;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) throws JSONException {
        this.K = i;
        this.L = i2;
        this.M = i3;
        this.N = i4;
        this.O = i5;
        String strA = r.a(i, i2, i3, i4, i5);
        this.P = strA;
        ad.b(x, strA);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.P)) {
            getJSCommon().b(this.P);
            if (this.d != null && !TextUtils.isEmpty(this.P)) {
                g.a().a((WebView) this.d, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
            }
        }
        if (this.mbridgeVideoView != null) {
            this.mbridgeVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeContainerView mBridgeContainerView = this.e;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setDeveloperExtraData(String str) {
        this.Q = str;
    }

    private static final class b extends AppletSchemeCallBack {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f3581a;

        public b(CampaignEx campaignEx) {
            this.f3581a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.x, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.x, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f3581a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.x, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected final void onRequestFailed(int i, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.x, "request wx scheme failed: errorCode: " + i + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f3581a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.x, e.getMessage());
                }
            }
        }
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int iF;
        int iE;
        List<CampaignEx> list;
        AppletsModel appletsModel;
        if (this.l == null) {
            this.l = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.j, this.q);
        }
        try {
            if (this.z != null) {
                try {
                    appletsModel = AppletModelManager.getInstance().get(this.z);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                    appletsModel = null;
                }
                if (appletsModel != null) {
                    try {
                        if (appletsModel.can(0)) {
                            appletsModel.setUserClick(false);
                            appletsModel.requestWxAppletsScheme(0, new b(this.z));
                        }
                    } catch (Exception e3) {
                        if (appletsModel != null) {
                            appletsModel.clearRequestState();
                        }
                        if (MBridgeConstans.DEBUG) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        this.ak = false;
        try {
            if (this.v) {
                CampaignEx campaignEx = this.z;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.q, this.l, this.z, this.B, b(), this.j);
                } else {
                    this.B = new com.mbridge.msdk.video.bt.module.b.c(this.C, this.F);
                }
            } else {
                this.B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.q, this.l, this.z, this.B, b(), this.j);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.b.e(this.T, this.B));
            a(this.l, this.z);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View viewInflate = this.U.inflate(layoutID, (ViewGroup) null);
            this.y = viewInflate;
            addView(viewInflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f3570a) {
                setMatchParent();
            }
            this.d = findWindVaneWebView();
            this.mbridgeVideoView = findMBridgeVideoView();
            this.mbridgeVideoView.setVideoLayout(this.z);
            this.mbridgeVideoView.setIsIV(this.q);
            this.mbridgeVideoView.setUnitId(this.j);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.D, this.R, this.E, this.S);
            if (this.v) {
                this.mbridgeVideoView.setNotchPadding(this.L, this.M, this.N, this.O);
            }
            this.e = findMBridgeContainerView();
            if (this.v) {
                this.e.setNotchPadding(this.K, this.L, this.M, this.N, this.O);
            }
            if (af.a().a("i_l_s_t_r_i", false)) {
                this.mbridgeVideoView.setPlayerViewAttachListener(new MBridgeVideoView.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
                    @Override // com.mbridge.msdk.video.module.MBridgeVideoView.a
                    public final void a() {
                        if (MBTempContainer.this.z != null) {
                            if (!MBTempContainer.this.z.isDynamicView() || !MBTempContainer.this.v || MBTempContainer.this.z.isCampaignIsFiltered()) {
                                MBTempContainer.this.B.a(MBTempContainer.this.T);
                            }
                            com.mbridge.msdk.video.bt.module.b.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.z, MBTempContainer.this.j, MBTempContainer.this.E);
                        }
                    }
                });
            }
            if (!((this.mbridgeVideoView == null || this.e == null || !initViews()) ? false : true)) {
                this.c.a("not found View IDS");
                if (this.i != null) {
                    this.i.finish();
                    return;
                }
                return;
            }
            this.b = true;
            WindVaneWebView windVaneWebView = this.d;
            this.G = new com.mbridge.msdk.video.signal.factory.b(this.i, windVaneWebView, this.mbridgeVideoView, this.e, this.z, new e());
            CampaignEx campaignEx2 = this.z;
            if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.R) != null) {
                this.G.a(list);
            }
            registerJsFactory(this.G);
            com.mbridge.msdk.foundation.d.b.a().a(this.j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String string;
                    MBTempContainer.this.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 1);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a(MBTempContainer.x, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.d, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String string;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a(MBTempContainer.x, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.d, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String string;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a(MBTempContainer.x, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.d, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }
            });
            g();
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.G);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof k) {
                    getJSCommon().a(this.ao);
                    getJSCommon().a(this.am);
                    getJSCommon().a(this.an);
                    getJSCommon().a(this.p);
                    getJSCommon().a(this.j);
                    getJSCommon().a(this.l);
                    getJSCommon().a(new e());
                    CampaignEx campaignEx3 = this.z;
                    if (campaignEx3 != null && (campaignEx3.isMraid() || this.z.isActiveOm())) {
                        com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                        this.al = dVar;
                        dVar.c();
                        this.al.a();
                        this.al.a(new d.b() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.7
                            @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
                            public final void a(double d2) {
                                ad.b(MBTempContainer.x, "volume is : " + d2);
                                try {
                                    if (!MBTempContainer.this.z.isMraid() || MBTempContainer.this.e == null || MBTempContainer.this.e.getH5EndCardView() == null) {
                                        return;
                                    }
                                    MBTempContainer.this.e.getH5EndCardView().volumeChange(d2);
                                } catch (Exception e5) {
                                    ad.b(MBTempContainer.x, e5.getMessage());
                                }
                            }
                        });
                    }
                    getJSContainerModule().readyStatus(((k) windVaneWebView.getObject()).r());
                    try {
                        if (this.d != null) {
                            int i = getResources().getConfiguration().orientation;
                            if (d()) {
                                iF = ai.h(getContext());
                                iE = ai.g(getContext());
                                if (ai.a(getContext())) {
                                    int iC = ai.c(getContext());
                                    if (i == 2) {
                                        iF += iC;
                                    } else {
                                        iE += iC;
                                    }
                                }
                            } else {
                                iF = ai.f(getContext());
                                iE = ai.e(getContext());
                            }
                            int iB = this.z.getRewardTemplateMode().b();
                            if (c(this.z) == 1) {
                                iB = i;
                            }
                            getJSNotifyProxy().a(i, iB, iF, iE);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(getContext()));
                            try {
                                if (this.n != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("name", this.n.a());
                                    jSONObject2.put("amount", this.n.b());
                                    jSONObject2.put("id", this.o);
                                    jSONObject.put("userId", this.m);
                                    jSONObject.put("reward", jSONObject2);
                                    jSONObject.put("playVideoMute", this.p);
                                    jSONObject.put("extra", this.Q);
                                }
                            } catch (JSONException e5) {
                                ad.a(x, e5.getMessage());
                            } catch (Exception e6) {
                                ad.a(x, e6.getMessage());
                            }
                            String string = jSONObject.toString();
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.z, dVar2);
                            getJSNotifyProxy().a(string);
                            g.a().a((WebView) this.d, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
                            getJSCommon().b(true);
                            if (com.mbridge.msdk.f.b.a()) {
                                setChinaCallBackStatus(this.d);
                            }
                            loadModuleDatas();
                            this.f.postDelayed(this.g, 2000L);
                        }
                    } catch (Exception e7) {
                        if (MBridgeConstans.DEBUG) {
                            e7.printStackTrace();
                        }
                    }
                    ((k) windVaneWebView.getObject()).m.a();
                    if (this.v) {
                        getJSCommon().e(this.W);
                    }
                }
                if (getJSCommon().a() == 1 && (viewGroup = (ViewGroup) this.y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.y).removeView(viewGroup);
                    ((ViewGroup) this.y).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Throwable th) {
            th.printStackTrace();
            a("onCreate error" + th);
        }
    }

    public void loadModuleDatas() {
        int iE;
        int i;
        k kVarB = b(this.z);
        int iN = kVarB != null ? kVarB.n() : 0;
        if (iN != 0) {
            this.p = iN;
        }
        int iF = this.l.f();
        int iC = c();
        int i2 = iC != 0 ? iC : iF;
        this.mbridgeVideoView.setSoundState(this.p);
        this.mbridgeVideoView.setCampaign(this.z);
        this.mbridgeVideoView.setPlayURL(this.A.t());
        CampaignEx campaignEx = this.z;
        if (campaignEx != null && campaignEx.getVst() > -2) {
            iE = this.z.getVst();
        } else {
            iE = this.l.e();
        }
        CampaignEx campaignEx2 = this.z;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i = this.E) > 1) {
            iE = a(iE, i);
            this.z.setVst(iE);
        }
        this.mbridgeVideoView.setVideoSkipTime(iE);
        this.mbridgeVideoView.setCloseAlert(this.l.i());
        this.mbridgeVideoView.setBufferTimeout(h());
        int i3 = iE;
        this.mbridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.n(this.G, this.z, this.n, this.A, b(), this.j, i2, iE, new f(), this.l.y(), this.v, this.l.C()));
        this.mbridgeVideoView.setShowingTransparent(this.af);
        this.mbridgeVideoView.setAdSession(this.am);
        if (this.q && (this.s == com.mbridge.msdk.foundation.same.a.G || this.s == com.mbridge.msdk.foundation.same.a.H)) {
            this.mbridgeVideoView.setIVRewardEnable(this.s, this.t, this.u);
            this.mbridgeVideoView.setDialogRole(getJSCommon() != null ? getJSCommon().h() : 1);
        }
        this.e.setCampaign(this.z);
        this.e.addOrderViewData(this.R);
        this.e.setUnitID(this.j);
        this.e.setCloseDelayTime(i());
        this.e.setPlayCloseBtnTm(this.l.h());
        this.e.setVideoInteractiveType(this.l.g());
        this.e.setEndscreenType(this.l.q());
        this.e.setVideoSkipTime(i3);
        this.e.setShowingTransparent(this.af);
        this.e.setJSFactory(this.G);
        if (this.z.getPlayable_ads_without_video() == 2) {
            this.e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.z, this.A, this.n, b(), this.j, new d(), this.l.y(), this.v));
            this.e.preLoadData(this.G);
            this.e.showPlayableView();
        } else {
            this.e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.c(this.G, this.z, this.n, this.A, b(), this.j, new c(this.i, this.z), this.l.y(), this.v));
            this.e.preLoadData(this.G);
            this.mbridgeVideoView.preLoadData(this.G);
        }
        if (this.af) {
            this.e.setMBridgeClickMiniCardViewTransparent();
        }
    }

    static /* synthetic */ void p(MBTempContainer mBTempContainer) {
        try {
            if (mBTempContainer.C != null) {
                if (mBTempContainer.q && (mBTempContainer.s == com.mbridge.msdk.foundation.same.a.G || mBTempContainer.s == com.mbridge.msdk.foundation.same.a.H)) {
                    com.mbridge.msdk.video.bt.module.a.b bVar = mBTempContainer.C;
                    boolean z = true;
                    if (mBTempContainer.I != 1) {
                        z = false;
                    }
                    bVar.a(z, mBTempContainer.H);
                }
                mBTempContainer.C.a(mBTempContainer.F, mBTempContainer.ac, mBTempContainer.n);
                return;
            }
            if (mBTempContainer.i != null) {
                mBTempContainer.i.finish();
            }
        } catch (Exception unused) {
            if (mBTempContainer.i != null) {
                mBTempContainer.i.finish();
            }
        }
    }

    static /* synthetic */ void N(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.8
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setBackgroundColor(0);
                    MBTempContainer.this.aa.setVisibility(0);
                    MBTempContainer.this.aa.bringToFront();
                }
            });
        }
    }

    static /* synthetic */ void P(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.9
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            });
        }
    }
}
