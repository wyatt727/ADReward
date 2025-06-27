package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBInsertMemRepo.java */
/* loaded from: classes2.dex */
public abstract class Td {
    private final Context EYQ;
    protected final List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> mZx = new ArrayList();
    private boolean Td = false;
    private final Runnable Pm = new Runnable() { // from class: com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Td.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (Td.this) {
                if (Td.this.mZx.isEmpty()) {
                    Td.this.Td = false;
                    return;
                }
                ArrayList arrayList = new ArrayList(Td.this.mZx);
                Td.this.mZx.clear();
                Td.this.Td = false;
                Td.this.Pm(arrayList);
            }
        }
    };

    public abstract String mZx();

    public Td(Context context) {
        this.EYQ = context;
    }

    private void EYQ() {
        if (this.Td) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.VwS.EYQ.EYQ().postDelayed(this.Pm, com.bytedance.sdk.component.Kbd.EYQ.VwS.EYQ.mZx());
        this.Td = true;
    }

    protected void Td(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            Iterator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> it = this.mZx.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ next = it.next();
                if (next != null) {
                    String strTd = next.Td();
                    if (!TextUtils.isEmpty(strTd) && list.contains(strTd)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            mZx();
            th.getMessage();
        }
    }

    public synchronized void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        if (eyq.VwS() != null && !TextUtils.isEmpty(eyq.Td())) {
            this.mZx.add(eyq);
            EYQ();
        }
    }

    public Context Kbd() {
        return this.EYQ;
    }

    public void Pm(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), list);
    }
}
