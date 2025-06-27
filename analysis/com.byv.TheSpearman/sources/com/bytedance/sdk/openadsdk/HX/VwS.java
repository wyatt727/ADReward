package com.bytedance.sdk.openadsdk.HX;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: VolumeChangeObserver.java */
/* loaded from: classes2.dex */
public class VwS {
    private final AudioManager EYQ;
    private int mZx = -1;
    private boolean Td = false;

    public VwS(Context context) {
        this.EYQ = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int EYQ() {
        return this.mZx;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public boolean mZx() {
        if (!this.Td) {
            return false;
        }
        this.Td = false;
        return true;
    }

    public void EYQ(boolean z) {
        EYQ(z, false);
    }

    public void EYQ(boolean z, boolean z2) {
        if (this.EYQ == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iVwS = DeviceUtils.VwS();
            if (iVwS != 0) {
                this.mZx = iVwS;
            }
            EYQ(3, 0, 0);
            this.Td = true;
            return;
        }
        int iHX = this.mZx;
        if (iHX == 0) {
            iHX = DeviceUtils.HX() / 15;
        } else {
            if (iHX == -1) {
                if (!z2) {
                    return;
                } else {
                    iHX = DeviceUtils.HX() / 15;
                }
            }
            this.mZx = -1;
            EYQ(3, iHX, i);
            this.Td = true;
        }
        i = 1;
        this.mZx = -1;
        EYQ(3, iHX, i);
        this.Td = true;
    }

    private void EYQ(int i, int i2, int i3) {
        try {
            this.EYQ.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
