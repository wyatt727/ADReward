package com.bytedance.sdk.openadsdk.tsL;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.json.t2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayablePlugin.java */
/* loaded from: classes2.dex */
public class QQ {
    private int As;
    private String Aw;
    private IPb BQ;
    private int Cia;
    private WebView CsQ;
    private int HR;
    private Runnable HX;
    private boolean In;
    private String Jpu;
    private boolean Jy;
    private int JyA;
    private String KJ;
    private mZx KO;
    private Td Ko;
    private Runnable MxO;
    private JSONObject OnO;
    private JSONObject PP;
    private String QI;
    private String QN;
    private String Rd;
    private Context TZE;
    private boolean VM;
    private EYQ XL;
    private int XNX;
    private boolean Yd;
    private com.bytedance.sdk.openadsdk.tsL.EYQ aEX;
    private int dbE;
    private int eFB;
    private String hv;
    private Runnable nWX;
    private int oCs;
    private String oIw;
    private int oZ;
    private Runnable pi;
    private float rM;
    private String sOZ;
    private String tC;
    private Runnable tp;
    private WeakReference<View> wG;
    private int xO;
    private int zX;
    private String zzY;
    private final String IPb = "playable_stuck_check_ping";
    private final String VwS = "playable_apply_media_permission_callback";
    private final Handler QQ = new Handler(Looper.getMainLooper());
    private final Handler tsL = new Handler(Looper.getMainLooper());
    private boolean hu = true;
    private boolean UB = true;
    private boolean Uc = true;
    public final String EYQ = "PL_sdk_playable_global_viewable";
    public final String mZx = "PL_sdk_page_screen_blank";
    public final String Td = "PL_sdk_playable_destroy_analyze_summary";
    public final String Pm = "PL_sdk_playable_hardware_dialog_cancel";
    public final String Kbd = "PL_sdk_playable_hardware_dialog_setting";
    private Set<String> hYh = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
    private String zF = null;
    private String WU = "embeded_ad";
    private boolean XN = true;
    private boolean NZ = true;
    private boolean tPj = false;
    private String wBa = "";
    private long rfB = 10;
    private long lEs = 10;
    private int xt = 700;
    private long Nvm = 0;
    private long FH = 0;
    private long tr = -1;
    private long Tnp = -1;
    private long FtN = -1;
    private long PI = -1;
    private long kf = -1;
    private long mN = -1;
    private long Kbc = -1;
    private String Pf = "";
    private String vD = "";
    private String lRN = "";
    private String XPd = "";
    private int Dal = 0;
    private int wJ = 0;
    private boolean wa = false;
    private int KR = 0;
    private int na = -1;
    private int TQF = 0;
    private int OtA = 0;
    private int TZn = 0;
    private String VOV = null;
    private boolean Nuq = false;
    private int xh = 0;
    private int dVQ = 0;
    private int GfQ = 0;
    private int by = 0;
    private long VEW = 0;
    private long Dd = 0;
    private int Hnh = 0;
    private int XT = 0;
    private int eVP = 0;
    private JSONObject dub = new JSONObject();
    private Map<String, String> oB = new HashMap();
    private JSONObject VC = new JSONObject();
    private String VQ = "";
    private float qxY = 0.0f;
    private float lJ = 0.0f;
    private boolean KvC = false;
    private boolean WgU = false;
    private boolean yK = false;
    private List<JSONObject> OMh = new ArrayList();
    private boolean TfI = true;
    private volatile boolean ZFP = true;
    private volatile boolean HG = true;
    private ViewTreeObserver.OnGlobalLayoutListener CE = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                View view = (View) QQ.this.wG.get();
                if (view == null) {
                    return;
                }
                QQ.this.mZx(view);
            } catch (Throwable th) {
                VwS.EYQ("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };

    /* compiled from: PlayablePlugin.java */
    public enum EYQ {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public String kf() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    static /* synthetic */ int pi(QQ qq) {
        int i = qq.wJ;
        qq.wJ = i + 1;
        return i;
    }

    static /* synthetic */ int tsL(QQ qq) {
        int i = qq.Dal;
        qq.Dal = i + 1;
        return i;
    }

    private QQ(Context context, WebView webView, Td td, com.bytedance.sdk.openadsdk.tsL.EYQ eyq, EYQ eyq2) {
        this.eFB = -2;
        this.eFB = 0;
        this.XL = eyq2;
        this.CsQ = webView;
        HX.EYQ(webView);
        EYQ(webView);
        EYQ(context, td, eyq);
    }

    private void EYQ(Context context, Td td, com.bytedance.sdk.openadsdk.tsL.EYQ eyq) {
        this.zF = UUID.randomUUID().toString();
        this.TZE = context;
        this.aEX = eyq;
        this.Ko = td;
        tp.EYQ(eyq);
        this.BQ = new IPb(this);
        mN();
    }

    private void mN() {
        this.KO = new mZx(this, this.xt);
        this.HX = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.3
            @Override // java.lang.Runnable
            public void run() {
                if (QQ.this.XN) {
                    QQ.this.XN = false;
                    QQ.this.QQ.removeCallbacks(QQ.this.tp);
                    QQ.this.EYQ(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.tp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.4
            @Override // java.lang.Runnable
            public void run() {
                if (QQ.this.XN) {
                    QQ.this.XN = false;
                    QQ.this.ZFP = false;
                    QQ.this.QQ.removeCallbacks(QQ.this.HX);
                    QQ.this.EYQ(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.pi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.5
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (Build.VERSION.SDK_INT >= 19 && QQ.this.CsQ != null) {
                    QQ.this.CsQ.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.5.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (QQ.this.KO != null) {
                                QQ.this.KO.EYQ(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (QQ.this.tsL != null) {
                    QQ.this.tsL.postDelayed(this, 500L);
                }
            }
        };
        this.nWX = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.6
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                QQ.this.EYQ("playable_stuck_check_ping", new JSONObject());
                if (QQ.this.tsL != null) {
                    QQ.this.tsL.postDelayed(this, 500L);
                }
            }
        };
        this.MxO = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.7
            @Override // java.lang.Runnable
            public void run() {
                if (QQ.this.Dd <= 0) {
                    QQ.this.mZx(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (QQ.this.Dd - QQ.this.VEW <= QQ.this.xt) {
                        QQ.this.tr();
                        QQ.this.VEW = 0L;
                        QQ.this.Dd = 0L;
                        return;
                    }
                    QQ.this.mZx(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean MxO(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void EYQ(View view) {
        if (view == null) {
            return;
        }
        try {
            this.wG = new WeakReference<>(view);
            mZx(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.CE);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.XT == view.getWidth() && this.eVP == view.getHeight()) {
                return;
            }
            this.XT = view.getWidth();
            this.eVP = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.XT);
            jSONObject.put("height", this.eVP);
            EYQ("resize", jSONObject);
            this.dub = jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public Context EYQ() {
        return this.TZE;
    }

    public QQ EYQ(String str, String str2) {
        this.oB.put(str, str2);
        return this;
    }

    public Map<String, String> mZx() {
        return this.oB;
    }

    public QQ EYQ(String str) {
        this.sOZ = str;
        return this;
    }

    public QQ mZx(String str) {
        this.oIw = str;
        return this;
    }

    public JSONObject Td() {
        return this.PP;
    }

    public QQ Td(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.PP = jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public String Pm() {
        return this.oIw;
    }

    public String Kbd() {
        return this.sOZ;
    }

    public QQ Pm(String str) {
        this.zzY = str;
        return this;
    }

    public String IPb() {
        return this.zzY;
    }

    public QQ Kbd(String str) {
        this.tC = str;
        return this;
    }

    public String VwS() {
        return this.tC;
    }

    public QQ EYQ(boolean z) {
        this.In = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.In);
            EYQ("volumeChange", jSONObject);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean QQ() {
        return this.In;
    }

    public QQ EYQ(long j) {
        if (j <= 0) {
            this.rfB = 10L;
        } else {
            this.rfB = j;
        }
        return this;
    }

    public QQ mZx(long j) {
        if (j <= 0) {
            this.lEs = 10L;
        } else {
            this.lEs = j;
        }
        return this;
    }

    public QQ mZx(boolean z) throws JSONException {
        if (this.Jy == z) {
            return this;
        }
        this.Jy = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.Jy) {
                jSONObject.put("playable_background_show_type", this.dVQ);
            }
        } catch (JSONException unused) {
        }
        Td(this.Jy ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.Tnp == -1 && this.Jy) {
            this.Tnp = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", 1);
            } catch (JSONException unused2) {
            }
            Td("PL_sdk_page_show", jSONObject2);
        }
        if (this.Tnp != -1 && !this.Jy && !this.KvC) {
            this.KvC = true;
        }
        if (this.Jy) {
            this.tr = System.currentTimeMillis();
        } else if (this.tr != -1) {
            this.Nvm += System.currentTimeMillis() - this.tr;
            this.tr = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.Jy);
            EYQ(t2.g.b0, jSONObject3);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "setViewable error", th);
        }
        if (this.Jy) {
            tr();
        } else {
            Tnp();
        }
        return this;
    }

    public boolean HX() {
        return this.Jy;
    }

    public QQ Td(boolean z) {
        this.Yd = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Yd);
            EYQ("change_playable_click", jSONObject);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public JSONObject tp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Yd);
            return jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> MxO() {
        return this.BQ.EYQ();
    }

    public JSONObject tsL() {
        try {
            boolean zEYQ = Kbd.EYQ(this.TZE, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zEYQ);
            return jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject pi() {
        try {
            boolean zEYQ = Kbd.EYQ(this.TZE, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zEYQ);
            return jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject nWX() {
        boolean zEYQ;
        boolean zEYQ2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zEYQ = Kbd.EYQ(this.TZE, "android.permission.READ_MEDIA_IMAGES");
                zEYQ2 = true;
            } else {
                zEYQ = Kbd.EYQ(this.TZE, "android.permission.READ_EXTERNAL_STORAGE");
                zEYQ2 = Kbd.EYQ(this.TZE, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zEYQ);
            jSONObject.put("isHasWrite", zEYQ2);
            if (!zEYQ || !zEYQ2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void EYQ(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.tsL.EYQ eyq = this.aEX;
        if (eyq == null || eyq.mZx(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            mZx(strOptString2, strOptString);
        }
    }

    public void mZx(JSONObject jSONObject) {
        if (this.aEX != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject KO() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.XL.ordinal());
            jSONObject.put("safe_area_top_height", this.qxY);
            jSONObject.put("safe_area_bottom_height", this.lJ);
            jSONObject.put("playable_enter_from", this.OtA);
            jSONObject.put("playable_retry_count", this.TQF);
            jSONObject.put("playable_card_session", this.Pf);
            jSONObject.put("playable_video_session", this.vD);
            jSONObject.put("playable_network_type", hu());
            jSONObject.put("aweme_id", this.XPd);
            return jSONObject;
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void EYQ(String str, JSONObject jSONObject) {
        if (VwS.EYQ() && jSONObject != null) {
            jSONObject.toString();
        }
        Td td = this.Ko;
        if (td != null) {
            td.EYQ(str, jSONObject);
        }
    }

    public void mZx(String str, String str2) {
        Bitmap bitmapEYQ;
        if (TextUtils.isEmpty(str2) || (bitmapEYQ = Kbd.EYQ(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.TZE.getContentResolver(), bitmapEYQ, str, "");
    }

    public String hu() {
        com.bytedance.sdk.openadsdk.tsL.EYQ eyq;
        if (TextUtils.isEmpty(this.lRN) && (eyq = this.aEX) != null) {
            this.lRN = eyq.EYQ().toString();
        }
        return this.lRN;
    }

    public com.bytedance.sdk.openadsdk.tsL.EYQ UB() {
        return this.aEX;
    }

    public JSONObject Uc() {
        if (this.dub.isNull("width")) {
            View view = this.wG.get();
            if (view == null) {
                return this.dub;
            }
            mZx(view);
        }
        return this.dub;
    }

    public JSONObject hYh() {
        return this.VC;
    }

    public QQ Td(JSONObject jSONObject) {
        this.VC = jSONObject;
        return this;
    }

    public QQ IPb(String str) {
        int iIndexOf;
        String strDecode;
        this.VQ = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                EYQ(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            } else {
                String host = uri.getHost();
                if (t2.h.K.equalsIgnoreCase(host) || (host != null && host.contains(t2.h.K))) {
                    EYQ(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                } else if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.eFB == -1) {
                        EYQ(2);
                    } else {
                        EYQ(1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.KJ = str;
        return this;
    }

    public QQ EYQ(int i) {
        this.eFB = i;
        return this;
    }

    public JSONObject zF() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.rM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.oZ);
            jSONObject2.put("height", this.As);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.XNX);
            jSONObject3.put("y", this.JyA);
            jSONObject3.put("width", this.dbE);
            jSONObject3.put("height", this.Cia);
            jSONObject.put(t2.h.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.xO);
            jSONObject4.put("y", this.zX);
            jSONObject4.put("width", this.oCs);
            jSONObject4.put("height", this.HR);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void WU() {
        com.bytedance.sdk.openadsdk.tsL.EYQ eyq = this.aEX;
        if (eyq != null) {
            eyq.mZx();
        }
    }

    public void XN() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.kf > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.kf);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.FtN > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.FtN;
                this.Kbc = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            Td("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Pm(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.VOV = jSONObject.optString("section");
        }
    }

    public void NZ() {
        this.na = 2;
    }

    public void tPj() {
        this.Nuq = true;
    }

    public void wBa() {
        if (this.aEX != null) {
            EYQ eyq = EYQ.FEED_AWEME;
        }
    }

    public void rfB() {
        if (this.aEX != null) {
            EYQ eyq = EYQ.FEED_AWEME;
        }
    }

    public void Kbd(JSONObject jSONObject) {
        WebView webView;
        this.OnO = jSONObject;
        this.TZn++;
        Tnp();
        this.QQ.removeCallbacks(this.MxO);
        if (this.NZ) {
            this.mN = System.currentTimeMillis();
            this.VEW = System.currentTimeMillis();
            this.Dd = 0L;
            int i = this.eFB;
            if (i == 0) {
                if (Build.VERSION.SDK_INT >= 19 && (webView = this.CsQ) != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.8
                        @Override // android.webkit.ValueCallback
                        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            QQ.this.Dd = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                EYQ("playable_stuck_check_ping", new JSONObject());
            }
            this.QQ.postDelayed(this.MxO, this.xt);
        }
    }

    public void lEs() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.kf > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.kf);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.FtN > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.FtN);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            Td("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void IPb(JSONObject jSONObject) {
        mZx(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void xt() {
        mZx mzx;
        this.Dd = System.currentTimeMillis();
        int i = this.eFB;
        if ((i == 1 || i == 2) && (mzx = this.KO) != null) {
            mzx.EYQ(System.currentTimeMillis());
        }
    }

    public JSONObject VwS(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return tsL();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : nWX();
        }
        return pi();
    }

    public JSONObject QQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt != 1) {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        jSONObject2.put("result", Kbd.EYQ(this.TZE));
                    } else {
                        jSONObject2.put("result", false);
                    }
                }
                return jSONObject2;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject2.put("result", Kbd.mZx(this.TZE, "android.permission.CAMERA"));
            } else {
                jSONObject2.put("result", false);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            jSONObject2.put("result", Kbd.mZx(this.TZE, "android.permission.RECORD_AUDIO"));
        } else {
            jSONObject2.put("result", false);
        }
        return jSONObject2;
    }

    public void VwS(String str) {
        this.Hnh = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.FtN = jCurrentTimeMillis;
            long j = this.Tnp;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        Td("PL_sdk_html_load_start", jSONObject);
        this.ZFP = true;
        this.HG = true;
        if (this.TfI) {
            Nvm();
            this.ZFP = false;
            this.HG = false;
        }
        if (this.UB) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (Kbd.EYQ(this.TZE, Kbd.tsL)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (Kbd.mZx(this.TZE, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Kbd.EYQ(this.TZE, Kbd.MxO)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Kbd.EYQ(this.TZE, Kbd.tp)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Kbd.EYQ(this.TZE, Kbd.HX)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Kbd.EYQ(this.TZE, Kbd.QQ)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (Kbd.mZx(this.TZE, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Kbd.EYQ(this.TZE, Kbd.VwS)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (Kbd.EYQ(this.TZE)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                Td("PL_sdk_hardware_detect", jSONObject2);
                this.UB = false;
            } catch (Throwable th2) {
                VwS.EYQ("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void Nvm() {
        int i;
        int i2 = this.eFB;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.ZFP) {
                this.QQ.postDelayed(this.HX, this.rfB * 1000);
            }
            if ((this.HG && MxO(this.KJ)) || (i = this.eFB) == 1 || i == 2) {
                this.QQ.postDelayed(this.tp, this.lEs * 1000);
            }
        }
    }

    public void QQ(String str) {
        WebView webView;
        this.Hnh = 2;
        this.Rd = str;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.PI = jCurrentTimeMillis;
            long j = this.FtN;
            jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        Td("PL_sdk_html_load_finish", jSONObject);
        this.ZFP = false;
        this.QQ.removeCallbacks(this.HX);
        try {
            if (this.eFB == 0) {
                if (Build.VERSION.SDK_INT >= 19 && this.hu && (webView = this.CsQ) != null) {
                    this.hu = false;
                    webView.evaluateJavascript(kf(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.9
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                tr();
            }
        } catch (Throwable th2) {
            VwS.EYQ("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void FH() {
        this.ZFP = false;
        this.HG = false;
        this.QQ.removeCallbacks(this.HX);
        this.QQ.removeCallbacks(this.tp);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.FtN > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.FtN);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            Td("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void HX(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.Hnh = 3;
                tr();
            } else {
                this.Hnh = -2;
            }
            if (zOptBoolean || !this.XN) {
                return;
            }
            this.XN = false;
            this.ZFP = false;
            this.HG = false;
            this.QQ.removeCallbacks(this.HX);
            this.QQ.removeCallbacks(this.tp);
            EYQ(4, "CaseRenderFail");
        }
    }

    private void Td(int i, String str) {
        com.bytedance.sdk.openadsdk.tsL.EYQ eyq = this.aEX;
        if (eyq != null) {
            eyq.EYQ(i, str);
        }
    }

    protected void EYQ(int i, String str) {
        Tnp();
        Td(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "reportRenderFatal error", th);
        }
        Td("PL_sdk_global_faild", jSONObject);
    }

    public void mZx(int i, String str) {
        this.na = i;
        if (this.OnO == null) {
            this.OnO = new JSONObject();
        }
        try {
            this.OnO.put("playable_stuck_type", i);
            this.OnO.put("playable_stuck_reason", str);
            if (this.mN > 0) {
                this.OnO.put("playable_stuck_duration", System.currentTimeMillis() - this.mN);
            } else {
                this.OnO.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        Td("PL_sdk_page_stuck", this.OnO);
        Tnp();
        if (this.aEX == null || i != 2) {
            return;
        }
        this.OnO = new JSONObject();
    }

    protected void mZx(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Kbd(str, jSONObject);
    }

    private String Td(String str, String str2) {
        String queryParameter;
        if (TextUtils.isEmpty(this.Jpu) && !TextUtils.isEmpty(this.VQ)) {
            Uri uri = Uri.parse(this.VQ);
            String host = uri.getHost();
            String queryParameter2 = "";
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter2 = uri.getQueryParameter("surl");
                queryParameter = uri.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter2);
            if (!TextUtils.isEmpty(queryParameter)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter);
            }
            this.Jpu = builderAppendQueryParameter.toString();
        }
        return this.Jpu;
    }

    private String Pm(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.KJ = str3;
        return str3;
    }

    private void Kbc() {
        String str;
        if (this.VC == null || (str = this.KJ) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.VC.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.KJ).getHost();
        if (TextUtils.isEmpty(host)) {
            this.KJ += "/cid_" + strOptString;
            return;
        }
        this.KJ = this.KJ.replace(host, host + "/cid_" + strOptString);
    }

    private void Kbd(String str, JSONObject jSONObject) throws JSONException {
        try {
            int i = this.eFB;
            if (i == 0) {
                if (this.XL != EYQ.LAND_PAGE && !MxO(this.KJ)) {
                    Kbc();
                }
                jSONObject.put("playable_url", this.KJ);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", Pm(this.Aw, this.QI));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", Td(this.QN, this.hv));
            }
            jSONObject.put("playable_render_type", this.eFB);
            if (this.aEX != null) {
                if (this.eFB == 0 && (this.XL != EYQ.LAND_PAGE || MxO(this.KJ))) {
                    this.aEX.EYQ(jSONObject);
                } else if (this.eFB != 0) {
                    this.aEX.EYQ(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void Td(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.wa && this.wJ > 0) {
                this.wa = true;
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.Jy);
            jSONObject.put("playable_session_id", this.zF);
            int i = this.eFB;
            if (i == 0) {
                if (this.XL != EYQ.LAND_PAGE && !MxO(this.KJ)) {
                    Kbc();
                }
                jSONObject.put("playable_url", this.KJ);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", Pm(this.Aw, this.QI));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", Td(this.QN, this.hv));
            }
            jSONObject.put("playable_full_url", this.VQ);
            jSONObject.put("playable_replay_count", this.KR);
            jSONObject.put("playable_is_prerender", this.VM);
            jSONObject.put("playable_is_preload", this.wa);
            jSONObject.put("playable_render_type", this.eFB);
            jSONObject.put("playable_scenes_type", this.XL.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.QN) ? "" : this.QN);
            if (!TextUtils.isEmpty(this.hv)) {
                str2 = this.hv;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.Aw);
            jSONObject.put("playable_minigamelite_schema", this.QI);
            jSONObject.put("playable_is_debug", this.WgU);
            jSONObject.put("playable_retry_count", this.TQF);
            jSONObject.put("playable_enter_from", this.OtA);
            jSONObject.put("playable_sequence", this.TZn);
            jSONObject.put("playable_current_section", this.VOV);
            jSONObject.put("is_playable_finish", this.Nuq);
            jSONObject.put("playable_card_session", this.Pf);
            jSONObject.put("playable_video_session", this.vD);
            jSONObject.put("playable_network_type", hu());
            jSONObject.put("playable_lynx_version", this.wBa);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.WU);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.VC.opt("cid"));
            jSONObject2.put("log_extra", this.VC.opt("log_extra"));
            int i2 = this.eFB;
            if (i2 != -1 && i2 != -2) {
                if (this.aEX != null) {
                    List<JSONObject> list = this.OMh;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.OMh.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.eFB);
                                jSONObjectOptJSONObject.put("playable_url", this.KJ);
                            }
                            this.aEX.EYQ(jSONObjectOptJSONObject);
                        }
                        this.OMh.clear();
                    }
                    if (this.eFB == 0 && (this.XL != EYQ.LAND_PAGE || MxO(this.KJ))) {
                        this.aEX.EYQ(jSONObject);
                        return;
                    } else {
                        if (this.eFB != 0) {
                            this.aEX.EYQ(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.OMh == null) {
                this.OMh = new ArrayList();
            }
            this.OMh.add(jSONObject2);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void HX(String str) {
        this.QQ.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.10
            @Override // java.lang.Runnable
            public void run() {
                QQ.tsL(QQ.this);
            }
        });
    }

    public void tp(String str) {
        this.QQ.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tsL.QQ.2
            @Override // java.lang.Runnable
            public void run() {
                QQ.pi(QQ.this);
            }
        });
    }

    public void tr() {
        if (this.NZ) {
            this.mN = System.currentTimeMillis();
            if (this.XL == EYQ.FEED_AWEME) {
                if (this.Jy && this.Hnh == 3) {
                    mZx mzx = this.KO;
                    if (mzx != null && mzx.mZx()) {
                        Pf();
                        return;
                    } else {
                        if (this.KO == null) {
                            this.KO = new mZx(this, this.xt);
                            Pf();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.Jy && this.Hnh == 2) {
                mZx mzx2 = this.KO;
                if (mzx2 != null && mzx2.mZx()) {
                    Pf();
                } else if (this.KO == null) {
                    this.KO = new mZx(this, this.xt);
                    Pf();
                }
            }
        }
    }

    private void Pf() {
        Runnable runnable;
        Runnable runnable2;
        this.KO.EYQ(System.currentTimeMillis());
        Handler handler = this.tsL;
        if (handler != null) {
            int i = this.eFB;
            if (i == 0 && (runnable2 = this.pi) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.nWX) != null) {
                handler.post(runnable);
            }
            this.KO.EYQ(500);
        }
    }

    public void Tnp() {
        try {
            mZx mzx = this.KO;
            if (mzx != null) {
                mzx.EYQ();
            }
            Handler handler = this.tsL;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void FtN() {
        this.XT = 0;
        this.eVP = 0;
        this.rM = 0.0f;
        this.oZ = 0;
        this.As = 0;
        this.JyA = 0;
        this.XNX = 0;
        this.dbE = 0;
        this.Cia = 0;
        this.zX = 0;
        this.xO = 0;
        this.oCs = 0;
        this.HR = 0;
    }

    public void PI() {
        if (this.yK) {
            return;
        }
        this.yK = true;
        this.FH = 0L;
        this.UB = true;
        FtN();
        try {
            View view = this.wG.get();
            if (view != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this.CE);
                } else {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this.CE);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            this.BQ.mZx();
        } catch (Throwable unused2) {
        }
        try {
            mZx mzx = this.KO;
            if (mzx != null) {
                mzx.EYQ();
                this.KO = null;
            }
            Handler handler = this.tsL;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.KJ)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.Dal);
                jSONObject.put("playable_hit_times", this.wJ);
                int i = this.Dal;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.wJ / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                Td("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.KJ)) {
                if (this.tr != -1) {
                    this.Nvm += System.currentTimeMillis() - this.tr;
                    this.tr = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.Nvm);
                Td("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.ZFP = false;
        this.HG = false;
        this.QQ.removeCallbacks(this.HX);
        this.QQ.removeCallbacks(this.tp);
        this.QQ.removeCallbacksAndMessages(null);
    }

    public void EYQ(int i, String str, String str2) {
        this.Hnh = -1;
        this.Rd = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
        } catch (Throwable th) {
            VwS.EYQ("PlayablePlugin", "onWebReceivedError error", th);
        }
        Td("PL_sdk_html_load_error", jSONObject);
        if (this.XN) {
            this.XN = false;
            this.ZFP = false;
            this.HG = false;
            this.QQ.removeCallbacks(this.HX);
            this.QQ.removeCallbacks(this.tp);
            EYQ(1, "ContainerLoadFail");
        }
    }

    public void EYQ(boolean z, String str, int i) {
        if (z) {
            this.Hnh = -1;
            this.Rd = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
            } catch (Throwable th) {
                VwS.EYQ("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            Td("PL_sdk_html_load_error", jSONObject);
            if (this.XN) {
                this.XN = false;
                this.ZFP = false;
                this.HG = false;
                this.QQ.removeCallbacks(this.HX);
                this.QQ.removeCallbacks(this.tp);
                EYQ(1, "ContainerLoadFail");
            }
        }
    }

    public JSONObject Pm(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (VwS.EYQ() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectEYQ = this.BQ.EYQ(str, jSONObject);
        if (VwS.EYQ()) {
            System.currentTimeMillis();
            if (jSONObjectEYQ != null) {
                jSONObjectEYQ.toString();
            }
        }
        return jSONObjectEYQ;
    }

    public QQ Pm(boolean z) {
        this.TfI = z;
        return this;
    }

    public static QQ EYQ(Context context, WebView webView, Td td, com.bytedance.sdk.openadsdk.tsL.EYQ eyq) {
        if (webView == null || td == null || eyq == null) {
            return null;
        }
        return new QQ(context, webView, td, eyq, EYQ.LAND_PAGE);
    }
}
