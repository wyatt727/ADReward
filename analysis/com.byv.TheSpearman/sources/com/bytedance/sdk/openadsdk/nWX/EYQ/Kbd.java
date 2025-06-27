package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PAGMrcTrackerManager.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static final Map<Integer, mZx> EYQ = new ConcurrentHashMap();

    public static void EYQ(View view, UB ub, int i) {
        if (view == null || ub == null || ub.PP()) {
            return;
        }
        boolean zTd = Td(ub);
        if (zF.mZx(ub)) {
            i = -1;
        }
        EYQ(EYQ(view, ub, zTd, i));
    }

    private static boolean Td(UB ub) {
        if (ub == null) {
            return false;
        }
        String strEYQ = FH.EYQ(ub);
        return ((("open_ad".equals(strEYQ) || "fullscreen_interstitial_ad".equals(strEYQ) || "rewarded_video".equals(strEYQ)) && !zF.mZx(ub)) && ub.nWX() != 5) && UB.Kbd(ub) && ub.mN() != null;
    }

    private static mZx EYQ(View view, UB ub, boolean z, int i) {
        if (view == null || ub == null || ub.VOV() == null) {
            return null;
        }
        Integer numMZx = mZx(ub);
        Map<Integer, mZx> map = EYQ;
        if (map.containsKey(numMZx)) {
            mZx mzx = map.get(numMZx);
            if (mzx != null) {
                mzx.EYQ(view);
            }
            return mzx;
        }
        mZx mzxEYQ = mZx.EYQ(z, numMZx, view, ub, i);
        map.put(numMZx, mzxEYQ);
        return mzxEYQ;
    }

    private static void EYQ(mZx mzx) {
        if (mzx == null) {
            return;
        }
        mzx.EYQ();
    }

    public static void EYQ(UB ub, int i) {
        if (ub == null || ub.VOV() == null) {
            return;
        }
        EYQ(EYQ.get(mZx(ub)), i);
    }

    public static void EYQ(mZx mzx, int i) {
        if (mzx == null) {
            return;
        }
        mzx.EYQ(i);
    }

    public static void EYQ(UB ub) {
        if (ub == null || ub.VOV() == null) {
            return;
        }
        Integer numMZx = mZx(ub);
        Map<Integer, mZx> map = EYQ;
        mZx mzx = map.get(numMZx);
        if (mzx != null) {
            mzx.tp();
        }
        mZx(numMZx);
        if (map.size() <= 0) {
            VwS.EYQ();
        }
    }

    public static mZx EYQ(Integer num) {
        return EYQ.get(num);
    }

    public static void mZx(Integer num) {
        EYQ.remove(num);
    }

    public static Integer mZx(UB ub) {
        return Integer.valueOf((ub.ZFP() + ub.VOV()).hashCode());
    }
}
