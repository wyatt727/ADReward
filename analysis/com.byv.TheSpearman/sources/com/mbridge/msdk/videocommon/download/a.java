package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CampaignDownLoadTask.java */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private k H;
    private com.mbridge.msdk.videocommon.d.c I;
    private k J;
    private int b;
    private int c;
    private volatile int e;
    private com.mbridge.msdk.videocommon.listener.a g;
    private com.mbridge.msdk.videocommon.listener.a h;
    private CampaignEx i;
    private String j;
    private Context k;
    private long l;
    private String m;
    private String n;
    private long o;
    private String p;
    private long r;
    private p u;
    private String w;
    private DownloadRequest x;
    private int y;
    private boolean z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3884a = false;
    private boolean d = false;
    private CopyOnWriteArrayList<c> f = new CopyOnWriteArrayList<>();
    private boolean q = false;
    private int s = 100;
    private boolean t = false;
    private boolean v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.e = 1;
            if (a.this.u == null) {
                a.this.u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.u.a(a.this.i, a.this.l, a.this.p, a.this.e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.o + "    " + a.this.l);
                if (a.this.u == null) {
                    a.this.u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.u.a(a.this.m, a.this.o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        ad.b("CampaignDownLoadTask", th.getMessage());
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.o, true, str);
                a.this.u.a(a.this.m, a.this.o, 5);
                a aVar2 = a.this;
                aVar2.a(aVar2.o, true, "");
                a.a(a.this, 1, true, "");
            } catch (Exception e) {
                ad.b("CampaignDownLoadTask", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (a.this.x == null || a.this.x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("cache", a.this.x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.i, dVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.v();
            a.this.a(3, message, "");
            a.this.a(message);
            a aVar2 = a.this;
            a.a(aVar2, 3, aVar2.z, message);
        }
    };
    private OnProgressStateListener S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.i, dVar);
                a.this.o = downloadProgress.getCurrent();
                a.this.l = downloadProgress.getTotal();
                a.this.y = downloadProgress.getCurrentDownloadRate();
                if (a.this.s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.s + " " + a.this.c);
                    if (a.this.d) {
                        return;
                    }
                    a.this.d = true;
                    if (!a.this.z) {
                        a.a(a.this, 1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.x == null || a.this.C != 2 || a.this.z) {
                        return;
                    }
                    a.this.x.cancel(downloadMessage);
                }
            } catch (Exception e) {
                ad.b("CampaignDownLoadTask", e.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i) throws IOException {
        File file;
        this.b = 1;
        this.e = 0;
        this.o = 0L;
        int iB = 100;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarA != null) {
            this.G = gVarA.aF();
        }
        this.D = com.mbridge.msdk.foundation.same.a.u;
        this.E = com.mbridge.msdk.foundation.same.a.v;
        this.F = com.mbridge.msdk.foundation.same.a.t;
        this.r = System.currentTimeMillis();
        this.k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.i = campaignEx;
        this.j = str;
        this.b = i;
        if (campaignEx != null) {
            this.m = campaignEx.getVideoUrlEncode();
        }
        this.w = ab.c(this.m);
        this.n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.p = this.n + this.w;
        ad.c("CampaignDownLoadTask", this.i.getAppName() + " videoLocalPath:" + this.p + " videoUrl: " + this.i.getVideoUrlEncode() + " " + this.s);
        try {
            if (TextUtils.isEmpty(this.m)) {
                return;
            }
            File file2 = null;
            if (!TextUtils.isEmpty(this.n)) {
                file2 = new File(this.n);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            if (file2 != null && file2.exists() && ((file = this.B) == null || !file.exists())) {
                File file3 = new File(file2 + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            p pVarA = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            m mVarA = pVarA.a(this.m, "");
            if (mVarA != null) {
                this.o = mVarA.c();
                if (this.e != 2) {
                    this.e = mVarA.b();
                }
                if (this.e == 1) {
                    this.e = 2;
                }
                this.l = mVarA.d();
                if (mVarA.a() > 0) {
                    this.r = mVarA.a();
                }
                if (this.e == 5) {
                    if (Objects.exists(new File(this.n + this.w), this.n, this.w)) {
                        this.p = this.n + this.w;
                    } else {
                        u();
                    }
                } else if (this.e != 0) {
                    this.p = this.n + this.w;
                }
            } else {
                pVarA.a(this.m, this.r);
            }
            try {
                long j = this.l;
                if (j > 0 && this.o * 100 >= j * b(this.i) && (b(this.i) == 100 || this.e == 5)) {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("cache", 1);
                    a(this.i, dVar);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
            String str2 = this.m;
            if (TextUtils.isEmpty(str2)) {
                this.h.a("VideoUrl is NULL, Please check it.", "");
                return;
            }
            if (this.e == 1) {
                ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                return;
            }
            if (this.e == 5 && Utils.getDownloadRate(this.l, this.o) >= this.s) {
                ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar = this.g;
                if (aVar != null) {
                    aVar.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                }
                try {
                    File file4 = new File(this.p);
                    if (Objects.exists(file4, this.n, this.w) && file4.isFile()) {
                        file4.setLastModified(System.currentTimeMillis());
                    }
                } catch (Exception e2) {
                    ad.b("CampaignDownLoadTask", e2.getMessage());
                }
                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar2.a("cache", 1);
                a(this.i, dVar2);
                return;
            }
            if (this.b == 3) {
                ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                a(0L, false, "");
                com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar3.a("cache", 1);
                a(this.i, dVar3);
                return;
            }
            try {
                iB = b(this.i);
            } catch (Exception unused) {
            }
            c(iB);
            if (iB == 0) {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.g;
                if (aVar3 != null) {
                    aVar3.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.h;
                if (aVar4 != null) {
                    aVar4.a(this.m);
                }
            }
            DownloadMessage downloadMessage = new DownloadMessage(this.i, str2, this.w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.i));
            downloadMessage.addExtra("resource_type", 4);
            this.x = a(downloadMessage, this.R, this.S, "1");
        } catch (Exception e3) {
            ad.c("CampaignDownLoadTask", e3.getMessage());
        }
    }

    public final void a(boolean z) {
        this.K = z;
    }

    public final boolean a() {
        return this.K;
    }

    public final void b(boolean z) {
        this.L = z;
    }

    public final boolean b() {
        return this.L;
    }

    public final void c(boolean z) {
        this.M = z;
    }

    public final boolean c() {
        return this.M;
    }

    public final void d(boolean z) {
        this.N = z;
    }

    public final boolean d() {
        return this.N;
    }

    public final String e() {
        return this.m;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final boolean f() {
        return this.v;
    }

    public final void e(boolean z) {
        this.v = z;
    }

    public final long g() {
        return this.r;
    }

    public final void f(boolean z) {
        this.q = z;
    }

    public final String h() {
        return this.p;
    }

    public final boolean i() {
        return this.Q;
    }

    public final long j() {
        return this.l;
    }

    public final int k() {
        return this.e;
    }

    public final void a(int i, int i2) {
        this.e = i;
        if (this.u == null) {
            this.u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.u.a(this.m, i2, i);
    }

    public final CampaignEx l() {
        return this.i;
    }

    public final void a(CampaignEx campaignEx) {
        this.i = campaignEx;
    }

    public final void c(int i) {
        ad.a("CampaignDownLoadTask", "set ready rate: " + i);
        this.s = i;
    }

    public final long m() {
        return this.o;
    }

    public final void d(int i) {
        this.A = i;
    }

    public final void e(int i) {
        this.C = i;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).with("do_us_fi_re", Boolean.toString(this.G)).with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.s)).with("scenes", str).build();
    }

    public final void a(long j, boolean z, String str) {
        p pVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.o + "  progressSize " + j + "  " + this.y + "%   FileSize : " + this.l + "  " + this.i.getAppName());
        if (this.s == 100 && this.b != 3 && j != this.l && !z) {
            File file = new File(this.p);
            ad.b("CampaignDownLoadTask", "progressSize = " + j + " fileSize = " + this.l + " " + z + " absFileSize = " + (Objects.exists(file, this.n, this.w) ? file.length() : 0L));
            a("File size is not match witch download size.");
            return;
        }
        this.e = 5;
        if (j == this.l) {
            a(1, "", str);
        }
        long j2 = this.l;
        if (j2 != 0 && (pVar = this.u) != null) {
            pVar.b(this.m, j2);
        }
        this.f3884a = false;
        a(j, this.e);
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.g;
        if (aVar != null) {
            aVar.a(str, this.m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.a(str, this.m);
        }
        ad.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.e == 4 || this.e == 2 || this.e == 5) {
            return;
        }
        this.e = 4;
        CampaignEx campaignEx = this.i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.i.getRsIgnoreCheckRule().size() > 0 && this.i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.o, this.e);
        }
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.g;
                if (aVar != null) {
                    aVar.a(this.m);
                    return;
                }
                return;
            }
            if (this.m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.m).getPath());
            }
            if (this.b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.g;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                    return;
                }
                return;
            }
            if (this.s == 0 && this.C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.g;
                if (aVar3 != null) {
                    aVar3.a(this.m);
                    return;
                }
                return;
            }
            try {
                if (this.e == 5 && Utils.getDownloadRate(this.l, this.o) >= this.s) {
                    if (Objects.exists(new File(this.n + this.w), this.n, this.w)) {
                        this.p = this.n + this.w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.g;
                        if (aVar4 != null) {
                            aVar4.a(this.m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: " + e.getMessage());
            }
            DownloadRequest downloadRequest = this.x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.m)) {
                return;
            }
            if (this.m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.m).getPath());
            }
            if (this.s == 0 && this.C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    private int b(CampaignEx campaignEx) {
        int iC;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iC = campaignEx.getReady_rate();
            ad.a("CampaignDownLoadTask", "ready_rate(campaign): " + iC);
        } else {
            iC = c(campaignEx);
            ad.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iC);
        }
        try {
            return Math.max(iC, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.j);
                }
                return this.H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.j);
                }
                return d((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.j, false);
            }
            return this.I.r();
        } catch (Throwable th) {
            ad.a("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e.getMessage());
            return 100;
        }
    }

    public final void p() {
        if (this.Q) {
            return;
        }
        try {
            this.z = true;
            if (this.C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
                return;
            }
            if (this.b == 3) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.b);
                return;
            }
            ad.b("CampaignDownLoadTask", "resume()");
            this.O = false;
            this.P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.m, this.w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.i));
            DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
            this.x = downloadRequestA;
            downloadRequestA.start();
        } catch (Exception e) {
            ad.b("CampaignDownLoadTask", e.getMessage());
        }
    }

    public final void b(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        v();
        a(2, str, "");
        this.e = 4;
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final String q() {
        String message = "";
        if (this.b == 3) {
            return "";
        }
        String str = this.n + this.w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.n, this.w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            message = th.getMessage();
        }
        if (this.e == 5 && !TextUtils.isEmpty(message)) {
            u();
        }
        return message;
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.g = aVar;
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.h = aVar;
    }

    private void a(long j, int i) {
        this.o = j;
        int i2 = this.s;
        if (100 * j >= i2 * this.l && !this.t && i != 4) {
            if (i2 == 100 && i != 5) {
                this.e = 5;
                return;
            }
            this.t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i + " progress : " + j);
            String strQ = q();
            if (TextUtils.isEmpty(strQ)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.g;
                if (aVar != null) {
                    aVar.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + strQ, this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + strQ, this.m);
                }
            }
        }
        if (!this.f3884a && j > 0) {
            this.f3884a = true;
            if (this.u == null) {
                this.u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.u.a(this.m, j, this.e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j, i);
                }
            }
        }
    }

    public final void r() {
        if (this.f != null) {
            this.f = null;
        }
    }

    private void u() {
        if (this.u == null) {
            this.u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.u.b(this.m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } catch (Throwable unused) {
                ad.b("CampaignDownLoadTask", "del DB or file failed");
            }
        } finally {
            this.e = 0;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.a.a aVarA = com.mbridge.msdk.videocommon.a.a.a();
                if (aVarA != null) {
                    aVarA.a(this.i);
                }
            }
        } finally {
            this.e = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.reward.b.a");
            cls.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(cls.newInstance(), this.j, this.i);
            Class<?> cls2 = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            cls2.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(cls2.newInstance(), this.j, this.i);
        } catch (Exception e) {
            ad.b("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2) {
        n nVar = new n(this.k, this.i, i, Long.toString(this.r != 0 ? System.currentTimeMillis() - this.r : 0L), this.l, this.A);
        nVar.e(this.i.getId());
        nVar.m(this.i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.i.getRequestId());
        nVar.s(this.i.getCurrentLocalRid());
        nVar.g(this.i.getRequestIdNotice());
        nVar.c(this.j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.s));
        nVar.a("url", this.i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.x.get("resumed_breakpoint", ""));
        }
        int i2 = this.A;
        if (i2 == 94 || i2 == 287) {
            return;
        }
        q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    public final void c(String str) {
        this.p = str;
    }

    public final void d(String str) {
        this.m = str;
    }

    public final String t() {
        if (this.Q) {
            try {
                File file = new File(this.p);
                if (file.exists() && file.isFile()) {
                    return this.p;
                }
                return this.m;
            } catch (Exception e) {
                ad.b("CampaignDownLoadTask", e.getMessage());
                return this.m;
            }
        }
        try {
            File file2 = new File(this.p);
            if (Objects.exists(file2, this.n, this.w) && file2.isFile()) {
                return this.p;
            }
        } catch (Exception e2) {
            ad.b("CampaignDownLoadTask", e2.getMessage());
        }
        return this.m;
    }

    private int e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.O || campaignEx == null || dVar == null) {
            return;
        }
        this.O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.x.get("resumed_breakpoint", "2"));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e) {
            ad.b("CampaignDownLoadTask", e.getMessage());
        }
    }

    static /* synthetic */ void a(a aVar, int i, boolean z, String str) {
        if (aVar.P) {
            return;
        }
        try {
            aVar.P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.m);
                dVar.a("resumed_breakpoint", aVar.x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.s));
            dVar.a("result", Integer.valueOf(i));
            dVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.i, dVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
