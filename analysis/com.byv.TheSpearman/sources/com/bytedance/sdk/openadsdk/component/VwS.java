package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.IPb;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.XN;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: TTAppOpenAdLoadManager.java */
/* loaded from: classes2.dex */
public class VwS implements wBa.EYQ {
    private final Context EYQ;
    private AdSlot IPb;
    private boolean MxO;
    private int QQ;
    private final IPb Td;
    private PAGAppOpenAdLoadListener VwS;
    private final UB<com.bytedance.sdk.openadsdk.mZx.EYQ> mZx;
    private final AtomicBoolean Pm = new AtomicBoolean(false);
    private int Kbd = 0;
    private volatile int HX = 0;
    private final XN tp = new XN();

    public VwS(Context context) {
        if (context != null) {
            this.EYQ = context.getApplicationContext();
        } else {
            this.EYQ = hu.EYQ();
        }
        this.mZx = hu.Td();
        this.Td = IPb.EYQ(this.EYQ);
    }

    public static VwS EYQ(Context context) {
        return new VwS(context);
    }

    public void EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td, int i) {
        if (td == null) {
            return;
        }
        if (i <= 0) {
            i = IronSourceConstants.BN_AUCTION_REQUEST;
        }
        this.IPb = adSlot;
        this.tp.EYQ = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (td instanceof PAGAppOpenAdLoadListener) {
            this.VwS = (PAGAppOpenAdLoadListener) td;
        }
        this.Kbd = EYQ(this.IPb);
        this.QQ = i;
        this.tp.EYQ(Nvm.EYQ());
        if (this.tp.EYQ || KO.Jpu().tPj(this.IPb.getCodeId()) == 0) {
            mZx(this.IPb);
        }
        if (this.tp.EYQ) {
            return;
        }
        new wBa(pi.mZx().getLooper(), this).sendEmptyMessageDelayed(1, i);
        EYQ();
    }

    private void mZx(final AdSlot adSlot) {
        final Nvm nvmEYQ = Nvm.EYQ();
        this.HX = 1;
        hYh hyh = new hYh();
        hyh.QQ = this.tp;
        hyh.Pm = 1;
        hyh.IPb = 2;
        this.mZx.EYQ(adSlot, hyh, 3, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.VwS.1
            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(int i, String str) throws JSONException {
                VwS.this.HX = 3;
                VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx) throws JSONException {
                VwS.this.HX = 2;
                if (eyq == null || eyq.Td() == null || eyq.Td().size() == 0) {
                    VwS.this.HX = 3;
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, com.bytedance.sdk.openadsdk.core.VwS.EYQ(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
                    mzx.EYQ(-3);
                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                    return;
                }
                final com.bytedance.sdk.openadsdk.core.model.UB ub = eyq.Td().get(0);
                long jTsL = ub.tsL();
                VwS.this.tp.mZx = jTsL;
                if (ub.BEC()) {
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub));
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ub)) {
                    int iTsL = hu.Pm().tsL();
                    if (iTsL == 1 || iTsL == 3) {
                        VwS.this.tp.mZx = -1L;
                        VwS.this.tp.EYQ(3);
                        VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub));
                        VwS.this.EYQ(ub, adSlot, false);
                        return;
                    }
                    VwS.this.EYQ(ub, adSlot, !r11.tp.EYQ);
                } else {
                    if (hu.Pm().MxO() == 1) {
                        VwS.this.tp.mZx = -1L;
                        VwS.this.tp.EYQ(3);
                        VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub));
                        VwS.this.EYQ(ub, false);
                        return;
                    }
                    VwS.this.EYQ(ub, !r11.tp.EYQ);
                }
                if (VwS.this.tp.EYQ) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ(ub, nvmEYQ.Td());
                    Long.valueOf(jTsL);
                    if (jTsL == 0) {
                        VwS.this.tp.EYQ(2);
                        VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub));
                    } else {
                        pi.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.VwS.1.1
                            @Override // java.lang.Runnable
                            public void run() throws JSONException {
                                VwS.this.tp.EYQ(2);
                                VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub));
                            }
                        }, jTsL);
                    }
                }
            }
        });
    }

    private void EYQ() {
        xt.mZx(new QQ("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.VwS.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                int iTsL;
                com.bytedance.sdk.openadsdk.core.model.UB ubKbd = VwS.this.Td.Kbd(VwS.this.Kbd);
                if (ubKbd == null) {
                    VwS.this.EYQ(false);
                    return;
                }
                boolean zKbd = com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ubKbd);
                if (ubKbd.BEC()) {
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 101, ubKbd));
                    return;
                }
                if (!zKbd && hu.Pm().MxO() == 1) {
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 101, ubKbd));
                    return;
                }
                if (!zKbd || ((iTsL = hu.Pm().tsL()) != 2 && iTsL != 3)) {
                    if (VwS.this.Td.mZx(VwS.this.Kbd) || VwS.this.Td.Pm(VwS.this.Kbd)) {
                        if (KO.Jpu().tPj(VwS.this.IPb.getCodeId()) == 0) {
                            VwS.this.Td.VwS(VwS.this.Kbd);
                        }
                        if (!zKbd) {
                            if (VwS.this.Td.mZx(ubKbd)) {
                                VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 101, ubKbd));
                                return;
                            } else {
                                VwS.this.EYQ(false);
                                com.bytedance.sdk.openadsdk.component.Pm.EYQ.mZx(ubKbd);
                                return;
                            }
                        }
                        if (!TextUtils.isEmpty(VwS.this.Td.EYQ(ubKbd)) || Build.VERSION.SDK_INT < 23) {
                            VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 101, ubKbd));
                            return;
                        } else {
                            VwS.this.EYQ(false);
                            com.bytedance.sdk.openadsdk.component.Pm.EYQ.mZx(ubKbd);
                            return;
                        }
                    }
                    VwS.this.EYQ(true);
                    return;
                }
                VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 101, ubKbd));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z) {
        if (z) {
            this.Td.VwS(this.Kbd);
        }
        if (KO.Jpu().tPj(this.IPb.getCodeId()) == 1) {
            mZx(this.IPb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, final boolean z) {
        this.Td.EYQ(ub, adSlot, this.tp, new IPb.Td() { // from class: com.bytedance.sdk.openadsdk.component.VwS.3
            @Override // com.bytedance.sdk.openadsdk.component.IPb.Td
            public void EYQ() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z) {
                    VwS.this.HX = 4;
                    com.bytedance.sdk.openadsdk.component.Kbd.mZx mzx = new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub);
                    mzx.EYQ(true);
                    VwS.this.EYQ(mzx);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.IPb.Td
            public void EYQ(int i, String str) throws JSONException {
                if (z) {
                    VwS.this.HX = 5;
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(2, 100, 10003, com.bytedance.sdk.openadsdk.core.VwS.EYQ(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, final boolean z) {
        this.Td.EYQ(ub, this.tp, new IPb.mZx() { // from class: com.bytedance.sdk.openadsdk.component.VwS.4
            @Override // com.bytedance.sdk.openadsdk.component.IPb.mZx
            public void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx) throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z) {
                    VwS.this.HX = 4;
                    com.bytedance.sdk.openadsdk.component.Kbd.mZx mzx2 = new com.bytedance.sdk.openadsdk.component.Kbd.mZx(1, 100, ub);
                    mzx2.EYQ(true);
                    VwS.this.EYQ(mzx2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.IPb.mZx
            public void EYQ() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z) {
                    VwS.this.HX = 5;
                    VwS.this.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(2, 100, 10003, com.bytedance.sdk.openadsdk.core.VwS.EYQ(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.openadsdk.component.Kbd.mZx mzx) throws JSONException {
        int iMZx = mzx.mZx();
        int iTd = mzx.Td();
        if (this.Pm.get()) {
            if (iMZx == 1 && iTd == 100 && mzx.EYQ()) {
                IPb.EYQ(hu.EYQ()).EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.EYQ(this.Kbd, mzx.Pm()));
                if (this.MxO) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(mzx.Pm(), 1, this.tp);
                return;
            }
            return;
        }
        if (iMZx != 1) {
            if (iMZx == 2 || iMZx == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.VwS;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(mzx.Kbd(), mzx.IPb());
                }
                this.Pm.set(true);
                if (iMZx == 3) {
                    com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(this.HX, this.QQ);
                    return;
                }
                return;
            }
            return;
        }
        if (this.VwS != null) {
            this.VwS.onAdLoaded(new Pm(this.EYQ, mzx.Pm(), iTd == 101, this.IPb));
        }
        this.Pm.set(true);
        if (iTd == 101) {
            com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(mzx.Pm(), this.tp.EYQ().Td());
            return;
        }
        if (iTd == 100) {
            com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(mzx.Pm(), 0, this.tp);
            this.MxO = true;
            if (this.tp.EYQ) {
                return;
            }
            if (KO.Jpu().tPj(this.IPb.getCodeId()) == 0) {
                this.Td.EYQ(this.IPb);
            } else {
                this.Td.EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.EYQ(this.Kbd, mzx.Pm()));
            }
        }
    }

    public int EYQ(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) throws JSONException {
        if (message.what != 1 || this.Pm.get()) {
            return;
        }
        EYQ(new com.bytedance.sdk.openadsdk.component.Kbd.mZx(3, 102, 10002, com.bytedance.sdk.openadsdk.core.VwS.EYQ(10002)));
    }
}
