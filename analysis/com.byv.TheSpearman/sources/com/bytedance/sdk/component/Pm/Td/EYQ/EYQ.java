package com.bytedance.sdk.component.Pm.Td.EYQ;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: CacheConfig.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.component.Pm.mZx, Cloneable {
    private static volatile com.bytedance.sdk.component.Pm.mZx IPb;
    private long EYQ;
    private File Kbd;
    private boolean Pm;
    private boolean Td;
    private int mZx;

    @Override // com.bytedance.sdk.component.Pm.mZx
    public boolean IPb() {
        return true;
    }

    public EYQ(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public EYQ(int i, long j, boolean z, boolean z2, File file) {
        this.EYQ = j;
        this.mZx = i;
        this.Td = z;
        this.Pm = z2;
        this.Kbd = file;
    }

    @Override // com.bytedance.sdk.component.Pm.mZx
    public long EYQ() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.Pm.mZx
    public int mZx() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.Pm.mZx
    public boolean Td() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Pm.mZx
    public boolean Pm() {
        return this.Pm;
    }

    @Override // com.bytedance.sdk.component.Pm.mZx
    public File Kbd() {
        return this.Kbd;
    }

    public static void EYQ(Context context, com.bytedance.sdk.component.Pm.mZx mzx) {
        if (mzx != null) {
            IPb = mzx;
        } else {
            IPb = EYQ(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.Pm.mZx EYQ(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (IPb == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(QQ() / 16, 41943040L);
        } else {
            iMin = Math.min(IPb.mZx() / 2, 31457280);
            jMin = Math.min(IPb.EYQ() / 2, 41943040L);
        }
        return new EYQ(Math.max(iMin, 26214400), Math.max(jMin, 20971520L), file);
    }

    public static com.bytedance.sdk.component.Pm.mZx VwS() {
        return IPb;
    }

    private static long QQ() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
