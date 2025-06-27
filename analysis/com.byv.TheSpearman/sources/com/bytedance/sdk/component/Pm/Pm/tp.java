package com.bytedance.sdk.component.Pm.Pm;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.Pm.Uc;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MemoryCacheVisitor.java */
/* loaded from: classes2.dex */
public class tp extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        Bitmap bitmapMZx;
        int iTsL = td.tsL();
        if (iTsL != 2 && iTsL != 1) {
            bitmapMZx = null;
        } else if (td.WU() || td.zF().IPb()) {
            bitmapMZx = mZx(td);
        } else {
            bitmapMZx = Td(td);
        }
        if (bitmapMZx == null) {
            td.EYQ(new tsL());
        } else {
            td.EYQ(new pi(bitmapMZx, null, false));
        }
    }

    private Bitmap mZx(com.bytedance.sdk.component.Pm.Td.Td td) {
        Collection<Uc> collectionEYQ = td.hYh().EYQ();
        Bitmap bitmapEYQ = null;
        if (collectionEYQ == null) {
            return null;
        }
        Iterator<Uc> it = collectionEYQ.iterator();
        while (it.hasNext() && (bitmapEYQ = it.next().EYQ(td.Kbd())) == null) {
        }
        return bitmapEYQ;
    }

    private Bitmap Td(com.bytedance.sdk.component.Pm.Td.Td td) {
        return td.hYh().EYQ(td.zF()).EYQ(td.Kbd());
    }
}
