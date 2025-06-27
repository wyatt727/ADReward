package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.layout.TTVideoTrafficTipsLayout;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: VideoTrafficTipLayout.java */
/* loaded from: classes2.dex */
public class Kbd {
    private View EYQ;
    private boolean IPb = false;
    private mZx Kbd;
    private com.bytedance.sdk.openadsdk.core.video.nativevideo.EYQ Pm;
    private ViewGroup QQ;
    private Context Td;
    private com.bykv.vk.openvk.component.video.api.Td.mZx VwS;
    private TextView mZx;

    /* compiled from: VideoTrafficTipLayout.java */
    public enum EYQ {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: VideoTrafficTipLayout.java */
    public interface mZx {
        void MxO();

        boolean tp();
    }

    public void EYQ(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.QQ = viewGroup;
        this.Td = hu.EYQ().getApplicationContext();
    }

    private void EYQ(Context context, View view, boolean z) {
        ViewGroup.LayoutParams layoutParamsEYQ;
        if (context == null || view == null || this.EYQ != null || (layoutParamsEYQ = EYQ(this.QQ)) == null) {
            return;
        }
        TTVideoTrafficTipsLayout tTVideoTrafficTipsLayout = new TTVideoTrafficTipsLayout(context);
        this.EYQ = tTVideoTrafficTipsLayout;
        tTVideoTrafficTipsLayout.setLayoutParams(layoutParamsEYQ);
        this.QQ.addView(this.EYQ);
        this.mZx = (TextView) this.EYQ.findViewById(tp.TfI);
        View viewFindViewById = this.EYQ.findViewById(tp.ZFP);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Kbd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Kbd.this.Td();
                    if (Kbd.this.Pm != null) {
                        Kbd.this.Pm.EYQ(EYQ.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams EYQ(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.video.nativevideo.EYQ eyq, mZx mzx) {
        this.Kbd = mzx;
        this.Pm = eyq;
    }

    private void mZx() {
        this.VwS = null;
    }

    public boolean EYQ(int i, com.bykv.vk.openvk.component.video.api.Td.mZx mzx, boolean z) {
        Context context = this.Td;
        if (context == null || mzx == null) {
            return true;
        }
        EYQ(context, this.QQ, z);
        this.VwS = mzx;
        if (i == 1 || i == 2) {
            return EYQ(i);
        }
        return true;
    }

    private boolean EYQ(int i) {
        mZx mzx;
        if (EYQ() || this.IPb) {
            return true;
        }
        if (this.Pm != null && (mzx = this.Kbd) != null) {
            if (mzx.tp()) {
                this.Pm.Kbd(null, null);
            }
            this.Pm.EYQ(EYQ.PAUSE_VIDEO, (String) null);
        }
        EYQ(this.VwS, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        if (this.Td == null) {
            return;
        }
        Pm();
    }

    public void EYQ(boolean z) {
        if (z) {
            mZx();
        }
        Pm();
    }

    public boolean EYQ() {
        View view = this.EYQ;
        return view != null && view.getVisibility() == 0;
    }

    private void Pm() {
        View view = this.EYQ;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void EYQ(com.bykv.vk.openvk.component.video.api.Td.mZx mzx, boolean z) {
        View view;
        String str;
        View view2;
        if (mzx == null || (view = this.EYQ) == null || this.Td == null || view.getVisibility() == 0) {
            return;
        }
        mZx mzx2 = this.Kbd;
        if (mzx2 != null) {
            mzx2.MxO();
        }
        double dCeil = Math.ceil((mzx.Kbd() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(zF.EYQ(this.Td, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = zF.EYQ(this.Td, "tt_video_without_wifi_tips") + zF.EYQ(this.Td, "tt_video_bytesize");
        }
        tr.EYQ(this.EYQ, 0);
        tr.EYQ(this.mZx, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!tr.Pm(this.EYQ) || (view2 = this.EYQ) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
