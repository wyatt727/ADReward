package com.bytedance.sdk.openadsdk.dislike;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGEditText;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.ArrayList;

/* compiled from: TTDislikeSuggestionDialog.java */
/* loaded from: classes2.dex */
public class Kbd extends Dialog {
    private PAGLinearLayout EYQ;
    private PAGImageView IPb;
    private PAGTextView Kbd;
    private PAGTextView Pm;
    private String QQ;
    private PAGEditText Td;
    private String VwS;
    private EYQ mZx;

    /* compiled from: TTDislikeSuggestionDialog.java */
    public interface EYQ {
        void EYQ();

        void EYQ(int i, FilterWord filterWord);

        void Td();

        void mZx();
    }

    public Kbd(Context context) {
        super(context, zF.IPb(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PAGLinearLayout pAGLinearLayoutEYQ = EYQ(hu.EYQ());
        this.EYQ = pAGLinearLayoutEYQ;
        setContentView(pAGLinearLayoutEYQ);
        EYQ(this.EYQ);
        Td();
        EYQ();
        Pm();
    }

    private void EYQ(View view) {
        EYQ((EditText) this.Td);
        this.Kbd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Kbd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = Kbd.this.Td.getText().toString();
                if (string.length() <= 0 || string.isEmpty()) {
                    return;
                }
                FilterWord filterWord = new FilterWord("0:00", string);
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                com.bytedance.sdk.openadsdk.dislike.EYQ.EYQ().EYQ(Kbd.this.VwS, arrayList, Kbd.this.QQ, string);
                if (Kbd.this.mZx != null) {
                    Kbd.this.mZx.EYQ(4, filterWord);
                }
                Kbd.this.dismiss();
            }
        });
        this.IPb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Kbd.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (Kbd.this.mZx != null) {
                    Kbd.this.mZx.mZx();
                }
                Kbd.this.dismiss();
            }
        });
        this.Td.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.dislike.Kbd.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int iRound = Math.round(charSequence.length());
                Kbd.this.Pm.setText(String.valueOf(iRound));
                if (iRound > 0) {
                    Kbd.this.Kbd.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    Kbd.this.Kbd.setClickable(true);
                } else {
                    Kbd.this.Kbd.setTextColor(-7829368);
                    Kbd.this.Kbd.setClickable(false);
                }
            }
        });
    }

    public static void EYQ(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.dislike.Kbd.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(500)});
    }

    private void Td() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        EYQ eyq = this.mZx;
        if (eyq != null) {
            eyq.EYQ();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        mZx();
        super.dismiss();
    }

    public void EYQ(EYQ eyq) {
        this.mZx = eyq;
    }

    public void EYQ() {
        PAGEditText pAGEditText = this.Td;
        if (pAGEditText == null) {
            return;
        }
        pAGEditText.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void mZx() {
        InputMethodManager inputMethodManager;
        PAGEditText pAGEditText = this.Td;
        if (pAGEditText == null || (inputMethodManager = (InputMethodManager) pAGEditText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.EYQ.getWindowToken(), 0);
    }

    private void Pm() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.dislike.Kbd.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (Kbd.this.mZx != null) {
                    Kbd.this.mZx.Td();
                }
            }
        });
    }

    public void EYQ(String str, String str2) {
        this.VwS = str;
        this.QQ = str2;
    }

    private PAGLinearLayout EYQ(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackground(VwS.EYQ(context, "tt_dislike_dialog_bg"));
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, tr.mZx(context, 48.0f)));
        this.IPb = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(16);
        layoutParams.topMargin = tr.mZx(context, 12.0f);
        layoutParams.leftMargin = tr.mZx(context, 12.0f);
        this.IPb.setLayoutParams(layoutParams);
        this.IPb.setClickable(true);
        this.IPb.setFocusable(true);
        this.IPb.setImageResource(zF.Pm(context, "tt_titlebar_close_seletor"));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = tr.mZx(context, 12.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView.setGravity(17);
        pAGTextView.setSingleLine(true);
        pAGTextView.setText(zF.EYQ(context, "tt_display_error"));
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(15.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(0));
        this.Kbd = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(16);
        layoutParams3.topMargin = tr.mZx(context, 12.0f);
        layoutParams3.leftMargin = tr.mZx(context, 5.0f);
        layoutParams3.rightMargin = tr.mZx(context, 12.0f);
        this.Kbd.setLayoutParams(layoutParams3);
        this.Kbd.setPadding(0, 0, tr.mZx(context, 12.0f), 0);
        this.Kbd.setTextSize(14.0f);
        this.Kbd.setTextColor(-7829368);
        this.Kbd.setClickable(false);
        this.Kbd.setVisibility(0);
        this.Kbd.setGravity(5);
        this.Kbd.setSingleLine(true);
        this.Kbd.setText(zF.EYQ(context, "tt_suggestion_commit"));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, tr.mZx(context, 0.5f)));
        view.setBackgroundColor(Color.parseColor("#0F161823"));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        pAGLinearLayout2.setOrientation(0);
        this.Td = new PAGEditText(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 15.0f;
        layoutParams4.leftMargin = tr.mZx(context, 12.0f);
        layoutParams4.topMargin = tr.mZx(context, 11.5f);
        this.Td.setLayoutParams(layoutParams4);
        this.Td.setLines(7);
        this.Td.setHint(zF.EYQ(context, "tt_suggestion_description"));
        this.Td.setGravity(3);
        this.Td.setTextSize(15.0f);
        this.Td.setTextColor(Color.parseColor("#161823"));
        this.Td.setHintTextColor(Color.parseColor("#57161823"));
        this.Td.setBackground(null);
        this.Td.setImeOptions(268435456);
        this.Pm = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.rightMargin = tr.mZx(context, 12.0f);
        layoutParams5.bottomMargin = tr.mZx(context, 6.0f);
        layoutParams5.gravity = 80;
        this.Pm.setLayoutParams(layoutParams5);
        this.Pm.setText("0");
        this.Pm.setGravity(5);
        this.Pm.setTextColor(Color.parseColor("#BF161823"));
        this.Pm.setHintTextColor(Color.parseColor("#57161823"));
        this.Pm.setTextSize(12.0f);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGRelativeLayout.addView(this.IPb);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.Kbd);
        pAGLinearLayout2.addView(this.Td);
        pAGLinearLayout2.addView(this.Pm);
        return pAGLinearLayout;
    }
}
