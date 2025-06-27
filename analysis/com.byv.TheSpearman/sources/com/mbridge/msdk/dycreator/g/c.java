package com.mbridge.msdk.dycreator.g;

import java.util.Map;

/* compiled from: ClickSubject.java */
/* loaded from: classes4.dex */
public final class c extends a {
    public final void a(Object obj) {
        b bVar;
        if (this.f2677a == null || this.f2677a.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f2677a.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (bVar = (b) entry.getValue()) != null) {
                        bVar.a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
