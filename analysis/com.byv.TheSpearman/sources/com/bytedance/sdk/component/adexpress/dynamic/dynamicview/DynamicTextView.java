package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.QQ += 6;
        if (this.tsL.Kbc()) {
            this.KO = new AnimationText(context, this.tsL.VwS(), this.tsL.Kbd(), 1, this.tsL.QQ());
            ((AnimationText) this.KO).setMaxLines(1);
        } else {
            this.KO = new TextView(context);
            ((TextView) this.KO).setIncludeFontPadding(false);
        }
        this.KO.setTag(Integer.valueOf(getClickArea()));
        addView(this.KO, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() throws NumberFormatException {
        int i;
        super.HX();
        if (TextUtils.isEmpty(getText())) {
            this.KO.setVisibility(4);
            return true;
        }
        if (this.tsL.Kbc()) {
            MxO();
            return true;
        }
        ((TextView) this.KO).setText(this.tsL.IPb());
        if (Build.VERSION.SDK_INT >= 17) {
            ((TextView) this.KO).setTextDirection(5);
            this.KO.setTextAlignment(this.tsL.QQ());
        }
        ((TextView) this.KO).setTextColor(this.tsL.VwS());
        ((TextView) this.KO).setTextSize(this.tsL.Kbd());
        if (!this.tsL.XN()) {
            ((TextView) this.KO).setMaxLines(1);
            ((TextView) this.KO).setGravity(17);
            ((TextView) this.KO).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int iNZ = this.tsL.NZ();
            if (iNZ > 0) {
                ((TextView) this.KO).setLines(iNZ);
                ((TextView) this.KO).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (this.pi != null && this.pi.tp() != null) {
            if (com.bytedance.sdk.component.adexpress.Pm.mZx() && EYQ() && (TextUtils.equals(this.pi.tp().mZx(), "text_star") || TextUtils.equals(this.pi.tp().mZx(), "score-count") || TextUtils.equals(this.pi.tp().mZx(), "score-count-type-1") || TextUtils.equals(this.pi.tp().mZx(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.pi.tp().mZx(), "score-count") || TextUtils.equals(this.pi.tp().mZx(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0) {
                        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                            setVisibility(8);
                            return true;
                        }
                        this.KO.setVisibility(0);
                    }
                    if (TextUtils.equals(this.pi.tp().mZx(), "score-count-type-2")) {
                        ((TextView) this.KO).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                        ((TextView) this.KO).setGravity(17);
                        return true;
                    }
                    EYQ((TextView) this.KO, i, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (TextUtils.equals(this.pi.tp().mZx(), "text_star")) {
                double d = -1.0d;
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception e) {
                    pi.EYQ("DynamicStarView applyNativeStyle", e.toString());
                }
                if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                        setVisibility(8);
                        return true;
                    }
                    this.KO.setVisibility(0);
                }
                ((TextView) this.KO).setIncludeFontPadding(false);
                ((TextView) this.KO).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.pi.tp().mZx())) {
                ((TextView) this.KO).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.pi.tp().mZx(), "development-name")) {
                ((TextView) this.KO).setText(zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.pi.tp().mZx(), "app-version")) {
                ((TextView) this.KO).setText(zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.KO).setText(getText());
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.KO.setTextAlignment(this.tsL.QQ());
                ((TextView) this.KO).setGravity(this.tsL.HX());
            }
            if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                tp();
            }
        }
        return true;
    }

    private boolean EYQ() {
        return (this.nWX == null || this.nWX.getRenderRequest() == null || this.nWX.getRenderRequest().tp() == 4) ? false : true;
    }

    private void tp() {
        int iEYQ;
        if (TextUtils.equals(this.pi.tp().mZx(), FirebaseAnalytics.Param.SOURCE) || TextUtils.equals(this.pi.tp().mZx(), "title") || TextUtils.equals(this.pi.tp().mZx(), "text_star")) {
            int[] iArrMZx = MxO.mZx(this.tsL.IPb(), this.tsL.Kbd(), true);
            int iEYQ2 = (int) IPb.EYQ(getContext(), this.tsL.mZx());
            int iEYQ3 = (int) IPb.EYQ(getContext(), this.tsL.Td());
            int iEYQ4 = (int) IPb.EYQ(getContext(), this.tsL.Pm());
            int iEYQ5 = (int) IPb.EYQ(getContext(), this.tsL.EYQ());
            int iMin = Math.min(iEYQ2, iEYQ5);
            if (TextUtils.equals(this.pi.tp().mZx(), FirebaseAnalytics.Param.SOURCE) && (iEYQ = ((this.QQ - ((int) IPb.EYQ(getContext(), this.tsL.Kbd()))) - iEYQ2) - iEYQ5) > 1 && iEYQ <= iMin * 2) {
                int i = iEYQ / 2;
                this.KO.setPadding(iEYQ3, iEYQ2 - i, iEYQ4, iEYQ5 - (iEYQ - i));
                return;
            }
            int i2 = (((iArrMZx[1] + iEYQ2) + iEYQ5) - this.QQ) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= iMin * 2) {
                int i3 = i2 / 2;
                this.KO.setPadding(iEYQ3, iEYQ2 - i3, iEYQ4, iEYQ5 - (i2 - i3));
            } else if (i2 > iEYQ2 + iEYQ5) {
                final int i4 = (i2 - iEYQ2) - iEYQ5;
                this.KO.setPadding(iEYQ3, 0, iEYQ4, 0);
                if (i4 <= ((int) IPb.EYQ(getContext(), 1.0f)) + 1) {
                    ((TextView) this.KO).setTextSize(this.tsL.Kbd() - 1.0f);
                } else if (i4 <= (((int) IPb.EYQ(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.KO).setTextSize(this.tsL.Kbd() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = DynamicTextView.this.KO.getLayoutParams();
                                layoutParams.height = DynamicTextView.this.QQ + i4;
                                DynamicTextView.this.KO.setLayoutParams(layoutParams);
                                DynamicTextView.this.KO.setTranslationY(-i4);
                                ViewGroup viewGroup = (ViewGroup) DynamicTextView.this.KO.getParent();
                                viewGroup.setClipChildren(false);
                                ViewGroup viewGroup2 = (ViewGroup) DynamicTextView.this.KO.getParent().getParent();
                                viewGroup2.setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iEYQ2 > iEYQ5) {
                this.KO.setPadding(iEYQ3, iEYQ2 - (i2 - iMin), iEYQ4, iEYQ5 - iMin);
            } else {
                this.KO.setPadding(iEYQ3, iEYQ2 - iMin, iEYQ4, iEYQ5 - (i2 - iMin));
            }
        }
        if (!TextUtils.equals(this.pi.tp().mZx(), "fillButton") || Build.VERSION.SDK_INT < 17) {
            return;
        }
        this.KO.setTextAlignment(2);
        ((TextView) this.KO).setGravity(17);
    }

    public String getText() {
        String strIPb = this.tsL.IPb();
        if (TextUtils.isEmpty(strIPb)) {
            if (!com.bytedance.sdk.component.adexpress.Pm.mZx() && TextUtils.equals(this.pi.tp().mZx(), "text_star")) {
                strIPb = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.Pm.mZx() && TextUtils.equals(this.pi.tp().mZx(), "score-count")) {
                strIPb = "6870";
            }
        }
        return (TextUtils.equals(this.pi.tp().mZx(), "title") || TextUtils.equals(this.pi.tp().mZx(), "subtitle")) ? strIPb.replace("\n", "") : strIPb;
    }

    public void EYQ(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(zF.EYQ(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void MxO() {
        if (this.KO instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((AnimationText) this.KO).setMaxLines(1);
            ((AnimationText) this.KO).setTextColor(this.tsL.VwS());
            ((AnimationText) this.KO).setTextSize(this.tsL.Kbd());
            ((AnimationText) this.KO).setAnimationText(arrayList);
            ((AnimationText) this.KO).setAnimationType(this.tsL.vD());
            ((AnimationText) this.KO).setAnimationDuration(this.tsL.Pf() * 1000);
            ((AnimationText) this.KO).EYQ();
        }
    }
}
