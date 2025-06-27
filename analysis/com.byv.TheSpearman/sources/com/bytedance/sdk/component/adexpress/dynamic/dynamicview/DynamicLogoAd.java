package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.KO = new TextView(context);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        addView(this.KO, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (Build.VERSION.SDK_INT >= 17) {
            this.KO.setTextAlignment(this.tsL.QQ());
        }
        ((TextView) this.KO).setTextColor(this.tsL.VwS());
        ((TextView) this.KO).setTextSize(this.tsL.Kbd());
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            ((TextView) this.KO).setIncludeFontPadding(false);
            ((TextView) this.KO).setTextSize(Math.min(((IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.QQ) - this.tsL.mZx()) - this.tsL.EYQ()) - 0.5f, this.tsL.Kbd()));
            ((TextView) this.KO).setText(zF.EYQ(getContext(), "tt_logo_en"));
            return true;
        }
        if (EYQ()) {
            if (MxO.mZx()) {
                ((TextView) this.KO).setText(MxO.EYQ());
                return true;
            }
            ((TextView) this.KO).setText(MxO.EYQ(this.tsL.mZx));
            return true;
        }
        ((TextView) this.KO).setText(zF.mZx(getContext(), "tt_logo_cn"));
        return true;
    }

    private boolean EYQ() {
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.tsL.mZx) && this.tsL.mZx.contains("adx:")) || MxO.mZx();
    }
}
