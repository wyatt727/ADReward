package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: RewardFullUgenEndcardManager.java */
/* loaded from: classes2.dex */
public class MxO {
    final UB EYQ;
    private volatile long IPb;
    private volatile long Kbd;
    private com.bytedance.adsdk.ugeno.component.mZx MxO;
    private String QQ;
    private FrameLayout Td;
    private volatile long VwS;
    private final EYQ mZx;
    private boolean pi;
    private final AtomicBoolean Pm = new AtomicBoolean(false);
    private final AtomicBoolean HX = new AtomicBoolean(false);
    private long tp = 0;
    private String tsL = null;

    public MxO(EYQ eyq) {
        this.mZx = eyq;
        this.EYQ = eyq.EYQ;
        this.QQ = eyq.VwS;
    }

    public void EYQ() {
        if (this.pi) {
            return;
        }
        this.pi = true;
        mZx();
    }

    void mZx() {
        this.Td = (FrameLayout) this.mZx.TZn.findViewById(com.bytedance.sdk.openadsdk.utils.tp.KO);
    }

    public void Td() {
        com.bytedance.sdk.openadsdk.core.ugen.mZx.mZx mzx = new com.bytedance.sdk.openadsdk.core.ugen.mZx.mZx(this.mZx.TZn, this.EYQ.aEX(), this.EYQ, this.QQ, new com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.MxO.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
            public void EYQ() {
                MxO.this.tp = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
            public void EYQ(int i, String str, String str2) throws JSONException {
                MxO.this.tsL = str2;
                MxO.this.Pm.set(false);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(MxO.this.EYQ, MxO.this.QQ, t2.f.e, SystemClock.elapsedRealtime() - MxO.this.tp, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
            public void EYQ(String str) throws JSONException {
                MxO.this.tsL = str;
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(MxO.this.EYQ, MxO.this.QQ, "success", SystemClock.elapsedRealtime() - MxO.this.tp, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ
            public void mZx() throws JSONException {
                MxO.this.Pm();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ
            public void EYQ(int i, String str) throws JSONException {
                MxO.this.Pm.set(false);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(MxO.this.EYQ, MxO.this.QQ, SystemClock.elapsedRealtime() - MxO.this.Kbd, i, str, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ
            public void EYQ(com.bytedance.adsdk.ugeno.component.mZx<View> mzx2) throws JSONException {
                MxO.this.MxO = mzx2;
                MxO.this.Pm.set(true);
                MxO.this.IPb = SystemClock.elapsedRealtime();
                MxO.this.VwS();
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(MxO.this.EYQ, MxO.this.QQ, MxO.this.IPb - MxO.this.Kbd);
            }
        });
        mzx.EYQ();
        mzx.EYQ(this.mZx.TQF.tp());
    }

    public void EYQ(int i) {
        tr.EYQ((View) this.Td, i);
    }

    public void Pm() throws JSONException {
        this.Kbd = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.EYQ, this.QQ);
    }

    public void Kbd() {
        this.VwS = SystemClock.elapsedRealtime();
    }

    public void IPb() {
        QQ();
        VwS();
        com.bytedance.adsdk.ugeno.component.mZx mzx = this.MxO;
        if (mzx != null) {
            this.Td.addView(mzx.HX(), new FrameLayout.LayoutParams(this.MxO.KO(), this.MxO.hu()));
        }
    }

    public void VwS() throws JSONException {
        if (this.VwS <= 0 || this.IPb <= 0 || this.HX.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.IPb - this.VwS, this.EYQ, this.QQ, this.tsL);
    }

    public void QQ() throws JSONException {
        com.bytedance.sdk.openadsdk.mZx.Td.Td(this.EYQ, this.QQ);
    }

    public void HX() {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(SystemClock.elapsedRealtime() - this.VwS, this.EYQ, this.QQ);
    }

    public boolean tp() {
        return this.Pm.get();
    }
}
