package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* compiled from: UIEnergize.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f3618a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f3618a == null) {
            synchronized (b.class) {
                if (f3618a == null) {
                    f3618a = new b();
                }
                bVar = f3618a;
            }
            return bVar;
        }
        return f3618a;
    }

    public final void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iH = cVar.h();
        if (iH == 1) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, map);
            return;
        }
        if (iH == 2) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar, map);
            return;
        }
        if (iH == 3) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar);
        } else if (iH == 4) {
            new com.mbridge.msdk.video.dynview.j.b().b(view, cVar, map);
        } else {
            if (iH != 5) {
                return;
            }
            new com.mbridge.msdk.video.dynview.j.b();
        }
    }
}
