package com.mbridge.msdk.foundation.same.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;

/* compiled from: CommonImageTask.java */
/* loaded from: classes4.dex */
public final class e extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2846a;
    private String b;
    private boolean c;
    private String d;
    private a e;
    private String f;

    /* compiled from: CommonImageTask.java */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z) {
    }

    public e(String str, String str2, String str3) {
        this.f2846a = false;
        this.c = false;
        this.d = str;
        this.b = str2;
        this.f = str3;
    }

    public e(String str, String str2, String str3, h hVar) {
        this.f2846a = false;
        this.c = false;
        this.d = str;
        this.b = str2;
        this.f = str3;
        this.f2846a = true;
    }

    private void b() {
        try {
            File file = new File(this.f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.mbridge.msdk.foundation.same.net.h.c.downloadFile(file, this.b, new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.c.e.1
                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j, long j2) {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar = e.this;
                            String unused = e.this.f;
                            e.this.a();
                        }
                    };
                    if (e.this.f2846a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(final com.mbridge.msdk.foundation.same.net.b.a aVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.this.a(e.this.b, "load image from http faild because http return code: " + aVar.f2868a + ".image url is " + e.this.b);
                        }
                    };
                    if (e.this.f2846a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (Exception e) {
            a(this.b, e.getMessage());
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            a(this.b, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    protected final void a() {
        if (new File(this.f).exists()) {
            String str = this.b;
            String str2 = this.f;
            a aVar = this.e;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        a(this.b, "load image faild.because file[" + this.f + "] is not exist!");
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        if (!this.c) {
            if (TextUtils.isEmpty(this.f)) {
                a(this.b, "save path is null.");
                return;
            }
            File file = new File(this.f);
            if (!file.exists() || file.length() <= 0) {
                b();
                return;
            } else {
                a();
                return;
            }
        }
        b();
    }
}
