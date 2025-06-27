package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcud implements zzeke {
    public final List zza;

    public zzcud(zzctv zzctvVar) {
        this.zza = Collections.singletonList(zzgee.zzh(zzctvVar));
    }

    public zzcud(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeke
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgee.zzr((ListenableFuture) it.next(), new zzcuc(this), zzgev.zzb());
        }
    }
}
