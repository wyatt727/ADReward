package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3586a = "MBridgeBTContainer";
    private boolean A;
    private String B;
    private boolean C;
    private List<CampaignEx> D;
    private List<com.mbridge.msdk.videocommon.download.a> E;
    private com.mbridge.msdk.video.bt.module.a.a F;
    private h G;
    private h H;
    private com.mbridge.msdk.video.bt.module.a.b I;
    private String J;
    private String K;
    private String L;
    private boolean M;
    private int N;
    private String O;
    private d P;
    private com.mbridge.msdk.foundation.same.report.d.b Q;
    private AdSession R;
    private MediaEvents S;
    private AdEvents T;
    private int b;
    private int c;
    private FrameLayout d;
    private MBridgeBTLayout e;
    private WindVaneWebView f;
    private LayoutInflater g;
    private Context h;
    private TextView x;
    private ImageView y;
    private boolean z;

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
    }

    public AdEvents getAdEvents() {
        return this.T;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.T = adEvents;
    }

    public AdSession getAdSession() {
        return this.R;
    }

    public void setAdSession(AdSession adSession) {
        this.R = adSession;
    }

    public MediaEvents getVideoEvents() {
        return this.S;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.S = mediaEvents;
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.b = 0;
        this.c = 1;
        this.z = false;
        this.A = true;
        this.C = false;
        this.R = null;
        this.S = null;
        this.T = null;
        init(context);
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 1;
        this.z = false;
        this.A = true;
        this.C = false;
        this.R = null;
        this.S = null;
        this.T = null;
        init(context);
    }

    public void init(Context context) {
        this.h = context;
        this.g = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(boolean z) {
        String cMPTEntryUrl;
        WindVaneWebView windVaneWebViewA;
        CampaignEx campaignEx;
        try {
            int iFindLayout = findLayout("mbridge_bt_container");
            if (iFindLayout < 0) {
                a("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.g.inflate(iFindLayout, this);
            this.d = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.K = "";
            List<CampaignEx> list = this.D;
            if (list == null || list.size() <= 0) {
                cMPTEntryUrl = "";
            } else {
                CampaignEx campaignEx2 = this.D.get(0);
                cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                this.K = campaignEx2.getRequestId();
                this.L = campaignEx2.getCurrentLocalRid();
            }
            a.C0310a c0310aA = com.mbridge.msdk.videocommon.a.a(this.j + "_" + this.K + "_" + cMPTEntryUrl);
            RelativeLayout.LayoutParams layoutParams = null;
            if (c0310aA != null) {
                this.B = c0310aA.b();
                ad.a(f3586a, "get BT wraper.getTag = " + this.B);
                c0310aA.a("");
                windVaneWebViewA = c0310aA.a();
            } else {
                windVaneWebViewA = null;
            }
            this.f = windVaneWebViewA;
            com.mbridge.msdk.videocommon.a.b(this.j + "_" + this.K + "_" + cMPTEntryUrl);
            AdSession adSession = this.R;
            if (adSession != null) {
                try {
                    adSession.registerAdView(this);
                    this.R.start();
                    ad.a("omsdk", "btc:  adSession.start();");
                    if (this.T != null) {
                        ad.a("omsdk", "btc:   adEvents.loaded");
                        this.T.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                        ad.a("omsdk", "btc:   adEvents.impressionOccurred");
                        this.T.impressionOccurred();
                    }
                } catch (Exception e) {
                    ad.a("omsdk", e.getMessage());
                }
            }
            if (this.f != null) {
                com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this.i, this, this.f);
                registerJsFactory(bVar);
                this.f.setApiManagerJSFactory(bVar);
                if (this.f.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.f.getObject() instanceof k) {
                    bVar.a((k) this.f.getObject());
                    if (this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(getContext()));
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.n.a());
                            jSONObject2.put("amount", this.n.b());
                            jSONObject2.put("id", this.o);
                            jSONObject.put("userId", this.m);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.p);
                            jSONObject.put("extra", this.O);
                        } catch (JSONException e2) {
                            ad.a(f3586a, e2.getMessage());
                        } catch (Exception e3) {
                            ad.a(f3586a, e3.getMessage());
                        }
                        this.H = new com.mbridge.msdk.video.bt.module.b.c(c(), "");
                        String string = jSONObject.toString();
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 1);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.D, dVar);
                        } catch (Exception unused) {
                        }
                        getJSNotifyProxy().a(string);
                        getJSCommon().b(true);
                        getJSCommon().a(new b());
                    }
                    ((com.mbridge.msdk.video.signal.a.d) getJSCommon()).m.a();
                }
                this.f.setBackgroundColor(0);
                LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
                if (linkedHashMapB != null && linkedHashMapB.containsKey(this.B)) {
                    View view = linkedHashMapB.get(this.B);
                    if (view instanceof MBridgeBTLayout) {
                        MBridgeBTLayout mBridgeBTLayout = (MBridgeBTLayout) view;
                        this.e = mBridgeBTLayout;
                        try {
                            WindVaneWebView windVaneWebView = (WindVaneWebView) mBridgeBTLayout.getBtWebView();
                            k kVar = (k) windVaneWebView.getObject();
                            kVar.a(this.T);
                            kVar.a(this.S);
                            kVar.a(this.R);
                            windVaneWebView.setObject(kVar);
                        } catch (Exception e4) {
                            ad.b(f3586a, e4.getMessage());
                        }
                        com.mbridge.msdk.foundation.d.b.a().a(this.j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.1
                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a() {
                                String string2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject3.put("status", 1);
                                    }
                                    string2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f3586a, th.getMessage(), th);
                                    string2 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void b() {
                                String string2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    string2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f3586a, th.getMessage(), th);
                                    string2 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a(String str) {
                                String string2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    string2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    ad.a(MBridgeBTContainer.f3586a, th.getMessage(), th);
                                    string2 = "";
                                }
                                g.a().a((WebView) MBridgeBTContainer.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string2.getBytes(), 2));
                            }
                        });
                        this.e.addView(this.f, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.mbridge.msdk.foundation.d.b.a().c(this.j + "_2");
                        FeedBackButton feedBackButtonB = com.mbridge.msdk.foundation.d.b.a().b(this.j + "_1");
                        if (com.mbridge.msdk.foundation.d.b.a().b() && feedBackButtonB != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) feedBackButtonB.getLayoutParams();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f2780a);
                            }
                            layoutParams.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            layoutParams.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            feedBackButtonB.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) feedBackButtonB.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(feedBackButtonB);
                            }
                            this.e.addView(feedBackButtonB);
                        }
                        this.e.setTag(this.B);
                        linkedHashMapB.put(this.B, this.e);
                        Iterator<View> it = linkedHashMapB.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTRootLayout) {
                                MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) next;
                                this.J = mBridgeBTRootLayout.getInstanceId();
                                this.d.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        linkedHashMapB.remove(this.J);
                        linkedHashMapB.put(this.J, this);
                    }
                    com.mbridge.msdk.video.bt.a.d.c().a(this.j, this.p);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.B, this.K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.J, this.K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.j + "_" + this.K, this.i);
                    try {
                        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.D, getContext().getApplicationContext(), this.j, this.k));
                    } catch (Throwable unused2) {
                        ad.a(f3586a, "remove campaign failed");
                    }
                    List<CampaignEx> list2 = this.D;
                    if (list2 == null || list2.size() <= 0) {
                        return;
                    }
                    a(this.l, this.D.get(0));
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<CampaignEx> list3 = this.D;
            if (list3 != null && list3.size() > 0 && (campaignEx = this.D.get(0)) != null && (z || campaignEx.isDynamicView())) {
                Context context = this.h;
                if (this.P == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap map = new HashMap();
                map.put("choice_one_callback", this.P);
                com.mbridge.msdk.video.dynview.b.a();
                new com.mbridge.msdk.video.dynview.h.a(context, this.D, new com.mbridge.msdk.video.dynview.e.g() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.2
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                        CampaignEx campaignEx3;
                        String str;
                        if (aVar != null) {
                            if (MBridgeBTContainer.this.d != null && aVar.a() != null) {
                                MBridgeBTContainer.this.d.removeAllViews();
                                MBridgeBTContainer.this.d.addView(aVar.a());
                                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                                mBridgeBTContainer.x = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                                mBridgeBTContainer2.y = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                                if (MBridgeBTContainer.this.F != null) {
                                    MBridgeBTContainer.this.F.a();
                                    MBridgeBTContainer.this.F.a(2, MBridgeBTContainer.this.k, MBridgeBTContainer.this.j);
                                }
                                if (MBridgeBTContainer.this.D == null || MBridgeBTContainer.this.D.size() <= 0 || (campaignEx3 = (CampaignEx) MBridgeBTContainer.this.D.get(0)) == null) {
                                    return;
                                }
                                if (campaignEx3.isBidCampaign()) {
                                    MBridgeBTContainer.a(MBridgeBTContainer.this, campaignEx3);
                                }
                                String onlyImpressionURL = campaignEx3.getOnlyImpressionURL();
                                com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), MBridgeBTContainer.this.j);
                                int iY = cVarA != null ? cVarA.y() : 1;
                                if (campaignEx3.getSpareOfferFlag() == 1) {
                                    str = onlyImpressionURL + "&to=1&cbt=" + campaignEx3.getCbt() + "&tmorl=" + iY;
                                } else {
                                    str = onlyImpressionURL + "&to=0&cbt=" + campaignEx3.getCbt() + "&tmorl=" + iY;
                                }
                                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx3, MBridgeBTContainer.this.j, str, false, true, com.mbridge.msdk.click.a.a.h);
                                com.mbridge.msdk.foundation.same.a.d.k.put(campaignEx3.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                                MBridgeBTContainer.this.a(campaignEx3);
                                try {
                                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                    dVar2.a("type", "choseFromTwoShow");
                                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx3, dVar2);
                                    return;
                                } catch (Exception e6) {
                                    if (MBridgeConstans.DEBUG) {
                                        e6.printStackTrace();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MBridgeBTContainer.this.a("nativeview is null");
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        String str;
                        if (aVar != null) {
                            str = "errorCode:" + aVar.a() + "Msg:" + aVar.b();
                        } else {
                            str = "";
                        }
                        MBridgeBTContainer.this.a("nativeview is null" + str);
                    }
                }, map);
                return;
            }
            a("big template webview is null");
        } catch (Throwable th) {
            a("onCreate exception " + th);
        }
    }

    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private List<CampaignEx> f3591a;
        private Context b;
        private String c;
        private String d;

        public a(List<CampaignEx> list, Context context, String str, String str2) {
            this.f3591a = list;
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<CampaignEx> list = this.f3591a;
            if (list == null || list.size() <= 0) {
                return;
            }
            try {
                f.a(com.mbridge.msdk.foundation.db.h.a(this.b)).a(this.c, this.f3591a);
                com.mbridge.msdk.videocommon.a.a.a().c(this.d, this.f3591a.get(0).getAdType());
            } catch (Exception unused) {
                ad.a(MBridgeBTContainer.f3586a, "remove campaign failed");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected final void a(String str) {
        h hVar = this.G;
        if (hVar != null) {
            hVar.a(this.Q, str);
        }
        super.a(str);
    }

    protected final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, this.j, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b(f3586a, th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.a.b c() {
        if (this.I == null) {
            this.I = new com.mbridge.msdk.video.bt.module.a.b() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.3
                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, MBridgeBTContainer.this.j);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, boolean z, com.mbridge.msdk.videocommon.b.c cVar) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z);
                            jSONObject2.put("convert", z ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(boolean z, int i) {
                    MBridgeBTContainer.this.M = z;
                    MBridgeBTContainer.this.N = i;
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, MBridgeBTContainer.this.j);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2, String str3) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void b(String str, String str2, String str3) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void c(String str, String str2, String str3) throws JSONException {
                    if (MBridgeBTContainer.this.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put("data", jSONObject2);
                            ad.a(MBridgeBTContainer.f3586a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(MBridgeBTContainer.f3586a, e.getMessage());
                        }
                        g.a().a((WebView) MBridgeBTContainer.this.f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, int i, String str2, String str3) {
                    if (MBridgeBTContainer.this.G != null) {
                        MBridgeBTContainer.this.G.a(i, str2, str3);
                    }
                }
            };
        }
        return this.I;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        super.onResume();
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a aVarA = com.mbridge.msdk.video.dynview.b.a.a();
            if (aVarA.f3617a != null) {
                aVarA.f3617a.a();
            }
        }
        if (com.mbridge.msdk.foundation.d.b.c) {
            return;
        }
        try {
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onResume();
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onBackPressed();
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onBackPressed();
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        CampaignEx campaignEx;
        super.onPause();
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a aVarA = com.mbridge.msdk.video.dynview.b.a.a();
            if (aVarA.f3617a != null) {
                aVarA.f3617a.b();
            }
        }
        try {
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onAdClose() {
        if (this.i != null) {
            this.i.finish();
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.R != null) {
            ad.b("omsdk", "btc onDestroy");
            this.R.finish();
        }
        super.onDestroy();
        com.mbridge.msdk.video.bt.a.d.c().d(this.j + "_" + this.K);
        try {
            WindVaneWebView windVaneWebView = this.f;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f.clearWebView();
                this.f.release();
            }
            if (this.I != null) {
                this.I = null;
            }
            if (this.F != null) {
                this.F = null;
            }
            if (this.h != null) {
                this.h = null;
            }
            List<CampaignEx> list = this.D;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.D) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        com.mbridge.msdk.videocommon.a.b(this.j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
                com.mbridge.msdk.video.dynview.b.a.a().b();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.B);
            com.mbridge.msdk.video.bt.a.d.c().g(this.j);
            com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K).remove(this.B);
            com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K).remove(this.J);
            com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K).clear();
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        if (this.F != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("type");
                String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, getUnitId());
                String strOptString2 = jSONObject.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                CampaignEx campaignEx = this.D.get(0);
                boolean z = true;
                if (iOptInt == 1 && jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
                    if (campaignEx != null) {
                        if (zOptBoolean) {
                            campaignEx.setSpareOfferFlag(1);
                        } else {
                            campaignEx.setSpareOfferFlag(0);
                        }
                    }
                }
                setCBT(campaignEx);
                switch (iOptInt) {
                    case 1:
                        this.F.a();
                        this.F.a(2, strOptString2, strOptString);
                        a(obj);
                        break;
                    case 2:
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("error") : null;
                        this.F.a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(NotificationCompat.CATEGORY_MESSAGE) : "");
                        this.F.a(4, strOptString2, strOptString);
                        a(obj);
                        break;
                    case 3:
                        this.F.a(strOptString2, strOptString);
                        this.F.a(5, strOptString2, strOptString);
                        a(obj);
                        break;
                    case 4:
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000147", this.D, dVar);
                        } catch (Throwable th) {
                            ad.b(f3586a, th.getMessage());
                        }
                        this.F.b(strOptString2, strOptString);
                        this.F.a(6, strOptString2, strOptString);
                        a(obj);
                        break;
                    case 5:
                        this.F.a(jSONObject.optBoolean("isAutoClick"), strOptString2, strOptString);
                        a(obj);
                        break;
                    case 6:
                        if (jSONObjectOptJSONObject != null) {
                            if (jSONObjectOptJSONObject.optInt("convert") != 1) {
                                z = false;
                            }
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject("reward");
                            String strOptString3 = jSONObjectOptJSONObject.optString("extra");
                            if (!TextUtils.isEmpty(strOptString3)) {
                                this.O = strOptString3;
                            }
                        } else {
                            z = false;
                        }
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(FirebaseAnalytics.Param.CAMPAIGN));
                        com.mbridge.msdk.videocommon.b.c cVarA = com.mbridge.msdk.videocommon.b.c.a(jSONObjectOptJSONObject);
                        if (cVarA == null) {
                            cVarA = this.n;
                        }
                        this.F.a(7, strOptString2, strOptString);
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", campaignWithBackData, dVar2);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                        if (this.q && (this.s == com.mbridge.msdk.foundation.same.a.G || this.s == com.mbridge.msdk.foundation.same.a.H)) {
                            this.F.a(this.M, this.N);
                        }
                        if (!z) {
                            cVarA.a(0);
                            ad.a("omsdk", "bt videoEvents :" + this.S);
                            MediaEvents mediaEvents = this.S;
                            if (mediaEvents != null) {
                                try {
                                    mediaEvents.skipped();
                                } catch (Exception e2) {
                                    ad.a("omsdk", e2.getMessage());
                                }
                            }
                        }
                        this.F.a(z, cVarA);
                        ad.a(f3586a, "sendToServerRewardInfo");
                        if (!this.q && z) {
                            if (campaignWithBackData != null) {
                                com.mbridge.msdk.video.module.b.b.a(campaignWithBackData, cVarA, strOptString, this.m, this.O);
                            } else {
                                com.mbridge.msdk.video.module.b.b.a(campaignEx, cVarA, strOptString, this.m, this.O);
                            }
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", campaignWithBackData);
                        a(obj);
                        break;
                    default:
                        a(obj);
                        break;
                }
            } catch (JSONException e3) {
                a(obj, e3.getMessage());
                ad.a(f3586a, e3.getMessage());
                return;
            }
        }
        a(obj, "listener is null");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        ad.a(f3586a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strA = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                    List<CampaignEx> list = this.D;
                    com.mbridge.msdk.click.a.a(contextC, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextC2 = com.mbridge.msdk.foundation.controller.c.m().c();
                    List<CampaignEx> list2 = this.D;
                    com.mbridge.msdk.click.a.a(contextC2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            g.a().a(obj, Base64.encodeToString("".getBytes(), 2));
        } catch (Throwable th) {
            ad.a(f3586a, "reportUrls", th);
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                int iOptInt = jSONObject.optInt("left", -999);
                int iOptInt2 = jSONObject.optInt("top", -999);
                int iOptInt3 = jSONObject.optInt("right", -999);
                int iOptInt4 = jSONObject.optInt("bottom", -999);
                if (iOptInt != -999 && contextC != null) {
                    layoutParams.leftMargin = ai.a(contextC, iOptInt);
                }
                if (iOptInt2 != -999 && contextC != null) {
                    layoutParams.topMargin = ai.a(contextC, iOptInt2);
                }
                if (iOptInt3 != -999 && contextC != null) {
                    layoutParams.rightMargin = ai.a(contextC, iOptInt3);
                }
                if (iOptInt4 != -999 && contextC != null) {
                    layoutParams.bottomMargin = ai.a(contextC, iOptInt4);
                }
                int iOptInt5 = jSONObject.optInt("width");
                int iOptInt6 = jSONObject.optInt("height");
                if (iOptInt5 > 0) {
                    layoutParams.width = iOptInt5;
                }
                if (iOptInt6 > 0) {
                    layoutParams.height = iOptInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.i);
            mBTempContainer.setMute(this.p);
            mBTempContainer.setBidCampaign(this.z);
            mBTempContainer.setIV(this.q);
            mBTempContainer.setBigOffer(this.A);
            mBTempContainer.setIVRewardEnable(this.s, this.t, this.u);
            mBTempContainer.setShowRewardListener(this.H);
            mBTempContainer.setCampaignDownLoadTask(d(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(c());
            mBTempContainer.setWebViewFront(getJSCommon().a());
            mBTempContainer.init(this.h);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    private com.mbridge.msdk.videocommon.download.a d(CampaignEx campaignEx) {
        List<com.mbridge.msdk.videocommon.download.a> list = this.E;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (com.mbridge.msdk.videocommon.download.a aVar : list) {
            if (aVar.l().getId().equals(campaignEx.getId())) {
                ad.a(f3586a, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    public void broadcast(String str, JSONObject jSONObject) throws JSONException {
        if (this.f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.b);
                jSONObject2.put("id", this.B);
                jSONObject2.put(t2.h.k0, str);
                jSONObject2.put("data", jSONObject);
                g.a().a((WebView) this.f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.a.d.c().a((WebView) this.f, "broadcast", this.B);
            }
        }
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, "layout");
    }

    public void setBTContainerCallback(com.mbridge.msdk.video.bt.module.a.a aVar) {
        this.F = aVar;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.D = list;
        String currentLocalRid = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    currentLocalRid = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.Q = com.mbridge.msdk.foundation.same.report.d.c.a().b(currentLocalRid);
        }
        if (this.Q == null) {
            this.Q = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        this.Q.c(currentLocalRid);
        this.Q.b(list);
    }

    public List<CampaignEx> getCampaigns() {
        return this.D;
    }

    public void setCampaignDownLoadTasks(List<com.mbridge.msdk.videocommon.download.a> list) {
        this.E = list;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.w = bVar;
    }

    public void setShowRewardVideoListener(h hVar) {
        this.G = hVar;
    }

    public void setChoiceOneCallback(d dVar) {
        this.P = dVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() == 1) {
                if (this.l != null) {
                    if (this.l.y() == 1) {
                        campaignEx.setCbt(1);
                        return;
                    } else {
                        campaignEx.setCbt(0);
                        return;
                    }
                }
                return;
            }
            campaignEx.setCbt(0);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        try {
            String strA = r.a(i, i2, i3, i4, i5);
            ad.b(f3586a, strA);
            WindVaneWebView windVaneWebView = this.f;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof k) && !TextUtils.isEmpty(strA)) {
                ((k) this.f.getObject()).b(strA);
                g.a().a((WebView) this.f, "oncutoutfetched", Base64.encodeToString(strA.getBytes(), 0));
            }
            List<CampaignEx> list = this.D;
            if (list != null && list.size() > 0) {
                try {
                    if (this.D.get(0).isDynamicView() && (textView = this.x) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i2 > 0) {
                            layoutParams.leftMargin = i2;
                        }
                        if (i3 > 0) {
                            layoutParams.rightMargin = i3;
                        }
                        if (i4 > 0) {
                            layoutParams.topMargin = i4;
                        }
                        if (i5 > 0) {
                            layoutParams.bottomMargin = i5;
                        }
                        this.x.setLayoutParams(layoutParams);
                        if (this.y != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.y.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.y.setLayoutParams(layoutParams2);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e2) {
                    ad.b(f3586a, e2.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.a.d.c().a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.j, this.K);
            if (linkedHashMapB == null || linkedHashMapB.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapB.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).setNotchPadding(i2, i3, i4, i5);
                }
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).setNotchPadding(i, i2, i3, i4, i5);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(strA)) {
                    g.a().a(view, "oncutoutfetched", Base64.encodeToString(strA.getBytes(), 0));
                }
            }
        } catch (Throwable th) {
            ad.a(f3586a, th.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.O = str;
    }

    private class b extends a.C0309a {
        private b() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a() {
            super.a();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            ah.b(campaign, MBridgeBTContainer.this.d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.d);
            if (campaign == null || !(campaign instanceof CampaignEx)) {
                return;
            }
            try {
                CampaignEx campaignEx = (CampaignEx) campaign;
                String strOptString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals("1.0") && MBridgeBTContainer.this.i != null) {
                    if (!MBridgeBTContainer.this.A) {
                        MBridgeBTContainer.this.i.finish();
                    } else {
                        MBridgeBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(boolean z) {
            super.a(z);
            if (MBridgeBTContainer.this.S != null) {
                try {
                    MBridgeBTContainer.this.S.adUserInteraction(InteractionType.CLICK);
                    ad.a("omsdk", "btc adUserInteraction click");
                } catch (Exception e) {
                    ad.a("omsdk", e.getMessage());
                }
            }
            MBridgeBTContainer.this.H.a(z, MBridgeBTContainer.this.k, MBridgeBTContainer.this.j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(int i, String str) {
            super.a(i, str);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0309a, com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void b() {
            super.b();
        }
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            int iA = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 48.0f);
            int iA2 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, iA2, iA2);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_close", "drawable"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTContainer.this.onAdClose();
                }
            });
            addView(imageView);
        } catch (Throwable th) {
            ad.b(f3586a, th.getMessage());
        }
    }

    static /* synthetic */ void a(MBridgeBTContainer mBridgeBTContainer, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                int iC = listA.get(0).c();
                String strB = listA.get(0).b();
                if (iC == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + strB);
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
