package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.my.target.common.models.VideoData;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.k7;
import com.my.target.o7;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;

/* loaded from: classes4.dex */
public final class u2 implements InstreamAdPlayer.AdPlayerListener {
    public qa d;
    public k7 e;
    public InstreamAdPlayer f;
    public a g;
    public b5<VideoData> h;
    public int m;
    public float n;
    public int i = 0;
    public int j = 10;
    public float k = 1.0f;
    public float l = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final q8 f4141a = q8.a(200);
    public final o7 b = o7.b();
    public final Runnable c = new Runnable() { // from class: com.my.target.u2$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.a();
        }
    };

    public interface a {
        void a(float f, float f2, b5 b5Var);

        void a(b5 b5Var);

        void a(String str, b5 b5Var);

        void b(b5 b5Var);

        void c(b5 b5Var);

        void d(b5 b5Var);

        void e(b5 b5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        InstreamAdPlayer instreamAdPlayer;
        k7 k7Var = this.e;
        if (k7Var == null || (instreamAdPlayer = this.f) == null) {
            return;
        }
        k7Var.a(instreamAdPlayer.getView(), new k7.b[0]);
        this.e.c();
    }

    public static u2 i() {
        return new u2();
    }

    public void a() {
        float adVideoDuration;
        float adVideoPosition;
        float f;
        InstreamAdPlayer instreamAdPlayer;
        b5<VideoData> b5Var = this.h;
        if (b5Var == null) {
            this.f4141a.b(this.c);
            return;
        }
        float duration = b5Var.getDuration();
        boolean z = this.i == 2;
        if (!z || (instreamAdPlayer = this.f) == null) {
            adVideoDuration = 0.0f;
            adVideoPosition = 0.0f;
            f = 0.0f;
        } else {
            adVideoDuration = instreamAdPlayer.getAdVideoDuration();
            adVideoPosition = this.f.getAdVideoPosition();
            f = duration - adVideoPosition;
        }
        if (!z || this.n == adVideoPosition || adVideoDuration <= 0.0f) {
            this.m++;
        } else {
            a(f, adVideoPosition, duration);
        }
        if (this.m >= (this.j * 1000) / 200) {
            g();
        }
    }

    public void a(float f) {
        if (a(4)) {
            this.b.a(f, f);
            this.n = f;
            this.f4141a.b(this.c);
            qa qaVar = this.d;
            if (qaVar != null) {
                qaVar.a(f, f);
            }
            b5<VideoData> b5VarB = b();
            if (b5VarB == null) {
                return;
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(0.0f, f, b5VarB);
            }
            a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.b(b5VarB);
            }
        }
    }

    public void a(float f, float f2, float f3) {
        b5<VideoData> b5Var;
        this.m = 0;
        this.n = f2;
        if (f2 >= f3) {
            a(f3);
            return;
        }
        this.b.a(f2, f3);
        qa qaVar = this.d;
        if (qaVar != null) {
            qaVar.a(f2, f3);
        }
        a aVar = this.g;
        if (aVar == null || (b5Var = this.h) == null) {
            return;
        }
        aVar.a(f, f3, b5Var);
    }

    public void a(b5<VideoData> b5Var) {
        a(b5Var, false);
    }

    public void a(b5<VideoData> b5Var, boolean z) {
        InstreamAdPlayer instreamAdPlayer;
        if (a(1)) {
            this.n = 0.0f;
            this.h = b5Var;
            this.b.a(b5Var);
            this.d = qa.a(b5Var.getStatHolder());
            k7 k7Var = this.e;
            if (k7Var != null) {
                k7Var.a();
            }
            InstreamAdPlayer instreamAdPlayer2 = this.f;
            if (instreamAdPlayer2 != null) {
                View view = instreamAdPlayer2.getView();
                this.d.a(view);
                if (!z) {
                    this.e = k7.a(b5Var, 3, this.h, view.getContext());
                }
            }
            this.b.a(this.e);
            this.b.a(new o7.a() { // from class: com.my.target.u2$$ExternalSyntheticLambda0
                @Override // com.my.target.o7.a
                public final void a() {
                    this.f$0.h();
                }
            });
            VideoData videoData = (VideoData) b5Var.getMediaData();
            if (videoData == null || (instreamAdPlayer = this.f) == null) {
                return;
            }
            instreamAdPlayer.setVolume(this.k);
            this.f.playAdVideo(Uri.parse(videoData.getUrl()), videoData.getWidth(), videoData.getHeight());
        }
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.f;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
        }
        this.f = instreamAdPlayer;
        if (instreamAdPlayer == null) {
            qa qaVar = this.d;
            if (qaVar != null) {
                qaVar.a((View) null);
            }
            this.b.a((Context) null);
            return;
        }
        View view = instreamAdPlayer.getView();
        qa qaVar2 = this.d;
        if (qaVar2 != null) {
            qaVar2.a(view);
        }
        instreamAdPlayer.setAdPlayerListener(this);
        this.b.a(view.getContext());
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.a(instreamAdPlayer.getView());
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r6) {
        /*
            r5 = this;
            int r0 = r5.i
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L25
            r3 = 3
            r4 = 2
            switch(r6) {
                case 0: goto L25;
                case 1: goto L24;
                case 2: goto L20;
                case 3: goto L1b;
                case 4: goto L13;
                case 5: goto Lc;
                case 6: goto L24;
                default: goto Lb;
            }
        Lb:
            goto L25
        Lc:
            if (r0 == r2) goto L24
            if (r0 == r4) goto L24
            if (r0 != r3) goto L25
            goto L24
        L13:
            if (r0 == r2) goto L24
            if (r0 == r4) goto L24
            r3 = 5
            if (r0 != r3) goto L25
            goto L24
        L1b:
            if (r0 == r2) goto L24
            if (r0 != r4) goto L25
            goto L24
        L20:
            if (r0 == r2) goto L24
            if (r0 != r3) goto L25
        L24:
            r1 = r2
        L25:
            java.lang.String r0 = " to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r1 == 0) goto L48
            r2.<init>()
            java.lang.String r3 = "InstreamAdVideoController: state has been changed from "
            r2.append(r3)
            int r3 = r5.i
            r2.append(r3)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.my.target.ba.a(r0)
            r5.i = r6
            goto L62
        L48:
            r2.<init>()
            java.lang.String r3 = "InstreamAdVideoController: wrong state transition from "
            r2.append(r3)
            int r3 = r5.i
            r2.append(r3)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.my.target.ba.a(r6)
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.u2.a(int):boolean");
    }

    public b5<VideoData> b() {
        b5<VideoData> b5Var = this.h;
        this.h = null;
        qa qaVar = this.d;
        if (qaVar != null) {
            qaVar.a();
            this.d = null;
        }
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.a();
        }
        return b5Var;
    }

    public void b(float f) {
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f);
        }
        this.k = f;
    }

    public void b(int i) {
        this.j = i;
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        VideoData videoData;
        InstreamAdPlayer instreamAdPlayer2 = this.f;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
            this.f.stopAdVideo();
        }
        this.f = instreamAdPlayer;
        qa qaVar = this.d;
        if (instreamAdPlayer != null) {
            if (qaVar != null) {
                qaVar.a(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this);
            this.b.a(instreamAdPlayer.getView().getContext());
            k7 k7Var = this.e;
            if (k7Var != null) {
                k7Var.a(instreamAdPlayer.getView());
            }
        } else {
            if (qaVar != null) {
                qaVar.a((View) null);
            }
            this.b.a((Context) null);
        }
        b5<VideoData> b5Var = this.h;
        if (b5Var == null || (videoData = (VideoData) b5Var.getMediaData()) == null || instreamAdPlayer == null) {
            return;
        }
        Uri uri = Uri.parse(videoData.getUrl());
        instreamAdPlayer.setVolume(this.k);
        instreamAdPlayer.playAdVideo(uri, videoData.getWidth(), videoData.getHeight(), this.n);
    }

    public void c() {
        this.f4141a.close();
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
            this.f = null;
        }
        b();
    }

    public Context d() {
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    public InstreamAdPlayer e() {
        return this.f;
    }

    public float f() {
        return this.k;
    }

    public void g() {
        b5<VideoData> b5Var;
        ba.a("InstreamAdVideoController: Video freeze more then " + this.j + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.f4141a.b(this.c);
        this.b.g();
        a aVar = this.g;
        if (aVar != null && (b5Var = this.h) != null) {
            aVar.a(InitializeAndroidBoldSDK.MSG_TIMEOUT, b5Var);
        }
        b();
    }

    public void j() {
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    public void k() {
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    public void l() {
        InstreamAdPlayer instreamAdPlayer = this.f;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        onAdVideoStopped();
    }

    public void m() {
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.a(2);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoCompleted() {
        if (a(4)) {
            a();
            this.f4141a.b(this.c);
            b5<VideoData> b5VarB = b();
            if (b5VarB != null) {
                float duration = b5VarB.getDuration();
                this.b.a(duration, duration);
                a aVar = this.g;
                if (aVar != null) {
                    aVar.b(b5VarB);
                }
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoError(String str) {
        a aVar;
        if (a(6)) {
            InstreamAdPlayer instreamAdPlayer = this.f;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            this.b.f();
            this.f4141a.b(this.c);
            b5<VideoData> b5VarB = b();
            if (b5VarB == null || (aVar = this.g) == null) {
                return;
            }
            aVar.a(str, b5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoPaused() {
        a aVar;
        if (a(3)) {
            this.b.e();
            this.f4141a.b(this.c);
            b5<VideoData> b5Var = this.h;
            if (b5Var == null || (aVar = this.g) == null) {
                return;
            }
            aVar.c(b5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoResumed() {
        a aVar;
        if (a(2)) {
            this.b.h();
            this.f4141a.a(this.c);
            b5<VideoData> b5Var = this.h;
            if (b5Var == null || (aVar = this.g) == null) {
                return;
            }
            aVar.a(b5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStarted() {
        if (a(2)) {
            this.f4141a.a(this.c);
            b5<VideoData> b5Var = this.h;
            if (b5Var == null) {
                return;
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.d(b5Var);
            }
            InstreamAdPlayer instreamAdPlayer = this.f;
            if (instreamAdPlayer == null) {
                return;
            }
            float adVideoDuration = instreamAdPlayer.getAdVideoDuration();
            this.b.a(0.0f, adVideoDuration);
            a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.a(adVideoDuration, adVideoDuration, this.h);
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStopped() {
        a aVar;
        if (a(5)) {
            this.b.i();
            this.f4141a.b(this.c);
            b5<VideoData> b5VarB = b();
            if (b5VarB == null || (aVar = this.g) == null) {
                return;
            }
            aVar.e(b5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onVolumeChanged(float f) {
        this.b.b(this.l, f);
        this.l = f;
    }
}
