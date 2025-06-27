package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes4.dex */
class z implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f4414a;

    z(B b) {
        this.f4414a = b;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            B b = this.f4414a;
            b.a(b.b(), false);
        }
        return false;
    }
}
