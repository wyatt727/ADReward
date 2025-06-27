package com.mbridge.msdk.videocommon.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: VideoCampaignCache.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3872a = "com.mbridge.msdk.videocommon.a.a";
    private static a b;
    private f c;

    private a() {
        try {
            Context contextC = c.m().c();
            if (contextC != null) {
                this.c = f.a(h.a(contextC));
            } else {
                ad.b(f3872a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i) {
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.c.a(str, 0, 0, i)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : listA) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e) {
                e = e;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a(String str, List<CampaignEx> list, String str2, int i) {
        f fVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (fVar = this.c) == null) {
            return;
        }
        fVar.a(str, list, str2, i);
    }

    public final void a(String str, List<CampaignEx> list) {
        f fVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (fVar = this.c) == null) {
            return;
        }
        fVar.b(str, list);
    }

    public final void a(String str, List<CampaignEx> list, String str2) {
        f fVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (fVar = this.c) == null) {
                return;
            }
            fVar.a(str, list, str2);
        } catch (Exception e) {
            ad.b(f3872a, e.getMessage());
        }
    }

    public final void a(String str, String str2) {
        if (this.c == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.c.f(str, str2);
    }

    public final List<CampaignEx> a(String str, int i, boolean z) {
        return a(str, i, z, "");
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i, boolean z, String str2) {
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.d.a aVarB = b.a().b();
            long jF = aVarB != null ? aVarB.f() : 0L;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                listA = this.c.a(str, 0, 0, i, str2);
            } else {
                listA = this.c.a(str, 0, 0, i, false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (listA == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : listA) {
                    if (campaignEx != null && (campaignEx.getReadyState() == 0 || campaignEx.getLoadTimeoutState() == 1)) {
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jF >= timestamp)) {
                            copyOnWriteArrayList2.add(campaignEx);
                        }
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e) {
                e = e;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.a aVarB = b.a().b();
            long jF = aVarB != null ? aVarB.f() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (list == null || list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jF >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.c.d(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int b(String str, int i, boolean z, String str2) {
        List<CampaignEx> listA;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                listA = this.c.a(str, 0, 0, i, str2);
            } else {
                listA = this.c.a(str, 0, 0, i, false);
            }
            if (listA == null) {
                return 0;
            }
            for (CampaignEx campaignEx : listA) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final List<CampaignEx> b(String str, int i, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.c.a(str, 0, 0, i, z);
        } catch (Exception e) {
            ad.b(f3872a, e.getLocalizedMessage());
            return null;
        }
    }

    public final List<CampaignEx> c(String str, int i, boolean z, String str2) {
        long jAc;
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            g gVarB = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (gVarB != null) {
                jAc = gVarB.ac();
            } else {
                com.mbridge.msdk.c.h.a();
                jAc = i.a().ac();
            }
            long j = jAc * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                listA = this.c.a(str, 0, 0, i, str2);
            } else {
                listA = this.c.a(str, 0, 0, i, false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (listA == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : listA) {
                    if (campaignEx != null && campaignEx.getReadyState() == 0) {
                        long plctb = campaignEx.getPlctb() * 1000;
                        long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                        if ((plctb <= 0 && j >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    d.c(str, campaignEx.getRequestId());
                }
                this.c.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.c.b(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMapF;
        try {
            if (TextUtils.isEmpty(str) || (concurrentHashMapF = this.c.f(str)) == null || concurrentHashMapF.size() <= 0) {
                return;
            }
            g gVarB = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (gVarB == null) {
                com.mbridge.msdk.c.h.a();
                gVarB = i.a();
            }
            long jAc = gVarB != null ? gVarB.ac() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : concurrentHashMapF.values()) {
                if (cVar != null) {
                    long jE = cVar.e();
                    if (jE <= 0) {
                        jE = jAc;
                    }
                    if (cVar.f() + (jE * 1000) < jCurrentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        ad.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        c(str, cVar.a());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(String str, String str2) {
        f fVar = this.c;
        if (fVar != null) {
            fVar.e(str, str2);
        }
    }

    public final void b(String str, int i) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> listD = this.c.d(str);
            if (listD == null || listD.size() <= 0 || (size = listD.size() - i) <= 0) {
                return;
            }
            for (int i2 = 0; i2 < size; i2++) {
                c(str, listD.get(i2).a());
                d.c(str, listD.get(i2).a());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void c(String str, String str2) {
        try {
            this.c.c(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.c.a(list, str, str2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void a(long j, String str) {
        try {
            this.c.a(j, str);
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(f3872a, e.getMessage());
        }
    }

    public final synchronized void c(String str, int i) {
        int iJ;
        try {
            g gVarB = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (gVarB == null) {
                com.mbridge.msdk.c.h.a();
                gVarB = i.a();
            }
            iJ = gVarB.j();
        } catch (Exception e) {
            ad.b(f3872a, e.getMessage());
        }
        if (iJ == 0) {
            return;
        }
        boolean z = true;
        List<CampaignEx> listB = this.c.b(str, i, iJ == 2);
        if (listB != null && listB.size() > 0) {
            for (CampaignEx campaignEx : listB) {
                String requestIdNotice = campaignEx.getRequestIdNotice();
                String id = campaignEx.getId();
                com.mbridge.msdk.videocommon.a.b(campaignEx.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
            }
        }
        f fVar = this.c;
        if (iJ != 2) {
            z = false;
        }
        fVar.a(str, i, z);
    }
}
