package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzcc implements RemoteCall {
    static final RemoteCall zza = new zzcc();

    private zzcc() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        int i = zzcn.zza;
        ((zzbf) obj).zzu();
        ((TaskCompletionSource) obj2).setResult(true);
    }
}
