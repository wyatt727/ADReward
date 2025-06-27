package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.EYQ;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.QQ;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.openadsdk.IPb.Pm;
import com.bytedance.sdk.openadsdk.core.widget.GifView;

/* compiled from: ImageLoaderProvider.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.adsdk.ugeno.EYQ {
    @Override // com.bytedance.adsdk.ugeno.EYQ
    public void EYQ(Context context, String str, ImageView imageView) {
        if (imageView instanceof GifView) {
            final GifView gifView = (GifView) imageView;
            gifView.setAdjustViewBounds(true);
            gifView.setBackgroundColor(Color.parseColor("#00000000"));
            Pm.EYQ(str).Td(3).EYQ(Bitmap.Config.RGB_565).EYQ(new hu() { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.1
                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(int i, String str2, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(MxO mxO) {
                    try {
                        Object objMZx = mxO.mZx();
                        if (objMZx instanceof byte[]) {
                            if (mxO.Kbd()) {
                                gifView.EYQ((byte[]) objMZx, false);
                                gifView.setRepeatConfig(true);
                            } else {
                                gifView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.MxO.EYQ((byte[]) objMZx, 0));
                            }
                        }
                    } catch (Throwable th) {
                        EYQ(1002, "", th);
                    }
                }
            });
            return;
        }
        Pm.EYQ(str).EYQ(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.EYQ
    public void EYQ(final Context context, String str, final float f, final EYQ.InterfaceC0074EYQ interfaceC0074EYQ) {
        Pm.EYQ(str).EYQ(new QQ() { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.3
            @Override // com.bytedance.sdk.component.Pm.QQ
            public Bitmap EYQ(Bitmap bitmap) {
                float f2 = f;
                if (f2 > 0.0f) {
                    return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(context, bitmap, (int) f2);
                }
                return null;
            }
        }).EYQ(new hu() { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.2
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(MxO mxO) {
                Object objMZx = mxO.mZx();
                if (objMZx instanceof Bitmap) {
                    interfaceC0074EYQ.EYQ((Bitmap) objMZx);
                }
            }
        });
    }
}
