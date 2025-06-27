package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzdup {
    protected final Context zzc;
    protected final Executor zzd;
    protected final com.google.android.gms.ads.internal.util.client.zzr zze;
    private final CsiUrlBuilder zzg;
    protected final String zza = (String) zzbfn.zzb.zze();
    protected final Map zzb = new HashMap();
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference(new Bundle());
    protected final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbX)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzca)).booleanValue();
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhe)).booleanValue();

    protected zzdup(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zzd = executor;
        this.zze = zzrVar;
        this.zzg = csiUrlBuilder;
        this.zzc = context;
    }

    private final void zza(Map map, boolean z) {
        if (map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Empty paramMap.");
            return;
        }
        if (map == null || map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Empty or null paramMap.");
        } else {
            if (!this.zzj.getAndSet(true)) {
                final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzki);
                this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zza(this.zzc, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzduo
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.zza.zzd(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.zzk.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strGenerateUrl = this.zzg.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zzf) {
            if (!z || this.zzh) {
                if (!z2 || this.zzi) {
                    this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdun
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zza(strGenerateUrl);
                        }
                    });
                }
            }
        }
    }

    protected final String zzb(Map map) {
        return this.zzg.generateUrl(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzc, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
