package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Payload;
import java.io.FileNotFoundException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzat extends zzaw<Connections.MessageListener> {
    final /* synthetic */ zzfm zza;
    final /* synthetic */ zzav zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(zzav zzavVar, zzfm zzfmVar) {
        super(null);
        this.zzb = zzavVar;
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) throws FileNotFoundException {
        Connections.MessageListener messageListener = (Connections.MessageListener) obj;
        Payload payloadZza = zzgf.zza(this.zzb.zza, this.zza.zzb());
        if (payloadZza == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(this.zza.zzb().zza())));
        } else {
            if (payloadZza.getType() != 1) {
                return;
            }
            messageListener.onMessageReceived(this.zza.zza(), payloadZza.asBytes(), this.zza.zzc());
        }
    }
}
