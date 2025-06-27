package com.applovin.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f531a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap b = new HashMap();
    private static int c = -1;

    private interface d {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    private static final class e implements d {
        private e() {
        }

        @Override // com.applovin.impl.id.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.applovin.impl.id.d
        public boolean b() {
            return false;
        }

        @Override // com.applovin.impl.id.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.applovin.impl.id.d
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.applovin.impl.id.d
        public int a() {
            return MediaCodecList.getCodecCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g {
        int a(Object obj);
    }

    private static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int d(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int e(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int f(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int g(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (yp.f1214a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static Pair c(String str, String[] strArr) {
        if (strArr.length < 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f531a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kc.d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numB = b(strGroup);
        if (numB == null) {
            kc.d("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numA = a(str2);
        if (numA == null) {
            kc.d("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair(numB, numA);
    }

    private static Pair d(String str, String[] strArr) {
        if (strArr.length < 4) {
            kc.d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f531a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kc.d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                kc.d("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = 2;
        }
        String str2 = strArr[3];
        Integer numC = c(str2);
        if (numC == null) {
            kc.d("MediaCodecUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair(Integer.valueOf(i), numC);
    }

    private static Pair e(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iG = g(i);
            if (iG == -1) {
                kc.d("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iF = f(i2);
            if (iF == -1) {
                kc.d("MediaCodecUtil", "Unknown VP9 level: " + i2);
                return null;
            }
            return new Pair(Integer.valueOf(iG), Integer.valueOf(iF));
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (yp.f1214a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f533a;
        private MediaCodecInfo[] b;

        @Override // com.applovin.impl.id.d
        public boolean b() {
            return true;
        }

        public f(boolean z, boolean z2) {
            this.f533a = (z || z2) ? 1 : 0;
        }

        @Override // com.applovin.impl.id.d
        public int a() {
            c();
            return this.b.length;
        }

        @Override // com.applovin.impl.id.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f533a).getCodecInfos();
            }
        }

        @Override // com.applovin.impl.id.d
        public MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        @Override // com.applovin.impl.id.d
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f532a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.f532a = str;
            this.b = z;
            this.c = z2;
        }

        public int hashCode() {
            return ((((this.f532a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f532a, bVar.f532a) && this.b == bVar.b && this.c == bVar.c;
        }
    }

    private static Integer b(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static Integer c(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (yp.f1214a >= 29) {
            return d(mediaCodecInfo);
        }
        return !e(mediaCodecInfo);
    }

    private static Pair b(String str, String[] strArr) throws NumberFormatException {
        int i;
        int i2;
        if (strArr.length < 2) {
            kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            } else {
                kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int iD = d(i2);
            if (iD == -1) {
                kc.d("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iB = b(i);
            if (iB == -1) {
                kc.d("MediaCodecUtil", "Unknown AVC level: " + i);
                return null;
            }
            return new Pair(Integer.valueOf(iD), Integer.valueOf(iB));
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair a(String str, String[] strArr) {
        int iE;
        if (strArr.length != 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(df.a(Integer.parseInt(strArr[1], 16))) && (iE = e(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iE), 0);
            }
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static Pair a(String str, String[] strArr, p3 p3Var) throws NumberFormatException {
        int i;
        if (strArr.length < 4) {
            kc.d("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i4 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                kc.d("MediaCodecUtil", "Unknown AV1 profile: " + i3);
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                kc.d("MediaCodecUtil", "Unknown AV1 bit depth: " + i5);
                return null;
            }
            if (i5 != 8) {
                i2 = (p3Var == null || !(p3Var.d != null || (i = p3Var.c) == 7 || i == 6)) ? 2 : 4096;
            }
            int iA = a(i4);
            if (iA == -1) {
                kc.d("MediaCodecUtil", "Unknown AV1 level: " + i4);
                return null;
            }
            return new Pair(Integer.valueOf(i2), Integer.valueOf(iA));
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(fd fdVar) {
        return fdVar.f425a.startsWith("OMX.google") ? 1 : 0;
    }

    public static synchronized List b(String str, boolean z, boolean z2) {
        d eVar;
        b bVar = new b(str, z, z2);
        HashMap map = b;
        List list = (List) map.get(bVar);
        if (list != null) {
            return list;
        }
        int i = yp.f1214a;
        if (i >= 21) {
            eVar = new f(z, z2);
        } else {
            eVar = new e();
        }
        ArrayList arrayListA = a(bVar, eVar);
        if (z && arrayListA.isEmpty() && 21 <= i && i <= 23) {
            arrayListA = a(bVar, new e());
            if (!arrayListA.isEmpty()) {
                kc.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((fd) arrayListA.get(0)).f425a);
            }
        }
        a(str, arrayListA);
        List listUnmodifiableList = Collections.unmodifiableList(arrayListA);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static int b() {
        if (c == -1) {
            int iMax = 0;
            fd fdVarA = a("video/avc", false, false);
            if (fdVarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = fdVarA.a();
                int length = codecProfileLevelArrA.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(c(codecProfileLevelArrA[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, yp.f1214a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(com.applovin.impl.d9 r6) {
        /*
            java.lang.String r0 = r6.j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.m
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.j
            android.util.Pair r6 = c(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L72;
                case 3006243: goto L67;
                case 3006244: goto L5c;
                case 3199032: goto L51;
                case 3214780: goto L46;
                case 3356560: goto L3b;
                case 3624515: goto L30;
                default: goto L2e;
            }
        L2e:
            r2 = r4
            goto L7b
        L30:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L39
            goto L2e
        L39:
            r2 = 6
            goto L7b
        L3b:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L44
            goto L2e
        L44:
            r2 = 5
            goto L7b
        L46:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4f
            goto L2e
        L4f:
            r2 = 4
            goto L7b
        L51:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L5a
            goto L2e
        L5a:
            r2 = 3
            goto L7b
        L5c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L65
            goto L2e
        L65:
            r2 = 2
            goto L7b
        L67:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L70
            goto L2e
        L70:
            r2 = 1
            goto L7b
        L72:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L7b
            goto L2e
        L7b:
            switch(r2) {
                case 0: goto L9b;
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L8d;
                case 4: goto L8d;
                case 5: goto L86;
                case 6: goto L7f;
                default: goto L7e;
            }
        L7e:
            return r1
        L7f:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = e(r6, r0)
            return r6
        L86:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = a(r6, r0)
            return r6
        L8d:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = d(r6, r0)
            return r6
        L94:
            java.lang.String r6 = r6.j
            android.util.Pair r6 = b(r6, r0)
            return r6
        L9b:
            java.lang.String r1 = r6.j
            com.applovin.impl.p3 r6 = r6.y
            android.util.Pair r6 = a(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.d9):android.util.Pair");
    }

    public static fd a(String str, boolean z, boolean z2) {
        List listB = b(str, z, z2);
        if (listB.isEmpty()) {
            return null;
        }
        return (fd) listB.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0120, B:8:0x002d, B:11:0x0038, B:54:0x00f9, B:57:0x0101, B:59:0x0107, B:61:0x012a, B:62:0x014d), top: B:69:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList a(com.applovin.impl.id.b r24, com.applovin.impl.id.d r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.id$b, com.applovin.impl.id$d):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = yp.f1214a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = yp.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(yp.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = yp.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = yp.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(yp.c))) {
            String str6 = yp.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(yp.c)) {
            String str7 = yp.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && yp.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(fd fdVar) {
        String str = fdVar.f425a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (yp.f1214a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(d9 d9Var, fd fdVar) {
        try {
            return fdVar.b(d9Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    private static void a(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.impl.id$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return id.a(gVar, obj, obj2);
            }
        });
    }

    public static fd a() {
        return a("audio/raw", false, false);
    }

    public static List a(List list, final d9 d9Var) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new g() { // from class: com.applovin.impl.id$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.id.g
            public final int a(Object obj) {
                return id.a(d9Var, (fd) obj);
            }
        });
        return arrayList;
    }

    private static void a(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (yp.f1214a < 26 && yp.b.equals("R9") && list.size() == 1 && ((fd) list.get(0)).f425a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(fd.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            a(list, new g() { // from class: com.applovin.impl.id$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.id.g
                public final int a(Object obj) {
                    return id.a((fd) obj);
                }
            });
        }
        int i = yp.f1214a;
        if (i < 21 && list.size() > 1) {
            String str2 = ((fd) list.get(0)).f425a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new g() { // from class: com.applovin.impl.id$$ExternalSyntheticLambda2
                    @Override // com.applovin.impl.id.g
                    public final int a(Object obj) {
                        return id.b((fd) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((fd) list.get(0)).f425a)) {
            return;
        }
        list.add((fd) list.remove(0));
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return yp.f1214a >= 29 && b(mediaCodecInfo);
    }
}
