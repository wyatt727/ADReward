package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: TTDislikeLayoutUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public View EYQ(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(1);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(tp.Hrh);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, tr.mZx(context, 44.0f)));
        pAGRelativeLayout.setBackground(VwS.EYQ(context, "tt_dislike_top_bg"));
        pAGRelativeLayout.setVisibility(8);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(tp.WD);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        pAGTextView.setLayoutParams(layoutParams);
        pAGTextView.setCompoundDrawablesWithIntrinsicBounds(zF.Td(context, "tt_lefterbackicon_titlebar_press_wrapper"), (Drawable) null, (Drawable) null, (Drawable) null);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#FF9B9B9B"));
        pAGTextView.setTextSize(14.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            pAGTextView.setTextDirection(5);
        }
        pAGRelativeLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(tp.Qh);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGTextView2.setLayoutParams(layoutParams2);
        pAGTextView2.setGravity(17);
        pAGTextView2.setTextColor(Color.parseColor("#FF9B9B9B"));
        pAGTextView2.setTextSize(15.0f);
        pAGRelativeLayout.addView(pAGTextView2);
        View view = new View(context);
        view.setId(tp.Vx);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, tr.mZx(context, 1.0f)));
        view.setBackgroundColor(Color.parseColor("#DCDCDC"));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TTDislikeListView tTDislikeListView = new TTDislikeListView(context);
        tTDislikeListView.setId(tp.zAe);
        tTDislikeListView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tTDislikeListView.setDivider(new ColorDrawable(Color.parseColor("#DCDCDC")));
        tTDislikeListView.setDividerHeight(tr.mZx(context, 1.0f));
        tTDislikeListView.setSelector(new ColorDrawable(Color.parseColor("#00000000")));
        tTDislikeListView.setVerticalScrollBarEnabled(true);
        pAGFrameLayout.addView(tTDislikeListView);
        TTDislikeListView tTDislikeListView2 = new TTDislikeListView(context);
        tTDislikeListView2.setId(tp.LoE);
        tTDislikeListView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tTDislikeListView2.setDivider(new ColorDrawable(Color.parseColor("#DCDCDC")));
        tTDislikeListView2.setDividerHeight(tr.mZx(context, 1.0f));
        tTDislikeListView2.setSelector(new ColorDrawable(Color.parseColor("#00000000")));
        tTDislikeListView2.setVerticalScrollBarEnabled(true);
        tTDislikeListView2.setVisibility(8);
        pAGFrameLayout.addView(tTDislikeListView2);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGFrameLayout);
        if (KO.Jpu().na()) {
            View view2 = new View(context);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, tr.mZx(context, 1.0f)));
            view2.setBackgroundColor(Color.parseColor("#DCDCDC"));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, tr.mZx(context, 50.0f)));
            frameLayout.setBackgroundResource(zF.Pm(context, "tt_dislike_bottom_seletor"));
            PAGTextView pAGTextView3 = new PAGTextView(context);
            pAGTextView3.setId(tp.xBe);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.leftMargin = tr.mZx(context, 20.0f);
            layoutParams3.rightMargin = tr.mZx(context, 20.0f);
            layoutParams3.gravity = 17;
            pAGTextView3.setLayoutParams(layoutParams3);
            pAGTextView3.setBackground(VwS.EYQ(context, "tt_comment_tv"));
            Drawable drawableTd = zF.Td(context, "tt_suggestion_logo");
            drawableTd.setBounds(0, 0, drawableTd.getIntrinsicWidth(), drawableTd.getIntrinsicHeight());
            pAGTextView3.setCompoundDrawables(drawableTd, null, null, null);
            pAGTextView3.setCompoundDrawablePadding(tr.mZx(context, 5.0f));
            pAGTextView3.setPadding(tr.mZx(context, 8.6f), tr.mZx(context, 10.0f), tr.mZx(context, 8.6f), tr.mZx(context, 10.0f));
            pAGTextView3.setFocusable(false);
            pAGTextView3.setHint(zF.EYQ(context, "tt_display_error"));
            pAGTextView3.setHintTextColor(Color.parseColor("#80161823"));
            pAGTextView3.setTextSize(12.0f);
            pAGTextView3.setGravity(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
            pAGTextView3.setVisibility(0);
            frameLayout.addView(pAGTextView3);
            pAGLinearLayout.addView(view2);
            pAGLinearLayout.addView(frameLayout);
        }
        return pAGLinearLayout;
    }
}
