package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Map;

/* compiled from: RewardFullVideoPlayerManager.java */
/* loaded from: classes2.dex */
public class pi {
    private FrameLayout HX;
    com.bykv.vk.openvk.component.video.api.Pm.Td IPb;
    private long MxO;
    final boolean Pm;
    private final UB QQ;
    boolean Td;
    private final EYQ UB;
    private boolean Uc;
    private final Activity VwS;
    private com.bytedance.sdk.openadsdk.mZx.VwS hYh;
    private boolean hu;
    private String nWX;
    private final String tp;
    private long tsL;
    protected boolean EYQ = false;
    boolean mZx = false;
    protected boolean Kbd = false;
    private int pi = -1;
    private HashSet<String> KO = new HashSet<>();

    public com.bytedance.sdk.openadsdk.mZx.VwS EYQ() {
        return this.hYh;
    }

    public pi(EYQ eyq) {
        this.UB = eyq;
        this.VwS = eyq.TZn;
        this.QQ = eyq.EYQ;
        this.Pm = eyq.IPb;
        this.tp = eyq.VwS;
    }

    public void EYQ(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.mZx.VwS vwS) {
        if (this.hu) {
            return;
        }
        this.hu = true;
        this.HX = frameLayout;
        this.hYh = vwS;
        if (UB.Kbd(this.QQ)) {
            this.IPb = new com.bytedance.sdk.openadsdk.core.video.Td.EYQ(this.VwS, this.HX, this.QQ, vwS);
            Kbd(this.Uc);
        } else {
            this.IPb = new com.bytedance.sdk.openadsdk.component.reward.Td(this.QQ, vwS);
        }
    }

