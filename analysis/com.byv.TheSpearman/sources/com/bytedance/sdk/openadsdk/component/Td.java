package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.IPb;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenIconOnlyLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenThreeLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenTwoLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.MxO;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: AppOpenAdNativeManager.java */
/* loaded from: classes2.dex */
public class Td {
    private static String NZ = "Skip";
    protected final Activity EYQ;
    protected final com.bytedance.sdk.openadsdk.component.QQ.EYQ HX;
    protected final int IPb;
    private TTRoundRectImageView KO;
    protected final com.bytedance.sdk.openadsdk.component.EYQ Kbd;
    private ImageView MxO;
    protected final FrameLayout Pm;
    protected FrameLayout QQ;
    protected final boolean Td;
    private PAGTextView UB;
    private float Uc;
    protected int VwS;
    private TextView WU;
    private TextView XN;
    private float hYh;
    private PAGTextView hu;
    protected final UB mZx;
    private ImageView nWX;
    private ButtonFlash pi;
    private com.bytedance.sdk.openadsdk.component.QQ.Td rfB;
    private RelativeLayout tp;
    private PAGLogoView tsL;
    private boolean wBa;
    private final com.bytedance.sdk.openadsdk.component.view.EYQ zF = new com.bytedance.sdk.openadsdk.component.view.EYQ();
    private boolean tPj = false;

    public JSONObject EYQ(JSONObject jSONObject) {
        return null;
    }

    public int Pm() {
        return -1;
    }

    public Td(Activity activity, UB ub, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.EYQ eyq, int i, boolean z, com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq2) {
        this.EYQ = activity;
        this.mZx = ub;
        this.Pm = frameLayout;
        this.VwS = i;
        this.Td = z;
        this.Kbd = eyq;
        this.IPb = ub.yK();
        this.HX = eyq2;
    }

