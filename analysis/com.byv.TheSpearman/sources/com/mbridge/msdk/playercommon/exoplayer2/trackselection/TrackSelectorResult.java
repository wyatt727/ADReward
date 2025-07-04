package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final TrackSelectionArray selections;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = new TrackSelectionArray(trackSelectionArr);
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public final boolean isRendererEnabled(int i) {
        return this.rendererConfigurations[i] != null;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i = 0; i < this.selections.length; i++) {
            if (!isEquivalent(trackSelectorResult, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i], trackSelectorResult.rendererConfigurations[i]) && Util.areEqual(this.selections.get(i), trackSelectorResult.selections.get(i));
    }
}
