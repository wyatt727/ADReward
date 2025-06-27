package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbzo zzc;
    private final zzbwg zzd = new zzbwg(false, Collections.emptyList());

    public zzb(Context context, zzbzo zzbzoVar, zzbwg zzbwgVar) {
        this.zza = context;
        this.zzc = zzbzoVar;
    }

    private final boolean zzd() {
        zzbzo zzbzoVar = this.zzc;
        return (zzbzoVar != null && zzbzoVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbzo zzbzoVar = this.zzc;
            if (zzbzoVar != null) {
                zzbzoVar.zzd(str, null, 3);
                return;
            }
            zzbwg zzbwgVar = this.zzd;
            if (!zzbwgVar.zza || (list = zzbwgVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzL(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
