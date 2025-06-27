package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BannerLoadManager.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3044a = "a";
    private static volatile a h;
    private Context b = com.mbridge.msdk.foundation.controller.c.m().c();
    private com.mbridge.msdk.mbbanner.common.util.a c = new com.mbridge.msdk.mbbanner.common.util.a();
    private Map<String, com.mbridge.msdk.mbbanner.common.a.c> d = new ConcurrentHashMap();
    private Map<String, Boolean> e = new ConcurrentHashMap();
    private Map<String, Handler> f = new ConcurrentHashMap();
    private Map<String, Integer> g = new ConcurrentHashMap();

    public static a a() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    private a() {
    }

    public final void a(String str, String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        com.mbridge.msdk.mbbanner.common.a.c cVar;
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (this.b == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880025);
            bVar3.a(mBridgeIds);
            this.c.a(bVar2, bVar3);
            return;
        }
        if (bVar == null || bVar2 == null) {
            com.mbridge.msdk.foundation.c.b bVar4 = new com.mbridge.msdk.foundation.c.b(880001);
            bVar4.a(mBridgeIds);
            this.c.a(bVar2, bVar4);
            return;
        }
        Map<String, Boolean> map = this.e;
        if (map != null && map.containsKey(str2) && (bool = this.e.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.c.b bVar5 = new com.mbridge.msdk.foundation.c.b(880016, "Current unit is loading!");
            bVar5.a(mBridgeIds);
            this.c.a(bVar2, bVar5);
            return;
        }
        this.e.put(str2, true);
        if (this.d.containsKey(str2)) {
            cVar = this.d.get(str2);
        } else {
            k kVarD = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
            if (kVarD == null) {
                kVarD = k.d(str2);
            }
            com.mbridge.msdk.mbbanner.common.a.c cVar2 = new com.mbridge.msdk.mbbanner.common.a.c(str2, "", 0, kVarD.w());
            this.d.put(str2, cVar2);
            cVar = cVar2;
        }
        new b(this.b, cVar, bVar2, this.c).a(str, str2, bVar, new com.mbridge.msdk.mbbanner.common.b.d() { // from class: com.mbridge.msdk.mbbanner.common.c.a.1
            @Override // com.mbridge.msdk.mbbanner.common.b.d
            public final void a(String str3) {
                synchronized (a.a()) {
                    bVar.a("");
                    a.this.e.put(str3, false);
                }
            }
        });
    }

    public final void b(final String str, final String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, final com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        final MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (bVar == null || bVar.b() <= 0) {
            ad.b(f3044a, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
            return;
        }
        if (this.f.containsKey(str2)) {
            handler = this.f.get(str2);
        } else {
            handler = new Handler();
            this.f.put(str2, handler);
        }
        Handler handler2 = handler;
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.a.2
            @Override // java.lang.Runnable
            public final void run() {
                Boolean bool;
                if (a.this.e == null || !a.this.e.containsKey(str2) || (bool = (Boolean) a.this.e.get(str2)) == null || !bool.booleanValue()) {
                    if (a.this.g.containsKey(str2)) {
                        Integer num = (Integer) a.this.g.get(str2);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue == 2 || iIntValue == 4) {
                            ad.b(a.f3044a, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + str2);
                            if (a.this.c != null) {
                                com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880026);
                                bVar3.a(mBridgeIds);
                                a.this.c.a(bVar2, bVar3);
                                return;
                            }
                            return;
                        }
                    }
                    a.this.a(str, str2, bVar, bVar2);
                }
            }
        };
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            handler2.postDelayed(runnable, bVar.b());
        }
    }

    public final void a(String str) {
        if (this.f.containsKey(str)) {
            Handler handler = this.f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f.remove(str);
        }
    }

    public final void a(int i, String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.g.containsKey(str2) || (num = this.g.get(str2)) == null) ? 0 : num.intValue();
        if (i == 1) {
            if (this.f.containsKey(str2) && (handler = this.f.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.g.put(str2, Integer.valueOf(i));
            return;
        }
        if (i == 2) {
            if (iIntValue == 1) {
                if (this.f.containsKey(str2) && (handler2 = this.f.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.g.put(str2, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (i == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.g.put(str2, 1);
                b(str, str2, bVar, bVar2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.g.put(str2, 0);
            return;
        }
        if (this.f.containsKey(str2) && (handler3 = this.f.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.g.put(str2, Integer.valueOf(i));
    }

    public final void b() {
        Map<String, com.mbridge.msdk.mbbanner.common.a.c> map = this.d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f.clear();
        }
        Map<String, Integer> map4 = this.g;
        if (map4 != null) {
            map4.clear();
        }
    }
}
