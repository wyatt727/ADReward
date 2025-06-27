package com.bytedance.sdk.component.Pm.Pm;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: DiskCacheVisitor.java */
/* loaded from: classes2.dex */
public class IPb extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        byte[] bArrEYQ;
        String strTp = td.tp();
        if (td.WU() || td.zF().IPb()) {
            bArrEYQ = EYQ(td, strTp);
        } else {
            bArrEYQ = mZx(td, strTp);
        }
        if (bArrEYQ == null) {
            td.EYQ(new MxO());
        } else {
            td.EYQ(new mZx(bArrEYQ, null));
            td.hYh().mZx(td.zF()).EYQ(strTp, bArrEYQ);
        }
    }

    private byte[] EYQ(com.bytedance.sdk.component.Pm.Td.Td td, String str) {
        td.hYh().Td(td.zF());
        Collection<com.bytedance.sdk.component.Pm.Td> collectionTd = td.hYh().Td();
        if (collectionTd == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.Pm.Td> it = collectionTd.iterator();
        while (it.hasNext()) {
            byte[] bArrEYQ = it.next().EYQ((com.bytedance.sdk.component.Pm.Td) str);
            if (bArrEYQ != null) {
                return bArrEYQ;
            }
        }
        return null;
    }

    private byte[] mZx(com.bytedance.sdk.component.Pm.Td.Td td, String str) {
        com.bytedance.sdk.component.Pm.Td Td = td.hYh().Td(td.zF());
        if (Td == null) {
            return null;
        }
        return Td.EYQ((com.bytedance.sdk.component.Pm.Td) str);
    }
}
