package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.MediaItem;

@Deprecated
/* loaded from: classes2.dex */
public interface DrmSessionManagerProvider {
    DrmSessionManager get(MediaItem mediaItem);
}
