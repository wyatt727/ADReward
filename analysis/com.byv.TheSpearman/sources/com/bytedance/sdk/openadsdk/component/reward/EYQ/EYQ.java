package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullContext.java */
/* loaded from: classes2.dex */
public class EYQ {
    public com.bytedance.sdk.openadsdk.common.VwS Dal;
    public final UB EYQ;
    public final pi FtN;
    public boolean HX;
    public final boolean IPb;
    public final int KO;
    public final tp KR;
    public final HX Kbc;
    public float MxO;
    public final wBa Nuq;
    public final RewardFullBaseLayout OtA;
    public final Pm PI;
    public final QQ Pf;
    public boolean Pm;
    public int QQ;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Kbd TQF;
    public final TTBaseVideoActivity TZn;
    public String Td;
    public boolean UB;
    public final Context VOV;
    public final String VwS;
    public final com.bytedance.sdk.openadsdk.HX.VwS XPd;
    public final boolean hYh;
    public boolean hu;
    public final VwS kf;
    public final Td lRN;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Td mN;
    public final boolean mZx;
    public boolean nWX;
    public final Kbd na;
    public int pi;
    public int tsL;
    public final IPb vD;
    public final nWX wJ;
    public final MxO wa;
    public com.bytedance.sdk.openadsdk.component.reward.mZx.mZx xh;
    public boolean Kbd = false;
    public int tp = 1;
    public long Uc = 0;
    public int zF = 0;
    public final AtomicBoolean WU = new AtomicBoolean(false);
    public final AtomicBoolean XN = new AtomicBoolean(false);
    public final AtomicBoolean NZ = new AtomicBoolean(false);
    public final AtomicBoolean tPj = new AtomicBoolean(false);
    public final AtomicBoolean wBa = new AtomicBoolean(false);
    public final AtomicBoolean rfB = new AtomicBoolean(false);
    public final AtomicBoolean lEs = new AtomicBoolean(false);
    public final AtomicBoolean xt = new AtomicBoolean(false);
    public final AtomicBoolean Nvm = new AtomicBoolean(false);
    public final AtomicBoolean FH = new AtomicBoolean(false);
    public final AtomicBoolean tr = new AtomicBoolean(false);
    public final AtomicBoolean Tnp = new AtomicBoolean(false);

    public EYQ(TTBaseVideoActivity tTBaseVideoActivity, wBa wba, UB ub) {
        this.TZn = tTBaseVideoActivity;
        Context applicationContext = tTBaseVideoActivity.getApplicationContext();
        this.VOV = applicationContext;
        this.EYQ = ub;
        this.VwS = tTBaseVideoActivity.EYQ;
        this.Nuq = wba;
        this.IPb = tTBaseVideoActivity.KO();
        this.hYh = com.bytedance.sdk.openadsdk.core.model.KO.QQ(ub);
        int iYK = ub.yK();
        this.KO = iYK;
        this.Pm = hu.Pm().hu(String.valueOf(iYK));
        this.mZx = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().pi(String.valueOf(iYK));
        this.Kbc = new HX(this);
        this.TQF = tTBaseVideoActivity.hu() ? new com.bytedance.sdk.openadsdk.component.reward.view.Kbd(this) : new com.bytedance.sdk.openadsdk.component.reward.view.Pm(this);
        this.OtA = new RewardFullBaseLayout(tTBaseVideoActivity);
        this.FtN = new pi(this);
        this.PI = new Pm(this);
        this.kf = new VwS(this);
        this.mN = new com.bytedance.sdk.openadsdk.component.reward.view.Td(this);
        this.wJ = new nWX(this);
        this.wa = new MxO(this);
        this.KR = new tp(this);
        this.na = new Kbd(this);
        this.Pf = new QQ(this);
        this.vD = new IPb(this);
        this.lRN = new Td(this);
        this.XPd = new com.bytedance.sdk.openadsdk.HX.VwS(applicationContext);
    }

    public void EYQ(boolean z) {
        this.hu = z;
        this.KR.Pm(z);
    }
}
