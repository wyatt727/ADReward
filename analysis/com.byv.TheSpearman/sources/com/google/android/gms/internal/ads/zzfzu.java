package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfzu extends zzfxo {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfws zzb;

    zzfzu(Iterator it, zzfws zzfwsVar) {
        this.zza = it;
        this.zzb = zzfwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfws zzfwsVar = this.zzb;
            Object next = it.next();
            if (zzfwsVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
