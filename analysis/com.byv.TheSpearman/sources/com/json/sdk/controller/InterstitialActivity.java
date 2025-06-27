package com.json.sdk.controller;

import android.os.Bundle;
import com.json.sdk.utils.Logger;
import com.json.t2;

/* loaded from: classes4.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String r = "InterstitialActivity";

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(r, "onCreate");
    }

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(r, t2.h.t0);
    }

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(r, t2.h.u0);
    }
}
