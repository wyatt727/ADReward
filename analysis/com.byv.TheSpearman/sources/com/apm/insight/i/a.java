package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.s;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f62a = null;
    private static String b = "";

    private a(Context context) {
        if (f62a == null) {
            synchronized (a.class) {
                if (f62a == null) {
                    String string = null;
                    String strA = s.a().a((String) null);
                    if (strA != null) {
                        f62a = UUID.fromString(strA);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            f62a = string != null ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            s.a().c(f62a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        UUID uuidA;
        if (TextUtils.isEmpty(b) && (uuidA = new a(context).a()) != null) {
            b = uuidA.toString();
        }
        return b;
    }

    public UUID a() {
        return f62a;
    }
}
