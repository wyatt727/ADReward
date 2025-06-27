package com.mbridge.msdk.dycreator.g;

import java.util.Map;

/* compiled from: ConcreteSubject.java */
/* loaded from: classes4.dex */
public final class d extends a {
    public final void a(Object obj) {
        i iVar;
        try {
            synchronized (this) {
                if (this.f2677a != null && this.f2677a.size() > 0) {
                    for (Map.Entry<Integer, Object> entry : this.f2677a.entrySet()) {
                        if (entry != null && (entry.getValue() instanceof i) && (iVar = (i) entry.getValue()) != null) {
                            iVar.a(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
