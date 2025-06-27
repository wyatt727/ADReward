package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgn extends ContentObserver {
    private final /* synthetic */ zzgl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgn(zzgl zzglVar, Handler handler) {
        super(null);
        this.zza = zzglVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza.set(true);
    }
}
