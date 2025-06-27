package com.bytedance.sdk.openadsdk.IPb;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.lang.ref.WeakReference;

/* compiled from: ImageLoaderToViewWrapper.java */
/* loaded from: classes2.dex */
public class Td implements hu<Bitmap> {
    private final WeakReference<ImageView> EYQ;
    private final String mZx = "ImageLoaderToViewWrapper";

    @Override // com.bytedance.sdk.component.Pm.hu
    public void EYQ(int i, String str, Throwable th) {
    }

    public static hu EYQ(UB ub, String str, ImageView imageView) {
        return new mZx(ub, str, new Td(imageView));
    }

    private Td(ImageView imageView) {
        this.EYQ = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.Pm.hu
    public void EYQ(MxO<Bitmap> mxO) {
        final ImageView imageView = this.EYQ.get();
        if (imageView == null || !(mxO.mZx() instanceof Bitmap)) {
            return;
        }
        final Bitmap bitmapMZx = mxO.mZx();
        if (xt.Kbd()) {
            imageView.setImageBitmap(bitmapMZx);
        } else {
            pi.Td().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.IPb.Td.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapMZx);
                }
            });
        }
    }
}
