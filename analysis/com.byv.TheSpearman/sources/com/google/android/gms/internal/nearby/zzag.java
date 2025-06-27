package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzag extends zzdy {
    private final ListenerHolder<ConnectionLifecycleCallback> zza;
    private final Set<String> zzb = new ArraySet();
    private final Set<String> zzc = new ArraySet();

    zzag(ListenerHolder<ConnectionLifecycleCallback> listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzb(zzew zzewVar) {
        this.zzb.add(zzewVar.zza());
        this.zza.notifyListener(new zzaa(this, zzewVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzc(zzfc zzfcVar) {
        this.zzb.remove(zzfcVar.zza());
        Status statusZzG = zzbf.zzG(zzfcVar.zzb());
        if (statusZzG.isSuccess()) {
            this.zzc.add(zzfcVar.zza());
        }
        this.zza.notifyListener(new zzab(this, zzfcVar, statusZzG));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzd(zzfe zzfeVar) {
        this.zzc.remove(zzfeVar.zza());
        this.zza.notifyListener(new zzac(this, zzfeVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final void zze(zzeu zzeuVar) {
        this.zza.notifyListener(new zzad(this, zzeuVar));
    }

    final synchronized void zzf() {
        Iterator<String> it = this.zzb.iterator();
        while (it.hasNext()) {
            this.zza.notifyListener(new zzae(this, it.next()));
        }
        this.zzb.clear();
        Iterator<String> it2 = this.zzc.iterator();
        while (it2.hasNext()) {
            this.zza.notifyListener(new zzaf(this, it2.next()));
        }
        this.zzc.clear();
    }
}
