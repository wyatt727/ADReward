package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.d.b.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.text.Typography;

/* compiled from: RewardSettingReqParameters.java */
/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f3384a;
    private int b;
    private String c;
    private int d;

    public final void a(String str) {
        this.f3384a = str;
    }

    public final String b() {
        return this.f3384a;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final Map<String, String> c() {
        e eVar = new e(a());
        if (this.d == g.b && !TextUtils.isEmpty(this.f3384a)) {
            eVar.a("unit_ids", String.format("[%s]", this.f3384a));
        }
        eVar.a("vtag", TextUtils.isEmpty(this.c) ? "" : this.c);
        if (com.mbridge.msdk.f.b.a()) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        com.mbridge.msdk.c.a.d.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar);
        f.d(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c().entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append(t2.i.b);
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Throwable th) {
            ad.b("RewardSettingReqParameters", th.getMessage());
        }
        return sb.toString();
    }
}
