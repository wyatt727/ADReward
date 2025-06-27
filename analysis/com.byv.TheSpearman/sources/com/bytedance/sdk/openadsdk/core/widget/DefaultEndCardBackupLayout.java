package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class DefaultEndCardBackupLayout extends FrameLayout {
    private boolean EYQ;
    private String HX;
    private TextView IPb;
    private TextView Kbd;
    private TTRatingBar2 Pm;
    private UB QQ;
    private TextView Td;
    private PAGLogoView VwS;
    private TTRoundRectImageView mZx;
    private com.bytedance.sdk.openadsdk.core.mZx.EYQ tp;

    public DefaultEndCardBackupLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(tp.eVP);
    }

    public void EYQ(UB ub, String str, com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq) {
        this.QQ = ub;
        this.HX = str;
        this.tp = eyq;
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
        mZx();
        Context context = getContext();
        this.IPb.setOnClickListener(this.tp);
        this.IPb.setOnTouchListener(this.tp);
        String strTZn = this.QQ.TZn();
        if (!TextUtils.isEmpty(strTZn)) {
            this.IPb.setText(strTZn);
        }
        TTRoundRectImageView tTRoundRectImageView = this.mZx;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, tr.mZx(context, 50.0f), 0, 0);
            this.mZx.setLayoutParams(layoutParams);
        }
        if (this.mZx != null && this.QQ.vD() != null && !TextUtils.isEmpty(this.QQ.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.QQ.vD(), this.mZx, this.QQ);
        }
        TTRatingBar2 tTRatingBar2 = this.Pm;
        if (tTRatingBar2 != null) {
            tr.EYQ((TextView) null, tTRatingBar2, this.QQ);
        }
        if (this.Td != null) {
            if (this.QQ.xh() != null && !TextUtils.isEmpty(this.QQ.xh().mZx())) {
                this.Td.setText(this.QQ.xh().mZx());
            } else {
                this.Td.setText(this.QQ.TQF());
            }
        }
        TextView textView = this.Kbd;
        if (textView != null) {
            tr.EYQ(textView, this.QQ, getContext(), "tt_comment_num_backup");
        }
        this.VwS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.EYQ(DefaultEndCardBackupLayout.this.getContext(), DefaultEndCardBackupLayout.this.QQ, DefaultEndCardBackupLayout.this.HX);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void mZx() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.mZx = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.mZx, new LinearLayout.LayoutParams(tr.mZx(context, 100.0f), tr.mZx(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.Td = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.Td.setSingleLine(true);
        this.Td.setMaxWidth(tr.mZx(context, 180.0f));
        this.Td.setTextColor(Color.parseColor("#ff333333"));
        this.Td.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 28.0f));
        layoutParams2.topMargin = tr.mZx(context, 16.0f);
        pAGLinearLayout.addView(this.Td, layoutParams2);
        this.Pm = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 16.0f));
        layoutParams3.topMargin = tr.mZx(context, 12.0f);
        pAGLinearLayout.addView(this.Pm, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.Kbd = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.Kbd.setSingleLine(true);
        this.Kbd.setTextColor(Color.parseColor("#ff93959a"));
        this.Kbd.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 20.0f));
        layoutParams4.topMargin = tr.mZx(context, 8.0f);
        pAGLinearLayout.addView(this.Kbd, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.IPb = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.IPb.setGravity(17);
        this.IPb.setText(zF.mZx(context, "tt_video_download_apk"));
        this.IPb.setTextColor(-1);
        this.IPb.setTextSize(2, 16.0f);
        this.IPb.setBackground(VwS.EYQ(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, tr.mZx(context, 46.0f));
        int iMZx = tr.mZx(context, 20.0f);
        layoutParams5.bottomMargin = iMZx;
        layoutParams5.rightMargin = iMZx;
        layoutParams5.topMargin = iMZx;
        layoutParams5.leftMargin = iMZx;
        pAGLinearLayout.addView(this.IPb, layoutParams5);
        this.VwS = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = tr.mZx(context, 16.0f);
        layoutParams6.leftMargin = tr.mZx(context, 20.0f);
        pAGLinearLayout.addView(this.VwS, layoutParams6);
    }
}
