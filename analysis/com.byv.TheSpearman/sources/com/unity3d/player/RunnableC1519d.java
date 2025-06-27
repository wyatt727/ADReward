package com.unity3d.player;

/* renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC1519d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private IAssetPackManagerMobileDataConfirmationCallback f4394a;
    private boolean b;

    RunnableC1519d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.f4394a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4394a.onMobileDataConfirmationResult(this.b);
    }
}
