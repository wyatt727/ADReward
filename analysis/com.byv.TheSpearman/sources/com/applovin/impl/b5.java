package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sm;
import com.json.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b5 extends CustomTabsServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f288a;
    private CustomTabsClient b;

    public b5(com.applovin.impl.sdk.k kVar) {
        this.f288a = kVar;
        if (((Boolean) kVar.a(oj.x6)).booleanValue()) {
            Context contextK = com.applovin.impl.sdk.k.k();
            String packageName = CustomTabsClient.getPackageName(contextK, null);
            if (packageName == null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("CustomTabsManager", "Cannot find a browser that supports Custom Tabs.");
                    return;
                }
                return;
            }
            CustomTabsClient.bindCustomTabsService(contextK, packageName, this);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Custom Tabs service connected for package: " + componentName.getPackageName());
        }
        this.b = customTabsClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(final ComponentName componentName) {
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Custom Tabs service disconnected");
        }
        this.b = null;
        Long l = (Long) this.f288a.a(oj.y6);
        if (l.longValue() < 0) {
            return;
        }
        this.f288a.l0().a(new kn(this.f288a, "CustomTabsManager", new Runnable() { // from class: com.applovin.impl.b5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(componentName);
            }
        }), sm.b.OTHER, l.longValue());
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession == null) {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new Runnable() { // from class: com.applovin.impl.b5$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list, customTabsSession);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b bVarI = aVar.i();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(aVar.j());
        c5 c5VarX = bVarI != null ? bVarI.x() : null;
        if (c5VarX != null) {
            Integer numL = c5VarX.l();
            if (numL != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(numL.intValue()).build());
            }
            Integer numA = c5VarX.a();
            if (numA != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(numA.intValue()).build());
            }
            Integer numJ = c5VarX.j();
            Integer numK = c5VarX.k();
            if (numJ != null && numK != null) {
                builder.setStartAnimations(activity, numJ.intValue(), numK.intValue());
            }
            Integer numC = c5VarX.c();
            Integer numD = c5VarX.d();
            if (numC != null && numD != null) {
                builder.setExitAnimations(activity, numC.intValue(), numD.intValue());
            }
            Boolean boolM = c5VarX.m();
            if (boolM != null) {
                builder.setUrlBarHidingEnabled(boolM.booleanValue());
            }
            Boolean boolI = c5VarX.i();
            if (boolI != null) {
                builder.setShowTitle(boolI.booleanValue());
            }
            Boolean boolE = c5VarX.e();
            if (boolE != null) {
                builder.setInstantAppsEnabled(boolE.booleanValue());
            }
            Integer numH = c5VarX.h();
            if (numH != null) {
                builder.setShareState(numH.intValue());
            }
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (c5VarX != null) {
            String strF = c5VarX.f();
            if (strF != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strF));
            }
            Bundle bundleS = bVarI.s();
            if (!bundleS.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundleS);
            }
        }
        return customTabsIntentBuild;
    }

    private class a extends CustomTabsCallback {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.adview.a f289a;

        public a(com.applovin.impl.adview.a aVar) {
            this.f289a = aVar;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            com.applovin.impl.sdk.ad.b bVarI = this.f289a.i();
            if (bVarI == null) {
                b5.this.f288a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    b5.this.f288a.L().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                }
                return;
            }
            switch (i) {
                case 1:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsNavigationStarted(bVarI);
                        break;
                    }
                    break;
                case 2:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsNavigationFinished(bVarI);
                        break;
                    }
                    break;
                case 3:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsNavigationFailed(bVarI);
                        break;
                    }
                    break;
                case 4:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsNavigationAborted(bVarI);
                        break;
                    }
                    break;
                case 5:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsTabShown(bVarI);
                    }
                    bc.c(this.f289a.e(), bVarI, this.f289a.k());
                    break;
                case 6:
                    if (bVarI.P0()) {
                        b5.this.f288a.i().trackCustomTabsTabHidden(bVarI);
                    }
                    bc.a(this.f289a.e(), bVarI, this.f289a.k());
                    break;
                default:
                    b5.this.f288a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        b5.this.f288a.L().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            b5.this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVarL = b5.this.f288a.L();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z ? "succeeded" : t2.h.t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                tVarL.a("CustomTabsManager", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).launchUrl(activity, Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, CustomTabsSession customTabsSession) {
        this.b.warmup(0L);
        c5 c5VarX = bVar.x();
        if (c5VarX == null) {
            return;
        }
        Integer numG = c5VarX.g();
        String strB = c5VarX.b();
        if (numG == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (customTabsSession == null) {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Validating session-URL relation: " + numG + " with digital asset link: " + strB);
        }
        customTabsSession.validateRelationship(numG.intValue(), Uri.parse(strB), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        Iterator it = list.iterator();
        String str = (String) it.next();
        it.remove();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVarL = this.f288a.L();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(zMayLaunchUrl ? "succeeded" : t2.h.t);
            tVarL.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(final String str, final com.applovin.impl.adview.a aVar, final Activity activity) {
        a("launch url", new Runnable() { // from class: com.applovin.impl.b5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(aVar, activity, str);
            }
        });
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th) {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f288a.B().a("CustomTabsManager", str, th);
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f288a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f288a.L().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.b.newSession(new a(aVar));
            a(customTabsSessionNewSession, aVar.i());
            return customTabsSessionNewSession;
        } catch (Exception e) {
            this.f288a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f288a.L().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    private void a(final CustomTabsSession customTabsSession, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.z0()) {
            return;
        }
        a("client warmup", new Runnable() { // from class: com.applovin.impl.b5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, customTabsSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ComponentName componentName) {
        CustomTabsClient.bindCustomTabsService(com.applovin.impl.sdk.k.k(), componentName.getPackageName(), this);
    }
}
