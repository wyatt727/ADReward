package com.my.target;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.common.MyTargetVersion;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class z4 {
    public static boolean h = true;
    public static String i = "https://ad.mail.ru/sdk/log/";

    /* renamed from: a, reason: collision with root package name */
    public final String f4199a;
    public final String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;

    public z4(String str, String str2) {
        this.f4199a = str;
        this.b = str2;
    }

    public static z4 a(String str) {
        return new z4(str, "error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        String strA = a();
        ba.a("send message to log:\n " + strA);
        if (h) {
            z1.a().a(i, Base64.encodeToString(strA.getBytes(Charset.forName(C.UTF8_NAME)), 0), context);
        }
    }

    public z4 a(int i2) {
        this.d = i2;
        return this;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ServiceProvider.NAMED_SDK, "myTarget");
            jSONObject.put("sdkver", MyTargetVersion.VERSION);
            jSONObject.put(com.json.i5.x, com.json.t2.e);
            jSONObject.put("osver", Build.VERSION.RELEASE);
            jSONObject.put("type", this.b);
            jSONObject.put("name", this.f4199a);
            String str = this.c;
            if (str != null) {
                jSONObject.put("message", str);
            }
            int i2 = this.d;
            if (i2 > 0) {
                jSONObject.put("slot", i2);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("bannerId", str3);
            }
            String str4 = this.g;
            if (str4 != null) {
                jSONObject.put("data", str4);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public z4 b(String str) {
        this.e = str;
        return this;
    }

    public void b(final Context context) {
        c0.c(new Runnable() { // from class: com.my.target.z4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context);
            }
        });
    }

    public z4 c(String str) {
        this.f = str;
        return this;
    }

    public z4 d(String str) {
        this.g = str;
        return this;
    }

    public z4 e(String str) {
        this.c = str;
        return this;
    }
}
