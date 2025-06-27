package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.download.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: RewardMVVideoAdapter.java */
/* loaded from: classes4.dex */
public final class c {
    private boolean A;
    private String C;
    private int D;
    private int E;
    private int F;
    private CampaignUnit G;
    private CopyOnWriteArrayList<CampaignEx> H;
    private String K;
    private a L;
    private List<CampaignEx> S;
    private CopyOnWriteArrayList<CampaignEx> T;
    private List<CampaignEx> U;
    private Context k;
    private String l;
    private String m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private String r;
    private h s;
    private volatile com.mbridge.msdk.reward.adapter.a t;
    private com.mbridge.msdk.videocommon.d.c u;
    private boolean z;
    private boolean v = false;
    private boolean w = false;

    /* renamed from: a, reason: collision with root package name */
    public Object f3411a = new Object();
    private CopyOnWriteArrayList<CampaignEx> x = new CopyOnWriteArrayList<>();
    private int y = 2;
    private String B = "";
    private boolean I = false;
    private long J = 0;
    private boolean M = false;
    private boolean N = false;
    public String b = "";
    public String c = "";
    public String d = "";
    private Handler O = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.reward.adapter.c.1
        /* JADX WARN: Removed duplicated region for block: B:92:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0257  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r19) {
            /*
                Method dump skipped, instructions count: 1208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };
    private boolean P = false;
    private long Q = 0;
    volatile boolean e = false;
    volatile boolean f = false;
    volatile boolean g = false;
    volatile boolean h = false;
    volatile boolean i = false;
    public volatile boolean j = false;
    private String R = "";

    public final String a(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA;
        CampaignEx campaignEx;
        if (z) {
            if (TextUtils.isEmpty(this.c) && (copyOnWriteArrayListA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l)) != null && copyOnWriteArrayListA.size() > 0 && (campaignEx = copyOnWriteArrayListA.get(0)) != null) {
                this.c = campaignEx.getRequestId();
            }
            return this.c;
        }
        return this.b;
    }

    public final void b(boolean z) {
        this.z = z;
    }

    public final void c(boolean z) {
        this.A = z;
    }

    public final void a(String str) {
        this.B = str;
    }

    public final void a(int i) {
        this.y = i;
    }

    public final String a() {
        return this.l;
    }

    public final boolean a(CampaignEx campaignEx, boolean z, com.mbridge.msdk.foundation.c.b bVar, int i, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        com.mbridge.msdk.foundation.b.c cVar;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(this.l, this.z);
        boolean z2 = false;
        if (aVar.a(this.K)) {
            return false;
        }
        if (!this.j) {
            this.j = true;
            cVar2 = aVar.a(this.K, bVar2, campaignEx, bVar, i, this);
            if (cVar2 != null && cVar2.g() > com.mbridge.msdk.foundation.b.c.f2754a) {
                if (cVar2.a() != null && cVar2.a().size() > 0) {
                    a(cVar2.a(), true, true);
                } else if (cVar2.g() == com.mbridge.msdk.foundation.b.c.c && bVar != null) {
                    bVar.b(com.mbridge.msdk.foundation.c.a.b(880038));
                    bVar.b(cVar2.b());
                }
            }
            cVar = cVar2;
            aVar.a(bVar2, this.K, cVar, (List<a.C0262a>) null, (JSONObject) null, 3);
            return z2;
        }
        cVar2.d("isCandidate:false");
        cVar2.a(com.mbridge.msdk.foundation.b.c.c);
        cVar = cVar2;
        z2 = true;
        aVar.a(bVar2, this.K, cVar, (List<a.C0262a>) null, (JSONObject) null, 3);
        return z2;
    }

    public c(Context context, String str, String str2) {
        try {
            this.k = context.getApplicationContext();
            this.l = str2;
            this.m = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            this.u = cVar;
            if (cVar == null || cVar.D() * 1000 == com.mbridge.msdk.foundation.same.a.K) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.K = this.u.D() * 1000;
        } catch (Throwable th) {
            ad.a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    private boolean a(List<CampaignEx> list, boolean z, int i, boolean z2) {
        return a(list, z, i, false, z2);
    }

    public final boolean a(List<CampaignEx> list, boolean z, int i) {
        return a(list, z, i, false, false);
    }

    public final boolean a(List<CampaignEx> list, boolean z) throws ClassNotFoundException {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx == null) {
                return false;
            }
            com.mbridge.msdk.videocommon.download.b bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
            String str = this.l;
            j jVarC = bVar.c(str);
            if (jVarC == null) {
                jVarC = bVar.createUnitCache(com.mbridge.msdk.foundation.controller.c.m().c(), str, (CopyOnWriteArrayList<CampaignEx>) list, 94, (com.mbridge.msdk.videocommon.listener.a) null);
            }
            if (jVarC != null ? jVarC.a(list, str) : false) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        ad.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e())) {
                            ad.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        ad.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            ad.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public final boolean a(List<CampaignEx> list, boolean z, int i, boolean z2, boolean z3) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            boolean zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.l, this.A, list.size(), z, i, list, z2, dVar);
            dVar.a("event_name", "is_ready_crwtpl_" + zA);
            if (z3) {
                a(bVar, dVar, list);
            }
            if (zA) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z3) {
                        dVar.a("event_name", "is_ready_crwtpl_" + zA);
                        dVar.a("reason", "h5 big template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                } else {
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        return true;
                    }
                    String str = this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e();
                    if (z3) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z3) {
                        dVar.a("event_name", "is_ready_crwtpl_" + zA);
                        dVar.a("reason", "h5 template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                }
            }
        } else {
            dVar.a("event_name", "is_ready_crwtpl_empty");
            dVar.a("reason", "campaign list is empty error");
        }
        a(bVar, dVar, list);
        return false;
    }

    public final boolean b() {
        return d(false);
    }

    public final boolean d(boolean z) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = com.mbridge.msdk.videocommon.a.a.a().a(this.l, 1, this.A, this.B);
        if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayListA.get(0);
            int iB = com.mbridge.msdk.videocommon.a.a.a().b(this.l, 1, this.A, this.B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListA.size() >= iB) {
                return a(copyOnWriteArrayListA, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z);
            }
            if (z) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("event_name", "is_ready_cltr");
                dVar.a("reason", "nscpt error");
                a(bVar, dVar, copyOnWriteArrayListA);
            }
            return false;
        }
        ad.a("RewardVideoController", "database has not can use data");
        if (z) {
            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar2.a("event_name", "is_ready_cse");
            dVar2.a("reason", "no effective campaign list");
        }
        return false;
    }

    public final boolean c() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.a.a.a().c(this.l, 1, this.A, this.B);
        if (listC != null && listC.size() > 0) {
            CampaignEx campaignEx = listC.get(0);
            int iB = com.mbridge.msdk.videocommon.a.a.a().b(this.l, 1, this.A, this.B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iB) {
                return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
            }
            return false;
        }
        ad.a("test_isReay_db", "database has not can use data");
        return false;
    }

    public final void a(h hVar, String str, String str2, int i, String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            this.s = hVar;
            if (this.k != null && !an.a(this.l)) {
                Intent intent = new Intent(this.k, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.l);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.m);
                intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.z);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.A);
                intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.l);
                boolean z = false;
                if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                    CampaignEx campaignEx = copyOnWriteArrayListA.get(0);
                    if (campaignEx != null) {
                        this.c = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z = true;
                    }
                    g();
                } else {
                    h hVar2 = this.s;
                    if (hVar2 != null) {
                        hVar2.a(bVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z);
                if (this.z) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.D);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.E);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.F);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.m, this.l, this.u);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m() != null && com.mbridge.msdk.foundation.controller.c.m().e() != null) {
                        ((Activity) com.mbridge.msdk.foundation.controller.c.m().e()).startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    ad.b("RewardMVVideoAdapter", th.getMessage());
                }
                intent.addFlags(268435456);
                this.k.startActivity(intent);
                return;
            }
            h hVar3 = this.s;
            if (hVar3 != null) {
                hVar3.a(bVar, "context or unitid is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            h hVar4 = this.s;
            if (hVar4 != null) {
                hVar4.a(bVar, "show failed, exception is " + e.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r5 = this;
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r0 = r0.c()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.db.b.a(r0)
            java.lang.String r1 = r5.l
            java.lang.String r2 = r5.c
            java.util.List r0 = r0.a(r1, r2)
            if (r0 == 0) goto La6
            int r1 = r0.size()
            java.lang.String r2 = r5.l
            java.lang.String r2 = com.mbridge.msdk.foundation.same.a.d.b(r2)
            if (r1 != 0) goto L23
            return
        L23:
            r3 = 1
            java.lang.String r4 = ""
            if (r1 != r3) goto L44
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r3 = (com.mbridge.msdk.foundation.entity.d) r3     // Catch: java.lang.Exception -> L9c
            java.lang.String r4 = r3.d()     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r0 = (com.mbridge.msdk.foundation.entity.d) r0     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L9c
            goto L70
        L44:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto L6f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L9c
        L4e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r1 = (com.mbridge.msdk.foundation.entity.d) r1     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto L4e
            java.lang.String r3 = r1.a()     // Catch: java.lang.Exception -> L9c
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L4e
            java.lang.String r4 = r1.d()     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r1.b()     // Catch: java.lang.Exception -> L9c
            goto L70
        L6f:
            r0 = r4
        L70:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto La6
            java.lang.String r1 = r5.c     // Catch: java.lang.Exception -> L9c
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto La6
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L9c
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.db.b.a(r1)     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = r5.l     // Catch: java.lang.Exception -> L9c
            r1.b(r2, r3)     // Catch: java.lang.Exception -> L9c
            java.lang.String r1 = r5.l     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = r5.c     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.same.a.d.a(r1, r2, r0)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r5.l     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.same.a.d.c(r0)     // Catch: java.lang.Exception -> L9c
            goto La6
        L9c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "RewardMVVideoAdapter"
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.g():void");
    }

    public final void e(boolean z) {
        this.P = z;
    }

    public final void a(int i, int i2, boolean z, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        a(i, i2, z, "", this.I, bVar);
    }

    public final void a(int i, int i2, boolean z, String str, boolean z2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        CampaignEx campaignEx;
        this.o = i;
        this.p = i2;
        this.q = z;
        this.K = str;
        this.I = z2;
        boolean zA = false;
        this.j = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.H.clear();
        }
        List<CampaignEx> list = this.S;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.T;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.e = false;
        this.f = false;
        synchronized (this.f3411a) {
            if (this.g) {
                this.g = false;
            }
        }
        this.i = false;
        this.h = false;
        try {
            zA = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(this.k);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
        if (!zA) {
            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (bVar != null) {
                bVar.a(bVarB);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", bVar);
            return;
        }
        if (this.k == null) {
            com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (bVar != null) {
                bVar.a(bVarB2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
            return;
        }
        if (an.a(this.l)) {
            com.mbridge.msdk.foundation.c.b bVarB3 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (bVar != null) {
                bVar.a(bVarB3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
            return;
        }
        if (this.u == null) {
            com.mbridge.msdk.foundation.c.b bVarB4 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (bVar != null) {
                bVar.a(bVarB4);
            }
            b("RewardUnitSetting is null", bVar);
            return;
        }
        l();
        m();
        ad.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        i();
        b(str, z2, bVar);
    }

    private void a(String str, boolean z, final com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            if (this.k == null) {
                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (bVar != null) {
                    bVar.a(bVarB);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
                return;
            }
            if (an.a(this.l)) {
                com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (bVar != null) {
                    bVar.a(bVarB2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
                return;
            }
            if (this.u == null) {
                com.mbridge.msdk.foundation.c.b bVarB3 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (bVar != null) {
                    bVar.a(bVarB3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", bVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.J < this.u.a() * 1000) {
                    com.mbridge.msdk.foundation.c.b bVarB4 = com.mbridge.msdk.foundation.c.a.b(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (bVar != null) {
                        bVar.a(bVarB4);
                        bVar.c(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", bVar);
                    return;
                }
            }
            e eVarA = new d(this.m, this.l, this.z, this.u, bVar != null ? bVar.f() : "").a(this.q, this.r, this.n, k(), "", this.C, str, z, this.D);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.c.b bVarB5 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (bVar != null) {
                    bVar.a(bVarB5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", bVar);
                return;
            }
            this.Q = System.currentTimeMillis();
            com.mbridge.msdk.reward.d.b bVar2 = new com.mbridge.msdk.reward.d.b(this.k);
            com.mbridge.msdk.reward.d.a aVar = new com.mbridge.msdk.reward.d.a() { // from class: com.mbridge.msdk.reward.adapter.c.2
                @Override // com.mbridge.msdk.reward.d.a
                public final void a(CampaignUnit campaignUnit) throws Throwable {
                    CampaignEx campaignEx;
                    try {
                        c.a(c.this, campaignUnit);
                        c.b(c.this, campaignUnit);
                        if (campaignUnit != null) {
                            c.this.b = campaignUnit.getRequestId();
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                        if (c.this.H != null && c.this.H.size() > 0 && (campaignEx = (CampaignEx) c.this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                            c.this.H.clear();
                        }
                        if (c.this.S != null) {
                            c.this.S.clear();
                        }
                        c.this.e = false;
                        c.this.f = false;
                        synchronized (c.this.f3411a) {
                            if (c.this.g) {
                                c.this.g = false;
                            }
                            c.this.i = false;
                            c.this.h = false;
                            c.this.b("exception after load success", bVar);
                            c.this.j();
                        }
                    }
                }

                @Override // com.mbridge.msdk.reward.d.a
                public final void a(int i, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar3) {
                    CampaignEx campaignEx;
                    if (i == -1) {
                        c.this.J = System.currentTimeMillis();
                    }
                    if (c.this.H != null && c.this.H.size() > 0 && (campaignEx = (CampaignEx) c.this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                        c.this.H.clear();
                    }
                    if (c.this.S != null) {
                        c.this.S.clear();
                    }
                    c.this.e = false;
                    c.this.f = false;
                    synchronized (c.this.f3411a) {
                        if (c.this.g) {
                            c.this.g = false;
                        }
                    }
                    c.a(c.this, bVar3, i);
                    c.this.i = false;
                    c.this.h = false;
                    if (!c.this.P) {
                        c.this.a(i, str2, bVar3);
                    }
                    c.this.j();
                }
            };
            aVar.a(str);
            aVar.setUnitId(this.l);
            aVar.setPlacementId(this.m);
            int i = 287;
            aVar.setAdType(this.z ? 287 : 94);
            aVar.a(bVar);
            boolean zB = false;
            try {
                com.mbridge.msdk.videocommon.download.h hVarA = com.mbridge.msdk.videocommon.download.h.a();
                if (!this.z) {
                    i = 94;
                }
                zB = hVarA.b(i);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e.getMessage());
                }
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.g.c.a().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("hst", h());
                    bVar.a("2000125", dVar);
                    com.mbridge.msdk.reward.c.a.a.a().a("2000125", bVar);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
            if (zB) {
                bVar2.getCampaign(1, str, eVarA, new com.mbridge.msdk.foundation.same.net.b(com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_c", com.mbridge.msdk.foundation.same.a.p), com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_r", com.mbridge.msdk.foundation.same.a.q), com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_w", com.mbridge.msdk.foundation.same.a.q), this.p * 1000, com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_r_c", com.mbridge.msdk.foundation.same.a.r), 4), aVar);
                return;
            }
            int iC = com.mbridge.msdk.foundation.same.a.q;
            int iE = com.mbridge.msdk.foundation.same.a.s;
            int iB = com.mbridge.msdk.foundation.same.a.o;
            int iD = com.mbridge.msdk.foundation.same.a.r;
            try {
                g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (gVarA != null) {
                    iC = gVarA.c();
                    iE = gVarA.e();
                    iB = gVarA.b();
                    iD = gVarA.d();
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", e3.getMessage());
                }
            }
            bVar2.choiceV3OrV5BySetting(1, eVarA, aVar, str, new com.mbridge.msdk.foundation.same.net.b(iB, iC, iE, this.p * 1000, iD, 4));
        } catch (Exception e4) {
            e4.printStackTrace();
            b("Load exception", bVar);
            j();
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (bVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                messageObtain.setData(bundle);
            }
            this.O.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.O.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.O.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.O.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.O.sendMessage(messageObtain);
            }
        }
    }

    private void a(k kVar, CampaignEx campaignEx) {
        if (kVar == null || kVar.b(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        kVar.a(gVar);
    }

    private String h() {
        int iF;
        g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(this.K)) {
            iF = gVarA.ar();
        } else {
            iF = gVarA.F();
        }
        return com.mbridge.msdk.foundation.same.net.g.d.f().a(this.K, iF);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            com.mbridge.msdk.videocommon.a.a.a().a(str, str2, list);
        }
    }

    private void i() {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            try {
                g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (gVarB == null) {
                    com.mbridge.msdk.c.h.a();
                    gVarB = i.a();
                }
                com.mbridge.msdk.videocommon.a.a.a().a(gVarB.ac() * 1000, this.l);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.t = aVar;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z, boolean z2) {
        com.mbridge.msdk.foundation.same.report.d.b metricsData;
        try {
            if (z2) {
                this.S = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.T = copyOnWriteArrayList2;
                metricsData = c(copyOnWriteArrayList2);
            } else {
                metricsData = this.G.getMetricsData();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e.getMessage());
            }
            metricsData = null;
        }
        a(this.G, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            ad.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (z2) {
                    dVar.a("cache", 1);
                } else {
                    dVar.a("cache", 2);
                }
                if (metricsData != null) {
                    metricsData.a("2000127", dVar);
                    metricsData.a("2000048", dVar);
                }
                a(metricsData);
            }
            CampaignUnit campaignUnit = this.G;
            if (campaignUnit != null) {
                b(campaignUnit.getSessionId());
            }
            b(copyOnWriteArrayList);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                ad.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
                a(this.m, this.l, copyOnWriteArrayList);
            }
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            this.H = copyOnWriteArrayList;
            a(campaignEx);
            return;
        }
        ad.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.R)) {
            this.R = "APP ALREADY INSTALLED";
        }
        a(this.R.contains("INSTALL") ? 880021 : 880003, this.R, metricsData);
    }

    private void a(CampaignEx campaignEx) {
        boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.e = false;
        this.f = false;
        synchronized (this.f3411a) {
            if (this.g) {
                this.g = false;
            }
        }
        this.i = false;
        this.h = false;
        if (this.A && campaignEx != null) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        b.m.f3410a.a(this.k, z, nscpt, this.A, this.z ? 287 : 94, this.m, this.l, campaignEx.getRequestId(), this.H, new AnonymousClass3(campaignEx, z, nscpt), new AnonymousClass4(campaignEx, z, nscpt));
        if (z) {
            b.m.f3410a.a(this.k, campaignEx, this.m, this.l, campaignEx.getRequestId(), new AnonymousClass5(campaignEx, z, nscpt));
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$3, reason: invalid class name */
    final class AnonymousClass3 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f3414a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        AnonymousClass3(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f3414a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.e = true;
            if (!this.c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.O != null) {
                        c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.m.f3410a.a(c.this.I, c.this.O, c.this.z, c.this.A, null, next.getRewardTemplateMode().e(), c.this.y, AnonymousClass3.this.b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0310a c0310a) {
                                        if (c.this.a(c.this.H, AnonymousClass3.this.c, AnonymousClass3.this.d)) {
                                            c.a(c.this, c.this.l, copyOnWriteArrayList, c.this.U, c.this.A);
                                            if (c.this.O != null) {
                                                c.this.O.removeMessages(5);
                                            }
                                            if (c.this.t == null || c.this.h) {
                                                return;
                                            }
                                            c.this.h = true;
                                            if (AnonymousClass3.this.f3414a != null) {
                                                AnonymousClass3.this.f3414a.b(c.this.H);
                                            }
                                            c.this.t.a(c.this.H, AnonymousClass3.this.f3414a);
                                            return;
                                        }
                                        c.a(c.this, str6, c.this.S, c.this.A, str7);
                                        if (c.this.O != null) {
                                            c.this.O.removeMessages(5);
                                        }
                                        if (c.this.t == null || c.this.i) {
                                            return;
                                        }
                                        c.this.i = true;
                                        com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        if (AnonymousClass3.this.f3414a == null) {
                                            AnonymousClass3.this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass3.this.f3414a.b(c.this.H);
                                        AnonymousClass3.this.f3414a.a(bVarB);
                                        c.this.t.a(c.this.H, bVarB, AnonymousClass3.this.f3414a);
                                        ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar) {
                                        if (bVar != null) {
                                            bVar.a("his_reason", "preload template failed is tpl :" + AnonymousClass3.this.c);
                                        }
                                        if (AnonymousClass3.this.b.getRsIgnoreCheckRule() == null || AnonymousClass3.this.b.getRsIgnoreCheckRule().size() <= 0 || !AnonymousClass3.this.b.getRsIgnoreCheckRule().contains(1)) {
                                            c.a(c.this, str2, c.this.S, c.this.A, str5);
                                            if (c.this.O != null) {
                                                c.this.O.removeMessages(5);
                                            }
                                            if (c.this.t == null || c.this.i) {
                                                return;
                                            }
                                            c.this.i = true;
                                            if (AnonymousClass3.this.f3414a == null) {
                                                AnonymousClass3.this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                                            }
                                            AnonymousClass3.this.f3414a.b(c.this.H);
                                            AnonymousClass3.this.f3414a.a(bVar);
                                            c.this.t.a(c.this.S, bVar, AnonymousClass3.this.f3414a);
                                            ad.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                                            return;
                                        }
                                        ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                    }
                                });
                            }
                        });
                    } else {
                        c cVar = c.this;
                        if (cVar.a(cVar.H, this.c, this.d)) {
                            c cVar2 = c.this;
                            c.a(cVar2, cVar2.l, copyOnWriteArrayList, c.this.U, c.this.A);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (c.this.t != null && !c.this.h) {
                                c.this.h = true;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f3414a;
                                if (bVar != null) {
                                    bVar.b(c.this.H);
                                }
                                c.this.t.a(c.this.H, this.f3414a);
                            }
                        } else {
                            c cVar3 = c.this;
                            c.a(cVar3, str2, cVar3.S, c.this.A, str3);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (c.this.t != null && !c.this.i) {
                                c.this.i = true;
                                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f3414a == null) {
                                    this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f3414a.b(c.this.H);
                                this.f3414a.a(bVarB);
                                c.this.t.a(c.this.H, bVarB, this.f3414a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                            }
                        }
                    }
                }
                return;
            }
            if (!c.this.f || c.this.g || c.this.O == null) {
                return;
            }
            synchronized (c.this.f3411a) {
                if (c.this.g) {
                    return;
                }
                c.this.g = true;
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.m.f3410a.a(c.this.I, c.this.O, c.this.z, c.this.A, str3, AnonymousClass3.this.b.getRequestIdNotice(), c.this.m, str2, AnonymousClass3.this.b.getCMPTEntryUrl(), c.this.y, AnonymousClass3.this.b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass3.this.b.getCMPTEntryUrl()), str2, c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.2.1
                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str4, String str5, String str6, String str7, String str8, a.C0310a c0310a) {
                                if (c.this.a(c.this.H, AnonymousClass3.this.c, AnonymousClass3.this.d)) {
                                    c.a(c.this, c.this.l, copyOnWriteArrayList, c.this.U, c.this.A);
                                    if (c.this.O != null) {
                                        c.this.O.removeMessages(5);
                                    }
                                    if (c.this.t == null || c.this.h) {
                                        return;
                                    }
                                    c.this.h = true;
                                    if (AnonymousClass3.this.f3414a != null) {
                                        AnonymousClass3.this.f3414a.b(c.this.H);
                                    }
                                    c.this.t.a(c.this.H, AnonymousClass3.this.f3414a);
                                    return;
                                }
                                c.a(c.this, str6, c.this.S, c.this.A, str7);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.t == null || c.this.i) {
                                    return;
                                }
                                c.this.i = true;
                                com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                if (AnonymousClass3.this.f3414a == null) {
                                    AnonymousClass3.this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass3.this.f3414a.b(c.this.H);
                                AnonymousClass3.this.f3414a.a(bVarB2);
                                c.this.t.a(c.this.S, bVarB2, AnonymousClass3.this.f3414a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                            }

                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str4, String str5, String str6, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar2) {
                                if (bVar2 != null) {
                                    bVar2.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                                }
                                if (AnonymousClass3.this.b.getRsIgnoreCheckRule() == null || AnonymousClass3.this.b.getRsIgnoreCheckRule().size() <= 0 || !AnonymousClass3.this.b.getRsIgnoreCheckRule().contains(3)) {
                                    c.a(c.this, str2, c.this.S, c.this.A, str5);
                                    if (c.this.O != null) {
                                        c.this.O.removeMessages(5);
                                    }
                                    if (c.this.t == null || c.this.i) {
                                        return;
                                    }
                                    c.this.i = true;
                                    if (AnonymousClass3.this.f3414a == null) {
                                        AnonymousClass3.this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                                    }
                                    AnonymousClass3.this.f3414a.b(c.this.H);
                                    AnonymousClass3.this.f3414a.a(bVar2);
                                    c.this.t.a(c.this.S, bVar2, AnonymousClass3.this.f3414a);
                                    ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                                    return;
                                }
                                ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                            }
                        }, false);
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, final com.mbridge.msdk.foundation.c.b bVar) {
            c.this.e = false;
            if (c.this.t == null || c.this.O == null) {
                return;
            }
            c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.3
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(c.this, c.this.l, copyOnWriteArrayList, c.this.A, "");
                    if (c.this.O != null) {
                        c.this.O.removeMessages(5);
                    }
                    if (c.this.i || c.this.t == null) {
                        return;
                    }
                    c.this.i = true;
                    if (AnonymousClass3.this.f3414a == null) {
                        AnonymousClass3.this.f3414a = new com.mbridge.msdk.foundation.same.report.d.b();
                    }
                    AnonymousClass3.this.f3414a.b(c.this.H);
                    com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a("errorCode: 3201 errorMessage: campaign resource download failed");
                    }
                    AnonymousClass3.this.f3414a.a(bVar);
                    c.this.t.a(copyOnWriteArrayList, bVar, AnonymousClass3.this.f3414a);
                    ad.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
                }
            });
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$4, reason: invalid class name */
    final class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f3420a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, String str3, String str4) {
        }

        AnonymousClass4(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f3420a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, final String str2, final com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.c && c.this.t != null && c.this.O != null) {
                ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.b.getRsIgnoreCheckRule() == null || this.b.getRsIgnoreCheckRule().size() <= 0 || !this.b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, c.this.l, c.this.S, c.this.A, str2);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (c.this.i || c.this.t == null) {
                                return;
                            }
                            c.this.i = true;
                            com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3202 errorMessage: temp resource download failed");
                            }
                            if (AnonymousClass4.this.f3420a == null) {
                                AnonymousClass4.this.f3420a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4.this.f3420a.b(c.this.H);
                            AnonymousClass4.this.f3420a.a(bVar);
                            c.this.t.a(c.this.S, bVar, AnonymousClass4.this.f3420a);
                            ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
                        }
                    });
                    return;
                } else {
                    ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.d == 1) {
                if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.b.getRsIgnoreCheckRule().contains(3)) {
                        ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                        ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.t == null || c.this.O == null) {
                    return;
                }
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(c.this, c.this.l, c.this.S, c.this.A, str2);
                        if (c.this.O != null) {
                            c.this.O.removeMessages(5);
                        }
                        if (c.this.i || c.this.t == null) {
                            return;
                        }
                        c.this.i = true;
                        com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                        }
                        if (AnonymousClass4.this.f3420a == null) {
                            AnonymousClass4.this.f3420a = new com.mbridge.msdk.foundation.same.report.d.b();
                        }
                        AnonymousClass4.this.f3420a.b(c.this.H);
                        AnonymousClass4.this.f3420a.a(bVar);
                        c.this.t.a(c.this.S, bVar, AnonymousClass4.this.f3420a);
                        ad.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
                    }
                });
            }
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$5, reason: invalid class name */
    final class AnonymousClass5 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f3423a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        AnonymousClass5(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f3423a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.f = true;
            if (!c.this.e || c.this.g || c.this.O == null) {
                return;
            }
            synchronized (c.this.f3411a) {
                if (c.this.g) {
                    return;
                }
                c.this.g = true;
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.m.f3410a.a(c.this.I, c.this.O, c.this.z, c.this.A, str3, AnonymousClass5.this.b.getRequestIdNotice(), str, str2, AnonymousClass5.this.b.getCMPTEntryUrl(), c.this.y, AnonymousClass5.this.b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass5.this.b.getCMPTEntryUrl()), str2, c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.5.1.1
                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str5, String str6, String str7, String str8, String str9, a.C0310a c0310a) {
                                ad.a("HBOPTIMIZE", "模板加载成功 requestId " + str8);
                                if (c.this.a(c.this.H, AnonymousClass5.this.c, AnonymousClass5.this.d)) {
                                    c.a(c.this, c.this.l, c.this.S, c.this.U, c.this.A);
                                    if (c.this.O != null) {
                                        c.this.O.removeMessages(5);
                                    }
                                    if (c.this.t == null || c.this.h) {
                                        return;
                                    }
                                    c.this.h = true;
                                    if (AnonymousClass5.this.f3423a != null) {
                                        AnonymousClass5.this.f3423a.b(c.this.H);
                                    }
                                    c.this.t.a(c.this.H, AnonymousClass5.this.f3423a);
                                    return;
                                }
                                c.a(c.this, str7, c.this.S, c.this.A, str3);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.t == null || c.this.i) {
                                    return;
                                }
                                c.this.i = true;
                                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                if (AnonymousClass5.this.f3423a == null) {
                                    AnonymousClass5.this.f3423a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass5.this.f3423a.b(c.this.H);
                                AnonymousClass5.this.f3423a.a(bVarB);
                                c.this.t.a(c.this.S, bVarB, AnonymousClass5.this.f3423a);
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                            }

                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str5, String str6, String str7, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar) {
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                                ad.b("HBOPTIMIZE", "模板加载失败 requestId " + str6);
                                c.a(c.this, str2, c.this.S, c.this.A, str6);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.t == null || c.this.i) {
                                    return;
                                }
                                c.this.i = true;
                                if (AnonymousClass5.this.f3423a == null) {
                                    AnonymousClass5.this.f3423a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass5.this.f3423a.b(c.this.H);
                                AnonymousClass5.this.f3423a.a(bVar);
                                c.this.t.a(c.this.S, bVar, AnonymousClass5.this.f3423a);
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                            }
                        }, false);
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                if (this.b.getRsIgnoreCheckRule().contains(3)) {
                    ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                    ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            c.a(cVar, cVar.l, c.this.S, c.this.A, str2);
            c.this.f = false;
            if (c.this.O != null) {
                c.this.O.removeMessages(5);
            }
            if (c.this.t == null || c.this.i) {
                return;
            }
            c.this.i = true;
            if (bVar != null) {
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f3423a == null) {
                this.f3423a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f3423a.b(c.this.H);
            this.f3423a.a(bVar);
            c.this.t.a(c.this.S, bVar, this.f3423a);
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }
    }

    public final void f(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z || (copyOnWriteArrayList = this.H) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.l, this.H);
    }

    public final void g(boolean z) {
        if (z) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.l, this.U, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<CampaignEx> it = this.H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(0);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.l, this.H, "load_timeout", 0);
    }

    public final boolean h(boolean z) {
        if (z) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.l, this.U, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<CampaignEx> it = this.H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(1);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.l, this.H, "load_timeout", 1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r11, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r12 == 0) goto L2e
            int r1 = r12.size()     // Catch: java.lang.Exception -> Lc4
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.getRequestId()     // Catch: java.lang.Exception -> Lc4
            int r3 = r1.getVcn()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = r1.getBidToken()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r5 = r1.getNLRid()     // Catch: java.lang.Exception -> Lc4
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lc4
            if (r5 == 0) goto L31
            java.lang.String r0 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> Lc4
            goto L31
        L2e:
            r3 = 1
            r2 = r0
            r4 = r2
        L31:
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto L45
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r1.b(r11, r0)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r0.b(r11)     // Catch: java.lang.Exception -> Lc4
        L45:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L52
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r0.b(r11, r3)     // Catch: java.lang.Exception -> Lc4
        L52:
            if (r12 == 0) goto L8b
            int r0 = r12.size()     // Catch: java.lang.Exception -> Lc4
            if (r0 <= 0) goto L8b
            com.mbridge.msdk.reward.b.a.a(r2, r4)     // Catch: java.lang.Exception -> Lc4
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> Lc4
        L61:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.getCampaignUnitId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = r0.getRequestId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r3 = r0.getId()     // Catch: java.lang.Exception -> Lc4
            long r4 = r0.getPlct()     // Catch: java.lang.Exception -> Lc4
            long r6 = r0.getPlctb()     // Catch: java.lang.Exception -> Lc4
            long r8 = r0.getTimestamp()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.same.a.d.a(r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Exception -> Lc4
            goto L61
        L8b:
            if (r13 == 0) goto Lb1
            int r12 = r13.size()     // Catch: java.lang.Exception -> Lc4
            if (r12 <= 0) goto Lb1
            java.util.Iterator r12 = r13.iterator()     // Catch: java.lang.Exception -> Lc4
        L97:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r13 == 0) goto Lb1
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = (com.mbridge.msdk.foundation.entity.CampaignEx) r13     // Catch: java.lang.Exception -> Lc4
            if (r13 == 0) goto L97
            java.lang.String r0 = r13.getCampaignUnitId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r13 = r13.getRequestId()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.same.a.d.c(r0, r13)     // Catch: java.lang.Exception -> Lc4
            goto L97
        Lb1:
            com.mbridge.msdk.foundation.same.a.d.c(r11)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.controller.c r11 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> Lc4
            android.content.Context r11 = r11.c()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.db.b r11 = com.mbridge.msdk.foundation.db.b.a(r11)     // Catch: java.lang.Exception -> Lc4
            r11.a()     // Catch: java.lang.Exception -> Lc4
            goto Lcc
        Lc4:
            r11 = move-exception
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto Lcc
            r11.printStackTrace()
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0207 A[PHI: r15
      0x0207: PHI (r15v4 'e' java.io.IOException) = (r15v7 'e' java.io.IOException), (r15v8 'e' java.io.IOException) binds: [B:135:0x021e, B:124:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177 A[PHI: r2
      0x0177: PHI (r2v11 java.io.FileOutputStream) = (r2v10 java.io.FileOutputStream), (r2v15 java.io.FileOutputStream) binds: [B:37:0x0088, B:78:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> a(com.mbridge.msdk.foundation.entity.CampaignUnit r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.concurrent.CopyOnWriteArrayList");
    }

    private void a(final CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.7
            @Override // java.lang.Runnable
            public final void run() {
                k.a(com.mbridge.msdk.foundation.db.h.a(c.this.k)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 == null || campaignUnit2.getAds() == null || campaignUnit.getAds().size() <= 0) {
                    return;
                }
                c.a(c.this, campaignUnit.getAds());
            }
        });
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.n += list.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.u;
        if (cVar == null || this.n > cVar.v()) {
            this.n = 0;
        }
        if (an.b(this.l)) {
            com.mbridge.msdk.reward.b.a.a(this.l, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (an.b(this.l)) {
                com.mbridge.msdk.reward.b.a.a(this.l, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String k() {
        try {
            return an.b(com.mbridge.msdk.reward.b.a.d) ? com.mbridge.msdk.reward.b.a.d : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void b(String str) {
        if (an.b(str)) {
            com.mbridge.msdk.reward.b.a.d = str;
        }
    }

    private void l() {
        try {
            if (com.mbridge.msdk.foundation.same.a.d.k == null || com.mbridge.msdk.foundation.same.a.d.k.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.d.k.clear();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void m() {
        try {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(this.k)).a(this.l);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private boolean b(CampaignEx campaignEx) {
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

    public final void a(List<CampaignEx> list) {
        this.U = list;
    }

    public final CopyOnWriteArrayList<CampaignEx> d() {
        return this.H;
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.T;
    }

    public final void a(int i, int i2, int i3) {
        this.D = i;
        this.E = i2;
        this.F = i3;
    }

    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.u != null && TextUtils.isEmpty(str)) {
            int iB = this.u.b() * 1000;
            List<CampaignEx> list = this.U;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.U.get(0).getTimestamp() < iB) {
                    b("hit ltorwc", bVar);
                    return;
                }
            }
        }
        a(str, this.I, bVar);
    }

    /* compiled from: RewardMVVideoAdapter.java */
    public class b implements Runnable {
        private String b;
        private com.mbridge.msdk.foundation.same.report.d.b c;

        public b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (com.mbridge.msdk.f.b.a()) {
                    c cVar = c.this;
                    String unused = cVar.l;
                    Context unused2 = c.this.k;
                    cVar.C = "";
                }
                c cVar2 = c.this;
                cVar2.r = ai.a(cVar2.k, c.this.l);
                if (c.this.N) {
                    return;
                }
                if (c.this.L != null && c.this.O != null) {
                    c.this.O.removeCallbacks(c.this.L);
                }
                c.this.M = true;
                if (c.this.O != null) {
                    Message messageObtainMessage = c.this.O.obtainMessage();
                    messageObtainMessage.obj = this.b;
                    messageObtainMessage.what = 1;
                    if (this.c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.c.f());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.O.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.r)) {
                    return;
                }
                ad.b("RewardMVVideoAdapter", "excludeId : " + c.this.r);
            } catch (Exception e) {
                ad.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    public class a implements Runnable {
        private String b;
        private com.mbridge.msdk.foundation.same.report.d.b c;

        public a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (c.this.M) {
                    return;
                }
                c.this.N = true;
                if (c.this.O != null) {
                    Message messageObtainMessage = c.this.O.obtainMessage();
                    messageObtainMessage.obj = this.b;
                    messageObtainMessage.what = 2;
                    if (this.c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.c.f());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.O.sendMessage(messageObtainMessage);
                }
            } catch (Exception e) {
                ad.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    private void b(String str, boolean z, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.same.f.b.h().execute(new b(str, bVar));
        if (this.O != null) {
            a aVar = new a(str, bVar);
            this.L = aVar;
            this.O.postDelayed(aVar, 90000L);
            return;
        }
        a(str, z, bVar);
    }

    public final String f() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.a(this.H);
        }
        return com.mbridge.msdk.foundation.same.c.a(this.U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        if (message == null) {
            return bVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid")) : bVar;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return bVar;
            }
            e.printStackTrace();
            return bVar;
        }
    }

    private com.mbridge.msdk.foundation.same.report.d.b c(List<CampaignEx> list) {
        String localRequestId;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    localRequestId = list.get(0) != null ? list.get(0).getLocalRequestId() : "";
                    bVar.c(localRequestId);
                    bVar.b(list);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("cache", 1);
        dVar.a("hb", 1);
        dVar.a("auto_load", 2);
        bVar.a("2000127", dVar);
        bVar.a("2000048", dVar);
        bVar.b(this.z ? 287 : 94);
        bVar.i("1");
        bVar.b("2");
        if (!TextUtils.isEmpty(localRequestId) && !com.mbridge.msdk.foundation.same.report.d.c.a().b().containsKey(localRequestId)) {
            com.mbridge.msdk.foundation.same.report.d.c.a().b().put(localRequestId, bVar);
        }
        return bVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.same.report.d.d dVar, List<CampaignEx> list) {
        if (bVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        bVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            bVar.c(campaignEx.getLocalRequestId());
                        }
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            bVar.d(this.l);
            bVar.b(this.z ? 287 : 94);
            if (dVar != null) {
                bVar.a("m_temp_is_ready_check", dVar);
            }
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        }
    }

    static /* synthetic */ void a(c cVar, String str, List list, List list2, boolean z) {
        f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z);
        if (list2 != null && list2.size() > 0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    com.mbridge.msdk.videocommon.a.b(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            cVar.a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = (CampaignEx) list.get(0);
            com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(str, cVar.z);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void a(c cVar, String str, List list, boolean z, String str2) {
        CampaignEx campaignEx;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && ((campaignEx = (CampaignEx) list.get(0)) == null || TextUtils.isEmpty(campaignEx.getEcppv()) || TextUtils.isEmpty(str2))) {
            f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, z);
        } else {
            f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (CampaignEx) null, z, str2);
        }
    }

    static /* synthetic */ void a(c cVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("result", 1);
                dVar.a("timeout", Integer.valueOf(cVar.p));
                dVar.a("hst", cVar.h());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", dVar);
                campaignUnit.setLocalRequestId(metricsData.f());
                com.mbridge.msdk.reward.c.a.a.a().a("2000126", metricsData);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    static /* synthetic */ void b(c cVar, CampaignUnit campaignUnit) throws Throwable {
        cVar.G = campaignUnit;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = cVar.a(campaignUnit);
        new com.mbridge.msdk.reward.a.a(cVar.l, cVar.z).a(copyOnWriteArrayListA, cVar.K, cVar, cVar.l);
        cVar.a(copyOnWriteArrayListA, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:16:0x002c, B:18:0x004a, B:20:0x0052, B:22:0x0056, B:25:0x005f, B:27:0x0078, B:26:0x006d, B:28:0x008e, B:15:0x0027), top: B:35:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.reward.adapter.c r5, com.mbridge.msdk.foundation.same.report.d.b r6, int r7) {
        /*
            java.lang.String r0 = "2000126"
            if (r6 == 0) goto Laa
            boolean r1 = r6.r()     // Catch: java.lang.Exception -> La2
            if (r1 != 0) goto Laa
            com.mbridge.msdk.foundation.same.report.d.d r1 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> La2
            r1.<init>()     // Catch: java.lang.Exception -> La2
            r2 = 3
            java.lang.String r3 = "result"
            if (r7 == r2) goto L27
            r2 = 880023(0xd6d97, float:1.233175E-39)
            if (r7 == r2) goto L27
            r2 = 880041(0xd6da9, float:1.2332E-39)
            if (r7 == r2) goto L27
            switch(r7) {
                case 10: goto L27;
                case 11: goto L27;
                case 12: goto L27;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "1"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> La2
            goto L2c
        L27:
            java.lang.String r7 = "2"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> La2
        L2c:
            java.lang.String r7 = "timeout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r2.<init>()     // Catch: java.lang.Exception -> La2
            int r3 = r5.p     // Catch: java.lang.Exception -> La2
            r2.append(r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La2
            r1.a(r7, r2)     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.c.b r7 = r6.o()     // Catch: java.lang.Exception -> La2
            if (r7 == 0) goto L8e
            java.lang.String r2 = "campaign_request_error"
            java.lang.Object r2 = r7.a(r2)     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto L8e
            boolean r3 = r2 instanceof com.mbridge.msdk.foundation.same.net.b.a     // Catch: java.lang.Exception -> La2
            if (r3 == 0) goto L8e
            r3 = r2
            com.mbridge.msdk.foundation.same.net.b.a r3 = (com.mbridge.msdk.foundation.same.net.b.a) r3     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.same.net.f.c r3 = r3.c     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = "code"
            if (r3 == 0) goto L6d
            com.mbridge.msdk.foundation.same.net.b.a r2 = (com.mbridge.msdk.foundation.same.net.b.a) r2     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.same.net.f.c r2 = r2.c     // Catch: java.lang.Exception -> La2
            int r2 = r2.d     // Catch: java.lang.Exception -> La2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> La2
            r1.a(r4, r2)     // Catch: java.lang.Exception -> La2
            goto L78
        L6d:
            int r2 = r7.a()     // Catch: java.lang.Exception -> La2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> La2
            r1.a(r4, r2)     // Catch: java.lang.Exception -> La2
        L78:
            java.lang.String r2 = "reason"
            java.lang.String r3 = r7.b()     // Catch: java.lang.Exception -> La2
            r1.a(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "err_desc"
            java.lang.String r7 = r7.l()     // Catch: java.lang.Exception -> La2
            r1.a(r2, r7)     // Catch: java.lang.Exception -> La2
            r7 = 0
            r6.a(r7)     // Catch: java.lang.Exception -> La2
        L8e:
            java.lang.String r7 = "hst"
            java.lang.String r5 = r5.h()     // Catch: java.lang.Exception -> La2
            r1.a(r7, r5)     // Catch: java.lang.Exception -> La2
            r6.a(r0, r1)     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.reward.c.a.a r5 = com.mbridge.msdk.reward.c.a.a.a()     // Catch: java.lang.Exception -> La2
            r5.a(r0, r6)     // Catch: java.lang.Exception -> La2
            goto Laa
        La2:
            r5 = move-exception
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto Laa
            r5.printStackTrace()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.reward.adapter.c, com.mbridge.msdk.foundation.same.report.d.b, int):void");
    }

    static /* synthetic */ void a(c cVar, List list) {
        if (cVar.k == null || list == null || list.size() == 0) {
            return;
        }
        k kVarA = k.a(com.mbridge.msdk.foundation.db.h.a(cVar.k));
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i);
            if (campaignEx != null) {
                if (com.mbridge.msdk.f.b.a()) {
                    if (!ai.c(cVar.k, campaignEx.getPackageName())) {
                        cVar.a(kVarA, campaignEx);
                    }
                } else {
                    cVar.a(kVarA, campaignEx);
                }
            }
        }
    }
}
