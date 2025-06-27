package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class s2 extends q {
    public final HashMap<String, h3> b;

    public s2() {
        HashMap<String, h3> map = new HashMap<>();
        this.b = map;
        map.put("preroll", h3.b("preroll"));
        map.put("pauseroll", h3.b("pauseroll"));
        map.put("midroll", h3.b("midroll"));
        map.put("postroll", h3.b("postroll"));
    }

    public static s2 e() {
        return new s2();
    }

    @Override // com.my.target.q
    public int a() {
        Iterator<h3> it = this.b.values().iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public h3 a(String str) {
        return this.b.get(str);
    }

    public ArrayList<h3> c() {
        return new ArrayList<>(this.b.values());
    }

    public boolean d() {
        for (h3 h3Var : this.b.values()) {
            if (h3Var.a() > 0 || h3Var.i()) {
                return true;
            }
        }
        return false;
    }
}
