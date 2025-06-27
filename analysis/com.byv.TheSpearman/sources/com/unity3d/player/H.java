package com.unity3d.player;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceHolder;

/* loaded from: classes4.dex */
class H implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f4335a;

    H(I i) {
        this.f4335a = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f4335a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.f4335a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f4335a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        I i = this.f4335a;
        w wVar = i.c;
        UnityPlayer unityPlayer = i.b;
        v vVar = wVar.b;
        if (vVar == null || vVar.getParent() != null) {
            return;
        }
        unityPlayer.addView(wVar.b);
        unityPlayer.bringChildToFront(wVar.b);
        unityPlayer.bringToFront();
        unityPlayer.forceLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        I i = this.f4335a;
        w wVar = i.c;
        C1516a c1516a = i.f4339a;
        wVar.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT) {
            if (wVar.b == null) {
                wVar.b = new v(wVar, wVar.f4411a);
            }
            v vVar = wVar.b;
            vVar.getClass();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1516a.getWidth(), c1516a.getHeight(), Bitmap.Config.ARGB_8888);
            vVar.f4410a = bitmapCreateBitmap;
            PixelCopy.request(c1516a, bitmapCreateBitmap, vVar, new Handler(Looper.getMainLooper()));
        }
        this.f4335a.b.updateGLDisplay(0, null);
    }
}
