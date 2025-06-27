package com.mbridge.msdk.mbnative.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* compiled from: APICache.java */
/* loaded from: classes4.dex */
public final class a extends b<String, List<Campaign>> {

    /* renamed from: a, reason: collision with root package name */
    private f f3097a = f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
    private int b;

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> a(String str, int i) {
        String str2 = str;
        List<CampaignEx> listA = this.f3097a.a(str2, i, 2, this.b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 2)) {
            this.f3097a.a(str2, 2, this.b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list) {
        String str2 = str;
        List<Campaign> list2 = list;
        if (TextUtils.isEmpty(str2) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f3097a.a(str2, 1, this.b, false);
        this.f3097a.a(str2, 2, this.b, false);
        for (int i = 0; i < list2.size(); i++) {
            CampaignEx campaignEx = (CampaignEx) list2.get(i);
            campaignEx.setCacheLevel(1);
            this.f3097a.a(campaignEx, str2, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list, String str2) {
        final String str3 = str;
        final List<Campaign> list2 = list;
        boolean z = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str3) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f3097a.a(str3, 1, this.b, z);
        this.f3097a.a(str3, 2, this.b, z);
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                for (int i = 0; i < list2.size(); i++) {
                    CampaignEx campaignEx = (CampaignEx) list2.get(i);
                    campaignEx.setCacheLevel(1);
                    a.this.f3097a.a(campaignEx, str3, 1);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> b(String str, int i) {
        String str2 = str;
        List<CampaignEx> listA = this.f3097a.a(str2, i, 1, this.b);
        if (listA == null) {
            return null;
        }
        if (!a(listA, 1)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listA);
            return arrayList;
        }
        for (int i2 = 0; i2 < listA.size(); i2++) {
            CampaignEx campaignEx = listA.get(i2);
            campaignEx.setCacheLevel(2);
            this.f3097a.a(campaignEx, str2, 1);
        }
        return null;
    }

    public a(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L64
            int r1 = r11.size()
            if (r1 <= 0) goto L64
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r11 = r11.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            long r3 = r11.getTimestamp()
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r11 = 1
            if (r12 == r11) goto L40
            r9 = 2
            if (r12 == r9) goto L22
            goto L5e
        L22:
            com.mbridge.msdk.c.h r12 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.foundation.controller.c r5 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r5 = r5.k()
            com.mbridge.msdk.c.g r12 = r12.b(r5)
            if (r12 != 0) goto L3b
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r12 = com.mbridge.msdk.c.i.a()
        L3b:
            long r5 = r12.ac()
            goto L5d
        L40:
            com.mbridge.msdk.c.h r12 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.foundation.controller.c r5 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r5 = r5.k()
            com.mbridge.msdk.c.g r12 = r12.b(r5)
            if (r12 != 0) goto L59
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r12 = com.mbridge.msdk.c.i.a()
        L59:
            long r5 = r12.ab()
        L5d:
            long r5 = r5 * r7
        L5e:
            long r1 = r1 - r3
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L64
            return r11
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.a.a.a(java.util.List, int):boolean");
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final void a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f3097a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                this.f3097a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.b, z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
