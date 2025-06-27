package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgga {
    private final List zza = new ArrayList();
    private final zzgrs zzb = zzgrs.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgfy) it.next()).zza = false;
        }
    }

    public final zzgga zza(zzgfy zzgfyVar) {
        if (zzgfyVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgfyVar.zza) {
            zzd();
        }
        zzgfyVar.zzf = this;
        this.zza.add(zzgfyVar);
        return this;
    }

    public final zzgge zzb() throws GeneralSecurityException {
        int i;
        zzgur zzgurVar;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List list = this.zza;
        zzguz zzguzVarZzd = zzgvc.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i2 = 0;
        int i3 = 0;
        while (i3 < list2.size() - 1) {
            int i4 = i3 + 1;
            if (((zzgfy) list2.get(i3)).zze == zzgfz.zza && ((zzgfy) list2.get(i4)).zze != zzgfz.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        zzggd zzggdVar = null;
        Integer num = null;
        for (zzgfy zzgfyVar : this.zza) {
            zzgfv unused = zzgfyVar.zzb;
            if (zzgfyVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgfyVar.zze == zzgfz.zza) {
                i = i2;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = i2;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[i2] & 255) << 24) | ((bArr[c] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                zzgfz unused2 = zzgfyVar.zze;
                i = i2;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            zzgfy.zza(zzgfyVar);
            zzgft zzgftVarZza = zzgnk.zzb().zza(zzgfyVar.zzd, c != zzgfyVar.zzd.zza() ? null : numValueOf);
            zzggc zzggcVar = new zzggc(zzgftVarZza, zzgfyVar.zzb, i, zzgfyVar.zza, null);
            zzgfv zzgfvVar = zzgfyVar.zzb;
            zzgot zzgotVar = (zzgot) zzgnu.zzc().zzd(zzgftVarZza, zzgot.class, zzggn.zza());
            Integer numZzf = zzgotVar.zzf();
            if (numZzf != null && numZzf.intValue() != i) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (zzgfv.zza.equals(zzgfvVar)) {
                zzgurVar = zzgur.ENABLED;
            } else if (zzgfv.zzb.equals(zzgfvVar)) {
                zzgurVar = zzgur.DISABLED;
            } else {
                if (!zzgfv.zzc.equals(zzgfvVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                zzgurVar = zzgur.DESTROYED;
            }
            zzgva zzgvaVarZze = zzgvb.zze();
            zzgum zzgumVarZza = zzgup.zza();
            zzgumVarZza.zzb(zzgotVar.zzg());
            zzgumVarZza.zzc(zzgotVar.zze());
            zzgumVarZza.zza(zzgotVar.zzb());
            zzgvaVarZze.zza(zzgumVarZza);
            zzgvaVarZze.zzd(zzgurVar);
            zzgvaVarZze.zzb(i);
            zzgvaVarZze.zzc(zzgotVar.zzc());
            zzguzVarZzd.zza((zzgvb) zzgvaVarZze.zzbr());
            if (zzgfyVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgfyVar.zzb != zzgfv.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzggcVar);
            c = 1;
            i2 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzguzVarZzd.zzb(num.intValue());
        zzgvc zzgvcVar = (zzgvc) zzguzVarZzd.zzbr();
        zzgge.zzh(zzgvcVar);
        return new zzgge(zzgvcVar, arrayList, this.zzb, zzggdVar);
    }
}
