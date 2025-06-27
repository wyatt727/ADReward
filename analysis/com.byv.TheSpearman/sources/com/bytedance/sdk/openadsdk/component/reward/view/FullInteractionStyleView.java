package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle001001Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle002003Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle003002Layout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle009016VLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009HLayout;
import com.bytedance.sdk.openadsdk.layout.TTInteractionStyle016009VLayout;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.List;

/* loaded from: classes2.dex */
public class FullInteractionStyleView extends BackupView {
    private float EYQ;
    private int KO;
    private View UB;
    private View Uc;
    private FrameLayout hYh;
    private int hu;
    private int nWX;
    private boolean pi;
    private com.bytedance.sdk.openadsdk.core.mZx.Kbd zF;

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void EYQ(View view, int i, pi piVar) {
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.hu = 1;
        this.mZx = context;
    }

    public void EYQ(UB ub, float f, int i, int i2, int i3) {
        this.EYQ = f;
        this.hu = i;
        this.Td = ub;
        this.IPb = "fullscreen_interstitial_ad";
        this.nWX = i2;
        this.KO = i3;
        EYQ(this.HX);
        mZx();
    }

    private void mZx() {
        this.VwS = tr.mZx(this.mZx, this.nWX);
        this.QQ = tr.mZx(this.mZx, this.KO);
        int i = (int) (this.EYQ * 1000.0f);
        if (this.hu == 1) {
            if (i == 666) {
                Kbd();
                return;
            }
            if (i == 1000) {
                Td();
                return;
            }
            if (i == 1500) {
                MxO();
                return;
            } else if (i == 1777) {
                pi();
                return;
            } else {
                EYQ(0.562f);
                tsL();
                return;
            }
        }
        if (i == 562) {
            HX();
            return;
        }
        if (i == 666) {
            VwS();
            return;
        }
        if (i == 1000) {
            Td();
        } else if (i == 1500) {
            QQ();
        } else {
            EYQ(1.777f);
            tp();
        }
    }

    private void Td() {
        TTInteractionStyle001001Layout tTInteractionStyle001001Layout = new TTInteractionStyle001001Layout(this.mZx);
        this.UB = tTInteractionStyle001001Layout;
        mZx(tTInteractionStyle001001Layout);
        Pm();
        IPb();
    }

