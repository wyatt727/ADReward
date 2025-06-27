package com.mbridge.msdk.dycreator.g;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BaseAbstractSubject.java */
/* loaded from: classes4.dex */
public abstract class a extends com.mbridge.msdk.dycreator.c.a {
    private List<Object> b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f2677a = new ConcurrentHashMap<>();

    public final synchronized void a(Object obj, int i) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f2677a;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f2677a.put(Integer.valueOf(i), obj);
            }
        }
    }

    public final synchronized void a() {
        this.f2677a.clear();
    }
}
