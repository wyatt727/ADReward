package com.bytedance.sdk.openadsdk.component.QQ;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import org.json.JSONException;

/* compiled from: TTAppOpenVideoController.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.sdk.openadsdk.core.video.Td.EYQ {
    public mZx(Context context, ViewGroup viewGroup, UB ub) {
        super(context, viewGroup, ub, null);
    }

    public void EYQ(KO.EYQ eyq) {
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.IPb, eyq, (VwS) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.EYQ
    public void Uc() throws JSONException {
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ());
        eyq.mZx(IPb());
        eyq.Pm(VwS());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.Kbd(this.IPb, eyq);
    }
}
