package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgu extends ContentObserver {
    private final /* synthetic */ zzgs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgu(zzgs zzgsVar, Handler handler) {
        super(null);
        this.zza = zzgsVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzd();
    }
}
