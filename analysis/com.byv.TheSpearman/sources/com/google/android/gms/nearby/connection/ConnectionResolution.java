package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class ConnectionResolution {
    private final Status zza;

    @Deprecated
    public ConnectionResolution(Status status) {
        this.zza = status;
    }

    public Status getStatus() {
        return this.zza;
    }
}
