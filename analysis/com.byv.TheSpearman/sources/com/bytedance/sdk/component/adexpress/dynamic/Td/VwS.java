package com.bytedance.sdk.component.adexpress.dynamic.Td;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: DynamicLayoutNativeValue.java */
/* loaded from: classes2.dex */
public class VwS {
    public int EYQ;
    private String IPb;
    private Kbd Kbd;
    private IPb Pm;
    public JSONObject Td;
    public String mZx;

    public VwS(Kbd kbd) {
        this.Kbd = kbd;
        this.EYQ = kbd.EYQ();
        this.mZx = kbd.Td();
        this.Td = kbd.Kbd().OnO();
        this.IPb = kbd.Pm();
        if (com.bytedance.sdk.component.adexpress.Pm.Td() == 1) {
            this.Pm = kbd.VwS();
        } else {
            this.Pm = kbd.Kbd();
        }
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            this.Pm = kbd.Kbd();
        }
    }

    public int EYQ() {
        return (int) this.Pm.nWX();
    }

    public int mZx() {
        return (int) this.Pm.UB();
    }

    public int Td() {
        return (int) this.Pm.KO();
    }

    public int Pm() {
        return (int) this.Pm.hu();
    }

    public float Kbd() {
        return this.Pm.Uc();
    }

    public String IPb() {
        if (this.EYQ != 0) {
            return "";
        }
        if (!TextUtils.isEmpty(this.mZx)) {
            return this.mZx;
        }
        return this.Td.optString(com.bytedance.sdk.component.adexpress.Pm.IPb.Td(com.bytedance.sdk.component.adexpress.Pm.EYQ()));
    }

    public int VwS() {
        return EYQ(this.Pm.XN());
    }

    public int QQ() {
        String strWU = this.Pm.WU();
        if ("left".equals(strWU)) {
            return 17;
        }
        if ("center".equals(strWU)) {
            return 4;
        }
        return "right".equals(strWU) ? 3 : 2;
    }

    public int HX() {
        int iQQ = QQ();
        if (iQQ == 4) {
            return 17;
        }
        return iQQ == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public String tp() {
        int i = this.EYQ;
        return (i == 2 || i == 13) ? this.mZx : "";
    }

    public String MxO() {
        return this.EYQ == 1 ? this.mZx : "";
    }

    public String tsL() {
        return this.IPb;
    }

    public double pi() throws NumberFormatException {
        if (this.EYQ == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.Pm.mZx() ? (int) r3 : Double.parseDouble(this.mZx);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double nWX() {
        return this.Pm.hYh();
    }

    public float KO() {
        return this.Pm.MxO();
    }

    public int hu() {
        return EYQ(this.Pm.wBa());
    }

    public float UB() {
        return this.Pm.tsL();
    }

    public int Uc() {
        return this.Pm.As();
    }

    public int hYh() {
        return this.Pm.XNX();
    }

    public boolean zF() {
        return this.Pm.JyA();
    }

    public String WU() {
        return this.Pm.tPj();
    }

    public void EYQ(float f) {
        this.Pm.EYQ(f);
    }

    public boolean XN() {
        return this.Pm.lRN();
    }

    public int NZ() {
        return this.Pm.XPd();
    }

    public String tPj() {
        return this.Pm.mN();
    }

    public String wBa() {
        return this.Pm.KvC();
    }

    public long rfB() {
        return this.Pm.Yd();
    }

    public int lEs() {
        String strMN = this.Pm.mN();
        if ("skip-with-time-skip-btn".equals(this.Kbd.mZx()) || "skip".equals(this.Kbd.mZx()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.Kbd.mZx())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.Kbd.mZx()) && !"skip-with-time".equals(this.Kbd.mZx())) {
            if (this.EYQ == 10 && TextUtils.equals(this.Pm.Kbc(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                return 5;
            }
            if (aEX() && Ko()) {
                return 0;
            }
            if (aEX()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.Kbd.mZx())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strMN) && !strMN.equals("none")) {
                if (strMN.equals("video") || (this.Kbd.EYQ() == 7 && TextUtils.equals(strMN, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.Pm.mZx() && this.Kbd.Kbd() != null && this.Kbd.Kbd().Cia()) ? 11 : 4;
                }
                if (strMN.equals("normal")) {
                    return 1;
                }
                return (strMN.equals("creative") || "slide".equals(this.Pm.Kbc())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean aEX() {
        return (com.bytedance.sdk.component.adexpress.Pm.mZx() && (this.Kbd.mZx().contains("logo-union") || this.Kbd.mZx().contains("logounion") || this.Kbd.mZx().contains("logoad"))) || "logo-union".equals(this.Kbd.mZx()) || "logounion".equals(this.Kbd.mZx()) || "logoad".equals(this.Kbd.mZx());
    }

    public int xt() {
        return EYQ(this.Pm.NZ());
    }

    public double Nvm() {
        return this.Pm.QQ();
    }

    public int FH() {
        return this.Pm.Td();
    }

    public int tr() {
        return this.Pm.mZx();
    }

    public int Tnp() {
        return this.Pm.Kbd();
    }

    public int FtN() {
        return this.Pm.Pm();
    }

    public int PI() {
        return this.Pm.HX();
    }

    public String kf() {
        return this.Pm.tp();
    }

    public String mN() {
        return this.Pm.Kbc();
    }

    private boolean Ko() {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.mZx) && this.mZx.contains("adx:")) || MxO.mZx();
    }

    public static int EYQ(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(t2.h.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public static float[] mZx(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public boolean EYQ(int i) {
        Kbd kbd = this.Kbd;
        if (kbd == null) {
            return false;
        }
        if (i == 1) {
            this.Pm = kbd.VwS();
        } else {
            this.Pm = kbd.Kbd();
        }
        return this.Pm != null;
    }

    public boolean Kbc() {
        return this.Pm.Hnh();
    }

    public int Pf() {
        return this.Pm.TZE();
    }

    public int vD() {
        return this.Pm.XL();
    }

    public String lRN() {
        return this.Pm.kf();
    }

    public boolean XPd() {
        return this.Pm.KJ();
    }

    public int Dal() {
        return this.Pm.VwS();
    }

    public int wJ() {
        return this.Pm.oZ();
    }

    public int wa() {
        return this.Pm.zX();
    }

    public int KR() {
        return this.Pm.Rd();
    }

    public int na() {
        return this.Pm.dub();
    }

    public boolean TQF() {
        return this.Pm.Jpu();
    }

    public String OtA() {
        return this.Pm.xt();
    }

    public String TZn() {
        return this.Pm.VQ();
    }

    public String VOV() {
        return this.Pm.xO();
    }

    public boolean Nuq() {
        return this.Pm.pi();
    }

    public boolean xh() {
        return this.Pm.FH();
    }

    public String dVQ() {
        return this.Pm.Nvm();
    }

    public int GfQ() {
        return this.Pm.tr();
    }

    public int by() {
        return this.Pm.Tnp();
    }

    public double VEW() {
        return this.Pm.FtN();
    }

    public double Dd() {
        return this.Pm.PI();
    }

    public int OnO() {
        return this.Pm.PP();
    }

    public String eFB() {
        return this.Pm.tC();
    }

    public String Hnh() {
        return this.Pm.sOZ();
    }

    public boolean XL() {
        return this.Pm.oIw();
    }

    public int TZE() {
        return this.Pm.VC();
    }

    public int CsQ() {
        return this.Pm.oB();
    }

    public int wG() {
        return this.Pm.zzY();
    }

    public boolean BQ() {
        return this.Pm.Jpu();
    }
}
