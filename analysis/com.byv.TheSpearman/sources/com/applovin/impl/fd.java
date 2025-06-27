package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.json.t2;

/* loaded from: classes.dex */
public final class fd {

    /* renamed from: a, reason: collision with root package name */
    public final String f425a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f1214a >= 21 && e(codecCapabilities);
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f1214a >= 21 && g(codecCapabilities);
    }

    private static boolean d(String str) {
        return yp.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(yp.b)) ? false : true;
    }

    fd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f425a = (String) a1.a((Object) str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = df.i(str2);
    }

    public String toString() {
        return this.f425a;
    }

    public boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    private static int a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((yp.f1214a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        kc.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + t2.i.e);
        return i2;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean e(String str) {
        if (yp.f1214a <= 22) {
            String str2 = yp.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public boolean b(d9 d9Var) {
        int i;
        if (!a(d9Var)) {
            return false;
        }
        if (this.k) {
            int i2 = d9Var.r;
            if (i2 <= 0 || (i = d9Var.s) <= 0) {
                return true;
            }
            if (yp.f1214a >= 21) {
                return a(i2, i, d9Var.t);
            }
            boolean z = i2 * i <= id.b();
            if (!z) {
                b("legacyFrameSize, " + d9Var.r + "x" + d9Var.s);
            }
            return z;
        }
        if (yp.f1214a >= 21) {
            int i3 = d9Var.A;
            if (i3 != -1 && !b(i3)) {
                return false;
            }
            int i4 = d9Var.z;
            if (i4 != -1 && !a(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        if (yp.f1214a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(String str) {
        kc.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f425a + ", " + this.b + "] [" + yp.e + t2.i.e);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f1214a >= 19 && c(codecCapabilities);
    }

    public boolean c(d9 d9Var) {
        if (this.k) {
            return this.e;
        }
        Pair pairA = id.a(d9Var);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return "audio/opus".equals(str);
    }

    public Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i, i2);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(yp.a(i, widthAlignment) * widthAlignment, yp.a(i2, heightAlignment) * heightAlignment);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public o5 a(d9 d9Var, d9 d9Var2) {
        int i = !yp.a((Object) d9Var.m, (Object) d9Var2.m) ? 8 : 0;
        if (this.k) {
            if (d9Var.u != d9Var2.u) {
                i |= 1024;
            }
            if (!this.e && (d9Var.r != d9Var2.r || d9Var.s != d9Var2.s)) {
                i |= 512;
            }
            if (!yp.a(d9Var.y, d9Var2.y)) {
                i |= 2048;
            }
            if (d(this.f425a) && !d9Var.a(d9Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new o5(this.f425a, d9Var, d9Var2, d9Var.a(d9Var2) ? 3 : 2, 0);
            }
        } else {
            if (d9Var.z != d9Var2.z) {
                i |= 4096;
            }
            if (d9Var.A != d9Var2.A) {
                i |= 8192;
            }
            if (d9Var.B != d9Var2.B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair pairA = id.a(d9Var);
                Pair pairA2 = id.a(d9Var2);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new o5(this.f425a, d9Var, d9Var2, 3, 0);
                    }
                }
            }
            if (!d9Var.a(d9Var2)) {
                i |= 32;
            }
            if (c(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new o5(this.f425a, d9Var, d9Var2, 1, 0);
            }
        }
        return new o5(this.f425a, d9Var, d9Var2, 0, i);
    }

    private static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.f425a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }

    public boolean a(d9 d9Var) {
        String strB;
        String str = d9Var.j;
        if (str == null || this.b == null || (strB = df.b(str)) == null) {
            return true;
        }
        if (!this.b.equals(strB)) {
            b("codec.mime " + d9Var.j + ", " + strB);
            return false;
        }
        Pair pairA = id.a(d9Var);
        if (pairA == null) {
            return true;
        }
        int iIntValue = ((Integer) pairA.first).intValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        if (!this.k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = a();
        if (yp.f1214a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArrA.length == 0) {
            codecProfileLevelArrA = a(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrA) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        b("codec.profileLevel, " + d9Var.j + ", " + strB);
        return false;
    }

    public boolean a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2 && f(this.f425a) && a(videoCapabilities, i2, i, d)) {
            a("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
        b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
        return false;
    }

    public static fd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new fd(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z5 || (codecCapabilities != null && d(codecCapabilities)));
    }

    private void a(String str) {
        kc.a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f425a + ", " + this.b + "] [" + yp.e + t2.i.e);
    }
}
