package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdef {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfdb zzo;

    public final zzdef zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdgf(zzaVar, executor));
        return this;
    }

    public final zzdef zzb(zzcyt zzcytVar, Executor executor) {
        this.zzi.add(new zzdgf(zzcytVar, executor));
        return this;
    }

    public final zzdef zzc(zzczg zzczgVar, Executor executor) {
        this.zzl.add(new zzdgf(zzczgVar, executor));
        return this;
    }

    public final zzdef zzd(zzczk zzczkVar, Executor executor) {
        this.zzf.add(new zzdgf(zzczkVar, executor));
        return this;
    }

    public final zzdef zze(zzcyq zzcyqVar, Executor executor) {
        this.zze.add(new zzdgf(zzcyqVar, executor));
        return this;
    }

    public final zzdef zzf(zzdae zzdaeVar, Executor executor) {
        this.zzh.add(new zzdgf(zzdaeVar, executor));
        return this;
    }

    public final zzdef zzg(zzdap zzdapVar, Executor executor) {
        this.zzg.add(new zzdgf(zzdapVar, executor));
        return this;
    }

    public final zzdef zzh(com.google.android.gms.ads.internal.overlay.zzp zzpVar, Executor executor) {
        this.zzn.add(new zzdgf(zzpVar, executor));
        return this;
    }

    public final zzdef zzi(zzdbb zzdbbVar, Executor executor) {
        this.zzm.add(new zzdgf(zzdbbVar, executor));
        return this;
    }

    public final zzdef zzj(zzdbl zzdblVar, Executor executor) {
        this.zzb.add(new zzdgf(zzdblVar, executor));
        return this;
    }

    public final zzdef zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdgf(appEventListener, executor));
        return this;
    }

    public final zzdef zzl(zzdgn zzdgnVar, Executor executor) {
        this.zzd.add(new zzdgf(zzdgnVar, executor));
        return this;
    }

    public final zzdef zzm(zzfdb zzfdbVar) {
        this.zzo = zzfdbVar;
        return this;
    }

    public final zzdeh zzn() {
        return new zzdeh(this, null);
    }
}
