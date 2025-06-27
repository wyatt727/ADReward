package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnh {
    public static final zzgrt zza = new zzgng(null);

    public static zzgrz zza(zzgos zzgosVar) {
        zzgfv zzgfvVar;
        zzgrv zzgrvVar = new zzgrv();
        zzgrvVar.zzb(zzgosVar.zzc());
        Iterator it = zzgosVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgoq zzgoqVar : (List) it.next()) {
                zzgur zzgurVarZzb = zzgoqVar.zzb();
                zzgur zzgurVar = zzgur.UNKNOWN_STATUS;
                int iOrdinal = zzgurVarZzb.ordinal();
                if (iOrdinal == 1) {
                    zzgfvVar = zzgfv.zza;
                } else if (iOrdinal == 2) {
                    zzgfvVar = zzgfv.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgfvVar = zzgfv.zzc;
                }
                int iZza = zzgoqVar.zza();
                String strZzf = zzgoqVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzgrvVar.zza(zzgfvVar, iZza, strZzf, zzgoqVar.zzc().name());
            }
        }
        if (zzgosVar.zzb() != null) {
            zzgrvVar.zzc(zzgosVar.zzb().zza());
        }
        try {
            return zzgrvVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
