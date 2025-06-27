package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes4.dex */
public class B extends Dialog implements View.OnClickListener, TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private Context f4328a;
    private UnityPlayer b;
    private boolean c;
    public boolean d;

    public B(Context context, UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        super(context);
        this.f4328a = null;
        this.b = null;
        this.f4328a = context;
        this.b = unityPlayer;
        Window window = getWindow();
        this.d = z6;
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewCreateSoftInputView = createSoftInputView();
        setContentView(viewCreateSoftInputView);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        window.clearFlags(com.google.android.exoplayer2.C.BUFFER_FLAG_FIRST_SAMPLE);
        window.clearFlags(67108864);
        if (!this.d) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        EditText editText = (EditText) findViewById(A.b);
        Button button = (Button) findViewById(A.f4326a);
        a(editText, str, i, z, z2, z3, str2, i2);
        button.setOnClickListener(this);
        editText.getCurrentTextColor();
        a(z5);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new x(this, viewCreateSoftInputView));
        getWindow().setSoftInputMode(5);
        editText.requestFocus();
    }

    private void a(EditText editText, String str, int i, boolean z, boolean z2, boolean z3, String str2, int i2) {
        editText.setBackgroundColor(-1);
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(1627389952);
        int i3 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i >= 0 && i <= 11) {
            int[] iArr = {1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194};
            i3 = (iArr[i] & 2) != 0 ? iArr[i] : i3 | iArr[i];
        }
        editText.setInputType(i3);
        editText.setImeOptions(33554432);
        if (i2 > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        }
        editText.addTextChangedListener(this);
        editText.setSelection(editText.getText().length());
        editText.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        ((EditText) findViewById(A.b)).setSelection(0, 0);
        this.b.reportSoftInputStr(str, 1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        EditText editText = (EditText) findViewById(A.b);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public String a() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.f4328a.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (locale != null && !locale.equals("")) {
            return locale;
        }
        return currentInputMethodSubtype.getMode() + " " + currentInputMethodSubtype.getExtraValue();
    }

    public void a(int i) {
        EditText editText = (EditText) findViewById(A.b);
        if (editText != null) {
            if (i > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    public void a(int i, int i2) {
        int i3;
        EditText editText = (EditText) findViewById(A.b);
        if (editText == null || editText.getText().length() < (i3 = i2 + i)) {
            return;
        }
        editText.setSelection(i, i3);
    }

    public void a(String str) {
        EditText editText = (EditText) findViewById(A.b);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    public void a(boolean z) {
        this.c = z;
        EditText editText = (EditText) findViewById(A.b);
        Button button = (Button) findViewById(A.f4326a);
        View viewFindViewById = findViewById(A.c);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            layoutParams.height = 1;
            editText.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.height = 1;
            button.setLayoutParams(layoutParams2);
            viewFindViewById.setPadding(0, 0, 0, 0);
            viewFindViewById.setVisibility(4);
            return;
        }
        viewFindViewById.setVisibility(0);
        viewFindViewById.setPadding(16, 16, 16, 16);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) editText.getLayoutParams();
        layoutParams3.height = -2;
        editText.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) button.getLayoutParams();
        layoutParams4.height = -2;
        button.setLayoutParams(layoutParams4);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.b.reportSoftInputStr(editable.toString(), 0, false);
        EditText editText = (EditText) findViewById(A.b);
        int selectionStart = editText.getSelectionStart();
        this.b.reportSoftInputSelection(selectionStart, editText.getSelectionEnd() - selectionStart);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    protected View createSoftInputView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f4328a);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setId(A.c);
        y yVar = new y(this, this.f4328a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        int i = A.f4326a;
        layoutParams.addRule(0, i);
        yVar.setLayoutParams(layoutParams);
        int i2 = A.b;
        yVar.setId(i2);
        relativeLayout.addView(yVar);
        Button button = new Button(this.f4328a);
        button.setText(this.f4328a.getResources().getIdentifier("ok", TypedValues.Custom.S_STRING, "android"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        button.setLayoutParams(layoutParams2);
        button.setId(i);
        button.setBackgroundColor(0);
        relativeLayout.addView(button);
        ((EditText) relativeLayout.findViewById(i2)).setOnEditorActionListener(new z(this));
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d || !(motionEvent.getAction() == 4 || this.c)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        a(b(), true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a(b(), false);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
