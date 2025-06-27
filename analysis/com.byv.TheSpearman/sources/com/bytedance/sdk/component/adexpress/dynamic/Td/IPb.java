package com.bytedance.sdk.component.adexpress.dynamic.Td;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: DynamicLayoutBrickValue.java */
/* loaded from: classes2.dex */
public class IPb {
    private int As;
    private int BQ;
    private int Cia;
    private String CsQ;
    private int Dal;
    private int Dd;
    private float EYQ;
    private String FH;
    private String FtN;
    private int GfQ;
    private String HR;
    private float HX;
    private int Hnh;
    private float IPb;
    private int In;
    private double Jpu;
    private int Jy;
    private int JyA;
    private int KJ;
    private String KO;
    private boolean KR;
    private int Kbc;
    private boolean Kbd;
    private int Ko;
    private int KvC;
    private double MxO;
    private String NZ;
    private boolean Nuq;
    private double Nvm;
    private int OnO;
    private boolean OtA;
    private String PI;
    private JSONObject PP;
    private int Pf;
    private float Pm;
    private String QN;
    private float QQ;
    private boolean Rd;
    private String TQF;
    private String TZE;
    private boolean TZn;
    private float Td;
    private String Tnp;
    private String UB;
    private String Uc;
    private boolean VC;
    private int VEW;
    private String VM;
    private boolean VOV;
    private JSONObject VQ;
    private float VwS;
    private String WU;
    private long WgU = -1;
    private int XL;
    private String XN;
    private int XNX;
    private double XPd;
    private List<EYQ> XT;
    private String Yd;
    private int aEX;
    private boolean by;
    private JSONObject dVQ;
    private int dbE;
    private int dub;
    private int eFB;
    private int eVP;
    private String hYh;
    private String hu;
    private boolean kf;
    private int lEs;
    private String lJ;
    private int lRN;
    private int mN;
    private float mZx;
    private String nWX;
    private int na;
    private boolean oB;
    private boolean oCs;
    private int oIw;
    private JSONObject oZ;
    private String pi;
    private int qxY;
    private boolean rM;
    private int rfB;
    private int sOZ;
    private boolean tC;
    private String tPj;
    private float tp;
    private String tr;
    private double tsL;
    private int vD;
    private boolean wBa;
    private boolean wG;
    private boolean wJ;
    private int wa;
    private int xO;
    private String xh;
    private double xt;
    private String zF;
    private String zX;
    private boolean zzY;

