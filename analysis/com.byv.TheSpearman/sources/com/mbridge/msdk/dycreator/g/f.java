package com.mbridge.msdk.dycreator.g;

import java.util.Map;

/* compiled from: EffectSubject.java */
/* loaded from: classes4.dex */
public final class f extends a {
    public final void a(Object obj) {
        e eVar;
        if (this.f2677a == null || this.f2677a.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f2677a.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (eVar = (e) entry.getValue()) != null) {
                        eVar.a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
