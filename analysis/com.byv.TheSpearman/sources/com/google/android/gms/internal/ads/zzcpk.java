package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpk {
    zzbvu zza;
    zzbvu zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzegf zze;
    private final zzdrn zzf;
    private final zzgep zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcpk(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzegf zzegfVar, zzdrn zzdrnVar, zzgep zzgepVar, zzgep zzgepVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzegfVar;
        this.zzf = zzdrnVar;
        this.zzg = zzgepVar;
        this.zzh = zzgepVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjV));
    }

    private final ListenableFuture zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjV)) || this.zzd.zzO()) {
            return zzgee.zzh(str);
        }
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjW), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent != null) {
            return zzgee.zzf(zzgee.zzn(zzgdv.zzu(this.zze.zza()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpe
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzd(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.zzh), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpf
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zze(builderBuildUpon, (Throwable) obj);
                }
            }, this.zzg);
        }
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "11");
        return zzgee.zzh(builderBuildUpon.toString());
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgee.zzh(str) : zzgee.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(th);
            }
        });
        return zzgee.zzh(str);
    }

    final /* synthetic */ ListenableFuture zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "10");
            return zzgee.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjY), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjZ))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzka));
        }
        return zzgee.zzn(zzgdv.zzu(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpg
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgee.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "9");
        return zzgee.zzh(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue()) {
            zzbvu zzbvuVarZzc = zzbvs.zzc(this.zzc);
            this.zzb = zzbvuVarZzc;
            zzbvuVarZzc.zzg(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbvu zzbvuVarZza = zzbvs.zza(this.zzc);
            this.zza = zzbvuVarZza;
            zzbvuVarZza.zzg(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue()) {
            zzbvu zzbvuVarZzc = zzbvs.zzc(this.zzc);
            this.zzb = zzbvuVarZzc;
            zzbvuVarZzc.zzg(th, "AttributionReporting");
        } else {
            zzbvu zzbvuVarZza = zzbvs.zza(this.zzc);
            this.zza = zzbvuVarZza;
            zzbvuVarZza.zzg(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzfmt zzfmtVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgee.zzr(zzgee.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkb)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcpj(this, zzfmtVar, str), this.zzg);
    }
}
