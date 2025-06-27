package com.bytedance.sdk.component.Pm.Pm;

/* compiled from: NetVisitor.java */
/* loaded from: classes2.dex */
public class MxO extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(final com.bytedance.sdk.component.Pm.Td.Td td) {
        final com.bytedance.sdk.component.Pm.Td.IPb iPbHYh = td.hYh();
        com.bytedance.sdk.component.Pm.Pm Pm = iPbHYh.Pm();
        td.EYQ(false);
        try {
            com.bytedance.sdk.component.Pm.IPb iPbEYQ = Pm.EYQ(new com.bytedance.sdk.component.Pm.mZx.Td(td.EYQ(), td.pi(), td.nWX(), td.XN()));
            int iMZx = iPbEYQ.mZx();
            td.EYQ(iPbEYQ.EYQ());
            if (iPbEYQ.mZx() == 200) {
                final byte[] bArr = (byte[]) iPbEYQ.Td();
                td.EYQ(new mZx(bArr, iPbEYQ));
                final String strTp = td.tp();
                final com.bytedance.sdk.component.Pm.mZx mzxZF = td.zF();
                if (mzxZF.Td()) {
                    iPbHYh.mZx(td.zF()).EYQ(strTp, bArr);
                }
                iPbHYh.IPb().submit(new Runnable() { // from class: com.bytedance.sdk.component.Pm.Pm.MxO.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (mzxZF.Pm()) {
                            iPbHYh.Td(td.zF()).EYQ(strTp, bArr);
                        }
                    }
                });
                return;
            }
            iPbHYh.QQ();
            String.valueOf(iPbEYQ);
            Object objTd = iPbEYQ.Td();
            EYQ(iMZx, iPbEYQ.Pm(), objTd instanceof Throwable ? (Throwable) objTd : null, td);
        } catch (Throwable th) {
            EYQ(1004, "net request failed!", th, td);
        }
    }

    private void EYQ(int i, String str, Throwable th, com.bytedance.sdk.component.Pm.Td.Td td) {
        td.EYQ(new QQ(i, str, th));
    }
}
