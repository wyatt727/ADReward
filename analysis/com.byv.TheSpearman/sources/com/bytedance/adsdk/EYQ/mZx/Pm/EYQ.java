package com.bytedance.adsdk.EYQ.mZx.Pm;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KeyWord.java */
/* loaded from: classes2.dex */
public enum EYQ implements Kbd {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, EYQ> Pm = new HashMap(128);

    static {
        for (EYQ eyq : values()) {
            Pm.put(eyq.name().toLowerCase(), eyq);
        }
    }

    public static EYQ EYQ(String str) {
        return Pm.get(str.toLowerCase());
    }
}
