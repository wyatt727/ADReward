package com.bytedance.sdk.openadsdk.component.EYQ;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.nativeexpress.IPb;
import com.bytedance.sdk.openadsdk.core.nativeexpress.VwS;
import com.com.bytedance.overseas.sdk.EYQ.Pm;
import java.util.HashMap;

/* compiled from: TTAppOpenAdClickManager.java */
/* loaded from: classes2.dex */
public class mZx {
    public static EYQ EYQ(UB ub, Activity activity, com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq) {
        EYQ eyq2 = new EYQ(activity.getApplicationContext(), ub, "open_ad", 4, eyq);
        eyq2.EYQ(activity.findViewById(R.id.content));
        eyq2.mZx(activity.findViewById(520093713));
        EYQ(activity.getApplicationContext(), ub, eyq2);
        EYQ(eyq2, ub);
        return eyq2;
    }

    public static VwS EYQ(UB ub, Activity activity, final com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        VwS vwS = new VwS(activity, ub, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.EYQ.mZx.1
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(eyq.mZx()));
                EYQ(map);
                super.EYQ(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        vwS.EYQ(pAGAppOpenAdExpressView);
        EYQ(activity.getApplicationContext(), ub, vwS);
        EYQ(vwS, ub);
        return vwS;
    }

    public static IPb mZx(UB ub, Activity activity, final com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        IPb iPb = new IPb(activity.getApplicationContext(), ub, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.EYQ.mZx.2
            @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(eyq.mZx()));
                EYQ(map);
                super.EYQ(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        iPb.EYQ((View) pAGAppOpenAdExpressView);
        EYQ(activity.getApplicationContext(), ub, iPb);
        EYQ(iPb, ub);
        return iPb;
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.mZx.mZx mzx, UB ub) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(ub.tp()));
        map.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(zF.MxO(ub) ? 3 : 1));
        mzx.EYQ(map);
    }

    private static void EYQ(Context context, UB ub, com.bytedance.sdk.openadsdk.core.mZx.mZx mzx) {
        if (ub == null || ub.Pf() != 4) {
            return;
        }
        mzx.EYQ(Pm.EYQ(context, ub, "open_ad"));
    }
}