    public static IPb EYQ(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        IPb iPb = new IPb();
        iPb.mZx(jSONObject.optString("adType", "embeded"));
        iPb.KO(jSONObject.optString("clickArea", "creative"));
        iPb.hu(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        iPb.Td(jSONObject.optString("fontFamily", "PingFangSC"));
        iPb.Pm(jSONObject.optString("textAlign", "left"));
        iPb.Kbd(jSONObject.optString("color", "#999999"));
        iPb.IPb(jSONObject.optString("bgColor", t2.h.T));
        iPb.VwS(jSONObject.optString("bgImgUrl", ""));
        iPb.QQ(jSONObject.optString("borderColor", "#000000"));
        iPb.HX(jSONObject.optString("borderStyle", "solid"));
        iPb.tp(jSONObject.optString("heightMode", "auto"));
        iPb.MxO(jSONObject.optString("widthMode", "fixed"));
        iPb.tsL(jSONObject.optString("interactText", ""));
        iPb.Td(jSONObject.optBoolean("isShowBgControl", false));
        iPb.pi(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            iPb.VwS(jSONObjectOptJSONObject.optInt("translateY", 0));
            iPb.QQ(jSONObjectOptJSONObject.optInt("translateX", 0));
            iPb.Pm(jSONObjectOptJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
            iPb.Kbd(jSONObjectOptJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        }
        iPb.nWX(jSONObject.optString("interactType", ""));
        iPb.Kbd(jSONObject.optInt("interactSlideDirection", -1));
        iPb.UB(jSONObject.optString("justifyHorizontal", "space-around"));
        iPb.Uc(jSONObject.optString("justifyVertical", "flex-start"));
        iPb.mZx(jSONObject.optDouble("timingStart"));
        iPb.Td(jSONObject.optDouble("timingEnd"));
        iPb.Pm((float) jSONObject.optDouble("width", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.Td((float) jSONObject.optDouble("height", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.EYQ((float) jSONObject.optDouble("borderRadius", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.mZx((float) jSONObject.optDouble("borderSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.mZx(jSONObject.optBoolean("interactValidate", false));
        iPb.HX((float) jSONObject.optDouble("fontSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.Kbd((float) jSONObject.optDouble("paddingBottom", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.IPb((float) jSONObject.optDouble("paddingLeft", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.VwS((float) jSONObject.optDouble("paddingRight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.QQ((float) jSONObject.optDouble("paddingTop", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.Pm(jSONObject.optBoolean("lineFeed", false));
        iPb.HX(jSONObject.optInt("lineCount", 0));
        iPb.IPb(jSONObject.optDouble("lineHeight", 1.2d));
        iPb.nWX(jSONObject.optInt("letterSpacing", 0));
        iPb.Kbd(jSONObject.optBoolean("isDataFixed", false));
        iPb.KO(jSONObject.optInt("fontWeight"));
        iPb.IPb(jSONObject.optBoolean("lineLimit"));
        iPb.hu(jSONObject.optInt(t2.h.L));
        iPb.hYh(jSONObject.optString("align"));
        iPb.VwS(jSONObject.optBoolean("useLeft"));
        iPb.QQ(jSONObject.optBoolean("useRight"));
        iPb.HX(jSONObject.optBoolean("useTop"));
        iPb.tp(jSONObject.optBoolean("useBottom"));
        iPb.zF(jSONObject.optString("data"));
        iPb.mZx(jSONObject.optJSONObject("i18n"));
        iPb.tsL(jSONObject.optInt("marginLeft"));
        iPb.pi(jSONObject.optInt("marginRight"));
        iPb.tp(jSONObject.optInt("marginTop"));
        iPb.MxO(jSONObject.optInt("marginBottom"));
        iPb.UB(jSONObject.optInt("tagMaxCount"));
        iPb.MxO(jSONObject.optBoolean("allowTextFlow"));
        iPb.Uc(jSONObject.optInt("textFlowType"));
        iPb.hYh(jSONObject.optInt("textFlowDuration"));
        iPb.zF(jSONObject.optInt("left"));
        iPb.WU(jSONObject.optInt("right"));
        iPb.XN(jSONObject.optInt("top"));
        iPb.NZ(jSONObject.optInt("bottom"));
        iPb.WU(jSONObject.optString("alignItems", "flex-start"));
        iPb.XN(jSONObject.optString("direction", ""));
        iPb.EYQ(jSONObject.optBoolean("loop", false));
        iPb.tPj(jSONObject.optInt("zIndex"));
        iPb.Nvm(jSONObject.optInt("interactVisibleTime"));
        iPb.wBa(jSONObject.optInt("interactHiddenTime"));
        iPb.pi(jSONObject.optBoolean("interactEnableMask"));
        iPb.nWX(jSONObject.optBoolean("interactWontHide"));
        iPb.EYQ(jSONObject.optString("bgGradient"));
        iPb.tr(jSONObject.optInt("areaType"));
        iPb.Tnp(jSONObject.optInt("interactSlideThreshold", 0));
        iPb.kf(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.Pm.mZx() ? 0 : 120));
        iPb.Uc(jSONObject.optBoolean("openPlayableLandingPage", false));
        iPb.Td(jSONObject.optJSONObject("video"));
        iPb.Pm(jSONObject.optJSONObject("image"));
        iPb.FtN(jSONObject.optInt("borderShadowExtent"));
        iPb.KO(jSONObject.optBoolean("bgGauseBlur"));
        iPb.PI(jSONObject.optInt("bgGauseBlurRadius"));
        iPb.hu(jSONObject.optBoolean("showTimeProgress", false));
        iPb.UB(jSONObject.optBoolean("showPlayButton", false));
        iPb.EYQ(jSONObject.optDouble("bgColorCg", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        iPb.IPb(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        iPb.mZx(jSONObject.optInt("borderTopLeftRadius", 0));
        iPb.EYQ(jSONObject.optInt("borderTopRightRadius", 0));
        iPb.Pm(jSONObject.optInt("borderBottomLeftRadius", 0));
        iPb.Td(jSONObject.optInt("borderBottomRightRadius", 0));
        iPb.Kbd(jSONObject.optJSONObject("interactI18n"));
        iPb.tPj(jSONObject.optString("imageObjectFit"));
        iPb.wBa(jSONObject.optString("interactTitle"));
        iPb.FH(jSONObject.optInt("interactTextPositionTop"));
        iPb.NZ(jSONObject.optString("imageLottieTosPath"));
        iPb.tsL(jSONObject.optBoolean("animationsLoop"));
        iPb.rfB(jSONObject.optInt("lottieAppNameMaxLength"));
        iPb.xt(jSONObject.optInt("lottieAdDescMaxLength"));
        iPb.lEs(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    EYQ eyq = new EYQ();
                    eyq.Td(jSONObject2.optString("animationType"));
                    eyq.EYQ(jSONObject2.optDouble("animationDuration"));
                    eyq.mZx(jSONObject2.optDouble("animationScaleX"));
                    eyq.Td(jSONObject2.optDouble("animationScaleY"));
                    eyq.Pm(jSONObject2.optString("animationTimeFunction"));
                    eyq.Pm(jSONObject2.optDouble("animationDelay"));
                    eyq.IPb(jSONObject2.optInt("animationIterationCount"));
                    eyq.Kbd(jSONObject2.optString("animationDirection"));
                    eyq.Kbd(jSONObject2.optDouble("animationInterval"));
                    eyq.EYQ(jSONObject2.optInt("animationBorderWidth"));
                    eyq.EYQ(jSONObject2.optLong(t2.h.W));
                    eyq.mZx(jSONObject2.optInt("animationEffectWidth"));
                    eyq.Td(jSONObject2.optInt("animationSwing", 1));
                    eyq.Pm(jSONObject2.optInt("animationTranslateX"));
                    eyq.Kbd(jSONObject2.optInt("animationTranslateY"));
                    eyq.mZx(jSONObject2.optString("animationRippleBackgroundColor"));
                    eyq.EYQ(jSONObject2.optString("animationScaleDirection"));
                    eyq.VwS(jSONObject2.optInt("animationFadeStart"));
                    eyq.QQ(jSONObject2.optInt("animationFadeEnd"));
                    eyq.IPb(jSONObject2.optString("animationFillMode"));
                    eyq.HX(jSONObject2.optInt("animationBounceHeight"));
                    if (iPb.hYh() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        eyq.Pm(eyq.nWX() + iPb.hYh());
                    }
                    arrayList.add(eyq);
                }
                iPb.EYQ(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                iPb.rfB(jSONObject.optString("triggerSlideDirection", "0"));
                iPb.EYQ(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return iPb;
    }

    public boolean EYQ() {
        return this.wG;
    }

    public void EYQ(boolean z) {
        this.wG = z;
    }

    public int mZx() {
        return this.JyA;
    }

    public void EYQ(int i) {
        this.JyA = i;
    }

    public int Td() {
        return this.XNX;
    }

    public void mZx(int i) {
        this.XNX = i;
    }

    public int Pm() {
        return this.dbE;
    }

    public void Td(int i) {
        this.dbE = i;
    }

    public int Kbd() {
        return this.Cia;
    }

    public void Pm(int i) {
        this.Cia = i;
    }

    public JSONObject IPb() {
        return this.oZ;
    }

    public int VwS() {
        return this.qxY;
    }

    public void Kbd(int i) {
        this.qxY = i;
    }

    public double QQ() {
        return this.Jpu;
    }

    public void EYQ(double d) {
        this.Jpu = d;
    }

    public int HX() {
        return this.As;
    }

    public void IPb(int i) {
        this.As = i;
    }

    public String tp() {
        return this.QN;
    }

    public void EYQ(String str) {
        this.QN = str;
    }

    public float MxO() {
        return this.EYQ;
    }

    public void EYQ(float f) {
        this.EYQ = f;
    }

    public float tsL() {
        return this.mZx;
    }

    public void mZx(float f) {
        this.mZx = f;
    }

    public void Td(float f) {
        this.Td = f;
    }

    public void Pm(float f) {
        this.Pm = f;
    }

    public boolean pi() {
        return this.Kbd;
    }

    public void mZx(boolean z) {
        this.Kbd = z;
    }

    public float nWX() {
        return this.IPb;
    }

    public void Kbd(float f) {
        this.IPb = f;
    }

    public float KO() {
        return this.VwS;
    }

    public void IPb(float f) {
        this.VwS = f;
    }

    public float hu() {
        return this.QQ;
    }

    public void VwS(float f) {
        this.QQ = f;
    }

    public float UB() {
        return this.HX;
    }

    public void QQ(float f) {
        this.HX = f;
    }

    public float Uc() {
        return this.tp;
    }

    public void HX(float f) {
        this.tp = f;
    }

    public double hYh() {
        return this.MxO;
    }

    public void mZx(double d) {
        this.MxO = d;
    }

    public double zF() {
        return this.tsL;
    }

    public void Td(double d) {
        this.tsL = d;
    }

    public void mZx(String str) {
        this.pi = str;
    }

    public void Td(String str) {
        this.nWX = str;
    }

    public String WU() {
        return this.KO;
    }

    public void Pm(String str) {
        this.KO = str;
    }

    public String XN() {
        return this.hu;
    }

    public void Kbd(String str) {
        this.hu = str;
    }

    public String NZ() {
        return this.UB;
    }

    public void IPb(String str) {
        this.UB = str;
    }

    public void VwS(String str) {
        this.Uc = str;
    }

    public String tPj() {
        return this.Uc;
    }

    public String wBa() {
        return this.hYh;
    }

    public void QQ(String str) {
        this.hYh = str;
    }

    public void HX(String str) {
        this.zF = str;
    }

    public String rfB() {
        return this.WU;
    }

    public void tp(String str) {
        this.WU = str;
    }

    public String lEs() {
        return this.XN;
    }

    public void MxO(String str) {
        this.XN = str;
    }

    public String xt() {
        return this.NZ;
    }

    public void tsL(String str) {
        this.NZ = str;
    }

    public String Nvm() {
        return this.tPj;
    }

    public void pi(String str) {
        this.tPj = str;
    }

    public boolean FH() {
        return this.wBa;
    }

    public void Td(boolean z) {
        this.wBa = z;
    }

    public int tr() {
        return this.rfB;
    }

    public void VwS(int i) {
        this.rfB = i;
    }

    public int Tnp() {
        return this.lEs;
    }

    public void QQ(int i) {
        this.lEs = i;
    }

    public double FtN() {
        return this.xt;
    }

    public void Pm(double d) {
        this.xt = d;
    }

    public double PI() {
        return this.Nvm;
    }

    public void Kbd(double d) {
        this.Nvm = d;
    }

    public String kf() {
        return this.FH;
    }

    public void nWX(String str) {
        this.FH = str;
    }

    public String mN() {
        return this.tr;
    }

    public void KO(String str) {
        this.tr = str;
    }

    public String Kbc() {
        return this.Tnp;
    }

    public void hu(String str) {
        this.Tnp = str;
    }

    public String Pf() {
        return this.FtN;
    }

    public void UB(String str) {
        this.FtN = str;
    }

    public String vD() {
        return this.PI;
    }

    public void Uc(String str) {
        this.PI = str;
    }

    public boolean lRN() {
        return this.kf;
    }

    public void Pm(boolean z) {
        this.kf = z;
    }

    public void HX(int i) {
        this.mN = i;
    }

    public int XPd() {
        return this.mN;
    }

    public int Dal() {
        return this.Kbc;
    }

    public void tp(int i) {
        this.Kbc = i;
    }

    public int wJ() {
        return this.Pf;
    }

    public void MxO(int i) {
        this.Pf = i;
    }

    public int wa() {
        return this.vD;
    }

    public void tsL(int i) {
        this.vD = i;
    }

    public int KR() {
        return this.lRN;
    }

    public void pi(int i) {
        this.lRN = i;
    }

    public double na() {
        return this.XPd;
    }

    public void IPb(double d) {
        this.XPd = d;
    }

    public int TQF() {
        return this.Dal;
    }

    public void nWX(int i) {
        this.Dal = i;
    }

    public boolean OtA() {
        return this.wJ;
    }

    public void Kbd(boolean z) {
        this.wJ = z;
    }

    public int TZn() {
        return this.wa;
    }

    public void KO(int i) {
        this.wa = i;
    }

    public boolean VOV() {
        return this.KR;
    }

    public void IPb(boolean z) {
        this.KR = z;
    }

    public int Nuq() {
        return this.na;
    }

    public void hu(int i) {
        this.na = i;
    }

    public String xh() {
        return this.TQF;
    }

    public void hYh(String str) {
        this.TQF = str;
    }

    public boolean dVQ() {
        return this.OtA;
    }

    public void VwS(boolean z) {
        this.OtA = z;
    }

    public boolean GfQ() {
        return this.TZn;
    }

    public void QQ(boolean z) {
        this.TZn = z;
    }

    public boolean by() {
        return this.VOV;
    }

    public void HX(boolean z) {
        this.VOV = z;
    }

    public boolean VEW() {
        return this.Nuq;
    }

    public void tp(boolean z) {
        this.Nuq = z;
    }

    public String Dd() {
        return this.xh;
    }

    public void zF(String str) {
        this.xh = str;
    }

    public void mZx(JSONObject jSONObject) {
        this.dVQ = jSONObject;
    }

    public JSONObject OnO() {
        return this.dVQ;
    }

    public int eFB() {
        return this.GfQ;
    }

    public void UB(int i) {
        this.GfQ = i;
    }

    public boolean Hnh() {
        return this.by;
    }

    public void MxO(boolean z) {
        this.by = z;
    }

    public int XL() {
        return this.VEW;
    }

    public void Uc(int i) {
        this.VEW = i;
    }

    public int TZE() {
        return this.Dd;
    }

    public void hYh(int i) {
        this.Dd = i;
    }

    public int CsQ() {
        return this.OnO;
    }

    public void zF(int i) {
        this.OnO = i;
    }

    public int wG() {
        return this.eFB;
    }

    public void WU(int i) {
        this.eFB = i;
    }

    public int BQ() {
        return this.Hnh;
    }

    public void XN(int i) {
        this.Hnh = i;
    }

    public int aEX() {
        return this.XL;
    }

    public void NZ(int i) {
        this.XL = i;
    }

    public String Ko() {
        return this.TZE;
    }

    public void WU(String str) {
        this.TZE = str;
    }

    public String XT() {
        return this.CsQ;
    }

    public void XN(String str) {
        this.CsQ = str;
    }

    public int eVP() {
        return this.BQ;
    }

    public void tPj(int i) {
        this.BQ = i;
    }

    public int dub() {
        return this.aEX;
    }

    public void wBa(int i) {
        this.aEX = i;
    }

    public String sOZ() {
        return this.HR;
    }

    public void NZ(String str) {
        this.HR = str;
    }

    public boolean oIw() {
        return this.tC;
    }

    public void tsL(boolean z) {
        this.tC = z;
    }

    public int zzY() {
        return this.In;
    }

    public void rfB(int i) {
        this.In = i;
    }

    public int oB() {
        return this.Jy;
    }

    public void lEs(int i) {
        this.Jy = i;
    }

    public int VC() {
        return this.KvC;
    }

    public void xt(int i) {
        this.KvC = i;
    }

    public boolean KJ() {
        return this.oCs;
    }

    public void pi(boolean z) {
        this.oCs = z;
    }

    public int Rd() {
        return this.Ko;
    }

    public void Nvm(int i) {
        this.Ko = i;
    }

    public void nWX(boolean z) {
        this.rM = z;
    }

    public boolean Jpu() {
        return this.rM;
    }

    public void tPj(String str) {
        this.zX = str;
    }

    public String VQ() {
        return this.zX;
    }

    public void FH(int i) {
        this.xO = i;
    }

    public int PP() {
        return this.xO;
    }

    public List<EYQ> qxY() {
        return this.XT;
    }

    public int lJ() {
        List<EYQ> list = this.XT;
        if (list == null) {
            return 0;
        }
        for (EYQ eyq : list) {
            if ("translate".equals(eyq.HX()) && eyq.VwS() < 0) {
                return -eyq.VwS();
            }
        }
        return 0;
    }

    public void EYQ(List<EYQ> list) {
        this.XT = list;
    }

    public int rM() {
        return this.eVP;
    }

    public void tr(int i) {
        this.eVP = i;
    }

    public int oZ() {
        return this.dub;
    }

    public void Tnp(int i) {
        this.dub = i;
    }

    public int As() {
        return this.sOZ;
    }

    public void FtN(int i) {
        this.sOZ = i;
    }

    public boolean JyA() {
        return this.zzY;
    }

    public void KO(boolean z) {
        this.zzY = z;
    }

    public int XNX() {
        return this.oIw;
    }

    public void PI(int i) {
        this.oIw = i;
    }

    public boolean dbE() {
        return this.oB;
    }

    public void hu(boolean z) {
        this.oB = z;
    }

    public boolean Cia() {
        return this.VC;
    }

    public void UB(boolean z) {
        this.VC = z;
    }

    public int zX() {
        return this.KJ;
    }

    public void kf(int i) {
        this.KJ = i;
    }

    public String xO() {
        return this.lJ;
    }

    public boolean oCs() {
        return this.Rd;
    }

    public void Uc(boolean z) {
        this.Rd = z;
    }

    public void Td(JSONObject jSONObject) {
        this.VQ = jSONObject;
    }

    public JSONObject HR() {
        return this.PP;
    }

    public void Pm(JSONObject jSONObject) {
        this.PP = jSONObject;
    }

    public void Kbd(JSONObject jSONObject) {
        this.oZ = jSONObject;
    }

    public String tC() {
        return this.Yd;
    }

    public void wBa(String str) {
        this.Yd = str;
    }

    public void In() {
        EYQ(this, this.VQ);
    }

    public void Jy() {
        EYQ(this, this.PP);
    }

    public String KvC() {
        return this.VM;
    }

    public void rfB(String str) {
        this.VM = str;
    }

    public long Yd() {
        return this.WgU;
    }

    public void EYQ(long j) {
        this.WgU = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void EYQ(IPb iPb, JSONObject jSONObject) {
        if (iPb == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = Typography.dollar;
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = Typography.amp;
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = SignatureVisitor.EXTENDS;
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = SignatureVisitor.SUPER;
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals(t2.h.L)) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = Typography.less;
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = '=';
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = Typography.greater;
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    iPb.Td(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    iPb.KO(jSONObject.optString(next));
                    break;
                case 2:
                    iPb.rfB(jSONObject.optString(next));
                    break;
                case 3:
                    iPb.VwS(jSONObject.optString(next));
                    break;
                case 4:
                    iPb.HX(jSONObject.optInt(next));
                    break;
                case 5:
                    iPb.Uc(jSONObject.optBoolean(next));
                    break;
                case 6:
                    iPb.IPb(jSONObject.optBoolean(next));
                    break;
                case 7:
                    iPb.pi(jSONObject.optString(next));
                    break;
                case '\b':
                    iPb.IPb((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    iPb.mZx(jSONObject.optString(next));
                    break;
                case '\n':
                    iPb.NZ(jSONObject.optInt(next));
                    break;
                case 11:
                    iPb.Td(jSONObject.optString(next));
                    break;
                case '\f':
                    iPb.Td((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    iPb.Pm(jSONObject.optString(next));
                    break;
                case 14:
                    iPb.WU(jSONObject.optString(next));
                    break;
                case 15:
                    iPb.mZx(jSONObject.optBoolean(next));
                    break;
                case 16:
                    iPb.tp(jSONObject.optInt(next));
                    break;
                case 17:
                    iPb.tp(jSONObject.optBoolean(next));
                    break;
                case 18:
                    iPb.EYQ(jSONObject.optLong(next));
                    break;
                case 19:
                    iPb.XN(jSONObject.optString(next));
                    break;
                case 20:
                    iPb.UB(jSONObject.optInt(next));
                    break;
                case 21:
                    iPb.wBa(jSONObject.optInt(next));
                    break;
                case 22:
                    iPb.HX(jSONObject.optBoolean(next));
                    break;
                case 23:
                    iPb.KO(jSONObject.optInt(next));
                    break;
                case 24:
                    iPb.tPj(jSONObject.optInt(next));
                    break;
                case 25:
                    iPb.mZx(jSONObject.optDouble(next));
                    break;
                case 26:
                    iPb.IPb(jSONObject.optDouble(next));
                    break;
                case 27:
                    iPb.hYh(jSONObject.optInt(next));
                    break;
                case 28:
                    iPb.QQ(jSONObject.optBoolean(next));
                    break;
                case 29:
                    iPb.MxO(jSONObject.optInt(next));
                    break;
                case 30:
                    iPb.IPb(jSONObject.optString(next));
                    break;
                case 31:
                    iPb.VwS(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    iPb.MxO(jSONObject.optString(next));
                    break;
                case '!':
                    iPb.XN(jSONObject.optInt(next));
                    break;
                case '\"':
                    iPb.zF(jSONObject.optString(next));
                    break;
                case '#':
                    iPb.zF(jSONObject.optInt(next));
                    break;
                case '$':
                    iPb.EYQ(jSONObject.optBoolean(next));
                    break;
                case '%':
                    iPb.QQ((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    iPb.hYh(jSONObject.optString(next));
                    break;
                case '\'':
                    iPb.Kbd(jSONObject.optString(next));
                    break;
                case '(':
                    iPb.WU(jSONObject.optInt(next));
                    break;
                case ')':
                    iPb.Pm((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    iPb.Td(jSONObject.optDouble(next));
                    break;
                case '+':
                    iPb.Kbd((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    iPb.MxO(jSONObject.optBoolean(next));
                    break;
                case '-':
                    iPb.nWX(jSONObject.optBoolean(next));
                    break;
                case '.':
                    iPb.HX((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    iPb.Uc(jSONObject.optString(next));
                    break;
                case '0':
                    iPb.Nvm(jSONObject.optInt(next));
                    break;
                case '1':
                    iPb.VwS((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    iPb.QQ(jSONObject.optString(next));
                    break;
                case '3':
                    iPb.HX(jSONObject.optString(next));
                    break;
                case '4':
                    iPb.hu(jSONObject.optInt(next));
                    break;
                case '5':
                    iPb.Kbd(jSONObject.optBoolean(next));
                    break;
                case '6':
                    iPb.pi(jSONObject.optInt(next));
                    break;
                case '7':
                    iPb.UB(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        iPb.VwS(jSONObjectOptJSONObject.optInt("translateY", 0));
                        iPb.QQ(jSONObjectOptJSONObject.optInt("translateX", 0));
                        iPb.Pm(jSONObjectOptJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        iPb.Kbd(jSONObjectOptJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        break;
                    }
                case '9':
                    iPb.Pm(jSONObject.optBoolean(next));
                    break;
                case ':':
                    iPb.tsL(jSONObject.optString(next));
                    break;
                case ';':
                    iPb.nWX(jSONObject.optString(next));
                    break;
                case '<':
                    iPb.EYQ((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    iPb.hu(jSONObject.optString(next));
                    break;
                case '>':
                    iPb.tp(jSONObject.optString(next));
                    break;
                case '?':
                    iPb.Uc(jSONObject.optInt(next));
                    break;
                case '@':
                    iPb.mZx((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    iPb.tsL(jSONObject.optInt(next));
                    break;
                case 'B':
                    iPb.nWX(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
