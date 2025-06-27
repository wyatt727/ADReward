package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f4267a;
    final u b;
    final c c;

    private v0(p pVar, Context context) {
        this.b = u.a(pVar, context);
        this.c = c.a(pVar, r0.a(context), context);
        this.f4267a = context.getApplicationContext();
    }

    public static v0 a(p pVar, Context context) {
        return new v0(pVar, context);
    }

    public void a() {
        this.b.a();
        c cVar = this.c;
        if (cVar == null) {
            z0.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            cVar.a();
        }
    }

    void a(int i, Intent intent) {
        c cVar = this.c;
        if (cVar == null) {
            z0.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            cVar.a(i, intent);
        }
    }

    public void a(int i, List<Object> list) {
        this.b.a(i, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        c cVar = this.c;
        if (cVar == null) {
            z0.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            cVar.b(obj, str, str2, str3, map);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }

    public void b(int i, Intent intent) {
        String installingPackageName;
        PackageManager packageManager = this.f4267a.getPackageManager();
        try {
            String packageName = this.f4267a.getPackageName();
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable th) {
            z0.a("PurchaseHandler: can't detect installer package –" + th.getMessage());
            installingPackageName = "";
        }
        z0.a("PurchaseHandler: installer package is " + installingPackageName);
        installingPackageName.hashCode();
        if (installingPackageName.equals("com.huawei.appmarket")) {
            z0.a("PurchaseHandler: appGalleryMarket detected");
        } else if (installingPackageName.equals("com.android.vending")) {
            z0.a("PurchaseHandler: googleStore detected");
            this.b.a(i, intent);
            return;
        } else {
            z0.a("PurchaseHandler: store not detected");
            this.b.a(i, intent);
        }
        a(i, intent);
    }
}
