package com.bytedance.sdk.component.Pm.Pm;

import android.graphics.Bitmap;

/* compiled from: DecoderVisitor.java */
/* loaded from: classes2.dex */
public class Kbd extends EYQ {
    private byte[] EYQ;
    private com.bytedance.sdk.component.Pm.IPb mZx;

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "decode";
    }

    public Kbd(byte[] bArr, com.bytedance.sdk.component.Pm.IPb iPb) {
        this.EYQ = bArr;
        this.mZx = iPb;
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        com.bytedance.sdk.component.Pm.Td.IPb iPbHYh = td.hYh();
        com.bytedance.sdk.component.Pm.Td.mZx.EYQ EYQ = iPbHYh.EYQ(td);
        try {
            td.XN();
            Bitmap bitmapEYQ = EYQ.EYQ(this.EYQ);
            if (bitmapEYQ != null) {
                td.EYQ(new pi(bitmapEYQ, this.mZx, false));
                iPbHYh.EYQ(td.zF()).EYQ(td.Kbd(), bitmapEYQ);
                return;
            }
            EYQ(1002, "decode failed bitmap null", null, td);
        } catch (Throwable th) {
            EYQ(1002, "decode failed:" + th.getMessage(), th, td);
        }
    }

    private void EYQ(int i, String str, Throwable th, com.bytedance.sdk.component.Pm.Td.Td td) {
        if (this.mZx == null) {
            td.EYQ(new MxO());
        } else {
            td.EYQ(new QQ(i, str, th));
        }
    }
}
