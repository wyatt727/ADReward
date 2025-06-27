package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.Pm;
import com.bytedance.sdk.openadsdk.core.settings.nWX;
import com.bytedance.sdk.openadsdk.core.settings.pi;
import com.bytedance.sdk.openadsdk.mZx.EYQ.nWX;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.json.i1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.Reward;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTSdkSettings.java */
/* loaded from: classes2.dex */
public class KO implements Kbd, pi.EYQ {
    private int KO;
    Pm.mZx<com.bytedance.sdk.openadsdk.mZx.EYQ.nWX> Kbd;
    private final tsL MxO;
    private final Pm.mZx<Map<String, Integer>> NZ;
    final Pm.mZx<ConcurrentHashMap<String, Integer>> Pm;
    private boolean UB;
    private final ConcurrentLinkedQueue<nWX.EYQ> Uc;
    private Set<String> VwS;
    private final BroadcastReceiver WU;
    private final Runnable XN;
    private QQ hYh;
    private int hu;
    private boolean nWX;
    private volatile boolean pi;
    private Pm.mZx<JSONObject> rfB;
    private final Set<String> tPj;
    private final HX tp;
    private final AtomicBoolean tsL;
    private final Pm.mZx<Set<String>> wBa;
    private static final String IPb = FH.nWX();
    private static final com.bytedance.sdk.component.VwS.QQ QQ = new com.bytedance.sdk.component.VwS.QQ("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.mZx().HX();
            com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.mZx().mZx(false);
            com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.mZx();
            com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.mZx().Td();
        }
    };
    public static String EYQ = "";
    public static String mZx = "IABTCF_TCString";
    private static boolean HX = false;
    private static final tp zF = new tp();
    static final ConcurrentHashMap<String, Integer> Td = new ConcurrentHashMap<>();

    /* compiled from: TTSdkSettings.java */
    private static final class EYQ {
        static final KO EYQ = new KO();
    }

    private static int Td(boolean z) {
        return z ? 20 : 5;
    }

    private KO() {
        this.VwS = Collections.synchronizedSet(new HashSet());
        this.tp = new HX();
        this.MxO = new tsL(new nWX.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.nWX.EYQ
            public void EYQ() {
                nWX.EYQ[] eyqArr;
                boolean unused = KO.HX = true;
                if (KO.this.Uc == null || KO.this.Uc.size() == 0 || (eyqArr = (nWX.EYQ[]) KO.this.Uc.toArray()) == null) {
                    return;
                }
                for (nWX.EYQ eyq : eyqArr) {
                    eyq.EYQ();
                }
            }
        });
        this.tsL = new AtomicBoolean(false);
        this.pi = false;
        this.nWX = false;
        this.KO = 5000;
        this.hu = 10;
        this.Uc = new ConcurrentLinkedQueue<>();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.WU = anonymousClass11;
        this.XN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.12
            @Override // java.lang.Runnable
            public void run() {
                KO.this.Pm(2);
                KO.this.VQ();
            }
        };
        this.Pm = new Pm.mZx<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> mZx(String str) {
                if (TextUtils.isEmpty(str)) {
                    return KO.Td;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                } catch (JSONException e) {
                    Log.i("TTAD.SdkSettings", e.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.NZ = new Pm.mZx<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> mZx(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt >= 0 && iOptInt <= 100) {
                                map.put(next, Integer.valueOf(iOptInt));
                            } else {
                                map.put(next, 100);
                            }
                        }
                    }
                    return map;
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.mZx("get applog rate from sp failed:" + e.getMessage());
                    return null;
                }
            }
        };
        this.tPj = new HashSet();
        this.wBa = new Pm.mZx<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public Set<String> mZx(String str) throws JSONException {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            KO.this.hu = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            KO.this.KO = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, i1.u, "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.rfB = new Pm.mZx<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public JSONObject mZx(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.Kbd = new Pm.mZx<com.bytedance.sdk.openadsdk.mZx.EYQ.nWX>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.mZx.EYQ.nWX mZx(String str) {
                com.bytedance.sdk.openadsdk.mZx.EYQ.nWX nwx = new com.bytedance.sdk.openadsdk.mZx.EYQ.nWX();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    nwx.EYQ(jSONObject.optInt("enable_strategy", 0) == 1);
                    nwx.EYQ(EYQ(jSONObject.optJSONObject(Reward.DEFAULT)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            nwx.EYQ(next, EYQ(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return nwx;
            }

            private nWX.EYQ EYQ(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new nWX.EYQ(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td() && !pi.EYQ()) {
                Context contextEYQ = hu.EYQ();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("_dataChanged");
                if (Build.VERSION.SDK_INT >= 33) {
                    contextEYQ.registerReceiver(anonymousClass11, intentFilter, 4);
                } else {
                    contextEYQ.registerReceiver(anonymousClass11, intentFilter);
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.SdkSettings", "", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void EYQ() {
        File file;
        try {
            mZx.EYQ();
            this.MxO.Td();
            this.tp.Td();
            Context contextEYQ = hu.EYQ();
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(contextEYQ.getDataDir(), "shared_prefs");
            } else {
                file = new File(contextEYQ.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String strReplace = file2.getName().replace(".xml", "");
                if (Build.VERSION.SDK_INT >= 24) {
                    contextEYQ.deleteSharedPreferences(strReplace);
                } else {
                    contextEYQ.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.IPb.Td(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void mZx(int i, boolean z) {
        Context contextEYQ = hu.EYQ();
        if (contextEYQ != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextEYQ.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z);
                intent.putExtra("_source", i);
                contextEYQ.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Rd() {
        Context contextEYQ;
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td() && (contextEYQ = hu.EYQ()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextEYQ.getPackageName());
                intent.setAction("_dataChanged");
                contextEYQ.sendBroadcast(intent);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.SdkSettings", "", th);
            }
        }
    }

    public static int mZx(Context context) {
        SharedPreferences sharedPreferencesPm;
        if (context == null || (sharedPreferencesPm = Pm(context)) == null) {
            return -2;
        }
        if ((sharedPreferencesPm.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && sharedPreferencesPm.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true) {
            return sharedPreferencesPm.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    public static String Td(Context context) {
        SharedPreferences sharedPreferencesPm;
        return (context == null || (sharedPreferencesPm = Pm(context)) == null) ? "" : sharedPreferencesPm.getString(mZx, "");
    }

    private static SharedPreferences Pm(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Kbd Jpu() {
        if (hu.EYQ() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("context is null");
            Log.e("Pangle", "context is null", illegalStateException);
            ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
            return zF;
        }
        return EYQ.EYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public synchronized void mZx() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = !this.pi;
        this.tp.EYQ(this.pi);
        this.MxO.EYQ(this.pi);
        mZx.EYQ(z);
        com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm(rM());
        this.pi = true;
        Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (z) {
            com.bytedance.sdk.openadsdk.core.pi.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.7
                @Override // java.lang.Runnable
                public void run() {
                    if (pi.EYQ()) {
                        KO.this.Pm(1);
                        KO.this.VQ();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().mZx();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String Td() {
        return this.MxO.EYQ("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Pm() {
        return this.MxO.EYQ("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public JSONObject Kbd() {
        return (JSONObject) this.MxO.EYQ("digest", null, Pm.EYQ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public long IPb() {
        return this.MxO.EYQ("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void VwS() {
        this.MxO.EYQ().EYQ("tt_sdk_settings").EYQ("ab_test_param").EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void EYQ(JSONObject jSONObject, Pm.EYQ eyq) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        tsL tsl = this.MxO;
        String str = IPb;
        String strEYQ = tsl.EYQ("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strEYQ) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strEYQ)) {
            com.bytedance.sdk.openadsdk.core.pi.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.8
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(KO.this.MxO.EYQ("dyn_draw_engine_url", KO.IPb), strOptString)) {
                        com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.mZx().Td();
                    }
                }
            }, 5000L);
        }
        eyq.EYQ("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int EYQ(String str) {
        if (str == null) {
            return 0;
        }
        return hu.Pm().rfB(str).Uc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void mZx(JSONObject jSONObject, Pm.EYQ eyq) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            eyq.EYQ("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean QQ() {
        return this.MxO.EYQ("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean HX() {
        return !(this.MxO.EYQ("support_tnc", 1) == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String tp() {
        return this.MxO.EYQ("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int MxO() {
        return this.MxO.EYQ("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int tsL() {
        return this.MxO.EYQ("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean pi() {
        return this.MxO.EYQ("support_mem_dynamic", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int mZx(String str) {
        Integer num;
        Map map = (Map) this.MxO.EYQ("perf_con_stats_rate", Td, this.Pm);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int xt(String str) {
        Integer num;
        Map map = (Map) this.MxO.EYQ("perf_con_applog_rate", null, this.NZ);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int oB() {
        return this.MxO.EYQ("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public Set<String> nWX() {
        return JyA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int KO() {
        JyA();
        return this.hu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int hu() {
        JyA();
        return this.KO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean UB() {
        return this.MxO.EYQ("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Uc() {
        return this.MxO.EYQ("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean hYh() {
        return this.MxO.EYQ("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean CsQ() {
        return this.MxO.EYQ("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public long Ko() {
        long jEYQ = this.MxO.EYQ("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        if (jEYQ < 10000) {
            return 10000L;
        }
        return jEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int XT() {
        int iEYQ = this.MxO.EYQ("bus_con_token_thread_count", 4);
        if (iEYQ <= 0 || iEYQ > 30) {
            return 4;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String eVP() {
        return this.MxO.EYQ("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int zF() {
        return this.MxO.EYQ("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String WU() {
        return this.MxO.EYQ("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public QQ XN() {
        QQ qq = this.hYh;
        if (qq != null) {
            return qq;
        }
        QQ qq2 = (QQ) this.tp.EYQ("mediation_init_conf", QQ.EYQ, new Pm.mZx<QQ>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public QQ mZx(String str) {
                return new QQ(str);
            }
        });
        this.hYh = qq2;
        return qq2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean NZ() {
        return this.MxO.EYQ("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public long tPj() {
        return this.MxO.EYQ("duration", 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int wBa() {
        return this.MxO.EYQ(AppLovinMediationProvider.MAX, 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public IPb rfB() {
        return (IPb) this.MxO.EYQ("insert_js_config", IPb.EYQ, new Pm.mZx<IPb>() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.mZx
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public IPb mZx(String str) {
                return new IPb(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String lEs() {
        return this.MxO.EYQ("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int xt() {
        int iEYQ = this.MxO.EYQ("fetch_tpl_timeout_ctrl", 3000);
        if (iEYQ <= 0) {
            return 3000;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Nvm() {
        int iEYQ = this.MxO.EYQ("fetch_tpl_second", 0);
        if (iEYQ <= 0) {
            return 0;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void FH() {
        if (Build.VERSION.SDK_INT >= 17) {
            String strLJ = lJ();
            if (TextUtils.isEmpty(strLJ)) {
                return;
            }
            if (strLJ.equals("zh-Hant")) {
                com.bytedance.sdk.component.utils.tp.EYQ(hu.EYQ(), "zh", "tw");
            } else {
                com.bytedance.sdk.component.utils.tp.EYQ(hu.EYQ(), strLJ, null);
            }
            try {
                TTAdDislikeToast.EYQ();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.SdkSettings", th.getMessage());
            }
        }
    }

    private String lJ() {
        return this.MxO.EYQ("force_language", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int tr() {
        return this.MxO.EYQ("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Td(String str) {
        return rfB(str).Td == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Pm(String str) {
        return rfB(str).xt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Kbd(String str) {
        int i = rfB(str).Kbd;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.hu.Td(hu.EYQ()) != 0;
        }
        return com.bytedance.sdk.component.utils.hu.Pm(hu.EYQ());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean IPb(String str) {
        return rfB(str).VwS == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int VwS(String str) {
        return rfB(str).UB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean QQ(String str) {
        return str == null || rfB(str).pi == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int HX(String str) {
        if (str == null) {
            return 1500;
        }
        return rfB(str).KO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int tp(String str) {
        return rfB(str).MxO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean MxO(String str) {
        try {
            return rfB(str).XN != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Tnp() {
        return this.MxO.mZx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int tsL(String str) {
        return rfB(String.valueOf(str)).QQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean pi(String str) {
        return tsL(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int nWX(String str) {
        return rfB(str).tp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int EYQ(String str, boolean z) {
        if (str == null) {
            return Td(z);
        }
        com.bytedance.sdk.openadsdk.core.settings.EYQ eyqRfB = rfB(str);
        return eyqRfB.tPj != -1 ? eyqRfB.tPj : Td(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean KO(String str) {
        return rfB(str).WU == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean hu(String str) {
        return str == null || DeviceUtils.QQ(hu.EYQ()) == 0 || rfB(str).tsL == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String FtN() {
        return this.MxO.EYQ("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String PI() {
        return this.MxO.EYQ("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String kf() {
        return this.MxO.EYQ("apm_url", "");
    }

    private int rM() {
        return this.MxO.EYQ("coppa", -99);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String mN() {
        return this.MxO.EYQ("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Kbc() {
        return this.MxO.EYQ("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String Pf() {
        return this.MxO.EYQ("dyn_draw_engine_url", IPb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String vD() {
        return this.MxO.EYQ("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int lRN() {
        return this.MxO.EYQ("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int EYQ(int i) {
        return rfB(String.valueOf(i)).Tnp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int mZx(int i) {
        return rfB(String.valueOf(i)).mZx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Td(int i) {
        return rfB(String.valueOf(i)).HX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int XPd() {
        return this.MxO.EYQ("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int UB(String str) {
        return rfB(str).hYh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Uc(String str) {
        return rfB(str).zF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int hYh(String str) {
        return rfB(str).wBa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int zF(String str) {
        return rfB(str).rfB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int WU(String str) {
        return rfB(str).lEs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean XN(String str) {
        return rfB(str).Nvm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean NZ(String str) {
        return rfB(str).FH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int tPj(String str) {
        return rfB(str).tr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean wBa(String str) {
        return hu.Pm().rfB(str).nWX == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public com.bytedance.sdk.openadsdk.core.settings.EYQ rfB(String str) {
        return mZx.EYQ(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean Dal() {
        int iEYQ = this.MxO.EYQ("privacy_ad_enable", Integer.MAX_VALUE);
        if (iEYQ == 1) {
            return true;
        }
        if (iEYQ == 0) {
            return false;
        }
        int iHu = FH.hu();
        return iHu == 1 || iHu == 2 || iHu == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int wJ() {
        int iEYQ = this.MxO.EYQ("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iEYQ != Integer.MAX_VALUE) {
            return iEYQ;
        }
        int iHu = FH.hu();
        if (iHu == 1 || iHu == 2) {
            return 2;
        }
        return iHu != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean XL() {
        return this.MxO.EYQ("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean KR() {
        boolean z = this.MxO.EYQ("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        Boolean.valueOf(z);
        return z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean na() {
        return this.MxO.EYQ("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean TQF() {
        return this.MxO.EYQ("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean lEs(String str) {
        Set set = (Set) this.MxO.EYQ("privacy_fields_allowed", Collections.emptySet(), Pm.mZx);
        if (set.isEmpty()) {
            int iHu = FH.hu();
            if (iHu != 1) {
                if (iHu != 2 && iHu != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean OtA() {
        return this.pi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean TZn() {
        return this.MxO.EYQ("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean VOV() {
        return this.MxO.EYQ("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Nuq() {
        int iEYQ = this.MxO.EYQ("perf_con_webview_cache_count", 0);
        if (iEYQ < 0) {
            return 0;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int xh() {
        int iEYQ = this.MxO.EYQ("perf_con_webview_cache_count_v3", 0);
        if (iEYQ < 0) {
            return 0;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int dVQ() {
        int iEYQ = this.MxO.EYQ("perf_con_webview_preload_cache", 0);
        if (iEYQ < 0) {
            return 0;
        }
        if (iEYQ > 5) {
            return 5;
        }
        int iNuq = Nuq();
        return iEYQ > iNuq ? iNuq : iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int GfQ() {
        int iEYQ = this.MxO.EYQ("perf_con_webview_preload_cache_v3", 0);
        if (iEYQ < 0) {
            return 0;
        }
        if (iEYQ > 5) {
            return 5;
        }
        int iXh = xh();
        return iEYQ > iXh ? iXh : iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String[] by() {
        Set<String> set;
        try {
            set = this.VwS;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.MxO.EYQ("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.VwS.add(jSONArray.getString(i));
                }
            }
            Set<String> setEYQ = tsL.EYQ(this.VwS);
            this.VwS = setEYQ;
            if (setEYQ != null) {
                if (setEYQ.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.VwS.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int VEW() {
        return this.MxO.EYQ("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public JSONObject Dd() {
        return (JSONObject) this.MxO.EYQ("video_cache_config", null, Pm.EYQ);
    }

    private long oZ() {
        long jEYQ = this.MxO.EYQ("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jEYQ < 0 || jEYQ > SignalManager.TWENTY_FOUR_HOURS_MILLIS) ? TTAdConstant.AD_MAX_EVENT_TIME : jEYQ;
    }

    private long As() {
        return this.MxO.EYQ("last_req_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void EYQ(long j) {
        this.MxO.EYQ().EYQ("last_req_time", j).EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void OnO() {
        this.nWX = true;
    }

    void VQ() {
        if (pi.EYQ()) {
            com.bytedance.sdk.openadsdk.core.pi.mZx().removeCallbacks(this.XN);
            com.bytedance.sdk.openadsdk.core.pi.mZx().postDelayed(this.XN, oZ());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void Pm(int i) {
        EYQ(i, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void EYQ(int i, boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.pi.Kbd() && i != 1 && i != 2) {
            if (z) {
                this.UB = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm())) {
                return;
            }
            if (this.UB) {
                this.UB = false;
                if (!z) {
                    z = true;
                }
            }
            long jAs = As();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jOZ = oZ();
            long j = jCurrentTimeMillis - jAs;
            if (!z && j < jOZ) {
                com.bytedance.sdk.openadsdk.core.IPb.EYQ.EYQ();
                return;
            }
            if (!pi.EYQ()) {
                mZx(i, z);
            } else if (this.tsL.compareAndSet(false, true)) {
                xt.mZx(new pi(this, this.MxO, this.tp));
                com.bytedance.sdk.openadsdk.core.pi.mZx().removeCallbacks(this.XN);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.pi.EYQ
    public void EYQ(boolean z) {
        this.tsL.set(false);
        VQ();
        if (z) {
            Rd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public void EYQ(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.WU, intentFilter, 4);
            } else {
                context.registerReceiver(this.WU, intentFilter);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.SdkSettings", "", e);
        }
        if (OtA()) {
            Pm(1);
            VQ();
        }
    }

    /* compiled from: TTSdkSettings.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.KO$11, reason: invalid class name */
    class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable mZx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.11.1
            @Override // java.lang.Runnable
            public void run() {
                xt.mZx(new com.bytedance.sdk.component.VwS.QQ("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            KO.this.mZx();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            xt.mZx(new com.bytedance.sdk.component.VwS.QQ("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.KO.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        KO.this.EYQ(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.QQ.EYQ().removeCallbacks(AnonymousClass11.this.mZx);
                        com.bytedance.sdk.component.utils.QQ.EYQ().postDelayed(AnonymousClass11.this.mZx, 10000L);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean eFB() {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(hu.EYQ())) {
            return this.MxO.EYQ("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int Hnh() {
        return this.MxO.EYQ("bus_con_send_log_type", 1);
    }

    private Set<String> JyA() {
        return (Set) this.MxO.EYQ("perf_con_applog_send", this.tPj, this.wBa);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int TZE() {
        return this.MxO.EYQ("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean wa() {
        int iEYQ = this.MxO.EYQ("perf_con_apm", 100);
        if (iEYQ == 0) {
            return false;
        }
        return iEYQ < 0 || iEYQ >= 100 || iEYQ > ((int) (Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public long wG() {
        return this.MxO.EYQ("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean dub() {
        return this.MxO.EYQ("perf_con_use_new_thread_pool", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public JSONObject VC() {
        return (JSONObject) this.MxO.EYQ("perf_con_thread_pool_config", new JSONObject(), this.rfB);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean BQ() {
        return this.MxO.EYQ("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean aEX() {
        return this.MxO.EYQ("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public String sOZ() {
        return this.MxO.EYQ("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public int oIw() {
        int iEYQ = this.MxO.EYQ("bus_con_auto_click_delay", 3000);
        if (iEYQ <= 0) {
            return 3000;
        }
        return iEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public com.bytedance.sdk.openadsdk.mZx.EYQ.nWX zzY() {
        return (com.bytedance.sdk.openadsdk.mZx.EYQ.nWX) this.MxO.EYQ("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.mZx.EYQ.nWX.EYQ, this.Kbd);
    }

    public static boolean PP() {
        return HX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Kbd
    public boolean KJ() {
        return this.MxO.EYQ("bus_con_video_keep_screen_on", 1) == 1;
    }
}
