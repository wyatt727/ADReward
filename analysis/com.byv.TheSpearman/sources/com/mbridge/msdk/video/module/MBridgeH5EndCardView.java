package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.my.target.ads.Reward;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private long E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private String N;
    private boolean O;
    private boolean P;
    protected View n;
    protected RelativeLayout o;
    protected ImageView p;
    protected WindVaneWebView q;
    protected Handler r;
    protected String s;
    protected boolean t;
    protected boolean u;
    Handler v;
    boolean w;
    private boolean x;
    private boolean y;
    private int z;

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z) {
    }

    public void install(CampaignEx campaignEx) {
    }

    public void readyStatus(int i) {
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.x = false;
        this.r = new Handler();
        this.t = false;
        this.u = false;
        this.y = false;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = 1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = "";
        this.v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (MBridgeH5EndCardView.this.F) {
                    MBridgeH5EndCardView.this.e.a(122, "");
                }
                MBridgeH5EndCardView.this.e.a(103, "");
            }
        };
        this.O = false;
        this.P = false;
        this.w = false;
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = false;
        this.r = new Handler();
        this.t = false;
        this.u = false;
        this.y = false;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = 1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = "";
        this.v = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (MBridgeH5EndCardView.this.F) {
                    MBridgeH5EndCardView.this.e.a(122, "");
                }
                MBridgeH5EndCardView.this.e.a(103, "");
            }
        };
        this.O = false;
        this.P = false;
        this.w = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) throws JSONException {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (iFindLayout >= 0) {
            View viewInflate = this.c.inflate(iFindLayout, (ViewGroup) null);
            this.n = viewInflate;
            try {
                this.p = (ImageView) viewInflate.findViewById(findID("mbridge_windwv_close"));
                this.o = (RelativeLayout) viewInflate.findViewById(findID("mbridge_windwv_content_rl"));
                this.q = new WindVaneWebView(getContext());
                if (this.b != null) {
                    this.q.setLocalRequestId(this.b.getCurrentLocalRid());
                }
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.o.addView(this.q);
                this.f = isNotNULL(this.p, this.q);
            } catch (Exception unused) {
                this.f = false;
            }
            addView(this.n, b());
            c();
            e();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        super.c();
        if (this.f) {
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.q != null) {
                g.a().a((WebView) this.q, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.e.a(103, "");
                this.e.a(119, "webview is null when closing webview");
            }
        } catch (Exception e2) {
            this.e.a(103, "");
            this.e.a(119, "close webview exception" + e2.getMessage());
            ad.a(MBridgeBaseView.TAG, e2.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", this.b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    private class a implements Runnable {
        private MBridgeH5EndCardView b;

        public a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                ad.b("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.v == null) {
                return;
            }
            this.b.v.sendEmptyMessage(100);
        }
    }

    public void setError(boolean z) {
        this.u = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:25:0x0093, B:27:0x00b5, B:29:0x00bb, B:32:0x00c3, B:34:0x00c9, B:36:0x00d1, B:38:0x00d9, B:40:0x00dc, B:42:0x00e0, B:44:0x00e8, B:46:0x00f0, B:48:0x00f6, B:50:0x00fd, B:58:0x011b, B:59:0x011f, B:51:0x0108, B:53:0x010d, B:55:0x0113), top: B:71:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #0 {all -> 0x0123, blocks: (B:25:0x0093, B:27:0x00b5, B:29:0x00bb, B:32:0x00c3, B:34:0x00c9, B:36:0x00d1, B:38:0x00d9, B:40:0x00dc, B:42:0x00e0, B:44:0x00e8, B:46:0x00f0, B:48:0x00f6, B:50:0x00fd, B:58:0x011b, B:59:0x011f, B:51:0x0108, B:53:0x010d, B:55:0x0113), top: B:71:0x0093 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    public void reportRenderResult(String str, int i) {
        if (this.b == null || this.u) {
            return;
        }
        n nVar = new n();
        nVar.f(this.b.getRequestId());
        nVar.g(this.b.getRequestIdNotice());
        nVar.e(this.b.getId());
        nVar.b(i);
        nVar.l(String.valueOf(System.currentTimeMillis() - this.E));
        nVar.h(str);
        String str2 = "2";
        if (this.b.getAdType() == 287) {
            nVar.d("3");
        } else if (this.b.getAdType() == 94) {
            nVar.d("1");
        } else if (this.b.getAdType() == 42) {
            nVar.d("2");
        }
        if (this.b.isMraid()) {
            nVar.d(n.f2819a);
        } else {
            nVar.n(this.b.getendcard_url());
            if (an.b(this.b.getendcard_url()) && this.b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.o(str2);
            nVar.d(n.b);
        }
        h.b(nVar, this.unitId, this.b);
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.b.getendcard_url();
            int iA = 15;
            if (an.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(t2.i.c);
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (an.b(str2) && str2.contains("timeout") && str2.split(t2.i.b) != null && str2.split(t2.i.b).length > 0) {
                            iA = ai.a((Object) str2.split(t2.i.b)[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.H = true;
        } else {
            if (i != 1) {
                return;
            }
            this.I = true;
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        int visibility = this.p.getVisibility();
        if (i == 1) {
            this.G = true;
            visibility = 0;
        } else if (i == 2) {
            this.G = false;
            visibility = 8;
            if (this.w) {
                if (!this.P && !this.H) {
                    this.P = true;
                    int i2 = this.A;
                    if (i2 == 0) {
                        this.K = true;
                    } else {
                        this.K = false;
                        if (i2 > -1) {
                            this.r.postDelayed(new e(this), this.A * 1000);
                        }
                    }
                }
            } else if (!this.O && !this.H) {
                this.O = true;
                int i3 = this.z;
                if (i3 == 0) {
                    this.J = true;
                } else {
                    this.J = false;
                    if (i3 > -1) {
                        this.r.postDelayed(new d(this), this.z * 1000);
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    private class d implements Runnable {
        private MBridgeH5EndCardView b;

        public d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.J = true;
            }
        }
    }

    private class e implements Runnable {
        private MBridgeH5EndCardView b;

        public e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.K = true;
            }
        }
    }

    public void handlerPlayableException(String str) {
        if (this.u) {
            return;
        }
        this.u = true;
        this.t = false;
        if (this.b != null) {
            n nVar = new n();
            nVar.f(this.b.getRequestId());
            nVar.g(this.b.getRequestIdNotice());
            nVar.e(this.b.getId());
            nVar.h(str);
            h.a(nVar, this.f3680a.getApplicationContext(), this.unitId);
        }
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.q;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String string;
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.q.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                            if (contextC != null) {
                                jSONObject.put("startX", ai.b(contextC, iArr[0]));
                                jSONObject.put("startY", ai.b(contextC, iArr[1]));
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(contextC));
                            }
                            string = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                            string = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.q, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.e.a(109, "");
                        MBridgeH5EndCardView.d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        g.a().a((WebView) MBridgeH5EndCardView.this.q, "oncutoutfetched", Base64.encodeToString(MBridgeH5EndCardView.this.N.getBytes(), 0));
                        MBridgeH5EndCardView.f(MBridgeH5EndCardView.this);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public void orientation(Configuration configuration) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", t2.h.C);
            } else {
                jSONObject.put("orientation", t2.h.D);
            }
            g.a().a((WebView) this.q, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.p;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public boolean isLoadSuccess() {
        return this.t;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void setCloseDelayShowTime(int i) {
        this.z = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.A = i;
    }

    public void setHtmlSource(String str) {
        this.s = str;
    }

    public void setCloseVisible(int i) {
        if (this.f) {
            this.p.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f) {
            this.L = true;
            if (i == 4) {
                this.p.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.p.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.p.setVisibility(0);
        }
    }

    protected RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    protected void e() {
        if (this.f) {
            setMatchParent();
        }
    }

    protected String a() {
        if (this.b != null) {
            this.F = true;
            if (this.b.isMraid()) {
                this.y = false;
                String mraid = this.b.getMraid();
                if (!TextUtils.isEmpty(mraid)) {
                    File file = new File(mraid);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            mraid = "file:////" + mraid;
                        } else {
                            mraid = this.b.getEndScreenUrl();
                        }
                        return mraid;
                    } catch (Throwable th) {
                        if (!MBridgeConstans.DEBUG) {
                            return mraid;
                        }
                        th.printStackTrace();
                        return mraid;
                    }
                }
                return this.b.getEndScreenUrl();
            }
            String str = this.b.getendcard_url();
            if (!an.a(str)) {
                this.y = true;
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (TextUtils.isEmpty(h5ResAddress)) {
                    try {
                        String path = Uri.parse(str).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String endScreenUrl = this.b.getEndScreenUrl();
                            if (TextUtils.isEmpty(endScreenUrl)) {
                                return null;
                            }
                            this.y = false;
                            excuteTask();
                            return endScreenUrl;
                        }
                    } catch (Throwable th2) {
                        ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    }
                    return str + "&native_adtype=" + this.b.getAdType();
                }
                return h5ResAddress + "&native_adtype=" + this.b.getAdType();
            }
            this.y = false;
            return this.b.getEndScreenUrl();
        }
        this.F = false;
        return null;
    }

    private class f implements Runnable {
        private MBridgeH5EndCardView b;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.L) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.b.G = true;
            }
        }
    }

    public void excuteTask() {
        if (this.y || this.z <= -1) {
            return;
        }
        this.r.postDelayed(new f(this), this.z * 1000);
    }

    private class b implements Runnable {
        private MBridgeH5EndCardView b;

        public b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.C) {
                return;
            }
            this.b.C = true;
            this.b.t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.b.e.a(127, "");
            ad.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    public void executeEndCardShow(int i) {
        this.r.postDelayed(new b(this), i * 1000);
    }

    public void excuteEndCardShowTask(int i) {
        this.r.postDelayed(new c(this, i), i * 1000);
    }

    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f3698a;
        private int b;

        public c(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.f3698a = mBridgeH5EndCardView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f3698a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.b == null) {
                return;
            }
            try {
                if (!this.f3698a.B) {
                    this.f3698a.B = true;
                    n nVar = new n("m_download_end", 12, (this.b * 1000) + "", this.f3698a.b.getendcard_url(), this.f3698a.b.getId(), this.f3698a.unitId, "ready timeout", (an.b(this.f3698a.b.getendcard_url()) && this.f3698a.b.getendcard_url().contains(".zip")) ? "1" : "2");
                    try {
                        if (this.f3698a.b.getAdType() == 287) {
                            nVar.d("3");
                        } else if (this.f3698a.b.getAdType() == 94) {
                            nVar.d("1");
                        } else if (this.f3698a.b.getAdType() == 42) {
                            nVar.d("2");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    nVar.f(this.f3698a.b.getRequestId());
                    nVar.s(this.f3698a.b.getCurrentLocalRid());
                    nVar.g(this.f3698a.b.getRequestIdNotice());
                    nVar.c(this.f3698a.b.getAdSpaceT());
                    this.f3698a.isLoadSuccess();
                    return;
                }
                ad.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
            } catch (Throwable th) {
                ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    public boolean isPlayable() {
        return this.y;
    }

    public void onBackPress() {
        boolean z;
        if (this.G || (((z = this.H) && this.I) || (!(z || !this.J || this.w) || (!z && this.K && this.w)))) {
            onCloseViewClick();
        }
    }

    public void setLoadPlayable(boolean z) {
        this.w = z;
    }

    public void release() {
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.r = null;
        }
        Handler handler2 = this.v;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.v = null;
        }
        this.o.removeAllViews();
        this.q.release();
        this.q = null;
    }

    public void volumeChange(double d2) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.q, d2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.b == null || !this.b.isMraid()) {
            return;
        }
        if (z) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.q, com.json.mediationsdk.metadata.a.g);
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.q, "false");
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 || this.M) {
            return;
        }
        this.M = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new i(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.b.isBidCampaign());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.b;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        this.N = str;
        if (this.b == null || this.b.getAdSpaceT() == 2) {
            return;
        }
        ad.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
        int iA = ai.a(getContext(), 20.0f);
        layoutParams.setMargins(i + iA, i3 + iA, i2 + iA, i4 + iA);
        this.p.setLayoutParams(layoutParams);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|7|(1:12)(1:11)|13|(1:15)(2:17|(1:19)(14:20|21|58|22|(1:24)(2:25|(1:27)(2:28|(1:30)))|57|34|62|35|(1:37)|38|(1:40)|44|(1:66)(4:48|(1:50)(1:51)|52|67)))|16|21|58|22|(0)(0)|57|34|62|35|(0)|38|(0)|44|(2:46|66)(1:65)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.video.module.MBridgeBaseView.TAG, r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: NullPointerException -> 0x00ad, all -> 0x0158, TryCatch #0 {NullPointerException -> 0x00ad, blocks: (B:22:0x0081, B:24:0x008b, B:25:0x0091, B:27:0x009b, B:28:0x009f, B:30:0x00a9), top: B:58:0x0081, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[Catch: NullPointerException -> 0x00ad, all -> 0x0158, TryCatch #0 {NullPointerException -> 0x00ad, blocks: (B:22:0x0081, B:24:0x008b, B:25:0x0091, B:27:0x009b, B:28:0x009f, B:30:0x00a9), top: B:58:0x0081, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[Catch: Exception -> 0x0106, all -> 0x0158, TryCatch #2 {Exception -> 0x0106, blocks: (B:35:0x00d7, B:37:0x00ed, B:38:0x00f4, B:40:0x00fe), top: B:62:0x00d7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[Catch: Exception -> 0x0106, all -> 0x0158, TRY_LEAVE, TryCatch #2 {Exception -> 0x0106, blocks: (B:35:0x00d7, B:37:0x00ed, B:38:0x00f4, B:40:0x00fe), top: B:62:0x00d7, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }

    static /* synthetic */ void d(MBridgeH5EndCardView mBridgeH5EndCardView) throws JSONException {
        if (mBridgeH5EndCardView.b == null || !mBridgeH5EndCardView.b.isMraid()) {
            return;
        }
        int i = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i != 0) {
            if (i == 1) {
                str = t2.h.D;
            } else if (i == 2) {
                str = t2.h.C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.json.mediationsdk.metadata.a.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", Reward.DEFAULT);
        map.put("viewable", com.json.mediationsdk.metadata.a.g);
        map.put("currentAppOrientation", jSONObject);
        if (mBridgeH5EndCardView.getContext() instanceof Activity) {
            float fI = z.i(mBridgeH5EndCardView.getContext());
            float fG = z.g(mBridgeH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f2 = displayMetrics.widthPixels;
            float f3 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.q, fI, fG);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(mBridgeH5EndCardView.q, f2, f3);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.q, r7.getLeft(), mBridgeH5EndCardView.q.getTop(), mBridgeH5EndCardView.q.getWidth(), mBridgeH5EndCardView.q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.q, r13.getLeft(), mBridgeH5EndCardView.q.getTop(), mBridgeH5EndCardView.q.getWidth(), mBridgeH5EndCardView.q.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.q, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.q, com.mbridge.msdk.mbsignalcommon.mraid.d.f3180a);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.q);
    }

    static /* synthetic */ void f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        try {
            if (mBridgeH5EndCardView.b != null) {
                mBridgeH5EndCardView.b.setCampaignUnitId(mBridgeH5EndCardView.unitId);
                com.mbridge.msdk.foundation.d.b.a().c(mBridgeH5EndCardView.unitId + "_1");
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeH5EndCardView.unitId + "_2", mBridgeH5EndCardView.b);
            }
            if (mBridgeH5EndCardView.b == null || !mBridgeH5EndCardView.b.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            imageView.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = mBridgeH5EndCardView.p;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
                layoutParams2.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
            }
            mBridgeH5EndCardView.addView(imageView, layoutParams2);
            ai.a(4, imageView, mBridgeH5EndCardView.b, com.mbridge.msdk.foundation.controller.c.m().c(), false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.5
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
                        ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBridgeH5EndCardView.this.q, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
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
                        ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBridgeH5EndCardView.this.q, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String string;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                        string = "";
                    }
                    g.a().a((WebView) MBridgeH5EndCardView.this.q, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
