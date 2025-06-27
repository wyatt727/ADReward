package com.bytedance.sdk.component.adexpress.Pm;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.HX;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: ImageLoadUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    private static void mZx(ImageView imageView, byte[] bArr, int i, int i2) {
        Pm(imageView, bArr, i, i2);
    }

    private static void Td(ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                imageView.setImageDrawable(ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap)));
            } catch (IOException unused) {
            }
        } else {
            Pm(imageView, bArr, i, i2);
        }
    }

    private static void Pm(ImageView imageView, byte[] bArr, int i, int i2) {
        Bitmap bitmapEYQ = new com.bytedance.sdk.component.Pm.Td.mZx.EYQ(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).EYQ(bArr);
        if (bitmapEYQ != null) {
            imageView.setImageBitmap(bitmapEYQ);
        }
    }

    public static void EYQ(ImageView imageView, byte[] bArr, int i, int i2) {
        if (TextUtils.equals("png", HX.EYQ(Arrays.copyOfRange(bArr, 0, HX.EYQ())))) {
            mZx(imageView, bArr, i, i2);
        } else {
            Td(imageView, bArr, i, i2);
        }
    }
}
