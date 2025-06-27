package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdnk {
    private final com.google.android.gms.ads.internal.util.zzbq zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdnk(com.google.android.gms.ads.internal.util.zzbq zzbqVar, Clock clock, Executor executor) {
        this.zza = zzbqVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.zzb.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            com.google.android.gms.ads.internal.util.zze.zza("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap zza(double d, boolean z, zzaqm zzaqmVar) {
        byte[] bArr = zzaqmVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgj)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgk)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final ListenableFuture zzb(String str, final double d, final boolean z) {
        return zzgee.zzm(this.zza.zza(str), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdnj
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return this.zza.zza(d, z, (zzaqm) obj);
            }
        }, this.zzc);
    }
}
