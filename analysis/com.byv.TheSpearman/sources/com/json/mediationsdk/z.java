package com.json.mediationsdk;

import android.text.TextUtils;
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
import com.json.mediationsdk.sdk.InterstitialSmashListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.o8;
import com.json.t2;
import com.json.tb;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class z extends a0 implements InterstitialSmashListener, e2 {
    private b h;
    private tb i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private long n;
    private JSONObject o;
    private final Object p;
    private boolean q;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.a("timed out state=" + z.this.h.name() + " isBidder=" + z.this.p());
            if (z.this.h == b.INIT_IN_PROGRESS && z.this.p()) {
                z.this.a(b.NO_INIT);
                return;
            }
            z.this.a(b.LOAD_FAILED);
            z.this.i.a(ErrorBuilder.buildLoadFailedError("timed out"), z.this, new Date().getTime() - z.this.n);
        }
    }

    protected enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public z(String str, String str2, NetworkSettings networkSettings, tb tbVar, int i, AbstractAdapter abstractAdapter) {
        super(new m0(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.p = new Object();
        this.h = b.NO_INIT;
        this.l = str;
        this.m = str2;
        this.i = tbVar;
        this.j = null;
        this.k = i;
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.h + ", new state=" + bVar);
        this.h = bVar;
    }

    private void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + c() + " : " + str, 0);
    }

    private void w() {
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

    private void y() {
        synchronized (this.p) {
            a("start timer");
            z();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new a(), this.k * 1000);
        }
    }

    private void z() {
        synchronized (this.p) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    @Override // com.json.e2
    public Map<String, Object> a(AdData adData) {
        JSONObject jSONObjectA = adData != null ? i9.a(adData.getAdUnitData()) : null;
        if (p()) {
            return this.f1908a.getInterstitialBiddingData(this.d, jSONObjectA);
        }
        return null;
    }

    public void a(int i, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                b("IS sendProviderEvent " + e.getMessage());
            }
        }
        o8.i().a(new l4(i, new JSONObject(mapM)));
    }

    @Override // com.json.e2
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, (Object[][]) null);
        try {
            this.f1908a.collectInterstitialBiddingData(this.d, adData != null ? i9.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.n = new Date().getTime();
            this.o = jSONObject;
            a(t2.g.K);
            a(false);
            if (p()) {
                y();
                a(b.LOAD_IN_PROGRESS);
                this.f1908a.loadInterstitialForBidding(this.d, jSONObject, str, this);
            } else if (this.h != b.NO_INIT) {
                y();
                a(b.LOAD_IN_PROGRESS);
                this.f1908a.loadInterstitial(this.d, jSONObject, this);
            } else {
                y();
                a(b.INIT_IN_PROGRESS);
                w();
                this.f1908a.initInterstitial(this.l, this.m, this.d, this);
            }
        } catch (Throwable th) {
            b("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    @Override // com.json.mediationsdk.a0
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    @Override // com.json.mediationsdk.a0
    public String k() {
        return "ProgIsSmash";
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        d("onInterstitialAdClicked");
        this.i.d(this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        d("onInterstitialAdClosed");
        this.i.c(this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        d("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        z();
        if (this.h != b.LOAD_IN_PROGRESS) {
            return;
        }
        a(b.LOAD_FAILED);
        this.i.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        d("onInterstitialAdOpened");
        this.i.a(this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        d("onInterstitialAdReady state=" + this.h.name());
        z();
        if (this.h != b.LOAD_IN_PROGRESS) {
            return;
        }
        a(b.LOADED);
        this.i.a(this, new Date().getTime() - this.n);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        d("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.i.b(ironSourceError, this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        d("onInterstitialAdShowSucceeded");
        this.i.f(this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        d("onInterstitialAdVisible");
        this.i.e(this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        d("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        if (this.h != b.INIT_IN_PROGRESS) {
            return;
        }
        z();
        a(b.NO_INIT);
        this.i.a(ironSourceError, this);
        if (p()) {
            return;
        }
        this.i.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        d("onInterstitialInitSuccess state=" + this.h.name());
        if (this.h != b.INIT_IN_PROGRESS) {
            return;
        }
        z();
        if (p() || this.q) {
            this.q = false;
            a(b.INIT_SUCCESS);
        } else {
            a(b.LOAD_IN_PROGRESS);
            y();
            try {
                this.f1908a.loadInterstitial(this.d, this.o, this);
            } catch (Throwable th) {
                b("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
            }
        }
        this.i.b(this);
    }

    public void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.q = true;
        a(b.INIT_IN_PROGRESS);
        w();
        try {
            if (p()) {
                this.f1908a.initInterstitialForBidding(this.l, this.m, this.d, this);
            } else {
                this.f1908a.initInterstitial(this.l, this.m, this.d, this);
            }
        } catch (Throwable th) {
            b(c() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public boolean u() {
        b bVar = this.h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    public boolean v() {
        if (this.h != b.LOADED) {
            return false;
        }
        try {
            return this.f1908a.isInterstitialReady(this.d);
        } catch (Throwable th) {
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_IS_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void x() {
        try {
            this.f1908a.showInterstitial(this.d, this);
        } catch (Throwable th) {
            b(c() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }
}
