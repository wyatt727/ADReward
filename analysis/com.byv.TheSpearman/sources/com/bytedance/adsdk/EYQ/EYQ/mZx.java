package com.bytedance.adsdk.EYQ.EYQ;

/* compiled from: UnParsedException.java */
/* loaded from: classes2.dex */
public class mZx extends RuntimeException {
    public mZx(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
