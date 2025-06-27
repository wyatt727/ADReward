package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes2.dex */
public class Pm {
    public static com.bytedance.adsdk.lottie.Td.EYQ.mZx EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return EYQ(jsonReader, iPb, true);
    }

    public static com.bytedance.adsdk.lottie.Td.EYQ.mZx EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, boolean z) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.mZx(EYQ(jsonReader, z ? com.bytedance.adsdk.lottie.IPb.IPb.EYQ() : 1.0f, iPb, tsL.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.Pm mZx(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.Pm(EYQ(jsonReader, iPb, Uc.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.IPb Td(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.IPb(WU.EYQ(jsonReader, iPb, com.bytedance.adsdk.lottie.IPb.IPb.EYQ(), xt.EYQ, true));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.VwS Pm(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.VwS(EYQ(jsonReader, iPb, FtN.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.QQ Kbd(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.QQ(EYQ(jsonReader, com.bytedance.adsdk.lottie.IPb.IPb.EYQ(), iPb, kf.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.tp IPb(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.tp(EYQ(jsonReader, com.bytedance.adsdk.lottie.IPb.IPb.EYQ(), iPb, HX.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.EYQ VwS(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.EYQ(EYQ(jsonReader, iPb, VwS.EYQ));
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.Td EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, int i) throws IOException {
        return new com.bytedance.adsdk.lottie.Td.EYQ.Td(EYQ(jsonReader, iPb, new KO(i)));
    }

    private static <T> List<com.bytedance.adsdk.lottie.VwS.EYQ<T>> EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, XPd<T> xPd) throws IOException {
        return WU.EYQ(jsonReader, iPb, 1.0f, xPd, false);
    }

    private static <T> List<com.bytedance.adsdk.lottie.VwS.EYQ<T>> EYQ(JsonReader jsonReader, float f, com.bytedance.adsdk.lottie.IPb iPb, XPd<T> xPd) throws IOException {
        return WU.EYQ(jsonReader, iPb, f, xPd, false);
    }
}
