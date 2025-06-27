package com.bytedance.sdk.openadsdk.core.VwS;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* compiled from: ViewabilityTracker.java */
/* loaded from: classes2.dex */
public class VwS {
    private final AdEvents IPb;
    private final AdSession Kbd;
    protected VastProperties Pm;
    protected String Td;
    private boolean VwS = false;
    protected boolean EYQ = false;
    protected int mZx = 0;

    void EYQ(float f, boolean z) {
    }

    public void EYQ(boolean z) {
    }

    public void EYQ(boolean z, float f) {
    }

    void mZx(int i) {
    }

    public VwS(AdSession adSession, AdEvents adEvents, View view) {
        this.Kbd = adSession;
        this.IPb = adEvents;
        this.Td = adSession.getAdSessionId();
        EYQ(view);
    }

    void EYQ(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.Kbd) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void EYQ(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.Kbd;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean EYQ() {
        return this.EYQ;
    }

    public void EYQ(int i) {
        int i2;
        int i3;
        if (this.Kbd == null || this.IPb == null) {
            return;
        }
        boolean z = false;
        if (Kbd.Td()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (i3 = this.mZx) != 0 && i3 != 4) {
                            this.Kbd.finish();
                            this.EYQ = false;
                            z = true;
                        }
                    } else if (!this.VwS && ((i2 = this.mZx) == 1 || i2 == 2)) {
                        this.IPb.impressionOccurred();
                        this.VwS = true;
                        z = true;
                    }
                } else if (this.mZx == 0) {
                    this.Kbd.start();
                    if (this.Pm == null) {
                        this.Pm = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.IPb.loaded(this.Pm);
                    this.EYQ = true;
                    this.Pm = null;
                    z = true;
                }
            } else if (this.mZx == 0) {
                this.Kbd.start();
                this.IPb.loaded();
                this.EYQ = true;
                z = true;
            }
        }
        if (z) {
            this.mZx = i;
        }
    }

    void mZx() {
        EYQ(1);
    }

    void Td() {
        EYQ(4);
    }

    public void Pm() {
        EYQ(3);
    }

    public void EYQ(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            EYQ((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
