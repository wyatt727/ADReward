package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: RewardFullExpressManager.java */
/* loaded from: classes2.dex */
public class IPb {
    private final EYQ EYQ;

    public IPb(EYQ eyq) {
        this.EYQ = eyq;
    }

    public void EYQ(float[] fArr, final com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx, final com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx2) {
        FrameLayout.LayoutParams layoutParams;
        Arrays.toString(fArr);
        this.EYQ.mN.EYQ(new AdSlot.Builder().setCodeId(String.valueOf(this.EYQ.EYQ.yK())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        if (this.EYQ.KR != null && this.EYQ.mN != null) {
            this.EYQ.KR.EYQ(this.EYQ.mN.EYQ());
        }
        this.EYQ.mN.EYQ(new com.bytedance.sdk.openadsdk.core.nativeexpress.tsL() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void EYQ(boolean z) {
                if (IPb.this.EYQ.Pm != z) {
                    IPb.this.EYQ.KR.Kbd();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void EYQ() {
                IPb.this.EYQ.KR.Pm();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void mZx() {
                if (IPb.this.EYQ.TQF == null || IPb.this.EYQ.TQF.tp() == null) {
                    return;
                }
                IPb.this.EYQ.TQF.tp().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void EYQ(int i) {
                if (i != 1) {
                    if (i == 2) {
                        IPb.this.EYQ.FtN.wBa();
                        return;
                    }
                    if (i == 3) {
                        IPb.this.EYQ.FtN.EYQ(mzx);
                        return;
                    } else if (i == 4) {
                        IPb.this.EYQ.FtN.tsL();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (IPb.this.EYQ.FtN.mZx() || IPb.this.EYQ.FtN.Pm()) {
                    return;
                }
                mzx.EYQ(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public long Td() {
                return IPb.this.EYQ.FtN.QQ();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public int Pm() {
                if (IPb.this.EYQ.mN.Td()) {
                    return 4;
                }
                if (IPb.this.EYQ.mN.Pm()) {
                    return 5;
                }
                if (IPb.this.EYQ.FtN.Kbd()) {
                    return 1;
                }
                if (IPb.this.EYQ.FtN.mZx()) {
                    return 2;
                }
                IPb.this.EYQ.FtN.Pm();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void Kbd() {
                IPb.this.EYQ.lRN.EYQ(mzx2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void mZx(int i) {
                IPb.this.EYQ.QQ = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.tsL
            public void EYQ(int i, String str) {
                IPb.this.EYQ.FtN.EYQ(i, str);
            }
        });
        this.EYQ.mN.EYQ(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (IPb.this.EYQ == null || IPb.this.EYQ.EYQ == null || !IPb.this.EYQ.EYQ.oB()) {
                    return;
                }
                mzx.Uc();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                if (!IPb.this.EYQ.EYQ.HG()) {
                    IPb.this.EYQ.wJ.EYQ(true);
                    IPb.this.EYQ.wJ.Kbd();
                }
                IPb.this.EYQ.mN.Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        mzx2.EYQ(false, false, false, 90);
                    }
                });
                IPb.this.EYQ.TQF.pi();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) throws Resources.NotFoundException {
                if (zF.MxO(IPb.this.EYQ.EYQ)) {
                    return;
                }
                if (!IPb.this.EYQ.EYQ.HG()) {
                    if (!IPb.this.EYQ.mN.QQ()) {
                        IPb.this.EYQ.FtN.Kbd(true);
                    } else {
                        mzx2.EYQ(true);
                        IPb.this.EYQ.FtN.Kbd(false);
                    }
                    IPb.this.EYQ.TQF.mZx(8);
                    IPb.this.EYQ.wJ.EYQ(true);
                    IPb.this.EYQ.wJ.Kbd();
                    if (IPb.this.EYQ.mN.QQ()) {
                        IPb.this.EYQ.mN.mZx().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        mzx2.EYQ(IPb.this.EYQ.TQF.IPb());
                    } else if (IPb.this.EYQ.EYQ.mN() != null && mzx2.EYQ()) {
                        IPb.this.EYQ.HX = true;
                    }
                }
                mzx2.lEs();
                if (mzx2 instanceof com.bytedance.sdk.openadsdk.component.reward.mZx.Kbd) {
                    com.bytedance.sdk.openadsdk.component.reward.mZx.Kbd.EYQ(IPb.this.EYQ.EYQ, IPb.this.EYQ.mN.QQ(), IPb.this.EYQ.VwS);
                    if (!IPb.this.EYQ.mN.QQ()) {
                        IPb.this.EYQ.TZn.VwS();
                    }
                }
                IPb.this.EYQ.TQF.pi();
            }
        });
        com.bytedance.sdk.openadsdk.core.nativeexpress.VwS vwS = new com.bytedance.sdk.openadsdk.core.nativeexpress.VwS(this.EYQ.TZn, this.EYQ.EYQ, this.EYQ.VwS, FH.EYQ(this.EYQ.VwS)) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb.3
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                super.EYQ(view, f, f2, f3, f4, sparseArray, z);
                mzx.Uc();
            }
        };
        HashMap map = new HashMap();
        if (zF.MxO(this.EYQ.EYQ)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        vwS.EYQ(map);
        com.bytedance.sdk.openadsdk.core.nativeexpress.IPb iPb = new com.bytedance.sdk.openadsdk.core.nativeexpress.IPb(this.EYQ.TZn, this.EYQ.EYQ, this.EYQ.VwS, FH.EYQ(this.EYQ.VwS)) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb.4
            @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(IPb.this.EYQ.FtN.VwS()));
                EYQ(map2);
                super.EYQ(view, f, f2, f3, f4, sparseArray, z);
                if (EYQ(view, z)) {
                    mzx.Uc();
                }
            }
        };
        HashMap map2 = new HashMap();
        if (zF.MxO(this.EYQ.EYQ)) {
            map2.put("click_scence", 3);
        } else {
            map2.put("click_scence", 1);
        }
        iPb.EYQ(map2);
        this.EYQ.mN.EYQ(vwS, iPb);
        if (this.EYQ.EYQ.HG()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.EYQ.TQF.IPb().addView(this.EYQ.mN.EYQ(), layoutParams);
        if (!this.EYQ.mN.QQ()) {
            mzx2.EYQ(false);
        }
        this.EYQ.mN.MxO();
    }
}
