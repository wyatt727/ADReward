package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzchh implements zzbky {
    final /* synthetic */ zzchj zza;

    zzchh(zzchj zzchjVar) {
        this.zza = zzchjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzchj zzchjVar = this.zza;
                    if (zzchjVar.zzH != i) {
                        zzchjVar.zzH = i;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
