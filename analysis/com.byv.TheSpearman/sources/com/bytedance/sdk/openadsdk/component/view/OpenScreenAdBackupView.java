package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes2.dex */
public class OpenScreenAdBackupView extends BackupView {
    private NativeExpressView EYQ;

    public OpenScreenAdBackupView(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void EYQ(View view, int i, pi piVar) {
        NativeExpressView nativeExpressView = this.EYQ;
        if (nativeExpressView != null) {
            nativeExpressView.EYQ(view, i, piVar);
        }
    }

    public void EYQ(NativeExpressView nativeExpressView) {
        this.EYQ = nativeExpressView;
        nativeExpressView.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
