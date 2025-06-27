package com.mbridge.msdk.splash.c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseSplashShowManager.java */
/* loaded from: classes4.dex */
public class b {
    protected MBSplashView b;
    protected com.mbridge.msdk.splash.d.d c;
    protected com.mbridge.msdk.click.a d;
    protected String e;
    protected MBridgeIds f;
    protected String h;
    protected String i;
    protected String j;
    protected String k;
    protected boolean l;
    protected Context m;
    private CampaignEx q;
    private boolean r;
    private TextView s;
    private View t;
    private String u;
    private boolean v;
    private ImageView w;
    private a x;

    /* renamed from: a, reason: collision with root package name */
    protected final String f3474a = "SplashShowManager";
    protected int g = 5;
    protected boolean n = true;
    private View.OnClickListener y = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws JSONException {
            if (b.this.r) {
                b.this.b(1);
                b.a(b.this, -1);
            }
        }
    };
    public Handler o = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) throws JSONException {
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i != 2 || b.this.q == null || !b.this.q.isActiveOm() || b.this.b == null || (splashWebview = b.this.b.getSplashWebview()) == null) {
                    return;
                }
                try {
                    AdSession adSession = splashWebview.getAdSession();
                    if (adSession != null) {
                        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                        adEventsCreateAdEvents.loaded();
                        adEventsCreateAdEvents.impressionOccurred();
                    }
                    ad.a("OMSDK", "adSession.impressionOccurred()");
                    return;
                } catch (Throwable th) {
                    ad.a("OMSDK", th.getMessage());
                    if (b.this.q != null) {
                        String requestId = b.this.q.getRequestId();
                        String requestIdNotice = b.this.q.getRequestIdNotice();
                        String id = b.this.q.getId();
                        new i(splashWebview.getContext()).a(requestId, requestIdNotice, id, b.this.e, "fetch OM failed, exception" + th.getMessage());
                        return;
                    }
                    return;
                }
            }
            if (!b.this.v) {
                b.this.f();
            }
            if (b.this.g > 0) {
                if (!com.mbridge.msdk.foundation.d.b.c && !b.this.l) {
                    b.this.g--;
                    b bVar = b.this;
                    b.a(bVar, bVar.g);
                    if (!b.this.n) {
                        b.this.c();
                    }
                } else {
                    b.this.d();
                }
                b.this.o.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            b.this.b(2);
        }
    };
    protected com.mbridge.msdk.click.i p = new com.mbridge.msdk.click.i() { // from class: com.mbridge.msdk.splash.c.b.4
        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            ah.b(campaign, b.this.b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.b);
        }
    };

    public void a(CampaignEx campaignEx, boolean z, String str) {
    }

    public b(Context context, String str, String str2) throws Resources.NotFoundException {
        this.h = "点击跳过|";
        this.i = "点击跳过|";
        this.j = "秒";
        this.k = "秒后自动关闭";
        this.e = str2;
        this.u = str;
        this.f = new MBridgeIds(this.u, str2);
        this.m = context;
        if (this.s == null) {
            TextView textView = new TextView(context);
            this.s = textView;
            textView.setGravity(1);
            this.s.setTextIsSelectable(false);
            this.s.setPadding(ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.s.getLayoutParams();
            this.s.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(ai.a(context, 100.0f), ai.a(context, 50.0f)) : layoutParams);
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            if (contextC != null) {
                String strG = com.mbridge.msdk.foundation.controller.c.m().g();
                int identifier = contextC.getResources().getIdentifier("mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING, strG);
                int identifier2 = contextC.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING, strG);
                int identifier3 = contextC.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING, strG);
                this.i = contextC.getResources().getString(identifier);
                String string = contextC.getResources().getString(identifier2);
                this.k = string;
                this.h = string;
                this.j = contextC.getResources().getString(identifier3);
                this.s.setBackgroundResource(contextC.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
                this.s.setTextColor(contextC.getResources().getColor(contextC.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strG)));
            }
        }
    }

    public final void a(com.mbridge.msdk.splash.d.d dVar) {
        this.c = dVar;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.y);
        }
        this.t = viewGroup;
    }

    /* compiled from: BaseSplashShowManager.java */
    private class a implements com.mbridge.msdk.splash.d.a {
        private a() {
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i) {
            if (b.this.b != null) {
                b.this.b.changeCloseBtnState(i);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(Object obj, String str) {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(CampaignEx campaignEx) {
            b.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void b(int i) {
            ad.b("SplashShowManager", "resetCountdown" + i);
            b.this.g = i;
            b.this.o.removeMessages(1);
            b.this.o.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(boolean z) {
            if (z) {
                b.this.o.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(boolean z, String str) {
            try {
                if (b.this.c != null) {
                    if (TextUtils.isEmpty(str)) {
                        b.this.c.b(b.this.f);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.q));
                        campaignWithBackData.setClickURL(str);
                        b.this.a(campaignWithBackData, true, str);
                    }
                }
            } catch (Exception e) {
                ad.b("SplashShowManager", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i, int i2) {
            if (i == 1) {
                b.this.o.removeMessages(1);
            }
            if (i == 2) {
                b.this.g = i2;
                b.this.o.removeMessages(1);
                b.this.o.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        MBSplashView mBSplashView2;
        MBSplashView mBSplashView3;
        Context context;
        MBSplashWebview splashWebview;
        a(this.r);
        this.q = campaignEx;
        this.b = mBSplashView;
        com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), this.u, this.e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.g);
        splashSignalCommunicationImpl.a(this.r ? 1 : 0);
        RelativeLayout.LayoutParams layoutParams = null;
        Object[] objArr = 0;
        if (this.x == null) {
            this.x = new a();
        }
        splashSignalCommunicationImpl.a(this.x);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.t;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.s.setVisibility(8);
            }
            g();
            a(this.s);
            mBSplashView.setCloseView(this.s);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.t);
            mBSplashView.setCloseView(this.t);
        }
        mBSplashView.show();
        CampaignEx campaignEx2 = this.q;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.a.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), splashWebview, splashWebview.getUrl(), this.q);
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(splashWebview);
                    adSessionA.start();
                }
                ad.a("OMSDK", "adSession.start()");
            } catch (Throwable th) {
                ad.a("OMSDK", th.getMessage());
                CampaignEx campaignEx3 = this.q;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.q.getRequestIdNotice();
                    String id = this.q.getId();
                    new i(splashWebview.getContext()).a(requestId, requestIdNotice, id, this.e, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        d.a(this.e);
        this.o.removeMessages(1);
        this.o.sendEmptyMessageDelayed(1, 1000L);
        this.o.sendEmptyMessageDelayed(2, 1000L);
        CampaignEx campaignEx4 = this.q;
        if (campaignEx4 != null) {
            if ((campaignEx4.getPrivacyButtonTemplateVisibility() == 1) && (mBSplashView3 = this.b) != null && mBSplashView3.getSplashWebview() != null && !this.b.isDynamicView() && this.q.isMraid() && (context = this.b.getContext()) != null) {
                try {
                    int iA = v.a(context, "mbridge_splash_notice", "drawable");
                    int iA2 = ai.a(context, 35.0f);
                    int iA3 = ai.a(context, 9.0f);
                    ImageView imageView = new ImageView(context);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA2, iA2);
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(10);
                    layoutParams2.setMargins(iA3, iA3, iA3, iA3);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setBackgroundResource(iA);
                    ai.a(3, imageView, this.q, context, true, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.7
                        @Override // com.mbridge.msdk.foundation.d.a
                        public final void a() {
                            b.this.d();
                        }

                        @Override // com.mbridge.msdk.foundation.d.a
                        public final void b() {
                            b.this.c();
                        }

                        @Override // com.mbridge.msdk.foundation.d.a
                        public final void a(String str) {
                            b.this.c();
                        }
                    });
                    this.b.addView(imageView);
                } catch (Throwable th2) {
                    ad.b("SplashShowManager", th2.getMessage());
                }
            }
        }
        if (!this.q.isMraid()) {
            CampaignEx campaignEx5 = this.q;
            if (campaignEx5 != null) {
                campaignEx5.setCampaignUnitId(this.e);
                com.mbridge.msdk.foundation.d.b.a().a(this.e, 3);
                com.mbridge.msdk.foundation.d.b.a().a(this.e, this.q);
            }
            if (com.mbridge.msdk.foundation.d.b.a().b() && ((mBSplashView2 = this.b) == null || !mBSplashView2.isDynamicView())) {
                com.mbridge.msdk.foundation.d.b.a().a(this.e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.3
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String string;
                        b.this.d();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put("status", 1);
                            }
                            string = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.a("SplashShowManager", th3.getMessage(), th3);
                            string = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String string;
                        b.this.c();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put("status", 2);
                            }
                            string = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.a("SplashShowManager", th3.getMessage(), th3);
                            string = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String string;
                        b.this.c();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put("status", 2);
                            }
                            string = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.a("SplashShowManager", th3.getMessage(), th3);
                            string = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                    }
                });
                FeedBackButton feedBackButtonB = com.mbridge.msdk.foundation.d.b.a().b(this.e);
                if (feedBackButtonB != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonB.getLayoutParams();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f2780a);
                    }
                    layoutParams.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                    layoutParams.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonB.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonB);
                    }
                    MBSplashView mBSplashView4 = this.b;
                    if (mBSplashView4 != null) {
                        mBSplashView4.addView(feedBackButtonB, layoutParams);
                    }
                }
            }
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.q.getMaitve(), this.q.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.e, this.q.getAdType());
            if (bitmapDrawableA != null) {
                if (this.w == null) {
                    this.w = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (this.w.getVisibility() != 0) {
                    this.w.setVisibility(0);
                }
                ai.a(this.w, bitmapDrawableA, mBSplashView.getResources().getDisplayMetrics());
                if (this.w.getParent() == null) {
                    mBSplashView.addView(this.w, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String a() {
        CampaignEx campaignEx = this.q;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.q.getRequestId();
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.q;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        MBSplashView mBSplashView;
        if (this.q == null) {
            return;
        }
        boolean z = true;
        this.v = true;
        if (this.c != null && (mBSplashView = this.b) != null) {
            if (mBSplashView.getContext() != null && (this.b.getContext() instanceof Activity) && ((Activity) this.b.getContext()).isFinishing()) {
                this.c.a(this.f, "Activity is finishing");
                return;
            } else if (this.b.isShown()) {
                this.c.a(this.f);
            } else {
                this.c.a(this.f, "SplashView or container is not visibility");
            }
        }
        if (!this.q.isReport()) {
            MBSplashView mBSplashView2 = this.b;
            if (mBSplashView2 != null && !mBSplashView2.isDynamicView()) {
                CampaignEx campaignEx = this.q;
                if (campaignEx.isHasMBTplMark()) {
                    z = false;
                } else {
                    c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                    campaignEx.setReport(true);
                    com.mbridge.msdk.foundation.same.a.d.a(this.e, campaignEx, "splash");
                }
                if (z) {
                    b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                    a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                }
            } else {
                CampaignEx campaignEx2 = this.q;
                b(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                c(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                a(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
                campaignEx2.setReport(true);
                com.mbridge.msdk.foundation.same.a.d.a(this.e, campaignEx2, "splash");
            }
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx3 = this.q;
            String str = this.e;
            if (campaignEx3 != null) {
                try {
                    if (campaignEx3.isMraid()) {
                        n nVar = new n();
                        nVar.f(campaignEx3.getRequestId());
                        nVar.g(campaignEx3.getRequestIdNotice());
                        nVar.e(campaignEx3.getId());
                        nVar.d(campaignEx3.isMraid() ? n.f2819a : n.b);
                        h.d(nVar, contextC.getApplicationContext(), str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void a(boolean z) {
        this.r = z;
        if (z) {
            this.h = this.i;
        } else {
            this.h = this.k;
        }
    }

    protected final void b(CampaignEx campaignEx, boolean z, String str) {
        if (this.d == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
            this.d = aVar;
            aVar.a(this.p);
        }
        campaignEx.setCampaignUnitId(this.e);
        this.d.a(campaignEx);
        if (!this.q.isReportClick()) {
            this.q.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
        }
        com.mbridge.msdk.splash.d.d dVar = this.c;
        if (dVar != null) {
            dVar.b(this.f);
            b(3);
        }
        if (!z || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.e;
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str) || !campaignEx.isMraid()) {
                    return;
                }
                new i(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2, str, campaignEx.isBidCampaign());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void g() {
        String str;
        if (this.r) {
            str = this.i + this.g + this.j;
        } else {
            str = this.g + this.k;
        }
        this.s.setText(str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.y);
        }
    }

    protected final void b(final int i) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.o != null && (campaignEx = this.q) != null && campaignEx.isActiveOm()) {
            this.o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.c.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c(i);
                }
            }, 1500L);
        } else {
            c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        com.mbridge.msdk.splash.a.c cVarA;
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.d.d dVar = this.c;
            if (dVar != null) {
                dVar.a(this.f, i);
                this.c = null;
                com.mbridge.msdk.splash.e.a.a(this.e, this.q);
            }
            ImageView imageView = this.w;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.b) != null) {
                mBSplashView.removeView(this.w);
                this.w.setVisibility(8);
            }
            this.v = false;
            if (this.q != null) {
                cVarA = com.mbridge.msdk.splash.a.c.a().b(this.e).d(this.q.getRequestId()).g(this.q.getRequestIdNotice()).c(this.q.getId()).e(this.q.getCreativeId() + "").a(this.q.isBidCampaign());
            } else {
                cVarA = null;
            }
            com.mbridge.msdk.splash.e.a.a(cVarA, this.e, i);
            Handler handler = this.o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e) {
            ad.b("SplashShowManager", e.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b("SplashShowManager", th.getMessage());
            }
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.h);
            } catch (Throwable th) {
                ad.b("SplashShowManager", th.getMessage());
            }
        }
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.m().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.c.b.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k.a(com.mbridge.msdk.foundation.db.h.a(context)).a(campaignEx.getId());
                    } catch (Exception unused) {
                        ad.b("SplashShowManager", "campain can't insert db");
                    }
                }
            }).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public final void c() {
        MBSplashView mBSplashView;
        Handler handler;
        this.n = true;
        if (this.b != null && this.g > 0 && (handler = this.o) != null) {
            handler.removeMessages(1);
            this.o.sendEmptyMessageDelayed(1, 1000L);
        }
        if (com.mbridge.msdk.foundation.d.b.c || (mBSplashView = this.b) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview = this.b.getSplashWebview();
        if (splashWebview == null || splashWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
    }

    public final void d() {
        Handler handler;
        this.n = false;
        if (this.b != null && this.g > 0 && (handler = this.o) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
        }
    }

    public final void e() {
        if (this.c != null) {
            this.c = null;
        }
        if (this.x != null) {
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.e);
    }

    static /* synthetic */ void a(b bVar, int i) throws JSONException {
        MBSplashView mBSplashView = bVar.b;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i);
            if (bVar.b.getSplashSignalCommunicationImpl() != null) {
                bVar.b.getSplashSignalCommunicationImpl().c(i);
            }
        }
        if (i < 0) {
            bVar.g = i;
            return;
        }
        com.mbridge.msdk.splash.d.d dVar = bVar.c;
        if (dVar != null) {
            dVar.a(bVar.f, i * 1000);
        }
        if (bVar.t == null) {
            bVar.g();
        }
    }
}
