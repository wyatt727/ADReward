package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContinueDownloadTask.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.sdk.component.VwS.QQ {
    private final List<? extends com.bytedance.sdk.component.VwS.QQ> EYQ;

    public mZx(String str, List<? extends com.bytedance.sdk.component.VwS.QQ> list) {
        super(str);
        this.EYQ = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.VwS.QQ> list;
        if (hu.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ()) != 0 && (list = this.EYQ) != null) {
            Iterator<? extends com.bytedance.sdk.component.VwS.QQ> it = list.iterator();
            while (it.hasNext()) {
                xt.EYQ(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.QQ.EYQ().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
