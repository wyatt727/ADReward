package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzelv implements zzegj {
    private final zzegl zza;
    private final zzegp zzb;
    private final zzfkn zzc;
    private final zzgep zzd;

    public zzelv(zzfkn zzfknVar, zzgep zzgepVar, zzegl zzeglVar, zzegp zzegpVar) {
        this.zzc = zzfknVar;
        this.zzd = zzgepVar;
        this.zzb = zzegpVar;
        this.zza = zzeglVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        final zzegm zzegmVarZza;
        Iterator it = zzffnVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzegmVarZza = null;
                break;
            }
            try {
                zzegmVarZza = this.zza.zza((String) it.next(), zzffnVar.zzw);
                break;
            } catch (zzfgp unused) {
            }
        }
        if (zzegmVarZza == null) {
            return zzgee.zzg(new zzejl("Unable to instantiate mediation adapter class."));
        }
        zzcbw zzcbwVar = new zzcbw();
        zzegmVarZza.zzc.zza(new zzelu(this, zzegmVarZza, zzcbwVar));
        if (zzffnVar.zzN) {
            Bundle bundle = zzffzVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfkn zzfknVar = this.zzc;
        return zzfjx.zzd(new zzfjr() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzfjr
            public final void zza() throws Exception {
                this.zza.zzd(zzffzVar, zzffnVar, zzegmVarZza);
            }
        }, this.zzd, zzfkh.ADAPTER_LOAD_AD_SYN, zzfknVar).zzb(zzfkh.ADAPTER_LOAD_AD_ACK).zzd(zzcbwVar).zzb(zzfkh.ADAPTER_WRAP_ADAPTER).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                return this.zza.zzc(zzffzVar, zzffnVar, zzegmVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        return !zzffnVar.zzu.isEmpty();
    }

    final /* synthetic */ Object zzc(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar, Void r4) throws Exception {
        return this.zzb.zza(zzffzVar, zzffnVar, zzegmVar);
    }

    final /* synthetic */ void zzd(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws Exception {
        this.zzb.zzb(zzffzVar, zzffnVar, zzegmVar);
    }
}
