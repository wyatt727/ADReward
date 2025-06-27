package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;

/* compiled from: HTMLResourceManager.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f3889a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HTMLResourceManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static e f3891a = new e(null);
    }

    /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        this();
    }

    private e() {
        this.f3889a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
    }

    public static e a() {
        return a.f3891a;
    }

    /* compiled from: HTMLResourceManager.java */
    /* renamed from: com.mbridge.msdk.videocommon.download.e$1, reason: invalid class name */
    final class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f3890a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.f3890a.f3889a);
        }
    }

    public final String a(String str) {
        try {
            String str2 = this.f3889a + "/" + SameMD5.getMD5(ao.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB != null && !TextUtils.isEmpty(gVarB.V())) {
                ab.a(com.mbridge.msdk.a.b.c(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, ab.b(file))).getBytes(), file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public final String b(String str) {
        try {
            File file = new File(this.f3889a + "/" + SameMD5.getMD5(ao.b(str)) + ".html");
            if (file.exists()) {
                return ab.b(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
