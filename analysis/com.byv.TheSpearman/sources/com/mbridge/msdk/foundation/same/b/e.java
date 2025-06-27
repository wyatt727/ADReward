package com.mbridge.msdk.foundation.same.b;

import android.util.Log;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MBridgeDirManager.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f2829a;
    private b b;
    private ArrayList<a> c = new ArrayList<>();

    private e(b bVar) {
        this.b = bVar;
    }

    public static String a(c cVar) {
        File fileB = b(cVar);
        if (fileB != null) {
            return fileB.getAbsolutePath();
        }
        return null;
    }

    public static File b(c cVar) {
        try {
            if (a() == null || a().c == null || a().c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b.equals(cVar)) {
                    return next.f2830a;
                }
            }
            return null;
        } catch (Throwable th) {
            ad.a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static synchronized e a() {
        if (f2829a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            ag.a(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        if (f2829a == null) {
            Log.e("MBridgeDirManager", "mDirectoryManager == null");
        }
        return f2829a;
    }

    public static synchronized void a(b bVar) {
        if (f2829a == null) {
            f2829a = new e(bVar);
        }
    }

    public final boolean b() {
        return a(this.b.b());
    }

    private boolean a(com.mbridge.msdk.foundation.same.b.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.b.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileB = b(aVarC.d());
            if (fileB == null) {
                return false;
            }
            strB = fileB.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.c.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.b.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.b.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* compiled from: MBridgeDirManager.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f2830a;
        public c b;

        public a(c cVar, File file) {
            this.b = cVar;
            this.f2830a = file;
        }
    }
}
