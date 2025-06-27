package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BrandBannerController.java */
/* loaded from: classes2.dex */
public class mZx {
    com.bytedance.sdk.openadsdk.core.model.UB EYQ;
    private int IPb;
    private NativeExpressView Kbd;
    private com.bytedance.sdk.component.adexpress.mZx.KO Pm;
    private ScheduledFuture<?> QQ;
    private EYQ Td;
    private int VwS;
    private final Context mZx;

    /* compiled from: BrandBannerController.java */
    interface Td {
        void EYQ();

        void EYQ(int i, int i2);

        void EYQ(String str);

        void mZx(String str);
    }

    public mZx(Context context, NativeExpressView nativeExpressView, com.bytedance.sdk.openadsdk.core.model.UB ub, String str) {
        this.EYQ = ub;
        this.mZx = context;
        this.Kbd = nativeExpressView;
        EYQ(nativeExpressView);
        this.Td = new EYQ(context, ub, this.IPb, this.VwS, str);
    }

    private void EYQ(NativeExpressView nativeExpressView) {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.EYQ;
        if (ub != null && ub.HG()) {
            this.IPb = -1;
            this.VwS = -1;
            return;
        }
        pi piVarEYQ = BannerExpressBackupView.EYQ(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() > 0 && nativeExpressView.getExpectExpressHeight() > 0) {
            this.IPb = tr.mZx(this.mZx, nativeExpressView.getExpectExpressWidth());
            this.VwS = tr.mZx(this.mZx, nativeExpressView.getExpectExpressHeight());
        } else {
            int iTd = tr.Td(this.mZx);
            this.IPb = iTd;
            this.VwS = Float.valueOf(iTd / piVarEYQ.mZx).intValue();
        }
        int i = this.IPb;
        if (i <= 0 || i <= tr.Td(this.mZx)) {
            return;
        }
        this.IPb = tr.Td(this.mZx);
        this.VwS = Float.valueOf(this.VwS * (tr.Td(this.mZx) / this.IPb)).intValue();
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.KO ko) {
        this.Pm = ko;
    }

