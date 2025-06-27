package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdry {
    private final zzfhe zza;
    private final zzdrv zzb;

    zzdry(zzfhe zzfheVar, zzdrv zzdrvVar) {
        this.zza = zzfheVar;
        this.zzb = zzdrvVar;
    }

    final zzbqo zza() throws RemoteException {
        zzbqo zzbqoVarZzb = this.zza.zzb();
        if (zzbqoVarZzb != null) {
            return zzbqoVarZzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbsn zzb(String str) throws RemoteException {
        zzbsn zzbsnVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbsnVarZzc);
        return zzbsnVarZzc;
    }

    public final zzfhg zzc(String str, JSONObject jSONObject) throws zzfgp {
        zzbqr zzbqrVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbqrVarZzb = new zzbrp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbqrVarZzb = new zzbrp(new zzbtg());
            } else {
                zzbqo zzbqoVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbqrVarZzb = zzbqoVarZza.zze(string) ? zzbqoVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbqoVarZza.zzd(string) ? zzbqoVarZza.zzb(string) : zzbqoVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e);
                    }
                } else {
                    zzbqrVarZzb = zzbqoVarZza.zzb(str);
                }
            }
            zzfhg zzfhgVar = new zzfhg(zzbqrVarZzb);
            this.zzb.zzc(str, zzfhgVar);
            return zzfhgVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjl)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfgp(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
