package com.bytedance.sdk.component.Pm.Td.Td;

import android.graphics.BitmapFactory;

/* compiled from: FileUtil.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static boolean EYQ(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return options.outWidth > 0;
    }

    public static boolean mZx(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }
}
