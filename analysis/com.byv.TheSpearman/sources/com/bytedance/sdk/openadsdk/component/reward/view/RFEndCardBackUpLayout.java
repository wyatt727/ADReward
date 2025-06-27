package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class RFEndCardBackUpLayout extends PAGFrameLayout {
    private boolean EYQ;
    private TextView IPb;
    private TTRatingBar2 Kbd;
    private TextView Pm;
    private PAGLogoView QQ;
    private TTRoundRectImageView Td;
    private TextView VwS;
    private com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ mZx;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(tp.eVP);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.mZx = eyq;
        if (eyq.EYQ.oIw()) {
            EYQ();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            EYQ();
        }
    }

    private void EYQ() {
        if (this.EYQ) {
            return;
        }
        this.EYQ = true;
        UB ub = this.mZx.EYQ;
        if (ub.oIw()) {
            mZx();
            return;
        }
        Td();
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.mZx.Kbd Kbd = this.mZx.Pf.Kbd();
        this.VwS.setOnClickListener(Kbd);
        this.VwS.setOnTouchListener(Kbd);
        String strTZn = ub.TZn();
        if (!TextUtils.isEmpty(strTZn)) {
            this.VwS.setText(strTZn);
        }
        TTRoundRectImageView tTRoundRectImageView = this.Td;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, tr.mZx(context, 50.0f), 0, 0);
            this.Td.setLayoutParams(layoutParams);
        }
        if (this.Td != null && ub.vD() != null && !TextUtils.isEmpty(ub.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(ub.vD(), this.Td, ub);
        }
        TTRatingBar2 tTRatingBar2 = this.Kbd;
        if (tTRatingBar2 != null) {
            tr.EYQ((TextView) null, tTRatingBar2, ub);
        }
        if (this.Pm != null) {
            if (ub.xh() != null && !TextUtils.isEmpty(ub.xh().mZx())) {
                this.Pm.setText(ub.xh().mZx());
            } else {
                this.Pm.setText(ub.TQF());
            }
        }
        TextView textView = this.IPb;
        if (textView != null) {
            tr.EYQ(textView, ub, getContext(), "tt_comment_num_backup");
        }
        this.QQ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(RFEndCardBackUpLayout.this.mZx.TZn, RFEndCardBackUpLayout.this.mZx.EYQ, RFEndCardBackUpLayout.this.mZx.VwS);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void mZx() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(tp.QQ);
        pAGImageView.setVisibility(8);
        addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setVisibility(8);
        sSWebView.setId(tp.HX);
        addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void Td() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.Td = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.Td, new LinearLayout.LayoutParams(tr.mZx(context, 100.0f), tr.mZx(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.Pm = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.Pm.setSingleLine(true);
        this.Pm.setMaxWidth(tr.mZx(context, 180.0f));
        this.Pm.setTextColor(Color.parseColor("#ff333333"));
        this.Pm.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 28.0f));
        layoutParams2.topMargin = tr.mZx(context, 16.0f);
        pAGLinearLayout.addView(this.Pm, layoutParams2);
        this.Kbd = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 16.0f));
        layoutParams3.topMargin = tr.mZx(context, 12.0f);
        pAGLinearLayout.addView(this.Kbd, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.IPb = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.IPb.setSingleLine(true);
        this.IPb.setTextColor(Color.parseColor("#ff93959a"));
        this.IPb.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 20.0f));
        layoutParams4.topMargin = tr.mZx(context, 8.0f);
        pAGLinearLayout.addView(this.IPb, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.VwS = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.VwS.setGravity(17);
        this.VwS.setText(zF.mZx(context, "tt_video_download_apk"));
        this.VwS.setTextColor(-1);
        this.VwS.setTextSize(2, 16.0f);
        this.VwS.setBackground(VwS.EYQ(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, tr.mZx(context, 46.0f));
        int iMZx = tr.mZx(context, 20.0f);
        layoutParams5.bottomMargin = iMZx;
        layoutParams5.rightMargin = iMZx;
        layoutParams5.topMargin = iMZx;
        layoutParams5.leftMargin = iMZx;
        pAGLinearLayout.addView(this.VwS, layoutParams5);
        this.QQ = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = tr.mZx(context, 16.0f);
        layoutParams6.leftMargin = tr.mZx(context, 20.0f);
        pAGLinearLayout.addView(this.QQ, layoutParams6);
    }
}
