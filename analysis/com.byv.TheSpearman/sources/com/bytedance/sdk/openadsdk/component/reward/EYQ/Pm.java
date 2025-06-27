package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import org.json.JSONObject;

/* compiled from: RewardFullDownloadManager.java */
/* loaded from: classes2.dex */
public class Pm {
    com.com.bytedance.overseas.sdk.EYQ.Td EYQ;
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ Kbd;
    private boolean Pm;
    private final String Td;
    private final UB mZx;

    /* compiled from: RewardFullDownloadManager.java */
    public interface EYQ {
        void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3);

        void EYQ(String str, JSONObject jSONObject);
    }

    public Pm(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.Kbd = eyq;
        this.mZx = eyq.EYQ;
        this.Td = eyq.VwS;
    }

    public void EYQ() {
        if (this.Pm) {
            return;
        }
        this.Pm = true;
        Pm();
    }

    private void Pm() {
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td() && this.mZx.Pf() == 4) {
            this.EYQ = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this.Kbd.VOV, this.mZx, this.Td);
        }
        if (this.EYQ == null) {
            this.EYQ = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this.Kbd.TZn, this.mZx, this.Td);
        }
    }

    public void mZx() {
        com.com.bytedance.overseas.sdk.EYQ.Td td = this.EYQ;
        if (td != null) {
            td.Pm();
        }
    }

    public com.com.bytedance.overseas.sdk.EYQ.Td Td() {
        return this.EYQ;
    }

    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3, EYQ eyq) {
        if (this.EYQ != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.tp.Kbd) {
                eyq.EYQ("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.tp.Pm) {
                eyq.EYQ("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.tp.Td) {
                eyq.EYQ("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.tp.mZx) {
                    eyq.EYQ("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        eyq.EYQ(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
