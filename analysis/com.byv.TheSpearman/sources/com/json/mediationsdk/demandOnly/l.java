package com.json.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.json.AuctionRequestInstanceInfo;
import com.json.ca;
import com.json.d1;
import com.json.dc;
import com.json.e4;
import com.json.environment.ContextProvider;
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
import com.json.mediationsdk.demandOnly.j;
import com.json.mediationsdk.demandOnly.m;
import com.json.mediationsdk.demandOnly.n;
import com.json.mediationsdk.demandOnly.p;
import com.json.mediationsdk.e;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.x7;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, d1 {
    private e4 n;
    private e4 o;
    private ISDemandOnlyRewardedVideoListener p;
    private f1 q;
    private e r;
    private p s;
    private final x7 t;
    private final x7.a u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, e eVar) {
        super(new m0(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.s = new p.b();
        this.t = ca.h().d();
        this.u = ca.g().b();
        this.p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.f1945a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
    }

    private void a(int i, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        dc.i().a(new l4(i, new JSONObject(mapJ)));
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(1200, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(o oVar) {
        this.n = new e4();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.LOAD_ERROR, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new i4());
            i1 i1VarA = new a.C0237a(aVar.h()).a(h());
            if (i1VarA == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(j.a.LOAD_ERROR, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strJ = i1VarA.j();
            if (strJ == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(strJ);
            a(aVar.a());
            a(aVar.f());
            a(j.c.INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.q.a(i1VarA.b());
            this.o = new e4();
            this.f1945a.loadRewardedVideoForBidding(this.c, null, strJ, this);
        } catch (Exception e) {
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(j.c.INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f1945a.loadRewardedVideoForBidding(this.c, null, str, this);
            }
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private AuctionRequestParams r() {
        String str = i() + h();
        AuctionRequestParams auctionRequestParams = new AuctionRequestParams(this.m);
        auctionRequestParams.b(IronSourceUtils.isEncryptedResponse());
        auctionRequestParams.a(true);
        auctionRequestParams.c(true);
        auctionRequestParams.b(str);
        auctionRequestParams.a(l());
        auctionRequestParams.a(this.t.a(this.m));
        AuctionRequestInstanceInfo auctionRequestInstanceInfo = new AuctionRequestInstanceInfo(h(), false);
        auctionRequestInstanceInfo.a(this.s.getPlumbus());
        Map<String, Object> rewardedVideoBiddingData = this.f1945a.getRewardedVideoBiddingData(this.c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            auctionRequestInstanceInfo.b(rewardedVideoBiddingData);
        }
        auctionRequestParams.a(auctionRequestInstanceInfo);
        return auctionRequestParams;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.o = new e4();
        this.f1945a.loadRewardedVideo(this.c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(j.c.INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        AuctionRequestParams auctionRequestParamsR = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + auctionRequestParamsR.getWaterfallString());
        a(j.c.INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, auctionRequestParamsR.getWaterfallString()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), auctionRequestParamsR, this);
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new f1();
    }

    private void w() {
        this.n = new e4();
        a(s());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(j.a.LOAD_ERROR, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(j.c.INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    @Override // com.json.d1
    public void a(d.a aVar, int i, long j, int i2, String str) {
        String strJ;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        this.s = aVar.a(l());
        a.C0237a c0237a = new a.C0237a(aVar.h());
        if (c0237a.isEmpty()) {
            strJ = "";
        } else {
            i1 i1Var = c0237a.get(0);
            this.q.a(i1Var.b());
            this.q.c(i1Var.g());
            this.q.b(i1Var.f());
            strJ = i1Var.j();
            b(strJ);
        }
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        a(j.c.INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(j.c.INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0237a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0237a.isEmpty()) {
                c(strJ);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            a(ironSourceError);
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, e4.a(this.n));
            a(this.q.b(), IronSourceUtils.getCurrentMethodName());
            this.p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(m.a.LOADED)) {
            a(1211, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f1945a.isRewardedVideoAvailable(this.c);
            a(zIsRewardedVideoAvailable ? 1210 : 1211, (Object[][]) null);
        } catch (Exception e) {
            IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return zIsRewardedVideoAvailable;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(1201, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f1945a.showRewardedVideo(this.c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1006, new Object[0][]);
        this.p.onRewardedVideoAdClicked(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1203, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onRewardedVideoAdClosed(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1005, new Object[0][]);
        a(this.q.a(), IronSourceUtils.getCurrentMethodName());
        this.p.onRewardedVideoAdOpened(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> mapJ = j();
        if (!TextUtils.isEmpty(com.json.mediationsdk.p.p().o())) {
            mapJ.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.json.mediationsdk.p.p().o());
        }
        if (com.json.mediationsdk.p.p().t() != null) {
            for (String str : com.json.mediationsdk.p.p().t().keySet()) {
                mapJ.put(ContentMetadata.KEY_CUSTOM_PREFIX + str, com.json.mediationsdk.p.p().t().get(str));
            }
        }
        Placement placementA = com.json.mediationsdk.p.p().k().b().getRewardedVideoConfigurations().a();
        if (placementA != null) {
            mapJ.put("placement", placementA.getPlacementName());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_NAME, placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        l4 l4Var = new l4(1010, new JSONObject(mapJ));
        l4Var.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(l4Var.d(), h()));
        dc.i().a(l4Var);
        this.p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1206, new Object[0][]);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(j.c.INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(e4.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(j.c.INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(e4.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(1002, new Object[][]{new Object[]{"duration", Long.valueOf(e4.a(this.n))}});
            a(this.q.c(), IronSourceUtils.getCurrentMethodName());
            this.p.onRewardedVideoAdLoadSuccess(l());
        }
    }
}
