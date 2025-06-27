package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzftw {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zza = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        zzb = ClipData.newIntent("", new Intent());
    }

    @Nullable
    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    @Nullable
    public static PendingIntent zzb(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getService(context, 0, zzc(intent, i2, 0), i2);
    }

    private static Intent zzc(Intent intent, int i, int i2) {
        boolean z = true;
        zzfwr.zzf((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfwr.zzf((i & 1) == 0 || zzd(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzfwr.zzf((i & 2) == 0 || zzd(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzfwr.zzf((i & 4) == 0 || zzd(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzfwr.zzf((i & 128) == 0 || zzd(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzfwr.zzf(intent.getComponent() != null, "Must set component on Intent.");
        if (zzd(0, 1)) {
            zzfwr.zzf(!zzd(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzd(i, 67108864)) {
                z = false;
            }
            zzfwr.zzf(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzd(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i, int i2) {
        return (i & i2) == i2;
    }
}
