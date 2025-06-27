package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final Parcelable.Creator<VideoConfiguration> CREATOR = new zzb();
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;
    private final int zzmg;
    private final int zzmk;
    private final boolean zzml;
    private final boolean zzmm;
    private final boolean zzmn;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ValidCaptureModes {
    }

    public VideoConfiguration(int i, int i2, boolean z, boolean z2, boolean z3) {
        Preconditions.checkArgument(isValidQualityLevel(i, false));
        Preconditions.checkArgument(isValidCaptureMode(i2, false));
        this.zzmk = i;
        this.zzmg = i2;
        this.zzml = z;
        this.zzmm = z2;
        this.zzmn = z3;
    }

    public static boolean isValidCaptureMode(int i, boolean z) {
        if (i != -1) {
            if (i == 0) {
                return true;
            }
            if (i != 1) {
                return false;
            }
        }
        return z;
    }

    public static boolean isValidQualityLevel(int i, boolean z) {
        if (i != -1) {
            z = true;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                return false;
            }
        }
        return z;
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class Builder {
        private int zzmg;
        private int zzmk;
        private boolean zzmm = true;
        private boolean zzmn = true;
        private boolean zzml = true;

        public Builder(int i, int i2) {
            this.zzmk = i;
            this.zzmg = i2;
        }

        public final Builder setQualityLevel(int i) {
            this.zzmk = i;
            return this;
        }

        public final Builder setCaptureMode(int i) {
            this.zzmg = i;
            return this;
        }

        public final Builder setMicEnabled(boolean z) {
            this.zzmn = z;
            return this;
        }

        public final Builder setCameraEnabled(boolean z) {
            this.zzmm = z;
            return this;
        }

        public final VideoConfiguration build() {
            return new VideoConfiguration(this.zzmk, this.zzmg, this.zzml, this.zzmm, this.zzmn);
        }
    }

    public final int getQualityLevel() {
        return this.zzmk;
    }

    public final int getCaptureMode() {
        return this.zzmg;
    }

    public final boolean getCameraEnabled() {
        return this.zzmm;
    }

    public final boolean getMicEnabled() {
        return this.zzmn;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getQualityLevel());
        SafeParcelWriter.writeInt(parcel, 2, getCaptureMode());
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzml);
        SafeParcelWriter.writeBoolean(parcel, 8, getCameraEnabled());
        SafeParcelWriter.writeBoolean(parcel, 9, getMicEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
