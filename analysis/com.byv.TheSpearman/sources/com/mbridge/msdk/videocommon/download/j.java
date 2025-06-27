package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.videocommon.download.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: UnitCacheCtroller.java */
/* loaded from: classes4.dex */
public final class j {
    private com.mbridge.msdk.videocommon.listener.a e;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> g;
    private Context j;
    private ExecutorService k;
    private String m;
    private com.mbridge.msdk.videocommon.d.c n;
    private int p;
    private i q;
    private boolean r;
    private List<CampaignEx> c = new ArrayList();
    private boolean d = true;
    private String f = "";
    private c h = new c() { // from class: com.mbridge.msdk.videocommon.download.j.1
        @Override // com.mbridge.msdk.videocommon.download.c
        public final void a(long j, int i) {
            if (i == 5 || i == 4) {
                j.this.d = true;
                j.this.a();
            }
            if (i == 2) {
                j.this.d = true;
            }
        }
    };
    private CopyOnWriteArrayList<Map<String, a>> i = new CopyOnWriteArrayList<>();
    private long l = 3600;
    private int o = 1;

    /* renamed from: a, reason: collision with root package name */
    k f3899a = null;
    k b = null;

    public j(Context context, List<CampaignEx> list, ExecutorService executorService, String str, int i) throws ClassNotFoundException {
        this.p = 1;
        try {
            boolean zA = h.a.f3896a.a(i);
            this.r = zA;
            if (zA) {
                this.m = str;
                this.p = i;
                this.q = new i(list, str, i);
                return;
            }
        } catch (Exception unused) {
            this.q = null;
            this.r = false;
        }
        this.j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list2 = this.c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.k = executorService;
        this.m = str;
        this.p = i;
        b(this.c);
    }