    private void mZx(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void Pm() {
        this.hYh = (FrameLayout) this.UB.findViewById(tp.PP);
        ImageView imageView = (ImageView) this.UB.findViewById(tp.VQ);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.UB.findViewById(tp.oIw);
        TextView textView = (TextView) this.UB.findViewById(tp.Rd);
        TextView textView2 = (TextView) this.UB.findViewById(tp.zzY);
        View viewFindViewById = this.UB.findViewById(520093739);
        if (!TextUtils.isEmpty(this.Td.TZn())) {
            textView2.setText(this.Td.TZn());
        }
        EYQ(this.hYh, imageView);
        if (this.Td.vD() != null && !TextUtils.isEmpty(this.Td.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.Td.vD().EYQ(), this.Td.vD().mZx(), this.Td.vD().Td(), tTRoundRectImageView, this.Td);
        }
        textView.setText(getTitle());
        Td(this.hYh);
        Td(imageView);
        Td(tTRoundRectImageView);
        Td(textView);
        Td(textView2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(FullInteractionStyleView.this.mZx, FullInteractionStyleView.this.Td, FullInteractionStyleView.this.IPb);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void Kbd() {
        TTInteractionStyle002003Layout tTInteractionStyle002003Layout = new TTInteractionStyle002003Layout(this.mZx);
        this.UB = tTInteractionStyle002003Layout;
        mZx(tTInteractionStyle002003Layout);
        Pm();
        IPb();
    }

    private void IPb() {
        TextView textView = (TextView) this.UB.findViewById(tp.Jpu);
        if (textView != null) {
            textView.setText(getDescription());
            Td(textView);
        }
    }

    private void VwS() {
        TTInteractionStyle002003HLayout tTInteractionStyle002003HLayout = new TTInteractionStyle002003HLayout(this.mZx);
        this.UB = tTInteractionStyle002003HLayout;
        mZx(tTInteractionStyle002003HLayout);
        Pm();
        IPb();
    }

    private void QQ() {
        TTInteractionStyle003002HLayout tTInteractionStyle003002HLayout = new TTInteractionStyle003002HLayout(this.mZx);
        this.UB = tTInteractionStyle003002HLayout;
        mZx(tTInteractionStyle003002HLayout);
        Pm();
    }

    private void HX() {
        TTInteractionStyle009016HLayout tTInteractionStyle009016HLayout = new TTInteractionStyle009016HLayout(this.mZx);
        this.UB = tTInteractionStyle009016HLayout;
        mZx(tTInteractionStyle009016HLayout);
        Pm();
        IPb();
    }

    private void tp() {
        TTInteractionStyle016009HLayout tTInteractionStyle016009HLayout = new TTInteractionStyle016009HLayout(this.mZx);
        this.UB = tTInteractionStyle016009HLayout;
        mZx(tTInteractionStyle016009HLayout);
        Pm();
    }

    private void MxO() {
        View tTInteractionStyle003002Layout = new TTInteractionStyle003002Layout(this.mZx);
        this.UB = tTInteractionStyle003002Layout;
        mZx(tTInteractionStyle003002Layout);
        this.hYh = (FrameLayout) this.UB.findViewById(tp.PP);
        ImageView imageView = (ImageView) this.UB.findViewById(tp.qxY);
        TextView textView = (TextView) this.UB.findViewById(tp.lJ);
        View viewFindViewById = this.UB.findViewById(520093739);
        EYQ(this.hYh, imageView);
        textView.setText(getDescription());
        Td(this.hYh);
        Td(imageView);
        Td(textView);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(FullInteractionStyleView.this.mZx, FullInteractionStyleView.this.Td, FullInteractionStyleView.this.IPb);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void EYQ(FrameLayout frameLayout, ImageView imageView) {
        if (this.Td == null) {
            return;
        }
        boolean zKbd = UB.Kbd(this.Td);
        if (this.Td.mN() != null && zKbd) {
            tr.EYQ((View) imageView, 8);
            tr.EYQ((View) frameLayout, 0);
        } else {
            EYQ(imageView);
            tr.EYQ((View) imageView, 0);
            tr.EYQ((View) frameLayout, 8);
        }
    }

    private void EYQ(ImageView imageView) {
        List<nWX> listDal;
        nWX nwx;
        if (this.Td == null || (listDal = this.Td.Dal()) == null || listDal.size() <= 0 || (nwx = listDal.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(nwx).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(this.Td, nwx.EYQ(), imageView));
    }

    private void tsL() {
        TTInteractionStyle009016VLayout tTInteractionStyle009016VLayout = new TTInteractionStyle009016VLayout(this.mZx);
        this.UB = tTInteractionStyle009016VLayout;
        mZx(tTInteractionStyle009016VLayout);
        Pm();
    }

    private void pi() {
        TTInteractionStyle016009VLayout tTInteractionStyle016009VLayout = new TTInteractionStyle016009VLayout(this.mZx);
        this.UB = tTInteractionStyle016009VLayout;
        mZx(tTInteractionStyle016009VLayout);
        Pm();
        IPb();
    }

    private void Td(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mZx.mZx eyq = this.zF;
        if (eyq == null) {
            eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(this.mZx, this.Td, this.IPb, FH.EYQ(this.IPb));
            eyq.EYQ(EYQ(this.Td, this.mZx));
        }
        view.setOnTouchListener(eyq);
        view.setOnClickListener(eyq);
    }

    private com.com.bytedance.overseas.sdk.EYQ.Td EYQ(UB ub, Context context) {
        if (ub != null && ub.Pf() == 4) {
            return new com.com.bytedance.overseas.sdk.EYQ.mZx(context, ub, this.IPb);
        }
        return null;
    }

    public void setIsMute(boolean z) {
        this.pi = z;
        View view = this.Uc;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.hYh;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd) {
        this.zF = kbd;
    }

    private float getHeightDp() {
        return tr.Td(this.mZx, tr.HX(this.mZx));
    }

    private float getWidthDp() {
        return tr.Td(this.mZx, tr.tp(this.mZx));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(float r11) {
        /*
            r10 = this;
            float r0 = r10.getHeightDp()
            float r1 = r10.getWidthDp()
            int r2 = r10.hu
            r3 = 2
            if (r2 != r3) goto L16
            float r2 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r1)
            goto L1e
        L16:
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.max(r0, r1)
        L1e:
            int r1 = r10.hu
            if (r1 == r3) goto L38
            android.content.Context r1 = r10.mZx
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = com.bytedance.sdk.openadsdk.utils.tr.Td(r1)
            if (r1 == 0) goto L38
            android.content.Context r1 = r10.mZx
            float r4 = com.bytedance.sdk.openadsdk.utils.tr.EYQ()
            int r1 = com.bytedance.sdk.openadsdk.utils.tr.Td(r1, r4)
            float r1 = (float) r1
            float r0 = r0 - r1
        L38:
            int r1 = r10.hu
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 1101004800(0x41a00000, float:20.0)
            r7 = 20
            r8 = 0
            r9 = 0
            if (r1 == r3) goto L5c
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L72
            float r2 = r2 - r6
            float r2 = r2 - r6
            float r2 = r2 / r11
            float r0 = r0 - r2
            float r0 = r0 / r4
            float r11 = java.lang.Math.max(r0, r8)
            int r11 = (int) r11
            r0 = r7
            r9 = r0
            r7 = r11
            goto L75
        L5c:
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L72
            float r0 = r0 - r6
            float r0 = r0 - r6
            float r0 = r0 * r11
            float r2 = r2 - r0
            float r2 = r2 / r4
            float r11 = java.lang.Math.max(r2, r8)
            int r11 = (int) r11
            r0 = r11
            r9 = r0
            r11 = r7
            goto L75
        L72:
            r11 = r9
            r0 = r11
            r7 = r0
        L75:
            android.content.Context r1 = r10.mZx
            float r2 = (float) r7
            int r1 = com.bytedance.sdk.openadsdk.utils.tr.mZx(r1, r2)
            android.content.Context r2 = r10.mZx
            float r11 = (float) r11
            int r11 = com.bytedance.sdk.openadsdk.utils.tr.mZx(r2, r11)
            android.content.Context r2 = r10.mZx
            float r3 = (float) r9
            int r2 = com.bytedance.sdk.openadsdk.utils.tr.mZx(r2, r3)
            android.content.Context r3 = r10.mZx
            float r0 = (float) r0
            int r0 = com.bytedance.sdk.openadsdk.utils.tr.mZx(r3, r0)
            android.content.Context r3 = r10.mZx
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setPadding(r2, r1, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.EYQ(float):void");
    }
}
