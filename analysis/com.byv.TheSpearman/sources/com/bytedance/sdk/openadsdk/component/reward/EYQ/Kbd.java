package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.mZx.mZx;
import com.bytedance.sdk.openadsdk.utils.hu;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: RewardFullEndCardManager.java */
/* loaded from: classes2.dex */
public class Kbd {
    private final EYQ EYQ;
    private final com.bytedance.sdk.openadsdk.component.reward.view.mZx mZx;

    public Kbd(EYQ eyq) {
        this.EYQ = eyq;
        this.mZx = new com.bytedance.sdk.openadsdk.component.reward.view.mZx(eyq);
    }

    public void EYQ() {
        this.mZx.EYQ();
    }

    public void mZx() {
        this.mZx.Td();
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd) {
        this.mZx.EYQ(kbd);
    }

    public void EYQ(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx, int i) {
        Objects.toString(mzx);
        if (this.EYQ.TZn.isFinishing() || mzx == null) {
            return;
        }
        this.EYQ.TQF.tsL();
        if (z2) {
            this.EYQ.rfB.set(true);
        }
        if (!this.EYQ.lEs.get() && !com.bytedance.sdk.openadsdk.core.model.KO.VwS(this.EYQ.EYQ) && (!com.bytedance.sdk.openadsdk.core.model.KO.mZx(this.EYQ.EYQ) || !this.EYQ.rfB.get() || !this.EYQ.xt.get())) {
            if (com.bytedance.sdk.openadsdk.core.model.KO.mZx(this.EYQ.EYQ) && z3) {
                return;
            }
            if ((com.bytedance.sdk.openadsdk.core.model.KO.mZx(this.EYQ.EYQ) || com.bytedance.sdk.openadsdk.core.model.KO.Td(this.EYQ.EYQ)) && this.EYQ.KR != null) {
                this.EYQ.KR.Td(false);
                mzx.hu();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !this.EYQ.TZn.isDestroyed()) && !this.EYQ.TZn.isFinishing()) {
            if (this.EYQ.EYQ.HG()) {
                this.EYQ.TZn.finish();
                return;
            }
            this.EYQ.FtN.pi();
            this.EYQ.wJ.wBa();
            this.EYQ.XN.set(false);
            this.EYQ.NZ.set(false);
            this.EYQ.lRN.EYQ();
            this.EYQ.KR.EYQ(!this.EYQ.hYh && this.EYQ.EYQ.BQ());
            if (this.EYQ.WU.getAndSet(true)) {
                return;
            }
            if (zF.mZx(this.EYQ.EYQ)) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.EYQ.EYQ, this.EYQ.VwS, z, z2, z3, this.EYQ.TZn.isFinishing(), i);
            }
            if (this.EYQ.TZn.hu() && zF.mZx(this.EYQ.EYQ) && z) {
                this.EYQ.KR.Pm(true);
            }
            if (zF.mZx(this.EYQ.EYQ)) {
                this.EYQ.KR.Td(true);
            }
            VwS();
            if (zF.MxO(this.EYQ.EYQ)) {
                return;
            }
            this.EYQ.Nvm.set(z);
            mzx.KO();
            if (this.EYQ.EYQ.oIw()) {
                this.EYQ.KR.Pm(false);
            } else {
                this.EYQ.KR.Pm(zF.MxO(this.EYQ.EYQ));
            }
            this.EYQ.KR.Td(zF.mZx(this.EYQ.EYQ));
            if (this.EYQ.TZn.hu() && zF.mZx(this.EYQ.EYQ) && z) {
                this.EYQ.KR.Pm(true);
            }
            this.EYQ.wJ.rfB();
            if (this.EYQ.TQF.KO != null) {
                this.EYQ.TQF.KO.Pm();
            }
            this.EYQ.TQF.Td();
            if (this.EYQ.mN != null) {
                this.EYQ.mN.IPb();
            }
            if (!TextUtils.isEmpty(UB.EYQ(this.EYQ.VOV, this.EYQ.EYQ))) {
                hu.EYQ(this.EYQ.TZn, zF.IPb(this.EYQ.EYQ), this.EYQ.EYQ, mZx.EYQ.Td);
                return;
            }
            if (UB.Td(this.EYQ.EYQ) && this.EYQ.wa != null) {
                this.EYQ.wa.Kbd();
            }
            if (UB.EYQ(this.EYQ.EYQ) || ((!UB.Td(this.EYQ.EYQ) && this.EYQ.wJ.mN()) || (!UB.EYQ(this.EYQ.EYQ, this.EYQ.wJ.hu(), this.EYQ.kf.Pm(), this.EYQ.wa.tp(), this.EYQ.wJ.lEs()) && !zF.mZx(this.EYQ.EYQ)))) {
                Pm();
                return;
            }
            if (!UB.Pm(this.EYQ.EYQ) && !zF.mZx(this.EYQ.EYQ) && !UB.Td(this.EYQ.EYQ)) {
                this.EYQ.wJ.EYQ(true, 0, (String) null);
            }
            this.EYQ.wJ.EYQ(0.0f);
            this.EYQ.TQF.EYQ(0.0f);
            if (!UB.Td(this.EYQ.EYQ)) {
                this.EYQ.wa.EYQ(8);
                this.EYQ.wJ.mZx(0);
                this.EYQ.wJ.Kbc();
            } else {
                this.EYQ.wJ.mZx(8);
                this.EYQ.wa.EYQ(0);
                this.EYQ.wa.IPb();
            }
            if (this.EYQ.hYh) {
                tr.EYQ((View) mzx.nWX, 0);
                this.EYQ.TQF.IPb(8);
            }
            if (zF.mZx(this.EYQ.EYQ)) {
                if (zF.hu(this.EYQ.EYQ) && !this.EYQ.wJ.PI()) {
                    if (!this.EYQ.wJ.hu()) {
                        this.EYQ.kf.QQ();
                    } else {
                        this.EYQ.kf.HX();
                        this.EYQ.KR.Pm(false);
                        this.EYQ.kf.EYQ(this.EYQ.Pf.Kbd());
                    }
                } else {
                    EYQ(mzx);
                }
            } else {
                mZx(mzx);
            }
            this.EYQ.TQF.Pm(8);
            this.EYQ.TQF.VwS();
            if (UB.Td(this.EYQ.EYQ)) {
                this.EYQ.Nuq.sendEmptyMessageDelayed(800, 100L);
                return;
            }
            this.EYQ.Nuq.sendEmptyMessageDelayed(500, 100L);
            this.EYQ.wJ.EYQ(this.EYQ.Pm, true);
            this.EYQ.wJ.Td(true);
            this.EYQ.wJ.mZx(true);
            wBa wbaTp = this.EYQ.wJ.tp();
            if (wbaTp != null) {
                wbaTp.EYQ("prerender_page_show", (JSONObject) null);
            }
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        int iDub = this.EYQ.EYQ.dub();
        if (zF.MxO(this.EYQ.EYQ)) {
            iDub = (this.EYQ.EYQ.eVP() + 1) * 1000;
        }
        if (iDub == -1) {
            if (zF.Td(this.EYQ.EYQ)) {
                if (zF.hu(this.EYQ.EYQ) && this.EYQ.kf.UB()) {
                    mzx.hu();
                    return;
                } else {
                    mzx.wBa();
                    return;
                }
            }
            mzx.hu();
            return;
        }
        if (iDub >= 0) {
            this.EYQ.KR.Pm(false);
            if (zF.Td(this.EYQ.EYQ)) {
                if (zF.hu(this.EYQ.EYQ) && this.EYQ.kf.UB()) {
                    this.EYQ.Nuq.sendEmptyMessageDelayed(600, iDub);
                    return;
                } else {
                    this.EYQ.Nuq.sendEmptyMessageDelayed(1, iDub);
                    return;
                }
            }
            this.EYQ.Nuq.sendEmptyMessageDelayed(600, iDub);
        }
    }

    public boolean mZx(com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        this.EYQ.zF = IPb();
        int i = this.EYQ.zF;
        if (this.EYQ.EYQ.Pm()) {
            return false;
        }
        if (this.EYQ.zF == -1) {
            if (zF.Td(this.EYQ.EYQ) && this.EYQ.wJ.hu()) {
                mzx.wBa();
                return true;
            }
            mzx.hu();
            return true;
        }
        if (this.EYQ.zF < 0) {
            return true;
        }
        this.EYQ.Tnp.set(false);
        Message messageObtain = Message.obtain();
        messageObtain.what = 700;
        messageObtain.arg1 = this.EYQ.zF;
        this.EYQ.Nuq.sendMessage(messageObtain);
        return true;
    }

    private int IPb() {
        int iSOZ = this.EYQ.EYQ.sOZ();
        if (iSOZ <= 5000 && iSOZ >= 0) {
            if (iSOZ < 1000) {
                iSOZ += 1000;
            }
            int iEYQ = com.bytedance.sdk.openadsdk.core.hu.Pm().EYQ(this.EYQ.EYQ.yK());
            if (iEYQ <= 5000 && iEYQ >= 0) {
                if (iEYQ < 1000) {
                    iEYQ += 1000;
                }
                return Math.min(iSOZ, iEYQ);
            }
        }
        return -1;
    }

    private void VwS() {
        if (zF.tsL(this.EYQ.EYQ) && this.EYQ.Pm) {
            this.EYQ.KR.mZx(true);
            this.EYQ.XPd.EYQ(true);
        }
    }

    public void Td() {
        this.mZx.Pm();
    }

    public void Pm() {
        EYQ(true);
    }

    public void EYQ(boolean z) {
        if (!UB.Pm(this.EYQ.EYQ)) {
            this.EYQ.wJ.EYQ(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.EYQ.wJ.xt();
        this.EYQ.wJ.mZx(8);
        this.EYQ.wa.EYQ(8);
        if (this.EYQ.hYh) {
            tr.EYQ((View) this.EYQ.xh.nWX, 8);
            this.EYQ.TQF.IPb(0);
        }
        this.EYQ.TQF.Pm(8);
        if (this.EYQ.EYQ.oIw()) {
            if (!this.mZx.EYQ(this.EYQ.FtN)) {
                this.EYQ.TZn.finish();
            }
        } else {
            this.mZx.mZx();
        }
        this.EYQ.TQF.VwS();
        if (z) {
            mZx(this.EYQ.xh);
        }
        this.EYQ.KR.Td(false);
        this.EYQ.Pf.EYQ(this.EYQ.TZn.KO());
    }

    public boolean Kbd() {
        com.bytedance.sdk.openadsdk.component.reward.view.mZx mzx = this.mZx;
        if (mzx != null) {
            return mzx.Kbd();
        }
        return false;
    }
}
