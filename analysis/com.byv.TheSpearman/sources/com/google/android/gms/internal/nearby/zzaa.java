package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzaa extends zzaw<ConnectionLifecycleCallback> {
    final /* synthetic */ zzew zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzag zzagVar, zzew zzewVar) {
        super(null);
        this.zza = zzewVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        String strZza = this.zza.zza();
        com.google.android.gms.nearby.connection.zzi zziVar = new com.google.android.gms.nearby.connection.zzi();
        zziVar.zza(this.zza.zzb());
        zziVar.zzb(this.zza.zzc());
        zziVar.zzc(this.zza.zze());
        zziVar.zzd(this.zza.zzd());
        zziVar.zze(this.zza.zzf());
        zziVar.zzf(this.zza.zzg());
        ((ConnectionLifecycleCallback) obj).onConnectionInitiated(strZza, zziVar.zzg());
    }
}
