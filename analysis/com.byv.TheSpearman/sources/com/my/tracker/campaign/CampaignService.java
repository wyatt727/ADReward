package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.g;
import com.my.tracker.obfuscated.w;
import com.my.tracker.obfuscated.z0;

/* loaded from: classes4.dex */
public final class CampaignService extends Service {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        w.a(str, this, runnable);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        z0.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        z0.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        final Runnable runnable = new Runnable() { // from class: com.my.tracker.campaign.CampaignService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.stopSelf();
            }
        };
        if (intent != null) {
            final String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                g.a(new Runnable() { // from class: com.my.tracker.campaign.CampaignService$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(stringExtra, runnable);
                    }
                });
                return super.onStartCommand(null, i, i2);
            }
        }
        g.a(runnable);
        return 2;
    }
}
