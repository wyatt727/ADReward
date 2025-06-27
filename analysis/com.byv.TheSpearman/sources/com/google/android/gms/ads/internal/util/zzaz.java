package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqz;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarf;
import com.google.android.gms.internal.ads.zzarm;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzfsk;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzaz extends zzarf {
    private final Context zzc;

    private zzaz(Context context, zzare zzareVar) {
        super(zzareVar);
        this.zzc = context;
    }

    public static zzaqt zzb(Context context) {
        zzaqt zzaqtVar = new zzaqt(new zzarm(new File(zzfsg.zza(zzfsf.zza(), context.getCacheDir(), "admob_volley", zzfsk.zza)), 20971520), new zzaz(context, new zzarq()), 4);
        zzaqtVar.zzd();
        return zzaqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarf, com.google.android.gms.internal.ads.zzaqj
    public final zzaqm zza(zzaqq zzaqqVar) throws zzaqz {
        if (zzaqqVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeu), zzaqqVar.zzk())) {
                Context context = this.zzc;
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context, 13400000)) {
                    zzaqm zzaqmVarZza = new zzbmv(this.zzc).zza(zzaqqVar);
                    if (zzaqmVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaqqVar.zzk())));
                        return zzaqmVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqqVar.zzk())));
                }
            }
        }
        return super.zza(zzaqqVar);
    }
}
