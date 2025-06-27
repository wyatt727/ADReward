package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* loaded from: classes2.dex */
public class ActServiceConnection extends CustomTabsServiceConnection {
    private mZx mConnectionCallback;

    public ActServiceConnection(mZx mzx) {
        this.mConnectionCallback = mzx;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        mZx mzx = this.mConnectionCallback;
        if (mzx != null) {
            mzx.EYQ(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        mZx mzx = this.mConnectionCallback;
        if (mzx != null) {
            mzx.EYQ();
        }
    }
}
