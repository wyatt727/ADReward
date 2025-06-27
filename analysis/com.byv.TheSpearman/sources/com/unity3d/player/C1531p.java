package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;

/* renamed from: com.unity3d.player.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1531p implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1534s f4405a;

    C1531p(C1534s c1534s) {
        this.f4405a = c1534s;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        if (C1534s.D.tryAcquire()) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage != null) {
                Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.f4405a.f4408a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC1536u.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.f4405a.p;
                if (image != null) {
                    image.close();
                }
                this.f4405a.p = imageAcquireNextImage;
            }
            C1534s.D.release();
        }
    }
}
