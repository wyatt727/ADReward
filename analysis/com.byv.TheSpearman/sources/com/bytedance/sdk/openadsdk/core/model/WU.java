package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SingleMaterialMeta.java */
/* loaded from: classes2.dex */
public class WU extends UB {
    private com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ Aw;
    private String BQ;
    private int Cia;
    private int CsQ;
    private int Dal;
    private String Dd;
    private long FtN;
    private AdSlot GfQ;
    private String HR;
    private int HX;
    private Pm In;
    private hu Jpu;
    private boolean Jy;
    private Map<String, Object> KR;
    private com.bykv.vk.openvk.component.video.api.Td.mZx Kbc;
    private String KvC;
    private nWX MxO;
    private Td NZ;
    private boolean OMh;
    private JSONObject OtA;
    private int PI;
    private com.bytedance.sdk.openadsdk.core.VwS.EYQ PP;
    private com.bykv.vk.openvk.component.video.api.Td.mZx Pf;
    private String QN;
    private int QQ;
    private int Rd;
    private String TQF;
    private boolean TfI;
    private String UB;
    private String Uc;
    private int VM;
    private zF VQ;
    private int VwS;
    private int WU;
    private String WgU;
    private JSONObject XL;
    private String XNX;
    private boolean XPd;
    private boolean ZFP;
    private MxO aEX;
    private int by;
    private int dbE;
    private int dub;
    private String eVP;
    private String hYh;
    private String hu;
    private boolean hv;
    private int kf;
    private String lEs;
    private JSONObject lJ;
    private boolean lRN;
    private com.bykv.vk.openvk.component.video.api.Td.mZx mN;
    public long mZx;
    private UB.EYQ na;
    private tsL oCs;
    private int oIw;
    private volatile boolean oZ;
    private String pi;
    private String qxY;
    private int rM;
    private String rfB;
    private int sOZ;
    private String tC;
    private tp tPj;
    private nWX tp;
    private String tsL;
    private boolean vD;
    private int wBa;
    private String wG;
    private boolean wJ;
    private int wa;
    private String[] xO;
    private String xt;
    private String zF;
    private int zzY;
    private final List<nWX> Td = new ArrayList();
    private final List<String> Pm = new ArrayList();
    private final List<FilterWord> Kbd = new ArrayList();
    private final Nvm IPb = Nvm.mZx();
    public boolean EYQ = false;
    private List<String> nWX = new ArrayList();
    private List<String> KO = new ArrayList();
    private String XN = "0";
    private String Nvm = "";
    private int FH = 0;
    private int tr = 2;
    private int Tnp = 0;
    private int TZn = 0;
    private int VOV = 1;
    private QQ Nuq = new QQ();
    private int xh = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int dVQ = 0;
    private int VEW = 1;
    private int OnO = 0;
    private int eFB = 0;
    private int Hnh = 0;
    private int TZE = 1;
    private int Ko = 1;
    private float XT = 100.0f;
    private int oB = 2;
    private int VC = 1;
    private int KJ = 0;
    private int As = -1;
    private long JyA = -1;
    private int zX = 0;
    private int Yd = 0;
    private boolean QI = false;
    private int yK = 0;

