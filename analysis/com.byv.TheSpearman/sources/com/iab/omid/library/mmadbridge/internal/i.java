package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.internal.d;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {
    private static i f;

    /* renamed from: a, reason: collision with root package name */
    private float f1594a = 0.0f;
    private final com.iab.omid.library.mmadbridge.devicevolume.e b;
    private final com.iab.omid.library.mmadbridge.devicevolume.b c;
    private com.iab.omid.library.mmadbridge.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.e == null) {
            this.e = c.c();
        }
        return this.e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f2) {
        this.f1594a = f2;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f1594a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.d();
    }
}
