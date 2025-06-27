package com.json;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.InterstitialListener;
import com.json.mediationsdk.sdk.OfferwallListener;
import com.json.mediationsdk.sdk.RewardedVideoListener;
import com.json.mediationsdk.sdk.SegmentListener;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class w9 implements RewardedVideoListener, InterstitialListener, i8, SegmentListener {

    /* renamed from: a, reason: collision with root package name */
    private RewardedVideoListener f2383a;
    private InterstitialListener b;
    private OfferwallListener c;
    private SegmentListener d;
    private v e;
    private InterstitialPlacement f = null;
    private String g = null;
    protected long h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdReady();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2385a;

        b(IronSourceError ironSourceError) {
            this.f2385a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdLoadFailed(this.f2385a);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdOpened();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdShowSucceeded();
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2388a;

        e(IronSourceError ironSourceError) {
            this.f2388a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdShowFailed(this.f2388a);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdClicked();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.b.onInterstitialAdClosed();
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.c.onOfferwallOpened();
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2392a;

        i(IronSourceError ironSourceError) {
            this.f2392a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.c.onOfferwallShowFailed(this.f2392a);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2393a;

        j(IronSourceError ironSourceError) {
            this.f2393a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.c.onGetOfferwallCreditsFailed(this.f2393a);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2394a;

        k(String str) {
            this.f2394a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.f2394a)) {
                return;
            }
            w9.this.d.onSegmentReceived(this.f2394a);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.c.onOfferwallClosed();
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2396a;

        m(boolean z) {
            this.f2396a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.c.onOfferwallAvailable(this.f2396a);
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdOpened();
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdClosed();
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2399a;

        p(boolean z) {
            this.f2399a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAvailabilityChanged(this.f2399a);
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdStarted();
        }
    }

    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdEnded();
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2402a;

        s(Placement placement) {
            this.f2402a = placement;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdRewarded(this.f2402a);
        }
    }

    class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f2403a;

        t(Placement placement) {
            this.f2403a = placement;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdClicked(this.f2403a);
        }
    }

    class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f2404a;

        u(IronSourceError ironSourceError) {
            this.f2404a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            w9.this.f2383a.onRewardedVideoAdShowFailed(this.f2404a);
        }
    }

    private class v extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f2405a;

        private v() {
        }

        /* synthetic */ v(w9 w9Var, k kVar) {
            this();
        }

        public Handler a() {
            return this.f2405a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f2405a = new Handler();
            Looper.loop();
        }
    }

    public w9() {
        v vVar = new v(this, null);
        this.e = vVar;
        vVar.start();
        this.h = new Date().getTime();
    }

    public void a(IronSourceError ironSourceError, Map<String, Object> map) throws JSONException {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.g)) {
                mediationAdditionalData.put("placement", this.g);
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        dc.i().a(new l4(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (a((Object) this.f2383a)) {
            a((Runnable) new u(ironSourceError));
        }
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        this.f = interstitialPlacement;
    }

    public void a(InterstitialListener interstitialListener) {
        this.b = interstitialListener;
    }

    public void a(OfferwallListener offerwallListener) {
        this.c = offerwallListener;
    }

    public void a(RewardedVideoListener rewardedVideoListener) {
        this.f2383a = rewardedVideoListener;
    }

    public void a(SegmentListener segmentListener) {
        this.d = segmentListener;
    }

    protected void a(Runnable runnable) {
        Handler handlerA;
        v vVar = this.e;
        if (vVar == null || (handlerA = vVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public void a(String str) {
        this.g = str;
    }

    @Override // com.json.i8
    public void a(boolean z, IronSourceError ironSourceError) throws JSONException {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
                mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        dc.i().a(new l4(302, mediationAdditionalData));
        if (a((Object) this.c)) {
            a((Runnable) new m(z));
        }
    }

    public void a(boolean z, Map<String, Object> map) throws JSONException {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.h;
        this.h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        dc.i().a(new l4(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (a((Object) this.f2383a)) {
            a((Runnable) new p(z));
        }
    }

    protected boolean a(Object obj) {
        return (obj == null || this.e == null) ? false : true;
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (a((Object) this.c)) {
            a((Runnable) new j(ironSourceError));
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (a((Object) this.b)) {
            a((Runnable) new f());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (a((Object) this.b)) {
            a((Runnable) new g());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (a((Object) this.b)) {
            a((Runnable) new b(ironSourceError));
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (a((Object) this.b)) {
            a((Runnable) new c());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (a((Object) this.b)) {
            a((Runnable) new a());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) throws JSONException {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            InterstitialPlacement interstitialPlacement = this.f;
            if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                mediationAdditionalData.put("placement", this.f.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        o8.i().a(new l4(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (a((Object) this.b)) {
            a((Runnable) new e(ironSourceError));
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialListener
    public void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (a((Object) this.b)) {
            a((Runnable) new d());
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public boolean onOfferwallAdCredited(int i2, int i3, boolean z) {
        OfferwallListener offerwallListener = this.c;
        boolean zOnOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i2, i3, z) : false;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallAdCredited(credits:" + i2 + ", totalCredits:" + i3 + ", totalCreditsFlag:" + z + "):" + zOnOfferwallAdCredited, 1);
        return zOnOfferwallAdCredited;
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (a((Object) this.c)) {
            a((Runnable) new l());
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (a((Object) this.c)) {
            a((Runnable) new h());
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (a((Object) this.c)) {
            a((Runnable) new i(ironSourceError));
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClicked(Placement placement) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new t(placement));
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new o());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new r());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new n());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdRewarded(Placement placement) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new s(placement));
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) throws JSONException {
        a(ironSourceError, (Map<String, Object>) null);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (a((Object) this.f2383a)) {
            a((Runnable) new q());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoListener
    public void onRewardedVideoAvailabilityChanged(boolean z) throws JSONException {
        a(z, (Map<String, Object>) null);
    }

    @Override // com.json.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a((Object) this.d)) {
            a((Runnable) new k(str));
        }
    }
}
