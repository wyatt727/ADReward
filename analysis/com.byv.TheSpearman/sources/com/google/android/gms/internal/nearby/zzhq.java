package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhq extends com.google.android.gms.nearby.messages.internal.zzq {
    private final ListenerHolder<BaseImplementation.ResultHolder<Status>> zza;
    private boolean zzb = false;

    public zzhq(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzr
    public final synchronized void zzd(Status status) throws RemoteException {
        if (!this.zzb) {
            this.zza.notifyListener(new zzhp(this, status));
            this.zzb = true;
            return;
        }
        String strValueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb.append("Received multiple statuses: ");
        sb.append(strValueOf);
        Log.wtf("NearbyMessagesCallbackWrapper", sb.toString(), new Exception());
    }
}
