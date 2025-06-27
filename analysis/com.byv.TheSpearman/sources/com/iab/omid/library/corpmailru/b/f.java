package com.iab.omid.library.corpmailru.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.corpmailru.b.b;
import com.iab.omid.library.corpmailru.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class f implements com.iab.omid.library.corpmailru.a.c, b.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f1527a;
    private float b = 0.0f;
    private final com.iab.omid.library.corpmailru.a.e c;
    private final com.iab.omid.library.corpmailru.a.b d;
    private com.iab.omid.library.corpmailru.a.d e;
    private a f;

    public f(com.iab.omid.library.corpmailru.a.e eVar, com.iab.omid.library.corpmailru.a.b bVar) {
        this.c = eVar;
        this.d = bVar;
    }

    public static f a() {
        if (f1527a == null) {
            f1527a = new f(new com.iab.omid.library.corpmailru.a.e(), new com.iab.omid.library.corpmailru.a.b());
        }
        return f1527a;
    }

    private a e() {
        if (this.f == null) {
            this.f = a.a();
        }
        return this.f;
    }

    @Override // com.iab.omid.library.corpmailru.a.c
    public void a(float f) {
        this.b = f;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f);
        }
    }

    public void a(Context context) {
        this.e = this.c.a(new Handler(), context, this.d.a(), this);
    }

    @Override // com.iab.omid.library.corpmailru.b.b.a
    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.e.b();
    }

    public float d() {
        return this.b;
    }
}
