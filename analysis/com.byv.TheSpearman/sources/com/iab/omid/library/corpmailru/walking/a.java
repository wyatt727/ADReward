package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import com.iab.omid.library.corpmailru.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f1540a = new HashMap<>();
    private final HashMap<View, C0216a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private boolean h;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a$a, reason: collision with other inner class name */
    public static class C0216a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.corpmailru.b.c f1542a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0216a(com.iab.omid.library.corpmailru.b.c cVar, String str) {
            this.f1542a = cVar;
            a(str);
        }

        public com.iab.omid.library.corpmailru.b.c a() {
            return this.f1542a;
        }

        public void a(String str) {
            this.b.add(str);
        }

        public ArrayList<String> b() {
            return this.b;
        }
    }

    private void a(com.iab.omid.library.corpmailru.adsession.a aVar) {
        Iterator<com.iab.omid.library.corpmailru.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.corpmailru.b.c cVar, com.iab.omid.library.corpmailru.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0216a c0216a = this.b.get(view);
        if (c0216a != null) {
            c0216a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0216a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f1540a.size() == 0) {
            return null;
        }
        String str = this.f1540a.get(view);
        if (str != null) {
            this.f1540a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.g.get(str);
    }

    public HashSet<String> a() {
        return this.e;
    }

    public View b(String str) {
        return this.c.get(str);
    }

    public C0216a b(View view) {
        C0216a c0216a = this.b.get(view);
        if (c0216a != null) {
            this.b.remove(view);
        }
        return c0216a;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public c c(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.corpmailru.b.a aVarA = com.iab.omid.library.corpmailru.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.corpmailru.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.e.add(adSessionId);
                            this.f1540a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, viewD);
                            this.g.put(adSessionId, strD);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f1540a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public void e() {
        this.h = true;
    }
}
