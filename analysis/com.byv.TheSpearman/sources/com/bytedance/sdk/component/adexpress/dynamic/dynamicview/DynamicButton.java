package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;

/* loaded from: classes2.dex */
public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.KO = new AnimationButton(context);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        addView(this.KO, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx() && "fillButton".equals(this.pi.tp().mZx())) {
            ((TextView) this.KO).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.KO).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.tsL.Uc() * 2;
            widgetLayoutParams.height -= this.tsL.Uc() * 2;
            widgetLayoutParams.topMargin += this.tsL.Uc();
            widgetLayoutParams.leftMargin += this.tsL.Uc();
            if (Build.VERSION.SDK_INT >= 17) {
                widgetLayoutParams.setMarginStart(widgetLayoutParams.leftMargin);
                widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            }
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (TextUtils.equals("download-progress-button", this.pi.tp().mZx()) && TextUtils.isEmpty(this.tsL.tp())) {
            this.KO.setVisibility(4);
            return true;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.KO.setTextAlignment(this.tsL.QQ());
        }
        ((TextView) this.KO).setText(this.tsL.tp());
        ((TextView) this.KO).setTextColor(this.tsL.VwS());
        ((TextView) this.KO).setTextSize(this.tsL.Kbd());
        ((TextView) this.KO).setGravity(17);
        ((TextView) this.KO).setIncludeFontPadding(false);
        if ("fillButton".equals(this.pi.tp().mZx())) {
            this.KO.setPadding(0, 0, 0, 0);
        } else {
            this.KO.setPadding(this.tsL.Td(), this.tsL.mZx(), this.tsL.Pm(), this.tsL.EYQ());
        }
        return true;
    }
}
