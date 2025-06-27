package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.C;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.common.b.f;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseBannerShowManager.java */
/* loaded from: classes4.dex */
public class d {
    private float B;
    private float C;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.b.c f3054a;
    protected CampaignEx b;
    protected final MBBannerView c;
    protected boolean d;
    protected final String e;
    com.mbridge.msdk.click.a f;
    private boolean g;
    private ImageView h;
    private MBBannerWebView i;
    private ImageView j;
    private ImageView k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final String r;
    private List<CampaignEx> s;
    private int u;
    private com.mbridge.msdk.mbbanner.common.communication.a w;
    private AdSession x;
    private AdEvents y;
    private int t = 1;
    private final long v = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
    private final Handler z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.mbbanner.common.c.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.x != null) {
                    d dVar = d.this;
                    dVar.y = AdEvents.createAdEvents(dVar.x);
                    if (d.this.y != null) {
                        d.this.y.loaded();
                        d.this.y.impressionOccurred();
                    }
                }
            } catch (Throwable th) {
                ad.a("BannerShowManager", th.getMessage());
            }
        }
    };
    private final com.mbridge.msdk.foundation.same.e.a A = new com.mbridge.msdk.foundation.same.e.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.6
        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            d.this.a("banner render failed because render is timeout");
        }
    };
    private final View.OnClickListener D = new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (d.this.d) {
                d.c(d.this);
            }
        }
    };
    private com.mbridge.msdk.mbbanner.common.b.a E = new com.mbridge.msdk.mbbanner.common.b.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.8
        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(int i) {
            if (i != 2) {
                d.this.f();
            } else {
                d.d(d.this);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(String str) {
            d.c(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a() {
            d.c(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void b(int i) {
            if (i == 1) {
                d.this.d();
                d.this.a("", 1);
            } else {
                d.this.c();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z) {
            if (d.this.f3054a != null) {
                d.this.q = z;
                if (z) {
                    d.this.f3054a.c();
                } else {
                    d.this.f3054a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z, String str) {
            try {
                if (d.this.f3054a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f3054a.a();
                        d.this.f3054a.b();
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.b));
                        campaignWithBackData.setClickURL(str);
                        d.this.a(campaignWithBackData, z, str);
                    }
                }
            } catch (Exception e) {
                ad.b("BannerShowManager", e.getMessage());
            }
        }
    };
    private com.mbridge.msdk.mbsignalcommon.b.b F = new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.c.d.4
        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            d.this.n = true;
            ad.b("BannerCallJS", "fireOnJSBridgeConnected");
            g.a().a(webView);
            d.this.p = true;
            if (d.this.b == null || d.this.b.isHasMBTplMark()) {
                return;
            }
            d.this.d();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i, String str, String str2) {
            d.this.a(str);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            d.this.c();
        }
    };

    public void a(CampaignEx campaignEx, boolean z, String str) {
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z, k kVar) {
        this.g = z;
        this.c = mBBannerView;
        this.e = str2;
        this.r = str;
        this.f3054a = new f(cVar, kVar);
    }

    public final void a(boolean z, int i) {
        this.u = i;
        if (i == 0) {
            k kVarD = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.e);
            if (kVarD == null) {
                return;
            } else {
                z = kVarD.f() == 1;
            }
        }
        this.g = z;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    private boolean b() {
        String strA = a(this.b);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.c != null) {
            if (this.i == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    this.i = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.i.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.e, this.s, this.E));
                } catch (Throwable unused) {
                    a("banner show failed because WebView is not available and try to show default", 1);
                    return false;
                }
            }
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
            if (this.i.getParent() == null) {
                this.c.addView(this.i);
                d(this.b.isMraid());
            }
            if (this.b.isMraid()) {
                g();
            }
            f();
            com.mbridge.msdk.mbbanner.common.communication.a aVar = new com.mbridge.msdk.mbbanner.common.communication.a(this.c.getContext(), this.r, this.e);
            this.w = aVar;
            aVar.a(this.s);
            this.w.a(this.E);
            this.w.a(this.u);
            this.i.setWebViewListener(this.F);
            this.i.setObject(this.w);
            if (!strA.startsWith(t2.h.b)) {
                if (this.b.isActiveOm()) {
                    strA = com.mbridge.msdk.a.b.c(strA);
                }
                this.i.loadDataWithBaseURL(this.b.getBannerUrl(), strA, "text/html", m4.M, null);
            } else {
                this.i.loadUrl(strA);
            }
            MBBannerWebView mBBannerWebView2 = this.i;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (Build.VERSION.SDK_INT < 19 || d.this.i == null) {
                                return;
                            }
                            String str = d.this.t == 2 ? "false" : com.json.mediationsdk.metadata.a.g;
                            d.this.i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 1000L);
            }
        } else {
            a("banner render failed because banner view is null", 2);
            a("banner show failed because banner view is exception");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.c != null) {
            MBBannerWebView mBBannerWebView = this.i;
            if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
                this.c.removeView(this.i);
            }
            if (this.h == null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                this.h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.10
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        d.this.B = motionEvent.getRawX();
                        d.this.C = motionEvent.getRawY();
                        ad.b("BannerShowManager", d.this.B + "  " + d.this.C);
                        return false;
                    }
                });
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws JSONException {
                        d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.B, d.this.C), d.this.b), false, "");
                    }
                });
            }
            String imageUrl = this.b.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbbanner.common.c.d.12
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (d.this.h != null) {
                            d.this.h.setImageBitmap(bitmap);
                        }
                        d.this.n = true;
                        d.m(d.this);
                        d.this.f();
                        d.this.g();
                        if (d.this.d) {
                            return;
                        }
                        d.this.d();
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        d.this.a("banner show failed because banner default view is exception");
                    }
                });
                return;
            } else {
                a("banner show failed because campain is exception");
                return;
            }
        }
        a("banner show failed because banner view is exception");
    }

    private String a(CampaignEx campaignEx) {
        String strInjectScriptContentIntoHtml;
        if (campaignEx == null) {
            return "";
        }
        String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(htmlContentFromUrl)) {
            String bannerHtml = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(bannerHtml);
                    strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, file.exists() ? ab.b(file) : "");
                } catch (Exception unused) {
                    File file2 = new File(bannerHtml);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        strInjectScriptContentIntoHtml = "file:////" + bannerHtml;
                    }
                }
                return strInjectScriptContentIntoHtml;
            }
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                strInjectScriptContentIntoHtml = "file:////" + bannerHtml;
                return strInjectScriptContentIntoHtml;
            }
            return bannerHtml;
        }
        return ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, htmlContentFromUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b == null || e()) {
            return;
        }
        this.z.removeCallbacks(this.A);
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.f3054a;
        if (cVar != null) {
            cVar.a(str);
        }
        com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.e, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.d():void");
    }

    private synchronized boolean e() {
        boolean zIsReport;
        zIsReport = this.b.isReport();
        if (!zIsReport) {
            this.b.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (!this.g || (imageView = this.j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.j.setVisibility(0);
            this.j.setOnClickListener(this.D);
        }
        if (this.j.getParent() != null || this.c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.c.addView(this.j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.c == null) {
            return;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            if (!(campaignEx.getPrivacyButtonTemplateVisibility() == 1)) {
                return;
            }
        }
        MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
        mBAdChoice.setCampaign(this.b);
        mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.2
            @Override // com.mbridge.msdk.foundation.d.a
            public final void a() {
                String string;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        jSONObject.put("status", 1);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage(), th);
                    string = "";
                }
                g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void b() {
                String string;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        jSONObject.put("status", 2);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage(), th);
                    string = "";
                }
                g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void a(String str) {
                String string;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        jSONObject.put("status", 1);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage(), th);
                    string = "";
                }
                g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        this.c.addView(mBAdChoice, layoutParams);
    }

    private void h() {
        AdSession adSession = this.x;
        if (adSession != null) {
            adSession.finish();
            this.x = null;
            ad.a("omsdk", " adSession.finish() ");
        }
    }

    public final void a() {
        h();
        if (this.f3054a != null) {
            this.f3054a = null;
        }
        MBBannerWebView mBBannerWebView = this.i;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.F != null) {
            this.F = null;
        }
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.c;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.i;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.E != null) {
            this.E = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.e);
    }

    public final void b(boolean z) {
        this.l = z;
        d();
        if (z) {
            return;
        }
        CampaignEx campaignEx = this.b;
        String str = this.e;
        if (campaignEx != null) {
            String strA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            new i(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, strA, campaignEx.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
        }
    }

    public final void c(boolean z) {
        this.m = z;
        d();
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
                ad.b("BannerShowManager", th.getMessage());
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
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(context)).a(campaignEx.getId());
                    } catch (Exception e) {
                        ad.b("BannerShowManager", e.getMessage());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        if (this.b != null) {
            com.mbridge.msdk.mbbanner.common.d.a.a(com.mbridge.msdk.mbbanner.common.a.a.a().c(this.b.getId()).b(this.e).d(this.b.getRequestId()).e(this.b.getRequestIdNotice()).g(str).a(i).a(this.b.isBidCampaign()), this.e);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        MBBannerWebView mBBannerWebView = this.i;
        ad.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBBannerWebView, i, i2);
        } catch (Throwable th) {
            ad.a("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    private void d(boolean z) {
        if (this.c != null) {
            FeedBackButton feedBackButtonB = com.mbridge.msdk.foundation.d.b.a().b(this.e);
            if (com.mbridge.msdk.foundation.d.b.a().b() && z && feedBackButtonB != null) {
                ViewGroup viewGroup = (ViewGroup) feedBackButtonB.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonB);
                }
                feedBackButtonB.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) feedBackButtonB.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f2780a);
                }
                layoutParams.addRule(12);
                feedBackButtonB.setLayoutParams(layoutParams);
                this.c.addView(feedBackButtonB);
            }
            com.mbridge.msdk.foundation.d.b.a().a(this.e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.5
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String string;
                    d.this.c.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 1);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String string;
                    d.this.c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String string;
                    d.this.c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) d.this.i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }
            });
            this.b.setCampaignUnitId(this.e);
            com.mbridge.msdk.foundation.d.b.a().a(this.e, this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignUnit r5) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    static /* synthetic */ void c(d dVar) {
        MBBannerWebView mBBannerWebView = dVar.i;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            dVar.c.removeView(dVar.i);
        }
        ImageView imageView = dVar.h;
        if (imageView != null && imageView.getParent() != null) {
            dVar.h.setVisibility(8);
            dVar.c.removeView(dVar.h);
        }
        ImageView imageView2 = dVar.j;
        if (imageView2 != null && imageView2.getParent() != null) {
            dVar.c.removeView(dVar.j);
            dVar.j.setVisibility(8);
        }
        com.mbridge.msdk.foundation.d.b.a().c(dVar.e);
        ImageView imageView3 = dVar.k;
        if (imageView3 != null && imageView3.getParent() != null) {
            dVar.c.removeView(dVar.k);
            dVar.k.setVisibility(8);
        }
        com.mbridge.msdk.mbbanner.common.a.a aVarA = com.mbridge.msdk.mbbanner.common.a.a.a().b(dVar.e).d(dVar.b.getRequestId()).e(dVar.b.getRequestIdNotice()).c(dVar.b.getId()).f(dVar.b.getCreativeId() + "").a(dVar.b.isBidCampaign());
        String str = dVar.e;
        if (aVarA != null) {
            aVarA.a("2000069");
            if (e.a().b()) {
                e.a().a(aVarA.b());
            } else {
                com.mbridge.msdk.foundation.same.report.h.a(aVarA.b(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
        BannerUtils.inserCloseId(dVar.e, dVar.s);
        com.mbridge.msdk.mbbanner.common.b.c cVar = dVar.f3054a;
        if (cVar != null) {
            cVar.e();
        }
        dVar.h();
    }

    static /* synthetic */ void d(d dVar) {
        ImageView imageView;
        if (dVar.g && (imageView = dVar.j) != null && imageView.getVisibility() == 0) {
            dVar.j.setVisibility(8);
            dVar.j.setOnClickListener(null);
            if (dVar.c == null || dVar.j.getParent() == null) {
                return;
            }
            dVar.c.removeView(dVar.j);
        }
    }

    static /* synthetic */ void m(d dVar) {
        if (dVar.h != null) {
            MBBannerWebView mBBannerWebView = dVar.i;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (dVar.h.getVisibility() != 0) {
                dVar.h.setVisibility(0);
            }
            if (dVar.c != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                dVar.h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (dVar.h.getParent() == null) {
                    dVar.c.addView(dVar.h, layoutParams);
                }
                dVar.d(true);
            }
        }
    }
}
