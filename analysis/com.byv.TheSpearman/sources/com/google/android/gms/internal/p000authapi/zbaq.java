package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes3.dex */
final class zbaq extends Api.AbstractClientBuilder<zbav, zbl> {
    zbaq() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, zbl zblVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zbav(context, looper, zblVar, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
