package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegf {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzegf(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(this.zzb);
        this.zza = measurementManagerFuturesFrom;
        return measurementManagerFuturesFrom == null ? zzgee.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.zza;
        Objects.requireNonNull(measurementManagerFutures);
        return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
    }
}
