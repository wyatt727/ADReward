package com.bytedance.sdk.component.EYQ;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.EYQ.MxO;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Environment.java */
/* loaded from: classes2.dex */
public class tp {
    WebView EYQ;
    pi HX;
    boolean IPb;
    boolean KO;
    Context Kbd;
    QQ Pm;
    boolean QQ;
    boolean VwS;
    MxO.EYQ hu;
    EYQ mZx;
    boolean nWX;
    nWX tp;
    String Td = "IESJSBridge";
    String MxO = "host";
    final Set<String> tsL = new LinkedHashSet();
    final Set<String> pi = new LinkedHashSet();

    tp(WebView webView) {
        this.EYQ = webView;
    }

    tp() {
    }

    public tp EYQ(EYQ eyq) {
        this.mZx = eyq;
        return this;
    }

    public tp EYQ(String str) {
        this.Td = str;
        return this;
    }

    public tp EYQ(tsL tsl) {
        this.Pm = QQ.EYQ(tsl);
        return this;
    }

    public tp EYQ(boolean z) {
        this.IPb = z;
        return this;
    }

    public tp mZx(boolean z) {
        this.VwS = z;
        return this;
    }

    public tp EYQ() {
        this.KO = true;
        return this;
    }

    public UB mZx() {
        Td();
        return new UB(this);
    }

    private void Td() {
        if ((this.EYQ == null && !this.nWX && this.mZx == null) || ((TextUtils.isEmpty(this.Td) && this.EYQ != null) || this.Pm == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
