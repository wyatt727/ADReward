package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzz;

/* loaded from: classes2.dex */
final class zzj extends AccountTransferClient.zzc {
    private final /* synthetic */ zzab zzau;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(AccountTransferClient accountTransferClient, zzab zzabVar) {
        super(null);
        this.zzau = zzabVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.zzax, this.zzau);
    }
}
