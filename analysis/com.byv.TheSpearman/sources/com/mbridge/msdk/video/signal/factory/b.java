package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.i;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.a.m;
import com.mbridge.msdk.video.signal.a.n;
import com.mbridge.msdk.video.signal.a.o;
import com.mbridge.msdk.video.signal.a.q;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.j;
import java.util.List;

/* compiled from: JSFactory.java */
/* loaded from: classes4.dex */
public final class b extends a {
    private Activity h;
    private WebView i;
    private MBridgeVideoView j;
    private MBridgeContainerView k;
    private CampaignEx l;
    private MBridgeBTContainer m;
    private a.InterfaceC0308a n;
    private String o;
    private List<CampaignEx> p;

    public b(Activity activity) {
        this.h = activity;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.h = activity;
        this.m = mBridgeBTContainer;
        this.i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0308a interfaceC0308a) {
        this.h = activity;
        this.i = webView;
        this.j = mBridgeVideoView;
        this.k = mBridgeContainerView;
        this.l = campaignEx;
        this.n = interfaceC0308a;
        this.o = mBridgeVideoView.getUnitId();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.i == null) {
            return super.getActivityProxy();
        }
        if (this.f3869a == null) {
            this.f3869a = new i(this.i);
        }
        return this.f3869a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        if (this.i == null) {
            return super.getJSNotifyProxy();
        }
        if (this.d == null) {
            this.d = new n(this.i);
        }
        return this.d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        if (this.h == null || this.l == null) {
            return super.getJSCommon();
        }
        if (this.b == null) {
            this.b = new k(this.h, this.l);
        }
        if (this.l.getDynamicTempCode() == 5 && this.p != null && (this.b instanceof k)) {
            ((k) this.b).a(this.p);
        }
        this.b.a(this.h);
        this.b.a(this.o);
        this.b.a(this.n);
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final j getJSVideoModule() {
        if (this.j == null) {
            return super.getJSVideoModule();
        }
        if (this.c == null) {
            this.c = new q(this.j);
        }
        return this.c;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        if (this.k == null) {
            return super.getJSContainerModule();
        }
        if (this.e == null) {
            this.e = new m(this.k);
        }
        return this.e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        if (this.k == null || this.h == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f == null) {
            this.f = new o(this.h, this.k);
        }
        return this.f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.h == null || this.m == null) {
            return super.getJSBTModule();
        }
        if (this.g == null) {
            this.g = new com.mbridge.msdk.video.signal.a.j(this.h, this.m);
        }
        return this.g;
    }

    public final void a(k kVar) {
        this.b = kVar;
    }

    public final void a(List<CampaignEx> list) {
        this.p = list;
    }
}
