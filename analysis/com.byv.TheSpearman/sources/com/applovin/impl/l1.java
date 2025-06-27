package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f613a;
    private final a b;
    private boolean c;

    public interface b {
        void c();
    }

    public l1(Context context, Handler handler, b bVar) {
        this.f613a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f614a;
        private final Handler b;

        public a(Handler handler, b bVar) {
            this.b = handler;
            this.f614a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l1.this.c) {
                this.f614a.c();
            }
        }
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.f613a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.f613a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
