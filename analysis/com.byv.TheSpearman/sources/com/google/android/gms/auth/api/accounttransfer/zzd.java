package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

/* loaded from: classes2.dex */
final class zzd extends AccountTransferClient.zzc {
    private final /* synthetic */ zzaf zzao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(AccountTransferClient accountTransferClient, zzaf zzafVar) {
        super(null);
        this.zzao = zzafVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.zzax, this.zzao);
    }
}
