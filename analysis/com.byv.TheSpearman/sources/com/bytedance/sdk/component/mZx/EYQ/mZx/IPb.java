package com.bytedance.sdk.component.mZx.EYQ.mZx;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: SegmentPool.java */
/* loaded from: classes2.dex */
final class IPb {
    static Kbd EYQ;
    static long mZx;

    private IPb() {
    }

    static Kbd EYQ() {
        synchronized (IPb.class) {
            Kbd kbd = EYQ;
            if (kbd != null) {
                EYQ = kbd.IPb;
                kbd.IPb = null;
                mZx -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return kbd;
            }
            return new Kbd();
        }
    }

    static void EYQ(Kbd kbd) {
        if (kbd.IPb != null || kbd.VwS != null) {
            throw new IllegalArgumentException();
        }
        if (kbd.Pm) {
            return;
        }
        synchronized (IPb.class) {
            long j = mZx;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            mZx = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            kbd.IPb = EYQ;
            kbd.Td = 0;
            kbd.mZx = 0;
            EYQ = kbd;
        }
    }
}
