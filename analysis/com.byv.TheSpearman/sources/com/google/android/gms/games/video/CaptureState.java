package com.google.android.gms.games.video;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class CaptureState {
    private final boolean zzmf;
    private final int zzmg;
    private final int zzmh;
    private final boolean zzmi;
    private final boolean zzmj;

    private CaptureState(boolean z, int i, int i2, boolean z2, boolean z3) {
        Preconditions.checkArgument(VideoConfiguration.isValidCaptureMode(i, true));
        Preconditions.checkArgument(VideoConfiguration.isValidQualityLevel(i2, true));
        this.zzmf = z;
        this.zzmg = i;
        this.zzmh = i2;
        this.zzmi = z2;
        this.zzmj = z3;
    }

    public final boolean isCapturing() {
        return this.zzmf;
    }

    public final int getCaptureMode() {
        return this.zzmg;
    }

    public final int getCaptureQuality() {
        return this.zzmh;
    }

    public final boolean isOverlayVisible() {
        return this.zzmi;
    }

    public final boolean isPaused() {
        return this.zzmj;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("IsCapturing", Boolean.valueOf(this.zzmf)).add("CaptureMode", Integer.valueOf(this.zzmg)).add("CaptureQuality", Integer.valueOf(this.zzmh)).add("IsOverlayVisible", Boolean.valueOf(this.zzmi)).add("IsPaused", Boolean.valueOf(this.zzmj)).toString();
    }

    public static CaptureState zza(Bundle bundle) {
        if (bundle == null || bundle.get("IsCapturing") == null) {
            return null;
        }
        return new CaptureState(bundle.getBoolean("IsCapturing", false), bundle.getInt("CaptureMode", -1), bundle.getInt("CaptureQuality", -1), bundle.getBoolean("IsOverlayVisible", false), bundle.getBoolean("IsPaused", false));
    }
}
