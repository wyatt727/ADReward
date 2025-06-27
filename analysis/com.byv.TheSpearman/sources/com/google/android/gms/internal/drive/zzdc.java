package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzdc extends TaskApiCall<zzaw, Metadata> {
    private final /* synthetic */ DriveResource zzfq;
    private final /* synthetic */ boolean zzga = false;

    zzdc(zzch zzchVar, DriveResource driveResource, boolean z) {
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<Metadata> taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) anyClient).getService()).zza(new zzek(this.zzfq.getDriveId(), this.zzga), new zzhp(taskCompletionSource));
    }
}
