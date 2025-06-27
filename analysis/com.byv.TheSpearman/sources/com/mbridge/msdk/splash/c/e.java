package com.mbridge.msdk.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.a.d;
import com.mbridge.msdk.splash.c.c;
import com.mbridge.msdk.splash.c.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: SplashLoadManager.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f3490a = "SplashLoadManager";
    private String b;
    private String c;
    private long d;
    private long e;
    private com.mbridge.msdk.splash.d.b f;
    private MBSplashView h;
    private k i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private String n;
    private int o;
    private boolean p;
    private volatile boolean q;
    private com.mbridge.msdk.videocommon.listener.a r;
    private H5DownLoadManager.ZipDownloadListener s;
    private String t;
    private int u;
    private int w;
    private List<CampaignEx> x;
    private String v = "";
    private String y = "";
    private Handler z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.e.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) throws Throwable {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i2 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i2);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.b((CampaignEx) obj2, eVar.o);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i3 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i3 == 1 ? 880004 : i3 == 2 ? 880006 : 880027);
                    bVar.a(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.n, e.this.o, campaignEx2);
                }
            } catch (Exception e) {
                com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880024);
                bVar2.a((Throwable) e);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.n, e.this.o, (CampaignEx) null);
            }
        }
    };
    private Runnable A = new Runnable() { // from class: com.mbridge.msdk.splash.c.e.4
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.n, e.this.o, (CampaignEx) null);
        }
    };
    private Context g = com.mbridge.msdk.foundation.controller.c.m().c();

    public e(String str, String str2, long j) {
        this.c = str;
        this.b = str2;
        this.e = j;
    }

    public final void a(k kVar) {
        this.i = kVar;
    }

    public final void a(MBSplashView mBSplashView) {
        this.h = mBSplashView;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void a(int i, int i2) {
        this.m = i;
        this.l = i2;
    }

    public final void b(int i) {
        this.w = i;
    }

    public final String a() {
        return this.v;
    }

    public final String b() {
        return com.mbridge.msdk.foundation.same.c.a(this.x);
    }

    public final void a(String str, int i) {
        this.q = false;
        this.n = str;
        this.o = i;
        CampaignEx campaignExA = d.a(this.h, this.c, this.b, str, this.j, this.k, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.i.m() == 1 && i != 1 && campaignExA != null) {
            a(campaignExA, i);
            return;
        }
        this.p = true;
        if (i == 1) {
            List<Integer> listC = this.i.c();
            if (listC != null && listC.size() > 0) {
                this.d = listC.get(0).intValue() * 1000;
            } else {
                this.d = 30000L;
            }
        } else {
            long j = this.e;
            if (j <= 0) {
                this.d = this.i.r();
            } else {
                this.d = j;
            }
        }
        if (this.i == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.d);
            a(this.g, str, i);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.i.o() * 1000) {
            a(this.d);
            a(this.g, str, i);
        } else {
            a(campaignExA, i);
        }
    }

    private void a(long j) {
        this.z.postDelayed(this.A, j);
    }

    private void a(Context context, final String str, final int i) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.c.b(880025), str, i, (CampaignEx) null);
                return;
            }
            if (an.a(this.b)) {
                a(new com.mbridge.msdk.foundation.c.b(880032), str, i, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.c, this.b);
            com.mbridge.msdk.splash.f.f fVar = new com.mbridge.msdk.splash.f.f();
            fVar.a(i);
            fVar.b(this.u);
            fVar.a(this.t);
            fVar.c(this.m);
            fVar.d(this.l);
            com.mbridge.msdk.foundation.same.net.h.e eVarA = com.mbridge.msdk.splash.f.e.a(context, mBridgeIds, fVar);
            if (eVarA == null) {
                a(new com.mbridge.msdk.foundation.c.b(880001), str, i, (CampaignEx) null);
                return;
            }
            if (eVarA != null && !TextUtils.isEmpty(str)) {
                eVarA.a("token", str);
            }
            String strD = ai.d(this.b);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            com.mbridge.msdk.splash.f.c cVar = new com.mbridge.msdk.splash.f.c(context);
            com.mbridge.msdk.splash.f.b bVar = new com.mbridge.msdk.splash.f.b(i) { // from class: com.mbridge.msdk.splash.c.e.5
                @Override // com.mbridge.msdk.splash.f.b
                public final void a(CampaignUnit campaignUnit, int i2) throws Throwable {
                    try {
                        e eVar = e.this;
                        e.a(eVar, campaignUnit, i2, eVar.b, str);
                        e.this.v = campaignUnit.getRequestId();
                        e.this.x = campaignUnit.getAds();
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                        bVar2.a((Throwable) e);
                        e.this.a(bVar2, str, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                        e.this.u = 0;
                    }
                }

                @Override // com.mbridge.msdk.splash.f.b
                public final void a(int i2, String str2) throws Throwable {
                    ad.b(e.f3490a, str2);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
                    bVar2.a(str2);
                    e.this.a(bVar2, str, i, (CampaignEx) null);
                    e.this.u = 0;
                }
            };
            bVar.a(str);
            bVar.setUnitId(this.b);
            bVar.setPlacementId(this.c);
            bVar.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, eVarA, bVar, str);
        } catch (Exception e) {
            ad.b(f3490a, e.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880020);
            bVar2.a((Throwable) e);
            a(bVar2, str, i, (CampaignEx) null);
            this.u = 0;
        }
    }

    public final void a(com.mbridge.msdk.splash.d.b bVar) {
        this.f = bVar;
    }

    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
        if (this.r != null) {
            this.r = null;
        }
        if (this.s != null) {
            this.s = null;
        }
    }

    private void a(CampaignEx campaignEx, int i) throws Throwable {
        MBSplashView mBSplashView = this.h;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            d(campaignEx, i);
        } else {
            MBSplashView mBSplashView2 = this.h;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (d.a(this.h, campaignEx)) {
            b(campaignEx, i);
        } else {
            c(campaignEx, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx, int i) {
        if (!d.a(this.h, campaignEx) || this.q) {
            return;
        }
        e();
        if (this.p) {
            d.a(campaignEx, this.b);
        }
        this.q = true;
        com.mbridge.msdk.splash.d.b bVar = this.f;
        if (bVar != null) {
            bVar.a(campaignEx, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, String str, int i, CampaignEx campaignEx) throws Throwable {
        if (this.p) {
            this.p = false;
            a(bVar, i, str, campaignEx);
        } else {
            a(bVar, i, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = d.a(this.h, this.c, this.b, str, this.j, this.k, true, false);
        if (campaignExA != null) {
            a(campaignExA, i);
        } else {
            a(bVar, i, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i, CampaignEx campaignEx) {
        if (this.q) {
            return;
        }
        e();
        this.q = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.d.b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.a(bVar, i);
        }
    }

    private void e() {
        this.z.removeCallbacks(this.A);
    }

    private void c(CampaignEx campaignEx, int i) throws Throwable {
        this.h.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            f(campaignEx, i);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            e(campaignEx, i);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            g(campaignEx, i);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        d(campaignEx, i);
    }

    private void d(final CampaignEx campaignEx, final int i) {
        d.a(this.h, campaignEx, new com.mbridge.msdk.splash.view.nativeview.a() { // from class: com.mbridge.msdk.splash.c.e.8
            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void a() {
                if (campaignEx.isDynamicView() && e.this.h != null) {
                    e.this.h.setImageReady(true);
                    e.b(e.this, campaignEx, i);
                }
                e.this.b(campaignEx, i);
            }

            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void b() throws Throwable {
                if (!campaignEx.isDynamicView() || e.this.h == null) {
                    return;
                }
                e.this.h.setImageReady(false);
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
                e eVar = e.this;
                eVar.a(bVar, eVar.n, i, campaignEx);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[Catch: Exception -> 0x0101, PHI: r3 r7
      0x009f: PHI (r3v2 java.io.FileOutputStream) = (r3v3 java.io.FileOutputStream), (r3v5 java.io.FileOutputStream) binds: [B:36:0x00bb, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v1 java.io.File) = (r7v3 java.io.File), (r7v7 java.io.File) binds: [B:36:0x00bb, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0101, blocks: (B:47:0x00fd, B:48:0x0100, B:38:0x00be, B:40:0x00c4, B:42:0x00ca, B:44:0x00d0, B:45:0x00f0, B:25:0x009f), top: B:57:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(com.mbridge.msdk.foundation.entity.CampaignEx r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.c.e.e(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void f(final CampaignEx campaignEx, final int i) {
        if (campaignEx.isDynamicView()) {
            n.a(5, "", campaignEx.getAdZip(), new n.a() { // from class: com.mbridge.msdk.splash.c.e.9
                @Override // com.mbridge.msdk.foundation.tools.n.a
                public final void a(String str, String str2, String str3, String str4, boolean z) {
                    if (z) {
                        return;
                    }
                    e.a(e.this, campaignEx, str, true, "");
                }

                @Override // com.mbridge.msdk.foundation.tools.n.a
                public final void a(String str, DownloadError downloadError) {
                    String message = "";
                    if (downloadError != null) {
                        try {
                            if (downloadError.getException() != null) {
                                message = downloadError.getException().getMessage();
                            }
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                                return;
                            }
                            return;
                        }
                    }
                    e.a(e.this, campaignEx, str, false, message);
                }
            }, campaignEx);
            return;
        }
        this.s = new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.splash.c.e.10
            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onSuccess(String str, String str2, boolean z) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = campaignEx;
                messageObtain.arg1 = i;
                e.this.z.sendMessage(messageObtain);
                if (z) {
                    return;
                }
                CampaignEx campaignEx2 = campaignEx;
                e.a(e.this, campaignEx, campaignEx2 != null ? campaignEx2.getAdZip() : "", true, "");
            }

            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onFailed(String str, String str2) throws Throwable {
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880006);
                e eVar = e.this;
                eVar.a(bVar, eVar.n, i, campaignEx);
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 2);
                messageObtain.obj = bundle;
                e.this.z.sendMessage(messageObtain);
                e.a(e.this, campaignEx, str2, false, str);
            }
        };
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.b(297);
        bVar.a(2);
        bVar.a(campaignEx);
        int i2 = 0;
        if (campaignEx != null && campaignEx.getAabEntity() != null) {
            i2 = campaignEx.getAabEntity().h3c;
        }
        bVar.c(i2);
        H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getAdZip(), this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final CampaignEx campaignEx, final int i) {
        g.c cVar = new g.c();
        cVar.c(this.b);
        cVar.b(this.c);
        cVar.a(campaignEx);
        cVar.a(str);
        cVar.a(this.j);
        cVar.a(this.k);
        g.a.f3504a.a(this.h, cVar, new g.b() { // from class: com.mbridge.msdk.splash.c.e.2
            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a() {
                if (campaignEx.isHasMBTplMark()) {
                    return;
                }
                e.c(e.this, campaignEx, i);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(String str2) throws Throwable {
                e.a(e.this, str2, i, campaignEx);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(int i2) throws Throwable {
                if (i2 == 1) {
                    e.c(e.this, campaignEx, i);
                } else {
                    e.a(e.this, "readyState 2", i, campaignEx);
                }
            }
        });
    }

    private void g(final CampaignEx campaignEx, int i) throws ClassNotFoundException {
        this.r = new com.mbridge.msdk.videocommon.listener.a() { // from class: com.mbridge.msdk.splash.c.e.3
            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str) {
                e.this.h.setVideoReady(true);
                Message messageObtain = Message.obtain();
                messageObtain.obj = campaignEx;
                messageObtain.what = 3;
                e.this.z.sendMessage(messageObtain);
            }

            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str, String str2) throws Throwable {
                e.this.h.setVideoReady(false);
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880004);
                bVar.a(str);
                e eVar = e.this;
                eVar.a(bVar, eVar.n, e.this.o, campaignEx);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 1);
                messageObtain.obj = bundle;
                messageObtain.what = 2;
                e.this.z.sendMessage(messageObtain);
            }
        };
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.g, this.b, copyOnWriteArrayList, 297, this.r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().a(297, this.b, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.b);
        } else {
            this.h.setVideoReady(true);
            b(campaignEx, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mbridge.msdk.foundation.same.report.d.a.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    static /* synthetic */ void a(e eVar, CampaignUnit campaignUnit, int i, String str, String str2) throws Throwable {
        ArrayList arrayList;
        com.mbridge.msdk.foundation.c.b bVar;
        final CampaignEx campaignEx = 0;
        campaignEx = 0;
        campaignEx = 0;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            final CampaignEx campaignEx2 = campaignUnit.getAds().get(0);
            campaignEx2.setCampaignUnitId(eVar.b);
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.c.e.7
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.foundation.db.k.a(h.a(e.this.g)).a();
                    ai.a(e.this.g, campaignEx2);
                }
            }).start();
            eVar.t = campaignUnit.getSessionId();
            if (campaignEx2.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx2.getAdZip()) || !TextUtils.isEmpty(campaignEx2.getAdHtml()))) {
                if (ai.c(campaignEx2)) {
                    campaignEx2.setRtinsType(ai.c(eVar.g, campaignEx2.getPackageName()) ? 1 : 2);
                }
                if (com.mbridge.msdk.foundation.same.c.a(eVar.g, campaignEx2)) {
                    arrayList.add(campaignEx2);
                } else {
                    ai.a(eVar.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                    eVar.y = "APP ALREADY INSTALLED";
                }
                try {
                    com.mbridge.msdk.foundation.same.c.a(campaignEx2, eVar.g, null, new c.a() { // from class: com.mbridge.msdk.splash.c.e.6
                        @Override // com.mbridge.msdk.foundation.same.c.a
                        public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                            try {
                                com.mbridge.msdk.foundation.same.report.d.c.a().a(str3, bVar2, campaignEx2, e.this.g, campaignEx);
                            } catch (Exception e) {
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    });
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            if (eVar.y.contains("INSTALLED")) {
                bVar = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
            } else {
                bVar = new com.mbridge.msdk.foundation.c.b(880003);
            }
            if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() != 0) {
                campaignEx = campaignUnit.getAds().get(0);
            }
            eVar.a(bVar, str2, i, campaignEx);
            return;
        }
        try {
            int i2 = eVar.u + 1;
            eVar.u = i2;
            k kVar = eVar.i;
            if (kVar == null || i2 > kVar.w()) {
                eVar.u = 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        CampaignEx campaignEx3 = (CampaignEx) arrayList.get(0);
        if (!TextUtils.isEmpty(campaignEx3.getAdZip()) || (!TextUtils.isEmpty(campaignEx3.getAdHtml()) && campaignEx3.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx3.setHasMBTplMark(true);
            campaignEx3.setIsMraid(false);
        } else {
            campaignEx3.setHasMBTplMark(false);
            campaignEx3.setIsMraid(true);
        }
        eVar.a(campaignEx3, i);
    }

    static /* synthetic */ void b(e eVar, final CampaignEx campaignEx, final int i) {
        if (campaignEx.isDynamicView()) {
            d.a aVar = new d.a();
            aVar.b(eVar.b).a(eVar.c).a(eVar.j).a(campaignEx).a(eVar.k).h(eVar.w);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                ad.b(f3490a, th.getMessage());
            }
            c.a.f3486a.a(eVar.h, new com.mbridge.msdk.splash.a.d(aVar), new com.mbridge.msdk.splash.b.a() { // from class: com.mbridge.msdk.splash.c.e.11
                @Override // com.mbridge.msdk.splash.b.a
                public final void a(View view) {
                    if (e.this.h != null) {
                        e.this.h.setDynamicView(true);
                        e.this.h.setSplashNativeView(view);
                        e.this.b(campaignEx, i);
                    }
                }

                @Override // com.mbridge.msdk.splash.b.a
                public final void a(String str) throws Throwable {
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880034);
                    bVar.a(str);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.n, i, campaignEx);
                }
            });
        }
    }

    static /* synthetic */ void a(e eVar, CampaignEx campaignEx, String str, boolean z, String str2) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.e(2);
            nVar.a("m_download_end");
            if (campaignEx != null) {
                nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f2819a : com.mbridge.msdk.foundation.entity.n.b);
                nVar.g(campaignEx.getRequestIdNotice());
            }
            nVar.a("url", str);
            nVar.a("scenes", "1");
            if (z) {
                nVar.b(1);
            } else {
                nVar.b(3);
                nVar.h(str2);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f3490a, e.getMessage());
            }
        }
    }

    static /* synthetic */ void c(e eVar, CampaignEx campaignEx, int i) {
        if (eVar.h.isH5Ready()) {
            return;
        }
        eVar.h.setH5Ready(true);
        eVar.b(campaignEx, i);
    }

    static /* synthetic */ void a(e eVar, String str, int i, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880009);
        bVar.a(str);
        eVar.a(bVar, eVar.n, i, campaignEx);
    }
}
