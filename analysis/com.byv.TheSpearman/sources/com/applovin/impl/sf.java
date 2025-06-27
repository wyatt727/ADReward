package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class sf {

    private static class a extends e {
        transient Supplier g;

        a(Map map, Supplier supplier) {
            super(map);
            this.g = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.impl.h
        Set c() {
            return i();
        }

        @Override // com.applovin.impl.h
        Map b() {
            return h();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.impl.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public List g() {
            return (List) this.g.get();
        }
    }

    static boolean a(pf pfVar, Object obj) {
        if (obj == pfVar) {
            return true;
        }
        if (obj instanceof pf) {
            return pfVar.a().equals(((pf) obj).a());
        }
        return false;
    }

    public static ac a(Map map, Supplier supplier) {
        return new a(map, supplier);
    }
}
