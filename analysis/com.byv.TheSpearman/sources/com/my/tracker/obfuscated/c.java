package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.b;
import com.my.tracker.obfuscated.p;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements p.a, b.c {

    /* renamed from: a, reason: collision with root package name */
    final p f4217a;
    final r0 b;
    final b c;

    private c(p pVar, r0 r0Var, b.C0312b c0312b) {
        this.f4217a = pVar;
        this.b = r0Var;
        this.c = c0312b.a(this);
    }

    public static c a(p pVar, r0 r0Var, Context context) {
        b.C0312b c0312bA = b.a(context.getApplicationContext());
        if (c0312bA != null) {
            return new c(pVar, r0Var, c0312bA);
        }
        z0.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject jSONObjectA = b.a(obj);
        if (jSONObjectA == null) {
            z0.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.f4217a.a(jSONObjectA, str, str2, str3, (Map<String, String>) map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b.b() < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            z0.a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.c.a();
            this.b.a(jCurrentTimeMillis);
        }
    }

    public void a() {
        this.f4217a.a(this);
        c();
    }

    public void a(int i, Intent intent) {
        if (i != -1) {
            z0.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            z0.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.c.a(intent);
        }
    }

    @Override // com.my.tracker.obfuscated.p.a
    public void a(List<d> list) {
        if (list.isEmpty()) {
            z0.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.c.a(list);
        }
    }

    public void b(final Object obj, final String str, final String str2, final String str3, final Map<String, String> map) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(obj, str, str2, str3, map);
            }
        });
    }

    @Override // com.my.tracker.obfuscated.b.c
    public void b(List<d> list) {
        if (list.isEmpty()) {
            z0.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f4217a.a(list, this);
        }
    }

    void c() {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    @Override // com.my.tracker.obfuscated.b.c
    public void c(List<d> list) {
        if (list.isEmpty()) {
            z0.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f4217a.c(list);
        }
    }
}
