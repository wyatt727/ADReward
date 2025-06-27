package com.my.target;

import com.json.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public final Set<u9> f4166a = new HashSet();
    public final Set<t7> b = new HashSet();
    public final Set<u9> c = new HashSet();
    public final Set<u9> d = new HashSet();
    public final List<m7> e = new ArrayList();
    public final List<w5> f = new ArrayList();
    public final Comparator<m7> g = new Comparator() { // from class: com.my.target.v9$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r1.a(((m7) obj2).e(), ((m7) obj).e());
        }
    };

    public static /* synthetic */ int a(t7 t7Var, t7 t7Var2) {
        return (int) (t7Var2.e() - t7Var.e());
    }

    public static v9 e() {
        return new v9();
    }

    public ArrayList<w5> a() {
        return new ArrayList<>(this.f);
    }

    public List<u9> a(String str) {
        return new ArrayList(str.equals(t2.h.D) ? this.c : this.d);
    }

    public void a(u9 u9Var) {
        if (u9Var instanceof l7) {
            String strD = ((l7) u9Var).d();
            if (t2.h.C.equals(strD)) {
                this.d.add(u9Var);
                return;
            } else {
                if (t2.h.D.equals(strD)) {
                    this.c.add(u9Var);
                    return;
                }
                return;
            }
        }
        if (u9Var instanceof t7) {
            this.b.add((t7) u9Var);
            return;
        }
        if (!(u9Var instanceof m7)) {
            if (u9Var instanceof w5) {
                this.f.add((w5) u9Var);
                return;
            } else {
                this.f4166a.add(u9Var);
                return;
            }
        }
        m7 m7Var = (m7) u9Var;
        int iBinarySearch = Collections.binarySearch(this.e, m7Var, this.g);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.e.add(iBinarySearch, m7Var);
    }

    public void a(v9 v9Var, float f) {
        this.f4166a.addAll(v9Var.f4166a);
        this.f.addAll(v9Var.f);
        this.c.addAll(v9Var.c);
        this.d.addAll(v9Var.d);
        if (f <= 0.0f) {
            this.b.addAll(v9Var.b);
            this.e.addAll(v9Var.e);
            return;
        }
        for (t7 t7Var : v9Var.b) {
            float fD = t7Var.d();
            if (fD >= 0.0f) {
                t7Var.b((fD * f) / 100.0f);
                t7Var.a(-1.0f);
            }
            a(t7Var);
        }
        for (m7 m7Var : v9Var.e) {
            float fD2 = m7Var.d();
            if (fD2 >= 0.0f) {
                m7Var.b((fD2 * f) / 100.0f);
                m7Var.a(-1.0f);
            }
            a(m7Var);
        }
    }

    public void a(ArrayList<t7> arrayList) {
        this.b.addAll(arrayList);
    }

    public void a(List<u9> list) {
        Iterator<u9> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public ArrayList<m7> b() {
        return new ArrayList<>(this.e);
    }

    public ArrayList<u9> b(String str) {
        ArrayList<u9> arrayList = new ArrayList<>();
        for (u9 u9Var : this.f4166a) {
            if (str.equals(u9Var.a())) {
                arrayList.add(u9Var);
            }
        }
        return arrayList;
    }

    public void b(List<t7> list) {
        list.addAll(this.b);
        Collections.sort(list, new Comparator() { // from class: com.my.target.v9$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return v9.a((t7) obj, (t7) obj2);
            }
        });
    }

    public Set<t7> c() {
        return new HashSet(this.b);
    }

    public boolean d() {
        return (this.f4166a.isEmpty() && this.b.isEmpty() && this.e.isEmpty() && this.f.isEmpty()) ? false : true;
    }
}
