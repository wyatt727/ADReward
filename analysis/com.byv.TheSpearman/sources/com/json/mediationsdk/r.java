package com.json.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.json.ca;
import com.json.dc;
import com.json.e2;
import com.json.i9;
import com.json.l4;
import com.json.m0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.bidding.BiddingDataCallback;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.RewardedVideoSmashListener;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.s9;
import com.json.x7;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r extends a0 implements RewardedVideoSmashListener, e2 {
    private b h;
    private s9 i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private Placement n;
    private long o;
    private String p;
    private JSONObject q;
    private int r;
    private String s;
    private final Object t;
    private final Object u;
    private long v;
    private final x7.a w;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i;
            boolean z;
            b bVar = r.this.h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || r.this.h == b.INIT_IN_PROGRESS) {
                if (r.this.h == bVar2) {
                    i = 1025;
                } else {
                    i = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                r.this.a(b.NOT_LOADED);
                z = true;
            } else {
                i = 510;
                z = false;
            }
            r.this.a(str);
            if (!z) {
                r.this.a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(r.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.this.h.name()}});
                return;
            }
            r.this.a(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(r.this.v())}});
            r.this.a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(r.this.v())}});
            r.this.i.c(r.this);
        }
    }

    protected enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public r(r rVar, s9 s9Var, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2) {
        this(rVar.l, rVar.m, rVar.b.h(), s9Var, rVar.k, abstractAdapter, i);
        this.p = str;
        this.q = jSONObject;
        this.r = i2;
        this.s = str2;
    }

    public r(String str, String str2, NetworkSettings networkSettings, s9 s9Var, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new m0(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.t = new Object();
        this.u = new Object();
        this.w = ca.g().b();
        this.l = str;
        this.m = str2;
        this.i = s9Var;
        this.j = null;
        this.k = i;
        this.f = i2;
        this.h = b.NO_INIT;
        this.v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f1908a.setPluginData(pluginType);
        } catch (Throwable th) {
            a("setCustomParams() " + th.getMessage());
        }
    }

    private void D() {
        synchronized (this.u) {
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new a(), this.k * 1000);
        }
    }

    private void E() {
        synchronized (this.u) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    private void a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.p)) {
            mapM.put("auctionId", this.p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        if (z && (placement = this.n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            mapM.put("placement", this.n.getPlacementName());
        }
        if (c(i)) {
            dc.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        dc.i().a(new l4(i, new JSONObject(mapM)));
        if (i == 1203) {
            this.w.b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.h + ", new state=" + bVar);
        synchronized (this.t) {
            this.h = bVar;
        }
    }

    private void b(int i) {
        b(i, null);
    }

    private boolean c(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f1908a.initRewardedVideoWithCallback(this.l, this.m, this.d, this);
        } catch (Throwable th) {
            b("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.o;
    }

    public boolean A() {
        if (this.h != b.LOADED) {
            return false;
        }
        try {
            return this.f1908a.isRewardedVideoAvailable(this.d);
        } catch (Throwable th) {
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(IronSourceConstants.RV_CAP_SESSION);
    }

    @Override // com.json.e2
    public Map<String, Object> a(AdData adData) {
        JSONObject jSONObjectA = adData != null ? i9.a(adData.getAdUnitData()) : null;
        if (p()) {
            return this.f1908a.getRewardedVideoBiddingData(this.d, jSONObjectA);
        }
        return null;
    }

    public void a(int i) {
        a(i, null, false);
    }

    public void a(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    @Override // com.json.e2
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(1020);
        try {
            this.f1908a.collectRewardedVideoBiddingData(this.d, adData != null ? i9.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    public void a(Placement placement) {
        E();
        a("showVideo()");
        this.n = placement;
        a(b.SHOW_IN_PROGRESS);
        b(1201);
        try {
            this.f1908a.showRewardedVideo(this.d, this);
        } catch (Throwable th) {
            b("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        b bVar;
        b bVar2;
        a("loadVideo() auctionId: " + this.p + " state: " + this.h);
        this.g = null;
        a(false);
        synchronized (this.t) {
            bVar = this.h;
            bVar2 = b.LOAD_IN_PROGRESS;
            if (bVar != bVar2 && bVar != b.SHOW_IN_PROGRESS) {
                a(bVar2);
            }
        }
        if (bVar == bVar2) {
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
            return;
        }
        if (bVar == b.SHOW_IN_PROGRESS) {
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
            return;
        }
        D();
        this.o = new Date().getTime();
        a(1001);
        try {
            if (p()) {
                this.f1908a.loadRewardedVideoForBidding(this.d, jSONObject, str, this);
            } else {
                C();
                this.f1908a.initAndLoadRewardedVideo(this.l, this.m, this.d, jSONObject, this);
            }
        } catch (Throwable th) {
            b("loadVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(p() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public void b(int i, Object[][] objArr) {
        a(i, objArr, true);
    }

    public void b(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? com.json.mediationsdk.metadata.a.g : "false";
        objArr[0] = objArr2;
        b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr);
    }

    @Override // com.json.mediationsdk.a0
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.json.mediationsdk.a0
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.json.mediationsdk.a0
    public int l() {
        return 2;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.i.b(this, this.n);
        b(1006);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.t) {
            if (this.h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.v = new Date().getTime();
                this.i.b(this);
            } else {
                b(1203);
                a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.h}});
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.i.f(this);
        b(IronSourceConstants.RV_INSTANCE_ENDED);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.i.d(this);
        b(1005);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.i.a(this, this.n);
        Map<String, Object> mapM = m();
        Placement placement = this.n;
        if (placement != null) {
            mapM.put("placement", placement.getPlacementName());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.n.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.n.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
        }
        if (!TextUtils.isEmpty(p.p().o())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, p.p().o());
        }
        if (p.p().t() != null) {
            for (String str : p.p().t().keySet()) {
                mapM.put(ContentMetadata.KEY_CUSTOM_PREFIX + str, p.p().t().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            mapM.put("auctionId", this.p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        if (c(1010)) {
            dc.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        l4 l4Var = new l4(1010, new JSONObject(mapM));
        l4Var.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(l4Var.d(), c()));
        long j = this.v;
        if (j != 0) {
            long j2 = time - j;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            l4Var.a("duration", Long.valueOf(j2));
        }
        dc.i().a(l4Var);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.t) {
            if (this.h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.i.a(ironSourceError, this);
                return;
            }
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.h}});
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.i.a(this);
        b(IronSourceConstants.RV_INSTANCE_STARTED);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(1206);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.h.name());
        synchronized (this.t) {
            if (this.h == b.LOAD_IN_PROGRESS) {
                a(z ? b.LOADED : b.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            } else {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            }
        }
        E();
        a(z ? 1002 : 1200, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z) {
            this.i.e(this);
        } else {
            this.i.c(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.t) {
            if (this.h == b.INIT_IN_PROGRESS) {
                a(b.NO_INIT);
                this.i.c(this);
                return;
            }
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.h}});
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.t) {
            if (this.h == b.INIT_IN_PROGRESS) {
                a(b.NOT_LOADED);
                return;
            }
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.h}});
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.g = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f1908a.getLoadWhileShowSupportState(this.d);
        } catch (Throwable th) {
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public Placement x() {
        return this.n;
    }

    public boolean y() {
        return this.h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }
}
