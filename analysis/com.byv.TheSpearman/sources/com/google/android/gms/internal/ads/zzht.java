package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public interface zzht extends zzgv {
    public static final zzfws zza = new zzfws() { // from class: com.google.android.gms.internal.ads.zzhn
        @Override // com.google.android.gms.internal.ads.zzfws
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String strZza = zzfvx.zza(str);
            if (TextUtils.isEmpty(strZza)) {
                return false;
            }
            return ((strZza.contains("text") && !strZza.contains("text/vtt")) || strZza.contains("html") || strZza.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzgv
    Map zze();
}
