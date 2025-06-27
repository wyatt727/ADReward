package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.hu;
import com.bytedance.sdk.openadsdk.core.model.nWX;

/* compiled from: LandingPageLoadingStyle.java */
/* loaded from: classes2.dex */
public abstract class IPb {
    protected Context IPb;
    protected View Kbd;
    protected String[] Pm;
    protected String Td;
    protected hu VwS;
    protected final nWX mZx;

    protected abstract void EYQ();

    public abstract void EYQ(int i);

    public abstract void Td();

    public abstract void mZx();

    public IPb(Context context, String str, String[] strArr, nWX nwx, hu huVar) {
        this.Td = str;
        this.Pm = strArr;
        this.IPb = context;
        this.mZx = nwx;
        this.VwS = huVar;
        EYQ();
    }

    public View Kbd() {
        return this.Kbd;
    }

    public void Pm() {
        Td();
        this.Kbd = null;
        this.IPb = null;
    }
}
