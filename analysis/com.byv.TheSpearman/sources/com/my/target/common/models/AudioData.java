package com.my.target.common.models;

import com.my.target.core.models.a;

/* loaded from: classes4.dex */
public final class AudioData extends a<String> {
    private int bitrate;

    private AudioData(String str) {
        super(str);
    }

    public static AudioData newAudioData(String str) {
        return new AudioData(str);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }
}
