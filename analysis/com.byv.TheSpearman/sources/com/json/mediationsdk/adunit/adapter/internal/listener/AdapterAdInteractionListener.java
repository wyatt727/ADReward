package com.json.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: classes4.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