    public boolean mZx() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        return (td == null || td.tsL() == null || !this.IPb.tsL().IPb()) ? false : true;
    }

    public com.bykv.vk.openvk.component.video.api.mZx.EYQ Td() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td == null) {
            return null;
        }
        if (td instanceof com.bytedance.sdk.openadsdk.component.reward.Td) {
            return ((com.bytedance.sdk.openadsdk.component.reward.Td) td).Uc();
        }
        return td.pi();
    }

    public boolean Pm() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        return (td == null || td.tsL() == null || !this.IPb.tsL().VwS()) ? false : true;
    }

    public boolean Kbd() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        return td != null && td.hu();
    }

    public void EYQ(long j, long j2) {
        this.tsL = j;
        mZx(j, j2);
    }

    private void mZx(long j, long j2) {
        int iAbs = (int) Math.abs(this.pi - j);
        int i = this.pi;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.KO.contains(this.nWX)) {
            return;
        }
        if (this.pi > j) {
            com.bytedance.sdk.openadsdk.core.pi.Td().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.pi.1
                @Override // java.lang.Runnable
                public void run() {
                    pi.this.wBa();
                    pi.this.UB.mN.EYQ(pi.this.pi, pi.this.nWX);
                }
            }, iAbs);
        } else {
            wBa();
            this.UB.mN.EYQ(this.pi, this.nWX);
        }
        this.KO.add(this.nWX);
    }

    public void EYQ(int i, String str) {
        this.pi = i;
        this.nWX = str;
    }

    public boolean IPb() {
        return this.EYQ;
    }

    public long VwS() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.Kbd();
        }
        return this.MxO;
    }

    public long QQ() {
        return this.tsL;
    }

    public long HX() {
        return this.MxO;
    }

    public void EYQ(long j) {
        this.MxO = j;
    }

    public void EYQ(boolean z) {
        this.EYQ = z;
    }

    public void tp() {
        try {
            if (mZx()) {
                this.IPb.EYQ();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void EYQ(int i, int i2) {
        if (this.IPb != null) {
            KO.EYQ eyq = new KO.EYQ();
            eyq.mZx(MxO());
            eyq.Td(hYh());
            eyq.EYQ(VwS());
            eyq.EYQ(i);
            eyq.mZx(i2);
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.Pm(this.IPb.pi(), eyq);
        }
    }

    public long MxO() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.IPb();
        }
        return 0L;
    }

    private void tr() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td == null || td.tsL() == null) {
            return;
        }
        this.MxO = this.IPb.Kbd();
        if (this.IPb.tsL().Td() || !this.IPb.tsL().mZx()) {
            this.IPb.EYQ();
            this.IPb.Td();
            this.EYQ = true;
        }
    }

    public void tsL() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td == null) {
            return;
        }
        td.Td();
        this.IPb = null;
    }

    public void pi() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            td.Pm();
        }
    }

    public void nWX() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            td.mZx();
        }
    }

    public void KO() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            td.EYQ();
        }
    }

    public void EYQ(Td.EYQ eyq) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            td.EYQ(eyq);
        }
    }

    public void mZx(boolean z) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            td.mZx(z);
        }
    }

    public long hu() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.QQ();
        }
        return 0L;
    }

    public int UB() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.tp();
        }
        return 0;
    }

    public int Uc() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.VwS();
        }
        return 0;
    }

    public long hYh() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.QQ() + this.IPb.IPb();
        }
        return 0L;
    }

    public void EYQ(String str) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.QQ, this.tp, str, VwS(), UB(), FH.EYQ(this.QQ, td.IPb(), this.IPb.tsL()), this.hYh);
            hYh();
            UB();
        }
        FH();
    }

    public long zF() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            return td.QQ();
        }
        return 0L;
    }

    public boolean WU() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td != null) {
            if (td.tsL() != null) {
                com.bykv.vk.openvk.component.video.api.EYQ eyqTsL = this.IPb.tsL();
                if (eyqTsL.VwS() || eyqTsL.QQ()) {
                    com.bykv.vk.openvk.component.video.api.Pm.Td td2 = this.IPb;
                    if (td2 instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
                        ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) td2).FtN();
                    }
                    return true;
                }
            } else if (IPb()) {
                EYQ(false);
                com.bykv.vk.openvk.component.video.api.Pm.Td td3 = this.IPb;
                if (td3 instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
                    ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) td3).FtN();
                }
                return true;
            }
        }
        return false;
    }

    public boolean XN() {
        return this.IPb != null;
    }

    public boolean NZ() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        return td != null && td.tsL() == null;
    }

    public boolean EYQ(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        boolean zEYQ = false;
        if (!XN()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.KO.Td(this.UB.EYQ)) {
            return true;
        }
        if (!z || !NZ()) {
            EYQ(mzx);
        }
        try {
            zEYQ = EYQ(j, this.UB.Pm);
        } catch (Exception e) {
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
        }
        if (zEYQ && !z) {
            this.UB.Pf.EYQ(map);
        }
        return zEYQ;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        if (this.UB.WU.get() || !this.UB.Kbd || zF.MxO(this.UB.EYQ)) {
            return;
        }
        if ((!UB.Kbd(this.UB.EYQ) && hu.Pm().tsL(String.valueOf(this.UB.KO)) == 1 && this.UB.mN.Pm()) || com.bytedance.sdk.openadsdk.core.model.KO.Td(this.UB.EYQ) || this.Kbd || !mzx.IPb()) {
            return;
        }
        this.UB.Nuq.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
        Message messageObtain = Message.obtain();
        messageObtain.what = Strategy.TTL_SECONDS_DEFAULT;
        this.UB.Nuq.sendMessageDelayed(messageObtain, 5000L);
    }

    private boolean EYQ(long j, boolean z) {
        if (this.IPb == null || this.QQ.mN() == null) {
            return false;
        }
        String strEYQ = CacheDirFactory.getICacheDir(this.QQ.Cia()).EYQ();
        File file = new File(strEYQ, this.QQ.mN().nWX());
        if (file.exists() && file.length() > 0) {
            this.mZx = true;
        }
        com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(strEYQ, this.QQ);
        mzxEYQ.mZx(this.QQ.VOV());
        mzxEYQ.EYQ(this.HX.getWidth());
        mzxEYQ.mZx(this.HX.getHeight());
        mzxEYQ.Td(this.QQ.GfQ());
        mzxEYQ.EYQ(j);
        mzxEYQ.EYQ(z);
        if (this.UB.TZn.hu() && !this.UB.mN.QQ() && UB.Kbd(this.QQ)) {
            mzxEYQ.Pm = 1;
        }
        return this.IPb.EYQ(mzxEYQ);
    }

    public void Td(boolean z) {
        this.Td = z;
    }

    public boolean tPj() {
        return this.Td;
    }

    public void Pm(final boolean z) {
        tsL();
        com.bytedance.sdk.openadsdk.core.pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.pi.2
            @Override // java.lang.Runnable
            public void run() {
                if (pi.this.Td) {
                    return;
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.tsL.EYQ(hu.EYQ()).EYQ(pi.this.QQ.Nvm());
                } else {
                    com.bytedance.sdk.openadsdk.component.reward.Kbd.EYQ(hu.EYQ()).EYQ(pi.this.QQ.Nvm());
                }
            }
        });
    }

    public void wBa() {
        try {
            if (mZx()) {
                this.Kbd = true;
                KO();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx) {
        try {
            this.Kbd = false;
            if (IPb()) {
                tr();
                mZx(mzx);
            } else if (Pm()) {
                nWX();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void EYQ(boolean z, com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx, boolean z2) {
        if (!z2 || z || this.Kbd) {
            return;
        }
        if (Pm()) {
            nWX();
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
        } else {
            tr();
            mZx(mzx);
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public boolean rfB() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td == null || td.tsL() == null) {
            return false;
        }
        return this.IPb.tsL().EYQ();
    }

    protected void mZx(com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx) {
        if (!WU() || mzx == null) {
            return;
        }
        mzx.EYQ(HX(), true);
    }

    public double lEs() {
        if (com.bytedance.sdk.openadsdk.core.model.KO.Td(this.QQ) && this.QQ.QQ() != null) {
            return this.QQ.QQ().mZx();
        }
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = this.QQ.mN();
        return mzxMN != null ? mzxMN.IPb() * mzxMN.XN() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public void xt() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
            ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) td).Tnp();
        }
    }

    public View Nvm() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) td).PI();
        }
        return null;
    }

    public void FH() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.IPb;
        if (td instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
            ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) td).kf();
        }
    }

    public void Kbd(boolean z) {
        this.Uc = z;
        if (this.IPb instanceof com.bytedance.sdk.openadsdk.core.video.Td.EYQ) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) this.IPb).mZx(this.QQ.mN().XN());
            } else {
                this.QQ.mN().tp(1);
                ((com.bytedance.sdk.openadsdk.core.video.Td.EYQ) this.IPb).mZx(1);
            }
        }
    }
}
