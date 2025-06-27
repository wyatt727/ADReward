package com.mbridge.msdk.newreward.a;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* compiled from: AdapterManagerImpl.java */
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Deque<e> f3293a;
    private RewardVideoListener c;
    private com.mbridge.msdk.newreward.function.f.e d;
    private com.mbridge.msdk.newreward.function.c.c e;
    private MBridgeIds f;
    private Map g;
    private com.mbridge.msdk.newreward.b.b h;
    private final Object b = new Object();
    private int i = 1;
    private int j = 1;

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object obj) {
        this.c = (RewardVideoListener) obj;
    }

    public d() {
        if (this.f3293a != null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.f3293a = new ConcurrentLinkedDeque();
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object... objArr) {
        com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) objArr[0];
        this.e = cVar;
        com.mbridge.msdk.newreward.b.b bVar = (com.mbridge.msdk.newreward.b.b) objArr[1];
        this.h = bVar;
        final Map mapA = cVar.a("mb_ad_type", Integer.valueOf(bVar.e()), "mb_ad_is_header_bidding", Boolean.valueOf(this.h.f()), "mb_ad_pid", this.h.d(), "mb_ad_unit_id", this.h.c());
        this.f = (MBridgeIds) this.e.a(mapA, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.c.c cVar2 = this.e;
        cVar2.c(cVar2.a("mb_ad_unit_id", this.h.c(), "command_type", com.mbridge.msdk.newreward.function.c.e.UNIT_INIT), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
            }
        });
        com.mbridge.msdk.newreward.function.e.c.a().b().a(this.h.e(), this.h.d(), this.h.c());
        this.e.a((Object) mapA, com.mbridge.msdk.newreward.function.c.e.REQ_SETTING, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.d = (com.mbridge.msdk.newreward.function.f.e) obj;
                d.this.g = mapA;
                if (d.this.h != null) {
                    d.this.h.a(d.this.d);
                }
                ((MBridgeDailyPlayModel) d.this.e.a(mapA, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).setMaxPlayCount(d.this.d.b() == null ? 0 : d.this.d.b().d());
            }
        });
        Map map = this.g;
        map.put("command_type", com.mbridge.msdk.newreward.function.c.e.RESTORE_DB);
        this.e.c(map, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.3
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.b(obj);
            }
        });
        com.mbridge.msdk.newreward.function.c.c cVar3 = this.e;
        cVar3.e(cVar3.a("controller_model", this.h, "command_manager", cVar3, "adapter_manager", this));
        int iA = af.a().a(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.j = iA;
        if (iA <= 0) {
            this.j = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe A[Catch: all -> 0x023b, TryCatch #1 {, blocks: (B:16:0x004b, B:18:0x0051, B:20:0x0053, B:22:0x005a, B:60:0x0189, B:25:0x0062, B:27:0x006c, B:29:0x0076, B:31:0x00b6, B:33:0x00ea, B:35:0x00f2, B:36:0x00fe, B:38:0x011c, B:41:0x0125, B:43:0x012f, B:45:0x0139, B:47:0x013f, B:49:0x0149, B:51:0x015a, B:52:0x0160, B:54:0x0166, B:56:0x0176, B:58:0x017c, B:61:0x01a7, B:62:0x01ad, B:64:0x01b3, B:66:0x01c3, B:68:0x01c9, B:70:0x01da, B:72:0x01f4, B:74:0x01fa, B:75:0x01fe, B:77:0x0204, B:83:0x021a, B:85:0x0222, B:86:0x0228, B:87:0x0239, B:80:0x0213, B:82:0x0217), top: B:97:0x004b, outer: #0, inners: #2 }] */
    @Override // com.mbridge.msdk.newreward.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.mbridge.msdk.newreward.a.e r18, com.mbridge.msdk.newreward.a.b r19) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.a(com.mbridge.msdk.newreward.a.e, com.mbridge.msdk.newreward.a.b):void");
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.c.e eVar2) {
        if (eVar == null) {
            return;
        }
        List<CampaignEx> listA = eVar.x() != null ? eVar.x().a() : null;
        try {
            com.mbridge.msdk.newreward.function.c.c cVar = this.e;
            Object[] objArr = new Object[6];
            objArr[0] = "metrics_data";
            objArr[1] = listA;
            int i = 2;
            objArr[2] = "auto_load";
            if (!eVar.B()) {
                i = 1;
            }
            objArr[3] = Integer.valueOf(i);
            objArr[4] = "cache";
            objArr[5] = 1;
            cVar.a(eVar, eVar2, cVar.a(objArr));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void b(Object obj) {
        for (com.mbridge.msdk.newreward.function.d.a.b bVar : (List) obj) {
            e eVar = new e(false, ((Integer) this.g.get("mb_ad_type")).intValue(), bVar.f(), bVar.c(), bVar.g());
            com.mbridge.msdk.newreward.function.f.a aVar = new com.mbridge.msdk.newreward.function.f.a();
            aVar.a(bVar);
            eVar.a(aVar);
            eVar.a(this.d);
            eVar.b(2);
            eVar.f3297a = new f(this.e);
            eVar.a(this.c);
            this.f3293a.add(eVar);
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.c.b bVar) {
        eVar.b(2);
        eVar.d(true);
        this.e.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, this.e.a("metrics_data", bVar));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void c() {
        e eVarPeek;
        synchronized (this.b) {
            if (this.f3293a.size() == 0) {
                this.h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                this.e.a(this.h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                this.c.onShowFail(this.f, "no adapter_model");
                a("no adapter_model");
                return;
            }
            while (a(2) > this.i) {
                this.f3293a.pollFirst();
            }
            ConcurrentLinkedDeque concurrentLinkedDeque = Build.VERSION.SDK_INT >= 21 ? new ConcurrentLinkedDeque() : null;
            while (true) {
                if (this.f3293a.size() == 0) {
                    break;
                }
                try {
                    eVarPeek = this.f3293a.peek();
                } catch (Exception e) {
                    if (this.f3293a.size() == 1) {
                        this.h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                        this.c.onShowFail(this.f, e.getMessage());
                        a(e.getMessage());
                        break;
                    }
                }
                if (eVarPeek.x().c()) {
                    b(eVarPeek);
                    eVarPeek.f3297a.b(eVarPeek);
                    this.h.a(eVarPeek);
                    this.f3293a.poll();
                    break;
                }
                if (eVarPeek.s() == 2 && !eVarPeek.x().c()) {
                    if (this.f3293a.size() == 1) {
                        this.h.a(eVarPeek);
                        this.c.onShowFail(this.f, "no isReadyCampaign");
                        a("no isReadyCampaign");
                    }
                    this.f3293a.poll();
                } else {
                    if (this.f3293a.size() == 1) {
                        this.h.a(eVarPeek);
                        this.c.onShowFail(this.f, "all campaign is loading");
                        a("all campaign is loading");
                    }
                    concurrentLinkedDeque.push(this.f3293a.poll());
                }
            }
            while (concurrentLinkedDeque.size() != 0) {
                this.f3293a.push((e) concurrentLinkedDeque.poll());
            }
            com.mbridge.msdk.newreward.b.b bVar = this.h;
            if (bVar != null) {
                if (bVar.a() != null) {
                    this.e.a(this.h.a(), com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                } else {
                    this.e.a(this.h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final boolean d() {
        Iterator<e> it = this.f3293a.iterator();
        while (it.hasNext()) {
            if (it.next().x().c()) {
                return true;
            }
        }
        return false;
    }

    private void b(e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.b())) {
            return;
        }
        e eVar2 = null;
        try {
            Deque<e> deque = this.f3293a;
            if (deque != null) {
                Iterator<e> it = deque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e next = it.next();
                    if (next != null && next.a() && (next.x() == null || !next.x().c())) {
                        if (eVar.b().equals(next.z())) {
                            eVar2 = next;
                            break;
                        }
                    }
                }
            }
            if (eVar2 != null) {
                com.mbridge.msdk.newreward.function.c.c cVar = this.e;
                cVar.c(cVar.a("adapter_model", eVar, "queue_first_adapter_model", eVar2), com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private int a(int i) {
        int i2 = 0;
        if (this.f3293a.size() == 0) {
            return 0;
        }
        for (e eVar : this.f3293a) {
            if (i == 1) {
                if (eVar.s() == 1) {
                    i2++;
                }
            } else if (i == 2 && eVar.x().c()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[Catch: Exception -> 0x00b3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b3, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0010, B:9:0x0022, B:11:0x002a, B:13:0x0039, B:15:0x005e), top: B:37:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(com.mbridge.msdk.newreward.a.e r11) {
        /*
            r10 = this;
            java.lang.String r0 = "error_code"
            java.lang.String r1 = "msg"
            r2 = 1
            r3 = 0
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r10.f3293a     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto L37
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r10.f3293a     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> Lb3
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r4.q()     // Catch: java.lang.Exception -> Lb3
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lb3
            if (r5 != 0) goto L37
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto L37
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r10.f3293a     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> Lb3
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> Lb3
            long r4 = r4.o()     // Catch: java.lang.Exception -> Lb3
            goto L39
        L37:
            r4 = 0
        L39:
            com.mbridge.msdk.newreward.function.c.c r6 = r10.e     // Catch: java.lang.Exception -> Lb3
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lb3
            java.lang.String r8 = "adapter_model"
            r7[r3] = r8     // Catch: java.lang.Exception -> Lb3
            r7[r2] = r11     // Catch: java.lang.Exception -> Lb3
            r8 = 2
            java.lang.String r9 = "last_response_empty_time"
            r7[r8] = r9     // Catch: java.lang.Exception -> Lb3
            r8 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> Lb3
            r7[r8] = r4     // Catch: java.lang.Exception -> Lb3
            java.util.Map r4 = r6.a(r7)     // Catch: java.lang.Exception -> Lb3
            com.mbridge.msdk.newreward.function.c.e r5 = com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r4 = r6.b(r4, r5)     // Catch: java.lang.Exception -> Lb3
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto La2
            int r5 = r4.size()     // Catch: java.lang.Exception -> Lb3
            if (r5 <= 0) goto La2
            com.mbridge.msdk.newout.RewardVideoListener r5 = r10.c     // Catch: java.lang.Exception -> Lb1
            com.mbridge.msdk.out.MBridgeIds r6 = new com.mbridge.msdk.out.MBridgeIds     // Catch: java.lang.Exception -> Lb1
            r6.<init>()     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r7 = r4.get(r1)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Lb1
            r5.onVideoLoadFail(r6, r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> Lb1
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lb1
            if (r5 != 0) goto L8a
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb1
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> Lb1
        L8a:
            r0 = -1
            if (r3 != r0) goto L91
            r0 = 880018(0xd6d92, float:1.233168E-39)
            goto L94
        L91:
            r0 = 880002(0xd6d82, float:1.233145E-39)
        L94:
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lb1
            com.mbridge.msdk.foundation.c.b r0 = com.mbridge.msdk.foundation.c.a.a(r3, r0, r1)     // Catch: java.lang.Exception -> Lb1
            r10.a(r11, r0)     // Catch: java.lang.Exception -> Lb1
            goto La3
        La2:
            r2 = r3
        La3:
            if (r2 == 0) goto Lbc
            com.mbridge.msdk.foundation.same.report.d.c r0 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> Lb1
            java.lang.String r11 = r11.z()     // Catch: java.lang.Exception -> Lb1
            r0.c(r11)     // Catch: java.lang.Exception -> Lb1
            goto Lbc
        Lb1:
            r11 = move-exception
            goto Lb5
        Lb3:
            r11 = move-exception
            r2 = r3
        Lb5:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto Lbc
            r11.printStackTrace()
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.c(com.mbridge.msdk.newreward.a.e):boolean");
    }

    private void a(String str) {
        com.mbridge.msdk.newreward.b.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        this.e.a(bVar, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL, this.e.a("reason", str));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final e b() {
        e eVarPeek;
        Deque<e> deque = this.f3293a;
        if (deque == null || deque.size() == 0 || (eVarPeek = this.f3293a.peek()) == null) {
            return null;
        }
        return eVarPeek;
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.f3293a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.f3293a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.f3293a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}
