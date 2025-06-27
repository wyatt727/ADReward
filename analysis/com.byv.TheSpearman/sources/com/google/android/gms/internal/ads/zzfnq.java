package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnq {
    private static final zzfnq zza = new zzfnq();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfnq() {
    }

    public static zzfnq zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfnc zzfncVar) {
        this.zzb.add(zzfncVar);
    }

    public final void zze(zzfnc zzfncVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfncVar);
        this.zzc.remove(zzfncVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfny.zzb().zzg();
    }

    public final void zzf(zzfnc zzfncVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfncVar);
        if (zZzg) {
            return;
        }
        zzfny.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
