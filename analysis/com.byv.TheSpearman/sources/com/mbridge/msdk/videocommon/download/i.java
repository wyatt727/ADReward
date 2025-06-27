package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: UnitCacheControllerRefactor.java */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f3897a;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;
    private final Context c;
    private final String d;
    private com.mbridge.msdk.videocommon.d.c e;
    private final int f;
    private final CopyOnWriteArrayList<CampaignEx> g;
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> h;

    public i(List<CampaignEx> list, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.g = copyOnWriteArrayList;
        this.h = new ConcurrentHashMap<>();
        this.c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.d = str;
        this.f = i;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    public i(CampaignEx campaignEx, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.g = copyOnWriteArrayList;
        this.h = new ConcurrentHashMap<>();
        this.c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.d = str;
        this.f = i;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f3897a = aVar;
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, aVar);
    }

    public final void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.g.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.d + " update error", e);
                }
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.g.add(campaignEx);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.d + " update error", e);
                }
            }
        }
    }

    public final void a() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            ad.a("RewardVideoRefactorManager", this.d + " load campaignExes is null");
            return;
        }
        Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null && next != null) {
                try {
                    String str = next.getRequestId() + next.getId() + next.getVideoUrlEncode();
                    if (!this.h.containsKey(str)) {
                        a(next, str, (com.mbridge.msdk.videocommon.download.a) null);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("RewardVideoRefactorManager", this.d + " handlerCampaignLoadEvent error", e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0164 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:99:0x015b, B:100:0x015e, B:102:0x0164, B:106:0x0171, B:109:0x0178, B:112:0x017f, B:114:0x0185, B:116:0x018f, B:119:0x019f, B:121:0x01a5), top: B:192:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc A[Catch: Exception -> 0x0372, TryCatch #5 {Exception -> 0x0372, blocks: (B:13:0x002d, B:145:0x01c8, B:147:0x01cc, B:148:0x01e2, B:156:0x01f2, B:158:0x01f7, B:159:0x01fa, B:161:0x01fe, B:163:0x0204, B:164:0x0209, B:168:0x0271, B:183:0x031d), top: B:202:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f7 A[Catch: Exception -> 0x0372, TryCatch #5 {Exception -> 0x0372, blocks: (B:13:0x002d, B:145:0x01c8, B:147:0x01cc, B:148:0x01e2, B:156:0x01f2, B:158:0x01f7, B:159:0x01fa, B:161:0x01fe, B:163:0x0204, B:164:0x0209, B:168:0x0271, B:183:0x031d), top: B:202:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: Exception -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c4, blocks: (B:18:0x005e, B:20:0x0068, B:24:0x0076, B:27:0x007e, B:30:0x0086, B:36:0x0097, B:45:0x00bc, B:50:0x00ca, B:52:0x00d4, B:60:0x00e7, B:62:0x00f1, B:66:0x00fc, B:70:0x0109, B:72:0x010f, B:77:0x0122), top: B:198:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109 A[Catch: Exception -> 0x01c4, TryCatch #3 {Exception -> 0x01c4, blocks: (B:18:0x005e, B:20:0x0068, B:24:0x0076, B:27:0x007e, B:30:0x0086, B:36:0x0097, B:45:0x00bc, B:50:0x00ca, B:52:0x00d4, B:60:0x00e7, B:62:0x00f1, B:66:0x00fc, B:70:0x0109, B:72:0x010f, B:77:0x0122), top: B:198:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122 A[Catch: Exception -> 0x01c4, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c4, blocks: (B:18:0x005e, B:20:0x0068, B:24:0x0076, B:27:0x007e, B:30:0x0086, B:36:0x0097, B:45:0x00bc, B:50:0x00ca, B:52:0x00d4, B:60:0x00e7, B:62:0x00f1, B:66:0x00fc, B:70:0x0109, B:72:0x010f, B:77:0x0122), top: B:198:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.util.List, boolean):java.util.List");
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a aVarC = c(campaignEx);
        aVarC.n();
        this.h.put(str, aVarC);
        return aVarC;
    }

    private String b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.e();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " getVideoTemplateUrl error", e);
            }
        }
        return "";
    }

    public final com.mbridge.msdk.videocommon.download.a b() {
        List<com.mbridge.msdk.videocommon.download.a> listA;
        if (this.g.size() == 0) {
            ad.a("RewardVideoRefactorManager", this.d + " isReady campaignExes is null");
            return null;
        }
        try {
            listA = a((List<CampaignEx>) this.g, false);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " isReady error", e);
            }
            listA = null;
        }
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        return listA.get(0);
    }

    private com.mbridge.msdk.videocommon.download.a c(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar;
        com.mbridge.msdk.videocommon.download.a aVar2 = null;
        try {
            aVar = new com.mbridge.msdk.videocommon.download.a(this.c, campaignEx, this.d, f());
        } catch (Exception e) {
            e = e;
        }
        try {
            aVar.a(campaignEx);
            aVar.d(this.f);
            aVar.c(f(campaignEx));
            aVar.b(e());
            aVar.e(d(campaignEx));
            aVar.a((c) null);
            aVar.a(new a(this.d, this.b, this.f3897a));
            return aVar;
        } catch (Exception e2) {
            e = e2;
            aVar2 = aVar;
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " createAndStartCampaignDownloadTask error " + e.getMessage());
            }
            return aVar2;
        }
    }

    private com.mbridge.msdk.videocommon.d.c c(String str) {
        try {
            if (this.e == null) {
                this.e = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, this.f == 287);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " getRewardUnitSetting error " + e.getMessage());
            }
        }
        return this.e;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            ad.a("RewardVideoRefactorManager", this.d + " getVideoCtnType error " + e.getMessage());
            return 1;
        }
    }

    private boolean a(String str, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar) {
        boolean zB;
        if (campaignEx != null && aVar != null) {
            try {
                if (aVar.b()) {
                    ad.a("RewardVideoRefactorManager", this.d + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !ai.l(str)) || an.a(str)) {
                    return true;
                }
                if (campaignEx == null) {
                    zB = false;
                } else {
                    zB = (campaignEx.isMraid() || TextUtils.isEmpty(str) || (campaignEx.getLoadTimeoutState() == 1 && !e(campaignEx)) || ((campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) || an.b(f.a(str)))) ? true : an.b(f.b(str));
                }
                if (zB) {
                    return true;
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.d + " checkEndCardDownload error " + th.getMessage());
                }
            }
        }
        return false;
    }

    public final com.mbridge.msdk.videocommon.download.a c() {
        try {
            return b();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.d + " getCampaignDownLoadTask error:" + th.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> d() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.h);
            return copyOnWriteArrayList;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.d + " getCampaignDownLoadTaskList error:" + e.getMessage());
            return null;
        }
    }

    private boolean e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.a("RewardVideoRefactorManager", this.d + " isPlayerAbleAds error:" + th.getMessage());
            return false;
        }
    }

    public final void b(String str) {
        com.mbridge.msdk.videocommon.download.a aVarRemove;
        CampaignEx campaignExL;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.h.containsKey(str) || (aVarRemove = this.h.remove(str)) == null || (campaignExL = aVarRemove.l()) == null) {
                return;
            }
            this.g.remove(campaignExL);
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " removeCampaignDownloadTask campaign name: " + campaignExL.getAppName());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.d + " removeCampaignDownloadTask error:" + e.getMessage());
            }
        }
    }

    private int f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    private int g() {
        try {
            return c(this.d).r();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.a("RewardVideoRefactorManager", this.d + " getRewardReadyRate error:" + th.getMessage());
            return 100;
        }
    }

    /* compiled from: UnitCacheControllerRefactor.java */
    private static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3898a;
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;
        private final com.mbridge.msdk.videocommon.listener.a c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f3898a = str;
            this.b = concurrentHashMap;
            this.c = aVar;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f3898a + " videoDownloadListener onDownLoadDone error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f3898a + " videoDownloadListener onDownLoadDone error: " + e2.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f3898a + " videoDownloadListener onDownLoadFailed error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f3898a + " videoDownloadListener onDownLoadFailed error: " + e2.getMessage());
                        }
                    }
                }
            }
        }
    }

    private int e() {
        com.mbridge.msdk.videocommon.d.c cVarC = c(this.d);
        if (cVarC == null) {
            return 0;
        }
        try {
            return cVarC.s();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            ad.a("RewardVideoRefactorManager", this.d + " getCDRate error " + e.getMessage());
            return 0;
        }
    }

    private int f() {
        if (TextUtils.isEmpty(this.d)) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.d.c cVarC = c(this.d);
            if (cVarC != null) {
                return cVarC.w();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.d + " getDlnet error " + e.getMessage());
            }
        }
        return 1;
    }
}
