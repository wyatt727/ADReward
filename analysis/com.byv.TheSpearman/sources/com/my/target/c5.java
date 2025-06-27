package com.my.target;

import com.my.target.common.models.AudioData;
import com.my.target.core.models.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c5<T extends com.my.target.core.models.a> extends q {
    public final int b;
    public final String c;
    public final ArrayList<b5<T>> d = new ArrayList<>();
    public final ArrayList<s> e = new ArrayList<>();
    public final ArrayList<s> f = new ArrayList<>();
    public final ArrayList<s> g = new ArrayList<>();
    public int h = 10;
    public int i = -1;

    public c5(String str) {
        this.c = str;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "preroll":
                this.b = 1;
                break;
            case "postroll":
                this.b = 3;
                break;
            case "pauseroll":
                this.b = 4;
                break;
            case "midroll":
                this.b = 2;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    public static c5<AudioData> a(String str) {
        return b(str);
    }

    public static <T extends com.my.target.core.models.a> c5<T> b(String str) {
        return new c5<>(str);
    }

    @Override // com.my.target.q
    public int a() {
        return this.d.size();
    }

    public ArrayList<s> a(float f) {
        ArrayList<s> arrayList = new ArrayList<>();
        Iterator<s> it = this.f.iterator();
        while (it.hasNext()) {
            s next = it.next();
            if (next.y() == f) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            this.f.removeAll(arrayList);
        }
        return arrayList;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(b5<T> b5Var) {
        b5Var.setMediaSectionType(this.b);
        this.d.add(b5Var);
    }

    public void a(b5<T> b5Var, int i) {
        int size = this.d.size();
        if (i < 0 || i > size) {
            return;
        }
        b5Var.setMediaSectionType(this.b);
        this.d.add(i, b5Var);
        Iterator<s> it = this.g.iterator();
        while (it.hasNext()) {
            s next = it.next();
            int iA = next.A();
            if (iA >= i) {
                next.d(iA + 1);
            }
        }
    }

    public void a(c5<T> c5Var) {
        Iterator<b5<T>> it = c5Var.d.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.e.addAll(c5Var.e);
        this.f.addAll(c5Var.f);
    }

    public void a(s sVar) {
        (sVar.H() ? this.f : sVar.F() ? this.e : this.g).add(sVar);
    }

    public void b(int i) {
        this.i = i;
    }

    public void c() {
        this.g.clear();
    }

    public List<b5<T>> d() {
        return new ArrayList(this.d);
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public ArrayList<s> g() {
        return new ArrayList<>(this.f);
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return (this.f.isEmpty() && this.e.isEmpty()) ? false : true;
    }

    public s j() {
        if (this.e.size() > 0) {
            return this.e.remove(0);
        }
        return null;
    }
}
