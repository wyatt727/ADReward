package com.my.target;

import com.my.target.common.models.AudioData;
import com.my.target.common.models.VideoData;
import com.my.target.core.models.a;

/* loaded from: classes4.dex */
public final class b5<T extends com.my.target.core.models.a> extends f0 {
    private T mediaData;

    private b5() {
    }

    public static b5<AudioData> newAudioBanner() {
        return newBanner();
    }

    public static <T extends com.my.target.core.models.a> b5<T> newBanner() {
        return new b5<>();
    }

    public static b5<VideoData> newVideoBanner() {
        return newBanner();
    }

    @Override // com.my.target.b
    public int getHeight() {
        T t = this.mediaData;
        if (t != null) {
            return t.getHeight();
        }
        return 0;
    }

    public T getMediaData() {
        return this.mediaData;
    }

    @Override // com.my.target.b
    public int getWidth() {
        T t = this.mediaData;
        if (t != null) {
            return t.getWidth();
        }
        return 0;
    }

    public void setMediaData(T t) {
        this.mediaData = t;
    }
}
