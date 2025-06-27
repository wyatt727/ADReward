package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey zaa;

    protected UnregisterListenerMethod(ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    protected abstract void unregisterListener(A a2, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
