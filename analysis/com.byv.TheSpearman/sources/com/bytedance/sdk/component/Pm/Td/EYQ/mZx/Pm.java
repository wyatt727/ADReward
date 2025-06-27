package com.bytedance.sdk.component.Pm.Td.EYQ.mZx;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.Pm.Uc;

/* compiled from: MemoryCacheWrapper.java */
/* loaded from: classes2.dex */
public class Pm implements Uc {
    private final Uc EYQ;
    private final com.bytedance.sdk.component.Pm.Td.EYQ.mZx mZx;

    public Pm(Uc uc) {
        this(uc, null);
    }

    public Pm(Uc uc, com.bytedance.sdk.component.Pm.Td.EYQ.mZx mzx) {
        this.EYQ = uc;
        this.mZx = mzx;
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean EYQ(String str, Bitmap bitmap) {
        boolean zEYQ = this.EYQ.EYQ(str, bitmap);
        if (this.mZx != null) {
            Boolean.valueOf(zEYQ);
        }
        return zEYQ;
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public Bitmap EYQ(String str) {
        return this.EYQ.EYQ(str);
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean mZx(String str) {
        return this.EYQ.mZx(str);
    }
}
