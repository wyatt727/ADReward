package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzco extends TaskApiCall<zzaw, DriveFolder> {
    zzco(zzch zzchVar) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<DriveFolder> taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) anyClient;
        if (zzawVar.zzaf() == null) {
            taskCompletionSource.setException(new ApiException(new Status(10, "Drive#SCOPE_APPFOLDER must be requested")));
        } else {
            taskCompletionSource.setResult(new zzbs(zzawVar.zzaf()));
        }
    }
}
