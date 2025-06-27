package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.i;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: RewardVideoController.java */
/* loaded from: classes4.dex */
public class a {
    public static String b = "";
    public static String d = null;
    public static String e = "";
    private int A;
    private int B;
    private int C;
    private boolean H;
    private Queue<Integer> P;
    private String Q;
    private CopyOnWriteArrayList<CampaignEx> Z;

    /* renamed from: a, reason: collision with root package name */
    b f3431a;
    private List<CampaignEx> aa;
    private Context l;
    private com.mbridge.msdk.reward.adapter.c m;
    private com.mbridge.msdk.videocommon.d.c n;
    private com.mbridge.msdk.videocommon.d.a o;
    private volatile InterVideoOutListener p;
    private volatile c q;
    private String r;
    private String s;
    private MBridgeIds t;
    private String u;
    private volatile String v;
    private String w;
    private static ConcurrentHashMap<String, Integer> N = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> O = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, d> f = new ConcurrentHashMap<>();
    private int x = 0;
    private int z = 2;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean I = false;
    private ArrayList<Integer> J = new ArrayList<>(7);
    private boolean K = false;
    private final Object L = new Object();
    public boolean c = false;
    private List<CampaignEx> M = new ArrayList();
    private h R = null;
    private volatile boolean S = true;
    private volatile boolean T = false;
    private volatile boolean U = false;
    private volatile boolean V = false;
    private volatile boolean W = false;
    private volatile boolean X = false;
    private volatile boolean Y = false;
    volatile boolean g = false;
    volatile boolean h = false;
    volatile boolean i = false;
    volatile boolean j = false;
    volatile boolean k = false;
    private Handler y = new com.mbridge.msdk.reward.b.b(this);

    public final void a(boolean z) {
        this.D = z;
        if (z) {
            this.z = com.mbridge.msdk.foundation.same.a.W;
        } else {
            this.z = com.mbridge.msdk.foundation.same.a.V;
        }
    }

    public final void b(boolean z) {
        this.E = z;
    }

    public final void a(int i) {
        this.z = i;
    }

    public final String a() {
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        return cVar != null ? cVar.a(this.K) : "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            al.b(this.l, "MBridge_ConfirmTitle" + this.s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            al.b(this.l, "MBridge_ConfirmContent" + this.s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(this.l, "MBridge_CancelText" + this.s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        al.b(this.l, "MBridge_ConfirmText" + this.s, str3.trim());
    }

    public final void c(boolean z) {
        this.I = z;
    }

