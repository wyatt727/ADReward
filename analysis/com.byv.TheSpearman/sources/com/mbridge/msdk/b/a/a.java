package com.mbridge.msdk.b.a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* compiled from: PreloadListenerEx.java */
/* loaded from: classes4.dex */
public final class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f2492a;
    private int b = 0;
    private boolean c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f2492a = new WeakReference<>(preloadListener);
        }
    }

    public final boolean a() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f2492a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2492a.get().onPreloadSucceed();
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f2492a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2492a.get().onPreloadFaild(str);
    }
}
