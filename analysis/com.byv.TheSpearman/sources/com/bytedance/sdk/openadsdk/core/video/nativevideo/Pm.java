package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: NativeVideoDetailLayout.java */
/* loaded from: classes2.dex */
public class Pm extends Kbd {
    private float BQ;
    private final com.bytedance.sdk.openadsdk.core.widget.Pm CsQ;
    private TextView Dal;
    private ColorStateList Dd;
    private TextView FtN;
    private int GfQ;
    private int Hnh;
    private TextView KR;
    private TextView Kbc;
    private float Ko;
    private int Nuq;
    private float OnO;
    private final wBa OtA;
    private ImageView PI;
    private TextView Pf;
    private ImageView TQF;
    private final int TZE;
    private boolean TZn;
    private final Rect VEW;
    private boolean VOV;
    private final int XL;
    private ImageView XPd;
    private final Rect XT;
    private ColorStateList aEX;
    private int by;
    private int dVQ;
    private ColorStateList dub;
    private final Rect eFB;
    private float eVP;
    private View kf;
    private View lRN;
    private TextView mN;
    private TextView na;
    private final Rect oIw;
    private float sOZ;
    private ImageView vD;
    private final View.OnTouchListener wG;
    private View wJ;
    private SeekBar wa;
    private int xh;
    private final Rect zzY;

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bykv.vk.openvk.component.video.api.Pm.mZx
    public /* bridge */ /* synthetic */ void EYQ(UB ub, WeakReference weakReference, boolean z) {
        EYQ(ub, (WeakReference<Context>) weakReference, z);
    }

