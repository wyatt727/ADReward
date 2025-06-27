package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: WaitingRequestManager.java */
/* loaded from: classes4.dex */
final class ab implements p.a {
    private final t b;
    private final c d;
    private final BlockingQueue<p<?>> e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<p<?>>> f2699a = new HashMap();
    private final q c = null;

    ab(c cVar, BlockingQueue<p<?>> blockingQueue, t tVar) {
        this.b = tVar;
        this.d = cVar;
        this.e = blockingQueue;
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final void a(p<?> pVar, r<?> rVar) {
        List<p<?>> listRemove;
        if (rVar.b == null || rVar.b.a(System.currentTimeMillis())) {
            a(pVar);
            return;
        }
        String strJ = pVar.j();
        synchronized (this) {
            listRemove = this.f2699a.remove(strJ);
        }
        if (listRemove != null) {
            Iterator<p<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.b.a(it.next(), rVar);
            }
        }
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final synchronized void a(p<?> pVar) {
        BlockingQueue<p<?>> blockingQueue;
        String strJ = pVar.j();
        List<p<?>> listRemove = this.f2699a.remove(strJ);
        if (listRemove != null && !listRemove.isEmpty()) {
            p<?> pVarRemove = listRemove.remove(0);
            this.f2699a.put(strJ, listRemove);
            pVarRemove.a((p.a) this);
            q qVar = this.c;
            if (qVar != null) {
                qVar.c(pVarRemove);
            } else if (this.d != null && (blockingQueue = this.e) != null) {
                try {
                    blockingQueue.put(pVarRemove);
                } catch (InterruptedException e) {
                    aa.c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.d.a();
                }
            }
        }
    }

    final synchronized boolean b(p<?> pVar) {
        String strJ = pVar.j();
        if (this.f2699a.containsKey(strJ)) {
            List<p<?>> arrayList = this.f2699a.get(strJ);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(pVar);
            this.f2699a.put(strJ, arrayList);
            return true;
        }
        this.f2699a.put(strJ, null);
        pVar.a((p.a) this);
        return false;
    }
}
