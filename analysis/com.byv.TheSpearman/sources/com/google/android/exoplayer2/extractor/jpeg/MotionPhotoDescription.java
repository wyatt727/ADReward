package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j, long j2) {
            this.mime = str;
            this.semantic = str2;
            this.length = j;
            this.padding = j2;
        }
    }

    public MotionPhotoDescription(long j, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j;
        this.items = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j) {
        long j2;
        if (this.items.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean zEquals = "video/mp4".equals(containerItem.mime) | z;
            if (size == 0) {
                j2 = j3 - containerItem.padding;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= containerItem.length;
                j2 = j8;
            }
            if (!zEquals || j3 == j2) {
                z = zEquals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.photoPresentationTimestampUs, j6, j7);
    }
}
