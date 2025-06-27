package com.unity3d.player;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1525j extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1526k f4400a;
    private final AudioManager b;
    private final int c;
    private int d;

    public C1525j(C1527l c1527l, Handler handler, AudioManager audioManager, int i, InterfaceC1526k interfaceC1526k) {
        super(handler);
        this.b = audioManager;
        this.c = i;
        this.f4400a = interfaceC1526k;
        this.d = audioManager.getStreamVolume(i);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.b;
        if (audioManager == null || this.f4400a == null || (streamVolume = audioManager.getStreamVolume(this.c)) == this.d) {
            return;
        }
        this.d = streamVolume;
        ((AudioVolumeHandler) this.f4400a).onAudioVolumeChanged(streamVolume);
    }
}
