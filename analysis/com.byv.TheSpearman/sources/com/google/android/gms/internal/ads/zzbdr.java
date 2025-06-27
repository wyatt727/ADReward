package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbdr {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbdq) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbea.zza());
        return arrayList;
    }

    public final List zzb() {
        List listZza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbdq) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZza.add(str);
            }
        }
        listZza.addAll(zzbea.zzb());
        return listZza;
    }

    public final void zzc(zzbdq zzbdqVar) {
        this.zzb.add(zzbdqVar);
    }

    public final void zzd(zzbdq zzbdqVar) {
        this.zza.add(zzbdqVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbdq zzbdqVar : this.zza) {
            if (zzbdqVar.zze() == 1) {
                zzbdqVar.zzd(editor, zzbdqVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Flag Json is null.");
        }
    }
}
