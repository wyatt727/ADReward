package com.my.target;

import com.my.target.common.models.ImageData;

/* loaded from: classes4.dex */
public abstract class p3 extends b {
    private float allowCloseDelay;
    private ImageData closeIcon;
    private boolean allowClose = true;
    private boolean allowBackButton = true;

    public p3() {
        this.clickArea = x0.q;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    public ImageData getCloseIcon() {
        return this.closeIcon;
    }

    public boolean isAllowBackButton() {
        return this.allowBackButton;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public void setAllowBackButton(boolean z) {
        this.allowBackButton = z;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setCloseIcon(ImageData imageData) {
        this.closeIcon = imageData;
    }
}
