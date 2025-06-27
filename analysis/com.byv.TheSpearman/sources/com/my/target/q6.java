package com.my.target;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class q6 extends q {
    public static final LruCache<String, String> c = new LruCache<>(10);
    public final ArrayList<d6> b = new ArrayList<>();

    public static LruCache<String, String> d() {
        return c;
    }

    public static q6 f() {
        return new q6();
    }

    @Override // com.my.target.q
    public int a() {
        return this.b.size();
    }

    public void a(d6 d6Var) {
        this.b.add(d6Var);
        c.put(d6Var.getId(), d6Var.getId());
    }

    public List<d6> c() {
        return new ArrayList(this.b);
    }

    public d6 e() {
        if (this.b.size() > 0) {
            return this.b.get(0);
        }
        return null;
    }
}
