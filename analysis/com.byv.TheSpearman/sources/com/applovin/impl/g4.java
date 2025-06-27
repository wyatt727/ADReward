package com.applovin.impl;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import com.my.target.ads.Reward;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class g4 implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f446a;
    private AppLovinSdkConfiguration.ConsentFlowUserGeography b;
    private a c;
    private Uri d;
    private Uri e;

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f446a + ", privacyPolicyUri=" + this.d + ", termsOfServiceUri=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public enum a {
        TERMS(Reward.DEFAULT),
        UNIFIED("unified");


        /* renamed from: a, reason: collision with root package name */
        private final String f447a;

        a(String str) {
            this.f447a = str;
        }

        public String b() {
            return this.f447a;
        }
    }

    public g4(boolean z, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, a aVar, Uri uri, Uri uri2) {
        this.f446a = z;
        this.b = consentFlowUserGeography;
        this.c = aVar;
        this.d = uri;
        this.e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setEnabled(boolean z) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z);
        this.f446a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public boolean isEnabled() {
        return this.f446a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.b = consentFlowUserGeography;
    }

    public a a() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.e;
    }

    public void a(a aVar) {
        this.c = aVar;
    }
}
