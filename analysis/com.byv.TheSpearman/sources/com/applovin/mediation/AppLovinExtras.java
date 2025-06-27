package com.applovin.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public class AppLovinExtras {

    public static class Keys {
        public static final String KEY_WATERMARK = "google_watermark";
        public static final String MUTE_AUDIO = "mute_audio";

        private Keys() {
        }
    }

    public static class Builder {
        private boolean muteAudio;

        public Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean(Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }
    }
}
