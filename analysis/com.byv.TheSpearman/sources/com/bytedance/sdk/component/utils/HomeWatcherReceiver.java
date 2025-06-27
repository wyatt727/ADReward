package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes2.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private EYQ EYQ;

    public interface EYQ {
        void EYQ();

        void mZx();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: ".concat(String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: ".concat(String.valueOf(stringExtra)));
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    EYQ eyq = this.EYQ;
                    if (eyq != null) {
                        eyq.EYQ();
                        return;
                    }
                    return;
                }
                if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    EYQ eyq2 = this.EYQ;
                    if (eyq2 != null) {
                        eyq2.mZx();
                        return;
                    }
                    return;
                }
                if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            pi.EYQ("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }

    public void EYQ(EYQ eyq) {
        this.EYQ = eyq;
    }
}
