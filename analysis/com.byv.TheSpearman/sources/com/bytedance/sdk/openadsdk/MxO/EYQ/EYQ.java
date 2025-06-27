package com.bytedance.sdk.openadsdk.MxO.EYQ;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.QQ;
import com.bytedance.sdk.openadsdk.IPb.Pm;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: GifLoader.java */
/* loaded from: classes2.dex */
public class EYQ {

    /* compiled from: GifLoader.java */
    /* renamed from: com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0104EYQ {
        void EYQ(int i, String str, Throwable th);

        void EYQ(String str, mZx mzx);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ eyq, final InterfaceC0104EYQ interfaceC0104EYQ, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, UB ub) {
        Pm.EYQ(eyq.EYQ).EYQ(eyq.mZx).EYQ(i).mZx(i2).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).mZx(str).EYQ(Bitmap.Config.RGB_565).EYQ(scaleType).EYQ(!TextUtils.isEmpty(str)).EYQ(new QQ() { // from class: com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ.2
            @Override // com.bytedance.sdk.component.Pm.QQ
            public Bitmap EYQ(Bitmap bitmap) {
                if (i3 <= 0) {
                    return bitmap;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(hu.EYQ(), bitmap, i3);
                }
                return null;
            }
        }).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, eyq.EYQ, new com.bytedance.sdk.component.Pm.hu() { // from class: com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ.1
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(MxO mxO) {
                EYQ.this.EYQ(mxO, interfaceC0104EYQ);
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i4, String str2, Throwable th) {
                EYQ.this.EYQ(i4, str2, th, interfaceC0104EYQ);
            }
        }));
    }

    protected void EYQ(MxO mxO, InterfaceC0104EYQ interfaceC0104EYQ) {
        if (interfaceC0104EYQ != null) {
            Object objMZx = mxO.mZx();
            int iEYQ = EYQ(mxO);
            if (objMZx instanceof byte[]) {
                interfaceC0104EYQ.EYQ(mxO.EYQ(), new mZx((byte[]) objMZx, iEYQ));
                return;
            }
            if (objMZx instanceof Bitmap) {
                interfaceC0104EYQ.EYQ(mxO.EYQ(), new mZx((Bitmap) objMZx, mxO.Td() instanceof Bitmap ? (Bitmap) mxO.Td() : null, iEYQ));
            } else {
                interfaceC0104EYQ.EYQ(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int EYQ(MxO mxO) {
        Object obj;
        Map<String, String> mapPm = mxO.Pm();
        if (mapPm == null || (obj = mapPm.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void EYQ(int i, String str, Throwable th, InterfaceC0104EYQ interfaceC0104EYQ) {
        if (interfaceC0104EYQ != null) {
            interfaceC0104EYQ.EYQ(i, str, th);
        }
    }
}
