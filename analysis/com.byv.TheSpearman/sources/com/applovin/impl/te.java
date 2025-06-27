package com.applovin.impl;

import com.applovin.impl.re;
import com.applovin.impl.se;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class te {
    private static final HashMap b = new HashMap();
    private static final HashMap c = new HashMap();
    private static final HashMap d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1032a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l, Long l2) {
        return l;
    }

    public te(com.applovin.impl.sdk.k kVar) {
        this.f1032a = kVar;
    }

    private void b(re reVar, se seVar, re.a aVar) {
        HashMap map;
        if (a(reVar, seVar, aVar)) {
            String strB = seVar.b();
            HashMap mapA = a(seVar.a());
            synchronized (mapA) {
                if (mapA.containsKey(strB)) {
                    map = (HashMap) mapA.get(strB);
                } else {
                    HashMap map2 = new HashMap();
                    mapA.put(strB, map2);
                    map = map2;
                }
                map.put(reVar, aVar.a(map.get(reVar)));
            }
        }
    }

    private boolean a(re reVar, se seVar, re.a aVar) {
        if (reVar == null) {
            this.f1032a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1032a.L().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (seVar == null) {
            this.f1032a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1032a.L().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.f1032a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1032a.L().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    public Map a(re reVar, se.a aVar) {
        HashMap mapA = a(aVar);
        HashMap map = new HashMap();
        synchronized (mapA) {
            for (String str : mapA.keySet()) {
                map.put(str, ((HashMap) mapA.get(str)).get(reVar));
            }
        }
        return map;
    }

    private HashMap a(se.a aVar) {
        if (aVar == se.a.AD_UNIT_ID) {
            return b;
        }
        if (aVar == se.a.AD_FORMAT) {
            return c;
        }
        return d;
    }

    public void a(re reVar, se seVar) {
        b(reVar, seVar, new re.a() { // from class: com.applovin.impl.te$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.re.a
            public final Object a(Object obj) {
                return te.a((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(re reVar, se seVar, final Long l) {
        b(reVar, seVar, new re.a() { // from class: com.applovin.impl.te$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.re.a
            public final Object a(Object obj) {
                return te.a(l, (Long) obj);
            }
        });
    }
}
