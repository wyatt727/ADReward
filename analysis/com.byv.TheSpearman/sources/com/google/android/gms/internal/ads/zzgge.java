package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgge {
    private final zzgvc zza;
    private final List zzb;
    private final zzgrs zzc;

    private zzgge(zzgvc zzgvcVar, List list) {
        this.zza = zzgvcVar;
        this.zzb = list;
        this.zzc = zzgrs.zza;
    }

    /* synthetic */ zzgge(zzgvc zzgvcVar, List list, zzgrs zzgrsVar, zzggd zzggdVar) {
        this.zza = zzgvcVar;
        this.zzb = list;
        this.zzc = zzgrsVar;
    }

    static final zzgge zza(zzgvc zzgvcVar) throws GeneralSecurityException {
        zzh(zzgvcVar);
        return new zzgge(zzgvcVar, zzg(zzgvcVar));
    }

    public static final zzgge zzb(zzggi zzggiVar) throws GeneralSecurityException {
        zzgga zzggaVar = new zzgga();
        zzgfy zzgfyVar = new zzgfy(zzggiVar, null);
        zzgfyVar.zzd();
        zzgfyVar.zzc();
        zzggaVar.zza(zzgfyVar);
        return zzggaVar.zzb();
    }

    private static zzgot zzf(zzgvb zzgvbVar) {
        try {
            return zzgot.zza(zzgvbVar.zzc().zzg(), zzgvbVar.zzc().zzf(), zzgvbVar.zzc().zzc(), zzgvbVar.zzg(), zzgvbVar.zzg() == zzgvv.RAW ? null : Integer.valueOf(zzgvbVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgph("Creating a protokey serialization failed", e);
        }
    }

    private static List zzg(zzgvc zzgvcVar) throws GeneralSecurityException {
        zzgfv zzgfvVar;
        ArrayList arrayList = new ArrayList(zzgvcVar.zza());
        for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
            int iZza = zzgvbVar.zza();
            try {
                zzgot zzgotVarZzf = zzf(zzgvbVar);
                zzgnu zzgnuVarZzc = zzgnu.zzc();
                zzggn zzggnVarZza = zzggn.zza();
                zzgft zzgndVar = !zzgnuVarZzc.zzj(zzgotVarZzf) ? new zzgnd(zzgotVarZzf, zzggnVarZza) : zzgnuVarZzc.zza(zzgotVarZzf, zzggnVarZza);
                zzgur zzgurVarZzd = zzgvbVar.zzd();
                zzgur zzgurVar = zzgur.UNKNOWN_STATUS;
                int iOrdinal = zzgurVarZzd.ordinal();
                if (iOrdinal == 1) {
                    zzgfvVar = zzgfv.zza;
                } else if (iOrdinal == 2) {
                    zzgfvVar = zzgfv.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgfvVar = zzgfv.zzc;
                }
                arrayList.add(new zzggc(zzgndVar, zzgfvVar, iZza, iZza == zzgvcVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgvc zzgvcVar) throws GeneralSecurityException {
        if (zzgvcVar == null || zzgvcVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzi(zzgmr zzgmrVar, zzgft zzgftVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgnr.zza().zzc(zzgftVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzggq.zza;
        zzgvc zzgvcVar = this.zza;
        zzgve zzgveVarZza = zzgvh.zza();
        zzgveVarZza.zzb(zzgvcVar.zzc());
        for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
            zzgvf zzgvfVarZza = zzgvg.zza();
            zzgvfVarZza.zzd(zzgvbVar.zzc().zzg());
            zzgvfVarZza.zzc(zzgvbVar.zzd());
            zzgvfVarZza.zzb(zzgvbVar.zzg());
            zzgvfVarZza.zza(zzgvbVar.zza());
            zzgveVarZza.zza((zzgvg) zzgvfVarZza.zzbr());
        }
        return ((zzgvh) zzgveVarZza.zzbr()).toString();
    }

    final zzgvc zzc() {
        return this.zza;
    }

    public final Object zzd(zzgfn zzgfnVar, Class cls) throws GeneralSecurityException {
        Class clsZza = zzggm.zza(cls);
        if (clsZza == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzgvc zzgvcVar = this.zza;
        Charset charset = zzggq.zza;
        int iZzc = zzgvcVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
            if (zzgvbVar.zzd() == zzgur.ENABLED) {
                if (!zzgvbVar.zzl()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgvbVar.zza())));
                }
                if (zzgvbVar.zzg() == zzgvv.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgvbVar.zza())));
                }
                if (zzgvbVar.zzd() == zzgur.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgvbVar.zza())));
                }
                if (zzgvbVar.zza() == iZzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgvbVar.zzc().zzc() == zzguo.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgoo zzgooVarZza = zzgos.zza(clsZza);
        zzgooVarZza.zzc(this.zzc);
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzgvb zzgvbVarZze = this.zza.zze(i2);
            if (zzgvbVarZze.zzd().equals(zzgur.ENABLED)) {
                zzggc zzggcVar = (zzggc) this.zzb.get(i2);
                if (zzggcVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + zzgvbVarZze.zzc().zzg() + " failed, unable to get primitive");
                }
                zzgft zzgftVarZza = zzggcVar.zza();
                Object objZzi = zzi((zzgmr) zzgfnVar, zzgftVarZza, clsZza);
                if (objZzi == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsZza.toString() + " for key of type " + zzgvbVarZze.zzc().zzg() + ", see https://developers.google.com/tink/registration_errors");
                }
                if (zzgvbVarZze.zza() == this.zza.zzc()) {
                    zzgooVarZza.zzb(objZzi, zzgftVarZza, zzgvbVarZze);
                } else {
                    zzgooVarZza.zza(objZzi, zzgftVarZza, zzgvbVarZze);
                }
            }
        }
        return zzgnr.zza().zzd(zzgooVarZza.zzd(), cls);
    }
}
