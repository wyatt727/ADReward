package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* loaded from: classes4.dex */
public class MBCommonActivity extends DomainMBCommonActivity {
    private boolean b = false;

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.b) {
            return;
        }
        if (this.browserView != null) {
            this.browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f3019a.remove(this.f2486a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.browserView != null) {
            this.browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f3019a.remove(this.f2486a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
        this.b = true;
        super.finish();
    }

    public void testfun() {
        ad.b("ASDFA", "DSFASDFADSFADSFADS");
    }
}
