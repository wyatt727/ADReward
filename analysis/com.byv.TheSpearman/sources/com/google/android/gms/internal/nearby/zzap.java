package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzap extends zzef {
    private final ListenerHolder<EndpointDiscoveryCallback> zza;
    private final Set<String> zzb = new ArraySet();

    zzap(ListenerHolder<EndpointDiscoveryCallback> listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(zzfi zzfiVar) {
        return zzfiVar.zzd() != null && (zzfiVar.zza() == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzfiVar.zza()));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzb(zzfg zzfgVar) {
        this.zza.notifyListener(new zzal(this, zzfgVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzc(zzfi zzfiVar) {
        if (!zzg(zzfiVar)) {
            this.zzb.add(zzfiVar.zza());
        }
        this.zza.notifyListener(new zzam(this, zzfiVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzd(zzfk zzfkVar) {
        this.zzb.remove(zzfkVar.zza());
        this.zza.notifyListener(new zzan(this, zzfkVar));
    }

    final synchronized void zze() {
        Iterator<String> it = this.zzb.iterator();
        while (it.hasNext()) {
            this.zza.notifyListener(new zzao(this, it.next()));
        }
        this.zzb.clear();
    }
}
