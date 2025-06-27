package com.bytedance.sdk.component.EYQ;

import android.net.Uri;
import com.bytedance.sdk.component.EYQ.MxO;
import com.bytedance.sdk.component.EYQ.WU;
import com.bytedance.sdk.component.EYQ.XN;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PermissionChecker.java */
/* loaded from: classes2.dex */
class zF {
    private final Set<String> EYQ;
    private MxO.EYQ Kbd;
    private final WU Pm;
    private final XN Td = UB.EYQ;
    private final Set<String> mZx;

    zF(WU wu, Set<String> set, Set<String> set2) {
        this.Pm = wu;
        if (set == null || set.isEmpty()) {
            this.EYQ = new LinkedHashSet();
        } else {
            this.EYQ = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.mZx = new LinkedHashSet();
        } else {
            this.mZx = new LinkedHashSet(set2);
        }
    }

    final synchronized NZ EYQ(boolean z, String str, mZx mzx) throws WU.EYQ {
        NZ nzMZx;
        MxO.EYQ eyq;
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        NZ nz = this.mZx.contains(mzx.EYQ()) ? NZ.PUBLIC : null;
        for (String str2 : this.EYQ) {
            if (uri.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                nz = NZ.PRIVATE;
                break;
            }
        }
        if (nz == null && (eyq = this.Kbd) != null && eyq.EYQ(str)) {
            if (this.Kbd.EYQ(str, mzx.EYQ())) {
                return null;
            }
            nz = NZ.PRIVATE;
        }
        if (z) {
            nzMZx = EYQ(str, mzx);
        } else {
            nzMZx = mZx(str, mzx);
        }
        return nzMZx != null ? nzMZx : nz;
    }

    final synchronized NZ EYQ(String str, mZx mzx) throws WU.EYQ {
        return EYQ(str, mzx, true);
    }

    final synchronized NZ mZx(String str, mZx mzx) {
        return EYQ(str, mzx, false);
    }

    void EYQ(MxO.EYQ eyq) {
        this.Kbd = eyq;
    }

    void EYQ(XN.EYQ eyq) {
        if (this.Td != null) {
            throw null;
        }
    }

    void mZx(XN.EYQ eyq) {
        if (this.Td != null) {
            throw null;
        }
    }

    private NZ EYQ(String str, mZx mzx, boolean z) {
        if (!z || this.Pm == null) {
            return null;
        }
        throw null;
    }
}