    public void EYQ() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.EYQ;
        if (ub != null && ub.HG()) {
            this.QQ = xt.EYQ().schedule(new RunnableC0120mZx(this.Td.pi), com.bytedance.sdk.openadsdk.core.hu.Pm().xt(), TimeUnit.MILLISECONDS);
        }
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(new com.bytedance.sdk.component.adexpress.mZx.VwS() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.1
                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(View view, com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
                    if (mZx.this.Kbd == null || view == null) {
                        if (mZx.this.Pm != null) {
                            mZx.this.Pm.a_(106);
                        }
                    } else {
                        mZx.this.Kbd.removeView(view);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        mZx.this.Kbd.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (mZx.this.Pm != null) {
                            mZx.this.Pm.EYQ(mZx.this.Td, nwx);
                        }
                    }
                    mZx.this.Td();
                }

                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(int i, String str) {
                    if (mZx.this.Pm != null) {
                        mZx.this.Pm.a_(106);
                    }
                    mZx.this.Td();
                }
            });
            return;
        }
        com.bytedance.sdk.component.adexpress.mZx.KO ko = this.Pm;
        if (ko != null) {
            ko.a_(106);
        }
    }

    public void mZx() {
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.Pm();
            this.Td = null;
        }
        Td();
        this.Pm = null;
        this.Kbd = null;
    }

    public void EYQ(WU wu) {
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(wu);
        }
    }

    public void EYQ(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(tTDislikeDialogAbstract);
        }
    }

    public void EYQ(String str) {
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(str);
        }
    }

    public void EYQ(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(pAGExpressAdWrapperListener);
        }
    }

    /* compiled from: BrandBannerController.java */
    public static class EYQ implements com.bytedance.sdk.component.adexpress.mZx.Pm<View>, DspHtmlWebView.mZx {
        AtomicBoolean EYQ = new AtomicBoolean(false);
        private FrameLayout HX;
        private final Context IPb;
        private PAGExpressAdWrapperListener KO;
        private String Kbd;
        private final int MxO;
        private TTDislikeDialogAbstract Pm;
        private final int QQ;
        private com.bytedance.sdk.openadsdk.dislike.mZx Td;
        private final int VwS;
        WeakReference<View> mZx;
        private com.bytedance.sdk.component.adexpress.mZx.VwS nWX;
        private DspHtmlWebView pi;
        private com.bytedance.sdk.openadsdk.core.model.UB tp;
        private String tsL;

        @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
        public int Td() {
            return 5;
        }

        public EYQ(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, int i2, String str) {
            this.tsL = str;
            if (ub != null && ub.HG()) {
                this.tsL = "fullscreen_interstitial_ad";
            }
            this.IPb = context;
            this.VwS = i;
            this.QQ = i2;
            this.tp = ub;
            this.MxO = tr.mZx(context, 3.0f);
            VwS();
        }

        private void VwS() {
            FrameLayout frameLayout = new FrameLayout(this.IPb);
            this.HX = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
            }
            layoutParams.width = this.VwS;
            layoutParams.height = this.QQ;
            layoutParams.gravity = 17;
            this.HX.setLayoutParams(layoutParams);
            DspHtmlWebView dspHtmlWebViewTp = tp();
            this.HX.addView(dspHtmlWebViewTp);
            View viewQQ = QQ();
            this.HX.addView(viewQQ);
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.tp;
            if (ub != null && ub.HG()) {
                dspHtmlWebViewTp.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                this.mZx = new WeakReference<>(((Activity) this.IPb).findViewById(520093713));
                dspHtmlWebViewTp.EYQ(((Activity) this.IPb).findViewById(com.bytedance.sdk.openadsdk.utils.tp.OUK), FriendlyObstructionPurpose.OTHER);
            } else {
                ImageView imageViewHX = HX();
                this.HX.addView(imageViewHX);
                this.mZx = new WeakReference<>(imageViewHX);
                dspHtmlWebViewTp.EYQ(imageViewHX, FriendlyObstructionPurpose.CLOSE_AD);
            }
            dspHtmlWebViewTp.EYQ(viewQQ, FriendlyObstructionPurpose.OTHER);
        }

        @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
        public void EYQ(com.bytedance.sdk.component.adexpress.mZx.VwS vwS) {
            com.bytedance.sdk.openadsdk.core.model.UB ub;
            if (this.EYQ.get()) {
                return;
            }
            if (this.IPb == null || (ub = this.tp) == null) {
                vwS.EYQ(106, "material null");
                return;
            }
            this.nWX = vwS;
            if (TextUtils.isEmpty(ub.VC())) {
                vwS.EYQ(106, "dsp data is null");
            } else {
                this.pi.hu();
            }
        }

        private View QQ() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.IPb);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.tp;
            if (ub != null && ub.HG()) {
                layoutParams.leftMargin = tr.mZx(this.IPb, 20.0f);
                layoutParams.bottomMargin = tr.mZx(this.IPb, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = this.MxO;
                layoutParams.leftMargin = this.MxO;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.EYQ.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.EYQ(EYQ.this.IPb, EYQ.this.tp, EYQ.this.tsL);
                }
            });
            return pAGLogoView;
        }

        private ImageView HX() {
            PAGImageView pAGImageView = new PAGImageView(this.IPb);
            pAGImageView.setImageDrawable(this.IPb.getResources().getDrawable(zF.Pm(this.IPb, "tt_dislike_icon2")));
            int iMZx = tr.mZx(this.IPb, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMZx, iMZx);
            layoutParams.gravity = GravityCompat.END;
            layoutParams.rightMargin = this.MxO;
            layoutParams.topMargin = this.MxO;
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.EYQ.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EYQ.this.IPb();
                }
            });
            return pAGImageView;
        }

        private DspHtmlWebView tp() {
            DspHtmlWebView dspHtmlWebViewMZx = com.bytedance.sdk.openadsdk.core.nativeexpress.Td.EYQ().mZx();
            this.pi = dspHtmlWebViewMZx;
            if (dspHtmlWebViewMZx == null) {
                this.pi = new DspHtmlWebView(this.IPb);
            }
            com.bytedance.sdk.openadsdk.core.nativeexpress.Td.EYQ().Td(this.pi);
            this.pi.EYQ(this.tp, this, this.tsL);
            this.pi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.pi;
        }

        @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
        public View Kbd() {
            return this.HX;
        }

        public void Pm() {
            this.HX = null;
            this.Td = null;
            this.Pm = null;
            this.nWX = null;
            this.tp = null;
            DspHtmlWebView dspHtmlWebView = this.pi;
            if (dspHtmlWebView != null) {
                dspHtmlWebView.tsL();
                com.bytedance.sdk.openadsdk.core.nativeexpress.Td.EYQ().EYQ(this.pi);
            }
            this.EYQ.set(true);
        }

        public void EYQ(WU wu) {
            if (wu instanceof com.bytedance.sdk.openadsdk.dislike.mZx) {
                this.Td = (com.bytedance.sdk.openadsdk.dislike.mZx) wu;
            }
        }

        public void EYQ(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.UB ub;
            if (tTDislikeDialogAbstract != null && (ub = this.tp) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(ub.GfQ(), this.tp.VEW());
            }
            this.Pm = tTDislikeDialogAbstract;
        }

        public void IPb() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Pm;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            com.bytedance.sdk.openadsdk.dislike.mZx mzx = this.Td;
            if (mzx != null) {
                mzx.EYQ();
            } else {
                TTDelegateActivity.EYQ(this.tp, this.Kbd);
            }
        }

        public void EYQ(String str) {
            this.Kbd = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
        public View EYQ() {
            WeakReference<View> weakReference = this.mZx;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
        public View mZx() {
            FrameLayout frameLayout = this.HX;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
        public void EYQ(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.KO;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
        public void c_() {
            if (this.nWX != null) {
                com.bytedance.sdk.component.adexpress.mZx.nWX nwx = new com.bytedance.sdk.component.adexpress.mZx.nWX();
                nwx.EYQ(true);
                nwx.EYQ(tr.Td(this.IPb, this.VwS));
                nwx.mZx(tr.Td(this.IPb, this.QQ));
                this.nWX.EYQ(this.HX, nwx);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
        public void EYQ(int i, int i2) {
            com.bytedance.sdk.component.adexpress.mZx.VwS vwS = this.nWX;
            if (vwS != null) {
                vwS.EYQ(i, "render fail");
            }
        }

        public void EYQ(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.KO = pAGExpressAdWrapperListener;
        }
    }

    /* compiled from: BrandBannerController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.mZx$mZx, reason: collision with other inner class name */
    private static class RunnableC0120mZx implements Runnable {
        Td EYQ;

        public RunnableC0120mZx(Td td) {
            this.EYQ = td;
        }

        @Override // java.lang.Runnable
        public void run() {
            Td td = this.EYQ;
            if (td != null) {
                td.EYQ(107, 107);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        try {
            ScheduledFuture<?> scheduledFuture = this.QQ;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.QQ.cancel(false);
            this.QQ = null;
        } catch (Throwable unused) {
        }
    }
}
