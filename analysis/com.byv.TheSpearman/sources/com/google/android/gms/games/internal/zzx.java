package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzx implements BaseImplementation.ResultHolder<Status> {
    private final /* synthetic */ BaseGmsClient.SignOutCallbacks zzdu;

    zzx(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        this.zzdu = signOutCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zzdu.onSignOutComplete();
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        this.zzdu.onSignOutComplete();
    }
}
