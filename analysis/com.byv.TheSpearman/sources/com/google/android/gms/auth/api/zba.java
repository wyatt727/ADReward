package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.p000authapi.zbo;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes2.dex */
final class zba extends Api.AbstractClientBuilder<zbo, Auth.AuthCredentialsOptions> {
    zba() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zbo(context, looper, clientSettings, authCredentialsOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
