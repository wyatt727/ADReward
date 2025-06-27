package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes4.dex */
class y extends EditText {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f4413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(B b, Context context) {
        super(context);
        this.f4413a = b;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            B b = this.f4413a;
            b.a(b.b(), true);
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i != 66 || keyEvent.getAction() != 0 || (getInputType() & 131072) != 0) {
            return super.onKeyPreIme(i, keyEvent);
        }
        B b2 = this.f4413a;
        b2.a(b2.b(), false);
        return true;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        this.f4413a.b.reportSoftInputSelection(i, i2 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ((InputMethodManager) this.f4413a.f4328a.getSystemService("input_method")).showSoftInput(this, 0);
        }
    }
}
