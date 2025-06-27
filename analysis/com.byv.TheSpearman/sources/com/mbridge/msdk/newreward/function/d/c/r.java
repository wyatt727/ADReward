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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MBridgeBaseDynamicViewDownloader.java */
/* loaded from: classes4.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0282a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f3352a;
    private com.mbridge.msdk.newreward.function.d.a.a b;
    private b c;
    private String d;
    private String e;
    private DownloadMessage f;
    private DownloadRequest g;
    private String h;
    private String i;
    private x j;
    private String k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;
    private boolean l;

    protected abstract String a();

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    protected r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.l = false;
        this.f3352a = bVar;
        this.b = aVar;
        this.c = bVar2;
        this.d = bVar2.j();
        String strA = com.mbridge.msdk.newreward.function.h.a.a(this.d);
        this.e = strA;
        this.i = this.k + strA.replace(".zip", "").replace(".xml", "");
        this.c.a(true);
        File fileA = a(this.i);
        if (fileA == null || !fileA.exists()) {
            return;
        }
        this.l = true;
        this.c.a(1);
        this.c.a(fileA);
        this.c.b(true);
        this.c.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public void a(int i, x xVar) {
        this.j = xVar;
        if (xVar != null) {
            xVar.a(this.f3352a, this.b, this);
        }
        if (this.l) {
            if (xVar != null) {
                xVar.b(this.f3352a, this.b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.d)) {
            if (this.c.c()) {
                if (xVar != null) {
                    xVar.b(this.f3352a, this.b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.f3352a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int iV = this.f3352a.v();
        this.h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.h, iV, this);
        this.f = new DownloadMessage(this.f3352a, this.d, this.e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest downloadRequestBuild = MBDownloadManager.getInstance().download(this.f).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.k).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.g = downloadRequestBuild;
        downloadRequestBuild.start();
    }

    public com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b c() {
        return this.f3352a;
    }

    public a<?> d() {
        return this.c;
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0282a
    public void a(String str, long j) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str + " " + d().j());
        }
        DownloadRequest downloadRequest = this.g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + d().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.h);
        this.c.a(TextUtils.equals(this.g.get("cache", "2"), "2") ? 2 : 1);
        this.c.b(false);
        this.c.a(false);
        if (this.c.c()) {
            x xVar = this.j;
            if (xVar != null) {
                xVar.b(this.f3352a, this.b, this);
                return;
            }
            return;
        }
        x xVar2 = this.j;
        if (xVar2 != null) {
            xVar2.a(this.f3352a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + d().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.k);
                this.c.a(TextUtils.equals(this.g.get("cache", "2"), "2") ? 2 : 1);
                this.c.b(true);
                this.c.a(false);
                this.c.a(a(this.i));
                this.c.a(2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e.getMessage());
                }
                if (this.c.c()) {
                    xVar2 = this.j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.j;
                    if (xVar == null) {
                        return;
                    }
                    bVar = this.f3352a;
                    aVar = this.b;
                    mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                }
            }
            if (this.c.c()) {
                xVar2 = this.j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f3352a, this.b, this);
                return;
            }
            xVar = this.j;
            if (xVar != null) {
                bVar = this.f3352a;
                aVar = this.b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.c.c()) {
                x xVar3 = this.j;
                if (xVar3 != null) {
                    xVar3.b(this.f3352a, this.b, this);
                }
            } else {
                x xVar4 = this.j;
                if (xVar4 != null) {
                    xVar4.a(this.f3352a, this.b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDownloadError(com.mbridge.msdk.foundation.download.DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> r3, com.mbridge.msdk.foundation.download.DownloadError r4) {
        /*
            r2 = this;
            com.mbridge.msdk.newreward.a.c.a r3 = com.mbridge.msdk.newreward.a.c.a.a()
            java.lang.String r0 = r2.h
            r3.a(r0)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r3 = r2.g
            java.lang.String r0 = "cache"
            java.lang.String r1 = "2"
            java.lang.String r3 = r3.get(r0, r1)
            com.mbridge.msdk.newreward.function.d.c.b r0 = r2.c
            boolean r3 = android.text.TextUtils.equals(r3, r1)
            r1 = 2
            if (r3 == 0) goto L1e
            r3 = r1
            goto L1f
        L1e:
            r3 = 1
        L1f:
            r0.a(r3)
            com.mbridge.msdk.newreward.function.d.c.b r3 = r2.c
            r0 = 0
            r3.b(r0)
            com.mbridge.msdk.newreward.function.d.c.b r3 = r2.c
            r3.a(r0)
            com.mbridge.msdk.newreward.function.d.c.x r3 = r2.j
            if (r3 == 0) goto L62
            com.mbridge.msdk.newreward.function.d.c.b r3 = r2.c
            if (r3 == 0) goto L4b
            int r3 = r3.h()
            if (r3 == r1) goto L48
            r0 = 3
            if (r3 == r0) goto L45
            r0 = 4
            if (r3 == r0) goto L42
            goto L4b
        L42:
            java.lang.String r3 = "ec template error"
            goto L4d
        L45:
            java.lang.String r3 = "big template error"
            goto L4d
        L48:
            java.lang.String r3 = "video template error"
            goto L4d
        L4b:
            java.lang.String r3 = "network error"
        L4d:
            com.mbridge.msdk.newreward.function.common.MBridgeError r0 = new com.mbridge.msdk.newreward.function.common.MBridgeError
            r0.<init>(r1, r3)
            java.lang.Exception r3 = r4.getException()
            r0.setException(r3)
            com.mbridge.msdk.newreward.function.d.c.x r3 = r2.j
            com.mbridge.msdk.newreward.function.d.a.b r4 = r2.f3352a
            com.mbridge.msdk.newreward.function.d.a.a r1 = r2.b
            r3.a(r4, r1, r2, r0)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.d.c.r.onDownloadError(com.mbridge.msdk.foundation.download.DownloadMessage, com.mbridge.msdk.foundation.download.DownloadError):void");
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str + ".xml");
        return (file.isFile() && file.exists()) ? file : b(str);
    }

    private File b(String str) throws Throwable {
        JSONArray jSONArray;
        String strA = com.mbridge.msdk.newreward.function.h.a.a(new File(str + File.separator + "template_config.json"));
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(strA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("xml_type", "");
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, a())) {
                    File file = new File(str + File.separator + jSONObjectOptJSONObject.optString("name", ""));
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }
}
