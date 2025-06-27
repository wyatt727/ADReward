package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekd {
    private final Clock zza;
    private final zzekf zzb;
    private final zzfmt zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgV)).booleanValue();
    private final zzego zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzekd(Clock clock, zzekf zzekfVar, zzego zzegoVar, zzfmt zzfmtVar) {
        this.zza = clock;
        this.zzb = zzekfVar;
        this.zzf = zzegoVar;
        this.zzc = zzfmtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzffn zzffnVar) {
        zzekc zzekcVar = (zzekc) this.zzd.get(zzffnVar);
        if (zzekcVar == null) {
            return false;
        }
        return zzekcVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    final synchronized ListenableFuture zzf(zzffz zzffzVar, zzffn zzffnVar, ListenableFuture listenableFuture, zzfmp zzfmpVar) {
        zzffq zzffqVar = zzffzVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzffnVar.zzx;
        if (str != null) {
            this.zzd.put(zzffnVar, new zzekc(str, zzffnVar.zzag, 9, 0L, null));
            zzgee.zzr(listenableFuture, new zzekb(this, jElapsedRealtime, zzffqVar, zzffnVar, str, zzfmpVar, zzffzVar), zzcbr.zzf);
        }
        return listenableFuture;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzekc zzekcVar = (zzekc) ((Map.Entry) it.next()).getValue();
            if (zzekcVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzekcVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzffn zzffnVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzffnVar != null) {
            this.zzf.zze(zzffnVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzffn zzffnVar = (zzffn) it.next();
            if (!TextUtils.isEmpty(zzffnVar.zzx)) {
                this.zzd.put(zzffnVar, new zzekc(zzffnVar.zzx, zzffnVar.zzag, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzffn zzffnVar) {
        zzekc zzekcVar = (zzekc) this.zzd.get(zzffnVar);
        if (zzekcVar == null || this.zzg) {
            return;
        }
        zzekcVar.zzc = 8;
    }
}
