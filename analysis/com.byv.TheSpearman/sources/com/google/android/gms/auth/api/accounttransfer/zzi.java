package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzz;

/* loaded from: classes2.dex */
final class zzi extends AccountTransferClient.zzc {
    private final /* synthetic */ zzah zzat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(AccountTransferClient accountTransferClient, zzah zzahVar) {
        super(null);
        this.zzat = zzahVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.zzax, this.zzat);
    }
}
