package com.bytedance.adsdk.ugeno.core;

/* compiled from: UGenEventEnum.java */
/* loaded from: classes2.dex */
public enum tsL {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17);

    private String hYh;
    private int zF;

    tsL(String str, int i) {
        this.hYh = str;
        this.zF = i;
    }

    public int EYQ() {
        return this.zF;
    }

    public static tsL EYQ(String str) {
        for (tsL tsl : values()) {
            if (tsl.hYh.equals(str)) {
                return tsl;
            }
        }
        return UNKNOWN_EVENT;
    }
}
