package com.applovin.sdk;

import android.net.Uri;

/* loaded from: classes.dex */
public interface AppLovinTermsFlowSettings {
    Uri getPrivacyPolicyUri();

    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setEnabled(boolean z);

    void setPrivacyPolicyUri(Uri uri);

    void setTermsOfServiceUri(Uri uri);
}
