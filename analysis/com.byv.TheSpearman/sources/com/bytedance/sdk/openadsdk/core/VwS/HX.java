package com.bytedance.sdk.openadsdk.core.VwS;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import org.json.JSONException;

/* compiled from: ViewabilityTrackerForVideo.java */
/* loaded from: classes2.dex */
public class HX extends VwS {
    private boolean IPb;
    private final MediaEvents Kbd;

    public HX(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.Kbd = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.VwS
    public void EYQ(boolean z, float f) {
        if (z) {
            this.Pm = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.Pm = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        EYQ(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.VwS
    public void EYQ(float f, boolean z) throws JSONException {
        if (EYQ()) {
            this.Kbd.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.VwS
    public void EYQ(boolean z) throws JSONException {
        this.IPb = z;
        mZx(12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.VwS
    public void mZx(int i) throws JSONException {
        if (EYQ()) {
            switch (i) {
                case 0:
                    this.Kbd.pause();
                    break;
                case 1:
                    this.Kbd.resume();
                    break;
                case 2:
                case 14:
                    this.Kbd.skipped();
                    break;
                case 4:
                    this.Kbd.bufferStart();
                    break;
                case 5:
                    this.Kbd.bufferFinish();
                    break;
                case 6:
                    this.Kbd.firstQuartile();
                    break;
                case 7:
                    this.Kbd.midpoint();
                    break;
                case 8:
                    this.Kbd.thirdQuartile();
                    break;
                case 9:
                    this.Kbd.complete();
                    break;
                case 10:
                    this.Kbd.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.Kbd.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.Kbd.volumeChange(this.IPb ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.Kbd.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }
}
