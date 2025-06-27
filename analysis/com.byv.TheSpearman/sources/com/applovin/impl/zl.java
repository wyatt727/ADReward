package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* loaded from: classes.dex */
public class zl extends xl {
    private final List h;
    private final Activity i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ke keVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Auto-initing adapter: " + keVar);
        }
        this.f1179a.N().a(keVar, this.i);
    }

    public zl(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.h = list;
        this.i = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.h.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.c;
                String str = this.b;
                StringBuilder sb = new StringBuilder();
                sb.append("Auto-initing ");
                sb.append(this.h.size());
                sb.append(" adapters");
                sb.append(this.f1179a.n0().c() ? " in test mode" : "");
                sb.append("...");
                tVar.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f1179a.Q())) {
                this.f1179a.e(AppLovinMediationProvider.MAX);
            } else if (!this.f1179a.D0()) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f1179a.Q());
            }
            if (this.i == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final ke keVar : this.h) {
                this.f1179a.l0().a(new Runnable() { // from class: com.applovin.impl.zl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(keVar);
                    }
                }, sm.b.MEDIATION);
            }
        }
    }
}
