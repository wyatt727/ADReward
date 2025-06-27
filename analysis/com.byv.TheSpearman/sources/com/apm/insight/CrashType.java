package com.apm.insight;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.my.tracker.ads.AdFormat;

/* loaded from: classes.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE(AdFormat.NATIVE),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL(TtmlNode.COMBINE_ALL);

    private String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