    public Pm(Context context, ViewGroup viewGroup, boolean z, int i, UB ub, com.bykv.vk.openvk.component.video.api.Pm.Td td, boolean z2) {
        super(context, viewGroup, z, i, ub, td, z2);
        this.OtA = new wBa(this);
        this.TZn = false;
        this.VOV = false;
        this.Nuq = 0;
        this.xh = 0;
        this.dVQ = 0;
        this.GfQ = 0;
        this.by = 0;
        this.VEW = new Rect();
        this.eFB = new Rect();
        this.Hnh = 0;
        this.wG = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.XT = new Rect();
        this.oIw = new Rect();
        this.zzY = new Rect();
        this.tPj = hu.EYQ().getApplicationContext();
        Pm(z2);
        this.EYQ = viewGroup;
        this.hYh = z;
        com.bytedance.sdk.openadsdk.core.widget.Pm pm = new com.bytedance.sdk.openadsdk.core.widget.Pm(this);
        this.CsQ = pm;
        pm.EYQ(this.hYh);
        DisplayMetrics displayMetrics = this.tPj.getResources().getDisplayMetrics();
        this.XL = displayMetrics.widthPixels;
        this.TZE = displayMetrics.heightPixels;
        this.XN = i;
        this.Nvm = td;
        this.NZ = ub;
        Pm(8);
        EYQ(context, this.EYQ);
        Pm();
        tsL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    protected void EYQ(Context context, View view) {
        super.EYQ(context, view);
        this.FtN = (TextView) view.findViewById(tp.yK);
        this.PI = (ImageView) view.findViewById(tp.HR);
        this.kf = view.findViewById(tp.In);
        this.vD = (ImageView) view.findViewById(tp.Jy);
        this.mN = (TextView) view.findViewById(tp.tC);
        this.Kbc = (TextView) view.findViewById(tp.KvC);
        this.Pf = (TextView) view.findViewById(tp.VM);
        this.lRN = view.findViewById(tp.zX);
        this.XPd = (ImageView) view.findViewById(tp.xO);
        TextView textView = (TextView) view.findViewById(tp.oCs);
        this.Dal = textView;
        textView.setText(zF.EYQ(context, "tt_video_retry_des_txt"));
        this.wa = (SeekBar) view.findViewById(tp.hv);
        this.KR = (TextView) view.findViewById(tp.Aw);
        this.na = (TextView) view.findViewById(tp.QN);
        this.wJ = view.findViewById(tp.WgU);
        this.TQF = (ImageView) view.findViewById(tp.QI);
        this.VwS = view.findViewById(tp.rM);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    protected void Pm() {
        super.Pm();
        this.CsQ.EYQ(this.EYQ);
        tr.EYQ((View) this.PI, (this.hYh || (this.XN & 1) == 1) ? 8 : 0);
        this.PI.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Pm.this.hu()) {
                    Pm.this.rfB.Td(Pm.this, view);
                }
            }
        });
        tr.EYQ((View) this.FtN, (!this.hYh || (this.XN & 2) == 2) ? 0 : 8);
        this.FtN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Pm.this.hu()) {
                    Pm.this.rfB.Pm(Pm.this, view);
                }
            }
        });
        this.vD.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Pm.this.hu()) {
                    Pm.this.rfB.Kbd(Pm.this, view);
                }
            }
        });
        this.XPd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Pm.this.mZx(false, true);
                Pm.this.QQ();
                Pm.this.VwS();
                Pm.this.hu();
            }
        });
        this.TQF.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Pm.this.hu()) {
                    Pm.this.rfB.mZx(Pm.this, view);
                }
            }
        });
        this.wa.setThumbOffset(0);
        this.wa.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Pm.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!Pm.this.TZn && Pm.this.tPj != null) {
                    seekBar.setThumb(VwS.EYQ(hu.EYQ(), "tt_seek_thumb_normal"));
                }
                if (Pm.this.hu()) {
                    seekBar.setThumbOffset(0);
                    Pm.this.rfB.EYQ(Pm.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!Pm.this.TZn && Pm.this.tPj != null) {
                    seekBar.setThumb(VwS.EYQ(hu.EYQ(), "tt_seek_thumb_press"));
                }
                if (Pm.this.hu()) {
                    seekBar.setThumbOffset(0);
                    Pm.this.rfB.mZx(Pm.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (Pm.this.hu()) {
                    Pm.this.rfB.EYQ(Pm.this, i, z);
                }
            }
        });
        this.wa.setOnTouchListener(this.wG);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void Kbd() {
        this.OtA.removeMessages(1);
        this.OtA.sendMessageDelayed(this.OtA.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void IPb() {
        this.OtA.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void mZx(boolean z) throws Resources.NotFoundException {
        int i = tp() ? this.TZE : this.KO;
        int dimensionPixelSize = tp() ? this.XL : this.hu;
        if (this.Uc <= 0 || this.UB <= 0 || i <= 0) {
            return;
        }
        if (!WU() && !tp() && (this.XN & 8) != 8) {
            dimensionPixelSize = this.tPj.getResources().getDimensionPixelSize(zF.VwS(this.tPj, "tt_video_container_maxheight"));
        }
        int i2 = (int) (this.Uc * ((i * 1.0f) / this.UB));
        if (i2 > dimensionPixelSize) {
            i = (int) (this.UB * ((dimensionPixelSize * 1.0f) / this.Uc));
        } else {
            dimensionPixelSize = i2;
        }
        if (!z && !tp()) {
            i = this.KO;
            dimensionPixelSize = this.hu;
        }
        this.mZx.EYQ(i, dimensionPixelSize);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(String str) {
        TextView textView = this.mN;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.Kbc;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(int i) {
        View view = this.wJ;
        if (view == null || view.getVisibility() != 0) {
            this.wa.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(long j, long j2) {
        this.KR.setText(com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j2));
        this.na.setText(com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j));
        this.wa.setProgress(com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void VwS() {
        tr.IPb(this.Pm);
        tr.IPb(this.Kbd);
        tr.Kbd(this.lRN);
        if (this.IPb != null && this.NZ != null && this.NZ.mN() != null && this.NZ.mN().tp() != null) {
            tr.IPb(this.IPb);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.NZ.mN().tp(), this.NZ.mN().Td(), this.NZ.mN().mZx(), this.IPb, this.NZ);
        }
        if (this.Td.getVisibility() == 0) {
            tr.EYQ((View) this.Td, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bykv.vk.openvk.component.video.api.Pm.mZx
    public void EYQ() {
        EYQ(false, this.hYh);
        hYh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(long j) {
        this.na.setText(com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(UB ub, WeakReference<Context> weakReference, boolean z) {
        String strOtA;
        String strEYQ;
        if (ub == null) {
            return;
        }
        EYQ(this.EYQ, hu.EYQ());
        EYQ(false, this.hYh);
        tr.EYQ(this.QQ, 0);
        tr.EYQ((View) this.HX, 0);
        tr.EYQ(this.tp, 0);
        if (this.HX != null && this.NZ != null && this.NZ.mN() != null && this.NZ.mN().tp() != null) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.NZ.mN().tp(), this.NZ.mN().Td(), this.NZ.mN().mZx(), this.HX, this.NZ);
        }
        if (!TextUtils.isEmpty(ub.Kbc())) {
            strOtA = ub.Kbc();
        } else if (!TextUtils.isEmpty(ub.TQF())) {
            strOtA = ub.TQF();
        } else {
            strOtA = !TextUtils.isEmpty(ub.OtA()) ? ub.OtA() : "";
        }
        if (this.NZ != null && this.NZ.vD() != null && this.NZ.vD().EYQ() != null) {
            tr.EYQ((View) this.MxO, 0);
            tr.EYQ((View) this.tsL, 4);
            if (this.MxO != null) {
                com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.NZ.vD(), this.MxO, ub);
                this.MxO.setOnClickListener(this.FH);
                this.MxO.setOnTouchListener(this.FH);
            }
        } else if (!TextUtils.isEmpty(strOtA)) {
            tr.EYQ((View) this.MxO, 4);
            tr.EYQ((View) this.tsL, 0);
            if (this.tsL != null) {
                this.tsL.setText(strOtA.substring(0, 1));
                this.tsL.setOnClickListener(this.FH);
                this.tsL.setOnTouchListener(this.FH);
            }
        }
        if (this.pi != null && !TextUtils.isEmpty(strOtA)) {
            this.pi.setText(strOtA);
        }
        tr.EYQ((View) this.pi, 0);
        tr.EYQ((View) this.nWX, 0);
        int iPf = ub.Pf();
        if (iPf == 4) {
            strEYQ = zF.EYQ(this.tPj, "tt_video_download_apk");
        } else if (iPf == 5) {
            strEYQ = zF.EYQ(this.tPj, "tt_video_dial_phone");
        } else {
            strEYQ = zF.EYQ(this.tPj, "tt_video_mobile_go_detail");
        }
        if (this.nWX != null) {
            this.nWX.setText(strEYQ);
            this.nWX.setOnClickListener(this.FH);
            this.nWX.setOnTouchListener(this.FH);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void QQ() {
        tr.Kbd(this.Pm);
        tr.Kbd(this.lRN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void HX() {
        this.wa.setProgress(0);
        this.wa.setSecondaryProgress(0);
        this.KR.setText(zF.mZx(this.tPj, "tt_00_00"));
        this.na.setText(zF.mZx(this.tPj, "tt_00_00"));
        Pm(8);
        if (tPj()) {
            this.mZx.setVisibility(8);
        }
        if (this.IPb != null) {
            this.IPb.setImageDrawable(null);
        }
        Pm(8);
        tr.EYQ(this.wJ, 8);
        tr.EYQ(this.QQ, 8);
        tr.EYQ((View) this.HX, 8);
        tr.EYQ(this.tp, 8);
        tr.EYQ((View) this.MxO, 8);
        tr.EYQ((View) this.tsL, 8);
        tr.EYQ((View) this.pi, 8);
        if (this.wBa != null) {
            this.wBa.EYQ(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bytedance.sdk.openadsdk.core.widget.Kbd.mZx
    public boolean tp() {
        return this.TZn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(ViewGroup viewGroup) throws Resources.NotFoundException {
        if (viewGroup != null && (this.EYQ.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.TZn = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.EYQ.getLayoutParams();
            this.xh = marginLayoutParams.leftMargin;
            this.Nuq = marginLayoutParams.topMargin;
            this.dVQ = marginLayoutParams.width;
            this.GfQ = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.EYQ.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.by = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.VEW.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                tr.mZx(viewGroup, 0, 0, 0, 0);
            }
            mZx(true);
            this.TQF.setImageDrawable(zF.Td(this.tPj, "tt_shrink_video"));
            this.wa.setThumb(zF.Td(this.tPj, "tt_seek_thumb_fullscreen_selector"));
            this.wa.setThumbOffset(0);
            com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ((View) this.EYQ, false);
            Kbd(this.TZn);
            tr.EYQ(this.kf, 8);
            if (!this.hYh) {
                tr.EYQ((View) this.PI, 8);
                tr.EYQ((View) this.FtN, 8);
            } else if ((this.XN & 1) == 1) {
                tr.EYQ((View) this.PI, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void mZx(ViewGroup viewGroup) throws Resources.NotFoundException {
        pi.EYQ("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || this.EYQ == null || !(this.EYQ.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.TZn = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.EYQ.getLayoutParams();
        marginLayoutParams.width = this.dVQ;
        marginLayoutParams.height = this.GfQ;
        marginLayoutParams.leftMargin = this.xh;
        marginLayoutParams.topMargin = this.Nuq;
        this.EYQ.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.by);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            tr.mZx(viewGroup, this.VEW.left, this.VEW.top, this.VEW.right, this.VEW.bottom);
        }
        mZx(true);
        this.TQF.setImageDrawable(zF.Td(this.tPj, "tt_enlarge_video"));
        this.wa.setThumb(VwS.EYQ(this.tPj, "tt_seek_thumb_normal"));
        this.wa.setThumbOffset(0);
        com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ((View) this.EYQ, true);
        Kbd(this.TZn);
        tr.EYQ(this.kf, 8);
        if ((this.XN & 2) == 2) {
            tr.EYQ((View) this.FtN, 0);
        }
    }

    private void Kbd(boolean z) {
        if (z) {
            wBa();
        } else {
            rfB();
        }
    }

    private void wBa() {
        DisplayMetrics displayMetrics = this.tPj.getResources().getDisplayMetrics();
        TextView textView = this.na;
        if (textView != null) {
            this.BQ = textView.getTextSize();
            this.na.setTextSize(2, 14.0f);
            ColorStateList textColors = this.na.getTextColors();
            this.aEX = textColors;
            if (textColors != null) {
                this.na.setTextColor(zF.QQ(this.tPj, "tt_ssxinzi15"));
            }
            this.Ko = this.na.getAlpha();
            this.na.setAlpha(0.85f);
            this.na.setShadowLayer(0.0f, tr.mZx(this.tPj, 0.5f), tr.mZx(this.tPj, 0.5f), zF.QQ(this.tPj, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.na.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.XT.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                tr.mZx(this.na, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.XT.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.XT.bottom);
            }
        }
        TextView textView2 = this.KR;
        if (textView2 != null) {
            this.eVP = textView2.getTextSize();
            this.KR.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.KR.getTextColors();
            this.dub = textColors2;
            if (textColors2 != null) {
                this.KR.setTextColor(zF.QQ(this.tPj, "tt_ssxinzi15"));
            }
            this.sOZ = this.KR.getAlpha();
            this.KR.setAlpha(0.85f);
            this.KR.setShadowLayer(0.0f, tr.mZx(this.tPj, 0.5f), tr.mZx(this.tPj, 0.5f), zF.QQ(this.tPj, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.KR.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.oIw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                tr.mZx(this.KR, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.oIw.top, this.oIw.right, this.oIw.bottom);
            }
        }
        ImageView imageView = this.TQF;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.zzY.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                tr.mZx(this.TQF, this.zzY.left, this.zzY.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.zzY.bottom);
            }
        }
        ImageView imageView2 = this.TQF;
        if (imageView2 != null) {
            imageView2.setImageDrawable(zF.Td(this.tPj, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.Kbc;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.Dd = textColors3;
            if (textColors3 != null) {
                this.Kbc.setTextColor(zF.QQ(this.tPj, "tt_ssxinzi15"));
            }
            this.OnO = this.Kbc.getAlpha();
            this.Kbc.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.Kbc.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.eFB.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                tr.mZx(this.Kbc, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.oIw.top, this.oIw.right, this.oIw.bottom);
            }
        }
        View view = this.kf;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.Hnh = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.kf.setLayoutParams(layoutParams5);
            this.kf.setBackgroundResource(zF.Pm(this.tPj, "tt_shadow_fullscreen_top"));
        }
        mZx(false, true);
    }

    private void rfB() {
        TextView textView = this.na;
        if (textView != null) {
            textView.setTextSize(0, this.BQ);
            ColorStateList colorStateList = this.aEX;
            if (colorStateList != null) {
                this.na.setTextColor(colorStateList);
            }
            this.na.setAlpha(this.Ko);
            this.na.setShadowLayer(tr.mZx(this.tPj, 1.0f), 0.0f, 0.0f, zF.QQ(this.tPj, "tt_video_shadow_color"));
            tr.mZx(this.na, this.XT.left, this.XT.top, this.XT.right, this.XT.bottom);
        }
        TextView textView2 = this.KR;
        if (textView2 != null) {
            textView2.setTextSize(0, this.eVP);
            ColorStateList colorStateList2 = this.dub;
            if (colorStateList2 != null) {
                this.KR.setTextColor(colorStateList2);
            }
            this.KR.setAlpha(this.sOZ);
            this.KR.setShadowLayer(tr.mZx(this.tPj, 1.0f), 0.0f, 0.0f, zF.QQ(this.tPj, "tt_video_shadow_color"));
            tr.mZx(this.KR, this.oIw.left, this.oIw.top, this.oIw.right, this.oIw.bottom);
        }
        ImageView imageView = this.TQF;
        if (imageView != null) {
            tr.mZx(imageView, this.zzY.left, this.zzY.top, this.zzY.right, this.zzY.bottom);
        }
        ImageView imageView2 = this.TQF;
        if (imageView2 != null) {
            imageView2.setImageDrawable(zF.Td(this.tPj, "tt_enlarge_video"));
        }
        TextView textView3 = this.Kbc;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.Dd;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.Kbc.setAlpha(this.OnO);
            tr.mZx(this.Kbc, this.oIw.left, this.oIw.top, this.oIw.right, this.oIw.bottom);
        }
        View view = this.kf;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.Hnh;
            this.kf.setLayoutParams(layoutParams);
            this.kf.setBackground(VwS.EYQ(this.tPj, "tt_video_black_desc_gradient"));
        }
        mZx(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message.what != 1) {
            return;
        }
        MxO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(boolean z, boolean z2, boolean z3) {
        tr.EYQ(this.wJ, 0);
        if (this.TZn) {
            tr.EYQ(this.kf, 0);
            tr.EYQ((View) this.Kbc, 0);
        } else if (z3) {
            tr.EYQ(this.kf, 8);
        }
        tr.EYQ((View) this.Td, (!z || this.Pm.getVisibility() == 0) ? 8 : 0);
        if (!this.hYh && !this.TZn) {
            if ((this.XN & 1) != 1 && !z3) {
                tr.EYQ((View) this.PI, 0);
            }
            tr.EYQ((View) this.FtN, z3 ? 8 : 0);
        }
        tr.EYQ((View) this.KR, 0);
        tr.EYQ((View) this.na, 0);
        tr.EYQ((View) this.wa, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void EYQ(boolean z, boolean z2) {
        tr.EYQ(this.wJ, 8);
        tr.EYQ(this.kf, 8);
        tr.EYQ((View) this.Td, 8);
        if (!this.hYh && !this.TZn) {
            tr.EYQ((View) this.PI, 8);
            if ((this.XN & 2) != 2) {
                tr.EYQ((View) this.FtN, 8);
            }
        } else if ((this.XN & 1) == 1) {
            tr.EYQ((View) this.PI, 8);
        }
        if (z2) {
            tr.EYQ((View) this.PI, 8);
            tr.EYQ((View) this.FtN, 8);
        }
        Td(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bytedance.sdk.openadsdk.core.widget.Kbd.mZx
    public void MxO() {
        EYQ(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public boolean mZx(int i) {
        SeekBar seekBar = this.wa;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd
    public void Td(boolean z) {
        TextView textView;
        TextView textView2;
        int i;
        if (this.mN != null) {
            if (this.hYh) {
                textView2 = this.mN;
            } else {
                textView = this.mN;
                if (z) {
                    i = 0;
                    tr.EYQ((View) textView, i);
                }
                textView2 = textView;
            }
            textView = textView2;
            i = 8;
            tr.EYQ((View) textView, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd, com.bytedance.sdk.openadsdk.core.widget.Pm.EYQ
    public void EYQ(View view, boolean z) {
        if (tp()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.NZ != null && !TextUtils.isEmpty(this.NZ.TQF())) {
                EYQ(this.NZ.TQF());
            }
            this.Pf.setText(str);
        } else {
            EYQ("");
            this.Pf.setText("");
        }
        if (this.lEs) {
            return;
        }
        Td(this.hYh && !this.TZn);
        if (hu()) {
            this.rfB.EYQ(this, view, true, this.Pm.getVisibility() != 0);
        }
    }
}
