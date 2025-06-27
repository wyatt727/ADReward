package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.j;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: FileDownloader.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f2881a;
    private j b;
    private LinkedList<a> c = new LinkedList<>();

    public b(j jVar, int i) {
        this.b = jVar;
        this.f2881a = i;
    }

    public final a a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
        a aVar = new a(file, str, eVar);
        synchronized (this) {
            this.c.add(aVar);
        }
        a();
        return aVar;
    }

    private void a() {
        synchronized (this) {
            int i = 0;
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    i++;
                }
            }
            if (i >= this.f2881a) {
                return;
            }
            Iterator<a> it2 = this.c.iterator();
            while (it2.hasNext()) {
                if (a.a(it2.next()) && (i = i + 1) == this.f2881a) {
                    return;
                }
            }
        }
    }

    /* compiled from: FileDownloader.java */
    public class a {
        private com.mbridge.msdk.foundation.same.net.e<Void> b;
        private com.mbridge.msdk.foundation.same.net.e.a c;
        private int d;
        private File e;
        private String f;

        private a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
            this.e = file;
            this.b = eVar;
            this.f = str;
        }

        public final boolean a() {
            return this.d == 1;
        }

        static /* synthetic */ boolean a(a aVar) {
            if (aVar.d != 0) {
                return false;
            }
            b bVar = b.this;
            com.mbridge.msdk.foundation.same.net.e.a aVar2 = new com.mbridge.msdk.foundation.same.net.e.a(aVar.e, aVar.f);
            aVar.c = aVar2;
            aVar2.a(new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.net.e.b.a.1

                /* renamed from: a, reason: collision with root package name */
                boolean f2883a;

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onPreExecute() {
                    a.this.b.onPreExecute();
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                    if (this.f2883a) {
                        return;
                    }
                    a.this.d = 3;
                    a.this.b.onFinish();
                    b.a(b.this, a.this);
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    if (this.f2883a) {
                        return;
                    }
                    a.this.b.onSuccess(kVar);
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar3) {
                    if (this.f2883a) {
                        return;
                    }
                    a.this.b.onError(aVar3);
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onCancel() {
                    a.this.b.onCancel();
                    this.f2883a = true;
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j, long j2) {
                    a.this.b.onProgressChange(j, j2);
                }
            });
            aVar.d = 1;
            b.this.b.a(aVar.c);
            return true;
        }
    }

    static /* synthetic */ void a(b bVar, a aVar) {
        synchronized (bVar) {
            bVar.c.remove(aVar);
        }
        bVar.a();
    }
}
