package com.bytedance.sdk.component.Kbd.EYQ.EYQ;

import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: CacheManager.java */
/* loaded from: classes2.dex */
public class mZx extends EYQ {
    private final Pm EYQ;
    private final Queue<String> Td;
    private final Td mZx;

    public mZx() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.Td = concurrentLinkedQueue;
        this.EYQ = new IPb(concurrentLinkedQueue);
        this.mZx = new Td();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public synchronized void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        Pm pm;
        Td td;
        if (i != 5) {
            if (QQ.VwS().hu().EYQ(QQ.VwS().IPb()) && (pm = this.EYQ) != null && eyq != null) {
                pm.EYQ(eyq, i);
            }
            td = this.mZx;
            if (td != null && eyq != null) {
                td.EYQ(eyq, i);
            }
        } else {
            td = this.mZx;
            if (td != null) {
                td.EYQ(eyq, i);
            }
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public synchronized void EYQ(int i, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        Iterator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> it = list.iterator();
        while (it.hasNext()) {
            this.Td.remove(it.next().Td());
        }
        Pm pm = this.EYQ;
        if (pm != null) {
            pm.EYQ(i, list);
        }
        Td td = this.mZx;
        if (td != null) {
            td.EYQ(i, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[Catch: all -> 0x0177, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:67:0x014d, B:70:0x0154, B:71:0x0158, B:73:0x015e, B:77:0x0170, B:11:0x0018, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:19:0x0051, B:20:0x005c, B:22:0x0062, B:23:0x006c, B:25:0x0072, B:30:0x0087, B:31:0x008f, B:32:0x0093, B:34:0x0099, B:35:0x00a7, B:36:0x00b2, B:38:0x00b8, B:39:0x00c6, B:40:0x00cb, B:42:0x00d4, B:44:0x00da, B:45:0x00dd, B:47:0x00e5, B:49:0x00eb, B:50:0x00f4, B:52:0x00fa, B:53:0x0108, B:55:0x0111, B:56:0x0115, B:58:0x011b, B:60:0x0127, B:61:0x012b, B:62:0x0136, B:64:0x013c), top: B:83:0x0001 }] */
    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int r9, int r10, java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.EYQ(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public synchronized boolean EYQ(int i, boolean z) {
        if (this.EYQ.EYQ(i, z)) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.tr(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.mZx.EYQ(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Tnp(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(int i, long j) {
        this.mZx.EYQ(i, j);
        this.EYQ.EYQ(i, j);
    }
}
