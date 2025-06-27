package com.bytedance.sdk.component.Pm.Pm;

/* compiled from: BytesVisitor.java */
/* loaded from: classes2.dex */
public class mZx implements HX {
    private byte[] EYQ;
    private com.bytedance.sdk.component.Pm.IPb mZx;

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "image_type";
    }

    public mZx(byte[] bArr, com.bytedance.sdk.component.Pm.IPb iPb) {
        this.EYQ = bArr;
        this.mZx = iPb;
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        HX qq;
        int iTsL = td.tsL();
        td.EYQ(this.EYQ.length);
        if (iTsL != 2) {
            if (iTsL == 3) {
                byte[] bArr = this.EYQ;
                qq = new pi(bArr, this.mZx, com.bytedance.sdk.component.Pm.Td.Td.EYQ.mZx(bArr));
            } else {
                boolean zMZx = com.bytedance.sdk.component.Pm.Td.Td.EYQ.mZx(this.EYQ);
                if (!zMZx && com.bytedance.sdk.component.Pm.Td.Td.EYQ.EYQ(this.EYQ)) {
                    qq = new Kbd(this.EYQ, this.mZx);
                } else {
                    qq = new pi(this.EYQ, this.mZx, zMZx);
                }
            }
        } else if (com.bytedance.sdk.component.Pm.Td.Td.EYQ.EYQ(this.EYQ)) {
            qq = new Kbd(this.EYQ, this.mZx);
        } else if (this.mZx == null) {
            qq = new MxO();
        } else {
            qq = new QQ(1001, "not image format", null);
        }
        td.EYQ(qq);
    }
}
