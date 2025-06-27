package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class da {
    public static final String[] c = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", "market://", "samsungapps://", "appmarket://", "hiapplink://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    /* renamed from: a, reason: collision with root package name */
    public final String f3952a;
    public a b;

    public interface a {
        void a(String str);
    }

    public da(String str) {
        this.f3952a = str;
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, C.UTF8_NAME);
        } catch (Throwable th) {
            ba.a("UrlResolver: Unable to decode url - " + th.getMessage());
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        final String strC = c2.a().a(this.f3952a, null, context).c();
        if (this.b == null) {
            return;
        }
        c0.d(new Runnable() { // from class: com.my.target.da$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f(strC);
            }
        });
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Throwable th) {
            ba.a("UrlResolver: Unable to encode url - " + th.getMessage());
            return "";
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https");
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(str);
            this.b = null;
        }
    }

    public static da g(String str) {
        return new da(str);
    }

    public da a(a aVar) {
        this.b = aVar;
        return this;
    }

    public void b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        c0.c(new Runnable() { // from class: com.my.target.da$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(applicationContext);
            }
        });
    }
}
