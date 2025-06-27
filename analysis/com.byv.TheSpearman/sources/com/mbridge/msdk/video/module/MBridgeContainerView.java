package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.video.dynview.moffer.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.a.a.g;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.module.a.a.k;
import com.mbridge.msdk.video.module.a.a.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private String Q;
    private b R;
    private boolean S;
    private boolean T;
    private List<CampaignEx> U;
    private MBridgePlayableView n;
    private MBridgeClickCTAView o;
    private MBridgeClickMiniCardView p;
    private MBridgeNativeEndCardView q;
    private MBridgeH5EndCardView r;
    private MBridgeVastEndCardView s;
    private MBridgeLandingPageView t;
    private MBridgeVideoEndCoverView u;
    private MBridgeAlertWebview v;
    private MBridgeOrderCampView w;
    private String x;
    private int y;
    private int z;

    public void setJSFactory(b bVar) {
        this.R = bVar;
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.U = list;
    }

    public int getVideoSkipTime() {
        return this.I;
    }

    public void setVideoSkipTime(int i) {
        this.I = i;
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.z = 1;
        this.A = 1;
        this.B = 1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.H = false;
        this.J = false;
        this.K = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = 1;
        this.A = 1;
        this.B = 1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.H = false;
        this.J = false;
        this.K = false;
        this.S = false;
        this.T = false;
        this.U = new ArrayList();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.R = bVar;
        if (this.b != null) {
            if (this.b.getPlayable_ads_without_video() != 2) {
                b(this.y);
                if (this.b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.b.getendcard_url())) {
                        try {
                            String strA = ao.a(this.b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                a.a().a(this.b, 2);
                            }
                        } catch (Exception e) {
                            ad.b(MBridgeBaseView.TAG, e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            } else {
                if (this.n == null) {
                    this.n = new MBridgePlayableView(this.f3680a);
                }
                this.n.setCloseDelayShowTime(this.A);
                this.n.setPlayCloseBtnTm(this.B);
                this.n.setCampaign(this.b);
                this.n.setNotifyListener(new i(this.e) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i, Object obj) {
                        super.a(i, obj);
                        if (i == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.b.getRequestId());
                            nVar.g(MBridgeContainerView.this.b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.b.getId());
                            nVar.d(MBridgeContainerView.this.b.isMraid() ? n.f2819a : n.b);
                            com.mbridge.msdk.foundation.same.report.h.d(nVar, MBridgeContainerView.this.f3680a, MBridgeContainerView.this.x);
                        }
                    }
                });
                this.n.preLoadData(bVar);
            }
            g();
        }
    }

    public void showPlayableView() {
        if (this.b == null || this.H) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.n == null) {
            preLoadData(this.R);
        }
        addView(this.n);
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.x);
            if (this.b != null && this.b.isMraid() && this.b.getPlayable_ads_without_video() == 2) {
                this.n.setCloseVisible(0);
            }
            this.n.setNotchValue(this.Q, this.L, this.M, this.N, this.O);
        }
        this.T = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.T) {
            removeAllViews();
            bringToFront();
            this.S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.v == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.v;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.v);
        }
        addView(this.v);
        setBackgroundColor(0);
        this.v.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i) {
        if (this.b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                h();
                return;
            }
            if (i == 1) {
                if (this.C) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.p);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.o;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        if (this.b != null && this.b.getPlayable_ads_without_video() == 1) {
                            this.T = true;
                            if (this.o == null) {
                                b(-1);
                            }
                            if (this.o != null && (this.b == null || !this.b.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.o;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.o);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.v;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.p;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        if (this.b != null && this.b.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            f();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (miniCardLoaded()) {
                    MBridgeH5EndCardView mBridgeH5EndCardView2 = this.r;
                    if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                        removeView(this.r);
                    }
                    this.e.a(112, "");
                    if (this.b != null && !this.b.isHasReportAdTrackPause()) {
                        this.b.setHasReportAdTrackPause(true);
                        com.mbridge.msdk.video.module.b.b.f(this.f3680a, this.b);
                    }
                    if (this.E) {
                        this.e.a(115, "");
                    } else {
                        this.T = true;
                        bringToFront();
                        webviewshow();
                        onConfigurationChanged(getResources().getConfiguration());
                    }
                    this.D = true;
                    return;
                }
                h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i) {
        if (this.b != null) {
            if (i == 1) {
                this.e.a(104, "");
            } else if (i == 100) {
                if (this.b.getPlayable_ads_without_video() == 2) {
                    this.H = true;
                }
                a(this.n);
                setMatchParent();
                e();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.s == null) {
                    a(this.R, 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.s, layoutParams);
                this.s.notifyShowListener();
                this.T = true;
                bringToFront();
            } else if (i == 4) {
                this.e.a(113, "");
                removeAllViews();
                setMatchParent();
                if (this.t == null) {
                    a(this.R, 4);
                }
                this.t.setUnitId(this.x);
                this.t.preLoadData(this.R);
                addView(this.t);
                this.T = true;
                bringToFront();
            } else if (i == 5) {
                this.e.a(106, "");
            } else {
                removeAllViews();
                setMatchParent();
                this.T = true;
                bringToFront();
                a();
                this.e.a(117, "");
            }
        }
        this.C = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.u;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.R;
            this.R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f3680a);
                this.u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.b);
                this.u.setNotifyListener(new i(this.e));
                this.u.preLoadData(bVar);
            }
        }
        addView(this.u);
        onConfigurationChanged(getResources().getConfiguration());
        this.T = true;
        bringToFront();
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f3680a);
        this.w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.U);
        if (this.e != null && (this.e instanceof k)) {
            ((k) this.e).a(this.U);
        }
        this.w.setNotifyListener(new i(this.e));
        this.w.setRewarded(this.K);
        this.w.setNotchPadding(this.L, this.M, this.N, this.O);
        this.w.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                if (MBridgeContainerView.this.e != null) {
                    MBridgeContainerView.this.e.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.b.getVideo_end_type());
                }
            }
        });
        this.w.createView(this);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.D;
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.b != null) {
            this.e.a(122, "");
            this.e.a(104, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.J) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.p.setRadius(i5);
            this.p.setCloseVisible(8);
            this.p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            f();
            if (this.G) {
                return;
            }
            this.G = true;
            this.e.a(109, "");
            this.e.a(117, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.p.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.T = true;
            bringToFront();
            f();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.p.resizeMiniCard(i, i2);
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.n, this.p, this.r, this.v};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    public void install(CampaignEx campaignEx) {
        this.e.a(105, campaignEx);
    }

    public void orientation(Configuration configuration) throws JSONException {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.n, this.p, this.r, this.v};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new g(this.p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public void setShowingTransparent(boolean z) {
        this.E = z;
    }

    public boolean getShowingTransparent() {
        return this.E;
    }

    public String getUnitID() {
        return this.x;
    }

    public void setUnitID(String str) {
        this.x = str;
    }

    public void setVideoInteractiveType(int i) {
        if (this.b != null && this.b.isDynamicView()) {
            int iA = com.mbridge.msdk.video.dynview.i.a.a(this.b);
            if (iA == 100) {
                this.y = i;
                return;
            } else {
                this.y = iA;
                return;
            }
        }
        this.y = i;
    }

    public void setEndscreenType(int i) {
        this.z = i;
    }

    public int getVideoInteractiveType() {
        return this.y;
    }

    public void setCloseDelayTime(int i) {
        this.A = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.B = i;
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    private void a() {
        if (this.b != null) {
            boolean zIsDynamicView = this.b.isDynamicView();
            boolean zL = ai.l(this.b.getendcard_url());
            if (zIsDynamicView && !zL && !this.b.isMraid()) {
                e();
                return;
            }
        }
        if (this.z == 2 && !this.J) {
            b();
        } else {
            e();
        }
    }

    private void b() {
        if (this.r == null) {
            a(this.R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.J = true;
            addView(this.r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.r.excuteTask();
            this.r.setNotchValue(this.Q, this.L, this.M, this.N, this.O);
            n nVar = new n();
            nVar.f(this.b.getRequestId());
            nVar.g(this.b.getRequestIdNotice());
            nVar.e(this.b.getId());
            nVar.d(this.b.isMraid() ? n.f2819a : n.b);
            com.mbridge.msdk.foundation.same.report.h.d(nVar, this.f3680a, this.x);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.r.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.x);
        }
    }

    private void e() {
        this.z = 1;
        if (this.q == null) {
            a(this.R, 2);
        }
        addView(this.q);
        onConfigurationChanged(getResources().getConfiguration());
        this.q.notifyShowListener();
        this.T = true;
        bringToFront();
    }

    private void f() {
        if (this.p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.E && this.F) {
            this.F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.p, layoutParams);
    }

    private void g() {
        if (this.v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f3680a);
            this.v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.x);
            this.v.setCampaign(this.b);
        }
        this.v.preLoadData(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        this.R = bVar;
        if (this.b != null) {
            if (num == null) {
                num = Integer.valueOf(this.b.getVideo_end_type());
            }
            if (!isLast()) {
                h();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.s == null) {
                        this.s = new MBridgeVastEndCardView(this.f3680a);
                    }
                    this.s.setCampaign(this.b);
                    this.s.setNotifyListener(new l(this.e));
                    this.s.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.t == null) {
                        this.t = new MBridgeLandingPageView(this.f3680a);
                    }
                    this.t.setCampaign(this.b);
                    this.t.setNotifyListener(new i(this.e));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.z == 2) {
                        boolean zIsDynamicView = this.b.isDynamicView();
                        boolean zL = ai.l(this.b.getendcard_url());
                        if ((!zIsDynamicView || zL || this.b == null || this.b.isMraid()) && this.b.getAdSpaceT() != 2) {
                            if (this.r == null) {
                                this.r = new MBridgeH5EndCardView(this.f3680a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.b.getDynamicTempCode() == 5 && this.e != null && (this.e instanceof k)) {
                                ((k) this.e).a(this.b);
                            }
                            this.r.setCampaign(this.b);
                            this.r.setCloseDelayShowTime(this.A);
                            this.r.setNotifyListener(new i(this.e));
                            this.r.setUnitId(this.x);
                            this.r.setNotchValue(this.Q, this.L, this.M, this.N, this.O);
                            this.r.preLoadData(bVar);
                            if (this.E) {
                                return;
                            }
                            addView(this.r);
                            return;
                        }
                        return;
                    }
                    int iB = (this.b == null || this.b.getRewardTemplateMode() == null) ? 0 : this.b.getRewardTemplateMode().b();
                    if (this.q == null) {
                        if (this.b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f3680a, null, false, -1, this.b.getAdSpaceT() == 2, iB, this.b.getMof_tplid());
                            this.q = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.b);
                        }
                    }
                    this.q.setLayout();
                    if (this.b.isDynamicView()) {
                        if (a.a().a(this.b.getRequestId() + "_" + this.b.getId())) {
                            try {
                                a.a().a(this.q, this.b.getRequestId() + "_" + this.b.getId(), new i(this.e));
                            } catch (Exception e) {
                                ad.b(MBridgeBaseView.TAG, e.getMessage());
                            }
                        } else {
                            try {
                                String strA = ao.a(this.b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    a.a().a(this.b, this.q, new i(this.e), 2);
                                }
                            } catch (Exception e2) {
                                ad.b(MBridgeBaseView.TAG, e2.getMessage());
                            }
                        }
                    }
                    this.q.setUnitId(this.x);
                    this.q.setCloseBtnDelay(this.A);
                    this.q.setNotifyListener(new i(this.e));
                    this.q.preLoadData(bVar);
                    this.q.setNotchPadding(this.L, this.M, this.N, this.O);
                }
            }
        }
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    private void h() {
        this.D = false;
        this.T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof MBridgeContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void b(int i) {
        if (i != -3) {
            if (i == -2) {
                if (this.b == null || this.b.getVideo_end_type() != 2) {
                    return;
                }
                if (this.p == null) {
                    this.p = new MBridgeClickMiniCardView(this.f3680a);
                }
                this.p.setCampaign(this.b);
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
                mBridgeClickMiniCardView.setNotifyListener(new g(mBridgeClickMiniCardView, this.e));
                this.p.preLoadData(this.R);
                setMatchParent();
                f();
                h();
                return;
            }
            if (this.o == null) {
                this.o = new MBridgeClickCTAView(this.f3680a);
            }
            this.o.setCampaign(this.b);
            this.o.setUnitId(this.x);
            this.o.setNotifyListener(new i(this.e));
            this.o.preLoadData(this.R);
        }
    }

    public CampaignEx getReSetCampaign() {
        if (!this.b.isDynamicView() || !TextUtils.isEmpty(this.b.getendcard_url())) {
            return null;
        }
        int size = this.U.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.U.get(i2) != null && this.U.get(i2).getId() == this.b.getId()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.U.get(i) == null) {
            return null;
        }
        return this.U.get(i);
    }

    private void i() {
        if (this.b == null) {
            return;
        }
        String str = this.b.getendcard_url();
        int i = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(ao.a(str, "ecid"));
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        this.q = new MBridgeNativeEndCardView(this.f3680a, null, true, i, this.b.getAdSpaceT() == 2, this.l, this.b.getMof_tplid());
        if (this.b.getDynamicTempCode() == 5) {
            if (this.e != null && (this.e instanceof k)) {
                ((k) this.e).a(this.b);
            }
            this.q.setCampaign(this.b);
            return;
        }
        this.q.setCampaign(this.b);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.D) {
            this.e.a(107, "");
        }
    }

    public void onEndcardBackPress() {
        if (this.q != null || this.s != null) {
            this.e.a(104, "");
            try {
                a.a().b();
                return;
            } catch (Exception e) {
                ad.b(MBridgeBaseView.TAG, e.getMessage());
                return;
            }
        }
        if (this.t != null) {
            this.e.a(103, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.q.release();
        }
        if (this.e != null) {
            this.e = null;
        }
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        return mBridgeH5EndCardView == null ? this.n : mBridgeH5EndCardView;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.S && !this.T) {
            h();
            this.S = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.v;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.v);
        MBridgeClickCTAView mBridgeClickCTAView = this.o;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.e.a(103, str);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.P = i;
        this.L = i2;
        this.M = i3;
        this.N = i4;
        this.O = i5;
        this.Q = r.a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.q != null) {
            this.r.setNotchValue(this.Q, i2, i3, i4, i5);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.r.q, "oncutoutfetched", Base64.encodeToString(this.Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.n;
        if (mBridgePlayableView != null && mBridgePlayableView.q != null) {
            this.n.setNotchValue(this.Q, i2, i3, i4, i5);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.n.q, "oncutoutfetched", Base64.encodeToString(this.Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setRewardStatus(boolean z) {
        this.K = z;
    }
}
