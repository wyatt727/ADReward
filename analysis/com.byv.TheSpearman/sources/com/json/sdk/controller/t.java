package com.json.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.json.o6;

/* loaded from: classes4.dex */
class t {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f2219a;

        a(AudioManager audioManager) {
            this.f2219a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f2219a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f2220a;

        b(AudioManager audioManager) {
            this.f2220a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.d(this.f2220a);
        }
    }

    t() {
    }

    public static void a(Activity activity) {
        o6.f2043a.a(new a((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Activity activity) {
        o6.f2043a.a(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
