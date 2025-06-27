package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> zzaj;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> zzak;
    private static final Api<zzn> zzal;

    @Deprecated
    private static final zzb zzam;
    private static final zzq zzan;

    public static AccountTransferClient getAccountTransferClient(Activity activity) {
        return new AccountTransferClient(activity);
    }

    public static AccountTransferClient getAccountTransferClient(Context context) {
        return new AccountTransferClient(context);
    }

    private AccountTransfer() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.auth.api.accounttransfer.zzb, com.google.android.gms.internal.auth.zzt] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.auth.api.accounttransfer.zzq, com.google.android.gms.internal.auth.zzt] */
    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        zzaj = clientKey;
        zza zzaVar = new zza();
        zzak = zzaVar;
        zzal = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        zzam = new com.google.android.gms.internal.auth.zzt();
        zzan = new com.google.android.gms.internal.auth.zzt();
    }
}
