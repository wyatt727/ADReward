package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface SnapshotMetadataChange {
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class Builder {
        private String description;
        private Long zzla;
        private Long zzlb;
        private BitmapTeleporter zzlc;
        private Uri zzld;

        public final Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public final Builder setPlayedTimeMillis(long j) {
            this.zzla = Long.valueOf(j);
            return this;
        }

        public final Builder setProgressValue(long j) {
            this.zzlb = Long.valueOf(j);
            return this;
        }

        public final Builder setCoverImage(Bitmap bitmap) {
            this.zzlc = new BitmapTeleporter(bitmap);
            this.zzld = null;
            return this;
        }

        public final Builder fromMetadata(SnapshotMetadata snapshotMetadata) {
            this.description = snapshotMetadata.getDescription();
            this.zzla = Long.valueOf(snapshotMetadata.getPlayedTime());
            this.zzlb = Long.valueOf(snapshotMetadata.getProgressValue());
            if (this.zzla.longValue() == -1) {
                this.zzla = null;
            }
            Uri coverImageUri = snapshotMetadata.getCoverImageUri();
            this.zzld = coverImageUri;
            if (coverImageUri != null) {
                this.zzlc = null;
            }
            return this;
        }

        public final SnapshotMetadataChange build() {
            return new SnapshotMetadataChangeEntity(this.description, this.zzla, this.zzlc, this.zzld, this.zzlb);
        }
    }

    Bitmap getCoverImage();

    String getDescription();

    Long getPlayedTimeMillis();

    Long getProgressValue();

    BitmapTeleporter zzcl();
}
