package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.applovin.impl.x0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class hm extends xl {
    private final b h;
    private final String i;
    private String j;

    public interface b {
        void a(x0.b bVar, String str);

        void a(String str, String str2);
    }

    public hm(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.i = str;
        this.h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f1179a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTP).authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.j = uriBuild.toString();
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Looking up app-ads.txt at " + this.j);
        }
        this.f1179a.l0().a(new a(aVarA, this.f1179a));
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "No app-ads.txt found");
                }
                hm.this.h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.j);
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Found app-ads.txt");
                }
                hm.this.h.a(str2, hm.this.j);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            hm.this.h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.j);
        }
    }
}
