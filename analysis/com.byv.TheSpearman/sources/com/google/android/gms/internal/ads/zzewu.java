package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewu {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzflh zzd;
    private final zzduh zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzewu(Context context, Executor executor, Set set, zzflh zzflhVar, zzduh zzduhVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzflhVar;
        this.zze = zzduhVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfkw zzfkwVarZza = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_SIGNALS);
        zzfkwVarZza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlv)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlv)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdtq.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdtq.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzewr zzewrVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzewrVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfY)).booleanValue() || zzewrVar.zza() != 44) {
                    final long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    ListenableFuture listenableFutureZzb = zzewrVar.zzb();
                    listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzews
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(jElapsedRealtime, zzewrVar, bundle2);
                        }
                    }, zzcbr.zzf);
                    arrayList.add(listenableFutureZzb);
                }
            }
        }
        ListenableFuture listenableFutureZza = zzgee.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzewq zzewqVar = (zzewq) ((ListenableFuture) it.next()).get();
                    if (zzewqVar != null) {
                        zzewqVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdtq.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdtq.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzflk.zza()) {
            zzflg.zzb(listenableFutureZza, this.zzd, zzfkwVarZza);
        }
        return listenableFutureZza;
    }

    public final void zzb(long j, zzewr zzewrVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbfv.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfxg.zzc(zzewrVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcd)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzewrVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzca)).booleanValue()) {
            zzdug zzdugVarZza = this.zze.zza();
            zzdugVarZza.zzb(t2.h.h, "lat_ms");
            zzdugVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdugVarZza.zzb("lat_id", String.valueOf(zzewrVar.zza()));
            zzdugVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcb)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdugVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                        if (zzewrVar.zza() <= 39 || zzewrVar.zza() >= 52) {
                            zzdugVarZza.zzb("lat_clsg", strValueOf);
                        } else {
                            zzdugVarZza.zzb("lat_gmssg", strValueOf);
                        }
                    }
                }
            }
            zzdugVarZza.zzg();
        }
    }
}
