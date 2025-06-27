package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.x0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class jm extends xl {
    private final b h;

    public interface b {
        void a(x0.b bVar);

        void a(String str);
    }

    public jm(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf;
        if (this.f1179a.y() != null) {
            strValueOf = String.valueOf(this.f1179a.z().g().f());
        } else {
            strValueOf = String.valueOf(this.f1179a.x().A().get("package_name"));
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f1179a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f1179a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((Object) "").a(false).a(), this.f1179a));
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "No developer URI found - response is empty");
                }
                jm.this.h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str2);
            if (matcher.find()) {
                String strGroup = matcher.group();
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Found developer URI: " + strGroup);
                }
                jm.this.h.a(strGroup);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to find developer URI from the Play Store listing metadata");
            }
            jm.this.h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch developer URI due to: " + str2 + ", and received error code: " + i);
            }
            jm.this.h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }
    }
}
