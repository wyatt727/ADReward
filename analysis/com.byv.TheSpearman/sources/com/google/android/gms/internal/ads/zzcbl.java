package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcbl implements zzbar {
    final zzcbi zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcbj zzf = new zzcbj();

    public zzcbl(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcbi(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zza(boolean z) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        if (!z) {
            this.zze.zzs(jCurrentTimeMillis);
            this.zze.zzI(this.zza.zzd);
            return;
        }
        if (jCurrentTimeMillis - this.zze.zzc() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaT)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = this.zze.zzb();
        }
        this.zzg = true;
    }

    public final int zzb() {
        int iZza;
        synchronized (this.zzd) {
            iZza = this.zza.zza();
        }
        return iZza;
    }

    public final zzcba zzc(Clock clock, String str) {
        return new zzcba(clock, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzcba zzcbaVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcbaVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzg(zzlVar, j);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfhq zzfhqVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcba) it2.next()).zza());
        }
        bundle.putParcelableArrayList(b.JSON_KEY_ADS, arrayList);
        zzfhqVar.zzc(hashSet);
        return bundle;
    }
}
