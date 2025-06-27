package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f36a;
    private com.apm.insight.e.b.b b;
    private SQLiteDatabase c;

    private a() {
    }

    public static a a() {
        if (f36a == null) {
            synchronized (a.class) {
                if (f36a == null) {
                    f36a = new a();
                }
            }
        }
        return f36a;
    }

    private void b() {
        if (this.b == null) {
            a(i.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            q.b(th);
        }
        this.b = new com.apm.insight.e.b.b();
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.c, str);
    }
}
