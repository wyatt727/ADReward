package com.mbridge.msdk.dycreator.g;

import java.util.Map;

/* compiled from: ReportSubject.java */
/* loaded from: classes4.dex */
public final class h extends a {
    public final void a(Object obj) {
        g gVar;
        if (this.f2677a == null || this.f2677a.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f2677a.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (gVar = (g) entry.getValue()) != null) {
                        gVar.a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
