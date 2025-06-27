package com.bytedance.sdk.openadsdk.core.video.mZx;

import com.bytedance.sdk.component.utils.IPb;
import java.io.File;
import java.util.List;

/* compiled from: TotalCountLruDiskDir.java */
/* loaded from: classes2.dex */
public class Td extends com.bytedance.sdk.openadsdk.EYQ.mZx {
    public Td(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.EYQ.mZx, com.bytedance.sdk.openadsdk.EYQ.EYQ
    protected void EYQ(List<File> list) {
        int size = list.size();
        if (EYQ(0L, size)) {
            return;
        }
        for (File file : list) {
            IPb.Td(file);
            size--;
            if (EYQ(file, 0L, size)) {
                return;
            }
        }
    }
}
