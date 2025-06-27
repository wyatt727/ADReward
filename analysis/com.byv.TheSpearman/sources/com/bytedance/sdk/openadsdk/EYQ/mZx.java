package com.bytedance.sdk.openadsdk.EYQ;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: TotalCountLruDiskFile.java */
/* loaded from: classes2.dex */
public class mZx extends EYQ {
    private int EYQ;
    private volatile boolean Td;
    private int mZx;

    public mZx(int i, int i2) {
        this.EYQ = 15;
        this.mZx = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.EYQ = i;
        this.mZx = i2;
    }

    public mZx(int i, int i2, boolean z) {
        this.EYQ = 15;
        this.mZx = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.EYQ = i;
        this.mZx = i2;
        this.Td = z;
    }

    @Override // com.bytedance.sdk.openadsdk.EYQ.EYQ
    protected boolean EYQ(long j, int i) {
        return i <= this.EYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.EYQ.EYQ
    protected boolean EYQ(File file, long j, int i) {
        return i <= this.mZx;
    }

    @Override // com.bytedance.sdk.openadsdk.EYQ.EYQ
    protected void EYQ(List<File> list) {
        if (this.Td) {
            Pm(list);
            this.Td = false;
        } else {
            Td(list);
        }
    }

    private void Td(List<File> list) {
        long jMZx = mZx(list);
        int size = list.size();
        if (EYQ(jMZx, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jMZx -= length;
            }
            if (EYQ(file, jMZx, size)) {
                return;
            }
        }
    }

    private void Pm(List<File> list) {
        long jMZx;
        int size;
        boolean zEYQ;
        if (list != null) {
            try {
                if (list.size() == 0 || (zEYQ = EYQ((jMZx = mZx(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !zEYQ) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            jMZx -= length;
                        }
                        if (EYQ(file2, jMZx, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
