package com.mbridge.msdk.d;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.LinkedList;
import java.util.List;

/* compiled from: LoopTimer.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f2548a;
    private boolean b;
    private LinkedList<i> c;
    private LinkedList<i> d;
    private int e;
    private int f;
    private f g;
    private com.mbridge.msdk.videocommon.d.a h;
    private o i;
    private h j;
    private Handler k;

    /* compiled from: LoopTimer.java */
    /* renamed from: com.mbridge.msdk.d.a$a, reason: collision with other inner class name */
    static class C0257a {

        /* renamed from: a, reason: collision with root package name */
        static a f2551a = new a();
    }

    private a() {
        this.b = false;
        this.c = new LinkedList<>();
        this.d = new LinkedList<>();
        this.e = 0;
        this.f = 0;
        this.k = new Handler() { // from class: com.mbridge.msdk.d.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                synchronized (a.this) {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            a.c(a.this);
                        }
                    } else {
                        if (a.this.b) {
                            return;
                        }
                        a aVar = a.this;
                        a.a(aVar, aVar.f2548a);
                        sendMessageDelayed(obtainMessage(1), a.this.f2548a);
                    }
                }
            }
        };
    }

    private boolean a(i iVar) {
        boolean z = false;
        if (iVar == null || TextUtils.isEmpty(iVar.b())) {
            return false;
        }
        String strB = iVar.b();
        try {
            if (this.g != null) {
                com.mbridge.msdk.videocommon.d.a aVar = this.h;
                int iA = this.g.a(strB, aVar != null ? aVar.f() : 0L);
                if (iA != -1) {
                    if (iA != 1) {
                    }
                } else if (!TextUtils.isEmpty(strB)) {
                    LinkedList<i> linkedList = this.c;
                    if (linkedList != null && linkedList.contains(strB)) {
                        this.c.remove(strB);
                    } else {
                        LinkedList<i> linkedList2 = this.d;
                        if (linkedList2 != null && linkedList2.contains(strB)) {
                            this.d.remove(strB);
                        }
                    }
                    o oVar = this.i;
                    if (oVar != null) {
                        oVar.a(strB);
                    }
                }
                try {
                    Handler handler = this.k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    ad.a("LoopTimer", th.getMessage(), th);
                    return z;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    private void a(String str, String str2, boolean z) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                return;
            }
            final com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextC, str, str2);
            cVar.b(z);
            cVar.a(new com.mbridge.msdk.reward.adapter.a() { // from class: com.mbridge.msdk.d.a.2
                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                    a.this.k.sendMessage(a.this.k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                    a.this.k.sendMessage(a.this.k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            });
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.c(SameMD5.getMD5(ai.d()));
            bVar.d(str2);
            if (z) {
                bVar.b(287);
            } else {
                bVar.b(94);
            }
            bVar.i("0");
            bVar.b("1");
            cVar.a(1, 8000, false, bVar);
        } catch (Exception e) {
            ad.a("LoopTimer", e.getMessage(), e);
        }
    }

    public final void a(String str, String str2) {
        if (this.c.contains(str2)) {
            return;
        }
        this.c.add(new i(str, str2, 94));
        o oVar = this.i;
        if (oVar != null) {
            oVar.a(str, str2, 94);
        }
    }

    public final void b(String str, String str2) {
        if (this.d.contains(str2)) {
            return;
        }
        this.d.add(new i(str, str2, 287));
        o oVar = this.i;
        if (oVar != null) {
            oVar.a(str, str2, 287);
        }
    }

    public final void a(long j) {
        if (this.j == null) {
            this.j = h.a(c.m().c());
        }
        if (this.i == null) {
            this.i = o.a(this.j);
        }
        List<i> listA = this.i.a(287);
        if (listA != null) {
            this.d.addAll(listA);
            for (i iVar : listA) {
                b(iVar.a(), iVar.b());
            }
        }
        List<i> listA2 = this.i.a(94);
        if (listA2 != null) {
            this.c.addAll(listA2);
            for (i iVar2 : listA2) {
                a(iVar2.a(), iVar2.b());
            }
        }
        if (this.g == null) {
            this.g = f.a(this.j);
        }
        if (this.h == null) {
            this.h = com.mbridge.msdk.videocommon.d.b.a().b();
        }
        this.f2548a = j;
        this.b = false;
        Handler handler = this.k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f2548a);
    }

    static /* synthetic */ void a(a aVar, long j) {
        LinkedList<i> linkedList = aVar.c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.e == 0 || aVar.c.size() <= aVar.e) {
            LinkedList<i> linkedList2 = aVar.d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f == 0 || aVar.d.size() == aVar.f) {
                aVar.f = 0;
                aVar.e = 0;
                Handler handler = aVar.k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    static /* synthetic */ void c(a aVar) {
        try {
            LinkedList<i> linkedList = aVar.c;
            if (linkedList != null && linkedList.size() > 0 && aVar.e < aVar.c.size()) {
                i iVar = aVar.c.get(aVar.e);
                aVar.e++;
                if (aVar.a(iVar)) {
                    aVar.a(iVar.a(), iVar.b(), false);
                }
            } else {
                LinkedList<i> linkedList2 = aVar.d;
                if (linkedList2 != null && linkedList2.size() > 0 && aVar.f < aVar.d.size()) {
                    i iVar2 = aVar.d.get(aVar.f);
                    aVar.f++;
                    if (aVar.a(iVar2)) {
                        aVar.a(iVar2.a(), iVar2.b(), true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.a("LoopTimer", th.getMessage(), th);
        }
    }
}
