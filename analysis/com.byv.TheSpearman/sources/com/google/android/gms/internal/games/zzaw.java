package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzaw extends zzbe<Bundle> {
    zzaw(zzaq zzaqVar) {
    }

    @Override // com.google.android.gms.internal.games.zzbe
    protected final void zzb(com.google.android.gms.games.internal.zzf zzfVar, TaskCompletionSource<Bundle> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(zzfVar.zzah());
    }
}
