package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdz;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzy extends zzw {
    static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                zzg zzgVarZzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(String.valueOf(str));
                }
                zzgVarZzi.zzB(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzu.zzo().zzi().zzB("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbf)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzy.zzl(activity, view, windowInsets);
                }
            });
        }
    }
}
