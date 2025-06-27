package com.json.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
