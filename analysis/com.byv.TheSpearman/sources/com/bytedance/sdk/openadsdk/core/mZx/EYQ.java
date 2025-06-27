package com.bytedance.sdk.openadsdk.core.mZx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.lang.ref.WeakReference;

/* compiled from: ClickCreativeListener.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx {
    private boolean EYQ;
    private boolean FtN;
    private WeakReference<InterfaceC0118EYQ> PI;
    private int kf;
    private boolean mZx;

    /* compiled from: ClickCreativeListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0118EYQ {
        long getVideoProgress();
    }

    public boolean Td() {
        return false;
    }

    public boolean mZx() {
        return false;
    }

    public EYQ(Context context, UB ub, String str, int i) {
        super(context, ub, str, i);
        this.EYQ = true;
        this.mZx = false;
        this.FtN = false;
    }

    public void EYQ(boolean z) {
        this.EYQ = z;
    }

    public void mZx(boolean z) {
        this.mZx = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0383 A[Catch: Exception -> 0x0398, TryCatch #0 {Exception -> 0x0398, blocks: (B:172:0x0376, B:174:0x037f, B:178:0x0395, B:176:0x0383), top: B:195:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0395 A[Catch: Exception -> 0x0398, TRY_LEAVE, TryCatch #0 {Exception -> 0x0398, blocks: (B:172:0x0376, B:174:0x037f, B:178:0x0395, B:176:0x0383), top: B:195:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(android.view.View r35, float r36, float r37, float r38, float r39, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.mZx.Td.EYQ> r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mZx.EYQ.EYQ(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    protected boolean EYQ() {
        if (this.Kbd == null) {
            return true;
        }
        int iMZx = hu.Pm().mZx(this.Kbd.yK());
        int iTd = com.bytedance.sdk.component.utils.hu.Td(hu.EYQ());
        if (iMZx == 1) {
            return FH.Pm(iTd);
        }
        if (iMZx == 2) {
            return FH.Kbd(iTd) || FH.Pm(iTd) || FH.IPb(iTd);
        }
        if (iMZx != 3) {
            return iMZx != 5 || FH.Pm(iTd) || FH.IPb(iTd);
        }
        return false;
    }

    private boolean QQ() {
        return UB.Kbd(this.Kbd) && this.Kbd.XN() == 1;
    }

    private boolean Pm(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof NativeVideoTsView) || view.getId() == tp.oZ || view.getId() == tp.Pf || view.getId() == tp.vD || view.getId() == tp.lRN || view.getId() == tp.XPd || view.getId() == 520093726 || view.getId() == tp.Cia) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return false;
            }
            if (Pm(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean HX() {
        return this instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.IPb;
    }

    private boolean tp() {
        if (this.Kbd == null || HX()) {
            return false;
        }
        if (this.Kbd.by() != 5 && this.Kbd.by() != 15) {
            return false;
        }
        if (this.kf == 0) {
            this.kf = this.Kbd.KvC();
        }
        mZx();
        EYQ();
        Td();
        if (this.kf == 5 && QQ() && EYQ() && !mZx() && !Td()) {
            return false;
        }
        int i = this.kf;
        return i == 1 || i == 2 || i == 5;
    }

    private String mZx(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void Td(boolean z) {
        this.FtN = z;
    }

    public void EYQ(InterfaceC0118EYQ interfaceC0118EYQ) {
        this.PI = new WeakReference<>(interfaceC0118EYQ);
    }
}
