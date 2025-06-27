package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<EYQ> EYQ;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<EYQ> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().EYQ(intExtra);
    }

    public void EYQ(EYQ eyq) {
        this.EYQ = new WeakReference<>(eyq);
    }
}
