package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.json.mediationsdk.metadata.a;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcoy implements zzcoa {
    private final zzdxf zza;

    zzcoy(zzdxf zzdxfVar) {
        this.zza = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals(a.g));
    }
}