    private static double Kbd(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject.optDouble("pack_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UB ub = (UB) obj;
            if (this.XN.equals(ub.VOV()) && this.xt.equals(ub.GfQ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Td() {
        return this.vD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(boolean z) {
        this.vD = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Pm() {
        return this.lRN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(boolean z) {
        this.lRN = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(boolean z) {
        this.XPd = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Kbd() {
        return this.HR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(String str) {
        this.HR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String IPb() {
        return this.tC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(String str) {
        this.tC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean VwS() {
        return (TextUtils.isEmpty(Kbd()) || TextUtils.isEmpty(IPb())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public hu QQ() {
        return this.Jpu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(hu huVar) {
        this.Jpu = huVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean zAe() {
        return this.Jy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(boolean z) {
        this.Jy = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void rfB(String str) {
        this.KvC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String LoE() {
        return this.KvC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mN(int i) {
        this.VM = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void lEs(String str) {
        this.WgU = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String cVL() {
        return this.WgU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean BEC() {
        List<Integer> listTd;
        return (PI() == null || (listTd = PI().Td()) == null || !listTd.contains(57)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String OUK() {
        return this.QN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Jx() {
        return this.hv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ po() {
        return this.Aw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ eyq) {
        this.Aw = eyq;
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ().EYQ(eyq, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbc(int i) {
        this.yK = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Fw() {
        return this.yK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void xBe() {
        this.OMh = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean yZ() {
        return this.OMh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Db() {
        this.TfI = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Zv() {
        return this.TfI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hCt() {
        this.ZFP = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean rcC() {
        return this.ZFP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int TmV() {
        try {
            JSONObject jSONObjectJy = Jy();
            if (jSONObjectJy != null) {
                return jSONObjectJy.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Ts() {
        com.bykv.vk.openvk.component.video.api.Td.mZx mzx = this.mN;
        if (mzx == null || TextUtils.isEmpty(mzx.tsL())) {
            return;
        }
        try {
            if (this.mN.tsL().contains("style_id")) {
                this.hv = true;
                this.QN = Uri.parse(this.mN.tsL()).getQueryParameters("style_id").get(0);
            } else {
                this.hv = false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Pm HX() {
        return this.In;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Pm pm) {
        this.In = pm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tp() {
        Pm pm = this.In;
        if (pm == null) {
            return 2;
        }
        return pm.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int MxO() {
        if (BEC()) {
            return 5;
        }
        if (oIw()) {
            return 2;
        }
        if (oB()) {
            return 4;
        }
        Pm pm = this.In;
        if (pm == null) {
            return 1;
        }
        return pm.mZx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long tsL() {
        Pm pm = this.In;
        if (pm == null) {
            return 0L;
        }
        return pm.Td();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public zF pi() {
        return this.VQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(zF zFVar) {
        this.VQ = zFVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int nWX() {
        return this.QQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(int i) {
        EYQ(i, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KO() {
        return this.HX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(int i) {
        this.QQ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(int i, int i2) {
        this.HX = i;
        this.QQ = i;
        if (this.GfQ == null) {
            this.QQ = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = KvC();
        }
        if (this.GfQ.getNativeAdType() == 3 || this.GfQ.getDurationSlotType() == 3 || i2 == 3) {
            this.QQ = 14;
            return;
        }
        if (this.GfQ.getNativeAdType() == 7 || this.GfQ.getNativeAdType() == 8 || this.GfQ.getDurationSlotType() == 7 || this.GfQ.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (zF.MxO(this)) {
                this.QQ = 12;
                return;
            }
            if (zF.mZx(this)) {
                this.QQ = 9;
                return;
            }
            if (this.HX == 5 && !KO.Td(this)) {
                this.QQ = 7;
            }
            if (this.HX == 6 && !KO.mZx(this)) {
                this.QQ = 7;
            }
            if (this.HX == 8 && YZ() != 100) {
                this.QQ = 7;
            }
            if (this.HX == 19 && TextUtils.isEmpty(this.tsL)) {
                this.QQ = 7;
            }
            if (this.HX == 20 && TextUtils.isEmpty(this.tsL)) {
                this.QQ = 7;
            }
            if (i < 5) {
                this.QQ = 7;
                return;
            }
            return;
        }
        if (zF.mZx(this)) {
            this.QQ = 4;
            return;
        }
        if (this.HX == 4 && !zF.mZx(this)) {
            this.QQ = 0;
        }
        if (i >= 5) {
            this.QQ = 0;
            return;
        }
        if (this.HX == 2 && Pf() != 3) {
            this.QQ = 0;
        } else if (i == 0 || (i == 1 && Pf() != 3)) {
            this.QQ = 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int hu() {
        return this.VC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.VC = 1;
        } else {
            this.VC = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int UB() {
        return this.oB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.oB = 2;
        } else {
            this.oB = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Uc() {
        return this.Nvm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(String str) {
        this.Nvm = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int hYh() {
        return this.FH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(int i) {
        this.FH = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int zF() {
        int i = this.QQ;
        if (i == 5 || i == 6) {
            return 1;
        }
        if (HG()) {
            return 2;
        }
        return this.tr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(int i) {
        this.tr = i;
    }

    public int wj() {
        return this.OnO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(int i) {
        this.OnO = i;
    }

    public String oFG() {
        return this.eVP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void QQ(String str) {
        this.eVP = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean WU() {
        return this.OnO == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int XN() {
        return this.Hnh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(int i) {
        this.Hnh = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int NZ() {
        return this.TZn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(int i) {
        this.TZn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tPj() {
        return this.VOV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void QQ(int i) {
        this.VOV = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wBa() {
        return this.wG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void HX(String str) {
        this.wG = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int rfB() {
        return this.eFB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void HX(int i) {
        this.eFB = i;
    }

    public int Fd() {
        return this.VEW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tp(int i) {
        this.VEW = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int lEs() {
        if (oIw()) {
            return 5;
        }
        if (CsQ() != 100.0f || zF() == 2) {
            return 0;
        }
        return this.dVQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void MxO(int i) {
        this.dVQ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public QQ xt() {
        return this.Nuq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(QQ qq) {
        this.Nuq = qq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public AdSlot Nvm() {
        return this.GfQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(AdSlot adSlot) {
        this.GfQ = adSlot;
    }

    public int gR() {
        return this.by;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tsL(int i) {
        this.by = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int FH() {
        return this.xh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void pi(int i) {
        this.xh = i;
    }

    public int cOq() {
        return this.TZE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void nWX(int i) {
        this.TZE = i;
    }

    public int LB() {
        return this.CsQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void KO(int i) {
        this.CsQ = i;
    }

    public int YZ() {
        return this.kf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hu(int i) {
        this.kf = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String tr() {
        return this.TQF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tp(String str) {
        this.TQF = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Tnp() {
        return YZ() == 100 || this.QQ == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int FtN() {
        return this.wa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void UB(int i) {
        this.wa = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public UB.EYQ PI() {
        return this.na;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(UB.EYQ eyq) {
        this.na = eyq;
        com.bytedance.sdk.component.adexpress.EYQ.Td.Pm pmOf = Of();
        if (pmOf != null && !this.na.pi()) {
            com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(pmOf);
        }
        if (eyq == null || TextUtils.isEmpty(eyq.nWX())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ().EYQ(MG(), "ad");
    }

    private com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ MG() {
        UB.EYQ eyqPI = PI();
        if (eyqPI == null) {
            return null;
        }
        return UB.EYQ.mZx(eyqPI, String.valueOf(yK()));
    }

    public com.bytedance.sdk.component.adexpress.EYQ.Td.Pm Of() {
        UB.EYQ eyqPI = PI();
        if (eyqPI == null) {
            return null;
        }
        return UB.EYQ.EYQ(eyqPI, String.valueOf(yK()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int kf() {
        MxO mxO = this.aEX;
        if (mxO == null) {
            return 0;
        }
        return mxO.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx mN() {
        return this.mN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.mN = mzx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(MxO mxO) {
        this.aEX = mxO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Kbc() {
        return this.rfB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void MxO(String str) {
        this.rfB = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tsL(String str) {
        this.zF = str;
    }

    public String DM() {
        return this.zF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Pf() {
        return this.VwS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Uc(int i) {
        this.VwS = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public nWX vD() {
        return this.tp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(nWX nwx) {
        this.tp = nwx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public nWX lRN() {
        return this.MxO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(nWX nwx) {
        this.MxO = nwx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String XPd() {
        return this.tsL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void pi(String str) {
        this.tsL = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<nWX> Dal() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(nWX nwx) {
        this.Td.add(nwx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wJ() {
        return this.pi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void nWX(String str) {
        this.pi = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> wa() {
        return this.nWX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> KR() {
        return this.KO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> na() {
        return this.Pm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TQF() {
        return this.hu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void KO(String str) {
        this.hu = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String OtA() {
        return this.UB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hu(String str) {
        this.UB = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TZn() {
        if (!TextUtils.isEmpty(this.Uc)) {
            return this.Uc;
        }
        Context contextEYQ = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        int iPf = Pf();
        if (iPf != 2 && iPf != 3) {
            if (iPf == 4) {
                if (contextEYQ != null) {
                    return com.bytedance.sdk.component.utils.zF.EYQ(contextEYQ, "tt_video_download_apk");
                }
                return this.Uc;
            }
            if (iPf != 8) {
                return this.Uc;
            }
        }
        if (contextEYQ != null) {
            return com.bytedance.sdk.component.utils.zF.EYQ(contextEYQ, "tt_video_mobile_go_detail");
        }
        return this.Uc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void UB(String str) {
        this.Uc = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String VOV() {
        return this.XN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Uc(String str) {
        this.XN = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Nuq() {
        return this.lEs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hYh(String str) {
        this.lEs = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Td xh() {
        return this.NZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Td td) {
        this.NZ = td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public tp dVQ() {
        return this.tPj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(tp tpVar) {
        this.tPj = tpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String GfQ() {
        return this.xt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void zF(String str) {
        this.xt = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int by() {
        return this.wBa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hYh(int i) {
        this.wBa = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<FilterWord> VEW() {
        return this.Kbd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(FilterWord filterWord) {
        this.Kbd.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Dd() {
        return this.BQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WU(String str) {
        this.BQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long OnO() {
        return this.FtN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(long j) {
        this.FtN = j;
    }

    public int bC() {
        return this.PI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void zF(int i) {
        this.PI = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean eFB() {
        return this.wJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(boolean z) {
        this.wJ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Map<String, Object> Hnh() {
        return this.KR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Map<String, Object> map) {
        this.KR = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject XL() {
        return this.XL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(JSONObject jSONObject) {
        this.XL = jSONObject;
    }

    public String pao() {
        return this.Dd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void XN(String str) {
        this.Dd = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int TZE() {
        if (this.Ko != 2) {
            this.Ko = 1;
        }
        return this.Ko;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WU(int i) {
        this.Ko = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public float CsQ() {
        if (this.XT <= 0.0f) {
            this.XT = 100.0f;
        }
        return (this.XT * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(float f) {
        this.XT = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean wG() {
        if (this.Td.isEmpty()) {
            return false;
        }
        if (this.wBa == 4 && this.Td.size() < 3) {
            return false;
        }
        Iterator<nWX> it = this.Td.iterator();
        while (it.hasNext()) {
            if (!it.next().Kbd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean BQ() {
        return !oIw() && jJ() == 1;
    }

    public int jJ() {
        return this.Tnp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void XN(int i) {
        this.Tnp = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.VwS = 4;
        this.XN = jSONObject.optString("id");
        this.rfB = jSONObject.optString(FirebaseAnalytics.Param.SOURCE);
        Td td = new Td();
        this.NZ = td;
        td.Td(jSONObject.optString("pkg_name"));
        this.NZ.mZx(jSONObject.optString("name"));
        this.NZ.EYQ(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject aEX() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", Pf());
            jSONObject.put("interaction_method", KO());
            jSONObject.put("target_url", XPd());
            jSONObject.put("app_log_url", Nuq());
            jSONObject.put("gecko_id", Dd());
            jSONObject.put("extension", Rd());
            jSONObject.put("ad_id", VOV());
            jSONObject.put(FirebaseAnalytics.Param.SOURCE, Kbc());
            jSONObject.put("app_name", DM());
            jSONObject.put("screenshot", eFB());
            jSONObject.put("dislike_control", jJ());
            jSONObject.put("play_bar_show_time", FH());
            jSONObject.put("play_bar_style", lEs());
            jSONObject.put("if_block_lp", wj());
            jSONObject.put("cache_sort", cOq());
            jSONObject.put("if_sp_cache", LB());
            jSONObject.put("render_control", zF());
            jSONObject.put("mrc_report", this.rM);
            jSONObject.put("isMrcReportFinish", this.oZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(t2.h.G0, UB());
            jSONObject2.put("other", hu());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", Uc());
            jSONObject3.put("reward_amount", hYh());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(Kbd()) && !TextUtils.isEmpty(IPb())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", Kbd());
                jSONObject4.put("adchoices_url", IPb());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            nWX nwxVD = vD();
            if (nwxVD != null && !TextUtils.isEmpty(nwxVD.EYQ())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", nwxVD.EYQ());
                jSONObject5.put("height", nwxVD.Td());
                jSONObject5.put("width", nwxVD.mZx());
                jSONObject.put("icon", jSONObject5);
            }
            nWX nwxLRN = lRN();
            if (nwxLRN != null && !TextUtils.isEmpty(nwxLRN.EYQ())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", nwxLRN.EYQ());
                jSONObject6.put("height", nwxLRN.Td());
                jSONObject6.put("width", nwxLRN.mZx());
                jSONObject.put("cover_image", jSONObject6);
            }
            Object objXL = XL();
            if (objXL != null) {
                jSONObject.put("session_params", objXL);
            }
            QQ qqXt = xt();
            if (qqXt != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", qqXt.EYQ);
                jSONObject7.put("click_upper_non_content_area", qqXt.mZx);
                jSONObject7.put("click_lower_content_area", qqXt.Td);
                jSONObject7.put("click_lower_non_content_area", qqXt.Pm);
                jSONObject7.put("click_button_area", qqXt.Kbd);
                jSONObject7.put("click_video_area", qqXt.IPb);
                jSONObject.put("click_area", jSONObject7);
            }
            AdSlot adSlotNvm = Nvm();
            if (adSlotNvm != null) {
                jSONObject.put("adslot", adSlotNvm.toJsonObj());
            }
            List<nWX> listDal = Dal();
            if (listDal != null) {
                JSONArray jSONArray = new JSONArray();
                for (nWX nwx : listDal) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("url", nwx.EYQ());
                    jSONObject8.put("height", nwx.Td());
                    jSONObject8.put("width", nwx.mZx());
                    jSONObject8.put("image_preview", nwx.IPb());
                    jSONObject8.put("image_key", nwx.VwS());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> listWa = wa();
            if (listWa != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = listWa.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> listKR = KR();
            if (listKR != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = listKR.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray3);
            }
            List<String> listNa = na();
            if (listNa != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<String> it3 = listNa.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", wJ());
            jSONObject.put("title", TQF());
            jSONObject.put("description", OtA());
            jSONObject.put("ext", GfQ());
            jSONObject.put("image_mode", by());
            jSONObject.put("cover_click_area", YZ());
            jSONObject.put("intercept_flag", gR());
            jSONObject.put("button_text", TZn());
            jSONObject.put("ad_logo", Fd());
            jSONObject.put("video_adaptation", rfB());
            jSONObject.put("feed_video_opentype", XN());
            jSONObject.put("orientation", TZE());
            jSONObject.put("aspect_ratio", CsQ());
            Td tdXh = xh();
            if (tdXh != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", tdXh.mZx());
                jSONObject9.put("package_name", tdXh.Td());
                jSONObject9.put(DownloadModel.DOWNLOAD_URL, tdXh.EYQ());
                jSONObject9.put(FirebaseAnalytics.Param.SCORE, tdXh.Pm());
                jSONObject9.put("comment_num", tdXh.Kbd());
                jSONObject9.put(CampaignEx.JSON_KEY_APP_SIZE, tdXh.IPb());
                jSONObject9.put("app_category", tdXh.VwS());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject9);
            }
            tp tpVarDVQ = dVQ();
            if (tpVarDVQ != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", tpVarDVQ.EYQ());
                jSONObject10.put("fallback_url", tpVarDVQ.mZx());
                jSONObject10.put("fallback_type", tpVarDVQ.Td());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject10);
            }
            List<FilterWord> listVEW = VEW();
            if (listVEW != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator<FilterWord> it4 = listVEW.iterator();
                while (it4.hasNext()) {
                    JSONObject jSONObjectMZx = mZx(it4.next());
                    if (jSONObjectMZx != null) {
                        jSONArray5.put(jSONObjectMZx);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            pi().EYQ(jSONObject);
            jSONObject.put("count_down", bC());
            jSONObject.put("expiration_time", OnO());
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxXO = xO();
            if (mzxXO != null) {
                jSONObject.put("video", mzxXO.Uc());
            }
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxOCs = oCs();
            if (mzxOCs != null) {
                jSONObject.put("h265_video", mzxOCs.Uc());
            }
            jSONObject.put("video_encode_type", zX());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", kf());
            jSONObject.put("download_conf", jSONObject11);
            if (Hnh() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> setEntrySet = Hnh().entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : setEntrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            UB.EYQ eyqPI = PI();
            if (eyqPI != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("id", eyqPI.Kbd());
                jSONObject13.put("md5", eyqPI.IPb());
                jSONObject13.put("url", eyqPI.VwS());
                jSONObject13.put("data", eyqPI.QQ());
                jSONObject13.put("diff_data", eyqPI.HX());
                jSONObject13.put("version", eyqPI.Pm());
                jSONObject13.put("dynamic_creative", eyqPI.tp());
                jSONObject13.put("engine_version", eyqPI.tsL());
                jSONObject13.put("ugen_data", eyqPI.hu());
                jSONObject13.put("ugen_md5", eyqPI.KO());
                jSONObject13.put("ugen_url", eyqPI.nWX());
                jSONObject.put("tpl_info", jSONObject13);
            }
            jSONObject.put("creative_extra", tr());
            jSONObject.put("market_url", pao());
            jSONObject.put("auction_price", wBa());
            jSONObject.put("ad_info", oFG());
            jSONObject.put("is_package_open", Ko());
            jSONObject.put("playable_duration_time", eVP());
            jSONObject.put("playable_endcard_close_time", dub());
            jSONObject.put("endcard_close_time", sOZ());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", NZ());
            jSONObject14.put("backup_render_control", tPj());
            jSONObject14.put("reserve_time", qxY());
            jSONObject14.put("render_thread", lJ());
            jSONObject.put("render", jSONObject14);
            if (this.Jpu == null) {
                hu huVar = new hu();
                this.Jpu = huVar;
                huVar.EYQ("");
                this.Jpu.EYQ(10L);
                this.Jpu.mZx(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.Jpu.EYQ());
            jSONObject15.put("straight_lp_showtime", this.Jpu.mZx());
            jSONObject15.put("loading_text", this.Jpu.Td());
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", tp());
            jSONObject16.put("splash_layout_id", MxO());
            jSONObject16.put("load_wait_time", tsL());
            jSONObject.put("splash_control", jSONObject16);
            if (oB()) {
                jSONObject.put("dsp_html", this.qxY);
            }
            if (oIw()) {
                jSONObject.put("vast_json", this.PP.tp());
            }
            jSONObject.put("dsp_material_type", CE());
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("loading_landingpage_type", rM());
            String[] strArr = this.xO;
            if (strArr != null && strArr.length > 0) {
                JSONArray jSONArray6 = new JSONArray();
                for (String str : this.xO) {
                    jSONArray6.put(str);
                }
                jSONObject17.put("landingpage_text", jSONArray6);
            }
            jSONObject.put("loading_page", jSONObject17);
            jSONObject.put("deep_link_appname", this.hYh);
            jSONObject.put("landing_page_download_clicktype", this.WU);
            tsL tsl = this.oCs;
            if (tsl != null) {
                jSONObject.put("dsp_style", tsl.Kbd());
            }
            jSONObject.put("jump_probability", this.VM);
            jSONObject.put("identificationOverlayContent", this.WgU);
            if (this.Aw != null) {
                JSONObject jSONObject18 = new JSONObject();
                jSONObject18.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.Aw.IPb());
                jSONObject.put("ugen", jSONObject18);
            }
            jSONObject.put("preload_h5_type", Fw());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONObject mZx(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(mZx(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Ko() {
        return this.dub;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void NZ(int i) {
        this.dub = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int eVP() {
        int i = this.sOZ;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tPj(int i) {
        this.sOZ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int dub() {
        return this.oIw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void wBa(int i) {
        this.oIw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int sOZ() {
        return this.zzY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void rfB(int i) {
        this.zzY = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oIw() {
        int i = this.Yd;
        return (i == 1 || i == 3) && zzY() != null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.openadsdk.core.VwS.EYQ zzY() {
        return this.PP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) {
        this.PP = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oB() {
        return this.Yd == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String VC() {
        return this.qxY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void NZ(String str) {
        this.qxY = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KJ() {
        JSONObject jSONObject = this.lJ;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject Rd() {
        return this.lJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(JSONObject jSONObject) {
        this.lJ = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Jpu() {
        return this.rM == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void lEs(int i) {
        this.rM = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VQ() {
        this.oZ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean PP() {
        return this.oZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int qxY() {
        return this.dbE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void xt(int i) {
        this.dbE = Math.max(0, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int lJ() {
        return this.Cia;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Nvm(int i) {
        this.Cia = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int rM() {
        return this.zX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void FH(int i) {
        this.zX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String oZ() {
        String strTQF = TQF();
        return (xh() == null || TextUtils.isEmpty(xh().mZx())) ? strTQF : xh().mZx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String[] As() {
        String[] strArr = this.xO;
        return ((strArr == null || strArr.length <= 0) && !TextUtils.isEmpty(TQF())) ? new String[]{TQF()} : this.xO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(String[] strArr) {
        this.xO = strArr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(tsL tsl) {
        this.oCs = tsl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public tsL JyA() {
        return this.oCs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tr(int i) {
        this.Dal = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int XNX() {
        return this.Dal;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.component.widget.mZx.EYQ dbE() {
        com.bytedance.sdk.component.widget.mZx.EYQ eyq = new com.bytedance.sdk.component.widget.mZx.EYQ();
        eyq.EYQ(this.wa);
        eyq.mZx(this.XN);
        eyq.EYQ(GfQ());
        return eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Cia() {
        return this.KJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Tnp(int i) {
        this.KJ = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int zX() {
        return this.Rd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void FtN(int i) {
        this.Rd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx xO() {
        return this.Pf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.Pf = mzx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx oCs() {
        return this.Kbc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.Kbc = mzx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String HR() {
        return this.hYh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tPj(String str) {
        this.hYh = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tC() {
        return this.WU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void PI(int i) {
        this.WU = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean In() {
        com.bykv.vk.openvk.component.video.api.Td.mZx mzx = this.mN;
        return mzx == null || mzx.hYh() != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject Jy() {
        if (this.OtA == null) {
            try {
                if (!TextUtils.isEmpty(this.xt)) {
                    this.OtA = new JSONObject(this.xt);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("MaterialMeta", e.getMessage());
            }
        }
        return this.OtA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KvC() {
        if (this.As < 0) {
            JSONObject jSONObjectJy = Jy();
            if (jSONObjectJy != null) {
                this.As = jSONObjectJy.optInt("ad_slot_type", 0);
            } else {
                this.As = 0;
            }
        }
        return this.As;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Yd() {
        return this.As;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long VM() {
        if (this.JyA < 0) {
            JSONObject jSONObjectJy = Jy();
            if (jSONObjectJy != null) {
                this.JyA = jSONObjectJy.optLong("ad_id", 0L);
            } else {
                this.JyA = 0L;
            }
        }
        return this.JyA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean WgU() {
        return KvC() == 3 || KvC() == 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean QN() {
        return KvC() == 7;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean hv() {
        return KvC() == 8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Aw() {
        return KvC() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean QI() {
        return KvC() == 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int yK() {
        JSONObject jSONObjectJy = Jy();
        if (jSONObjectJy != null) {
            return jSONObjectJy.optInt("rit", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public double OMh() {
        return Kbd(Jy());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wBa(String str) {
        JSONObject jSONObjectJy = Jy();
        return jSONObjectJy != null ? jSONObjectJy.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TfI() {
        Td tdXh = xh();
        if (tdXh == null || TextUtils.isEmpty(tdXh.EYQ())) {
            return null;
        }
        return tdXh.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String ZFP() {
        JSONObject jSONObjectJy;
        String strOptString = this.XNX;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectJy = Jy()) != null) {
            strOptString = jSONObjectJy.optString("req_id", "");
            xt(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public void xt(String str) {
        this.XNX = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean HG() {
        return Nvm() != null && Nvm().getDurationSlotType() == 8 && oB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int CE() {
        return this.Yd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void kf(int i) {
        this.Yd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean wY() {
        int i = this.QQ;
        return (i == 2 || i == 1) && 3 == this.VwS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean jv() {
        tsL tsl;
        return oIw() && !lv() && (tsl = this.oCs) != null && tsl.EYQ() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean baW() {
        /*
            r3 = this;
            boolean r0 = r3.lv()
            r1 = 0
            if (r0 != 0) goto L2f
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 100
            int r0 = r0.nextInt(r2)
            boolean r2 = r3.oIw()
            if (r2 == 0) goto L21
            com.bytedance.sdk.openadsdk.core.model.tsL r2 = r3.oCs
            if (r2 == 0) goto L2a
            int r2 = r2.mZx()
            goto L2b
        L21:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.zF.mZx(r3)
            if (r2 != 0) goto L2a
            int r2 = r3.VM
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r0 >= r2) goto L2f
            r0 = 1
            return r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.model.WU.baW():boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oy() {
        if (oIw() && !lv()) {
            int iNextInt = new Random().nextInt(100);
            tsL tsl = this.oCs;
            if (tsl != null && iNextInt < tsl.Td()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean lv() {
        return this.IPb.EYQ > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Nvm Hrh() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WD() {
        this.IPb.Pm();
        VwS(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long Qh() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(long j) {
        this.mZx = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Vx() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(boolean z) {
        this.EYQ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(boolean z) {
        this.QI = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean XT() {
        return this.QI;
    }
}
