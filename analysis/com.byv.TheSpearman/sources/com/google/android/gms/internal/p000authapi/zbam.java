package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes3.dex */
public final class zbam extends GoogleApi<zbc> implements CredentialSavingClient {
    private static final Api.ClientKey<zbw> zba;
    private static final Api.AbstractClientBuilder<zbw, zbc> zbb;
    private static final Api<zbc> zbc;
    private final String zbd;

    static {
        Api.ClientKey<zbw> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        zbaj zbajVar = new zbaj();
        zbb = zbajVar;
        zbc = new Api<>("Auth.Api.Identity.CredentialSaving.API", zbajVar, clientKey);
    }

    public zbam(Activity activity, zbc zbcVar) {
        super(activity, zbc, zbcVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = zbax.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        SaveAccountLinkingTokenRequest.Builder builderZba = SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        builderZba.zba(this.zbd);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestBuild = builderZba.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbg).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbam zbamVar = this.zba;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = saveAccountLinkingTokenRequestBuild;
                ((zbz) ((zbw) obj).getService()).zbc(new zbak(zbamVar, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.Builder builderZba = SavePasswordRequest.zba(savePasswordRequest);
        builderZba.zba(this.zbd);
        final SavePasswordRequest savePasswordRequestBuild = builderZba.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbe).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbam zbamVar = this.zba;
                SavePasswordRequest savePasswordRequest2 = savePasswordRequestBuild;
                ((zbz) ((zbw) obj).getService()).zbd(new zbal(zbamVar, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbam(Context context, zbc zbcVar) {
        super(context, zbc, zbcVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = zbax.zba();
    }
}
