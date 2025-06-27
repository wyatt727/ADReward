package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: JSVideoModule.java */
/* loaded from: classes4.dex */
public final class q extends r {
    public q(MBridgeVideoView mBridgeVideoView) {
        this.f3773a = mBridgeVideoView;
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super.showVideoLocation(i, i2, i3, i4, i5, i6, i7, i8, i9);
        if (this.f3773a != null) {
            this.f3773a.showVideoLocation(i, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void soundOperate(int i, int i2) {
        super.soundOperate(i, i2);
        if (this.f3773a != null) {
            this.f3773a.soundOperate(i, i2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void soundOperate(int i, int i2, String str) {
        super.soundOperate(i, i2, str);
        if (this.f3773a != null) {
            this.f3773a.soundOperate(i, i2, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void videoOperate(int i) {
        super.videoOperate(i);
        if (this.f3773a != null) {
            this.f3773a.videoOperate(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void closeVideoOperate(int i, int i2) {
        super.closeVideoOperate(i, i2);
        if (this.f3773a != null) {
            this.f3773a.closeVideoOperate(i, i2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void progressOperate(int i, int i2) {
        super.progressOperate(i, i2);
        if (this.f3773a != null) {
            this.f3773a.progressOperate(i, i2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void progressBarOperate(int i) {
        super.progressBarOperate(i);
        if (this.f3773a != null) {
            this.f3773a.progressBarOperate(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final String getCurrentProgress() {
        if (this.f3773a != null) {
            return this.f3773a.getCurrentProgress();
        }
        return super.getCurrentProgress();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setVisible(int i) {
        if (this.f3773a != null) {
            this.f3773a.setVisible(i);
        } else {
            super.setVisible(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setCover(boolean z) {
        if (this.f3773a != null) {
            this.f3773a.setCover(z);
        } else {
            super.setCover(z);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setScaleFitXY(int i) {
        if (this.f3773a != null) {
            this.f3773a.setScaleFitXY(i);
        } else {
            super.setScaleFitXY(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final boolean isH5Canvas() {
        if (this.f3773a != null) {
            return this.f3773a.isH5Canvas();
        }
        return super.isH5Canvas();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewWidth() {
        if (this.f3773a != null) {
            return this.f3773a.getBorderViewWidth();
        }
        return super.getBorderViewWidth();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewHeight() {
        if (this.f3773a != null) {
            return this.f3773a.getBorderViewHeight();
        }
        return super.getBorderViewHeight();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewRadius() {
        if (this.f3773a != null) {
            return this.f3773a.getBorderViewRadius();
        }
        return super.getBorderViewRadius();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewTop() {
        if (this.f3773a != null) {
            return this.f3773a.getBorderViewTop();
        }
        return super.getBorderViewTop();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewLeft() {
        if (this.f3773a != null) {
            return this.f3773a.getBorderViewLeft();
        }
        return super.getBorderViewLeft();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showIVRewardAlertView(String str) {
        if (this.f3773a != null) {
            this.f3773a.showIVRewardAlertView(str);
        } else {
            super.showIVRewardAlertView(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void hideAlertView(int i) {
        if (this.f3773a != null) {
            this.f3773a.hideAlertView(i);
        } else {
            super.hideAlertView(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void alertWebViewShowed() {
        if (this.f3773a != null) {
            this.f3773a.alertWebViewShowed();
        } else {
            super.alertWebViewShowed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showAlertView() {
        if (this.f3773a != null) {
            this.f3773a.showAlertView();
        } else {
            super.showAlertView();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void dismissAllAlert() {
        if (this.f3773a != null) {
            this.f3773a.dismissAllAlert();
        } else {
            super.dismissAllAlert();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setMiniEndCardState(boolean z) {
        if (this.f3773a != null) {
            this.f3773a.setMiniEndCardState(z);
        } else {
            super.setMiniEndCardState(z);
        }
    }
}
