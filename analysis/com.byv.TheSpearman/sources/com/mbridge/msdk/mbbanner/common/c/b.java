package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: BannerLoader.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3047a = "b";
    private Context b;
    private com.mbridge.msdk.mbbanner.common.a.c d;
    private com.mbridge.msdk.mbbanner.common.util.a e;
    private com.mbridge.msdk.mbbanner.common.b.b f;
    private com.mbridge.msdk.mbbanner.common.b.d g;
    private int c = 0;
    private volatile boolean h = false;
    private Timer i = new Timer();
    private volatile List<String> j = new ArrayList();
    private volatile boolean k = false;
    private volatile boolean l = false;
    private volatile boolean m = false;
    private String n = "";

    public b(Context context, com.mbridge.msdk.mbbanner.common.a.c cVar, com.mbridge.msdk.mbbanner.common.b.b bVar, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.b = context.getApplicationContext();
        this.d = cVar;
        this.f = bVar;
        this.e = aVar;
    }

    private void a(String str) {
        if (this.m) {
            return;
        }
        if ((this.k || this.l) && this.j.size() == 0) {
            ad.c(f3047a, "在子线程处理业务逻辑 完成");
            this.h = true;
            this.m = true;
            this.i.cancel();
            this.e.a(this.f, str);
            this.g.a(str);
        }
    }

    public final void a(String str, int i, String str2, boolean z, CampaignEx campaignEx) {
        if (z) {
            if (i == 1) {
                ad.c(f3047a, "downloadResource--> Success Image");
                synchronized (this) {
                    this.j.remove(str2);
                    if (this.j.size() == 0) {
                        a(str);
                    }
                }
                return;
            }
            if (i == 2) {
                ad.c(f3047a, "downloadResource--> Success banner_html");
                this.l = true;
                a(str);
                return;
            } else {
                if (i == 3) {
                    ad.c(f3047a, "downloadResource--> Success banner_url");
                    this.k = true;
                    a(str);
                    return;
                }
                return;
            }
        }
        if (i == -1) {
            ad.b(f3047a, " unitId =" + str + " --> time out!");
        }
        this.i.cancel();
        String str3 = f3047a;
        ad.c(str3, "在子线程处理业务逻辑 完成");
        ad.c(str3, "downloadResource--> Fail");
        this.h = true;
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.a(campaignEx);
        this.e.b(this.f, bVar);
        this.g.a(str);
    }

    public final void a(String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.d dVar) {
        boolean z;
        try {
            ad.c(f3047a, "requestCampaign--> started");
            this.g = dVar;
            com.mbridge.msdk.mbbanner.common.f.a aVar = new com.mbridge.msdk.mbbanner.common.f.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.2
                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(CampaignUnit campaignUnit) throws Throwable {
                    try {
                        ad.c(b.f3047a, "requestCampaign--> Succeed");
                        b.this.e.a(b.this.f, campaignUnit, this.unitId);
                        b.a(b.this, this.unitId, campaignUnit);
                    } catch (Exception e) {
                        ad.c(b.f3047a, "requestCampaign--> Fail with exception = " + e.getMessage());
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880000);
                        bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                        bVar2.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                        bVar2.a((Throwable) e);
                        b.this.e.a(b.this.f, bVar2);
                        b.this.g.a(this.unitId);
                    }
                }

                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(int i, String str3) {
                    ad.c(b.f3047a, "requestCampaign--> Fail errorCode:" + i + " msg:" + str3);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                    bVar2.a(i + "#" + str3);
                    bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                    b.this.e.a(b.this.f, bVar2);
                    b.this.g.a(this.unitId);
                }
            };
            aVar.setUnitId(str2);
            aVar.setPlacementId(str);
            aVar.setAdType(296);
            com.mbridge.msdk.mbbanner.common.e.a aVar2 = new com.mbridge.msdk.mbbanner.common.e.a(this.b);
            this.c = b(str2);
            e eVarA = com.mbridge.msdk.mbbanner.common.a.d.a(false, this.b, str2, this.d.a(), this.c, bVar);
            String strD = ai.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strC = bVar.c();
            if (TextUtils.isEmpty(strC)) {
                z = false;
            } else {
                aVar.a(strC);
                z = true;
            }
            this.e.a(z);
            aVar2.choiceV3OrV5BySetting(1, eVarA, aVar, strC);
        } catch (Exception e) {
            ad.b(f3047a, e.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
            bVar2.a(new MBridgeIds(str, str2));
            this.e.a(this.f, bVar2);
            this.g.a(str2);
        }
    }

    private List<CampaignEx> a(final String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    ad.c(f3047a, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    for (int i = 0; i < ads.size(); i++) {
                        final CampaignEx campaignEx = ads.get(i);
                        if (campaignEx != null && campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getBannerUrl()) || !TextUtils.isEmpty(campaignEx.getBannerHtml()) || !TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            if (ai.c(campaignEx)) {
                                campaignEx.setRtinsType(ai.c(this.b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(this.b, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                ai.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                                this.n = "APP ALREADY INSTALLED";
                            }
                            final Context context = this.b;
                            final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                            try {
                                com.mbridge.msdk.foundation.same.c.a(campaignEx, context, null, new c.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.3
                                    @Override // com.mbridge.msdk.foundation.same.c.a
                                    public final void a(String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                        if (TextUtils.isEmpty(str2)) {
                                            return;
                                        }
                                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                        dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                                        bVar.a(str2, dVar);
                                        try {
                                            com.mbridge.msdk.foundation.same.report.d.c.a().a(str2, bVar, campaignEx, context, aVar);
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
                    ad.c(f3047a, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.j.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.c.b.a(this.b).a(campaignEx.getImageUrl(), new a(this, str, campaignEx));
            }
        }
    }

    /* compiled from: BannerLoader.java */
    private static class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private b f3052a;
        private String b;
        private CampaignEx c;

        public a(b bVar, String str, CampaignEx campaignEx) {
            this.f3052a = bVar;
            this.b = str;
            this.c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f3047a, "DownloadImageListener campaign image success");
            }
            b bVar = this.f3052a;
            if (bVar != null) {
                bVar.a(this.b, 1, str, true, this.c);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f3047a, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f3052a;
            if (bVar != null) {
                bVar.a(this.b, 1, str2, false, this.c);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.entity.CampaignEx r16) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r1 = ""
            if (r0 != 0) goto La1
            r2 = 0
            com.mbridge.msdk.foundation.same.b.c r0 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r0 = com.mbridge.msdk.foundation.same.b.e.a(r0)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.ao.b(r15)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            if (r4 == 0) goto L25
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
        L25:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            android.net.Uri r0 = android.net.Uri.parse(r15)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r0.getPath()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r3.write(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r3.flush()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r3.close()     // Catch: java.lang.Exception -> L4e
            goto L67
        L4e:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L67
        L54:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L95
        L58:
            r0 = move-exception
            r2 = r3
            goto L5f
        L5b:
            r0 = move-exception
            r1 = r0
            goto L95
        L5e:
            r0 = move-exception
        L5f:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.lang.Exception -> L4e
        L67:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L8a
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L8a
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L7f
            goto L8a
        L7f:
            r4 = 2
            r6 = 1
            r2 = r13
            r3 = r14
            r5 = r15
            r7 = r16
            r2.a(r3, r4, r5, r6, r7)
            goto La1
        L8a:
            r9 = 2
            r11 = 0
            r7 = r13
            r8 = r14
            r10 = r15
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
            goto La1
        L95:
            if (r2 == 0) goto La0
            r2.close()     // Catch: java.lang.Exception -> L9b
            goto La0
        L9b:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        La0:
            throw r1
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.b.a(java.lang.String, java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):java.lang.String");
    }

    private int b(String str) {
        try {
            int iB = this.d.b();
            if (iB > this.d.c()) {
                return 0;
            }
            return iB;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    static /* synthetic */ void a(b bVar, final String str, final CampaignUnit campaignUnit) throws Throwable {
        com.mbridge.msdk.foundation.c.b bVar2;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar3.a(mBridgeIds);
            bVar.e.a(bVar.f, bVar3);
            bVar.g.a(str);
            return;
        }
        List<CampaignEx> listA = bVar.a(str, campaignUnit);
        new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ad.c(b.f3047a, "在单独子线程保存数据库 开始");
                k.a(h.a(b.this.b)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(b.this.b, campaignUnit.getAds());
                }
                ad.c(b.f3047a, "在单独子线程保存数据库 完成");
            }
        }).start();
        int i = 0;
        if (listA == null || listA.size() == 0) {
            ad.c(f3047a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
            if (bVar.n.contains("INSTALLED")) {
                bVar2 = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
            } else {
                bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
            }
            MBridgeIds mBridgeIds2 = new MBridgeIds();
            mBridgeIds2.setUnitId(str);
            bVar2.a(mBridgeIds2);
            if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
                bVar2.a(campaignEx);
            }
            bVar.e.a(bVar.f, bVar2);
            bVar.g.a(str);
            return;
        }
        String str2 = f3047a;
        ad.c(str2, "在子线程处理业务逻辑 开始");
        final CampaignEx campaignEx2 = listA.get(0);
        bVar.i.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbbanner.common.c.b.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                if (b.this.h) {
                    return;
                }
                b.this.h = true;
                b.this.a(str, -1, "", false, campaignEx2);
            }
        }, MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        bVar.d.a(campaignUnit.getSessionId());
        int size = bVar.c;
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    size += listA.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (size > bVar.d.c()) {
            ad.c(str2, "saveNextOffset 重置offset为0");
            size = 0;
        }
        ad.c(str2, "saveNextOffset 算出 下次的offset是:" + size);
        if (an.b(str)) {
            bVar.d.a(size);
        }
        String strTrim = campaignEx2.getBannerUrl().trim();
        if (TextUtils.isEmpty(strTrim)) {
            String strTrim2 = campaignEx2.getBannerHtml().trim();
            if (!TextUtils.isEmpty(strTrim2)) {
                String strA = bVar.a(str, strTrim2, campaignEx2);
                if (listA != null && listA.size() > 0) {
                    while (i < listA.size()) {
                        listA.get(i).setBannerHtml(strA);
                        listA.get(i).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                        i++;
                    }
                }
            } else {
                bVar.l = true;
                bVar.k = true;
            }
        } else {
            if (!TextUtils.isEmpty(strTrim)) {
                com.mbridge.msdk.mbbanner.common.b.e eVar = new com.mbridge.msdk.mbbanner.common.b.e(bVar, str, campaignEx2);
                com.mbridge.msdk.foundation.same.report.d.b bVar4 = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar4.a(campaignEx2);
                H5DownLoadManager.getInstance().download(bVar4, strTrim, eVar);
            }
            if (listA != null && listA.size() > 0) {
                while (i < listA.size()) {
                    listA.get(i).setBannerUrl(campaignEx2.getBannerUrl());
                    listA.get(i).setHasMBTplMark(true);
                    i++;
                }
            }
        }
        bVar.a(str, listA);
    }
}
