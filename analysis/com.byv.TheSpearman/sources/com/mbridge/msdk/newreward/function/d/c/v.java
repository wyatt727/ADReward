package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* compiled from: MBridgeH5ResourceDownloader.java */
/* loaded from: classes4.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0282a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3353a;
    private final String b;
    private final String c;
    private com.mbridge.msdk.newreward.function.d.a.b d;
    private com.mbridge.msdk.newreward.function.d.a.a e;
    private c f;
    private String g;
    private DownloadMessage h;
    private DownloadRequest i;
    private String j;
    private x k;
    private boolean l;
    private String m;
    private boolean n;

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) throws NoSuchAlgorithmException {
        this.l = false;
        this.n = false;
        this.d = bVar;
        this.e = aVar;
        this.f = cVar;
        String strJ = cVar.j();
        this.g = strJ;
        if (!TextUtils.isEmpty(strJ)) {
            this.n = this.g.contains(".zip") && this.g.contains(ResourceManager.KEY_MD5FILENAME);
        }
        String strA = com.mbridge.msdk.foundation.same.b.e.a(this.n ? com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES : com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(ao.b(this.g));
        this.f3353a = md5;
        this.b = strA + "/";
        this.c = strA + "/" + md5;
        this.f.a(true);
        String resDirFromCampaign = this.n ? ResourceManager.getinstance().getResDirFromCampaign(this.g) : HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.g);
        if (TextUtils.isEmpty(resDirFromCampaign)) {
            return;
        }
        this.l = true;
        this.f.a(1);
        this.f.a(resDirFromCampaign);
        this.f.b(true);
        this.f.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i, x xVar) {
        StringBuilder sb;
        String str;
        this.k = xVar;
        int iV = this.d.v();
        this.j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.d, this.e, this);
        }
        if (this.l) {
            x xVar2 = this.k;
            if (xVar2 != null) {
                xVar2.b(this.d, this.e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.j, iV, this);
        if (this.n) {
            sb = new StringBuilder();
            sb.append(this.f3353a);
            str = ".zip";
        } else {
            sb = new StringBuilder();
            sb.append(this.f3353a);
            str = ".html";
        }
        sb.append(str);
        String string = sb.toString();
        this.m = this.b + string;
        this.h = new DownloadMessage(this.d, this.g, string, 100, this.n ? DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP : DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML);
        DownloadRequest downloadRequestBuild = MBDownloadManager.getInstance().download(this.h).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.b).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.i = downloadRequestBuild;
        downloadRequestBuild.start();
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0282a
    public final void a(String str, long j) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str);
        }
        DownloadRequest downloadRequest = this.i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.h);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.j);
        this.f.a(TextUtils.equals(this.i.get("cache", "2"), "2") ? 2 : 1);
        this.f.b(false);
        this.f.a(false);
        if (this.f.c()) {
            x xVar = this.k;
            if (xVar != null) {
                xVar.b(this.d, this.e, this);
                return;
            }
            return;
        }
        x xVar2 = this.k;
        if (xVar2 != null) {
            xVar2.a(this.d, this.e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        String str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.j);
        Exception e = null;
        try {
            try {
                if (this.n) {
                    MBResourceManager.getInstance().unZip(this.m, this.c);
                }
                String resDirFromCampaign = this.n ? ResourceManager.getinstance().getResDirFromCampaign(this.g) : HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.g);
                this.f.b(true);
                this.f.a(false);
                this.f.a(TextUtils.equals(this.i.get("cache", "2"), "2") ? 2 : 1);
                this.f.a(2);
                this.f.a(resDirFromCampaign);
            } catch (Exception e2) {
                e = e2;
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e.getMessage());
                }
                if (this.f.c()) {
                    xVar = this.k;
                    if (xVar == null) {
                        return;
                    }
                } else {
                    if (this.k != null) {
                        this.k.a(this.d, this.e, this, new MBridgeError(6, "unzip error:" + e.getMessage()));
                        return;
                    }
                    return;
                }
            }
            if (this.f.c()) {
                xVar = this.k;
                if (xVar == null) {
                    return;
                }
                xVar.b(this.d, this.e, this);
                return;
            }
            x xVar2 = this.k;
            if (xVar2 != null) {
                xVar2.a(this.d, this.e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
            }
        } catch (Throwable th) {
            if (this.f.c()) {
                x xVar3 = this.k;
                if (xVar3 != null) {
                    xVar3.b(this.d, this.e, this);
                }
            } else if (this.k != null) {
                if (e != null) {
                    str = "unzip error:" + e.getMessage();
                }
                this.k.a(this.d, this.e, this, new MBridgeError(6, str));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDownloadError(com.mbridge.msdk.foundation.download.DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> r3, com.mbridge.msdk.foundation.download.DownloadError r4) {
        /*
            r2 = this;
            com.mbridge.msdk.newreward.a.c.a r3 = com.mbridge.msdk.newreward.a.c.a.a()
            java.lang.String r0 = r2.j
            r3.a(r0)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r3 = r2.i
            java.lang.String r0 = "cache"
            java.lang.String r1 = "2"
            java.lang.String r3 = r3.get(r0, r1)
            com.mbridge.msdk.newreward.function.d.c.c r0 = r2.f
            boolean r3 = android.text.TextUtils.equals(r3, r1)
            r1 = 2
            if (r3 == 0) goto L1e
            r3 = r1
            goto L1f
        L1e:
            r3 = 1
        L1f:
            r0.a(r3)
            com.mbridge.msdk.newreward.function.d.c.c r3 = r2.f
            r0 = 0
            r3.b(r0)
            com.mbridge.msdk.newreward.function.d.c.c r3 = r2.f
            r3.a(r0)
            com.mbridge.msdk.newreward.function.d.c.c r3 = r2.f
            boolean r3 = r3.c()
            if (r3 == 0) goto L41
            com.mbridge.msdk.newreward.function.d.c.x r3 = r2.k
            if (r3 == 0) goto L76
            com.mbridge.msdk.newreward.function.d.a.b r4 = r2.d
            com.mbridge.msdk.newreward.function.d.a.a r0 = r2.e
            r3.b(r4, r0, r2)
            goto L76
        L41:
            com.mbridge.msdk.newreward.function.d.c.x r3 = r2.k
            if (r3 == 0) goto L76
            com.mbridge.msdk.newreward.function.d.c.c r3 = r2.f
            if (r3 == 0) goto L5f
            int r3 = r3.h()
            if (r3 == r1) goto L5c
            r0 = 3
            if (r3 == r0) goto L59
            r0 = 4
            if (r3 == r0) goto L56
            goto L5f
        L56:
            java.lang.String r3 = "ec template error"
            goto L61
        L59:
            java.lang.String r3 = "big template error"
            goto L61
        L5c:
            java.lang.String r3 = "video template error"
            goto L61
        L5f:
            java.lang.String r3 = "network error"
        L61:
            com.mbridge.msdk.newreward.function.common.MBridgeError r0 = new com.mbridge.msdk.newreward.function.common.MBridgeError
            r0.<init>(r1, r3)
            java.lang.Exception r3 = r4.getException()
            r0.setException(r3)
            com.mbridge.msdk.newreward.function.d.c.x r3 = r2.k
            com.mbridge.msdk.newreward.function.d.a.b r4 = r2.d
            com.mbridge.msdk.newreward.function.d.a.a r1 = r2.e
            r3.a(r4, r1, r2, r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.d.c.v.onDownloadError(com.mbridge.msdk.foundation.download.DownloadMessage, com.mbridge.msdk.foundation.download.DownloadError):void");
    }
}
