package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ai;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {
    private Handler e = new Handler(Looper.getMainLooper());

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(final Object obj, final String str) {
        if (ai.g()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.1
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(final Object obj, final String str) {
        if (ai.g()) {
            super.install(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.2
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.install(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.3
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.notifyCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.4
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.toggleCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.5
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(final Object obj, final String str) {
        if (ai.g()) {
            super.setOrientation(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.6
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.setOrientation(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(final Object obj, final String str) {
        if (ai.g()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.7
                @Override // java.lang.Runnable
                public final void run() {
                    RewardSignal.super.handlerPlayableException(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(final Object obj, final String str) throws JSONException {
        if (ai.g()) {
            super.openURL(obj, str);
        } else {
            this.e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.RewardSignal.8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    RewardSignal.super.openURL(obj, str);
                }
            });
        }
    }
}
