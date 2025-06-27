package com.bytedance.sdk.component.Pm.Td.EYQ.mZx;

import com.bytedance.sdk.component.Pm.hYh;

/* compiled from: LruCountRawCache.java */
/* loaded from: classes2.dex */
public class Td implements hYh {
    private int EYQ;
    private com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, byte[]> Td;
    private int mZx;

    public Td(int i, int i2) {
        this.mZx = i;
        this.EYQ = i2;
        this.Td = new com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, byte[]>(i) { // from class: com.bytedance.sdk.component.Pm.Td.EYQ.mZx.Td.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.Pm.Td.EYQ.Td
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public int mZx(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean EYQ(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.Td.EYQ(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public byte[] EYQ(String str) {
        return this.Td.EYQ((com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, byte[]>) str);
    }

    @Override // com.bytedance.sdk.component.Pm.EYQ
    public boolean mZx(String str) {
        return this.Td.EYQ((com.bytedance.sdk.component.Pm.Td.EYQ.Td<String, byte[]>) str) != null;
    }
}
