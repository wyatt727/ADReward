package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1520e implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    private IAssetPackManagerMobileDataConfirmationCallback f4395a;
    private Looper b = Looper.myLooper();

    public C1520e(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f4395a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        if (this.f4395a != null) {
            new Handler(this.b).post(new RunnableC1519d(this.f4395a, num.intValue() == -1));
        }
    }
}