    public j(Context context, CampaignEx campaignEx, ExecutorService executorService, String str, int i) throws ClassNotFoundException {
        this.p = 1;
        try {
            boolean zA = h.a.f3896a.a(i);
            this.r = zA;
            if (zA) {
                this.m = str;
                this.p = i;
                this.q = new i(campaignEx, str, i);
                return;
            }
        } catch (Exception unused) {
            this.q = null;
            this.r = false;
        }
        this.j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list = this.c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.k = executorService;
        this.m = str;
        this.p = i;
        b(this.c);
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            iVar.a(aVar);
        } else {
            this.e = aVar;
        }
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            iVar.a(str, aVar);
            return;
        }
        if (this.g == null) {
            this.g = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.g.put(str, aVar);
    }

    public final void a(List<CampaignEx> list) throws ClassNotFoundException {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            iVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        b(this.c);
    }

    public final void a(CampaignEx campaignEx) throws ClassNotFoundException {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            iVar.a(campaignEx);
            return;
        }
        List<CampaignEx> list = this.c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        b(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.b(java.util.List):void");
    }

    private void d() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((this.r && this.q != null) || af.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.i) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = 0;
                while (i < this.i.size()) {
                    Map<String, a> map = this.i.get(i);
                    Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        a value = it.next().getValue();
                        if (value != null) {
                            if (jCurrentTimeMillis - value.g() > this.l * 1000 && value.k() == 1) {
                                value.b(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                value.a(this.o);
                                value.s();
                                this.i.remove(map);
                                i--;
                            }
                            if (value.k() != 1 && value.k() != 5 && value.k() != 0) {
                                value.s();
                                this.i.remove(map);
                                i--;
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void e() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.i.size()) {
                        Map<String, a> map = this.i.get(i);
                        Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            a value = it.next().getValue();
                            if (value != null && value.l() != null && value.f()) {
                                value.r();
                                this.i.remove(map);
                                i--;
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
                ad.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0229 A[PHI: r6
      0x0229: PHI (r6v33 java.lang.String) = (r6v32 java.lang.String), (r6v32 java.lang.String), (r6v35 java.lang.String) binds: [B:129:0x0203, B:134:0x0210, B:140:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0231 A[Catch: all -> 0x026f, Exception -> 0x0271, TryCatch #3 {Exception -> 0x0271, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:45:0x00c8, B:50:0x00d7, B:55:0x00ea, B:57:0x00f0, B:130:0x0205, B:133:0x020e, B:135:0x0212, B:137:0x021c, B:139:0x0222, B:145:0x0231, B:147:0x023b, B:149:0x0241, B:127:0x01f2), top: B:183:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r28, int r29, boolean r30, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r31, boolean r32, com.mbridge.msdk.foundation.same.report.d.d r33) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):java.util.List");
    }

    public final boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx == null || !a(new a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, str, this.o), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return e(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155 A[Catch: all -> 0x0282, Exception -> 0x0284, TRY_ENTER, TryCatch #1 {Exception -> 0x0284, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x0071, B:29:0x0076, B:31:0x007e, B:32:0x008e, B:34:0x0094, B:36:0x00a2, B:39:0x00aa, B:40:0x00b4, B:42:0x00ba, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00f6, B:59:0x00fc, B:60:0x0104, B:86:0x0155, B:88:0x0167, B:94:0x0178, B:96:0x017e, B:98:0x0194, B:102:0x019e, B:110:0x01aa, B:112:0x01b7, B:114:0x01c1, B:116:0x01ce, B:122:0x01e8, B:124:0x01ee, B:126:0x01f4, B:131:0x0209, B:137:0x021c, B:140:0x0228, B:143:0x0230, B:145:0x0234, B:147:0x023e, B:151:0x0246, B:154:0x0250, B:156:0x025a, B:64:0x0111, B:66:0x0117, B:68:0x0121, B:71:0x012a, B:73:0x0130, B:75:0x0136, B:78:0x0141, B:82:0x0149, B:19:0x0033, B:21:0x003f, B:27:0x0057, B:164:0x0278, B:25:0x0049), top: B:178:0x0019, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0178 A[Catch: all -> 0x0282, Exception -> 0x0284, TRY_ENTER, TryCatch #1 {Exception -> 0x0284, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x0071, B:29:0x0076, B:31:0x007e, B:32:0x008e, B:34:0x0094, B:36:0x00a2, B:39:0x00aa, B:40:0x00b4, B:42:0x00ba, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00f6, B:59:0x00fc, B:60:0x0104, B:86:0x0155, B:88:0x0167, B:94:0x0178, B:96:0x017e, B:98:0x0194, B:102:0x019e, B:110:0x01aa, B:112:0x01b7, B:114:0x01c1, B:116:0x01ce, B:122:0x01e8, B:124:0x01ee, B:126:0x01f4, B:131:0x0209, B:137:0x021c, B:140:0x0228, B:143:0x0230, B:145:0x0234, B:147:0x023e, B:151:0x0246, B:154:0x0250, B:156:0x025a, B:64:0x0111, B:66:0x0117, B:68:0x0121, B:71:0x012a, B:73:0x0130, B:75:0x0136, B:78:0x0141, B:82:0x0149, B:19:0x0033, B:21:0x003f, B:27:0x0057, B:164:0x0278, B:25:0x0049), top: B:178:0x0019, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.videocommon.download.a a(int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    public static boolean a(a aVar, int i) {
        long jM = aVar.m();
        long j = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (aVar.l() != null && !TextUtils.isEmpty(aVar.l().getVideoUrlEncode())) {
                return true;
            }
        } else if (j > 0 && jM * 100 >= j * i) {
            if (i != 100 || aVar.k() == 5) {
                return true;
            }
            aVar.s();
            return false;
        }
        return false;
    }

    private static boolean a(a aVar, int i, boolean z) {
        long jM = aVar.m();
        long j = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExL = aVar.l();
        if (campaignExL != null) {
            if (campaignExL.getRsIgnoreCheckRule() != null && campaignExL.getRsIgnoreCheckRule().size() > 0 && campaignExL.getRsIgnoreCheckRule().contains(0)) {
                ad.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExL.getIsTimeoutCheckVideoStatus() == 1 && campaignExL.getVideoCheckType() == 1) {
                return true;
            }
            if (z && campaignExL.getVideoCheckType() == 1) {
                if (i == 0) {
                    return true;
                }
                if ((j != 0 || jM != 0) && jM >= (i / 100) * j) {
                    campaignExL.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !ai.l(str)) || an.a(str) || b(str, campaignEx);
            }
            ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !c(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return an.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || an.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    private boolean a(int i, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            ad.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            ad.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i, boolean z) {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            return iVar.c();
        }
        try {
            return a(i, z);
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    public final a a(String str) {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            return iVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, a>> it = this.i.iterator();
                while (it.hasNext()) {
                    Map<String, a> next = it.next();
                    if (next != null && next.containsKey(str)) {
                        return next.get(str);
                    }
                }
            } catch (Throwable unused) {
                ad.b("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
            return null;
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, a> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199 A[Catch: all -> 0x020f, TryCatch #2 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:106:0x01a9, B:110:0x01af, B:112:0x01b3, B:116:0x01c1, B:120:0x01ca, B:122:0x01d5, B:124:0x01d9, B:127:0x01dd, B:130:0x01e3, B:132:0x01ee, B:136:0x01f6, B:137:0x01fb, B:143:0x0208, B:142:0x0205, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:144:0x020d), top: B:154:0x0016, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db A[Catch: all -> 0x020f, TryCatch #2 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:106:0x01a9, B:110:0x01af, B:112:0x01b3, B:116:0x01c1, B:120:0x01ca, B:122:0x01d5, B:124:0x01d9, B:127:0x01dd, B:130:0x01e3, B:132:0x01ee, B:136:0x01f6, B:137:0x01fb, B:143:0x0208, B:142:0x0205, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:144:0x020d), top: B:154:0x0016, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[Catch: all -> 0x020f, TryCatch #2 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:106:0x01a9, B:110:0x01af, B:112:0x01b3, B:116:0x01c1, B:120:0x01ca, B:122:0x01d5, B:124:0x01d9, B:127:0x01dd, B:130:0x01e3, B:132:0x01ee, B:136:0x01f6, B:137:0x01fb, B:143:0x0208, B:142:0x0205, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:144:0x020d), top: B:154:0x0016, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a():void");
    }

    public final void b() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((!this.r || this.q == null) && (copyOnWriteArrayList = this.i) != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                a value = it2.next().getValue();
                                if (value != null && value.k() == 1) {
                                    value.b("playing and stop download");
                                    value.s();
                                    this.i.remove(next);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("UnitCacheCtroller", th.getMessage());
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, a>> c() {
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            return iVar.d();
        }
        return this.i;
    }

    private boolean c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f3899a;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("UnitCacheCtroller", e.getMessage());
            return 100;
        }
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        i iVar;
        if (this.r && (iVar = this.q) != null) {
            iVar.b(str);
            return;
        }
        try {
            synchronized (this.i) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.i) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, a> entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.i.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("UnitCacheCtroller", e.getMessage());
            }
        }
    }

    private int e(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.b == null) {
                    this.b = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.m);
                }
                return this.b.p();
            }
            if (campaignEx.getAdType() == 42) {
                return d(null);
            }
            if (this.n == null) {
                this.n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.m, false);
            }
            return this.n.r();
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", 1);
                dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    dVar.a("resumed_breakpoint", "2");
                } else {
                    dVar.a("resumed_breakpoint", "1");
                }
                dVar.a("resource_type", 4);
                dVar.a("scenes", "1");
                dVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }
}
