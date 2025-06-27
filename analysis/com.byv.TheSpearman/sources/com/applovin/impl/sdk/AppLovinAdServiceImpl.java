package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.h0;
import com.applovin.impl.h8;
import com.applovin.impl.mb;
import com.applovin.impl.n9;
import com.applovin.impl.nm;
import com.applovin.impl.oj;
import com.applovin.impl.pm;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.tm;
import com.applovin.impl.up;
import com.applovin.impl.w;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0042a {

    /* renamed from: a, reason: collision with root package name */
    private final k f891a;
    private final t b;
    private final Map c;
    private final Object d = new Object();
    private final Map e = Collections.synchronizedMap(new HashMap());
    private final AtomicReference f = new AtomicReference();

    class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f893a;
        final /* synthetic */ com.applovin.impl.sdk.ad.b b;
        final /* synthetic */ AppLovinAdView c;
        final /* synthetic */ Uri d;

        b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f893a = aVar;
            this.b = bVar;
            this.c = appLovinAdView;
            this.d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            if (this.f893a != null) {
                AppLovinAdServiceImpl.this.f891a.f0().resumeForClick();
                bc.a(this.f893a.e(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f891a.f0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.f893a;
            if (aVar != null) {
                aVar.x();
                bc.c(this.f893a.e(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.b, this.c, this.f893a, this.d);
        }
    }

    private class c implements mb {

        /* renamed from: a, reason: collision with root package name */
        private AppLovinAdLoadListener f894a;

        public c(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f894a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f891a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f891a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f891a);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f894a;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(appLovinAd);
            } else if (((Boolean) AppLovinAdServiceImpl.this.f891a.a(oj.D)).booleanValue()) {
                throw new IllegalStateException("Unable to notify listener about ad load");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            AppLovinAdServiceImpl.this.b(appLovinError, this.f894a);
            this.f894a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class d implements mb {

        /* renamed from: a, reason: collision with root package name */
        private final h0 f895a;
        private final e b;
        private final int c;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinAdServiceImpl.this.a(this.f895a, this);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f891a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f891a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f891a);
            }
            Collection collectionEmptySet = Collections.emptySet();
            synchronized (this.b.f896a) {
                if (!this.b.d) {
                    collectionEmptySet = new HashSet(this.b.e);
                    this.b.e.clear();
                }
                e eVar = this.b;
                eVar.c = 0;
                eVar.b = false;
                eVar.d = false;
            }
            Iterator it = collectionEmptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            e eVar;
            int i;
            Collections.emptySet();
            synchronized (this.b.f896a) {
                AppLovinAdSize appLovinAdSizeF = this.f895a.f();
                if (!a(appLovinAdSizeF) || (i = (eVar = this.b).c) >= this.c) {
                    HashSet hashSet = new HashSet(this.b.e);
                    this.b.e.clear();
                    e eVar2 = this.b;
                    eVar2.c = 0;
                    eVar2.b = false;
                    eVar2.d = false;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
                    }
                } else {
                    int i2 = i + 1;
                    eVar.c = i2;
                    int iPow = (int) Math.pow(2.0d, i2);
                    t unused = AppLovinAdServiceImpl.this.b;
                    if (t.a()) {
                        AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Failed to load ad of zone {" + this.f895a.e() + "} with size " + appLovinAdSizeF + ". Current retry attempt: " + this.b.c + " of " + this.c + ". Retrying again in " + iPow + " seconds...");
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$d$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    }, TimeUnit.SECONDS.toMillis(iPow));
                }
            }
        }

        private boolean a(AppLovinAdSize appLovinAdSize) {
            return appLovinAdSize == null ? ((Boolean) AppLovinAdServiceImpl.this.f891a.a(oj.I)).booleanValue() : AppLovinAdServiceImpl.this.f891a.c(oj.H).contains(appLovinAdSize.getLabel());
        }

        private d(h0 h0Var, e eVar) {
            this.f895a = h0Var;
            this.b = eVar;
            if (Boolean.parseBoolean(AppLovinAdServiceImpl.this.f891a.g0().getExtraParameters().get("disable_auto_retries"))) {
                this.c = -1;
            } else {
                this.c = ((Integer) AppLovinAdServiceImpl.this.f891a.a(oj.G)).intValue();
            }
        }

        /* synthetic */ d(AppLovinAdServiceImpl appLovinAdServiceImpl, h0 h0Var, e eVar, a aVar) {
            this(h0Var, eVar);
        }
    }

    AppLovinAdServiceImpl(k kVar) {
        this.f891a = kVar;
        this.b = kVar.L();
        HashMap map = new HashMap(6);
        this.c = map;
        a aVar = null;
        map.put(h0.c(), new e(aVar));
        map.put(h0.k(), new e(aVar));
        map.put(h0.j(), new e(aVar));
        map.put(h0.m(), new e(aVar));
        map.put(h0.b(), new e(aVar));
        map.put(h0.h(), new e(aVar));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        if (this.f891a.y() != null) {
            this.f891a.y().a(appLovinBidTokenCollectionListener);
        } else {
            this.f891a.x().a(appLovinBidTokenCollectionListener);
        }
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.e);
            this.e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (t.a()) {
            this.b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strH = this.f891a.y() != null ? this.f891a.y().h() : this.f891a.x().C();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strH) && t.a()) {
            this.b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strH;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            t.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.w wVar = new com.applovin.impl.w(strTrim, this.f891a);
        AppLovinAdLoadListener cVar = ((Boolean) this.f891a.a(oj.C)).booleanValue() ? new c(appLovinAdLoadListener) : appLovinAdLoadListener;
        if (wVar.c() == w.a.REGULAR) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Loading next ad for token: " + wVar);
            }
            a(new pm(wVar, cVar, this.f891a));
            return;
        }
        if (wVar.c() != w.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            t.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject jSONObjectA = wVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            t.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        c4.c(jSONObjectA, this.f891a);
        c4.b(jSONObjectA, this.f891a);
        c4.a(jSONObjectA, this.f891a);
        com.applovin.impl.sdk.e.b(this.f891a);
        if (JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Rendering ad for token: " + wVar);
            }
            a(new tm(jSONObjectA, zp.a(jSONObjectA, this.f891a), cVar, this.f891a));
            return;
        }
        if (t.a()) {
            this.b.b("AppLovinAdService", "No ad returned from the server for token: " + wVar);
        }
        c(AppLovinError.NO_FILL, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (t.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(h0.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.f891a.a(oj.s2)).booleanValue() && (l = (Long) this.f891a.b(qj.M)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.f891a.a(oj.t2)).longValue() && b()) {
            a();
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.s> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.s> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent, boolean z, Bundle bundle) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z2 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z, z2));
            if (this.f891a.b0() != null) {
                this.f891a.b0().b(bVar.d(motionEvent, false, z2), motionEvent);
            }
        } else if (t.a()) {
            this.b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (bVar.isDirectDownloadEnabled()) {
            this.f891a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
        } else {
            a(bVar, appLovinAdView, aVar, uri);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j, List<Long> list, long j2, boolean z, int i) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.s> listC = bVar.c();
        if (listC == null || listC.isEmpty()) {
            if (t.a()) {
                this.b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.s sVar : listC) {
            String strA = a(sVar.c(), j, j2, list, z, i);
            String strA2 = a(sVar.a(), j, j2, list, z, i);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.s(strA, strA2));
            } else if (t.a()) {
                this.b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.F());
            if (this.f891a.b0() != null) {
                this.f891a.b0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j, int i, boolean z) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.s> listN0 = bVar.n0();
        if (listN0 == null || listN0.isEmpty()) {
            if (t.a()) {
                this.b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.s sVar : listN0) {
            if (StringUtils.isValidString(sVar.c())) {
                String strA = a(sVar.c(), j, i, string, z);
                String strA2 = a(sVar.a(), j, i, string, z);
                if (strA != null) {
                    a(new com.applovin.impl.s(strA, strA2));
                } else if (t.a()) {
                    this.b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                }
            } else if (t.a()) {
                this.b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f891a.L();
            if (t.a()) {
                this.f891a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f891a.B().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f896a;
        boolean b;
        int c;
        boolean d;
        final Collection e;

        private e() {
            this.f896a = new Object();
            this.e = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", isReloadingExpiredAd=" + this.d + ", pendingAdListeners=" + this.e + AbstractJsonLexerKt.END_OBJ;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private boolean b() {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        Context contextK = k.k();
        ApplicationExitInfo applicationExitInfo = ((ActivityManager) contextK.getSystemService("activity")).getHistoricalProcessExitReasons(contextK.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    public AppLovinAd dequeueAd(h0 h0Var) {
        AppLovinAdImpl appLovinAdImplA = this.f891a.g().a(h0Var);
        if (t.a()) {
            this.b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + h0Var + "...");
        }
        return appLovinAdImplA;
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, Bundle bundle, n9 n9Var, Context context) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
        } else {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z));
            if (this.f891a.b0() != null) {
                this.f891a.b0().b(bVar.d(motionEvent, true, z), motionEvent);
            }
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f891a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new a(bVar, uri, n9Var, context));
        } else {
            a(bVar, uri, n9Var, context);
        }
    }

    class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f892a;
        final /* synthetic */ Uri b;
        final /* synthetic */ n9 c;
        final /* synthetic */ Context d;

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            AppLovinAdServiceImpl.this.f891a.f0().resumeForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f891a.f0().pauseForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f892a, this.b, this.c, this.d);
        }

        a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
            this.f892a = bVar;
            this.b = uri;
            this.c = n9Var;
            this.d = context;
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0042a
    public void onAdExpired(h8 h8Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) h8Var;
        h0 adZone = appLovinAdImpl.getAdZone();
        if (t.a()) {
            this.b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f891a.g().b(appLovinAdImpl);
        if (this.f891a.D0() || !((Boolean) this.f891a.a(oj.q1)).booleanValue()) {
            return;
        }
        e eVarA = a(adZone);
        synchronized (eVarA.f896a) {
            if (!eVarA.b) {
                this.f891a.L();
                if (t.a()) {
                    this.f891a.L().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                eVarA.b = true;
                eVarA.d = true;
                a(adZone, new d(this, adZone, eVarA, null));
            } else if (t.a()) {
                this.b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h0 h0Var, d dVar) {
        AppLovinAdImpl appLovinAdImplE = this.f891a.g().e(h0Var);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + h0Var);
            }
            dVar.adReceived(appLovinAdImplE);
            return;
        }
        a(new nm(h0Var, dVar, this.f891a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(n9 n9Var) {
        if (n9Var != null) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            n9Var.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, n9Var);
        } else if (up.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f891a);
        } else {
            up.a(uri, context, this.f891a);
        }
    }

    private void a(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (h0Var == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f891a.L();
            if (t.a()) {
                this.f891a.L().a("AppLovinAdService", "Loading next ad of zone {" + h0Var + "}...");
            }
            e eVarA = a(h0Var);
            synchronized (eVarA.f896a) {
                eVarA.e.add(appLovinAdLoadListener);
                if (!eVarA.b) {
                    eVarA.b = true;
                    a(h0Var, new d(this, h0Var, eVarA, null));
                } else if (t.a()) {
                    this.b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(xl xlVar) {
        if (!this.f891a.y0()) {
            t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f891a.c();
        this.f891a.l0().a(xlVar, sm.b.CORE);
    }

    private void a(com.applovin.impl.s sVar) {
        if (StringUtils.isValidString(sVar.c())) {
            this.f891a.Z().e(com.applovin.impl.sdk.network.d.b().d(sVar.c()).a(StringUtils.isValidString(sVar.a()) ? sVar.a() : null).a(sVar.b()).a(false).b(sVar.d()).a());
        } else if (t.a()) {
            this.b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private e a(h0 h0Var) {
        e eVar;
        synchronized (this.d) {
            eVar = (e) this.c.get(h0Var);
            if (eVar == null) {
                eVar = new e(null);
                this.c.put(h0Var, eVar);
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f891a.B().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb = new StringBuilder();
            sb.append("notifyAdLoadFailedCallback");
            sb.append(appLovinAdLoadListener instanceof mb ? "V2" : "");
            this.f891a.B().a("AppLovinAdService", sb.toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f891a.a(oj.N)).booleanValue() || (context = ar.a(appLovinAdView, this.f891a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (n9) null);
        } else if (up.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f891a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f891a.B().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (up.a(uri, context, this.f891a)) {
            bc.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(String str) {
        String str2 = this.f891a.g0().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, final n9 n9Var) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f891a.g0().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (n9Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(n9Var);
                    }
                });
            } else {
                if (aVar == null || zp.a(bVar.getSize())) {
                    return;
                }
                if (t.a()) {
                    this.b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.y();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, kVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.x();
                return;
            }
            return;
        }
        kVar.L();
        if (t.a()) {
            kVar.L().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zA = up.a(uri, context, kVar);
        if (zA) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.a0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                bc.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zA;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f891a.L();
                if (t.a()) {
                    this.f891a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f891a.B().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j, long j2, List list, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != f.i) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(f.a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f891a.b(qj.N);
        if (str != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, null);
            a(new com.applovin.impl.s(JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null), JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null)));
        } else if (t.a()) {
            this.b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}
