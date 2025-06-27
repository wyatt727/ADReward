package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1532q implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1534s f4406a;

    C1532q(C1534s c1534s) {
        this.f4406a = c1534s;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.f4406a.f4408a).a(surfaceTexture);
    }
}
