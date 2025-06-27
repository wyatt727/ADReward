package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzep implements RemoteCall {
    static final RemoteCall zzev = new zzep();

    private zzep() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        ((TaskCompletionSource) obj2).setResult(Boolean.valueOf(((com.google.android.gms.games.internal.zzf) obj).zzaz()));
    }
}
