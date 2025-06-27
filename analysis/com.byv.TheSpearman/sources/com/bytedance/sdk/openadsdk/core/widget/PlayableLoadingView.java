package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PlayableLoadingView extends PAGFrameLayout {
    private PAGProgressBar EYQ;
    private boolean IPb;
    private long Kbd;
    private long Pm;
    private TextView Td;
    private TextView mZx;

    public PlayableLoadingView(Context context) {
        super(context);
        setVisibility(8);
    }

    private void Pm() {
        if (this.IPb) {
            return;
        }
        this.IPb = true;
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        Context context = getContext();
        int iMZx = tr.mZx(context, 80.0f);
        int iMZx2 = tr.mZx(context, 10.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMZx, tr.mZx(context, 53.0f));
        layoutParams2.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(zF.Pm(context, "tt_pangle_logo_white"));
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = iMZx2;
        layoutParams3.gravity = 17;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout.addView(linearLayout2);
        this.EYQ = new PAGProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMZx, tr.mZx(context, 3.0f));
        layoutParams4.gravity = 17;
        this.EYQ.setProgress(1);
        this.EYQ.setProgressDrawable(zF.Td(context, "tt_playable_progress_style"));
        this.EYQ.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.EYQ);
        this.mZx = new TextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = iMZx2;
        this.mZx.setGravity(16);
        int color = Color.parseColor("#EEEEEE");
        this.mZx.setTextColor(color);
        this.mZx.setTextSize(12.0f);
        this.mZx.setLayoutParams(layoutParams5);
        linearLayout2.addView(this.mZx);
        int iMZx3 = tr.mZx(context, 24.0f);
        int iMZx4 = tr.mZx(context, 8.0f);
        TextView textView = new TextView(context);
        this.Td = textView;
        textView.setId(tp.wY);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = tr.mZx(context, 72.0f);
        layoutParams6.gravity = 17;
        this.Td.setBackground(VwS.EYQ(context, "tt_playable_btn_bk"));
        this.Td.setClickable(true);
        this.Td.setPadding(iMZx3, iMZx4, iMZx3, iMZx4);
        this.Td.setMaxLines(1);
        this.Td.setEllipsize(TextUtils.TruncateAt.END);
        this.Td.setTextColor(color);
        this.Td.setTextSize(14.0f);
        this.Td.setText(zF.EYQ(context, "tt_try_now"));
        this.Td.setLayoutParams(layoutParams6);
        linearLayout.addView(this.Td);
        addView(linearLayout);
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        PAGProgressBar pAGProgressBar = this.EYQ;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i);
        }
        TextView textView = this.mZx;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i)));
        }
    }

    public void EYQ() {
        setVisibility(8);
        if (this.Pm != 0) {
            this.Kbd = SystemClock.elapsedRealtime();
        }
    }

    public void mZx() {
        if (isShown()) {
            return;
        }
        Pm();
        setVisibility(0);
        this.Pm = SystemClock.elapsedRealtime();
    }

    public boolean Td() {
        return this.Pm > 0 && this.Kbd > 0;
    }

    public long getDisplayDuration() {
        if (this.Pm == 0) {
            return 0L;
        }
        if (this.Kbd == 0) {
            this.Kbd = SystemClock.elapsedRealtime();
        }
        return this.Kbd - this.Pm;
    }

    public TextView getPlayView() {
        return this.Td;
    }
}
