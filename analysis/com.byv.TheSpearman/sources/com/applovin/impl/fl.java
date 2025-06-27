package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class fl {

    /* renamed from: a, reason: collision with root package name */
    private final Context f436a;
    private final Handler b;
    private final b c;
    private final AudioManager d;
    private c e;
    private int f;
    private int g;
    private boolean h;

    public interface b {
        void a(int i, boolean z);

        void d(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(fl flVar) {
        flVar.d();
    }

    public fl(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f436a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) a1.b((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        this.h = a(audioManager, this.f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            kc.c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public int a() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public void c() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.f436a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                kc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iB = b(this.d, this.f);
        boolean zA = a(this.d, this.f);
        if (this.g == iB && this.h == zA) {
            return;
        }
        this.g = iB;
        this.h = zA;
        this.c.a(iB, zA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = fl.this.b;
            final fl flVar = fl.this;
            handler.post(new Runnable() { // from class: com.applovin.impl.fl$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    fl.b(flVar);
                }
            });
        }
    }

    private static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            kc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public void a(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        d();
        this.c.d(i);
    }

    public int b() {
        if (yp.f1214a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    private static boolean a(AudioManager audioManager, int i) {
        if (yp.f1214a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return b(audioManager, i) == 0;
    }
}
