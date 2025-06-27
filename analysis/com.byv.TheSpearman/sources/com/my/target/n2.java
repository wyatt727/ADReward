package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.my.target.common.models.AudioData;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import java.util.Stack;

/* loaded from: classes4.dex */
public class n2 {
    public InstreamAudioAdPlayer g;
    public b h;
    public b5<AudioData> i;
    public int j;
    public float k;
    public boolean m;
    public float f = 1.0f;
    public int l = 10;
    public int n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f4065a = new a();
    public final q8 b = q8.a(200);
    public final c c = new c();
    public final Stack<t7> d = new Stack<>();
    public final o7 e = o7.b();

    public class a implements InstreamAudioAdPlayer.AdPlayerListener {

        /* renamed from: a, reason: collision with root package name */
        public float f4066a = 1.0f;

        public a() {
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioCompleted() {
            n2 n2Var = n2.this;
            if (n2Var.n != 2) {
                if (n2Var.i != null && n2Var.h != null) {
                    n2Var.a();
                    n2 n2Var2 = n2.this;
                    b5<AudioData> b5Var = n2Var2.i;
                    n2Var2.i = null;
                    if (b5Var != null) {
                        float duration = b5Var.getDuration();
                        n2.this.e.a(duration, duration);
                        n2.this.h.b(b5Var);
                    }
                }
                n2.this.n = 2;
            }
            n2 n2Var3 = n2.this;
            n2Var3.b.b(n2Var3.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioError(String str) {
            b bVar;
            InstreamAudioAdPlayer instreamAudioAdPlayer = n2.this.g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            n2 n2Var = n2.this;
            b5<AudioData> b5Var = n2Var.i;
            if (b5Var != null && (bVar = n2Var.h) != null) {
                bVar.a(str, b5Var);
            }
            n2.this.e.f();
            n2 n2Var2 = n2.this;
            n2Var2.b.b(n2Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioPaused() {
            Context contextD = n2.this.d();
            n2 n2Var = n2.this;
            if (n2Var.i != null && contextD != null) {
                n2Var.e.e();
            }
            n2 n2Var2 = n2.this;
            n2Var2.b.b(n2Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioResumed() {
            Context contextD = n2.this.d();
            n2 n2Var = n2.this;
            if (n2Var.i != null && contextD != null) {
                n2Var.e.h();
            }
            n2 n2Var2 = n2.this;
            n2Var2.b.a(n2Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStarted() {
            InstreamAudioAdPlayer instreamAudioAdPlayer;
            n2 n2Var = n2.this;
            n2Var.n = 1;
            if (!n2Var.m && (instreamAudioAdPlayer = n2Var.g) != null) {
                n2Var.b(instreamAudioAdPlayer.getAdAudioDuration());
            }
            n2 n2Var2 = n2.this;
            n2Var2.b.a(n2Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStopped() {
            n2 n2Var = n2.this;
            if (n2Var.n == 1) {
                if (n2Var.i != null && n2Var.h != null) {
                    n2Var.e.i();
                    n2 n2Var2 = n2.this;
                    n2Var2.h.c(n2Var2.i);
                }
                n2.this.n = 0;
            }
            n2 n2Var3 = n2.this;
            n2Var3.b.b(n2Var3.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onVolumeChanged(float f) {
            o7 o7Var;
            boolean z;
            float f2 = this.f4066a;
            if (f == f2) {
                return;
            }
            if (f2 <= 0.0f || f > 0.0f) {
                if (f2 != 0.0f || f <= 0.0f || n2.this.d() == null) {
                    return;
                }
                n2 n2Var = n2.this;
                if (n2Var.i == null) {
                    return;
                }
                o7Var = n2Var.e;
                z = true;
            } else {
                if (n2.this.d() == null) {
                    return;
                }
                n2 n2Var2 = n2.this;
                if (n2Var2.i == null) {
                    return;
                }
                o7Var = n2Var2.e;
                z = false;
            }
            o7Var.b(z);
            this.f4066a = f;
            n2.this.f = f;
        }
    }

    public interface b {
        void a(float f, float f2, b5 b5Var);

        void a(b5 b5Var);

        void a(String str, b5 b5Var);

        void b(b5 b5Var);

        void c(b5 b5Var);
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n2.this.a();
        }
    }

    public static n2 h() {
        return new n2();
    }

    public void a() {
        float adAudioDuration;
        float adAudioPosition;
        float f;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        b5<AudioData> b5Var = this.i;
        float duration = b5Var != null ? b5Var.getDuration() : 0.0f;
        if (this.i == null) {
            this.b.b(this.c);
            return;
        }
        if (this.n != 1 || (instreamAudioAdPlayer = this.g) == null) {
            adAudioDuration = 0.0f;
            adAudioPosition = 0.0f;
            f = 0.0f;
        } else {
            adAudioDuration = instreamAudioAdPlayer.getAdAudioDuration();
            adAudioPosition = this.g.getAdAudioPosition();
            f = duration - adAudioPosition;
        }
        if (this.n != 1 || this.k == adAudioPosition || adAudioDuration <= 0.0f) {
            this.j++;
        } else {
            a(f, adAudioPosition, duration);
        }
        if (this.j >= (this.l * 1000) / 200) {
            g();
        }
    }

    public final void a(float f) {
        b5<AudioData> b5Var;
        this.e.a(f, f);
        b bVar = this.h;
        if (bVar != null && (b5Var = this.i) != null) {
            bVar.a(0.0f, f, b5Var);
        }
        b();
    }

    public final void a(float f, float f2, float f3) {
        b5<AudioData> b5Var;
        this.j = 0;
        this.k = f2;
        if (f2 >= f3) {
            a(f3);
            return;
        }
        this.e.a(f2, f3);
        b bVar = this.h;
        if (bVar == null || (b5Var = this.i) == null) {
            return;
        }
        bVar.a(f, f3, b5Var);
    }

    public void a(int i) {
        this.l = i;
    }

    public void a(b5<AudioData> b5Var) {
        this.i = b5Var;
        this.e.a(b5Var);
        this.m = false;
        b5Var.getStatHolder().b(this.d);
        AudioData audioData = (AudioData) b5Var.getMediaData();
        if (audioData == null) {
            return;
        }
        Uri uri = Uri.parse(audioData.getUrl());
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(this.f);
            this.g.playAdAudio(uri);
        }
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener(null);
        }
        this.g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer == null) {
            this.e.a((Context) null);
        } else {
            instreamAudioAdPlayer.setAdPlayerListener(this.f4065a);
            this.e.a(instreamAudioAdPlayer.getCurrentContext());
        }
    }

    public void a(b bVar) {
        this.h = bVar;
    }

    public final void b() {
        b bVar;
        this.b.b(this.c);
        if (this.n != 2) {
            this.n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            b5<AudioData> b5Var = this.i;
            if (b5Var == null || (bVar = this.h) == null) {
                return;
            }
            this.i = null;
            bVar.b(b5Var);
        }
    }

    public final void b(float f) {
        b5<AudioData> b5Var;
        b bVar;
        b5<AudioData> b5Var2 = this.i;
        if (b5Var2 != null && (bVar = this.h) != null) {
            bVar.a(b5Var2);
        }
        b bVar2 = this.h;
        if (bVar2 != null && (b5Var = this.i) != null) {
            bVar2.a(0.0f, f, b5Var);
        }
        this.e.a(0.0f, f);
        this.m = true;
    }

    public void c() {
        this.b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.g = null;
    }

    public void c(float f) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f);
        }
        this.f = f;
    }

    public Context d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    public InstreamAudioAdPlayer e() {
        return this.g;
    }

    public float f() {
        return this.f;
    }

    public final void g() {
        b5<AudioData> b5Var;
        ba.a("InstreamAdAudioController: Video freeze more then " + this.l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.b.b(this.c);
        this.e.g();
        b bVar = this.h;
        if (bVar == null || (b5Var = this.i) == null) {
            return;
        }
        bVar.a(InitializeAndroidBoldSDK.MSG_TIMEOUT, b5Var);
    }

    public void i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    public void j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    public void k() {
        if (this.n == 1) {
            if (this.i != null && this.h != null) {
                this.e.i();
                this.h.c(this.i);
            }
            this.n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }
}
