package com.bytedance.adsdk.ugeno.core.mZx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.QQ;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.mZx.HX;
import org.json.JSONObject;

/* compiled from: UGDelayEventProcessor.java */
/* loaded from: classes2.dex */
public class mZx implements HX.EYQ {
    private int EYQ;
    private Handler IPb = new HX(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.component.mZx Kbd;
    private MxO Pm;
    private Context Td;
    private pi mZx;

    public mZx(Context context, MxO mxO, com.bytedance.adsdk.ugeno.component.mZx mzx) {
        this.Td = context;
        this.Pm = mxO;
        this.Kbd = mzx;
    }

    public void EYQ(pi piVar) {
        this.mZx = piVar;
    }

    public void EYQ() {
        MxO mxO = this.Pm;
        if (mxO == null) {
            return;
        }
        try {
            int i = Integer.parseInt(com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(mxO.Td().optString("delay"), this.Kbd.tp()));
            this.EYQ = i;
            this.IPb.sendEmptyMessageDelayed(1001, i);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZx.HX.EYQ
    public void EYQ(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectTd = this.Pm.Td();
        if (TextUtils.equals(jSONObjectTd.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectTd.optString("nodeId");
            com.bytedance.adsdk.ugeno.component.mZx mzx = this.Kbd;
            com.bytedance.adsdk.ugeno.component.mZx mZx = mzx.mZx(mzx).mZx(strOptString);
            new QQ(mZx.HX(), com.bytedance.adsdk.ugeno.core.EYQ.EYQ(jSONObjectTd.optJSONObject("animatorSet"), mZx)).EYQ();
        } else {
            pi piVar = this.mZx;
            if (piVar != null) {
                MxO mxO = this.Pm;
                com.bytedance.adsdk.ugeno.component.mZx mzx2 = this.Kbd;
                piVar.EYQ(mxO, mzx2, mzx2);
            }
        }
        this.IPb.removeMessages(1001);
    }
}
