package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcdo {
    private final Context zza;
    private final String zzb;
    private final VersionInfoParcel zzc;
    private final zzbel zzd;
    private final zzbeo zze;
    private final com.google.android.gms.ads.internal.util.zzbh zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcct zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcdo(Context context, VersionInfoParcel versionInfoParcel, String str, zzbeo zzbeoVar, zzbel zzbelVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbfVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = str;
        this.zze = zzbeoVar;
        this.zzd = zzbelVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzcct zzcctVar) {
        zzbeg.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcctVar.zzj());
        this.zzn = zzcctVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbeg.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbeg.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbgh.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(AdActivity.REQUEST_KEY_EXTRA, this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzf.zza()) {
            String strValueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbeVar.zze));
            String strValueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbeVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzu.zzp().zzh(this.zza, this.zzc.afmaVersion, "gmob-apps", bundle, true);
                this.zzo = true;
                return;
            }
            String str = this.zzh[i];
            if (str != null) {
                Long lValueOf = Long.valueOf(jArr[i]);
                Objects.toString(lValueOf);
                bundle.putString("fh_".concat(lValueOf.toString()), str);
            }
            i++;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcct zzcctVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbeg.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long jNanoTime = com.google.android.gms.ads.internal.zzu.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = jNanoTime;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzB)).longValue();
        long jZza = zzcctVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jZza - this.zzg[i])) {
                String[] strArr2 = this.zzh;
                int i2 = 8;
                Bitmap bitmap = zzcctVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
