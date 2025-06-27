package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzng extends zzne {
    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    final Uri.Builder zza(String str) {
        String strZzf = zzm().zzf(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(zze().zzd(str, zzbf.zzax));
        if (TextUtils.isEmpty(strZzf)) {
            builder.authority(zze().zzd(str, zzbf.zzay));
        } else {
            builder.authority(strZzf + "." + zze().zzd(str, zzbf.zzay));
        }
        builder.path(zze().zzd(str, zzbf.zzaz));
        return builder;
    }

    public final Pair<zznf, Boolean> zzb(String str) throws IllegalStateException {
        zzg zzgVarZze;
        boolean z = true;
        if (zzqr.zza() && zze().zza(zzbf.zzbt)) {
            zzq();
            if (zzny.zzf(str)) {
                zzj().zzp().zza("sgtm feature flag enabled.");
                zzg zzgVarZze2 = zzh().zze(str);
                if (zzgVarZze2 != null) {
                    String strZzad = zzgVarZze2.zzad();
                    zzfo.zzd zzdVarZzc = zzm().zzc(str);
                    if (zzdVarZzc == null || (zzgVarZze = zzh().zze(str)) == null || ((!zzdVarZzc.zzr() || zzdVarZzc.zzh().zza() != 100) && !zzq().zzd(str, zzgVarZze.zzam()) && (TextUtils.isEmpty(strZzad) || strZzad.hashCode() % 100 >= zzdVarZzc.zzh().zza()))) {
                        z = false;
                    }
                    if (z) {
                        zznf zznfVar = null;
                        if (zzgVarZze2.zzat()) {
                            zzj().zzp().zza("sgtm upload enabled in manifest.");
                            zzfo.zzd zzdVarZzc2 = zzm().zzc(zzgVarZze2.zzac());
                            if (zzdVarZzc2 != null && zzdVarZzc2.zzr()) {
                                String strZze = zzdVarZzc2.zzh().zze();
                                if (!TextUtils.isEmpty(strZze)) {
                                    String strZzd = zzdVarZzc2.zzh().zzd();
                                    zzj().zzp().zza("sgtm configured with upload_url, server_info", strZze, TextUtils.isEmpty(strZzd) ? "Y" : "N");
                                    if (TextUtils.isEmpty(strZzd)) {
                                        zznfVar = new zznf(strZze);
                                    } else {
                                        HashMap map = new HashMap();
                                        map.put("x-sgtm-server-info", strZzd);
                                        if (!TextUtils.isEmpty(zzgVarZze2.zzam())) {
                                            map.put("x-gtm-server-preview", zzgVarZze2.zzam());
                                        }
                                        zznfVar = new zznf(strZze, map);
                                    }
                                }
                            }
                        }
                        if (zznfVar != null) {
                            return Pair.create(zznfVar, false);
                        }
                    } else {
                        return Pair.create(new zznf(zzc(str)), true);
                    }
                } else {
                    return Pair.create(new zznf(zzc(str)), true);
                }
            }
        }
        return Pair.create(new zznf(zzc(str)), true);
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzgz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzmi zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzng zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zznr g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    private final String zzc(String str) throws Throwable {
        String strZzf = zzm().zzf(str);
        if (!TextUtils.isEmpty(strZzf)) {
            Uri uri = Uri.parse(zzbf.zzq.zza(null));
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.authority(strZzf + "." + uri.getAuthority());
            return builderBuildUpon.build().toString();
        }
        return zzbf.zzq.zza(null);
    }

    zzng(zzni zzniVar) {
        super(zzniVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }
}
