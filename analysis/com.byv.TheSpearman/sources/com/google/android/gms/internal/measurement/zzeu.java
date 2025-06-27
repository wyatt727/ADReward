package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzds;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
/* loaded from: classes3.dex */
final class zzeu extends zzds.zza {
    private final /* synthetic */ zzde zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzds zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeu(zzds zzdsVar, zzde zzdeVar, int i) {
        super(zzdsVar);
        this.zzc = zzdeVar;
        this.zzd = i;
        this.zze = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zza
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zza
    final void zza() throws RemoteException {
        ((zzdd) Preconditions.checkNotNull(this.zze.zzj)).getTestFlag(this.zzc, this.zzd);
    }
}
