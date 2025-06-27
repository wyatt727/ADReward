package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTPrivacyAdReportDialog.java */
/* loaded from: classes2.dex */
public class HX extends Dialog {
    private static final String[] mZx = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private final Handler EYQ;
    private ImageView IPb;
    private Button Kbd;
    private TextView Pm;
    private String Td;

    public HX(Context context) {
        super(context, zF.IPb(context, "tt_privacy_dialog_theme_ad_report"));
        this.EYQ = new Handler(Looper.getMainLooper());
        this.Td = "";
    }

    public void EYQ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.Td = com.bytedance.sdk.component.utils.EYQ.EYQ(new JSONObject(str)).toString();
        } catch (JSONException e) {
            pi.EYQ("TTPrivacyAdReportDialog", e.getMessage());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(EYQ(getContext()), new ViewGroup.LayoutParams(tr.Td(getContext()), (int) (tr.Pm(getContext()) * 0.9d)));
        mZx();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void mZx() {
        final String strKbd = FH.Kbd();
        final String strVwS = FH.VwS();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.Kbd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.HX.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) HX.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strKbd, strVwS, str, str2, HX.this.Td};
                    for (int i = 0; i < HX.mZx.length; i++) {
                        sb.append(HX.mZx[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.IPb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.HX.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HX.this.Pm.setText("loading ...");
                HX.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.EYQ.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.HX.3
                @Override // java.lang.Runnable
                public void run() {
                    HX.this.Pm.setText(HX.this.Td);
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private View EYQ(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(context, "tt_ad_report_info_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, EYQ(44.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(EYQ(191.0f), EYQ(24.0f));
        layoutParams2.addRule(13);
        pAGTextView.setGravity(17);
        pAGTextView.setText("Ad Report");
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(1, 17.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        this.IPb = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(EYQ(40.0f), EYQ(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = EYQ(8.0f);
        this.IPb.setPadding(EYQ(12.0f), EYQ(14.0f), EYQ(12.0f), EYQ(14.0f));
        this.IPb.setImageResource(zF.Pm(context, "tt_ad_xmark"));
        this.IPb.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, EYQ(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = EYQ(16.0f);
        layoutParams5.rightMargin = EYQ(16.0f);
        layoutParams5.weight = 1.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart(EYQ(16.0f));
            layoutParams5.setMarginEnd(EYQ(16.0f));
        }
        scrollView.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        String strKbd = FH.Kbd();
        String strVwS = FH.VwS();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        PAGLinearLayout pAGLinearLayoutEYQ = EYQ(context, "SDK version", BuildConfig.VERSION_NAME);
        PAGLinearLayout pAGLinearLayoutEYQ2 = EYQ(context, "App", strKbd);
        PAGLinearLayout pAGLinearLayoutEYQ3 = EYQ(context, "App version", strVwS);
        PAGLinearLayout pAGLinearLayoutEYQ4 = EYQ(context, "OS", str);
        PAGLinearLayout pAGLinearLayoutEYQ5 = EYQ(context, "Device", str2);
        PAGLinearLayout pAGLinearLayoutEYQ6 = EYQ(context, "Creative info", "loading ...");
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, EYQ(76.0f));
        pAGLinearLayout3.setBackgroundColor(Color.parseColor("#ffffff"));
        pAGLinearLayout3.setLayoutParams(layoutParams7);
        this.Kbd = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iEYQ = EYQ(16.0f);
        layoutParams8.setMargins(iEYQ, iEYQ, iEYQ, iEYQ);
        this.Kbd.setBackground(zF.Td(context, "tt_ad_report_info_button_bg"));
        this.Kbd.setText("copy all");
        this.Kbd.setTextColor(Color.parseColor("#333333"));
        this.Kbd.setTextSize(14.0f);
        this.Kbd.setLayoutParams(layoutParams8);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.IPb);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(scrollView);
        scrollView.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ2);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ3);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ4);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ5);
        pAGLinearLayout2.addView(pAGLinearLayoutEYQ6);
        pAGLinearLayout.addView(pAGLinearLayout3);
        pAGLinearLayout3.addView(this.Kbd);
        return pAGLinearLayout;
    }

    private PAGLinearLayout EYQ(Context context, String str, String str2) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : EYQ(74.0f));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(0, EYQ(16.0f), 0, EYQ(16.0f));
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = EYQ(7.0f);
        pAGTextView.setIncludeFontPadding(false);
        pAGTextView.setText(str);
        pAGTextView.setTextColor(Color.parseColor("#333333"));
        pAGTextView.setTextSize(16.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        if (str.equals("Creative info")) {
            this.Pm = pAGTextView2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        pAGTextView2.setIncludeFontPadding(false);
        pAGTextView2.setTextColor(Color.parseColor("#666666"));
        pAGTextView2.setText(str2);
        pAGTextView2.setTextSize(14.0f);
        pAGTextView2.setLayoutParams(layoutParams3);
        pAGLinearLayout.addView(pAGTextView2);
        return pAGLinearLayout;
    }

    private int EYQ(float f) {
        return tr.mZx(getContext(), f);
    }
}
