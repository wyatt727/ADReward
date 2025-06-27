package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public class AccountTransferClient extends GoogleApi<zzn> {
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> zzaj;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> zzak;
    private static final Api<zzn> zzal;

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class zzb<T> extends TaskApiCall<com.google.android.gms.internal.auth.zzu, T> {
        private TaskCompletionSource<T> zzaw;

        private zzb() {
        }

        protected abstract void zza(zzz zzzVar) throws RemoteException;

        protected final void setResult(T t) {
            this.zzaw.setResult(t);
        }

        protected final void zza(Status status) {
            AccountTransferClient.zza(this.zzaw, status);
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        protected /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zzaw = taskCompletionSource;
            zza((zzz) ((com.google.android.gms.internal.auth.zzu) anyClient).getService());
        }

        /* synthetic */ zzb(com.google.android.gms.auth.api.accounttransfer.zzc zzcVar) {
            this();
        }
    }

    AccountTransferClient(Context context) {
        super(context, zzal, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class zzc extends zzb<Void> {
        zzy zzax;

        private zzc() {
            super(null);
            this.zzax = new zzk(this);
        }

        /* synthetic */ zzc(com.google.android.gms.auth.api.accounttransfer.zzc zzcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zza<T> extends com.google.android.gms.internal.auth.zzs {
        private zzb<T> zzav;

        public zza(zzb<T> zzbVar) {
            this.zzav = zzbVar;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(Status status) {
            this.zzav.zza(status);
        }
    }

    AccountTransferClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions>) zzal, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new zzd(this, new zzaf(str, bArr)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zze(this, new zzad(str)));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zzg(this, new com.google.android.gms.internal.auth.zzv(str)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new zzi(this, new zzah(str, pendingIntent)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new zzj(this, new zzab(str, i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        zzaj = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zzc zzcVar = new com.google.android.gms.auth.api.accounttransfer.zzc();
        zzak = zzcVar;
        zzal = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzcVar, clientKey);
    }
}
