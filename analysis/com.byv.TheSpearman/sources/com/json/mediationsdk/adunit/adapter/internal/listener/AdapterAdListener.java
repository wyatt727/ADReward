package com.json.mediationsdk.adunit.adapter.internal.listener;

import com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* loaded from: classes4.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    void onAdLoadSuccess();

    void onAdOpened();
}
