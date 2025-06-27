package com.json.unity.androidbridge;

/* loaded from: classes4.dex */
interface UnityOfferwallListener {
    void onGetOfferwallCreditsFailed(String err);

    void onOfferwallAdCredited(String Placement);

    void onOfferwallAvailable(String isAvailable);

    void onOfferwallClosed();

    void onOfferwallOpened();

    void onOfferwallShowFailed(String err);
}
