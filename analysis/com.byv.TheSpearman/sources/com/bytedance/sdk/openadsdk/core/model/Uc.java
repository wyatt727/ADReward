package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MixedMaterialMeta.java */
/* loaded from: classes2.dex */
public class Uc extends UB {
    private final EYQ EYQ;
    private boolean Td;
    private UB mZx;

    public Uc(EYQ eyq) {
        this.EYQ = eyq;
        this.mZx = eyq.Kbd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Kbd() {
        return this.mZx.Kbd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(String str) {
        this.mZx.Kbd(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String IPb() {
        return this.mZx.IPb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(String str) {
        this.mZx.IPb(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean VwS() {
        return this.mZx.VwS();
    }

    public EYQ wj() {
        return this.EYQ;
    }

    public boolean oFG() {
        return this.EYQ.IPb();
    }

    public EYQ.C0119EYQ Fd() {
        return this.EYQ.QQ();
    }

    public List<UB> gR() {
        List<UB> listTd = this.EYQ.Td();
        return listTd != null ? listTd : new ArrayList();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public hu QQ() {
        return this.mZx.QQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(hu huVar) {
        this.mZx.EYQ(huVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Pm HX() {
        return this.mZx.HX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Pm pm) {
        this.mZx.EYQ(pm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tp() {
        return this.mZx.tp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int MxO() {
        return this.mZx.MxO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long tsL() {
        return this.mZx.tsL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public zF pi() {
        return this.mZx.pi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(zF zFVar) {
        this.mZx.EYQ(zFVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int nWX() {
        return this.mZx.nWX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(int i) {
        this.mZx.EYQ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KO() {
        return this.mZx.KO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(int i) {
        this.mZx.mZx(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(int i, int i2) {
        this.mZx.EYQ(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int hu() {
        return this.mZx.hu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(double d) {
        this.mZx.EYQ(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int UB() {
        return this.mZx.UB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(double d) {
        this.mZx.mZx(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Uc() {
        return this.mZx.Uc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(String str) {
        this.mZx.VwS(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int hYh() {
        return this.mZx.hYh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(int i) {
        this.mZx.Td(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int zF() {
        return this.mZx.zF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(int i) {
        this.mZx.Pm(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(int i) {
        this.mZx.Kbd(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void QQ(String str) {
        this.mZx.QQ(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean WU() {
        return this.mZx.WU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int XN() {
        return this.mZx.XN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(int i) {
        this.mZx.IPb(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int NZ() {
        return this.mZx.NZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(int i) {
        this.mZx.VwS(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tPj() {
        return this.mZx.tPj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void QQ(int i) {
        this.mZx.QQ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wBa() {
        return this.mZx.wBa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void HX(String str) {
        this.mZx.HX(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int rfB() {
        return this.mZx.rfB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void HX(int i) {
        this.mZx.HX(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tp(int i) {
        this.mZx.tp(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int lEs() {
        return this.mZx.lEs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void MxO(int i) {
        this.mZx.MxO(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public QQ xt() {
        return this.mZx.xt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(QQ qq) {
        this.mZx.EYQ(qq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public AdSlot Nvm() {
        return this.mZx.Nvm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(AdSlot adSlot) {
        this.mZx.EYQ(adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tsL(int i) {
        this.mZx.tsL(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int FH() {
        return this.mZx.FH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void pi(int i) {
        this.mZx.pi(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void nWX(int i) {
        this.mZx.nWX(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void KO(int i) {
        this.mZx.KO(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hu(int i) {
        this.mZx.hu(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String tr() {
        return this.mZx.tr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tp(String str) {
        this.mZx.tp(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Tnp() {
        return this.mZx.Tnp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int FtN() {
        return this.mZx.FtN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void UB(int i) {
        this.mZx.UB(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public UB.EYQ PI() {
        return this.mZx.PI();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(UB.EYQ eyq) {
        this.mZx.EYQ(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int kf() {
        return this.mZx.kf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx mN() {
        return this.mZx.mN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.mZx.EYQ(mzx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(MxO mxO) {
        this.mZx.EYQ(mxO);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Kbc() {
        return this.mZx.Kbc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void MxO(String str) {
        this.mZx.MxO(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tsL(String str) {
        this.mZx.tsL(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Pf() {
        return this.mZx.Pf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Uc(int i) {
        this.mZx.Uc(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public nWX vD() {
        return this.mZx.vD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(nWX nwx) {
        this.mZx.EYQ(nwx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public nWX lRN() {
        return this.mZx.lRN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(nWX nwx) {
        this.mZx.mZx(nwx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String XPd() {
        return this.mZx.XPd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void pi(String str) {
        this.mZx.pi(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<nWX> Dal() {
        return this.mZx.Dal();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(nWX nwx) {
        this.mZx.Td(nwx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wJ() {
        return this.mZx.wJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void nWX(String str) {
        this.mZx.nWX(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long VM() {
        return this.mZx.VM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> wa() {
        return this.mZx.wa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> KR() {
        return this.mZx.KR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<String> na() {
        return this.mZx.na();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TQF() {
        return this.mZx.TQF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void KO(String str) {
        this.mZx.KO(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String OtA() {
        return this.mZx.OtA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hu(String str) {
        this.mZx.hu(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TZn() {
        return this.mZx.TZn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void UB(String str) {
        this.mZx.UB(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String VOV() {
        return this.mZx.VOV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Uc(String str) {
        this.mZx.Uc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Nuq() {
        return this.mZx.Nuq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hYh(String str) {
        this.mZx.hYh(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Td xh() {
        return this.mZx.xh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Td td) {
        this.mZx.EYQ(td);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public tp dVQ() {
        return this.mZx.dVQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(tp tpVar) {
        this.mZx.EYQ(tpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String GfQ() {
        return this.mZx.GfQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void zF(String str) {
        this.mZx.zF(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int by() {
        return this.mZx.by();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hYh(int i) {
        this.mZx.hYh(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public List<FilterWord> VEW() {
        return this.mZx.VEW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(FilterWord filterWord) {
        this.mZx.EYQ(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String Dd() {
        return this.mZx.Dd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WU(String str) {
        this.mZx.WU(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long OnO() {
        return this.mZx.OnO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(long j) {
        this.mZx.mZx(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void zF(int i) {
        this.mZx.zF(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean eFB() {
        return this.mZx.eFB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(boolean z) {
        this.mZx.Pm(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Map<String, Object> Hnh() {
        return this.mZx.Hnh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(Map<String, Object> map) {
        this.mZx.EYQ(map);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject XL() {
        return this.mZx.XL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(JSONObject jSONObject) {
        this.mZx.mZx(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void XN(String str) {
        this.mZx.XN(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int TZE() {
        return this.mZx.TZE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WU(int i) {
        this.mZx.WU(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public float CsQ() {
        return this.mZx.CsQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(float f) {
        this.mZx.EYQ(f);
    }

    public boolean equals(Object obj) {
        return this.mZx.equals(obj);
    }

    public int hashCode() {
        return this.mZx.hashCode();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean wG() {
        return this.mZx.wG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean BQ() {
        return this.mZx.BQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void XN(int i) {
        this.mZx.XN(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(JSONObject jSONObject) {
        this.mZx.Td(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject aEX() {
        return this.mZx.aEX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Ko() {
        return this.mZx.Ko();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void NZ(int i) {
        this.mZx.NZ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int eVP() {
        return this.mZx.eVP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tPj(int i) {
        this.mZx.tPj(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int dub() {
        return this.mZx.dub();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void wBa(int i) {
        this.mZx.wBa(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int sOZ() {
        return this.mZx.sOZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void rfB(int i) {
        this.mZx.rfB(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oIw() {
        return this.mZx.oIw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.openadsdk.core.VwS.EYQ zzY() {
        return this.mZx.zzY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) {
        this.mZx.EYQ(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oB() {
        return this.mZx.oB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String VC() {
        return this.mZx.VC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void NZ(String str) {
        this.mZx.NZ(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KJ() {
        return this.mZx.KJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject Rd() {
        return this.mZx.Rd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Pm(JSONObject jSONObject) {
        this.mZx.Pm(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Jpu() {
        return this.mZx.Jpu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void lEs(int i) {
        this.mZx.lEs(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VQ() {
        this.mZx.VQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean PP() {
        return this.mZx.PP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int qxY() {
        return this.mZx.qxY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void xt(int i) {
        this.mZx.xt(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int lJ() {
        return this.mZx.lJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Nvm(int i) {
        this.mZx.Nvm(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int rM() {
        return this.mZx.rM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void FH(int i) {
        this.mZx.FH(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String oZ() {
        return this.mZx.oZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String[] As() {
        return this.mZx.As();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(String[] strArr) {
        this.mZx.EYQ(strArr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(tsL tsl) {
        this.mZx.EYQ(tsl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public tsL JyA() {
        return this.mZx.JyA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.component.widget.mZx.EYQ dbE() {
        return this.mZx.dbE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Cia() {
        return this.mZx.Cia();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Tnp(int i) {
        this.mZx.Tnp(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int zX() {
        return this.mZx.zX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void FtN(int i) {
        this.mZx.FtN(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx xO() {
        return this.mZx.xO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.mZx.mZx(mzx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bykv.vk.openvk.component.video.api.Td.mZx oCs() {
        return this.mZx.oCs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(com.bykv.vk.openvk.component.video.api.Td.mZx mzx) {
        this.mZx.Td(mzx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String HR() {
        return this.mZx.HR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tPj(String str) {
        this.mZx.tPj(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int tC() {
        return this.mZx.tC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void PI(int i) {
        this.mZx.PI(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean In() {
        return this.mZx.In();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public JSONObject Jy() {
        return this.mZx.Jy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int KvC() {
        return this.mZx.KvC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Yd() {
        return this.mZx.Yd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean WgU() {
        return this.mZx.WgU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean QN() {
        return this.mZx.QN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean hv() {
        return this.mZx.hv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Aw() {
        return this.mZx.Aw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean QI() {
        return this.mZx.QI();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int yK() {
        return this.mZx.yK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public double OMh() {
        return this.mZx.OMh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String wBa(String str) {
        return this.mZx.wBa(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String TfI() {
        return this.mZx.TfI();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String ZFP() {
        return this.mZx.ZFP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean HG() {
        return this.mZx.HG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int CE() {
        return this.mZx.CE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void kf(int i) {
        this.mZx.kf(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean wY() {
        return this.mZx.wY();
    }

    public void Pf(int i) {
        List<UB> listTd = this.EYQ.Td();
        listTd.size();
        if (i >= listTd.size()) {
            i = 0;
        } else if (i < 0) {
            return;
        }
        this.mZx = listTd.get(i);
        this.Td = true;
    }

    public boolean cOq() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Td() {
        return this.mZx.Td();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(boolean z) {
        this.mZx.EYQ(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Pm() {
        return this.mZx.Pm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mZx(boolean z) {
        this.mZx.mZx(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(boolean z) {
        this.mZx.Td(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean jv() {
        return this.mZx.jv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean baW() {
        return this.mZx.baW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean oy() {
        return this.mZx.oy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void tr(int i) {
        this.mZx.tr(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int XNX() {
        return this.mZx.XNX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean lv() {
        return this.mZx.lv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public Nvm Hrh() {
        return this.mZx.Hrh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public long Qh() {
        return this.mZx.Qh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Td(long j) {
        this.mZx.Td(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Vx() {
        return this.mZx.Vx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void IPb(boolean z) {
        this.mZx.IPb(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean zAe() {
        return this.mZx.zAe();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void VwS(boolean z) {
        this.mZx.VwS(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void rfB(String str) {
        this.mZx.rfB(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String LoE() {
        return this.mZx.LoE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void mN(int i) {
        this.mZx.mN(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void lEs(String str) {
        this.mZx.lEs(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String cVL() {
        return this.mZx.cVL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public String OUK() {
        return this.mZx.OUK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Ts() {
        this.mZx.Ts();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Jx() {
        return this.mZx.Jx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ po() {
        return this.mZx.po();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void EYQ(com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ eyq) {
        this.mZx.EYQ(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbc(int i) {
        this.mZx.Kbc(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int Fw() {
        return this.mZx.Fw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public int TmV() {
        return this.mZx.TmV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void xBe() {
        this.mZx.xBe();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean yZ() {
        return this.mZx.yZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Db() {
        this.mZx.Db();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean Zv() {
        return this.mZx.Zv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void hCt() {
        this.mZx.hCt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean rcC() {
        return this.mZx.rcC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean BEC() {
        return this.mZx.BEC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void WD() {
        this.mZx.WD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public void Kbd(boolean z) {
        this.mZx.Kbd(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.UB
    public boolean XT() {
        return this.mZx.XT();
    }
}
