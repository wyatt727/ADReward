package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DownLoadManager.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f3887a;
    private ThreadPoolExecutor b;
    private boolean c = false;
    private ConcurrentHashMap<String, j> d = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> e;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> g;

    private b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static b getInstance() {
        if (f3887a == null) {
            synchronized (b.class) {
                if (f3887a == null) {
                    f3887a = new b();
                }
            }
        }
        return f3887a;
    }

    public final a a(String str, String str2) {
        j jVarC = c(str);
        if (jVarC != null) {
            return jVarC.a(str2);
        }
        return null;
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f.get(str);
    }

    public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f;
        if (concurrentHashMap == null) {
            this.f = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f.put(str, copyOnWriteArrayList);
    }

    public final CopyOnWriteArrayList<a> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.g;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.g.get(str);
    }

    public final void b(String str, CopyOnWriteArrayList<a> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.g;
        if (concurrentHashMap == null) {
            this.g = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.g.put(str, copyOnWriteArrayList);
    }

    public final j c(String str) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public final boolean a(int i, String str, boolean z) {
        try {
            j jVarC = c(str);
            if (jVarC != null) {
                return jVarC.a(i, z) != null;
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public final boolean a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return a(i, str, z, i2, z2, i3, list, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22, com.mbridge.msdk.foundation.same.report.d.d r23) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.b.a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):boolean");
    }

    public void load(String str) {
        j jVarC = c(str);
        if (jVarC != null) {
            jVarC.a();
        }
    }

    public j createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i, com.mbridge.msdk.videocommon.listener.a aVar) throws ClassNotFoundException {
        j jVar;
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.d.containsKey(str)) {
            jVar = this.d.get(str);
            if (jVar == null) {
                jVar = new j(context, copyOnWriteArrayList, this.b, str, i);
                this.d.put(str, jVar);
            }
            if (i == 94 || i == 287) {
                jVar.a(copyOnWriteArrayList.get(0).getRequestId(), aVar);
            } else {
                jVar.a(aVar);
            }
            jVar.a(copyOnWriteArrayList);
        } else {
            jVar = new j(context, copyOnWriteArrayList, this.b, str, i);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.d.put(str, jVar);
        }
        return jVar;
    }

    public j createUnitCache(Context context, String str, CampaignEx campaignEx, int i, com.mbridge.msdk.videocommon.listener.a aVar) throws ClassNotFoundException {
        j jVar;
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.d.containsKey(str)) {
            jVar = this.d.get(str);
            if (jVar == null) {
                jVar = new j(context, campaignEx, this.b, str, i);
                this.d.put(str, jVar);
            }
            if (i == 94 || i == 287) {
                jVar.a(campaignEx.getRequestId(), aVar);
            } else {
                jVar.a(aVar);
            }
            jVar.a(campaignEx);
        } else {
            jVar = new j(context, campaignEx, this.b, str, i);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.d.put(str, jVar);
        }
        return jVar;
    }

    public final void a(boolean z) {
        this.c = z;
        ConcurrentHashMap<String, j> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j value = it.next().getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayListC;
        a value;
        CampaignEx campaignExL;
        ConcurrentHashMap<String, j> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j value2 = it.next().getValue();
                if (value2 != null && (copyOnWriteArrayListC = value2.c()) != null) {
                    int size = copyOnWriteArrayListC.size();
                    for (int i = 0; i < size; i++) {
                        Map<String, a> map = copyOnWriteArrayListC.get(i);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (campaignExL = value.l()) != null) {
                                String videoUrlEncode = campaignExL.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.k();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public final void b(boolean z) {
        if (z) {
            if (this.c) {
                return;
            }
        } else {
            this.c = false;
        }
        ConcurrentHashMap<String, j> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    public final void a() throws ClassNotFoundException {
        ConcurrentHashMap<String, j> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, j> entry : concurrentHashMap.entrySet()) {
                j value = entry.getValue();
                String key = entry.getKey();
                try {
                    Class.forName("com.mbridge.msdk.videocommon.d.a");
                    com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                    if (cVarA != null) {
                        if (cVarA.w() == 2) {
                            value.b();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e) {
                    ad.b("DownLoadManager", e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            k kVarD = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                            if (kVarD == null) {
                                kVarD = k.e(key);
                            }
                            if (kVarD.k() == 2) {
                                value.b();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e2) {
                        ad.b("DownLoadManager", e2.getMessage());
                    }
                }
            }
        }
    }
}
