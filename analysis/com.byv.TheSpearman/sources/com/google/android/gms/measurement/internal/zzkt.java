package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzql;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkt extends zznd {
    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    public zzkt(zzni zzniVar) {
        super(zzniVar);
    }

    public final byte[] zza(zzbd zzbdVar, String str) throws IllegalStateException {
        zznv next;
        Bundle bundle;
        zzfu.zzj.zza zzaVar;
        zzfu.zzi.zzb zzbVar;
        zzg zzgVar;
        byte[] bArr;
        long j;
        zzaz zzazVarZza;
        zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zze(str, zzbf.zzbf)) {
            zzj().zzc().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbdVar.zza) && !"_iapx".equals(zzbdVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzbdVar.zza);
            return null;
        }
        zzfu.zzi.zzb zzbVarZzb = zzfu.zzi.zzb();
        zzh().zzp();
        try {
            zzg zzgVarZze = zzh().zze(str);
            if (zzgVarZze == null) {
                zzj().zzc().zza("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zzgVarZze.zzar()) {
                zzj().zzc().zza("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfu.zzj.zza zzaVarZzp = zzfu.zzj.zzv().zzh(1).zzp("android");
            if (!TextUtils.isEmpty(zzgVarZze.zzac())) {
                zzaVarZzp.zzb(zzgVarZze.zzac());
            }
            if (!TextUtils.isEmpty(zzgVarZze.zzae())) {
                zzaVarZzp.zzd((String) Preconditions.checkNotNull(zzgVarZze.zzae()));
            }
            if (!TextUtils.isEmpty(zzgVarZze.zzaf())) {
                zzaVarZzp.zze((String) Preconditions.checkNotNull(zzgVarZze.zzaf()));
            }
            if (zzgVarZze.zze() != -2147483648L) {
                zzaVarZzp.zze((int) zzgVarZze.zze());
            }
            zzaVarZzp.zzf(zzgVarZze.zzq()).zzd(zzgVarZze.zzo());
            String strZzah = zzgVarZze.zzah();
            String strZzaa = zzgVarZze.zzaa();
            if (!TextUtils.isEmpty(strZzah)) {
                zzaVarZzp.zzm(strZzah);
            } else if (!TextUtils.isEmpty(strZzaa)) {
                zzaVarZzp.zza(strZzaa);
            }
            zzaVarZzp.zzj(zzgVarZze.zzw());
            zziq zziqVarZzb = this.zzf.zzb(str);
            zzaVarZzp.zzc(zzgVarZze.zzn());
            if (this.zzu.zzac() && zze().zzk(zzaVarZzp.zzt()) && zziqVarZzb.zzi() && !TextUtils.isEmpty(null)) {
                zzaVarZzp.zzj((String) null);
            }
            zzaVarZzp.zzg(zziqVarZzb.zzg());
            if (zziqVarZzb.zzi() && zzgVarZze.zzaq()) {
                Pair<String, Boolean> pairZza = zzn().zza(zzgVarZze.zzac(), zziqVarZzb);
                if (zzgVarZze.zzaq() && pairZza != null && !TextUtils.isEmpty((CharSequence) pairZza.first)) {
                    zzaVarZzp.zzq(zza((String) pairZza.first, Long.toString(zzbdVar.zzd)));
                    if (pairZza.second != null) {
                        zzaVarZzp.zzc(((Boolean) pairZza.second).booleanValue());
                    }
                }
            }
            zzf().zzac();
            zzfu.zzj.zza zzaVarZzi = zzaVarZzp.zzi(Build.MODEL);
            zzf().zzac();
            zzaVarZzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzg()).zzs(zzf().zzh());
            if (zziqVarZzb.zzj() && zzgVarZze.zzad() != null) {
                zzaVarZzp.zzc(zza((String) Preconditions.checkNotNull(zzgVarZze.zzad()), Long.toString(zzbdVar.zzd)));
            }
            if (!TextUtils.isEmpty(zzgVarZze.zzag())) {
                zzaVarZzp.zzl((String) Preconditions.checkNotNull(zzgVarZze.zzag()));
            }
            String strZzac = zzgVarZze.zzac();
            List<zznv> listZzk = zzh().zzk(strZzac);
            Iterator<zznv> it = listZzk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.zzc)) {
                    break;
                }
            }
            if (next == null || next.zze == null) {
                zznv zznvVar = new zznv(strZzac, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                listZzk.add(zznvVar);
                zzh().zza(zznvVar);
            }
            zzfu.zzn[] zznVarArr = new zzfu.zzn[listZzk.size()];
            for (int i = 0; i < listZzk.size(); i++) {
                zzfu.zzn.zza zzaVarZzb = zzfu.zzn.zze().zza(listZzk.get(i).zzc).zzb(listZzk.get(i).zzd);
                g_().zza(zzaVarZzb, listZzk.get(i).zze);
                zznVarArr[i] = (zzfu.zzn) ((com.google.android.gms.internal.measurement.zzjv) zzaVarZzb.zzah());
            }
            zzaVarZzp.zze(Arrays.asList(zznVarArr));
            g_().zza(zzaVarZzp);
            this.zzf.zza(zzgVarZze, zzaVarZzp);
            zzgd zzgdVarZza = zzgd.zza(zzbdVar);
            zzq().zza(zzgdVarZza.zzb, zzh().zzd(str));
            zzq().zza(zzgdVarZza, zze().zzb(str));
            Bundle bundle2 = zzgdVarZza.zzb;
            bundle2.putLong("_c", 1L);
            zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", zzbdVar.zzc);
            if (zzq().zzd(zzaVarZzp.zzt(), zzgVarZze.zzam())) {
                zzq().zza(bundle2, "_dbg", (Object) 1L);
                zzq().zza(bundle2, "_r", (Object) 1L);
            }
            zzaz zzazVarZzd = zzh().zzd(str, zzbdVar.zza);
            if (zzazVarZzd == null) {
                bundle = bundle2;
                zzaVar = zzaVarZzp;
                zzbVar = zzbVarZzb;
                zzgVar = zzgVarZze;
                bArr = null;
                zzazVarZza = new zzaz(str, zzbdVar.zza, 0L, 0L, zzbdVar.zzd, 0L, null, null, null, null);
                j = 0;
            } else {
                bundle = bundle2;
                zzaVar = zzaVarZzp;
                zzbVar = zzbVarZzb;
                zzgVar = zzgVarZze;
                bArr = null;
                j = zzazVarZzd.zzf;
                zzazVarZza = zzazVarZzd.zza(zzbdVar.zzd);
            }
            zzh().zza(zzazVarZza);
            zzba zzbaVar = new zzba(this.zzu, zzbdVar.zzc, str, zzbdVar.zza, zzbdVar.zzd, j, bundle);
            zzfu.zze.zza zzaVarZza = zzfu.zze.zze().zzb(zzbaVar.zzc).zza(zzbaVar.zzb).zza(zzbaVar.zzd);
            Iterator<String> it2 = zzbaVar.zze.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                zzfu.zzg.zza zzaVarZza2 = zzfu.zzg.zze().zza(next2);
                Object objZzc = zzbaVar.zze.zzc(next2);
                if (objZzc != null) {
                    g_().zza(zzaVarZza2, objZzc);
                    zzaVarZza.zza(zzaVarZza2);
                }
            }
            zzfu.zzj.zza zzaVar2 = zzaVar;
            zzaVar2.zza(zzaVarZza).zza(zzfu.zzk.zza().zza(zzfu.zzf.zza().zza(zzazVarZza.zzc).zza(zzbdVar.zza)));
            zzaVar2.zza(zzg().zza(zzgVar.zzac(), Collections.emptyList(), zzaVar2.zzab(), Long.valueOf(zzaVarZza.zzc()), Long.valueOf(zzaVarZza.zzc())));
            if (zzaVarZza.zzg()) {
                zzaVar2.zzi(zzaVarZza.zzc()).zze(zzaVarZza.zzc());
            }
            long jZzs = zzgVar.zzs();
            if (jZzs != 0) {
                zzaVar2.zzg(jZzs);
            }
            long jZzu = zzgVar.zzu();
            if (jZzu != 0) {
                zzaVar2.zzh(jZzu);
            } else if (jZzs != 0) {
                zzaVar2.zzh(jZzs);
            }
            String strZzal = zzgVar.zzal();
            if (zzql.zza() && zze().zze(str, zzbf.zzbs) && strZzal != null) {
                zzaVar2.zzr(strZzal);
            }
            zzgVar.zzap();
            zzfu.zzj.zza zzaVarZzk = zzaVar2.zzf((int) zzgVar.zzt()).zzl(92000L).zzk(zzb().currentTimeMillis());
            Boolean bool = Boolean.TRUE;
            zzaVarZzk.zzd(true);
            if (zze().zza(zzbf.zzbx)) {
                this.zzf.zza(zzaVar2.zzt(), zzaVar2);
            }
            zzfu.zzi.zzb zzbVar2 = zzbVar;
            zzbVar2.zza(zzaVar2);
            zzg zzgVar2 = zzgVar;
            zzgVar2.zzr(zzaVar2.zzf());
            zzgVar2.zzp(zzaVar2.zze());
            zzh().zza(zzgVar2, false, false);
            zzh().zzw();
            try {
                return g_().zzb(((zzfu.zzi) ((com.google.android.gms.internal.measurement.zzjv) zzbVar2.zzah())).zzbx());
            } catch (IOException e) {
                zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfz.zza(str), e);
                return bArr;
            }
        } catch (SecurityException e2) {
            zzj().zzc().zza("app instance id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            zzj().zzc().zza("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            zzh().zzu();
        }
    }
}
