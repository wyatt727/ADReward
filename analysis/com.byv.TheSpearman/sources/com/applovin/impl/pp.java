package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class pp extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f786a;
    private zb b;

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f786a = kVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(kVar));
        this.b.notifyDataSetChanged();
    }

    class a extends zb {
        @Override // com.applovin.impl.zb
        protected int b() {
            return d.values().length;
        }

        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            if (i == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == d.SETTINGS.ordinal()) {
                return new bj("SETTINGS");
            }
            return new bj("GDPR APPLICABILITY");
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            return i == d.SETTINGS.ordinal() ? pp.this.c() : pp.this.a();
        }
    }

    class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f787a;

        b(com.applovin.impl.sdk.k kVar) {
            this.f787a = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == d.SETTINGS.ordinal()) {
                if (hbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f787a.t().h() != null) {
                        up.a(this.f787a.t().h(), com.applovin.impl.sdk.k.k(), this.f787a);
                        return;
                    } else {
                        zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", pp.this);
                        return;
                    }
                }
                if (hbVar.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f787a.t().i() == null) {
                    return;
                }
                up.a(this.f787a.t().i(), com.applovin.impl.sdk.k.k(), this.f787a);
            }
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f786a;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        zb zbVar = this.b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private yb d() {
        yb.b bVarD = yb.a().d("Terms of Service URL");
        if (this.f786a.t().i() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(r3.a(R.color.applovin_sdk_checkmarkColor, this));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    private yb a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return yb.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z).a();
    }

    private yb b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return yb.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f786a.q().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyF = this.f786a.t().f();
        boolean z = zp.c(this.f786a) && consentFlowUserGeographyF != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(yb.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(consentFlowUserGeographyF, z));
        return arrayList;
    }

    private yb b() {
        boolean z = this.f786a.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
