package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.e.e;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: DataEnergize.java */
/* loaded from: classes4.dex */
public class a {
    private static volatile a b;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.d.a f3617a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
                aVar = b;
            }
            return aVar;
        }
        return b;
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int iH = cVar.h();
        if (iH == 1) {
            com.mbridge.msdk.video.dynview.j.a aVar = new com.mbridge.msdk.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f3617a = aVar.f3640a;
        } else {
            if (iH == 2) {
                new com.mbridge.msdk.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (iH == 4) {
                new com.mbridge.msdk.video.dynview.j.a().a(cVar, view, eVar);
            } else if (iH != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.mbridge.msdk.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }

    public final void b() {
        com.mbridge.msdk.video.dynview.d.a aVar = this.f3617a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
