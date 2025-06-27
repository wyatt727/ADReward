package com.bytedance.sdk.component.Pm.Td.EYQ.mZx;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.Pm.Uc;

/* compiled from: LruCountBitmapCache.java */
/* loaded from: classes2.dex */
public class mZx implements Uc {
    private int EYQ;
    private com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, Bitmap> Td;
    private int mZx;

    public mZx(int i, int i2) {
        this.mZx = i;
        this.EYQ = i2;
        this.Td = new com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.Pm.Td.EYQ.mZx.mZx.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.Pm.Td.EYQ.Td
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public int mZx(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return mZx.EYQ(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean EYQ(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.Td.EYQ(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public Bitmap EYQ(String str) {
        return this.Td.EYQ((com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, Bitmap>) str);
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean mZx(String str) {
        return this.Td.EYQ((com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, Bitmap>) str) != null;
    }

    public static int EYQ(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
