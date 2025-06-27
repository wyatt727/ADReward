package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ;

/* compiled from: ImageBytesHelper.java */
/* loaded from: classes2.dex */
public class MxO {

    /* compiled from: ImageBytesHelper.java */
    public interface EYQ {
        void EYQ();

        void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx);
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ eyq, int i, int i2, EYQ eyq2, String str) {
        EYQ(eyq, i, i2, eyq2, str, 0);
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ eyq, int i, int i2, final EYQ eyq2, String str, int i3) {
        com.bytedance.sdk.component.utils.pi.EYQ("splashLoadAd", " getImageBytes url ".concat(String.valueOf(eyq)));
        com.bytedance.sdk.openadsdk.MxO.Td.EYQ().Td().EYQ(eyq, new EYQ.InterfaceC0104EYQ() { // from class: com.bytedance.sdk.openadsdk.utils.MxO.1
            @Override // com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ.InterfaceC0104EYQ
            public void EYQ(String str2, com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx) {
                EYQ eyq3;
                if (mzx.Pm() && (eyq3 = eyq2) != null) {
                    eyq3.EYQ(mzx);
                    return;
                }
                EYQ eyq4 = eyq2;
                if (eyq4 != null) {
                    eyq4.EYQ();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.MxO.EYQ.EYQ.InterfaceC0104EYQ
            public void EYQ(int i4, String str2, Throwable th) {
                EYQ eyq3 = eyq2;
                if (eyq3 != null) {
                    eyq3.EYQ();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable EYQ(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
