package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGAppOpenThreeLayout extends PAGAppOpenOneLayout {
    public PAGAppOpenThreeLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout
    public View EYQ(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, tr.mZx(context, 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = tr.mZx(context, 60.0f);
        pAGLinearLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.setOrientation(0);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = tr.mZx(context, 53.0f);
        view.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = tr.mZx(context, 47.0f);
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        this.Kbd = new ButtonFlash(context);
        this.Kbd.setId(520093717);
        this.Kbd.setLayoutParams(new LinearLayout.LayoutParams(tr.mZx(context, 236.0f), tr.mZx(context, 48.0f)));
        this.Kbd.setBackground(zF.Td(context, "tt_button_back"));
        this.Kbd.setEllipsize(TextUtils.TruncateAt.END);
        this.Kbd.setGravity(17);
        this.Kbd.setLines(1);
        this.Kbd.setText(zF.mZx(context, "tt_video_download_apk"));
        this.Kbd.setTextColor(Color.parseColor("#FFFFFF"));
        this.Kbd.setTextSize(1, 16.0f);
        this.Kbd.setTag("open_ad_click_button_tag");
        pAGLinearLayout2.addView(this.Kbd);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        return pAGLinearLayout;
    }
}
