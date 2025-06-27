package com.mbridge.msdk.foundation.same.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: CommonImageLoaderRefactor.java */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f2838a;
    private final Handler b;
    private final String c;

    private d() {
        this.b = new Handler(Looper.getMainLooper());
        this.c = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG) + File.separator;
        this.f2838a = g.a();
    }

    public final Bitmap a(String str) {
        if (MBridgeConstans.DEBUG) {
            ad.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.c + ab.c(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return d(str2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap d(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public final boolean b(String str) {
        if (MBridgeConstans.DEBUG) {
            ad.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = null;
            try {
                file = new File(this.c + ab.c(str));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "isImageFileExists error", e);
                }
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.exists();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "isImageFileExists error", e2);
            }
            return false;
        }
    }

    public final void a(final String str, final h hVar, final c cVar) {
        try {
            this.f2838a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadRequest downloadRequestA = d.this.a(ab.c(str), str, hVar, cVar);
                    if (downloadRequestA == null) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                        }
                        if (cVar == null) {
                            return;
                        }
                        d.this.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                cVar.onFailedLoad("create download request error", str);
                            }
                        });
                        return;
                    }
                    downloadRequestA.start();
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "loadImage error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, h hVar, c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.c).withDownloadStateListener(new b(this.b, this.f2838a, str2, this.c, str, hVar, cVar)).withProgressStateListener(null).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.a("CommonImageLoaderRefactor", "createDownloadRequest error", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CommonImageLoaderRefactor.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f2841a = new d();
    }

    /* compiled from: CommonImageLoaderRefactor.java */
    private static final class b implements OnDownloadStateListener<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f2842a;
        private final Handler b;
        private final String c;
        private final String d;
        private final h e;
        private final String f;
        private final c g;

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        public b(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, h hVar, c cVar) {
            this.b = handler;
            this.f2842a = threadPoolExecutor;
            this.f = str;
            this.c = str2;
            this.d = str3;
            this.e = hVar;
            this.g = cVar;
        }

        private void a(final String str) {
            if (this.g == null) {
                return;
            }
            this.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.g.onFailedLoad(b.this.f, str);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CommonImageLoaderRefactor", "callbackForFailed error", e);
                        }
                    }
                }
            });
        }

        private Bitmap a(Bitmap bitmap, h hVar) {
            if (hVar == null) {
                return bitmap;
            }
            try {
                return hVar.a(bitmap);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "handlerImageTransformation error", e);
                }
                return bitmap;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f + " imagePath = " + this.c + this.d);
                File file = null;
                try {
                    file = new File(this.c + this.d);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CommonImageLoaderRefactor", "onDownloadComplete error", e);
                    }
                }
                if (file != null && file.isFile() && file.exists()) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
                } else {
                    ad.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                }
            }
            this.f2842a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(b.this);
                }
            });
        }

        static /* synthetic */ void a(b bVar) {
            if (bVar.g == null) {
                return;
            }
            try {
                Bitmap bitmapD = d.d(bVar.c + bVar.d);
                if (bitmapD == null) {
                    bVar.a("bitmap decode failed");
                } else {
                    final Bitmap bitmapA = bVar.a(bitmapD, bVar.e);
                    if (bitmapA == null) {
                        bVar.a("bitmap transformation failed");
                    } else if (bVar.g != null) {
                        bVar.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    b.this.g.onSuccessLoad(bitmapA, b.this.f);
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.a("CommonImageLoaderRefactor", "callbackForSuccess error", e);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e.getLocalizedMessage());
                }
                bVar.a("bitmap decode failed");
            }
        }
    }
}
