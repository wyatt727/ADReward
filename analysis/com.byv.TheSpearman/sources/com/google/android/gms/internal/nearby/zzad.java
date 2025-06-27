package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzad extends zzaw<ConnectionLifecycleCallback> {
    final /* synthetic */ zzeu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(zzag zzagVar, zzeu zzeuVar) {
        super(null);
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        String strZza = this.zza.zza();
        com.google.android.gms.nearby.connection.zzf zzfVar = new com.google.android.gms.nearby.connection.zzf();
        zzfVar.zza(this.zza.zzb());
        zzfVar.zzb(this.zza.zzc());
        ((ConnectionLifecycleCallback) obj).zza(strZza, zzfVar.zzc());
    }
}
