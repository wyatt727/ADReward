package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes3.dex */
final class zbaj extends Api.AbstractClientBuilder<zbw, zbc> {
    zbaj() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, zbc zbcVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zbw(context, looper, zbcVar, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
