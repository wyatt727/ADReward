package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.json.u2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardCampaignsResourceManager.java */
/* loaded from: classes4.dex */
public final class b {
    private static ConcurrentHashMap<String, a> b;

    /* renamed from: a, reason: collision with root package name */
    private final h f3389a;
    private boolean c;
    private final String d;
    private final String e;
    private final String f;
    private volatile List<WindVaneWebView> g;

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface i {
        void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface j {
        void a(String str, String str2, String str3, a.C0310a c0310a, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0310a c0310a);
    }

    private b() {
        this.d = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.e = "down_type";
        this.f = "h3c";
        this.g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        b = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f3389a = new h(handlerThread.getLooper());
    }

    public static b a() {
        return m.f3410a;
    }

    public final synchronized void a(final Context context, boolean z, int i2, boolean z2, final int i3, final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, c cVar, final i iVar) {
        String str4 = str2 + "_" + str3;
        b.put(str4, new a(z, z2, i2, copyOnWriteArrayList.size(), str2, str3, i3, copyOnWriteArrayList));
        this.f3389a.a(str, str2, str3, cVar);
        this.f3389a.a(context);
        this.f3389a.a(str4, copyOnWriteArrayList);
        this.f3389a.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.1
            /* JADX WARN: Removed duplicated region for block: B:108:0x02bd  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0374  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 980
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2, final CampaignEx campaignEx, String str, String str2) {
        n.a(i2, str, str2, new n.a() { // from class: com.mbridge.msdk.reward.adapter.b.2
            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, String str4, String str5, String str6, boolean z) {
                if (z) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    int i3 = i2;
                    if (i3 == 0) {
                        nVar.e(1);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i3 == 1) {
                        nVar.e(2);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i3 == 2) {
                        nVar.e(3);
                        nVar.b(1);
                        nVar.a("m_download_end");
                        nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f2819a : com.mbridge.msdk.foundation.entity.n.b);
                        nVar.o("1");
                    }
                    nVar.g(campaignEx.getRequestIdNotice());
                    nVar.a("url", str3);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, DownloadError downloadError) {
                String message = "";
                if (downloadError != null) {
                    try {
                        if (downloadError.getException() != null) {
                            message = downloadError.getException().getMessage();
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i3 = i2;
                if (i3 == 0) {
                    nVar.e(1);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i3 == 1) {
                    nVar.e(2);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i3 == 2) {
                    nVar.e(3);
                    nVar.b(3);
                    nVar.a("m_download_end");
                    nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f2819a : com.mbridge.msdk.foundation.entity.n.b);
                    nVar.o("1");
                }
                b.a(nVar, campaignEx);
                nVar.g(campaignEx.getRequestIdNotice());
                nVar.h(message);
                nVar.a("scenes", "1");
                nVar.a("url", str3);
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
            }
        }, campaignEx);
    }

    public final synchronized void a(final Context context, final CampaignEx campaignEx, final String str, final String str2, final String str3, final i iVar) {
        this.f3389a.a(context);
        if (campaignEx != null) {
            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
            if (campaignEx.isDynamicView()) {
                if (ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                    a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                }
                ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString("request_id", str3);
                bundle.putString("url", cMPTEntryUrl);
                messageObtain.setData(bundle);
                this.f3389a.sendMessage(messageObtain);
                if (iVar != null) {
                    iVar.a(str, str2, str3, cMPTEntryUrl);
                }
                return;
            }
        }
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
            try {
                com.mbridge.msdk.foundation.same.report.d.b bVarB = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
                if (bVarB == null) {
                    bVarB = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                com.mbridge.msdk.foundation.same.report.d.b bVar = bVarB;
                bVar.a(campaignEx);
                bVar.a(1);
                bVar.c(a(campaignEx));
                H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getCMPTEntryUrl(), new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.reward.adapter.b.3
                    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                    public final void onSuccess(String str4, String str5, boolean z) {
                        try {
                            ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, true);
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                            bundle2.putString(MBridgeConstans.PLACEMENT_ID, str);
                            bundle2.putString("request_id", str3);
                            bundle2.putString("url", str4);
                            messageObtain2.setData(bundle2);
                            b.this.f3389a.sendMessage(messageObtain2);
                            i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.a(str, str2, str3, str4);
                            }
                            if (z) {
                                return;
                            }
                            b.a(b.this, context, 1, campaignEx, str4, "", str2, str5);
                        } catch (Exception e2) {
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, false);
                            Message messageObtain3 = Message.obtain();
                            messageObtain3.what = 205;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                            bundle3.putString(MBridgeConstans.PLACEMENT_ID, str);
                            bundle3.putString("request_id", str3);
                            bundle3.putString("url", str4);
                            messageObtain3.setData(bundle3);
                            b.this.f3389a.sendMessage(messageObtain3);
                            if (iVar != null) {
                                try {
                                    iVar.a(str4, str3, b.b(880005, new MBridgeIds(str, str2, str3), "", e2, null));
                                } catch (Exception e3) {
                                    ad.b("RewardCampaignsResourceManager", e3.getMessage());
                                }
                            }
                            b.a(b.this, context, 3, campaignEx, str4, e2.getLocalizedMessage(), str2, str5);
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onFailed(java.lang.String r19, java.lang.String r20) {
                        /*
                            Method dump skipped, instructions count: 262
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
                    }
                });
            } catch (Exception e2) {
                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class e implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private Handler f3399a;
        private int b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;

        public e(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f3399a = handler;
            this.b = i;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            messageObtain.setData(bundle);
            this.f3399a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(final String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            messageObtain.setData(bundle);
            this.f3399a.sendMessage(messageObtain);
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f != null) {
                        try {
                            q qVarA = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            ad.a("RewardCampaignsResourceManager", "campaign is null");
                            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                            nVar.a("2000044");
                            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                            nVar.e(e.this.f.getId());
                            nVar.p(e.this.f.getImageUrl());
                            nVar.f(e.this.f.getRequestId());
                            nVar.s(e.this.f.getCurrentLocalRid());
                            nVar.g(e.this.f.getRequestIdNotice());
                            nVar.c(e.this.c);
                            nVar.h(str);
                            nVar.a("scenes", "1");
                            qVarA.a(nVar);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f3401a;
        private final String b;
        private final String c;
        private final String d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f3401a = handler;
            this.c = str;
            this.b = str2;
            this.d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f3401a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f3401a.sendMessage(messageObtain);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class g implements H5DownLoadManager.ZipDownloadListener {
        private Context b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;
        private int g;
        private Handler h;
        private i i;
        private CopyOnWriteArrayList<CampaignEx> j;

        /* renamed from: a, reason: collision with root package name */
        private boolean f3402a = false;
        private long k = System.currentTimeMillis();

        public g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = context;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = i;
            this.h = handler;
            this.i = iVar;
            this.j = copyOnWriteArrayList;
        }

        public final void a(boolean z) {
            this.f3402a = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f3402a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            i iVar = this.i;
            if (iVar != null) {
                iVar.a(this.d, this.c, this.e, str);
            }
            if (z) {
                return;
            }
            a(1, str, "", str2);
        }

        private void a(final int i, final String str, final String str2, final String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f == null || g.this.b == null) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.a("m_download_end");
                        if (g.this.b != null) {
                            nVar.a(z.l(g.this.b.getApplicationContext()));
                        }
                        nVar.b(i);
                        if (g.this.f != null) {
                            nVar.e(g.this.f.getId());
                            nVar.f(g.this.f.getRequestId());
                            nVar.s(g.this.f.getCurrentLocalRid());
                            nVar.g(g.this.f.getRequestIdNotice());
                        }
                        nVar.q(str);
                        nVar.h(str2);
                        nVar.c(g.this.c);
                        if (!TextUtils.isEmpty(str3)) {
                            nVar.t(str3);
                        }
                        nVar.e(2);
                        nVar.a("scenes", "1");
                        nVar.a("url", str);
                        b.a(nVar, g.this.f);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            });
        }

        private void a(final int i, final long j, final String str, final String str2, final String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f == null) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", i, j + "", str, g.this.f.getId(), g.this.c, str2, "1");
                        nVar.f(g.this.f.getRequestId());
                        nVar.s(g.this.f.getCurrentLocalRid());
                        nVar.g(g.this.f.getRequestIdNotice());
                        nVar.e(g.this.f.getId());
                        nVar.c(g.this.f.getAdSpaceT());
                        nVar.t(str3);
                        nVar.a("scenes", "1");
                        if (g.this.f.getAdType() != 287) {
                            if (g.this.f.getAdType() == 94) {
                                nVar.d("1");
                            }
                        } else {
                            nVar.d("3");
                        }
                        nVar.a("url", str);
                        nVar.e(3);
                        b.a(nVar, g.this.f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, g.this.c, g.this.f);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str2);
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f3402a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            if (this.i != null) {
                try {
                    this.i.a(str2, this.e, b.b(880006, new MBridgeIds(this.d, this.c, this.e), "", null, null));
                } catch (Exception e) {
                    ad.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
            a(3, str2, str, "");
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class d implements H5DownLoadManager.IH5SourceDownloadListener {
        private int b;
        private final String c;
        private final String d;
        private final String e;
        private CampaignEx f;
        private i g;
        private Handler h;
        private CopyOnWriteArrayList<CampaignEx> i;

        /* renamed from: a, reason: collision with root package name */
        private boolean f3397a = false;
        private final long j = System.currentTimeMillis();

        public d(int i, String str, String str2, String str3, CampaignEx campaignEx, i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = iVar;
            this.h = handler;
            this.i = copyOnWriteArrayList;
        }

        public final void a(boolean z) {
            this.f3397a = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i = this.b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f3397a) {
                    a(1, System.currentTimeMillis() - this.j, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            i iVar = this.g;
            if (iVar != null) {
                iVar.a(this.c, this.d, this.e, str);
            }
        }

        private void a(final int i, final long j, final String str, final String str2, final String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f == null) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", i, j + "", str, d.this.f.getId(), d.this.d, str2, "2");
                        nVar.f(d.this.f.getRequestId());
                        nVar.s(d.this.f.getCurrentLocalRid());
                        nVar.g(d.this.f.getRequestIdNotice());
                        nVar.e(d.this.f.getId());
                        nVar.c(d.this.f.getAdSpaceT());
                        nVar.a("scenes", "1");
                        nVar.a("url", str);
                        if (d.this.f.getAdType() != 287) {
                            if (d.this.f.getAdType() == 94) {
                                nVar.d("1");
                            }
                        } else {
                            nVar.d("3");
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            nVar.t(str3);
                        }
                        b.a(nVar, d.this.f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, d.this.d, d.this.f);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i = this.b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                bundle.putString("message", str2);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f3397a) {
                    a(3, System.currentTimeMillis() - this.j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            bundle3.putString("message", str2);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            if (this.g != null) {
                try {
                    this.g.a(str, this.e, b.b(880006, new MBridgeIds(this.c, this.d, this.e), str2, null, null));
                } catch (Exception e) {
                    ad.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class h extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f3405a;
        private ConcurrentHashMap<String, c> b;
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> c;

        public h(Looper looper) {
            super(looper);
            this.b = new ConcurrentHashMap<>();
            this.c = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, String str3, c cVar) {
            this.b.put(str2 + "_" + str3, cVar);
        }

        public final void a(Context context) {
            this.f3405a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.c.put(str, copyOnWriteArrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0381 A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #0 {Exception -> 0x044f, blocks: (B:159:0x035d, B:164:0x0381), top: B:226:0x00ce }] */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:258:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v9, types: [boolean] */
        /* JADX WARN: Type inference failed for: r18v4, types: [com.mbridge.msdk.videocommon.download.b] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [int] */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19, types: [int] */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r29) {
            /*
                Method dump skipped, instructions count: 1230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.h.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa A[Catch: all -> 0x01d9, TryCatch #7 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x008b, B:28:0x00c4, B:30:0x00da, B:61:0x01a6, B:63:0x01aa, B:65:0x01b5, B:25:0x0086, B:53:0x0155, B:39:0x00f8, B:41:0x0108, B:43:0x011a), top: B:80:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5 A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x008b, B:28:0x00c4, B:30:0x00da, B:61:0x01a6, B:63:0x01aa, B:65:0x01b5, B:25:0x0086, B:53:0x0155, B:39:0x00f8, B:41:0x0108, B:43:0x011a), top: B:80:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.d.c r38, com.mbridge.msdk.reward.adapter.b.j r39) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String b(int i2) {
        return i2 != 200 ? i2 != 201 ? i2 != 203 ? i2 != 205 ? "unknown" : "tpl" : u2.D : "zip/html" : "video";
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class k extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f3406a;
        private Runnable b;
        private final boolean c;
        private final boolean d;
        private String e;
        private final j f;
        private final WindVaneWebView g;
        private final String h;
        private final String i;
        private final String j;
        private final a.C0310a k;
        private final CampaignEx l;
        private CopyOnWriteArrayList<CampaignEx> m;
        private long n;
        private boolean o;
        private boolean p;
        private final Runnable q;
        private final Runnable r;

        public k(Handler handler, Runnable runnable, boolean z, boolean z2, final String str, final j jVar, WindVaneWebView windVaneWebView, final String str2, final String str3, final String str4, final a.C0310a c0310a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            this.f3406a = handler;
            this.b = runnable;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = jVar;
            this.g = windVaneWebView;
            this.h = str2;
            this.i = str4;
            this.j = str3;
            this.k = c0310a;
            this.l = campaignEx;
            this.m = copyOnWriteArrayList;
            this.n = j;
            Runnable runnable2 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView windVaneWebViewA;
                    a.C0310a c0310a2;
                    if (jVar != null && (c0310a2 = c0310a) != null) {
                        c0310a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str4 + "_" + str + "_" + str2, true);
                        j jVar2 = jVar;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str2);
                        jVar2.a(sb.toString(), str3, str4, str, str2, c0310a);
                    }
                    a.C0310a c0310a3 = c0310a;
                    if (c0310a3 == null || (windVaneWebViewA = c0310a3.a()) == null) {
                        return;
                    }
                    try {
                        windVaneWebViewA.release();
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e.getMessage());
                        }
                    }
                }
            };
            this.r = runnable2;
            this.q = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView windVaneWebViewA;
                    a.C0310a c0310a2;
                    if (jVar != null && (c0310a2 = c0310a) != null) {
                        c0310a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str4 + "_" + str + "_" + str2, true);
                        j jVar2 = jVar;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str2);
                        jVar2.a(sb.toString(), str3, str4, str, str2, c0310a);
                    }
                    a.C0310a c0310a3 = c0310a;
                    if (c0310a3 == null || (windVaneWebViewA = c0310a3.a()) == null) {
                        return;
                    }
                    try {
                        windVaneWebViewA.release();
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e.getMessage());
                        }
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(runnable2, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i);
            Handler handler2 = this.f3406a;
            if (handler2 != null && (runnable2 = this.q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f3406a;
            if (handler3 != null && (runnable = this.r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.l, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.p) {
                return;
            }
            String str = this.i + "_" + this.h;
            if (i == 1) {
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f3406a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                a.C0310a c0310a = this.k;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                if (this.c) {
                    if (this.d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                j jVar = this.f;
                if (jVar != null) {
                    jVar.a(str, this.j, this.i, this.e, this.h, this.k);
                }
            } else if (this.f != null) {
                this.f.a(str, this.e, this.h, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), "readyState:" + i, null, this.l));
            }
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i, String str, String str2) {
            super.a(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f3406a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f3406a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.i + "_" + this.h;
                a.C0310a c0310a = this.k;
                if (c0310a != null) {
                    c0310a.a(false);
                }
                if (this.f != null) {
                    this.f.a(str3, this.e, str2, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), i + "#" + str, null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f3406a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f3406a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.i + "_" + this.h;
                a.C0310a c0310a = this.k;
                if (c0310a != null) {
                    c0310a.a(false);
                }
                if (this.f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.j, this.i, this.e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f.a(str, this.e, this.h, this.k, b.b(880009, mBridgeIds, sb.toString(), null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.f3406a;
            if (handler2 != null && (runnable2 = this.r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.i + "_" + this.h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f3406a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0310a c0310a = this.k;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                if (this.c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                j jVar = this.f;
                if (jVar != null) {
                    jVar.a(str2, this.j, this.i, this.e, this.h, this.k);
                }
            } else {
                Handler handler3 = this.f3406a;
                if (handler3 != null && (runnable = this.q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3 A[Catch: all -> 0x0204, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007a, B:13:0x0081, B:15:0x009c, B:17:0x00a2, B:19:0x00ac, B:22:0x00b3, B:24:0x00b9, B:25:0x00c3, B:27:0x00c9, B:29:0x00dd, B:31:0x00eb, B:33:0x00f4, B:34:0x00f8, B:36:0x0105, B:38:0x0156, B:40:0x016a, B:42:0x018a, B:54:0x01d3, B:55:0x01f5, B:57:0x01f9, B:35:0x00ff), top: B:65:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f9 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007a, B:13:0x0081, B:15:0x009c, B:17:0x00a2, B:19:0x00ac, B:22:0x00b3, B:24:0x00b9, B:25:0x00c3, B:27:0x00c9, B:29:0x00dd, B:31:0x00eb, B:33:0x00f4, B:34:0x00f8, B:36:0x0105, B:38:0x0156, B:40:0x016a, B:42:0x018a, B:54:0x01d3, B:55:0x01f5, B:57:0x01f9, B:35:0x00ff), top: B:65:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.d.c r41, com.mbridge.msdk.reward.adapter.b.j r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j, boolean):void");
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    private static class C0289b extends com.mbridge.msdk.mbsignalcommon.b.a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f3396a;
        private final Runnable b;
        private final boolean c;
        private final boolean d;
        private int e;
        private String f;
        private String g;
        private String h;
        private String i;
        private a.C0310a j;
        private CampaignEx k;
        private CopyOnWriteArrayList<CampaignEx> l;
        private com.mbridge.msdk.videocommon.d.c m;
        private final j n;
        private boolean o;
        private boolean p;
        private boolean q;
        private int r = 0;
        private boolean s;
        private long t;

        public C0289b(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, a.C0310a c0310a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.d.c cVar, j jVar, boolean z4, long j) {
            this.f3396a = handler;
            this.b = runnable;
            this.c = z2;
            this.d = z3;
            this.e = i;
            this.f = str;
            this.h = str2;
            this.g = str3;
            this.i = str4;
            this.j = c0310a;
            this.k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.m = cVar;
            this.n = jVar;
            this.o = z4;
            this.s = z;
            this.t = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 1);
                dVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.k, dVar);
            } catch (Throwable th) {
                ad.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.q) {
                return;
            }
            String str = this.g + "_" + this.f;
            if (i == 1) {
                if (this.o) {
                    com.mbridge.msdk.videocommon.a.e(this.g + "_" + this.i);
                } else {
                    com.mbridge.msdk.videocommon.a.d(this.g + "_" + this.i);
                }
                com.mbridge.msdk.videocommon.a.a(this.g + "_" + this.i + "_" + this.f, this.j, true, this.o);
                Handler handler = this.f3396a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                a.C0310a c0310a = this.j;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                j jVar = this.n;
                if (jVar != null) {
                    jVar.a(str, this.h, this.g, this.i, this.f, this.j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
                a.C0310a c0310a2 = this.j;
                if (c0310a2 != null) {
                    c0310a2.a(false);
                }
                if (this.n != null) {
                    this.n.a(str, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "readyState:" + i, null, this.k));
                }
            }
            this.q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        public final void a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    com.mbridge.msdk.reward.b.a aVar = new com.mbridge.msdk.reward.b.a();
                    aVar.b(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.a(z);
                    aVar.b(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.b.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, i2, str2, true, 1));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RVWindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00fa A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:18:0x0069, B:20:0x006f, B:23:0x0077, B:25:0x0085, B:26:0x008a, B:29:0x00b3, B:31:0x00b7, B:32:0x00c0, B:34:0x00ce, B:36:0x00de, B:37:0x00e4, B:38:0x00fa, B:39:0x00ff, B:42:0x0127, B:44:0x012b), top: B:57:0x0069, inners: #2, #3 }] */
        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.C0289b.a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.p) {
                return;
            }
            String str2 = this.g + "_" + this.f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                Handler handler = this.f3396a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0310a c0310a = this.j;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                j jVar = this.n;
                if (jVar != null) {
                    jVar.a(str2, this.h, this.g, this.i, this.f, this.j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i, String str, String str2) {
            super.a(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
            if (this.n != null) {
                String str3 = this.g + "_" + this.f;
                a.C0310a c0310a = this.j;
                if (c0310a != null) {
                    c0310a.a(false);
                }
                this.n.a(str3, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "onReceivedError： " + i + "  " + str, null, this.k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.a.d.c().b(this.g, this.i);
                        if (linkedHashMapB != null && !linkedHashMapB.isEmpty()) {
                            for (View view : linkedHashMapB.values()) {
                                if (view instanceof MBridgeBTContainer) {
                                    ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b("OperateViews", th.getMessage());
                    }
                } catch (Throwable th2) {
                    ad.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RewardCampaignsResourceManager.java */
    static final class m {

        /* renamed from: a, reason: collision with root package name */
        private static final b f3410a = new b();
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class l extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a, reason: collision with root package name */
        private String f3409a;
        private final boolean b;
        private final WindVaneWebView c;
        private final String d;
        private final String e;
        private final a.C0310a f;
        private final CampaignEx g;
        private boolean h;
        private String i;
        private boolean j;
        private boolean k;

        public l(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, a.C0310a c0310a, CampaignEx campaignEx, boolean z2, String str4) {
            this.b = z;
            this.c = windVaneWebView;
            this.d = str2;
            this.e = str3;
            this.f = c0310a;
            this.g = campaignEx;
            this.f3409a = str;
            this.h = z2;
            this.i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i) throws JSONException {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.g, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.k) {
                return;
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f3409a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
            String str = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
            if (i == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C0310a c0310a = this.f;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
                a.C0310a c0310a2 = this.f;
                if (c0310a2 != null) {
                    c0310a2.a(false);
                }
            }
            this.k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i, String str, String str2) throws JSONException {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
            a.C0310a c0310a = this.f;
            if (c0310a != null) {
                c0310a.a(false);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f3409a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) throws JSONException {
            if (this.j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f3409a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C0310a c0310a = this.f;
                if (c0310a != null) {
                    c0310a.a(true);
                }
                String str2 = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.g.getRequestIdNotice(), this.f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.g.getRequestIdNotice(), this.f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.j = true;
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f3395a;
        boolean b;
        int c;
        int d;
        String e;
        String f;
        int g;
        CopyOnWriteArrayList<CampaignEx> h;
        CopyOnWriteArrayList<CampaignEx> i;

        public a(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f3395a = z;
            this.b = z2;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = str2;
            this.g = i3;
            this.h = copyOnWriteArrayList;
            this.i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.c.b b(int i2, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i2);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.a(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.d.b a(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.report.d.b bVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid()) : null;
        if (bVarB == null) {
            bVarB = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        bVarB.a(campaignEx);
        bVarB.c(a(campaignEx));
        bVarB.a(i2);
        return bVarB;
    }

    static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.b bVarA = bVar.a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                g gVar = new g(context, str, str2, str3, campaignEx, 497, bVar.f3389a, iVar, copyOnWriteArrayList);
                gVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(bVarA, str4, gVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            d dVar = new d(497, str, str2, str3, campaignEx, iVar, bVar.f3389a, copyOnWriteArrayList);
            dVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(bVarA, str4, dVar);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
            }
        }
    }

    static /* synthetic */ void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId());
            if (cVarA != null) {
                nVar.v(cVarA.l());
            }
            com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
            if (aVarB != null) {
                nVar.u(aVarB.c());
            }
        } catch (Exception e2) {
            ad.b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, final Context context, final int i2, final CampaignEx campaignEx, final String str, final String str2, final String str3, final String str4) {
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.4
            @Override // java.lang.Runnable
            public final void run() {
                if (campaignEx == null || context == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("m_download_end");
                    Context context2 = context;
                    if (context2 != null) {
                        nVar.a(z.l(context2.getApplicationContext()));
                    }
                    nVar.b(i2);
                    CampaignEx campaignEx2 = campaignEx;
                    if (campaignEx2 != null) {
                        nVar.e(campaignEx2.getId());
                        nVar.f(campaignEx.getRequestId());
                        nVar.s(campaignEx.getCurrentLocalRid());
                        nVar.g(campaignEx.getRequestIdNotice());
                    }
                    nVar.a("url", str);
                    nVar.q(str);
                    nVar.h(str2);
                    nVar.c(str3);
                    if (!TextUtils.isEmpty(str4)) {
                        nVar.t(str4);
                    }
                    nVar.e(1);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        });
    }
}
