package com.unity3d.player;

import android.content.Context;

/* loaded from: classes4.dex */
public class AudioVolumeHandler implements InterfaceC1526k {

    /* renamed from: a, reason: collision with root package name */
    private C1527l f4327a;

    AudioVolumeHandler(Context context) {
        C1527l c1527l = new C1527l(context);
        this.f4327a = c1527l;
        c1527l.a(3, this);
    }

    public void a() {
        this.f4327a.a();
        this.f4327a = null;
    }

    public final native void onAudioVolumeChanged(int i);
}
