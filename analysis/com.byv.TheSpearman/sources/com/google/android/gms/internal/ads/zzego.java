package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzego {
    private final String zzc;
    private zzffq zzd = null;
    private zzffn zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzego(String str) {
        this.zzc = str;
    }

    private static String zzj(zzffn zzffnVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdv)).booleanValue() ? zzffnVar.zzaq : zzffnVar.zzx;
    }

    private final synchronized void zzk(zzffn zzffnVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String strZzj = zzj(zzffnVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzffnVar.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzffnVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgR)).booleanValue()) {
            str = zzffnVar.zzG;
            str2 = zzffnVar.zzH;
            str3 = zzffnVar.zzI;
            str4 = zzffnVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzffnVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, zzuVar);
    }

    private final void zzl(zzffn zzffnVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String strZzj = zzj(zzffnVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzffnVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(strZzj);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgS)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcyj zzb() {
        return new zzcyj(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzffn zzffnVar) {
        zzk(zzffnVar, this.zza.size());
    }

    public final void zze(zzffn zzffnVar) {
        int iIndexOf = this.zza.indexOf(this.zzb.get(zzj(zzffnVar)));
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            iIndexOf = this.zza.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(iIndexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    public final void zzf(zzffn zzffnVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzffnVar, j, zzeVar, false);
    }

    public final void zzg(zzffn zzffnVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzffnVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int iIndexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzffn) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzi(zzffq zzffqVar) {
        this.zzd = zzffqVar;
    }
}
