package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcez implements zzbky {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcey zzcfbVar;
        zzceq zzceqVarZza;
        zzcdn zzcdnVar = (zzcdn) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcer zzcerVarZzy = com.google.android.gms.ads.internal.zzu.zzy();
        if (map.containsKey("abort")) {
            if (zzcerVarZzy.zzd(zzcdnVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcdm zzcdmVar = new zzcdm((String) map.get("flags"));
        boolean z = zzcdmVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzcerVarZzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzceqVarZza = null;
                        break;
                    }
                    zzceq zzceqVar = (zzceq) it.next();
                    if (zzceqVar.zza == zzcdnVar && str.equals(zzceqVar.zze())) {
                        zzceqVarZza = zzceqVar;
                        break;
                    }
                }
            } else {
                zzceqVarZza = zzcerVarZzy.zza(zzcdnVar);
            }
            if (zzceqVarZza != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            }
            if (zzcdnVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcdnVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcdnVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcdnVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcek zzcekVar = zzcdnVar.zzj().zzb;
            if (iIntValue > 0) {
                int i2 = zzcdmVar.zzh;
                int iZzu = zzcde.zzu();
                zzcfbVar = iZzu < i2 ? new zzcfh(zzcdnVar, zzcdmVar) : iZzu < zzcdmVar.zzb ? new zzcfe(zzcdnVar, zzcdmVar) : new zzcfc(zzcdnVar);
            } else {
                zzcfbVar = new zzcfb(zzcdnVar);
            }
            new zzceq(zzcdnVar, zzcfbVar, str, strArr).zzb();
        } else {
            zzceq zzceqVarZza2 = zzcerVarZzy.zza(zzcdnVar);
            if (zzceqVarZza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
            zzcfbVar = zzceqVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcfbVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcfbVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcfbVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcfbVar.zzq(numZzb8.intValue());
        }
    }
}