    public final void a(int i, int i2, int i3) {
        this.A = i;
        this.B = i2;
        if (i2 == com.mbridge.msdk.foundation.same.a.J) {
            this.C = i3 < 0 ? 5 : i3;
        }
        if (this.B == com.mbridge.msdk.foundation.same.a.I) {
            this.C = i3 < 0 ? 80 : i3;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == com.mbridge.msdk.foundation.same.a.G ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i2 == com.mbridge.msdk.foundation.same.a.I ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i3);
            com.mbridge.msdk.c.h.a().f(this.s, jSONObject.toString());
        } catch (Exception unused) {
            ad.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    public static void a(String str, int i) {
        try {
            if (N == null || !an.b(str)) {
                return;
            }
            N.put(str, Integer.valueOf(i));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = O) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        O.put(str, str2);
    }

    public final void b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.K || (concurrentHashMap = O) == null || concurrentHashMap.containsKey(a())) {
            return;
        }
        O.remove(a());
    }

    public final void c() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.t;
            if (mBridgeIds != null) {
                if (!this.K) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strA = a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = O;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strA) && !TextUtils.isEmpty(O.get(strA))) {
                    str = O.get(strA);
                }
                this.t.setBidToken(str);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return;
        }
        j jVarA = j.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        f fVar = new f();
        fVar.a(System.currentTimeMillis());
        fVar.b(str);
        fVar.a(campaignEx.getId());
        jVarA.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RewardVideoController.java */
    public final class d extends com.mbridge.msdk.video.bt.module.b.b {
        private a d;
        private Handler e;
        private int f;

        private d(a aVar, Handler handler) {
            this.f = 0;
            this.d = aVar;
            this.e = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            a.this.c = false;
            try {
                com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(a.this.s, a.this.D);
                a aVar2 = this.d;
                aVar.a(bVar.f(), (aVar2 == null || aVar2.m == null) ? "" : this.d.m.c, 3, a.b);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
            }
            try {
                a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.K = true;
                    if (this.d.m != null) {
                        this.d.m.c = "";
                    }
                    final a aVar4 = this.d;
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.R == null) {
                                    a.this.R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
                                }
                                i iVarA = i.a(a.this.R);
                                if (iVarA != null) {
                                    iVarA.a(a.this.s);
                                }
                            } catch (Throwable unused) {
                                ad.b("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                        }
                    });
                    if (a.this.E) {
                        a.this.c();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", bVar, aVar5.p, "");
                    this.b = true;
                    if (this.d.p != null) {
                        this.d.p.onAdShow(a.this.t);
                        this.f = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                a aVar = this.d;
                if (aVar != null && aVar.p != null) {
                    if (cVar == null) {
                        cVar = com.mbridge.msdk.videocommon.b.c.b(this.d.w);
                    }
                    if (a.this.E) {
                        a.this.c();
                        a.this.b();
                        com.mbridge.msdk.foundation.same.a.d.d(a.this.s, a.this.a());
                    }
                    this.d.p.onAdClose(a.this.t, new RewardInfo(z, cVar.a(), String.valueOf(cVar.b())));
                    this.f = 7;
                    this.d.K = false;
                    a.this.J.clear();
                    this.d = null;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                a.this.c = false;
                if (this.d != null) {
                    if (a.this.E) {
                        a.this.c();
                    }
                    this.d.K = false;
                    a.this.a("2000131", bVar, this.d.p, str);
                    this.c = true;
                    if (this.d.p != null) {
                        try {
                            this.d.p.onShowFail(bVar, a.this.t, str);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e.getMessage());
                            }
                        }
                        this.f = 4;
                    }
                }
            } catch (Exception e2) {
                this.f = 0;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z, String str, String str2) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.p == null) {
                    return;
                }
                if (a.this.E) {
                    a.this.c();
                }
                this.d.K = false;
                try {
                    this.d.p.onVideoAdClicked(z, a.this.t);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.p == null) {
                    return;
                }
                try {
                    this.d.p.onVideoComplete(a.this.t);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                }
                this.f = 5;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z, int i) {
            try {
                a aVar = this.d;
                if (aVar != null && aVar.p != null) {
                    try {
                        this.d.p.onAdCloseWithIVReward(a.this.t, new RewardInfo(z, i));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e.getMessage());
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.p == null) {
                    return;
                }
                try {
                    this.d.p.onEndcardShow(a.this.t);
                    com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                }
                this.f = 6;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i, String str, String str2) {
            this.f = i;
            a aVar = this.d;
            if (aVar == null || aVar.E || this.d.D || this.d.n == null || !this.d.n.s(this.f) || this.d.q == null || c.a(this.d.q) == 1 || c.a(this.d.q) == 3 || a.this.J.contains(Integer.valueOf(this.f))) {
                return;
            }
            a.this.J.add(Integer.valueOf(this.f));
            int iA = this.d.n.A() * 1000;
            if (this.f == 4) {
                iA = 3000;
            }
            Handler handler = this.e;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.e.sendEmptyMessageDelayed(1001001, iA);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (d.this.d != null) {
                            d.this.d.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, a.this.D ? 287 : 94, a.this.s, true, 1));
                        }
                    }
                }, iA);
            }
        }
    }

    public final void a(InterVideoOutListener interVideoOutListener) {
        this.p = interVideoOutListener;
        this.q = new c(interVideoOutListener, this.y, this.s);
    }

    public final void b(String str, String str2) {
        try {
            this.l = com.mbridge.msdk.foundation.controller.c.m().c();
            this.s = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.v = str;
            this.t = new MBridgeIds(this.v, this.s);
            this.o = com.mbridge.msdk.videocommon.d.b.a().b();
            com.mbridge.msdk.foundation.same.f.b.b().execute(new com.mbridge.msdk.reward.b.c(this.l, this.s));
            if (this.R == null) {
                this.R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        } catch (Throwable th) {
            ad.a("RewardVideoController", th.getMessage(), th);
        }
    }

    public final void a(boolean z, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        a(z, "", dVar);
    }

    private void p() {
        com.mbridge.msdk.foundation.db.f.a(h.a(this.l)).a(this.s);
    }

    private void q() {
        try {
            List<CampaignEx> listB = com.mbridge.msdk.foundation.db.f.a(h.a(this.l)).b(this.s);
            if (listB == null || listB.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listB) {
                if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(this.s + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.b(this.s + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                } else {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private com.mbridge.msdk.foundation.same.report.d.b b(boolean z, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        List<String> listE;
        String strA;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        try {
            if (z) {
                try {
                    com.mbridge.msdk.foundation.db.f fVarA = com.mbridge.msdk.foundation.db.f.a(h.a(this.l));
                    if (fVarA != null && (listE = fVarA.e(this.s)) != null && listE.size() > 0) {
                        Iterator<String> it = listE.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                        }
                    }
                    LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.d.b> linkedHashMapB = com.mbridge.msdk.foundation.same.report.d.c.a().b();
                    if (linkedHashMapB != null && linkedHashMapB.size() > 0) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b>> it2 = linkedHashMapB.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b> next = it2.next();
                            if (next != null && next.getValue().s()) {
                                it2.remove();
                            }
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(ai.d());
            } else {
                strA = a(str);
            }
            bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(strA);
            if (bVar == null) {
                com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                try {
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(strA, bVar2);
                    bVar2.d(true);
                    bVar = bVar2;
                } catch (Exception e3) {
                    e = e3;
                    bVar = bVar2;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                    return bVar;
                }
            }
            if (bVar != null) {
                bVar.c(strA);
                bVar.d(this.s);
                if (dVar != null) {
                    if (dVar.a("adtp")) {
                        bVar.b(Integer.parseInt((String) dVar.b("adtp")));
                    }
                    if (dVar.a("hb")) {
                        String str2 = (String) dVar.b("hb");
                        bVar.i(str2);
                        if (str2.equals("1")) {
                            bVar.e(str);
                        }
                    }
                }
                bVar.b(z ? "2" : "1");
                if (z) {
                    com.mbridge.msdk.reward.c.a.a.a().a("2000123", bVar);
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        return bVar;
    }

    public final void a(boolean z, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        com.mbridge.msdk.foundation.same.report.d.b bVarB = b(z, str, dVar);
        if (this.q == null) {
            this.q = new c(null, this.y, this.s);
        }
        if (this.q != null && c.a(this.q) == 1) {
            a(z, bVarB);
            return;
        }
        if (this.q != null && c.a(this.q) == 3) {
            this.S = false;
        } else {
            this.S = true;
            if (this.q != null) {
                c.a(this.q, 1);
            }
        }
        this.H = z;
        this.y.removeMessages(1001001);
        this.V = false;
        this.U = false;
        this.W = false;
        this.X = false;
        q();
        p();
        com.mbridge.msdk.reward.adapter.b.a();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.D) {
                    com.mbridge.msdk.d.b.getInstance().addInterstitialList(this.v, this.s);
                } else {
                    com.mbridge.msdk.d.b.getInstance().addRewardList(this.v, this.s);
                }
            }
            if (this.E && TextUtils.isEmpty(str)) {
                b(bVarB);
                return;
            }
            if (MBridgeSDKImpl.map == null) {
                a(bVarB);
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.s);
            this.n = cVarA;
            if (cVarA == null) {
                this.Q = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.videocommon.d.b.a().a(this.Q, com.mbridge.msdk.foundation.controller.c.m().b(), this.s, new com.mbridge.msdk.videocommon.c.c() { // from class: com.mbridge.msdk.reward.b.a.1
                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void a(String str2) {
                    }

                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void b(String str2) {
                    }
                });
                this.n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.s, this.D);
            }
            if (!TextUtils.isEmpty(this.v)) {
                this.n.b(this.v);
            }
            int iF = this.n.F() * 1000;
            if (this.y != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (bVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVarB.f());
                    messageObtain.setData(bundle);
                }
                this.y.sendMessageDelayed(messageObtain, iF);
            }
            this.P = this.n.B();
            try {
                a(z, str, bVarB);
            } catch (Exception e2) {
                if (this.q != null) {
                    com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880020, "load exception");
                    if (bVarB != null) {
                        bVarB.a(bVarB2);
                        bVarB.c(true);
                    }
                    this.q.a(bVarB2, bVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        } catch (Exception e3) {
            if (this.q != null) {
                com.mbridge.msdk.foundation.c.b bVarB3 = com.mbridge.msdk.foundation.c.a.b(880001, "");
                if (bVarB != null) {
                    bVarB.a(bVarB3);
                    bVarB.c(true);
                }
                this.q.a(bVarB3, bVarB);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e3.getMessage());
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.q != null) {
            String strA = com.mbridge.msdk.foundation.c.a.a(880001, "");
            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880001, "");
            if (bVar != null) {
                bVar.a(bVarB);
                bVar.c(true);
            }
            c.a(this.q, strA, bVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.q != null) {
            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880035, "");
            if (bVar != null) {
                bVar.a(bVarB);
                bVar.c(true);
            }
            c.a(this.q, "bidToken is empty", bVar);
        }
    }

    private void a(boolean z, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (!this.H) {
            if (z) {
                this.H = z;
            }
        } else if (z) {
            String strA = com.mbridge.msdk.foundation.c.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (bVar != null) {
                bVar.a(bVarB);
                bVar.c(true);
            }
            this.q.a(strA, bVar);
        }
    }

    private void a(boolean z, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.reward.a.a aVar;
        com.mbridge.msdk.reward.a.a aVar2;
        if (this.q != null) {
            if (!this.E) {
                this.Y = c(this.s, bVar.f());
                if (this.Y) {
                    if (!s()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.Z;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            bVar.a("2000127", dVar);
                            bVar.a("2000048", dVar);
                            bVar.a(copyOnWriteArrayList);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e2.getMessage());
                            }
                        }
                        c.a(this.q, this.v, this.s, bVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.q.a(this.E);
                        com.mbridge.msdk.reward.adapter.c cVar = this.m;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.q.b(this.v, this.s, bVar);
                        } else {
                            a(copyOnWriteArrayList, this.m);
                        }
                        if (this.S) {
                            com.mbridge.msdk.reward.adapter.c cVar2 = this.m;
                            if (cVar2 != null) {
                                cVar2.a(this.Z);
                            }
                            a(this.P, z, str, bVar);
                            return;
                        }
                        return;
                    }
                    ad.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.Z;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.Z.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.a.a.a().a(it.next(), this.s);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.m;
                    if (cVar3 != null) {
                        cVar3.a(this.Z);
                    }
                    if (z) {
                        if (this.q != null) {
                            String strA = com.mbridge.msdk.foundation.c.a.a(880019, "");
                            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880019, "");
                            if (bVar != null) {
                                bVar.a(bVarB);
                                bVar.c(true);
                            }
                            c.a(this.q, strA, bVar);
                            return;
                        }
                        return;
                    }
                    this.Y = false;
                    this.q.a(this.E);
                    a(this.P, z, str, bVar);
                    return;
                }
                if (!s()) {
                    this.Y = false;
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.m;
                    if (cVar4 != null) {
                        cVar4.a(this.Z);
                    }
                    this.q.a(this.E);
                    a(this.P, z, str, bVar);
                    return;
                }
                if (z) {
                    if (this.q != null) {
                        String strA2 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                        com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                        if (bVar != null) {
                            bVar.a(bVarB2);
                            bVar.c(true);
                        }
                        c.a(this.q, strA2, bVar);
                        return;
                    }
                    return;
                }
                this.Y = false;
                com.mbridge.msdk.reward.adapter.c cVar5 = this.m;
                if (cVar5 != null) {
                    cVar5.a(this.Z);
                }
                this.q.a(this.E);
                a(this.P, z, str, bVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = com.mbridge.msdk.videocommon.a.a.a().a(this.s, 1, this.E, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA2 = null;
            if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                if (s()) {
                    com.mbridge.msdk.videocommon.a.a.a().a(this.s, str);
                    if (!z || this.q == null) {
                        return;
                    }
                    String strA3 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                    com.mbridge.msdk.foundation.c.b bVarB3 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                    if (bVar != null) {
                        bVar.a(bVarB3);
                        bVar.c(true);
                    }
                    c.a(this.q, strA3, bVar);
                    return;
                }
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0 && !TextUtils.isEmpty(str)) {
                    for (CampaignEx campaignEx2 : copyOnWriteArrayListA) {
                        if (campaignEx2 != null && str.equals(campaignEx2.getBidToken())) {
                            copyOnWriteArrayList3.add(campaignEx2);
                        }
                    }
                }
                if (copyOnWriteArrayList3.size() > 0) {
                    a(copyOnWriteArrayList3, str, bVar);
                    return;
                }
                try {
                    com.mbridge.msdk.reward.a.a aVar3 = new com.mbridge.msdk.reward.a.a(this.s, this.D);
                    com.mbridge.msdk.foundation.b.c cVar6 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar3.a(str)) {
                        if (this.m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar7 = new com.mbridge.msdk.reward.adapter.c(this.l, this.v, this.s);
                            this.m = cVar7;
                            cVar7.b(this.D);
                            this.m.c(this.E);
                            if (this.D) {
                                this.m.a(this.A, this.B, this.C);
                            }
                            this.m.a(this.z);
                            this.m.a(this.n);
                        }
                        aVar2 = aVar3;
                        cVar6 = aVar3.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.m);
                        if (cVar6 != null && cVar6.g() == com.mbridge.msdk.foundation.b.c.d && cVar6.a() != null && cVar6.a().size() > 0 && this.m != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA3 = cVar6.a();
                            if (copyOnWriteArrayListA != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<CampaignEx> it2 = copyOnWriteArrayListA.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next = it2.next();
                                    if (next != null) {
                                        String requestId = next.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i = 0; i < copyOnWriteArrayListA3.size(); i++) {
                                                CampaignEx campaignEx3 = copyOnWriteArrayListA3.get(i);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i == copyOnWriteArrayListA3.size() - 1) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListA3.size() == 0) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                                this.m.a(arrayList);
                            }
                            this.m.a(cVar6.a(), false, true);
                            copyOnWriteArrayListA2 = new CopyOnWriteArrayList<>(cVar6.a());
                        }
                    } else {
                        aVar2 = aVar3;
                        copyOnWriteArrayListA2 = a(str, copyOnWriteArrayListA);
                        if (copyOnWriteArrayListA2.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayListA2);
                        }
                        cVar6.d("cb is closed");
                        cVar6.a(com.mbridge.msdk.foundation.b.c.c);
                    }
                    aVar2.a(bVar, str, cVar6, (List<a.C0262a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayListA2 != null && copyOnWriteArrayListA2.size() > 0) {
                        a(copyOnWriteArrayListA2, str, bVar);
                        if (this.m != null && !aVar2.a(str)) {
                            this.m.a(copyOnWriteArrayListA2);
                        }
                    }
                } catch (Exception e3) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e3.getMessage());
                    }
                }
                this.Y = false;
                this.q.a(this.E);
                a(this.P, z, str, bVar);
                return;
            }
            if (!s()) {
                try {
                    com.mbridge.msdk.reward.a.a aVar4 = new com.mbridge.msdk.reward.a.a(this.s, this.D);
                    com.mbridge.msdk.foundation.b.c cVar8 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar4.a(str)) {
                        if (this.m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.l, this.v, this.s);
                            this.m = cVar9;
                            cVar9.b(this.D);
                            this.m.c(this.E);
                            if (this.D) {
                                this.m.a(this.A, this.B, this.C);
                            }
                            this.m.a(this.z);
                            this.m.a(this.n);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.m);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.b.c.d && cVar8.a() != null && cVar8.a().size() > 0 && this.m != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA4 = cVar8.a();
                            if (copyOnWriteArrayListA != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CampaignEx> it3 = copyOnWriteArrayListA.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next2 = it3.next();
                                    if (next2 != null) {
                                        String requestId2 = next2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i2 = 0; i2 < copyOnWriteArrayListA4.size(); i2++) {
                                                CampaignEx campaignEx4 = copyOnWriteArrayListA4.get(i2);
                                                if (campaignEx4 != null) {
                                                    if (requestId2.equals(campaignEx4.getRequestId())) {
                                                        break;
                                                    } else if (i2 == copyOnWriteArrayListA4.size() - 1) {
                                                        arrayList2.add(next2);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListA4.size() == 0) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                                this.m.a(arrayList2);
                            }
                            this.m.a(cVar8.a(), false, true);
                            copyOnWriteArrayListA2 = new CopyOnWriteArrayList<>(cVar8.a());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayListA2 = a(str, copyOnWriteArrayListA);
                        if (copyOnWriteArrayListA2.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayListA2);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.b.c.c);
                    }
                    aVar.a(bVar, str, cVar8, (List<a.C0262a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayListA2 != null && copyOnWriteArrayListA2.size() > 0) {
                        a(copyOnWriteArrayListA2, str, bVar);
                        if (this.m != null && !aVar.a(str)) {
                            this.m.a(copyOnWriteArrayListA2);
                        }
                    }
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e4.getMessage());
                    }
                }
                this.Y = false;
                this.q.a(this.E);
                a(this.P, z, str, bVar);
                return;
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.s, str);
            if (!z || this.q == null) {
                return;
            }
            String strA4 = com.mbridge.msdk.foundation.c.a.a(880019, "");
            com.mbridge.msdk.foundation.c.b bVarB4 = com.mbridge.msdk.foundation.c.a.b(880019, "");
            if (bVar != null) {
                bVar.a(bVarB4);
                bVar.c(true);
            }
            c.a(this.q, strA4, bVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("cache", 1);
            bVar.a("2000127", dVar);
            bVar.a("2000048", dVar);
            bVar.a(copyOnWriteArrayList);
        } catch (Exception e2) {
            ad.b("RewardVideoController", e2.getMessage());
        }
        this.Y = true;
        this.q.a(this.E);
        c.a(this.q, this.v, this.s, bVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        if (cVar != null && cVar.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.q.b(this.v, this.s, bVar);
        } else {
            a(copyOnWriteArrayList, this.m);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.a.d.a(this.s, str, vcn);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        com.mbridge.msdk.reward.adapter.b.a().a(this.l, z, nscpt, this.E, this.D ? 287 : 94, this.v, this.s, campaignEx.getRequestId(), copyOnWriteArrayList, new AnonymousClass2(campaignEx, z, cVar, nscpt), new b.i(campaignEx, copyOnWriteArrayList, z, nscpt) { // from class: com.mbridge.msdk.reward.b.a.3

            /* renamed from: a, reason: collision with root package name */
            com.mbridge.msdk.foundation.same.report.d.b f3438a;
            final /* synthetic */ CampaignEx b;
            final /* synthetic */ CopyOnWriteArrayList c;
            final /* synthetic */ boolean d;
            final /* synthetic */ int e;

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, String str3, String str4) {
            }

            {
                this.b = campaignEx;
                this.c = copyOnWriteArrayList;
                this.d = z;
                this.e = nscpt;
                this.f3438a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
                String unitId = bVar == null ? "" : bVar.d().getUnitId();
                a aVar = a.this;
                a.a(aVar, unitId, aVar.aa);
                if (bVar != null) {
                    bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (this.f3438a == null) {
                    this.f3438a = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                this.f3438a.b(this.c);
                this.f3438a.a(bVar);
                if (!this.d && a.this.q != null) {
                    if (a.this.j) {
                        return;
                    }
                    a.this.j = true;
                    c.a(a.this.q, bVar, this.f3438a);
                    return;
                }
                if (this.e != 1 || a.this.j || a.this.q == null) {
                    return;
                }
                a.this.j = true;
                c.a(a.this.q, bVar, this.f3438a);
            }
        });
        if (z) {
            com.mbridge.msdk.reward.adapter.b.a().a(this.l, campaignEx, this.v, this.s, campaignEx.getRequestId(), new AnonymousClass4(campaignEx, copyOnWriteArrayList, cVar, z, nscpt));
        }
    }

    /* compiled from: RewardVideoController.java */
    /* renamed from: com.mbridge.msdk.reward.b.a$2, reason: invalid class name */
    final class AnonymousClass2 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f3433a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c d;
        final /* synthetic */ int e;

        AnonymousClass2(CampaignEx campaignEx, boolean z, com.mbridge.msdk.reward.adapter.c cVar, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = cVar;
            this.e = i;
            this.f3433a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.g = true;
            if (!this.c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && a.this.y != null) {
                        a.this.y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b.a().a(a.this.I, a.this.y, a.this.D, a.this.E, null, next.getRewardTemplateMode().e(), a.this.z, AnonymousClass2.this.b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), a.this.n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0310a c0310a) {
                                        if (AnonymousClass2.this.d == null || !AnonymousClass2.this.d.a(copyOnWriteArrayList, AnonymousClass2.this.c, AnonymousClass2.this.e)) {
                                            a.a(a.this, str6, a.this.aa);
                                            if (a.this.q == null || a.this.j) {
                                                return;
                                            }
                                            a.this.j = true;
                                            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                            if (AnonymousClass2.this.f3433a == null) {
                                                AnonymousClass2.this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
                                            }
                                            AnonymousClass2.this.f3433a.b(copyOnWriteArrayList);
                                            AnonymousClass2.this.f3433a.a(bVarB);
                                            c.a(a.this.q, bVarB, AnonymousClass2.this.f3433a);
                                            return;
                                        }
                                        if (a.this.q == null || a.this.k) {
                                            return;
                                        }
                                        a.this.k = true;
                                        a.this.a(copyOnWriteArrayList);
                                        a.this.q.b(str5, str6, AnonymousClass2.this.f3433a);
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar) {
                                        a.a(a.this, str2, a.this.aa);
                                        if (a.this.q == null || a.this.j) {
                                            return;
                                        }
                                        a.this.j = true;
                                        bVar.a("errorCode: 3301 errorMessage: temp preload failed");
                                        if (AnonymousClass2.this.f3433a == null) {
                                            AnonymousClass2.this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass2.this.f3433a.b(a.this.Z);
                                        AnonymousClass2.this.f3433a.a(bVar);
                                        c.a(a.this.q, bVar, AnonymousClass2.this.f3433a);
                                    }
                                });
                            }
                        });
                    } else {
                        com.mbridge.msdk.reward.adapter.c cVar = this.d;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, this.c, this.e)) {
                            if (a.this.q != null && !a.this.k) {
                                a.this.k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                a.this.a(copyOnWriteArrayList);
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f3433a;
                                if (bVar != null) {
                                    bVar.b(copyOnWriteArrayList);
                                }
                                a.this.q.b(str, str2, this.f3433a);
                            }
                        } else {
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.q != null && !a.this.j) {
                                a.this.j = true;
                                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f3433a == null) {
                                    this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f3433a.b(a.this.Z);
                                this.f3433a.a(bVarB);
                                c.a(a.this.q, bVarB, this.f3433a);
                            }
                        }
                    }
                }
                return;
            }
            if (!a.this.h || a.this.i || a.this.y == null) {
                return;
            }
            a.this.i = true;
            a.this.y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.I, a.this.y, a.this.D, a.this.E, str3, AnonymousClass2.this.b.getRequestIdNotice(), str, str2, AnonymousClass2.this.b.getCMPTEntryUrl(), a.this.z, AnonymousClass2.this.b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass2.this.b.getCMPTEntryUrl()), str2, a.this.n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.2.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, String str7, String str8, a.C0310a c0310a) {
                            if (AnonymousClass2.this.d == null || !AnonymousClass2.this.d.a(copyOnWriteArrayList, AnonymousClass2.this.c, AnonymousClass2.this.e)) {
                                a.a(a.this, str6, a.this.aa);
                                if (a.this.q == null || a.this.j) {
                                    return;
                                }
                                a.this.j = true;
                                com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                                if (AnonymousClass2.this.f3433a == null) {
                                    AnonymousClass2.this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass2.this.f3433a.a(bVarB2);
                                AnonymousClass2.this.f3433a.b(copyOnWriteArrayList);
                                c.a(a.this.q, bVarB2, AnonymousClass2.this.f3433a);
                                return;
                            }
                            if (a.this.q == null || a.this.k) {
                                return;
                            }
                            a.this.k = true;
                            ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                            a.this.a(copyOnWriteArrayList);
                            if (AnonymousClass2.this.f3433a != null) {
                                AnonymousClass2.this.f3433a.b(copyOnWriteArrayList);
                            }
                            a.this.q.b(str5, str6, AnonymousClass2.this.f3433a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar2) {
                            a.a(a.this, str2, a.this.aa);
                            if (a.this.q == null || a.this.j) {
                                return;
                            }
                            a.this.j = true;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3302 errorMessage: tpl preload failed");
                            }
                            if (AnonymousClass2.this.f3433a == null) {
                                AnonymousClass2.this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass2.this.f3433a.b(copyOnWriteArrayList);
                            AnonymousClass2.this.f3433a.a(bVar2);
                            c.a(a.this.q, bVar2, AnonymousClass2.this.f3433a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar) {
            a.this.g = false;
            a aVar = a.this;
            a.a(aVar, aVar.s, a.this.aa);
            if (a.this.q == null || a.this.j) {
                return;
            }
            a.this.j = true;
            if (this.f3433a == null) {
                this.f3433a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f3433a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.a("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f3433a.a(bVar);
            c.a(a.this.q, bVar, this.f3433a);
        }
    }

    /* compiled from: RewardVideoController.java */
    /* renamed from: com.mbridge.msdk.reward.b.a$4, reason: invalid class name */
    final class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f3439a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ CopyOnWriteArrayList c;
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c d;
        final /* synthetic */ boolean e;
        final /* synthetic */ int f;

        AnonymousClass4(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z, int i) {
            this.b = campaignEx;
            this.c = copyOnWriteArrayList;
            this.d = cVar;
            this.e = z;
            this.f = i;
            this.f3439a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            a.this.h = true;
            if (!a.this.g || a.this.i || a.this.y == null) {
                return;
            }
            a.this.i = true;
            a.this.y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.I, a.this.y, a.this.D, a.this.E, str3, AnonymousClass4.this.b.getRequestIdNotice(), str, str2, AnonymousClass4.this.b.getCMPTEntryUrl(), a.this.z, AnonymousClass4.this.b, AnonymousClass4.this.c, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass4.this.b.getCMPTEntryUrl()), str2, a.this.n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.4.1.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str5, String str6, String str7, String str8, String str9, a.C0310a c0310a) {
                            if (AnonymousClass4.this.d == null || !AnonymousClass4.this.d.a(AnonymousClass4.this.c, AnonymousClass4.this.e, AnonymousClass4.this.f)) {
                                a.a(a.this, str7, a.this.aa);
                                if (a.this.q == null || a.this.j) {
                                    return;
                                }
                                a.this.j = true;
                                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                if (AnonymousClass4.this.f3439a == null) {
                                    AnonymousClass4.this.f3439a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass4.this.f3439a.b(AnonymousClass4.this.c);
                                AnonymousClass4.this.f3439a.a(bVarB);
                                c.a(a.this.q, bVarB, AnonymousClass4.this.f3439a);
                                return;
                            }
                            if (a.this.q == null || a.this.k) {
                                return;
                            }
                            a.this.k = true;
                            ad.a("RewardVideoController", "Cache onVideoLoadSuccess");
                            a.this.a(AnonymousClass4.this.c);
                            if (AnonymousClass4.this.f3439a != null) {
                                AnonymousClass4.this.f3439a.b(AnonymousClass4.this.c);
                            }
                            a.this.q.b(str6, str7, AnonymousClass4.this.f3439a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str5, String str6, String str7, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar) {
                            a.a(a.this, str2, a.this.aa);
                            if (a.this.q == null || a.this.j) {
                                return;
                            }
                            a.this.j = true;
                            if (bVar != null) {
                                bVar.a("errorCode: 3303 errorMessage: tpl temp preload failed");
                            }
                            if (AnonymousClass4.this.f3439a == null) {
                                AnonymousClass4.this.f3439a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4.this.f3439a.b(AnonymousClass4.this.c);
                            AnonymousClass4.this.f3439a.a(bVar);
                            c.a(a.this.q, bVar, AnonymousClass4.this.f3439a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.d().getUnitId();
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            a.a(aVar, unitId, aVar.aa);
            if (this.f3439a == null) {
                this.f3439a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f3439a.a(bVar);
            this.f3439a.b(this.c);
            a.this.h = false;
            if (a.this.q == null || a.this.j) {
                return;
            }
            a.this.j = true;
            c.a(a.this.q, bVar, this.f3439a);
        }
    }

    private boolean c(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.m;
            if (cVar == null || !str.equals(cVar.a())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.l, this.v, str);
                this.m = cVar2;
                cVar2.b(this.D);
                this.m.c(this.E);
            }
            this.m.a(this.z);
            this.m.a(this.n);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
        List<CampaignEx> listA = com.mbridge.msdk.videocommon.a.a.a().a(str, 1, this.E);
        this.aa = com.mbridge.msdk.videocommon.a.a.a().b(str, 1, this.E);
        if (listA != null && listA.size() > 0) {
            com.mbridge.msdk.videocommon.a.a.a().a(str, listA, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.Z;
            if (copyOnWriteArrayList == null) {
                this.Z = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listA) {
                campaignEx.setLocalRequestId(str2);
                this.Z.add(campaignEx);
            }
            a(this.Z);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.Z;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    /* compiled from: RewardVideoController.java */
    public final class c {
        private WeakReference<InterVideoOutListener> b;
        private volatile AtomicInteger c;
        private Handler d;
        private String e;
        private boolean f;

        private c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.b = new WeakReference<>(interVideoOutListener);
            this.c = new AtomicInteger(0);
            this.d = handler;
            this.e = str;
        }

        public final void a(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.c.get() == 2 || this.d == null) {
                return;
            }
            this.c.set(2);
            if (a.this.V) {
                return;
            }
            a.this.V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.b(a.this.M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.d.sendMessage(messageObtain);
            }
        }

        public final void b(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.c.get() == 2 || this.d == null) {
                return;
            }
            if (this.c.get() == 1) {
                this.c.set(3);
            }
            if (a.this.V) {
                return;
            }
            a.this.V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.a(true);
            bVar.b(a.this.M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (bVar != null) {
                    bundle.putSerializable("metrics_data_lrid", bVar.f());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.d.sendMessage(messageObtain);
            }
            if (a.this.W) {
                this.c.set(2);
            }
        }

        public final void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String strB;
            if (bVar == null || bVar2 == null) {
                strB = "";
            } else {
                strB = bVar.b();
                bVar2.a(bVar);
            }
            if (a.this.m != null) {
                a.this.m.a(a.this.f3431a);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListE = a.this.m.e();
                CampaignEx campaignEx = (a.this.M == null || a.this.M.size() == 0) ? null : (CampaignEx) a.this.M.get(0);
                if (campaignEx == null) {
                    campaignEx = (copyOnWriteArrayListE == null || copyOnWriteArrayListE.size() == 0) ? null : copyOnWriteArrayListE.get(0);
                }
                CampaignEx campaignEx2 = campaignEx;
                if (a.this.E && ((campaignEx2 == null || TextUtils.isEmpty(campaignEx2.getNLRid())) && ((copyOnWriteArrayListE == null || copyOnWriteArrayListE.size() == 0) && a.this.m.a(campaignEx2, true, bVar, 2, bVar2)))) {
                    return;
                } else {
                    a.this.m.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.c.get() == 2 || this.d == null) {
                return;
            }
            a.this.W = true;
            if (!a.this.Y || strB.contains("resource load timeout")) {
                a.this.X = true;
            }
            if (a.this.V) {
                this.c.set(2);
            }
            if (a.this.W && a.this.X && !a.this.V) {
                this.c.set(2);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strB;
                    messageObtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        messageObtain.setData(bundle);
                    }
                    this.d.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = this.b;
            a.a(a.this, "2000047", bVar, weakReference != null ? weakReference.get() : null);
            if (this.d != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (bVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVar.f());
                    messageObtain.setData(bundle);
                }
                this.d.sendMessage(messageObtain);
            }
        }

        public final void a(boolean z) {
            this.f = z;
        }

        static /* synthetic */ int a(c cVar) {
            return cVar.c.get();
        }

        static /* synthetic */ void a(c cVar, int i) {
            cVar.c.set(i);
        }

        static /* synthetic */ void a(c cVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            cVar.c.set(2);
            cVar.a(str, bVar);
        }

        static /* synthetic */ void a(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.d == null || a.this.U) {
                return;
            }
            a.this.U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                cVar.d.sendMessage(messageObtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.b(str, str2, bVar);
                }
            }
        }

        static /* synthetic */ void a(c cVar, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.c.get() == 2 || cVar.d == null) {
                return;
            }
            a.this.X = true;
            String strB = bVar != null ? bVar.b() : "";
            if (strB.contains("resource load timeout")) {
                a.this.W = true;
            }
            if (a.this.X && a.this.W && !a.this.V) {
                cVar.c.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strB;
                    messageObtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        messageObtain.setData(bundle);
                    }
                    cVar.d.sendMessage(messageObtain);
                }
                if (bVar2 == null) {
                    bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                bVar2.a(true);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
            }
        }

        static /* synthetic */ void b(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((cVar.c.get() != 1 && cVar.c.get() != 3) || cVar.d == null || a.this.U) {
                return;
            }
            a.this.U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                cVar.d.sendMessage(messageObtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.a(str, str2, bVar);
                }
            }
        }
    }

    private void a(Queue<Integer> queue, boolean z, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        Integer numPoll;
        int iIntValue = 25;
        if (queue != null) {
            try {
                if (queue.size() > 0 && (numPoll = queue.poll()) != null) {
                    iIntValue = numPoll.intValue();
                }
            } catch (Exception e2) {
                com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e2.getMessage());
                if (bVar != null) {
                    bVar.a(bVarB);
                    bVar.c(true);
                }
                a(bVarB, bVar);
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            a(1, iIntValue, z, str, bVar);
        } catch (Exception e3) {
            com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e3.getMessage());
            if (bVar != null) {
                bVar.a(bVarB2);
                bVar.c(true);
            }
            a(bVarB2, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e3.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        if (this.q != null) {
            this.X = true;
            this.q.a(bVar, bVar2);
        }
    }

    private void a(int i, int i2, boolean z, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.m;
            if (cVar == null || !this.s.equals(cVar.a())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.l, this.v, this.s);
                this.m = cVar2;
                cVar2.b(this.D);
                this.m.c(this.E);
            }
            if (this.D) {
                this.m.a(this.A, this.B, this.C);
            }
            this.m.a(this.z);
            this.m.a(this.n);
            RunnableC0296a runnableC0296a = new RunnableC0296a(this.m, i, z, str, bVar);
            runnableC0296a.a(i2);
            b bVar2 = new b(this.m, z);
            this.f3431a = bVar2;
            bVar2.a(runnableC0296a);
            this.m.a(this.f3431a);
            this.m.a(i, i2, z, str, this.I, bVar);
            this.y.postDelayed(runnableC0296a, i2 * 1000);
        } catch (Exception e2) {
            com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880020, e2.getMessage());
            if (bVar != null) {
                bVar.a(bVarB);
                bVar.c(true);
            }
            a(bVarB, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.videocommon.d.c cVar;
        com.mbridge.msdk.videocommon.d.c cVar2;
        boolean zB;
        boolean zC;
        try {
            if (this.m == null) {
                r();
            }
            if (this.m != null) {
                ad.b("RewardVideoController", "controller 819");
                if (this.E) {
                    zB = e(false);
                } else {
                    zB = this.m.b();
                }
                if (zB) {
                    ad.c("RewardVideoController", "invoke adapter show isReady");
                    d dVar = new d(this, this.y);
                    f.put(this.s, dVar);
                    this.m.a(dVar, str, this.r, this.z, this.u, bVar);
                    this.c = false;
                    return;
                }
                if (!this.E) {
                    zC = this.m.c();
                } else {
                    if (this.m == null) {
                        r();
                    }
                    List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.a.a.a().a(this.s);
                    if (listA == null || listA.size() <= 0) {
                        zC = false;
                    } else {
                        for (com.mbridge.msdk.foundation.entity.c cVar3 : listA) {
                            if (cVar3 != null) {
                                this.m.a(cVar3.a());
                                this.m.d = cVar3.d();
                                if (this.m.c()) {
                                    zC = true;
                                    break;
                                }
                                com.mbridge.msdk.videocommon.a.a.a().c(this.s, cVar3.a());
                            }
                        }
                        zC = false;
                    }
                }
                if (zC) {
                    ad.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    d dVar2 = new d(this, this.y);
                    f.put(this.s, dVar2);
                    this.m.a(dVar2, str, this.r, this.z, this.u, bVar);
                    this.c = false;
                    return;
                }
            }
            this.c = false;
            a("2000131", bVar, this.p, "can't show because load is failed");
            if (this.p != null) {
                try {
                    this.p.onShowFail(bVar, this.t, "can't show because load is failed");
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e2.getMessage());
                    }
                }
            }
            if (this.D || this.E || (cVar2 = this.n) == null || !cVar2.s(4) || this.q == null || c.a(this.q) == 1 || c.a(this.q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.s, true, 1));
        } catch (Exception e3) {
            this.c = false;
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e3.getLocalizedMessage());
            }
            a("2000131", bVar, this.p, "show exception");
            if (this.p != null) {
                try {
                    this.p.onShowFail(bVar, this.t, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e3.getMessage());
                    }
                }
            }
            if (this.D || this.E || (cVar = this.n) == null || !cVar.s(4) || this.q == null || c.a(this.q) == 1 || c.a(this.q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.s, true, 1));
        }
    }

    public final boolean d(boolean z) {
        try {
            if (s()) {
                if (!z) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                return false;
            }
            if (this.E) {
                try {
                    return e(z);
                } catch (Exception e2) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    ad.b("RewardVideoController", e2.getMessage());
                    return false;
                }
            }
            if (this.m == null) {
                r();
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.m;
            if (cVar != null) {
                return cVar.b();
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b("RewardVideoController", th.getMessage());
            return false;
        }
    }

    private boolean e(boolean z) {
        if (z) {
            d("is_ready_start", "");
        }
        if (this.m == null) {
            r();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.a.a.a().a(this.s);
        if (listA == null || listA.size() <= 0) {
            if (!z) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String strB = com.mbridge.msdk.foundation.same.a.d.b(this.s);
        boolean zA = TextUtils.isEmpty(strB) ? false : a(listA, strB);
        if (z) {
            d("is_ready_ctir_" + zA, "");
        }
        if (zA) {
            return zA;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.m.a(cVar.a());
                this.m.d = cVar.d();
                if (this.m.d(z)) {
                    return true;
                }
            }
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.m.a(cVar.a());
                this.m.d = cVar.d();
                if (this.m.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void r() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.l, this.v, this.s);
        this.m = cVar;
        cVar.b(this.D);
        this.m.c(this.E);
        if (this.D) {
            this.m.a(this.A, this.B, this.C);
        }
        this.m.a(this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.d.d r14) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.d.d):void");
    }

    private com.mbridge.msdk.foundation.same.report.d.b a(com.mbridge.msdk.foundation.same.report.d.d dVar) {
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.s);
            String currentLocalRid = "";
            if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0 && (campaignEx = copyOnWriteArrayListA.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            bVar = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.d.c.a().b().get(currentLocalRid);
            if (bVar != null) {
                bVar.b(copyOnWriteArrayListA);
                bVar.a("2000128", dVar);
                bVar.c(currentLocalRid);
                bVar.d(this.s);
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            try {
                bVar.d(this.s);
                dVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                bVar.a("2000128", dVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    bVar.c(SameMD5.getMD5(ai.d()));
                } else {
                    bVar.c(currentLocalRid);
                    bVar.b(copyOnWriteArrayListA);
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(currentLocalRid, bVar);
                }
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            } catch (Exception e2) {
                e = e2;
                bVar = bVar;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
                return bVar;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private boolean s() {
        try {
            if (this.R == null) {
                this.R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            i iVarA = i.a(this.R);
            if (this.n == null) {
                this.n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.s, this.D);
            }
            int iD = this.n.d();
            if (iVarA != null) {
                return iVarA.a(this.s, iD);
            }
            return false;
        } catch (Throwable unused) {
            ad.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    /* compiled from: RewardVideoController.java */
    /* renamed from: com.mbridge.msdk.reward.b.a$a, reason: collision with other inner class name */
    public class RunnableC0296a implements Runnable {
        private final com.mbridge.msdk.reward.adapter.c b;
        private final int c;
        private final boolean d;
        private boolean e;
        private int f;
        private String g;
        private com.mbridge.msdk.foundation.same.report.d.b h;

        public RunnableC0296a(com.mbridge.msdk.reward.adapter.c cVar, int i, boolean z, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.e = false;
            this.b = cVar;
            this.c = i;
            this.d = z;
            this.e = false;
            if (cVar != null) {
                cVar.e(false);
            }
            this.g = str;
            this.h = bVar;
        }

        public final void a() {
            this.e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.b;
            if (cVar != null) {
                cVar.e(true);
            }
            ad.b("RewardVideoController", "adSource=" + this.c + " CommonCancelTimeTask mIsDevCall：" + this.d);
            a.this.a(com.mbridge.msdk.foundation.c.a.b(880023, "v3 is timeout"), this.h);
        }

        public final void a(int i) {
            this.f = i;
        }
    }

    /* compiled from: RewardVideoController.java */
    public class b implements com.mbridge.msdk.reward.adapter.a {
        private com.mbridge.msdk.reward.adapter.c b;
        private boolean c;
        private RunnableC0296a d;

        public b(com.mbridge.msdk.reward.adapter.c cVar, boolean z) {
            this.b = cVar;
            this.c = z;
        }

        public final void a(RunnableC0296a runnableC0296a) {
            this.d = runnableC0296a;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0296a runnableC0296a = this.d;
            if (runnableC0296a != null) {
                runnableC0296a.a();
                a.this.y.removeCallbacks(this.d);
            }
            if (a.this.q != null) {
                c.b(a.this.q, a.this.v, a.this.s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0296a runnableC0296a = this.d;
            if (runnableC0296a != null) {
                runnableC0296a.a();
                a.this.y.removeCallbacks(this.d);
            }
            a.this.a(list);
            if (a.this.q != null) {
                a.this.q.a(a.this.v, a.this.s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            RunnableC0296a runnableC0296a = this.d;
            if (runnableC0296a != null) {
                runnableC0296a.a();
                a.this.y.removeCallbacks(this.d);
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.b;
            if (cVar != null) {
                cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                this.b = null;
            }
            a.this.a(list);
            if (a.this.q != null) {
                a.this.q.a(bVar, bVar2);
            }
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.M = list;
    }

    public final String d() {
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        return cVar != null ? cVar.f() : "";
    }

    private String a(String str) {
        try {
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(ai.d()) : "";
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(ai.d()) : md5;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e2.printStackTrace();
            return "";
        }
    }

    public final com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVarB = null;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    bVarB = com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return bVarB == null ? new com.mbridge.msdk.foundation.same.report.d.b() : bVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(this.M);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (!TextUtils.isEmpty(str2)) {
            dVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            dVar.a("listener_state", 1);
        } else {
            dVar.a("listener_state", 2);
        }
        bVar.a(str, dVar);
        com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.foundation.same.report.d.b a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.d.b r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.d.b r0 = new com.mbridge.msdk.foundation.same.report.d.b
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L35
            int r2 = r5.size()     // Catch: java.lang.Exception -> L9f
            if (r2 <= 0) goto L35
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            if (r3 == 0) goto L2b
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L9f
            goto L2c
        L2b:
            r2 = r1
        L2c:
            r0.c(r1)     // Catch: java.lang.Exception -> L9f
            r0.b(r5)     // Catch: java.lang.Exception -> L9f
            r5 = r1
            r1 = r2
            goto L36
        L35:
            r5 = r1
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L3d
            return r6
        L3d:
            com.mbridge.msdk.foundation.same.report.d.d r6 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L9f
            r6.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = r4.D     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto L70
            r6 = 287(0x11f, float:4.02E-43)
            goto L72
        L70:
            r6 = 94
        L72:
            r0.b(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "1"
            r0.i(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "2"
            r0.b(r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L9f
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L9f
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L9f
            goto La7
        L9f:
            r5 = move-exception
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La7
            r5.printStackTrace()
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.d.b):com.mbridge.msdk.foundation.same.report.d.b");
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.d(this.s);
            bVar.b(this.D ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("event_name", str);
            dVar.a("reason", str2);
            bVar.a("m_temp_is_ready_check", dVar);
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.Z;
    }

    public final List<CampaignEx> f() {
        return this.aa;
    }

    public final com.mbridge.msdk.reward.adapter.c g() {
        return this.m;
    }

    public final boolean h() {
        return this.H;
    }

    public final String i() {
        return this.s;
    }

    public final String j() {
        return this.v;
    }

    public final c k() {
        return this.q;
    }

    public final InterVideoOutListener l() {
        return this.p;
    }

    public final boolean m() {
        return this.E;
    }

    public final MBridgeIds n() {
        return this.t;
    }

    public final boolean o() {
        return this.D;
    }

    static /* synthetic */ void a(a aVar, String str, List list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || aVar.V) {
                    return;
                }
                com.mbridge.msdk.foundation.db.f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a((List<CampaignEx>) list, str);
            } catch (Throwable th) {
                ad.b("RewardVideoController", th.getMessage());
            }
        }
    }

    static /* synthetic */ void a(a aVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener) {
        if (aVar.H) {
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(aVar.M);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (interVideoOutListener != null) {
                    dVar.a("listener_state", 1);
                } else {
                    dVar.a("listener_state", 2);
                }
                bVar.a(str, dVar);
                com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
