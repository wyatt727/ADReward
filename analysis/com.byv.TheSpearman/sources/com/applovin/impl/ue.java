package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ue {

    /* renamed from: a, reason: collision with root package name */
    private final List f1063a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(be beVar);
    }

    public void a(a aVar) {
        this.f1063a.add(aVar);
    }

    public void a(be beVar) {
        Iterator it = new ArrayList(this.f1063a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(beVar);
        }
    }

    public void b(a aVar) {
        this.f1063a.remove(aVar);
    }
}
