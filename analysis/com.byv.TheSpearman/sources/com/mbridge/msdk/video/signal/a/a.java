package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.json.t2;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* compiled from: BaseDefaultJSCommon.java */
/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {
    protected String j;
    protected com.mbridge.msdk.videocommon.d.c k;
    protected com.mbridge.msdk.click.a l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f3764a = false;
    protected boolean b = false;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;
    protected int h = 1;
    protected int i = -1;
    public a.InterfaceC0308a m = new C0309a();
    protected int n = 2;
    private AdSession o = null;
    private MediaEvents p = null;
    private AdEvents q = null;

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    public final AdSession j() {
        return this.o;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(AdSession adSession) {
        this.o = adSession;
    }

    public final MediaEvents k() {
        return this.p;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(MediaEvents mediaEvents) {
        this.p = mediaEvents;
    }

    public final AdEvents l() {
        return this.q;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(AdEvents adEvents) {
        this.q = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i) {
        this.n = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i) {
        this.c = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i) {
        this.d = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i) {
        this.e = i;
    }

    public final int m() {
        if (this.c == 0 && this.b) {
            this.c = 1;
        }
        return this.c;
    }

    public final int n() {
        if (this.d == 0 && this.b) {
            this.d = 1;
        }
        return this.d;
    }

    public final int o() {
        if (this.e == 0 && this.b) {
            this.e = 1;
        }
        return this.e;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i) {
        this.g = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.g;
    }

    public final boolean p() {
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.b = z;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.f3764a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z) {
        this.f3764a = z;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        ad.a("DefaultJSCommon", "setUnitId:" + str);
        this.j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0308a interfaceC0308a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0308a);
        this.m = interfaceC0308a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e() {
        ad.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
            this.l.a((NativeListener.NativeTrackingListener) null);
            this.l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i) {
        this.i = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i) {
        ad.a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.h = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.h);
        return this.h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        ad.a("DefaultJSCommon", t2.a.e);
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        ad.a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d() {
        ad.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    /* compiled from: BaseDefaultJSCommon.java */
    public static class b implements a.InterfaceC0308a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f3765a;
        private a.InterfaceC0308a b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0308a interfaceC0308a) {
            this.f3765a = dVar;
            this.b = interfaceC0308a;
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0308a interfaceC0308a = this.b;
            return interfaceC0308a != null && interfaceC0308a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f3765a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f3765a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.onDownloadProgress(i);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a() {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(boolean z) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.a(z);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void a(int i, String str) {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.a(i, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public final void b() {
            a.InterfaceC0308a interfaceC0308a = this.b;
            if (interfaceC0308a != null) {
                interfaceC0308a.b();
            }
        }
    }

    /* compiled from: BaseDefaultJSCommon.java */
    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    public static class C0309a implements a.InterfaceC0308a {
        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            ad.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            ad.a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public void a(boolean z) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public void a(int i, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0308a
        public void b() {
            ad.a("DefaultJSCommon", "videoLocationReady");
        }
    }
}
