package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;

/* compiled from: MBridgeVideoDownloader.java */
/* loaded from: classes4.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0282a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f3355a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;
    private final n c;
    private final String d;
    private final String e;
    private final String f;
    private DownloadMessage g;
    private int i;
    private DownloadRequest j;
    private String k;
    private x l;
    private String m;
    private boolean o;
    private boolean h = false;
    private volatile boolean n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i) {
        this.o = false;
        this.f3355a = bVar;
        this.b = aVar;
        this.c = nVar;
        this.i = i;
        String strJ = nVar.j();
        this.d = strJ;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.e = str;
        String strA = com.mbridge.msdk.newreward.function.h.a.a(strJ);
        this.f = strA;
        this.m = str + strA;
        nVar.a(new File(this.m));
        nVar.a(true);
        File file = new File(this.m);
        if (file.exists() && file.isFile()) {
            this.o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i, x xVar) {
        this.l = xVar;
        if (TextUtils.isEmpty(this.d)) {
            if (this.c.c()) {
                x xVar2 = this.l;
                if (xVar2 != null) {
                    xVar2.a(this.f3355a, this.b, this);
                    this.l.b(this.f3355a, this.b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.l;
            if (xVar3 != null) {
                xVar3.a(this.f3355a, this.b, this);
                this.l.a(this.f3355a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.o) {
            x xVar4 = this.l;
            if (xVar4 != null) {
                xVar4.a(this.f3355a, this.b, this);
                this.l.b(this.f3355a, this.b, this);
                return;
            }
            return;
        }
        this.n = false;
        int iV = this.f3355a.v();
        this.k = UUID.randomUUID().toString();
        int videoCtnType = this.b.g().getVideoCtnType();
        if (i == 1 || this.i == 100 || videoCtnType == 1) {
            this.h = false;
            this.g = new DownloadMessage(this.f3355a, this.d, this.f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.h = true;
            this.g = new DownloadMessage(this.f3355a, this.d, this.f, this.i, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.k, iV, this);
        DownloadRequest downloadRequestBuild = MBDownloadManager.getInstance().download(this.g).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.e).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.j = downloadRequestBuild;
        downloadRequestBuild.start();
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0282a
    public final void a(String str, long j) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout taskID: " + str);
        }
        if (this.j != null) {
            this.n = true;
            this.j.cancel(this.g);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.k);
        if (this.n) {
            x xVar = this.l;
            if (xVar != null) {
                xVar.b(this.f3355a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.l;
        if (xVar2 != null) {
            xVar2.a(this.f3355a, this.b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.k);
        this.c.a(TextUtils.equals(this.j.get("cache", "2"), "2") ? 2 : 1);
        this.c.b(true);
        this.c.a(false);
        this.c.a(TextUtils.equals(this.j.get("cache", "2"), "2") ? 2 : 1);
        x xVar = this.l;
        if (xVar != null) {
            xVar.b(this.f3355a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.k);
        this.c.a(TextUtils.equals(this.j.get("cache", "2"), "2") ? 2 : 1);
        this.c.b(false);
        this.c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.l;
        if (xVar != null) {
            xVar.a(this.f3355a, this.b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.k);
        }
        x xVar = this.l;
        if (xVar != null) {
            xVar.a(this.f3355a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        if (downloadProgress.getCurrentDownloadRate() >= this.i) {
            this.c.a(TextUtils.equals(this.j.get("cache", "2"), "2") ? 2 : 1);
            this.c.b(true);
            this.c.a(false);
            if (this.h) {
                this.j.cancel(downloadMessage);
            }
        }
    }
}
