package com.bytedance.sdk.openadsdk.component.QQ;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;

/* compiled from: TTAppOpenVideoManager.java */
/* loaded from: classes2.dex */
public class Td implements EYQ.InterfaceC0118EYQ {
    private Context EYQ;
    private mZx Pm;
    private UB Td;
    private FrameLayout mZx;

    public Td(Context context) {
        this.EYQ = context.getApplicationContext();
    }

    public void EYQ(FrameLayout frameLayout, UB ub) {
        this.mZx = frameLayout;
        this.Td = ub;
        this.Pm = new mZx(this.EYQ, frameLayout, ub);
    }

    public boolean EYQ() {
        String strEYQ;
        if (Build.VERSION.SDK_INT >= 23) {
            strEYQ = CacheDirFactory.getICacheDir(0).mZx();
        } else {
            try {
                strEYQ = com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ();
            } catch (Throwable unused) {
                strEYQ = "";
            }
        }
        com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(strEYQ, this.Td);
        mzxEYQ.mZx(this.Td.VOV());
        mzxEYQ.EYQ(this.mZx.getWidth());
        mzxEYQ.mZx(this.mZx.getHeight());
        mzxEYQ.Td(this.Td.GfQ());
        mzxEYQ.EYQ(0L);
        mzxEYQ.EYQ(true);
        return this.Pm.EYQ(mzxEYQ);
    }

    public boolean mZx() {
        mZx mzx = this.Pm;
        return (mzx == null || mzx.tsL() == null || !this.Pm.tsL().IPb()) ? false : true;
    }

    public boolean Td() {
        mZx mzx = this.Pm;
        return (mzx == null || mzx.tsL() == null || !this.Pm.tsL().VwS()) ? false : true;
    }

    public void EYQ(Td.EYQ eyq) {
        mZx mzx = this.Pm;
        if (mzx != null) {
            mzx.EYQ(eyq);
        }
    }

    public void Pm() {
        try {
            if (mZx()) {
                this.Pm.EYQ();
            }
        } catch (Throwable th) {
            pi.EYQ("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void Kbd() {
        mZx mzx = this.Pm;
        if (mzx != null) {
            mzx.mZx();
        }
    }

    public void IPb() {
        mZx mzx = this.Pm;
        if (mzx == null) {
            return;
        }
        this.EYQ = null;
        mzx.Td();
        this.Pm = null;
    }

    public long VwS() {
        mZx mzx = this.Pm;
        if (mzx != null) {
            return mzx.Kbd();
        }
        return 0L;
    }

    public long QQ() {
        mZx mzx = this.Pm;
        if (mzx != null) {
            return mzx.IPb();
        }
        return 0L;
    }

    public long HX() {
        mZx mzx = this.Pm;
        if (mzx != null) {
            return mzx.QQ() + this.Pm.IPb();
        }
        return 0L;
    }

    public void EYQ(int i) {
        if (this.Pm != null) {
            KO.EYQ eyq = new KO.EYQ();
            eyq.EYQ(VwS());
            eyq.Td(HX());
            eyq.mZx(QQ());
            eyq.Td(i);
            eyq.Pm(this.Pm.VwS());
            this.Pm.EYQ(eyq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ.InterfaceC0118EYQ
    public long getVideoProgress() {
        return VwS();
    }
}
