package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class TTAdDislikeToast extends PAGFrameLayout {
    private static String Kbd;
    private static String Pm;
    private static String Td;
    private final Handler EYQ;
    private TextView mZx;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.EYQ = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        EYQ(context);
    }

    public static String getDislikeTip() {
        if (Td == null) {
            Td = zF.EYQ(hu.EYQ(), "tt_feedback_submit_text");
        }
        return Td;
    }

    public static String getSkipText() {
        if (Pm == null) {
            Pm = zF.EYQ(hu.EYQ(), "tt_txt_skip");
        }
        return Pm;
    }

    public static String getDislikeSendTip() {
        if (Kbd == null) {
            Context contextEYQ = hu.EYQ();
            Kbd = zF.EYQ(contextEYQ, "tt_feedback_thank_text") + "\n" + zF.EYQ(contextEYQ, "tt_feedback_experience_text");
        }
        return Kbd;
    }

    public static void EYQ() {
        Context contextEYQ = hu.EYQ();
        Pm = zF.EYQ(contextEYQ, "tt_txt_skip");
        Td = zF.EYQ(contextEYQ, "tt_feedback_submit_text");
        Kbd = zF.EYQ(contextEYQ, "tt_feedback_thank_text") + "\n" + zF.EYQ(contextEYQ, "tt_feedback_experience_text");
    }

    private void EYQ(Context context) {
        TextView textView = new TextView(context);
        this.mZx = textView;
        textView.setClickable(false);
        this.mZx.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int iMZx = tr.mZx(hu.EYQ(), 20.0f);
        int iMZx2 = tr.mZx(hu.EYQ(), 12.0f);
        this.mZx.setPadding(iMZx, iMZx2, iMZx, iMZx2);
        this.mZx.setLayoutParams(layoutParams);
        this.mZx.setTextColor(-1);
        this.mZx.setTextSize(16.0f);
        this.mZx.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(tr.mZx(hu.EYQ(), 6.0f));
        this.mZx.setBackgroundDrawable(gradientDrawable);
        addView(this.mZx);
    }

    public void EYQ(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.EYQ.removeCallbacksAndMessages(null);
        this.EYQ.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mZx != null) {
                    TTAdDislikeToast.this.mZx.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.EYQ.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public void mZx() {
        setVisibility(8);
        this.EYQ.removeCallbacksAndMessages(null);
    }

    public void Td() {
        setVisibility(8);
        this.EYQ.removeCallbacksAndMessages(null);
    }
}
