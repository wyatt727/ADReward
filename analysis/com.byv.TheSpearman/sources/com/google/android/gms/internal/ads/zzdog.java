package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdog {
    private final Executor zza;
    private final zzdob zzb;

    public zzdog(Executor executor, zzdob zzdobVar) {
        this.zza = executor;
        this.zzb = zzdobVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgee.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZzh = zzgee.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    listenableFutureZzh = zzgee.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZzh = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzgee.zzh(new zzdof(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgee.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdod
                        @Override // com.google.android.gms.internal.ads.zzfwf
                        public final Object apply(Object obj) {
                            return new zzdof(strOptString, (zzbgr) obj);
                        }
                    }, this.zza) : zzgee.zzh(null);
                }
            }
            arrayList.add(listenableFutureZzh);
        }
        return zzgee.zzm(zzgee.zzd(arrayList), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdof zzdofVar : (List) obj) {
                    if (zzdofVar != null) {
                        arrayList2.add(zzdofVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
