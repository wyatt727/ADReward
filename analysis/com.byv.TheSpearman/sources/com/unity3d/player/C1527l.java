package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1527l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4401a;
    private final AudioManager b;
    private C1525j c;

    public C1527l(Context context) {
        this.f4401a = context;
        this.b = (AudioManager) context.getSystemService("audio");
    }

    public void a() {
        if (this.c != null) {
            this.f4401a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public void a(int i, InterfaceC1526k interfaceC1526k) {
        this.c = new C1525j(this, new Handler(Looper.getMainLooper()), this.b, i, interfaceC1526k);
        this.f4401a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.c);
    }
}