    public void EYQ(ViewGroup viewGroup) {
        try {
            NZ = zF.EYQ(hu.EYQ(), "tt_txt_skip");
        } catch (Throwable th) {
            pi.EYQ("AppOpenAdNativeManager", th.getMessage());
        }
        PAGAppOpenBaseLayout pAGAppOpenTwoLayout = new PAGAppOpenTwoLayout(this.EYQ);
        int iMxO = this.mZx.MxO();
        if (iMxO == 5) {
            pAGAppOpenTwoLayout = new PAGAppOpenIconOnlyLayout(this.EYQ);
        } else if (iMxO == 1) {
            pAGAppOpenTwoLayout = new PAGAppOpenOneLayout(this.EYQ);
        } else if (iMxO == 3) {
            pAGAppOpenTwoLayout = new PAGAppOpenThreeLayout(this.EYQ);
        } else if (iMxO == 4) {
            pAGAppOpenTwoLayout = new PAGAppOpenHtmlLayout(this.EYQ, this.mZx);
        }
        if (this.mZx.MxO() == 3 && this.VwS != 2) {
            this.VwS = 2;
            this.Kbd.EYQ(2);
        }
        this.tp = pAGAppOpenTwoLayout;
        viewGroup.addView(pAGAppOpenTwoLayout);
        this.nWX = pAGAppOpenTwoLayout.getBackImage();
        this.QQ = pAGAppOpenTwoLayout.getVideoContainer();
        this.MxO = pAGAppOpenTwoLayout.getImageView();
        this.pi = pAGAppOpenTwoLayout.getClickButton();
        this.tsL = pAGAppOpenTwoLayout.getAdLogo();
        if (this.mZx.BEC()) {
            this.KO = pAGAppOpenTwoLayout.getIconOnlyView();
            this.hu = pAGAppOpenTwoLayout.getTitle();
            this.UB = pAGAppOpenTwoLayout.getContent();
        }
        if (pAGAppOpenTwoLayout.getDspAdChoice() != null) {
            pAGAppOpenTwoLayout.getDspAdChoice().EYQ(14, this.mZx);
        }
        if (!this.mZx.oB()) {
            this.zF.EYQ(pAGAppOpenTwoLayout, this.mZx, this.hYh, this.Uc, this.Td);
        }
        this.WU = pAGAppOpenTwoLayout.getTopDisLike();
        this.XN = pAGAppOpenTwoLayout.getTopSkip();
        if (pAGAppOpenTwoLayout instanceof PAGAppOpenHtmlLayout) {
            ((PAGAppOpenHtmlLayout) pAGAppOpenTwoLayout).setRenderListener(new PAGAppOpenHtmlLayout.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.Td.1
                @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.EYQ
                public void EYQ(View view, int i) {
                    Td.this.Kbd.Kbd();
                }
            });
        }
    }

    public void EYQ() {
        this.tsL.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.Td.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(Td.this.EYQ, Td.this.mZx, "open_ad");
                } catch (Throwable th) {
                    pi.EYQ("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        this.WU.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.Td.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Td.this.Kbd != null) {
                    Td.this.Kbd.mZx(view);
                }
            }
        });
        this.XN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.Td.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Td.this.Kbd == null || !Td.this.tPj) {
                    return;
                }
                Td.this.Kbd.EYQ(view);
            }
        });
        if (this.mZx.oB()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.EYQ.EYQ EYQ2 = com.bytedance.sdk.openadsdk.component.EYQ.mZx.EYQ(this.mZx, this.EYQ, this.HX);
        EYQ2.EYQ(new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.Td.5
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx.EYQ
            public void EYQ(View view, int i) {
                Td.this.Kbd.Kbd();
            }
        });
        EYQ2.EYQ(this.rfB);
        if (this.mZx.tp() == 1) {
            this.tp.setOnClickListener(EYQ2);
            this.tp.setOnTouchListener(EYQ2);
        }
        this.pi.setOnClickListener(EYQ2);
        this.pi.setOnTouchListener(EYQ2);
    }

    public void mZx() {
        this.wBa = KO.Jpu().XN(String.valueOf(this.IPb));
        if (!this.mZx.oB()) {
            IPb();
        } else {
            this.Kbd.Td();
        }
    }

    private void IPb() {
        this.zF.EYQ();
        this.pi.setText(this.mZx.TZn());
        if (this.mZx.BEC()) {
            VwS();
            return;
        }
        if (this.Td) {
            mZx(0);
            EYQ(8);
            if (EYQ(this.QQ)) {
                this.Kbd.Td();
            } else {
                this.Kbd.Pm();
            }
            IPb.EYQ(this.mZx, new EYQ(this.EYQ), 25);
            return;
        }
        mZx(8);
        EYQ(0);
        QQ();
        this.Kbd.Td();
    }

    protected boolean EYQ(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.QQ.Td td = new com.bytedance.sdk.openadsdk.component.QQ.Td(this.EYQ);
        this.rfB = td;
        td.EYQ(frameLayout, this.mZx);
        this.rfB.EYQ(this.Kbd);
        try {
            return this.rfB.EYQ();
        } catch (Throwable th) {
            pi.EYQ("AppOpenAdNativeManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    private void mZx(int i) {
        tr.EYQ((View) this.QQ, i);
    }

    private void VwS() {
        PAGTextView pAGTextView = this.hu;
        if (pAGTextView != null) {
            pAGTextView.setText(this.mZx.TQF());
        }
        PAGTextView pAGTextView2 = this.UB;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(this.mZx.OtA());
        }
        if (this.KO != null && this.mZx.vD() != null && !TextUtils.isEmpty(this.mZx.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.mZx.vD().EYQ(), this.mZx.vD().mZx(), this.mZx.vD().Td(), this.KO, this.mZx);
        }
        this.Kbd.Td();
    }

    private void QQ() {
        nWX nwx = this.mZx.Dal().get(0);
        MxO.EYQ(new com.bytedance.sdk.openadsdk.MxO.EYQ(nwx.EYQ(), nwx.VwS()), nwx.mZx(), nwx.Td(), new MxO.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.Td.6
            @Override // com.bytedance.sdk.openadsdk.utils.MxO.EYQ
            public void EYQ() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.MxO.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx) {
                if (mzx.Pm()) {
                    Td.this.EYQ(mzx);
                    if (mzx.mZx() != null) {
                        Td.this.EYQ(mzx.EYQ());
                    }
                }
            }
        }, com.bytedance.sdk.openadsdk.component.VwS.EYQ.mZx(TextUtils.isEmpty(nwx.VwS()) ? com.bytedance.sdk.component.utils.Kbd.EYQ(nwx.EYQ()) : nwx.VwS()).getParent(), 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.nWX.setImageDrawable(new BitmapDrawable(hu.EYQ().getResources(), bitmap));
            } catch (Throwable unused) {
                pi.EYQ("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx) {
        if (mzx.mZx() != null) {
            this.MxO.setImageBitmap(mzx.mZx());
            return;
        }
        if (this.mZx.Dal() == null || this.mZx.Dal().get(0) == null) {
            return;
        }
        Drawable drawableEYQ = MxO.EYQ(mzx.Td(), this.mZx.Dal().get(0).mZx());
        this.MxO.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.MxO.setImageDrawable(drawableEYQ);
    }

    void EYQ(int i) {
        tr.EYQ((View) this.MxO, i);
    }

    /* compiled from: AppOpenAdNativeManager.java */
    public class EYQ implements IPb.Pm {
        WeakReference<Activity> EYQ;

        EYQ(Activity activity) {
            this.EYQ = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.IPb.Pm
        public void EYQ(Bitmap bitmap) {
            if (this.EYQ.get() == null || this.EYQ.get().isFinishing()) {
                return;
            }
            Td.this.EYQ(bitmap);
        }
    }

    public void EYQ(float f, float f2) {
        this.hYh = f;
        this.Uc = f2;
    }

    public void EYQ(int i, int i2, boolean z) {
        if (this.XN != null) {
            String strValueOf = String.valueOf(i);
            if (z) {
                this.tPj = z;
                if (this.wBa) {
                    strValueOf = NZ;
                } else {
                    strValueOf = ((Object) strValueOf) + " | " + NZ;
                }
            }
            this.XN.setText(strValueOf);
        }
    }

    public com.bytedance.sdk.openadsdk.component.QQ.Td Kbd() {
        return this.rfB;
    }

    public void Td() {
        ButtonFlash buttonFlash = this.pi;
        if (buttonFlash != null) {
            buttonFlash.EYQ();
        }
        com.bytedance.sdk.openadsdk.component.QQ.Td td = this.rfB;
        if (td != null) {
            td.IPb();
        }
    }
}
