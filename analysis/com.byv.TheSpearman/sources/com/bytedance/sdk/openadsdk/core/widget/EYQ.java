package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.customview.PAGButton;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: CustomCommonDialog.java */
/* loaded from: classes2.dex */
public class EYQ extends Dialog {
    public InterfaceC0130EYQ EYQ;
    private String HX;
    private PAGButton IPb;
    private PAGButton Kbd;
    private String MxO;
    private PAGTextView Pm;
    private final Context QQ;
    private PAGTextView Td;
    private View VwS;
    private PAGImageView mZx;
    private boolean nWX;
    private int pi;
    private String tp;
    private String tsL;

    /* compiled from: CustomCommonDialog.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0130EYQ {
        void EYQ();

        void mZx();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public EYQ(Context context) {
        super(context, zF.IPb(context, "tt_custom_dialog"));
        this.pi = -1;
        this.nWX = false;
        this.QQ = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(EYQ(this.QQ));
        setCanceledOnTouchOutside(false);
        mZx();
        EYQ();
    }

    private void EYQ() {
        this.IPb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.EYQ.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.EYQ();
                }
            }
        });
        this.Kbd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.EYQ.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EYQ.this.EYQ != null) {
                    EYQ.this.EYQ.mZx();
                }
            }
        });
    }

    private void mZx() {
        if (!TextUtils.isEmpty(this.tp)) {
            this.Td.setText(this.tp);
            this.Td.setVisibility(0);
        } else {
            this.Td.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.HX)) {
            this.Pm.setText(this.HX);
        }
        if (!TextUtils.isEmpty(this.MxO)) {
            this.IPb.setText(this.MxO);
        } else {
            this.IPb.setText(zF.EYQ(hu.EYQ(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.tsL)) {
            this.Kbd.setText(this.tsL);
        } else {
            this.Kbd.setText(zF.EYQ(hu.EYQ(), "tt_negtive_txt"));
        }
        int i = this.pi;
        if (i != -1) {
            this.mZx.setImageResource(i);
            this.mZx.setVisibility(0);
        } else {
            this.mZx.setVisibility(8);
        }
        if (this.nWX) {
            this.VwS.setVisibility(8);
            this.Kbd.setVisibility(8);
        } else {
            this.Kbd.setVisibility(0);
            this.VwS.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        mZx();
    }

    private View EYQ(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        pAGLinearLayout.setMinimumWidth(EYQ(260.0f));
        pAGLinearLayout.setPadding(0, EYQ(32.0f), 0, 0);
        pAGLinearLayout.setBackground(VwS.EYQ(context, "tt_custom_dialog_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        this.Td = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = EYQ(16.0f);
        layoutParams2.rightMargin = EYQ(16.0f);
        layoutParams2.bottomMargin = EYQ(16.0f);
        this.Td.setGravity(17);
        this.Td.setVisibility(0);
        this.Td.setTextColor(Color.parseColor("#333333"));
        this.Td.setTextSize(18.0f);
        this.Td.setLayoutParams(layoutParams2);
        this.mZx = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = EYQ(16.0f);
        layoutParams3.rightMargin = EYQ(16.0f);
        layoutParams3.bottomMargin = EYQ(10.0f);
        this.mZx.setMaxHeight(EYQ(150.0f));
        this.mZx.setMaxWidth(EYQ(150.0f));
        this.mZx.setVisibility(0);
        this.mZx.setLayoutParams(layoutParams3);
        this.Pm = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = EYQ(20.0f);
        layoutParams4.rightMargin = EYQ(20.0f);
        this.Pm.setGravity(17);
        this.Pm.setLineSpacing(EYQ(3.0f), 1.2f);
        this.Pm.setTextSize(18.0f);
        this.Pm.setTextColor(Color.parseColor("#000000"));
        this.Pm.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = EYQ(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        PAGButton pAGButton = new PAGButton(context);
        this.Kbd = pAGButton;
        pAGButton.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = EYQ(10.0f);
        layoutParams7.weight = 1.0f;
        this.Kbd.setPadding(0, EYQ(16.0f), 0, EYQ(16.0f));
        this.Kbd.setBackground(null);
        this.Kbd.setGravity(17);
        this.Kbd.setSingleLine(true);
        this.Kbd.setTextColor(Color.parseColor("#999999"));
        this.Kbd.setTextSize(16.0f);
        this.Kbd.setLayoutParams(layoutParams7);
        this.VwS = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.VwS.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.VwS.setLayoutParams(layoutParams8);
        this.IPb = new PAGButton(context);
        this.Kbd.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = EYQ(10.0f);
        layoutParams9.weight = 1.0f;
        this.IPb.setPadding(0, EYQ(16.0f), 0, EYQ(16.0f));
        this.IPb.setBackground(null);
        this.IPb.setGravity(17);
        this.IPb.setSingleLine(true);
        this.IPb.setTextColor(Color.parseColor("#38ADFF"));
        this.IPb.setTextSize(16.0f);
        this.IPb.setLayoutParams(layoutParams9);
        pAGRelativeLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.Td);
        pAGLinearLayout.addView(this.mZx);
        pAGLinearLayout.addView(this.Pm);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.Kbd);
        pAGLinearLayout2.addView(this.VwS);
        pAGLinearLayout2.addView(this.IPb);
        return pAGRelativeLayout;
    }

    private int EYQ(float f) {
        return tr.mZx(getContext(), f);
    }

    public EYQ EYQ(InterfaceC0130EYQ interfaceC0130EYQ) {
        this.EYQ = interfaceC0130EYQ;
        return this;
    }

    public EYQ EYQ(String str) {
        this.HX = str;
        return this;
    }

    public EYQ mZx(String str) {
        this.MxO = str;
        return this;
    }

    public EYQ Td(String str) {
        this.tsL = str;
        return this;
    }
}
