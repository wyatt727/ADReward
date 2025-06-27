package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import com.applovin.mediation.AppLovinExtras;

/* loaded from: classes2.dex */
public final class MintegralExtras {

    static class Keys {
        static final String MUTE_AUDIO = "mute_audio";

        Keys() {
        }
    }

    public static class Builder {
        private boolean muteAudio;

        public Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(AppLovinExtras.Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }
    }
}
