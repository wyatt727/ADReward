package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class zad extends zaa {
    private final BaseImplementation.ResultHolder zaa;

    public zad(BaseImplementation.ResultHolder resultHolder) {
        this.zaa = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) throws RemoteException {
        this.zaa.setResult(new Status(i));
    }
}
