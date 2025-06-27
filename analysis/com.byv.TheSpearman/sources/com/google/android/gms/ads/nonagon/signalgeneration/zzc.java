package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzdum;
import com.json.mediationsdk.metadata.a;
import com.json.t2;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzc {
    private final zzdum zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zza(zzbdz.zzhb)).intValue();
    private final long zzb = ((Long) zzba.zzc().zza(zzbdz.zzhc)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zza(zzbdz.zzhh)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zza(zzbdz.zzhf)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdum zzdumVar) {
        this.zzh = zzdumVar;
    }

    private final synchronized void zzg(final zzduc zzducVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.zze(zzducVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzh(zzduc zzducVar, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzducVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put(t2.h.h, "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzh.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzduc zzducVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzducVar.zzb().put("request_id", str);
        if (pair == null) {
            zzducVar.zzb().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.zze.remove(str);
        zzducVar.zzb().put("mhit", a.g);
        return str2;
    }

    public final synchronized void zzd(String str, String str2, zzduc zzducVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzducVar);
    }

    final /* synthetic */ void zze(zzduc zzducVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        zzh(zzducVar, arrayDeque, TypedValues.TransitionType.S_TO);
        zzh(zzducVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
