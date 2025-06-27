package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzlv implements zzlm {
    public final zzvc zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlv(zzvj zzvjVar, boolean z) {
        this.zza = new zzvc(zzvjVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzcx zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
