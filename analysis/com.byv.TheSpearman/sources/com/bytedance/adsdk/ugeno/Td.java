package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.Kbd;
import com.bytedance.adsdk.ugeno.core.Pm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenoEnv.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td EYQ;
    private EYQ Pm;
    private com.bytedance.adsdk.ugeno.core.Td Td;
    private List<com.bytedance.adsdk.ugeno.core.mZx> mZx;

    public static Td EYQ() {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td();
                }
            }
        }
        return EYQ;
    }

    private Td() {
    }

    public void EYQ(Context context, com.bytedance.adsdk.ugeno.core.Td td, EYQ eyq) {
        this.Td = td;
        this.Pm = eyq;
        Td();
    }

    public EYQ mZx() {
        return this.Pm;
    }

    private void Td() {
        this.mZx = new ArrayList();
        this.mZx.addAll(new Kbd().EYQ());
        com.bytedance.adsdk.ugeno.core.Td td = this.Td;
        if (td != null) {
            this.mZx.addAll(td.EYQ());
        }
        Pm.EYQ(this.mZx);
    }
}
