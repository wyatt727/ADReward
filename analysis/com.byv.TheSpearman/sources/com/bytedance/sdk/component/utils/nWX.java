package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: MemorySize.java */
/* loaded from: classes2.dex */
public class nWX {
    public static long EYQ() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
