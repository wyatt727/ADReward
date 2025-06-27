package com.json.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: classes4.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private s f2217a;
    private boolean b = false;

    r(s sVar) {
        this.f2217a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.f2217a.b();
    }
}
