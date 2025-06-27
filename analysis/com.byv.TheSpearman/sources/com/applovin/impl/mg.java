package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import com.json.t2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class mg {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f696a;
    private final Context b = com.applovin.impl.sdk.k.k();
    private String c;

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public mg(com.applovin.impl.sdk.k kVar) {
        this.f696a = kVar;
    }

    public void i() {
        if (((Boolean) this.f696a.a(oj.e0)).booleanValue()) {
            this.f696a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f696a.L().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mg$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.b);
        this.f696a.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVarL = this.f696a.L();
            StringBuilder sb = new StringBuilder();
            sb.append("Init ");
            sb.append(d() ? "succeeded" : t2.h.t);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            tVarL.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    public Partner b() {
        return Partner.createPartner((String) this.f696a.a(oj.f0), AppLovinSdk.VERSION);
    }

    public String a() {
        return this.c;
    }

    private void h() {
        this.f696a.l0().a((xl) new kn(this.f696a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.mg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f$0.f();
            }
        }), sm.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() throws IOException {
        if (this.c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            this.c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (Throwable th3) {
            this.f696a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f696a.L().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th3);
            }
        }
    }

    public boolean e() {
        String str = this.f696a.g0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L17
            com.applovin.impl.sdk.k r0 = r4.f696a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = com.applovin.impl.ng.a(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L17
            java.lang.String r0 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L1f
            goto L18
        L17:
            r0 = r5
        L18:
            java.lang.String r1 = r4.c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r1, r0)     // Catch: java.lang.Throwable -> L1f
            return r5
        L1f:
            r0 = move-exception
            com.applovin.impl.sdk.k r1 = r4.f696a
            r1.L()
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto L38
            com.applovin.impl.sdk.k r1 = r4.f696a
            com.applovin.impl.sdk.t r1 = r1.L()
            java.lang.String r2 = "OpenMeasurementService"
            java.lang.String r3 = "Failed to inject JavaScript SDK into HTML"
            r1.a(r2, r3, r0)
        L38:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mg.a(java.lang.String):java.lang.String");
    }
}
