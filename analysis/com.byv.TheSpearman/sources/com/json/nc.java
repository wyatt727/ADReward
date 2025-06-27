package com.json;

import android.util.Log;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.logger.d;
import com.json.mediationsdk.server.HttpFunctions;
import com.json.mediationsdk.server.ServerURL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class nc {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2034a;
        final /* synthetic */ boolean b;
        final /* synthetic */ int c;

        a(String str, boolean z, int i) {
            this.f2034a = str;
            this.b = z;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            nc.c(this.f2034a, this.b, this.c);
        }
    }

    public static void b(String str, boolean z, int i) {
        Thread thread = new Thread(new a(str, z, i), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z, int i) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, i)));
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            sb.append(str);
            sb.append(", hit:");
            sb.append(z);
            sb.append(")");
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
