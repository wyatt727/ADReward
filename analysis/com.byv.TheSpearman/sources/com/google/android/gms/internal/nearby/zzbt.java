package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzbt implements RemoteCall {
    static final RemoteCall zza = new zzbt();

    private zzbt() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i = zzcn.zza;
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
