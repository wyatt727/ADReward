package com.bytedance.adsdk.ugeno.core.mZx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.mZx.HX;
import org.json.JSONObject;

/* compiled from: UGTimerEventProcessor.java */
/* loaded from: classes2.dex */
public class Kbd implements HX.EYQ {
    private boolean EYQ;
    private com.bytedance.adsdk.ugeno.component.mZx IPb;
    private MxO Kbd;
    private Context Pm;
    private pi Td;
    private Handler VwS = new HX(Looper.getMainLooper(), this);
    private int mZx;

    public Kbd(Context context, MxO mxO, com.bytedance.adsdk.ugeno.component.mZx mzx) {
        this.Pm = context;
        this.Kbd = mxO;
        this.IPb = mzx;
    }

    public void EYQ(pi piVar) {
        this.Td = piVar;
    }

    public void EYQ() {
        MxO mxO = this.Kbd;
        if (mxO == null) {
            return;
        }
        JSONObject jSONObjectTd = mxO.Td();
        try {
            this.mZx = Integer.parseInt(com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObjectTd.optString("interval", "8000"), this.IPb.tp()));
            this.EYQ = jSONObjectTd.optBoolean("repeat");
            this.VwS.sendEmptyMessageDelayed(1001, this.mZx);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZx.HX.EYQ
    public void EYQ(Message message) {
        if (message.what != 1001) {
            return;
        }
        pi piVar = this.Td;
        if (piVar != null) {
            MxO mxO = this.Kbd;
            com.bytedance.adsdk.ugeno.component.mZx mzx = this.IPb;
            piVar.EYQ(mxO, mzx, mzx);
        }
        if (this.EYQ) {
            this.VwS.sendEmptyMessageDelayed(1001, this.mZx);
        } else {
            this.VwS.removeMessages(1001);
        }
    }
}
