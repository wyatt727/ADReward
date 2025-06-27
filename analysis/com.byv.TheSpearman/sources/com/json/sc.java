package com.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class sc {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f2130a = new HashMap();
    private Map<String, Integer> b = new HashMap();

    public interface a {
        int b();

        String c();
    }

    public sc(List<a> list) {
        for (a aVar : list) {
            this.f2130a.put(aVar.c(), 0);
            this.b.put(aVar.c(), Integer.valueOf(aVar.b()));
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            String strC = aVar.c();
            if (this.f2130a.containsKey(strC)) {
                Map<String, Integer> map = this.f2130a;
                map.put(strC, Integer.valueOf(map.get(strC).intValue() + 1));
            }
        }
    }

    public boolean a() {
        for (String str : this.b.keySet()) {
            if (this.f2130a.get(str).intValue() < this.b.get(str).intValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean b(a aVar) {
        synchronized (this) {
            String strC = aVar.c();
            if (this.f2130a.containsKey(strC)) {
                return this.f2130a.get(strC).intValue() >= aVar.b();
            }
            return false;
        }
    }
}
