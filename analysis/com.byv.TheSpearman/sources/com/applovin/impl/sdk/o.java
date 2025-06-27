package com.applovin.impl.sdk;

import android.os.Build;
import com.applovin.impl.be;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.ve;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.i5;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {
    private static final int f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f973a;
    private final Map b = Collections.synchronizedMap(new HashMap());
    private final Set c = Collections.synchronizedSet(new HashSet());
    protected final k d;
    protected final t e;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f974a;

        /* renamed from: com.applovin.impl.sdk.o$a$a, reason: collision with other inner class name */
        class C0046a implements Thread.UncaughtExceptionHandler {
            C0046a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                a.this.f974a.L();
                if (t.a()) {
                    a.this.f974a.L().a("ErrorReporter", "Caught unhandled exception", th);
                }
            }
        }

        a(k kVar) {
            this.f974a = kVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:error_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.f974a.a(oj.T)).intValue());
            thread.setUncaughtExceptionHandler(new C0046a());
            return thread;
        }
    }

    public enum b {
        ANR("anr"),
        BLACK_VIEW("black_view"),
        CACHE_ERROR("cache_error"),
        CAUGHT_EXCEPTION("caught_exception"),
        CONSENT_FLOW_ERROR("consent_flow_error"),
        CRASH(AppMeasurement.CRASH_ORIGIN),
        DISPLAY_ERROR("display_error"),
        FILE_ERROR("file_error"),
        GENERIC("generic"),
        INTEGRATION_ERROR("integration_error"),
        MEDIA_ERROR("media_error"),
        NATIVE_ERROR("native_error"),
        NETWORK_ERROR("network_error"),
        TASK_EXCEPTION("task_exception"),
        TASK_LATENCY_ALERT("task_latency_alert"),
        TEMPLATE_ERROR("template_error"),
        WEB_VIEW_ERROR("web_view_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f976a;

        b(String str) {
            this.f976a = str;
        }

        public String b() {
            return this.f976a;
        }
    }

    public o(k kVar) {
        this.d = kVar;
        this.e = kVar.L();
        this.f973a = Executors.newFixedThreadPool(1, new a(kVar));
    }

    private JSONObject b(b bVar, Object obj, Map map) throws JSONException {
        Map mapA;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "event_type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.d.a(oj.x4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(tr.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", tr.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", tr.b());
            }
            if (this.d.y() != null) {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.d.z().s());
            } else {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.d.x().D());
            }
        }
        if (this.d.y() != null) {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.d.z().u());
            mapA = this.d.y().b();
        } else {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.d.x().v());
            mapA = this.d.x().A();
        }
        JsonUtils.putObject(jSONObject, "first_install", mapA.get("first_install_v2"));
        JsonUtils.putStringIfValid(jSONObject, "rid", UUID.randomUUID().toString());
        JsonUtils.putStringIfValid(jSONObject, "applovin_random_token", this.d.c0());
        JsonUtils.putStringIfValid(jSONObject, "compass_random_token", this.d.p());
        JsonUtils.putStringIfValid(jSONObject, "ts_ms", String.valueOf(System.currentTimeMillis()));
        JsonUtils.putStringIfValid(jSONObject, "cfug", String.valueOf(this.d.q().getConsentFlowUserGeography()));
        a(obj, map);
        JsonUtils.putObject(jSONObject, "extra_parameters", map);
        JsonUtils.putStringIfValid(jSONObject, "sdk_version", String.valueOf(AppLovinSdk.VERSION));
        JsonUtils.putStringIfValid(jSONObject, i5.x, Build.VERSION.RELEASE);
        JsonUtils.putStringIfValid(jSONObject, "api_level", String.valueOf(Build.VERSION.SDK_INT));
        JsonUtils.putStringIfValid(jSONObject, "brand", Build.MANUFACTURER);
        JsonUtils.putStringIfValid(jSONObject, "brand_name", Build.BRAND);
        JsonUtils.putStringIfValid(jSONObject, "hardware", Build.HARDWARE);
        JsonUtils.putStringIfValid(jSONObject, "revision", Build.DEVICE);
        JsonUtils.putStringIfValid(jSONObject, i5.u, Build.MODEL);
        JsonUtils.putStringIfValid(jSONObject, ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.d.q().getCountryCode());
        JsonUtils.putStringIfValid(jSONObject, "aei", String.valueOf(this.d.a(oj.z)));
        JsonUtils.putStringIfValid(jSONObject, "mei", String.valueOf(this.d.a(oj.A)));
        JsonUtils.putStringIfValid(jSONObject, i5.r, (String) this.d.a(oj.B));
        JsonUtils.putObject(jSONObject, "package_name", mapA.get("package_name"));
        JsonUtils.putObject(jSONObject, "app_version", mapA.get("app_version"));
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.d.Q());
        JsonUtils.putInt(jSONObject, "installed_mediation_adapters_count", ve.a(this.d).length());
        JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", com.applovin.impl.v.b());
        return jSONObject;
    }

    private Map c(b bVar, Object obj, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.d.a(oj.x4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(tr.d()), map2);
                CollectionUtils.putStringIfValid("wvv", tr.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", tr.b(), map2);
            }
            if (this.d.y() != null) {
                CollectionUtils.putStringIfValid("oglv", this.d.z().s(), map2);
            } else {
                CollectionUtils.putStringIfValid("oglv", this.d.x().D(), map2);
            }
        }
        if (this.d.y() != null) {
            map2.put("platform", this.d.z().u());
        } else {
            map2.put("platform", this.d.x().v());
        }
        map2.put("applovin_random_token", this.d.c0());
        map2.put("compass_random_token", this.d.p());
        map2.put(i5.u, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put(i5.x, Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), map2);
        map2.put("aei", String.valueOf(this.d.a(oj.z)));
        map2.put("mei", String.valueOf(this.d.a(oj.A)));
        map2.put(i5.r, (String) this.d.a(oj.B));
        a(map2);
        a(obj, map2);
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(b bVar, Object obj, Map map) {
        if (t.a()) {
            this.e.a("ErrorReporter", "Reporting " + bVar.b() + " with extra parameters " + map);
        }
        if (zp.a((Integer) this.d.a(oj.m))) {
            f(bVar, obj, map);
        }
        if (((Boolean) this.d.a(oj.n)).booleanValue()) {
            g(bVar, obj, map);
        }
    }

    private void f(b bVar, Object obj, Map map) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) a(bVar, obj, map).openConnection();
            try {
                int i = f;
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod("POST");
                int responseCode = httpURLConnection.getResponseCode();
                if (t.a()) {
                    this.e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.b.put(bVar, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (t.a()) {
                        this.e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                    }
                } finally {
                    zp.a(httpURLConnection, this.d);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    private void g(b bVar, Object obj, Map map) {
        String str = (String) this.d.a(oj.p);
        if (!StringUtils.isValidString(str) || !zp.a((Integer) this.d.a(oj.o))) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = b(bVar, obj, map).toString().getBytes(C.UTF8_NAME);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (t.a()) {
                    this.e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.b.put(bVar, Long.valueOf(System.currentTimeMillis()));
                zp.a(httpURLConnection2, this.d);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (t.a()) {
                        this.e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                    }
                } finally {
                    zp.a(httpURLConnection, this.d);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void a(String str, Throwable th, Map map) {
        map.put(FirebaseAnalytics.Param.SOURCE, str);
        map.put("top_main_method", th.toString());
        a(b.CAUGHT_EXCEPTION, map);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        if (bVar != null) {
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().toString(), map);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), map);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), map);
            CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), map);
            CollectionUtils.putStringIfValid("ad_domain", bVar.getAdDomain(), map);
            CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_VIDEO_URL, bVar.P(), map);
        }
        map.put(FirebaseAnalytics.Param.SOURCE, str);
        map.put("top_main_method", str2);
        a(b.MEDIA_ERROR, (Map) map);
    }

    public void a(String str, String str2, int i) {
        a(str, str2, i, new HashMap());
    }

    public void a(String str, String str2, int i, HashMap map) {
        if (i < 400) {
            return;
        }
        map.put(FirebaseAnalytics.Param.SOURCE, str);
        map.put("url", StringUtils.emptyIfNull(str2));
        map.put("code", String.valueOf(i));
        a(b.NETWORK_ERROR, (Map) map);
    }

    public void a(b bVar, String str) {
        a(bVar, str, (Map) new HashMap());
    }

    public void a(b bVar, String str, Map map) {
        map.put(FirebaseAnalytics.Param.SOURCE, str);
        a(bVar, map);
    }

    public void a(b bVar, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.c.add(str2)) {
            map.put(FirebaseAnalytics.Param.SOURCE, str);
            a(bVar, str, map);
        }
    }

    public void a(b bVar, Map map) {
        a(bVar, (Object) null, map, 0L);
    }

    public void a(b bVar, Map map, long j) {
        a(bVar, (Object) null, map, j);
    }

    public void a(final b bVar, final Object obj, final Map map, long j) {
        if (a(bVar, j)) {
            return;
        }
        try {
            if (zp.h()) {
                this.f973a.execute(new Runnable() { // from class: com.applovin.impl.sdk.o$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(bVar, obj, map);
                    }
                });
            } else {
                d(bVar, obj, map);
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
            }
        }
    }

    private URL a(b bVar, Object obj, Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb.append("?");
        Iterator it = c(bVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), C.UTF8_NAME);
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME);
            sb.append(strEncode);
            sb.append(t2.i.b);
            sb.append(strEncode2);
            if (it.hasNext()) {
                sb.append(t2.i.c);
            }
        }
        return new URL(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.k.k()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.k.k()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map):void");
    }

    private void a(Object obj, Map map) {
        if (obj == null) {
            obj = this.d.E().a();
        }
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) obj).getAdIdNumber()));
        } else if (obj instanceof be) {
            be beVar = (be) obj;
            map.put("fs_ad_network", beVar.getNetworkName());
            map.put("fs_ad_creative_id", beVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(b bVar, long j) {
        Long l = (Long) this.b.get(bVar);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }
}
