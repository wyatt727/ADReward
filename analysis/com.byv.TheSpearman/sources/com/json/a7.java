package com.json;

import android.webkit.JavascriptInterface;

/* loaded from: classes4.dex */
public class a7 {

    /* renamed from: a, reason: collision with root package name */
    private d7 f1697a;

    a7(d7 d7Var) {
        this.f1697a = d7Var;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f1697a.handleMessageFromAd(str);
    }
}
