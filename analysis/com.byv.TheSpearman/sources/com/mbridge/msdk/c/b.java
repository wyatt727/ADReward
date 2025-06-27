package com.mbridge.msdk.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseSetting.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f2495a = 1500;
    private long G;
    private ArrayList<Integer> I;
    private d J;
    private C0255b K;
    private HashMap<String, String> P;
    private String Q;
    private int V;
    private String Y;
    private Map<String, String> Z;
    private boolean aE;
    private JSONArray aG;
    private JSONObject aH;
    private long aJ;
    private long aO;
    private boolean aP;
    private String aV;
    private String aZ;
    private int ai;
    private String al;
    private String am;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private long av;
    private long aw;
    private int m;
    private List<com.mbridge.msdk.foundation.entity.a> o;
    private long q;
    private com.mbridge.msdk.c.a r;
    private String s;
    private Map<String, a> t;
    private boolean u;
    private int v;
    private boolean b = false;
    private JSONArray c = new JSONArray();
    private JSONArray d = new JSONArray();
    private String e = "";
    private int f = 0;
    private int g = 0;
    private int h = 2;
    private int i = 0;
    private String j = "";
    private String k = "";
    private String l = "";
    private int n = 0;
    private int p = 0;
    private int w = 1;
    private boolean x = false;
    private String y = "";
    private String z = "";
    private String A = "";
    private String B = "";
    private String C = "";
    private int D = 120;
    private String E = com.mbridge.msdk.foundation.same.net.g.d.f().h;
    private String F = com.mbridge.msdk.foundation.same.net.g.d.f().l;
    private int H = f2495a;
    private int L = 0;
    private long M = 86400;
    private int N = 0;
    private int O = 3;
    private boolean R = true;
    private int S = 0;
    private boolean T = false;
    private boolean U = false;
    private int W = 0;
    private int X = 0;
    private String aa = "1.0";
    private int ab = 30;
    private int ac = 9377;
    private int ad = 0;
    private int ae = 5;
    private int af = 1;
    private int ag = 8000;
    private String ah = "";
    private int aj = 10;
    private int ak = 120;
    private String an = "";
    private String ao = "";
    private String at = "";
    private String au = "";
    private List<Integer> ax = new ArrayList();
    private int ay = 3;
    private int az = 0;
    private int aA = 3;
    private int aB = 0;
    private int aC = 10;
    private int aD = 600;
    private int aF = 0;
    private String aI = "";
    private int aK = 8000;
    private int aL = 1;
    private long aM = 10;
    private int aN = 3;
    private int aQ = 1;
    private int aR = 1;
    private int aS = 1;
    private int aT = 1;
    private String aU = "";
    private int aW = IronSourceConstants.RV_AUCTION_REQUEST;
    private int aX = 0;
    private int aY = 0;

    public static String a(Context context, String str) {
        try {
            g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB != null && ((b) gVarB).Z != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = ((b) gVarB).Z.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = ((b) gVarB).Z.get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", z.c());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(74:262|4|250|5|(1:7)(1:8)|9|(1:11)(1:12)|13|244|14|(1:25)(3:18|(4:21|(2:23|274)(1:275)|24|19)|273)|(1:27)|31|(1:33)|34|(1:36)(2:37|(4:41|(2:44|42)|295|45))|46|(1:49)|50|(5:54|(4:57|(2:59|277)(1:278)|60|55)|276|61|(1:63))|64|(6:240|66|(4:69|(1:293)(3:289|75|294)|290|67)|286|76|(1:78))|82|(2:86|(5:89|(4:92|(1:284)(3:281|96|285)|282|90)|279|98|87))|246|99|(1:101)|102|(1:104)|105|(1:109)|110|(6:265|111|(1:113)(1:114)|115|(1:117)(1:118)|119)|123|238|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|252|140|141|254|142|(1:144)(1:145)|146|149|(2:151|(1:153))|154|155|156|256|157|(3:267|161|(1:163)(1:164))|(2:271|165)|264|169|260|170|173|(3:258|175|(4:178|(3:182|248|183)|184|(3:188|242|189)))(3:269|194|(4:197|(2:201|(1:203))|204|(2:208|(1:210))))|217|(1:219)|220|(1:222)|223|296) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x059b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0686, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0687, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0696 A[Catch: Exception -> 0x06b8, TryCatch #6 {Exception -> 0x06b8, blocks: (B:5:0x0017, B:9:0x0064, B:13:0x00ac, B:31:0x014e, B:33:0x0230, B:34:0x023b, B:36:0x0251, B:46:0x028a, B:50:0x02a6, B:52:0x02c0, B:54:0x02c6, B:55:0x02cc, B:57:0x02d2, B:59:0x02d8, B:60:0x02df, B:61:0x02e2, B:63:0x02e8, B:64:0x02f2, B:82:0x0355, B:84:0x035d, B:87:0x0364, B:89:0x036a, B:90:0x0372, B:92:0x0378, B:94:0x0384, B:96:0x038a, B:110:0x0449, B:123:0x048f, B:141:0x0516, B:149:0x0537, B:151:0x0545, B:153:0x0555, B:154:0x055e, B:217:0x068a, B:219:0x0696, B:220:0x06a0, B:222:0x06ac, B:216:0x0687, B:168:0x0582, B:160:0x0571, B:148:0x0535, B:122:0x0486, B:81:0x034c, B:37:0x0256, B:39:0x0260, B:41:0x0266, B:42:0x026c, B:44:0x0272, B:45:0x0288, B:30:0x014b, B:12:0x00a8, B:8:0x0060, B:66:0x02fe, B:67:0x0310, B:69:0x0316, B:71:0x0322, B:73:0x032c, B:75:0x033a, B:76:0x0342, B:78:0x0348, B:14:0x0102, B:16:0x010a, B:18:0x0110, B:19:0x0116, B:21:0x011c, B:23:0x0126, B:24:0x013f, B:27:0x0147, B:142:0x0527, B:146:0x0532, B:169:0x0584, B:192:0x0601, B:213:0x0682, B:111:0x0461, B:115:0x0473, B:119:0x047e), top: B:250:0x0017, inners: #1, #3, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06ac A[Catch: Exception -> 0x06b8, TRY_LEAVE, TryCatch #6 {Exception -> 0x06b8, blocks: (B:5:0x0017, B:9:0x0064, B:13:0x00ac, B:31:0x014e, B:33:0x0230, B:34:0x023b, B:36:0x0251, B:46:0x028a, B:50:0x02a6, B:52:0x02c0, B:54:0x02c6, B:55:0x02cc, B:57:0x02d2, B:59:0x02d8, B:60:0x02df, B:61:0x02e2, B:63:0x02e8, B:64:0x02f2, B:82:0x0355, B:84:0x035d, B:87:0x0364, B:89:0x036a, B:90:0x0372, B:92:0x0378, B:94:0x0384, B:96:0x038a, B:110:0x0449, B:123:0x048f, B:141:0x0516, B:149:0x0537, B:151:0x0545, B:153:0x0555, B:154:0x055e, B:217:0x068a, B:219:0x0696, B:220:0x06a0, B:222:0x06ac, B:216:0x0687, B:168:0x0582, B:160:0x0571, B:148:0x0535, B:122:0x0486, B:81:0x034c, B:37:0x0256, B:39:0x0260, B:41:0x0266, B:42:0x026c, B:44:0x0272, B:45:0x0288, B:30:0x014b, B:12:0x00a8, B:8:0x0060, B:66:0x02fe, B:67:0x0310, B:69:0x0316, B:71:0x0322, B:73:0x032c, B:75:0x033a, B:76:0x0342, B:78:0x0348, B:14:0x0102, B:16:0x010a, B:18:0x0110, B:19:0x0116, B:21:0x011c, B:23:0x0126, B:24:0x013f, B:27:0x0147, B:142:0x0527, B:146:0x0532, B:169:0x0584, B:192:0x0601, B:213:0x0682, B:111:0x0461, B:115:0x0473, B:119:0x047e), top: B:250:0x0017, inners: #1, #3, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0606 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.c.g a(org.json.JSONObject r17) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.c.b.a(org.json.JSONObject):com.mbridge.msdk.c.g");
    }

    private static Map<String, a> e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final int c() {
        return this.g;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final int d() {
        return this.h;
    }

    public final void c(int i) {
        this.h = i;
    }

    public final int e() {
        return this.i;
    }

    public final void d(int i) {
        this.i = i;
    }

    public final String f() {
        return this.j;
    }

    public final String g() {
        return this.k;
    }

    public final String h() {
        return this.l;
    }

    public final int i() {
        return this.m;
    }

    public final void e(int i) {
        this.m = i;
    }

    public final int j() {
        return this.n;
    }

    public final void f(int i) {
        this.n = i;
    }

    public final List<com.mbridge.msdk.foundation.entity.a> k() {
        return this.o;
    }

    public final int l() {
        return this.p;
    }

    public final void g(int i) {
        this.p = i;
    }

    public final long m() {
        return this.q;
    }

    public final void a(long j) {
        this.q = j;
    }

    public final com.mbridge.msdk.c.a n() {
        return this.r;
    }

    public final String o() {
        return this.s;
    }

    public final Map<String, a> p() {
        return this.t;
    }

    public final int q() {
        return this.v;
    }

    public final void h(int i) {
        this.v = i;
    }

    public final int r() {
        return this.w;
    }

    public final void i(int i) {
        this.w = i;
    }

    public final String s() {
        return this.y;
    }

    public final String t() {
        return this.z;
    }

    public final String u() {
        return this.A;
    }

    public final String v() {
        return this.B;
    }

    public final String w() {
        return this.C;
    }

    public final int x() {
        return this.D;
    }

    public final void j(int i) {
        this.D = i;
    }

    public final String y() {
        return this.E;
    }

    public final String z() {
        return this.F;
    }

    public final long A() {
        return this.G;
    }

    public final ArrayList<Integer> B() {
        return this.I;
    }

    public final d C() {
        return this.J;
    }

    public final C0255b D() {
        return this.K;
    }

    public final long E() {
        return this.M;
    }

    public final int F() {
        return this.O;
    }

    public final void k(int i) {
        this.O = i;
    }

    public final HashMap<String, String> G() {
        return this.P;
    }

    public final String H() {
        return this.Q;
    }

    public final void a(String str) {
        this.Q = str;
    }

    public final int I() {
        return this.S;
    }

    public final void l(int i) {
        this.S = i;
    }

    public final int J() {
        return this.V;
    }

    public final void m(int i) {
        this.V = i;
    }

    public final int K() {
        return this.W;
    }

    public final void n(int i) {
        this.W = i;
    }

    public final JSONArray L() {
        return this.c;
    }

    public final JSONArray M() {
        return this.d;
    }

    public final String N() {
        return this.aa;
    }

    public final int O() {
        return this.af;
    }

    public final int P() {
        return this.ag;
    }

    public final int Q() {
        return this.aj;
    }

    public final void o(int i) {
        if (i > 0) {
            this.aj = i;
        }
    }

    public final int R() {
        return this.ai;
    }

    public final void p(int i) {
        this.ai = i;
    }

    public final int S() {
        return this.ak;
    }

    public final void q(int i) {
        this.ak = i;
    }

    public final String T() {
        return this.al;
    }

    public final String U() {
        return this.am;
    }

    public final void b(String str) {
        this.am = str;
    }

    public final String V() {
        return this.an;
    }

    public final void c(String str) {
        this.an = str;
    }

    public final String W() {
        return this.ao;
    }

    public final void d(String str) {
        this.ao = str;
    }

    public final int X() {
        return this.ap;
    }

    public final int Y() {
        return this.aq;
    }

    public final int Z() {
        return this.ar;
    }

    public final int aa() {
        return this.as;
    }

    public final long ab() {
        return this.av;
    }

    public final void b(long j) {
        this.av = j;
    }

    public final long ac() {
        if (this.aw <= 0) {
            this.aw = 7200L;
        }
        return this.aw;
    }

    public final void c(long j) {
        this.aw = j;
    }

    public final int ad() {
        return this.ay;
    }

    public final int ae() {
        return this.az;
    }

    public final int af() {
        return this.aA;
    }

    public final int ag() {
        return this.aB;
    }

    public final int ah() {
        return this.aC;
    }

    public final int ai() {
        return this.aD;
    }

    public final int aj() {
        return this.aF;
    }

    public final void r(int i) {
        this.aF = i;
    }

    public final JSONArray ak() {
        return this.aG;
    }

    public final JSONObject al() {
        return this.aH;
    }

    public final String am() {
        return this.aI;
    }

    public final long an() {
        return this.aJ;
    }

    public final void d(long j) {
        this.aJ = j;
    }

    public final int ao() {
        return this.aK;
    }

    public final int ap() {
        return this.aL;
    }

    public final void s(int i) {
        this.aL = i;
    }

    public final long aq() {
        return this.aM * 1000;
    }

    public final void e(long j) {
        this.aM = j;
    }

    public final int ar() {
        return this.aN;
    }

    public final void t(int i) {
        this.aN = i;
    }

    public final long as() {
        return this.aO;
    }

    public final int at() {
        return this.aQ;
    }

    public final void u(int i) {
        this.aQ = i;
    }

    public final int au() {
        return this.aR;
    }

    public final void v(int i) {
        this.aR = i;
    }

    public final int av() {
        return this.aS;
    }

    public final void w(int i) {
        this.aS = i;
    }

    public final int aw() {
        return this.aT;
    }

    public final void x(int i) {
        this.aT = i;
    }

    public final String ax() {
        return this.aU;
    }

    public final String ay() {
        return this.aV;
    }

    public final int az() {
        return this.aW;
    }

    public final int aA() {
        return this.aX;
    }

    public final int aB() {
        return this.aY;
    }

    public final boolean aC() {
        return this.R;
    }

    public final boolean aD() {
        return this.u;
    }

    public final void a(boolean z) {
        this.u = z;
    }

    public final boolean aE() {
        return this.x;
    }

    public final void b(boolean z) {
        this.x = z;
    }

    public final boolean y(int i) {
        return this.ax.contains(Integer.valueOf(i));
    }

    public final boolean aF() {
        return this.T;
    }

    public final void c(boolean z) {
        this.T = z;
    }

    public final boolean aG() {
        return this.b;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final boolean aH() {
        return this.U;
    }

    public final boolean aI() {
        return this.aE;
    }

    public final void e(boolean z) {
        this.aE = z;
    }

    public final boolean aJ() {
        return this.aP;
    }

    public final void f(boolean z) {
        this.aP = z;
    }

    public String toString() {
        return " cfc=" + this.v + " getpf=" + this.M + " rurl=" + this.aE;
    }

    public final void aK() {
        String language = Locale.getDefault().getLanguage();
        if (!((TextUtils.isEmpty(this.C) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.z)) ? false : true)) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.C = "确认关闭？";
                this.A = "关闭后您将不会获得任何奖励噢~ ";
                this.B = "确认关闭";
                this.z = "继续观看";
            } else {
                this.C = "Confirm to close? ";
                this.A = "You will not be rewarded after closing the window";
                this.B = "Close it";
                this.z = "Continue";
            }
        }
        if ((TextUtils.isEmpty(this.C) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.y)) ? false : true) {
            return;
        }
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            this.C = "确认关闭？";
            this.A = "关闭后您将不会获得任何奖励噢~ ";
            this.B = "确认关闭";
            this.y = "继续试玩";
            return;
        }
        this.C = "Confirm to close? ";
        this.A = "You will not be rewarded after closing the window";
        this.B = "Close it";
        this.y = "Continue";
    }

    /* compiled from: BaseSetting.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f2497a;
        private List<String> b;
        private List<String> c;
        private List<String> d;

        public final List<String> a() {
            return this.f2497a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final List<String> c() {
            return this.c;
        }

        public final List<String> d() {
            return this.d;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.c = r.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.d = r.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.b = r.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f2497a = r.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: BaseSetting.java */
    /* renamed from: com.mbridge.msdk.c.b$b, reason: collision with other inner class name */
    public static class C0255b {

        /* renamed from: a, reason: collision with root package name */
        private String f2501a;
        private JSONArray b;
        private String c;
        private String d;
        private String e;
        private String f;

        public static C0255b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0255b c0255b = new C0255b();
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            c0255b.f = jSONObject.optString("title", contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            c0255b.f2501a = jSONObject.optString("cancel", contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            c0255b.d = jSONObject.optString("submit", contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            c0255b.e = jSONObject.optString("submit_notice", contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            c0255b.c = jSONObject.optString("privacy", contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0255b.b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0255b.b = jSONArray;
                jSONArray.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                c0255b.b.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                c0255b.b.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                c0255b.b.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                c0255b.b.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                c0255b.b.put(contextC.getString(v.a(contextC, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return c0255b;
        }

        public final String a() {
            return this.f2501a;
        }

        public final JSONArray b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public final String f() {
            return this.f;
        }
    }
}
