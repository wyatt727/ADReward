package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public abstract class BackupView extends PAGFrameLayout {
    private com.bytedance.sdk.openadsdk.mZx.VwS EYQ;
    protected int HX;
    protected String IPb;
    protected TTDislikeDialogAbstract Kbd;
    protected boolean MxO;
    protected com.bytedance.sdk.openadsdk.dislike.mZx Pm;
    protected int QQ;
    protected com.bytedance.sdk.openadsdk.core.model.UB Td;
    protected int VwS;
    protected Context mZx;
    protected boolean tp;
    protected String tsL;

    protected abstract void EYQ(View view, int i, com.bytedance.sdk.openadsdk.core.model.pi piVar);

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public BackupView(Context context) {
        super(context);
        this.IPb = "embeded_ad";
        this.tp = true;
        this.MxO = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.IPb = "embeded_ad";
        this.tp = true;
        this.MxO = true;
        this.tsL = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(WU wu) {
        if (wu instanceof com.bytedance.sdk.openadsdk.dislike.mZx) {
            this.Pm = (com.bytedance.sdk.openadsdk.dislike.mZx) wu;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.UB ub;
        if (tTDislikeDialogAbstract != null && (ub = this.Td) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(ub.GfQ(), this.Td.VEW());
        }
        this.Kbd = tTDislikeDialogAbstract;
    }

    public void EYQ() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Kbd;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.mZx mzx = this.Pm;
        if (mzx != null) {
            mzx.EYQ();
        } else {
            TTDelegateActivity.EYQ(this.Td, (String) null);
        }
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.Td;
        if (ub == null) {
            return "";
        }
        if (ub.xh() == null || TextUtils.isEmpty(this.Td.xh().mZx())) {
            return !TextUtils.isEmpty(this.Td.Kbc()) ? this.Td.Kbc() : "";
        }
        return this.Td.xh().mZx();
    }

    protected String getTitle() {
        if (this.Td.xh() != null && !TextUtils.isEmpty(this.Td.xh().mZx())) {
            return this.Td.xh().mZx();
        }
        if (TextUtils.isEmpty(this.Td.Kbc())) {
            return !TextUtils.isEmpty(this.Td.TQF()) ? this.Td.TQF() : "";
        }
        return this.Td.Kbc();
    }

    protected String getDescription() {
        if (TextUtils.isEmpty(this.Td.TQF())) {
            return !TextUtils.isEmpty(this.Td.OtA()) ? this.Td.OtA() : "";
        }
        return this.Td.TQF();
    }

    public float getRealWidth() {
        return tr.Td(this.mZx, this.VwS);
    }

    public float getRealHeight() {
        return tr.Td(this.mZx, this.QQ);
    }

    protected void EYQ(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.mZx;
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.Td;
            String str = this.IPb;
            mzx = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(context, ub, str, FH.EYQ(str));
        } else {
            Context context2 = this.mZx;
            com.bytedance.sdk.openadsdk.core.model.UB ub2 = this.Td;
            String str2 = this.IPb;
            mzx = new com.bytedance.sdk.openadsdk.core.mZx.mZx(context2, ub2, str2, FH.EYQ(str2));
        }
        view.setOnTouchListener(mzx);
        view.setOnClickListener(mzx);
        mzx.EYQ(new EYQ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ
            public void EYQ(View view2, int i, com.bytedance.sdk.openadsdk.core.model.pi piVar) {
                BackupView.this.EYQ(view2, i, piVar);
            }
        });
    }

    protected NativeVideoTsView getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.Td;
        if (ub != null && this.mZx != null) {
            if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ub)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.mZx, this.Td, this.IPb, true, false, this.EYQ);
                    nativeVideoTsView.setVideoCacheUrl(this.tsL);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.mZx() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.mZx
                        public void EYQ(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.tp);
                    nativeVideoTsView.setIsQuiet(this.MxO);
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.UB.Kbd(this.Td) && nativeVideoTsView != null && nativeVideoTsView.EYQ(0L, true, false)) {
                    return nativeVideoTsView;
                }
            } else {
                nativeVideoTsView = null;
                if (!com.bytedance.sdk.openadsdk.core.model.UB.Kbd(this.Td)) {
                }
            }
        }
        return null;
    }

    protected void EYQ(int i) {
        this.MxO = com.bytedance.sdk.openadsdk.core.hu.Pm().Td(String.valueOf(this.HX));
        int iMZx = com.bytedance.sdk.openadsdk.core.hu.Pm().mZx(i);
        if (3 == iMZx) {
            this.tp = false;
            return;
        }
        int iTd = com.bytedance.sdk.component.utils.hu.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        if (1 != iMZx || !FH.Pm(iTd)) {
            if (2 == iMZx) {
                if (FH.Kbd(iTd) || FH.Pm(iTd) || FH.IPb(iTd)) {
                    this.tp = true;
                    return;
                }
                return;
            }
            if (5 != iMZx) {
                return;
            }
            if (!FH.Pm(iTd) && !FH.IPb(iTd)) {
                return;
            }
        }
        this.tp = true;
    }

    protected void EYQ(View view) {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.Td;
        if (ub == null || ub.mN() == null || view == null) {
            return;
        }
        EYQ(view, this.Td.XN() == 1 && this.tp);
    }
}
