package com.json.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.json.ca;
import com.json.d1;
import com.json.e4;
import com.json.environment.ContextProvider;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f1;
import com.json.i1;
import com.json.i4;
import com.json.l4;
import com.json.m0;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.AuctionRequestParams;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.demandOnly.a;
import com.json.mediationsdk.demandOnly.b;
import com.json.mediationsdk.demandOnly.m;
import com.json.mediationsdk.e;
import com.json.mediationsdk.l;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.sdk.BannerSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.o8;
import com.json.x7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d extends m implements BannerSmashListener, d1 {
    private e4 n;
    private e4 o;
    private String p;
    private String q;
    private f1 r;
    private e s;
    private ISDemandOnlyBannerLayout t;
    private final x7 u;
    private final x7.a v;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuctionRequestParams f1930a;

        a(AuctionRequestParams auctionRequestParams) {
            this.f1930a = auctionRequestParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(b.c.TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f1930a.getWaterfallString());
            d.this.a(b.c.TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f1930a.getWaterfallString()}});
            d.this.s.a(ContextProvider.getInstance().getApplicationContext(), this.f1930a, d.this);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter, e eVar) {
        super(new m0(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.u = ca.h().d();
        this.v = ca.g().b();
        this.f = j;
        this.p = str;
        this.q = str2;
        this.r = new f1();
        this.f1945a.initBannerForBidding(str, str2, this.c, this);
        this.s = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        o8.i().a(new l4(i, new JSONObject(mapJ)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, e4.a(this.n));
            a(this.r.b(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(b.c.TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.o = new e4();
                this.f1945a.initBannerForBidding(this.p, this.q, this.c, this);
                this.f1945a.loadBannerForDemandOnlyForBidding(this.c, str, this.t, this);
            }
        }
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.r = new f1();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(b.c.TROUBLESHOOTING_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.json.d1
    public void a(d.a aVar, int i, long j, int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        a.C0237a c0237a = new a.C0237a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        a(b.c.TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(b.c.TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0237a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0237a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            i1 i1Var = c0237a.get(0);
            this.r.a(i1Var.b());
            this.r.c(i1Var.g());
            this.r.b(i1Var.f());
            String strJ = i1Var.j();
            b(strJ);
            c(strJ);
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (!o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            a(new IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        this.n = new e4();
        w();
        if (this.s.a()) {
            u();
        } else {
            ironLog.verbose("can't load the banner the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new i4());
            i1 i1VarA = new a.C0237a(aVar2.h()).a(h());
            if (i1VarA == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strJ = i1VarA.j();
            if (strJ == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strJ);
            a(aVar2.a());
            a(aVar2.f());
            a(b.c.TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.r.a(i1VarA.b());
            this.n = new e4();
            w();
            this.f1945a.initBannerForBidding(this.p, this.q, this.c, this);
            this.f1945a.loadBannerForDemandOnlyForBidding(this.c, strJ, iSDemandOnlyBannerLayout, this);
        } catch (Exception e) {
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
        }
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.json.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                l.a(map, this.t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f1945a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f1945a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put("isDemandOnly", 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.b.d()));
            if (!TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                map.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.j);
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("Instance: " + h() + " " + e.getMessage());
        }
        return map;
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().a(l());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3304, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().b(l());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(b.c.TROUBLESHOOTING_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(e4.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        x7 x7Var = this.u;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int iA = x7Var.a(ad_unit);
        a(b.c.TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(e4.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(e4.a(this.n))}});
            this.v.b(ad_unit);
            a(this.r.c(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().c(l());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.r.a(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().d(l());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    AuctionRequestParams q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        AuctionRequestParams auctionRequestParams = new AuctionRequestParams(IronSource.AD_UNIT.BANNER);
        auctionRequestParams.a(arrayList);
        auctionRequestParams.b(str);
        auctionRequestParams.a(l());
        auctionRequestParams.b(IronSourceUtils.isEncryptedResponse());
        auctionRequestParams.a(true);
        auctionRequestParams.c(true);
        auctionRequestParams.a(this.t.getSize());
        return auctionRequestParams;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.t = null;
        AbstractAdapter abstractAdapter = this.f1945a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }
}
