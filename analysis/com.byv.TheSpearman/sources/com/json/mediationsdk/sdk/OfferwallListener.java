package com.json.mediationsdk.sdk;

import com.json.mediationsdk.logger.IronSourceError;

@Deprecated
/* loaded from: classes4.dex */
public interface OfferwallListener {
    @Deprecated
    void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    @Deprecated
    boolean onOfferwallAdCredited(int i, int i2, boolean z);

    @Deprecated
    void onOfferwallAvailable(boolean z);

    @Deprecated
    void onOfferwallClosed();

    @Deprecated
    void onOfferwallOpened();

    @Deprecated
    void onOfferwallShowFailed(IronSourceError ironSourceError);
}
