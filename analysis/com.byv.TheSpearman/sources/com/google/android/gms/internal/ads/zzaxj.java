package com.google.android.gms.internal.ads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaxj implements zzfrs {
    private final zzfpr zza;
    private final zzfqi zzb;
    private final zzaxw zzc;
    private final zzaxi zzd;
    private final zzaws zze;
    private final zzaxy zzf;
    private final zzaxq zzg;
    private final zzaxh zzh;

    zzaxj(zzfpr zzfprVar, zzfqi zzfqiVar, zzaxw zzaxwVar, zzaxi zzaxiVar, zzaws zzawsVar, zzaxy zzaxyVar, zzaxq zzaxqVar, zzaxh zzaxhVar) {
        this.zza = zzfprVar;
        this.zzb = zzfqiVar;
        this.zzc = zzaxwVar;
        this.zzd = zzaxiVar;
        this.zze = zzawsVar;
        this.zzf = zzaxyVar;
        this.zzg = zzaxqVar;
        this.zzh = zzaxhVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzfpr zzfprVar = this.zza;
        zzaud zzaudVarZzb = this.zzb.zzb();
        map.put("v", zzfprVar.zzb());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzaudVarZzb.zzi());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzaxq zzaxqVar = this.zzg;
        if (zzaxqVar != null) {
            map.put("tcq", Long.valueOf(zzaxqVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zza() {
        zzaxw zzaxwVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzaxwVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zzb() {
        zzfpr zzfprVar = this.zza;
        zzfqi zzfqiVar = this.zzb;
        Map mapZze = zze();
        zzaud zzaudVarZza = zzfqiVar.zza();
        mapZze.put("gai", Boolean.valueOf(zzfprVar.zzd()));
        mapZze.put("did", zzaudVarZza.zzh());
        mapZze.put("dst", Integer.valueOf(zzaudVarZza.zzc().zza()));
        mapZze.put("doo", Boolean.valueOf(zzaudVarZza.zzaq()));
        zzaws zzawsVar = this.zze;
        if (zzawsVar != null) {
            mapZze.put("nt", Long.valueOf(zzawsVar.zza()));
        }
        zzaxy zzaxyVar = this.zzf;
        if (zzaxyVar != null) {
            mapZze.put("vs", Long.valueOf(zzaxyVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zzc() {
        zzaxh zzaxhVar = this.zzh;
        Map mapZze = zze();
        if (zzaxhVar != null) {
            mapZze.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, zzaxhVar.zza());
        }
        return mapZze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
