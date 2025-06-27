package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class n1 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f705a;
    private final a b;
    private b c;
    private k1 d;
    private int f;
    private AudioFocusRequest h;
    private boolean i;
    private float g = 1.0f;
    private int e = 0;

    public interface b {
        void b(float f);

        void f(int i);
    }

    public n1(Context context, Handler handler, b bVar) {
        this.f705a = (AudioManager) a1.a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = bVar;
        this.b = new a(handler);
    }

    public float d() {
        return this.g;
    }

    public void e() {
        this.c = null;
        b();
    }

    private int f() {
        if (this.e == 1) {
            return 1;
        }
        if ((yp.f1214a >= 26 ? h() : g()) == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    private void b() {
        if (this.e == 0) {
            return;
        }
        if (yp.f1214a >= 26) {
            c();
        } else {
            a();
        }
        c(0);
    }

    private int g() {
        return this.f705a.requestAudioFocus(this.b, yp.e(((k1) a1.a(this.d)).c), this.f);
    }

    private int h() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f);
            } else {
                builder = new AudioFocusRequest.Builder(this.h);
            }
            this.h = builder.setAudioAttributes(((k1) a1.a(this.d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.f705a.requestAudioFocus(this.h);
    }

    private void a() {
        this.f705a.abandonAudioFocus(this.b);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.f705a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean i() {
        k1 k1Var = this.d;
        return k1Var != null && k1Var.f582a == 1;
    }

    private boolean d(int i) {
        return i == 1 || this.f != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f706a;

        public a(Handler handler) {
            this.f706a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            n1.this.b(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f706a.post(new Runnable() { // from class: com.applovin.impl.n1$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(i);
                }
            });
        }
    }

    private static int a(k1 k1Var) {
        if (k1Var == null) {
            return 0;
        }
        switch (k1Var.c) {
            case 0:
                kc.d("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (k1Var.f582a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                kc.d("AudioFocusManager", "Unidentified audio usage: " + k1Var.c);
                return 0;
            case 16:
                return yp.f1214a >= 19 ? 4 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !i()) {
                c(3);
                return;
            } else {
                a(0);
                c(2);
                return;
            }
        }
        if (i == -1) {
            a(-1);
            b();
        } else {
            if (i != 1) {
                kc.d("AudioFocusManager", "Unknown focus change type: " + i);
                return;
            }
            c(1);
            a(1);
        }
    }

    private void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(f);
        }
    }

    public void b(k1 k1Var) {
        if (yp.a(this.d, k1Var)) {
            return;
        }
        this.d = k1Var;
        int iA = a(k1Var);
        this.f = iA;
        boolean z = true;
        if (iA != 1 && iA != 0) {
            z = false;
        }
        a1.a(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    private void a(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.f(i);
        }
    }

    public int a(boolean z, int i) {
        if (d(i)) {
            b();
            return z ? 1 : -1;
        }
        if (z) {
            return f();
        }
        return -1;
    }
}
