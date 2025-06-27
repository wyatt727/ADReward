package com.bytedance.sdk.component.Pm.Td.mZx;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: DefaultDecoder.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static final ImageView.ScaleType EYQ = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config mZx = Bitmap.Config.ARGB_4444;
    private final int IPb;
    private int Kbd;
    private int Pm;
    private final ImageView.ScaleType QQ;
    private final Bitmap.Config Td;
    private final int VwS;
    private final int HX = 3840;
    private final int tp = 104857600;

    public EYQ(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.Td = config;
        this.Pm = i;
        this.Kbd = i2;
        this.QQ = scaleType;
        this.IPb = i3;
        this.VwS = i4;
        EYQ(i, i2);
    }

    static int EYQ(int i, int i2, int i3, int i4, int i5, int i6) {
        double dMin = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > dMin) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int EYQ(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    public Bitmap EYQ(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.Pm == 0 && this.Kbd == 0) {
            options.inPreferredConfig = this.Td;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iEYQ = EYQ(this.Pm, this.Kbd, i, i2, this.QQ);
            int iEYQ2 = EYQ(this.Kbd, this.Pm, i2, i, this.QQ);
            options.inJustDecodeBounds = false;
            options.inSampleSize = EYQ(i, i2, iEYQ, iEYQ2, this.IPb, this.VwS);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iEYQ || bitmapDecodeByteArray.getHeight() > iEYQ2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iEYQ, iEYQ2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (Build.VERSION.SDK_INT >= 12 && bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void EYQ(int i, int i2) {
        if (i > 3840 && i2 > 3840) {
            if (i > i2) {
                this.Pm = 3840;
                this.Kbd = (i2 * 3840) / i;
                return;
            } else {
                this.Pm = (i * 3840) / i2;
                this.Kbd = 3840;
                return;
            }
        }
        if (i > 3840) {
            this.Pm = 3840;
            this.Kbd = (i2 * 3840) / i;
        } else if (i2 > 3840) {
            this.Pm = (i * 3840) / i2;
            this.Kbd = 3840;
        }
    }
}
