package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgi {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzbni zzb;
    public final zzeoa zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbgt zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzffv zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final Bundle zzr;
    public final com.google.android.gms.ads.internal.client.zzcf zzs;

    /* synthetic */ zzfgi(zzfgg zzfggVar, zzfgh zzfghVar) {
        this.zze = zzfggVar.zzb;
        this.zzf = zzfggVar.zzc;
        this.zzs = zzfggVar.zzt;
        int i = zzfggVar.zza.zza;
        long j = zzfggVar.zza.zzb;
        Bundle bundle = zzfggVar.zza.zzc;
        int i2 = zzfggVar.zza.zzd;
        List list = zzfggVar.zza.zze;
        boolean z = zzfggVar.zza.zzf;
        int i3 = zzfggVar.zza.zzg;
        boolean z2 = true;
        if (!zzfggVar.zza.zzh && !zzfggVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfggVar.zza.zzi, zzfggVar.zza.zzj, zzfggVar.zza.zzk, zzfggVar.zza.zzl, zzfggVar.zza.zzm, zzfggVar.zza.zzn, zzfggVar.zza.zzo, zzfggVar.zza.zzp, zzfggVar.zza.zzq, zzfggVar.zza.zzr, zzfggVar.zza.zzs, zzfggVar.zza.zzt, zzfggVar.zza.zzu, zzfggVar.zza.zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfggVar.zza.zzw), zzfggVar.zza.zzx, zzfggVar.zza.zzy, zzfggVar.zza.zzz);
        this.zza = zzfggVar.zzd != null ? zzfggVar.zzd : zzfggVar.zzh != null ? zzfggVar.zzh.zzf : null;
        this.zzg = zzfggVar.zzf;
        this.zzh = zzfggVar.zzg;
        this.zzi = zzfggVar.zzf == null ? null : zzfggVar.zzh == null ? new zzbgt(new NativeAdOptions.Builder().build()) : zzfggVar.zzh;
        this.zzj = zzfggVar.zzi;
        this.zzk = zzfggVar.zzm;
        this.zzl = zzfggVar.zzj;
        this.zzm = zzfggVar.zzk;
        this.zzn = zzfggVar.zzl;
        this.zzb = zzfggVar.zzn;
        this.zzo = new zzffv(zzfggVar.zzo, null);
        this.zzp = zzfggVar.zzp;
        this.zzc = zzfggVar.zzq;
        this.zzq = zzfggVar.zzr;
        this.zzr = zzfggVar.zzs;
    }

    public final zzbiv zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcZ));
    }
}
