package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.download.e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: H5DownLoadManager.java */
/* loaded from: classes4.dex */
public class d {
    private static d c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f3888a;
    private ConcurrentMap<String, Object> b;
    private g d;
    private e e;
    private boolean f;
    private final String g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private final String h = "down_type";

    private d() {
        this.f = false;
        try {
            this.d = g.a();
            this.e = e.a.f3891a;
            this.f3888a = new CopyOnWriteArrayList<>();
            this.b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB != null) {
                this.f = gVarB.y(1);
            }
        } catch (Throwable th) {
            ad.a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        if (c == null) {
            c = new d();
        }
        return c;
    }

    public final String a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    g gVar = this.d;
                    if (gVar != null) {
                        return gVar.a(str);
                    }
                    return null;
                }
                e eVar = this.e;
                return eVar != null ? eVar.a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
