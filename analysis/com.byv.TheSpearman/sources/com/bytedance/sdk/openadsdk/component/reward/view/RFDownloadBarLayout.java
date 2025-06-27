package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.Td;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RFDownloadBarLayout extends PAGRelativeLayout {
    private TTRatingBar2 EYQ;
    private boolean IPb;
    private TextView Kbd;
    private TTRoundRectImageView Pm;
    private TextView QQ;
    private TextView Td;
    private com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ VwS;
    private TextView mZx;

    public RFDownloadBarLayout(Context context) {
        super(context);
        setVisibility(8);
    }

    private static TTRoundRectImageView EYQ(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setBackgroundColor(0);
        tTRoundRectImageView.setId(tp.mZx);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tr.mZx(context, 69.0f), tr.mZx(context, 69.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(20);
        }
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        tTRoundRectImageView.setLayoutParams(layoutParams);
        return tTRoundRectImageView;
    }

    private static TextView mZx(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 17.0f);
        pAGTextView.setId(tp.Td);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, tr.mZx(context, 27.0f));
        layoutParams.leftMargin = tr.mZx(context, 14.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TTRatingBar2 EYQ(Context context, int i) {
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        tTRatingBar2.setId(tp.Kbd);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams.gravity = i;
        tTRatingBar2.setLayoutParams(layoutParams);
        return tTRatingBar2;
    }

    private static TextView Td(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 13.0f);
        pAGTextView.setId(tp.Pm);
        pAGTextView.setMaxWidth(tr.mZx(context, 72.0f));
        pAGTextView.setText(zF.mZx(context, "tt_comment_num"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = tr.mZx(context, 10.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TextView Pm(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setGravity(17);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setLines(1);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        pAGTextView.setBackground(VwS.EYQ(context, "tt_reward_video_download_btn_bg"));
        pAGTextView.setId(520093705);
        pAGTextView.setPadding(tr.mZx(context, 10.0f), 0, tr.mZx(context, 10.0f), 0);
        pAGTextView.setText(zF.mZx(context, "tt_video_mobile_go_detail"));
        return pAGTextView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.IPb) {
            return;
        }
        Td();
    }

    private void Td() {
        TextView textView;
        this.IPb = true;
        Context context = getContext();
        int iLEs = this.VwS.EYQ.lEs();
        if (iLEs == 1) {
            Pm();
        } else if (iLEs == 3) {
            IPb();
        } else if (iLEs == 5) {
            Kbd();
        } else {
            VwS();
        }
        if (this.Td == null) {
            this.Td = (TextView) this.VwS.TZn.findViewById(520093705);
        }
        final UB ub = this.VwS.EYQ;
        TextView textView2 = this.Td;
        if (textView2 != null) {
            textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) RFDownloadBarLayout.this.Td.getParent()).getWidth();
                    if (width > 0) {
                        RFDownloadBarLayout.this.Td.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (ub.oIw()) {
                if (ub.zzY() != null && TextUtils.isEmpty(ub.zzY().IPb())) {
                    tr.EYQ((View) this.Td, 8);
                }
            } else {
                this.Td.setText(ub.lEs() == 3 ? getButtonTextForNewStyleBar() : ub.TZn());
            }
        }
        if (this.Pm != null && ub.vD() != null && !TextUtils.isEmpty(ub.vD().EYQ())) {
            final String strEYQ = ub.vD().EYQ();
            if (ub.oIw()) {
                com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(ub.vD()).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, ub.vD().EYQ(), new hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.2
                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(MxO<Bitmap> mxO) {
                        if (mxO == null || mxO.mZx() == null) {
                            return;
                        }
                        if (RFDownloadBarLayout.this.Pm != null) {
                            RFDownloadBarLayout.this.Pm.setImageBitmap(mxO.mZx());
                        }
                        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, RFDownloadBarLayout.this.VwS.VwS, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(int i, String str, Throwable th) {
                        RFDownloadBarLayout.this.EYQ(i, str, strEYQ);
                    }
                }));
                if (ub.zzY() != null && ub.zzY().mZx() != null) {
                    ub.zzY().mZx().mZx(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(ub.vD(), this.Pm, ub);
            }
        }
        if (this.Kbd != null) {
            if (this.VwS.tp == 1 && ub.xh() != null && !TextUtils.isEmpty(ub.xh().mZx())) {
                this.Kbd.setText(ub.xh().mZx());
            } else {
                this.Kbd.setText(ub.TQF());
            }
        }
        TextView textView3 = this.mZx;
        if (textView3 != null) {
            tr.EYQ(textView3, ub, this.VwS.VOV, "tt_comment_num");
        }
        if (this.VwS.tp == 1) {
            TextView textView4 = this.Kbd;
            if (textView4 != null) {
                textView4.setMaxWidth(tr.mZx(context, 153.0f));
            }
        } else {
            TextView textView5 = this.Kbd;
            if (textView5 != null) {
                textView5.setMaxWidth(tr.mZx(context, 404.0f));
            }
        }
        TTRatingBar2 tTRatingBar2 = this.EYQ;
        if (tTRatingBar2 != null) {
            tr.EYQ((TextView) null, tTRatingBar2, ub);
        }
        if (ub.oIw() && (textView = this.QQ) != null) {
            textView.setText(ub.OtA());
        }
        if (this.VwS.tp == 2 && ub.lEs() == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Td.getLayoutParams();
            layoutParams.height = tr.mZx(this.VwS.VOV, 55.0f);
            layoutParams.topMargin = tr.mZx(this.VwS.VOV, 20.0f);
            this.Td.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = tr.mZx(this.VwS.VOV, 12.0f);
            setLayoutParams(layoutParams2);
        }
        mZx();
    }

    public void EYQ() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.VwS = eyq;
        if (eyq.EYQ.lEs() == 1) {
            Td();
        }
    }

    protected String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strTZn;
        String strVwS = FH.VwS(this.VwS.VOV);
        if (strVwS == null) {
            strVwS = "";
        }
        try {
            zEquals = strVwS.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.VwS.EYQ.TZn())) {
            strTZn = this.VwS.EYQ.Pf() != 4 ? "View" : "Install";
        } else {
            strTZn = this.VwS.EYQ.TZn();
            if (strTZn == null || !FH.IPb(strTZn) || strTZn.length() <= 2) {
                if (strTZn != null && !FH.IPb(strTZn) && strTZn.length() > 7 && zEquals) {
                    strTZn = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strTZn = getCnOrEnBtnText();
            }
        }
        if (zEquals && !FH.IPb(strTZn)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Td.getLayoutParams();
            layoutParams.bottomMargin = tr.mZx(this.VwS.VOV, 4.0f);
            this.Td.setLayoutParams(layoutParams);
        }
        return strTZn;
    }

    private String getCnOrEnBtnText() {
        return this.VwS.EYQ.Pf() != 4 ? "View" : "Install";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final int i, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new QQ("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put("url", str2);
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(RFDownloadBarLayout.this.VwS.EYQ, RFDownloadBarLayout.this.VwS.VwS, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    public void mZx() {
        com.bytedance.sdk.openadsdk.core.mZx.Kbd Kbd = this.VwS.Pf.Kbd();
        final View.OnClickListener onClickListenerPm = this.VwS.Pf.Pm();
        final UB ub = this.VwS.EYQ;
        if (ub.xt() == null) {
            return;
        }
        if (ub.lEs() != 5 && this.Td != null) {
            if (ub.xt().Kbd) {
                this.Td.setOnClickListener(Kbd);
                this.Td.setOnTouchListener(Kbd);
            } else {
                this.Td.setOnClickListener(onClickListenerPm);
            }
        }
        if (ub.lEs() == 1) {
            if (ub.xt().EYQ) {
                tr.EYQ((View) this, (View.OnClickListener) Kbd, "TTBaseVideoActivity#mRlDownloadBar");
                tr.EYQ((View) this, (View.OnTouchListener) Kbd, "TTBaseVideoActivity#mRlDownloadBar");
                this.Kbd.setOnClickListener(Kbd);
                this.Kbd.setOnTouchListener(Kbd);
                this.mZx.setOnClickListener(Kbd);
                this.mZx.setOnTouchListener(Kbd);
                this.EYQ.setOnClickListener(Kbd);
                this.EYQ.setOnTouchListener(Kbd);
                this.Pm.setOnClickListener(Kbd);
                this.Pm.setOnTouchListener(Kbd);
                return;
            }
            tr.EYQ(this, onClickListenerPm, "TTBaseVideoActivity#mRlDownloadBar");
            this.Kbd.setOnClickListener(onClickListenerPm);
            this.mZx.setOnClickListener(onClickListenerPm);
            this.EYQ.setOnClickListener(onClickListenerPm);
            this.Pm.setOnClickListener(onClickListenerPm);
            return;
        }
        if (ub.lEs() == 5) {
            String str = "VAST_ICON";
            if (ub.xt().Kbd) {
                com.bytedance.sdk.openadsdk.core.mZx.VwS vwS = new com.bytedance.sdk.openadsdk.core.mZx.VwS("VAST_ACTION_BUTTON", ub.zzY(), Kbd) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.4
                };
                com.bytedance.sdk.openadsdk.core.mZx.VwS vwS2 = new com.bytedance.sdk.openadsdk.core.mZx.VwS(str, ub.zzY(), Kbd) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.5
                };
                TextView textView = this.Td;
                if (textView != null) {
                    textView.setOnClickListener(vwS);
                    this.Td.setOnTouchListener(vwS);
                }
                TTRoundRectImageView tTRoundRectImageView = this.Pm;
                if (tTRoundRectImageView != null) {
                    tTRoundRectImageView.setOnClickListener(vwS2);
                    this.Pm.setOnTouchListener(vwS2);
                }
                TextView textView2 = this.Kbd;
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    this.Kbd.setOnClickListener(vwS);
                    this.Kbd.setOnTouchListener(vwS);
                }
                TextView textView3 = this.QQ;
                if (textView3 == null || TextUtils.isEmpty(textView3.getText())) {
                    return;
                }
                this.QQ.setOnClickListener(vwS);
                this.QQ.setOnTouchListener(vwS);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = onClickListenerPm;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (ub.zzY() == null || ub.zzY().mZx() == null) {
                            return;
                        }
                        ub.zzY().mZx().EYQ(RFDownloadBarLayout.this.VwS.FtN.VwS());
                        return;
                    }
                    if (ub.zzY() != null) {
                        ub.zzY().EYQ().VwS(RFDownloadBarLayout.this.VwS.FtN.VwS());
                    }
                }
            };
            TextView textView4 = this.Td;
            if (textView4 != null) {
                textView4.setOnClickListener(onClickListener);
            }
            TextView textView5 = this.Kbd;
            if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                this.Kbd.setOnClickListener(onClickListener);
            }
            TextView textView6 = this.QQ;
            if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                this.QQ.setOnClickListener(onClickListener);
            }
            TTRoundRectImageView tTRoundRectImageView2 = this.Pm;
            if (tTRoundRectImageView2 != null) {
                tTRoundRectImageView2.setTag(570425345, "VAST_ICON");
                this.Pm.setOnClickListener(onClickListenerPm);
                return;
            }
            return;
        }
        if (ub.xt().Td) {
            tr.EYQ((View) this, (View.OnClickListener) Kbd, "TTBaseVideoActivity#mRlDownloadBar");
            tr.EYQ((View) this, (View.OnTouchListener) Kbd, "TTBaseVideoActivity#mRlDownloadBar");
        } else {
            tr.EYQ(this, onClickListenerPm, "TTBaseVideoActivity#mRlDownloadBar");
        }
    }

    private void Pm() {
        Context context = getContext();
        TTRoundRectImageView tTRoundRectImageViewEYQ = EYQ(context);
        this.Pm = tTRoundRectImageViewEYQ;
        addView(tTRoundRectImageViewEYQ);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(1, tp.mZx);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(17, tp.mZx);
        }
        addView(pAGLinearLayout, layoutParams);
        TextView textViewMZx = mZx(context);
        this.Kbd = textViewMZx;
        textViewMZx.setMaxWidth(tr.mZx(context, 176.0f));
        pAGLinearLayout.addView(this.Kbd);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = tr.mZx(context, 14.0f);
        layoutParams2.topMargin = tr.mZx(context, 10.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams2);
        TTRatingBar2 tTRatingBar2EYQ = EYQ(context, 17);
        this.EYQ = tTRatingBar2EYQ;
        pAGLinearLayout2.addView(tTRatingBar2EYQ);
        TextView textViewTd = Td(context);
        this.mZx = textViewTd;
        pAGLinearLayout2.addView(textViewTd);
    }

    private void Kbd() {
        Context context = getContext();
        TTRoundRectImageView tTRoundRectImageViewEYQ = EYQ(context);
        this.Pm = tTRoundRectImageViewEYQ;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tTRoundRectImageViewEYQ.getLayoutParams();
        int iMZx = tr.mZx(context, 52.0f);
        layoutParams.height = iMZx;
        layoutParams.width = iMZx;
        addView(this.Pm);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setId(tp.IPb);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tr.mZx(context, 100.0f), tr.mZx(context, 45.0f));
        layoutParams2.addRule(11);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(21);
        }
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = tr.mZx(context, 15.0f);
        addView(pAGLinearLayout, layoutParams2);
        this.Td = Pm(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, tr.mZx(context, 41.0f));
        layoutParams3.bottomMargin = tr.mZx(context, 3.0f);
        pAGLinearLayout.addView(this.Td, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(0, tp.IPb);
        layoutParams4.addRule(1, tp.mZx);
        addView(pAGLinearLayout2, layoutParams4);
        TextView textViewMZx = mZx(context);
        this.Kbd = textViewMZx;
        textViewMZx.setTextColor(Color.parseColor("#222222"));
        this.Kbd.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.Kbd.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = tr.mZx(context, 22.0f);
        layoutParams5.leftMargin = tr.mZx(context, 10.0f);
        pAGLinearLayout2.addView(this.Kbd);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.QQ = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.QQ.setSingleLine(true);
        this.QQ.setTextColor(Color.parseColor("#4A4A4A"));
        this.QQ.setTextSize(2, 14.0f);
        this.QQ.setId(tp.VwS);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, tr.mZx(context, 16.0f));
        layoutParams6.leftMargin = tr.mZx(context, 10.0f);
        layoutParams6.topMargin = tr.mZx(context, 5.0f);
        pAGLinearLayout2.addView(this.QQ, layoutParams6);
    }

    private void IPb() {
        Context context = getContext();
        TTRoundRectImageView tTRoundRectImageViewEYQ = EYQ(context);
        this.Pm = tTRoundRectImageViewEYQ;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tTRoundRectImageViewEYQ.getLayoutParams();
        int iMZx = tr.mZx(context, 52.0f);
        layoutParams.height = iMZx;
        layoutParams.width = iMZx;
        addView(this.Pm);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(tp.IPb);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tr.mZx(context, 76.0f), tr.mZx(context, 45.0f));
        layoutParams2.addRule(11);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(21);
        }
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = tr.mZx(context, 15.0f);
        int[] iArr = {Color.parseColor("#0070FF")};
        com.bytedance.sdk.openadsdk.core.widget.Td.EYQ(pAGLinearLayout, new Td.EYQ().EYQ(iArr[0]).mZx(Color.parseColor("#80000000")).EYQ(iArr).Td(tr.mZx(context, 17.0f)).Pm(0).Kbd(tr.mZx(context, 3.0f)));
        addView(pAGLinearLayout, layoutParams2);
        this.Td = Pm(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.bottomMargin = tr.mZx(context, 3.0f);
        pAGLinearLayout.addView(this.Td, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(16, tp.IPb);
        }
        layoutParams4.addRule(0, tp.IPb);
        layoutParams4.addRule(1, tp.mZx);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.addRule(17, tp.mZx);
        }
        addView(pAGLinearLayout2, layoutParams4);
        TextView textViewMZx = mZx(context);
        this.Kbd = textViewMZx;
        textViewMZx.setTextColor(Color.parseColor("#222222"));
        this.Kbd.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.Kbd.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = tr.mZx(context, 22.0f);
        layoutParams5.leftMargin = tr.mZx(context, 10.0f);
        pAGLinearLayout2.addView(this.Kbd);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = tr.mZx(context, 14.0f);
        layoutParams6.topMargin = tr.mZx(context, 5.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams6);
        TTRatingBar2 tTRatingBar2EYQ = EYQ(context, -1);
        this.EYQ = tTRatingBar2EYQ;
        ((LinearLayout.LayoutParams) tTRatingBar2EYQ.getLayoutParams()).height = tr.mZx(context, 12.0f);
        pAGLinearLayout3.addView(this.EYQ);
        TextView textViewTd = Td(context);
        this.mZx = textViewTd;
        textViewTd.setTextColor(Color.parseColor("#4A4A4A"));
        this.mZx.setTextSize(2, 14.0f);
        this.mZx.setMaxWidth(tr.mZx(context, 83.0f));
        ((LinearLayout.LayoutParams) this.mZx.getLayoutParams()).height = tr.mZx(context, 20.0f);
        pAGLinearLayout3.addView(this.mZx);
    }

    private void VwS() {
        Context context = getContext();
        TTRoundRectImageView tTRoundRectImageViewEYQ = EYQ(context);
        this.Pm = tTRoundRectImageViewEYQ;
        addView(tTRoundRectImageViewEYQ);
        TextView textViewPm = Pm(context);
        this.Td = textViewPm;
        textViewPm.setBackground(VwS.EYQ(context, "tt_download_corner_bg"));
        this.Td.setMaxWidth(tr.mZx(context, 105.0f));
        this.Td.setText(zF.mZx(context, "tt_video_download_apk"));
        this.Td.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 36.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(21);
        }
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        layoutParams.rightMargin = tr.mZx(context, 15.0f);
        addView(this.Td, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(0, this.Td.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(16, this.Td.getId());
        }
        layoutParams2.addRule(1, this.Pm.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(17, this.Pm.getId());
        }
        addView(pAGLinearLayout, layoutParams2);
        TextView textViewMZx = mZx(context);
        this.Kbd = textViewMZx;
        textViewMZx.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pAGLinearLayout.addView(this.Kbd);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = tr.mZx(context, 14.0f);
        layoutParams3.topMargin = tr.mZx(context, 5.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams3);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        TTRatingBar2 tTRatingBar2EYQ = EYQ(context, 17);
        this.EYQ = tTRatingBar2EYQ;
        pAGLinearLayout2.addView(tTRatingBar2EYQ);
        TextView textViewTd = Td(context);
        this.mZx = textViewTd;
        textViewTd.setTextColor(Color.parseColor("#4A4A4A"));
        this.mZx.setTextSize(2, 11.0f);
        pAGLinearLayout2.addView(this.mZx);
    }
}
