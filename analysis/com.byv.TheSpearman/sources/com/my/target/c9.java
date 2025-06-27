package com.my.target;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c9 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final b9 f3940a;
    public final y0 b;
    public final WeakReference<Context> c;
    public final z8 d;

    public c9(b9 b9Var, y0 y0Var, z8 z8Var, Context context) {
        this.f3940a = b9Var;
        this.b = y0Var;
        this.d = z8Var;
        this.c = new WeakReference<>(context.getApplicationContext());
    }

    @Override // com.my.target.q7
    public void a(p7 p7Var) {
        if (this.d == null) {
            ba.a("ShoppablePostMessageHandler hasn't shoppableAdsData");
            return;
        }
        if (!p7Var.f4093a.equals("shoppable")) {
            ba.a("ShoppablePostMessageHandler has wrong postMessage type");
            return;
        }
        if (!p7Var.b.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            ba.a("ShoppablePostMessageHandler has wrong postMessage action");
            return;
        }
        d9 d9VarA = new e9().a(p7Var.c);
        if (d9VarA == null) {
            ba.a("ShoppablePostMessageHandler has wrong parse post message params");
            return;
        }
        String str = d9VarA.f3951a;
        Context context = this.c.get();
        if (context == null) {
            ba.a("ShoppablePostMessageHandler hasn't context");
            return;
        }
        m3 m3Var = null;
        Iterator<m3> it = this.d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m3 next = it.next();
            if (str.equals(next.id)) {
                m3Var = next;
                break;
            }
        }
        if (m3Var == null) {
            ba.a("ShoppablePostMessageHandler cannot find internalShoppableAdsData by id");
        } else {
            w9.a(m3Var.f4053a.b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
            this.b.a(this.f3940a, m3Var.deeplink, m3Var.deeplinkFallbackUrl, m3Var.url, context);
        }
    }
}
