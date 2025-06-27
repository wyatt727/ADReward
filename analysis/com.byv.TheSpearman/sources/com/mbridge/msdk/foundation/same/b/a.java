package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Directory.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f2826a;
    private String b;
    private a c;
    private c d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.d = cVar;
        aVar.b = str;
        a(aVar);
    }

    private void a(a aVar) {
        if (this.f2826a == null) {
            this.f2826a = new ArrayList();
        }
        aVar.c = this;
        this.f2826a.add(aVar);
    }

    public final void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final List<a> a() {
        return this.f2826a;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final a c() {
        return this.c;
    }

    public final c d() {
        return this.d;
    }

    public final void a(c cVar) {
        this.d = cVar;
    }
}
