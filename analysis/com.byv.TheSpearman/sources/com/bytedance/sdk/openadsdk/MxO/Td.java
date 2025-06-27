package com.bytedance.sdk.openadsdk.MxO;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.IPb.EYQ;
import com.bytedance.sdk.component.mZx.EYQ.Pm;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.concurrent.TimeUnit;

/* compiled from: TTNetClient.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td EYQ;
    private com.bytedance.sdk.openadsdk.MxO.EYQ.Td Pm;
    private final com.bytedance.sdk.component.IPb.EYQ Td;
    private final Context mZx;

    public static Td EYQ() {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td(hu.EYQ());
                }
            }
        }
        return EYQ;
    }

    private Td(Context context) {
        this.mZx = context == null ? hu.EYQ() : context.getApplicationContext();
        com.bytedance.sdk.component.IPb.EYQ EYQ2 = new EYQ.C0080EYQ().EYQ(10000L, TimeUnit.MILLISECONDS).mZx(10000L, TimeUnit.MILLISECONDS).Td(10000L, TimeUnit.MILLISECONDS).EYQ(true).EYQ();
        this.Td = EYQ2;
        Pm pmEYQ = EYQ2.Kbd().EYQ();
        if (pmEYQ != null) {
            pmEYQ.EYQ(32);
        }
    }

    public com.bytedance.sdk.component.IPb.EYQ mZx() {
        return this.Td;
    }

    public com.bytedance.sdk.openadsdk.MxO.EYQ.Td Td() {
        Pm();
        return this.Pm;
    }

    public void EYQ(String str, int i, int i2, ImageView imageView, UB ub) {
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(str).EYQ(i).mZx(i2).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(ub, str, imageView));
    }

    public void EYQ(int i, final ImageView imageView, final UB ub) {
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(ub.Kbd()).EYQ(i).mZx(i).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(ub, ub.Kbd(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.MxO.Td.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String strIPb = ub.IPb();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(strIPb));
                        try {
                            com.bytedance.sdk.component.utils.mZx.EYQ(hu.EYQ(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void EYQ(nWX nwx, ImageView imageView, UB ub) {
        if (nwx == null || TextUtils.isEmpty(nwx.EYQ()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(nwx).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(ub, nwx.EYQ(), imageView));
    }

    private void Pm() {
        if (this.Pm == null) {
            this.Pm = new com.bytedance.sdk.openadsdk.MxO.EYQ.Td();
        }
    }
}
