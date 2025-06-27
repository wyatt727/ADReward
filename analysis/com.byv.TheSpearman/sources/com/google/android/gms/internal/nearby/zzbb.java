package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbb extends zzej {
    private final Context zza;
    private final ListenerHolder<PayloadCallback> zzb;
    private final Map<zzba, PayloadTransferUpdate> zzc = new ArrayMap();
    private final zzfx zzd;

    zzbb(Context context, ListenerHolder<PayloadCallback> listenerHolder, zzfx zzfxVar) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
        this.zzd = zzfxVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzek
    public final synchronized void zzb(zzfm zzfmVar) {
        Payload payloadZza = zzgf.zza(this.zza, zzfmVar.zzb());
        if (payloadZza == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(zzfmVar.zzb().zza())));
            return;
        }
        Map<zzba, PayloadTransferUpdate> map = this.zzc;
        zzba zzbaVar = new zzba(zzfmVar.zza(), zzfmVar.zzb().zza());
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
        builder.setPayloadId(zzfmVar.zzb().zza());
        map.put(zzbaVar, builder.build());
        this.zzb.notifyListener(new zzax(this, zzfmVar, payloadZza));
    }

    @Override // com.google.android.gms.internal.nearby.zzek
    public final synchronized void zzc(zzfo zzfoVar) {
        if (zzfoVar.zzb().getStatus() == 3) {
            this.zzc.put(new zzba(zzfoVar.zza(), zzfoVar.zzb().getPayloadId()), zzfoVar.zzb());
        } else {
            this.zzc.remove(new zzba(zzfoVar.zza(), zzfoVar.zzb().getPayloadId()));
            zzfx zzfxVar = this.zzd;
            if (zzfxVar != null) {
                zzfxVar.zzb(zzfoVar.zzb().getPayloadId());
            }
        }
        this.zzb.notifyListener(new zzay(this, zzfoVar));
    }

    final synchronized void zzd() {
        for (Map.Entry<zzba, PayloadTransferUpdate> entry : this.zzc.entrySet()) {
            this.zzb.notifyListener(new zzaz(this, entry.getKey().zza(), entry.getValue()));
        }
        this.zzc.clear();
    }
}
