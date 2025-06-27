package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class zzbl implements ResultCallback<Status> {
    zzbl(zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(Result result) {
        Status status = (Status) result;
        if (status.isSuccess()) {
            return;
        }
        zzbi.zzbz.efmt("DriveContentsImpl", "Error discarding contents, status: %s", status);
    }
}
