package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeRender.java */
/* loaded from: classes2.dex */
public class nWX extends com.bytedance.sdk.component.adexpress.mZx.EYQ<BackupView> {
    AtomicBoolean EYQ = new AtomicBoolean(false);
    private final com.bytedance.sdk.component.adexpress.mZx.pi IPb;
    private com.bytedance.sdk.component.adexpress.mZx.VwS Kbd;
    private com.bytedance.sdk.component.adexpress.mZx.Td Pm;
    private final View Td;
    private BackupView mZx;

    public nWX(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.mZx.pi piVar) {
        this.Td = view;
        this.IPb = piVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.VwS vwS) {
        this.Kbd = vwS;
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.nWX.1
            @Override // java.lang.Runnable
            public void run() {
                nWX.this.mZx();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx() {
        if (this.EYQ.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.mZx.Td td = this.Pm;
        boolean z = false;
        if (td != null && td.EYQ((NativeExpressView) this.Td, 0)) {
            z = true;
        }
        if (!z) {
            this.Kbd.EYQ(107, "backup false");
            return;
        }
        this.IPb.Kbd().VwS();
        BackupView backupView = (BackupView) this.Td.findViewWithTag("tt_express_backup_fl_tag_26");
        this.mZx = backupView;
        if (backupView != null) {
            com.bytedance.sdk.component.adexpress.mZx.nWX nwx = new com.bytedance.sdk.component.adexpress.mZx.nWX();
            BackupView backupView2 = this.mZx;
            float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
            BackupView backupView3 = this.mZx;
            float realHeight = backupView3 != null ? backupView3.getRealHeight() : 0.0f;
            nwx.EYQ(true);
            nwx.EYQ(realWidth);
            nwx.mZx(realHeight);
            this.Kbd.EYQ(this.mZx, nwx);
            return;
        }
        this.Kbd.EYQ(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public BackupView Kbd() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.EYQ
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.Td td) {
        this.Pm = td;
    }
}
