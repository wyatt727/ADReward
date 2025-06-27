package com.bytedance.sdk.component.EYQ;

import android.webkit.WebView;
import com.bytedance.sdk.component.EYQ.Pm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsBridge2.java */
/* loaded from: classes2.dex */
public class UB {
    static XN EYQ;
    private volatile boolean IPb;
    private final List<nWX> Kbd;
    private final tp Pm;
    private final WebView Td;
    private final EYQ mZx;

    public static tp EYQ(WebView webView) {
        return new tp(webView);
    }

    public UB EYQ(String str, Kbd<?, ?> kbd) {
        return EYQ(str, (String) null, kbd);
    }

    public UB EYQ(String str, String str2, Kbd<?, ?> kbd) {
        mZx();
        this.mZx.VwS.EYQ(str, kbd);
        return this;
    }

    public UB EYQ(String str, Pm.mZx mzx) {
        return EYQ(str, (String) null, mzx);
    }

    public UB EYQ(String str, String str2, Pm.mZx mzx) {
        mZx();
        this.mZx.VwS.EYQ(str, mzx);
        return this;
    }

    public void EYQ() {
        if (this.IPb) {
            return;
        }
        this.mZx.mZx();
        this.IPb = true;
        Iterator<nWX> it = this.Kbd.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    UB(tp tpVar) {
        ArrayList arrayList = new ArrayList();
        this.Kbd = arrayList;
        this.IPb = false;
        this.Pm = tpVar;
        if (tpVar.QQ && EYQ != null) {
            throw null;
        }
        if (tpVar.EYQ != null && tpVar.mZx == null) {
            this.mZx = new wBa();
        } else {
            this.mZx = tpVar.mZx;
        }
        this.mZx.EYQ(tpVar, (WU) null);
        this.Td = tpVar.EYQ;
        arrayList.add(tpVar.tp);
        tPj.EYQ(tpVar.VwS);
    }

    private void mZx() {
        if (this.IPb) {
            HX.EYQ(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
