package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class df {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f362a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case Opcodes.RET /* 169 */:
                    case 172:
                        return "audio/vnd.dts";
                    case Opcodes.TABLESWITCH /* 170 */:
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return "audio/vnd.dts.hd";
                    case Opcodes.LRETURN /* 173 */:
                        return "audio/opus";
                    case Opcodes.FRETURN /* 174 */:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    static a c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) a1.a((Object) matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int f(String str) {
        ArrayList arrayList = f362a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        b8.a(arrayList.get(0));
        throw null;
    }

    public static boolean g(String str) {
        return "audio".equals(d(str));
    }

    public static boolean i(String str) {
        return "video".equals(d(str));
    }

    public static boolean h(String str) {
        return "text".equals(d(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean a(String str, String str2) {
        a aVarC;
        int iA;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (aVarC = c(str2)) != null && (iA = aVarC.a()) != 0 && iA != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return f(str);
    }

    public static int b(String str, String str2) {
        a aVarC;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (aVarC = c(str2)) == null) {
                    return 0;
                }
                return aVarC.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String j(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return MimeTypes.AUDIO_WAV;
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    private static String d(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f363a;
        public final int b;

        public a(int i, int i2) {
            this.f363a = i;
            this.b = i2;
        }

        public int a() {
            int i = this.b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private static String a(String str) {
        ArrayList arrayList = f362a;
        if (arrayList.size() <= 0) {
            return null;
        }
        b8.a(arrayList.get(0));
        throw null;
    }

    public static String b(String str) {
        a aVarC;
        String strA = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? MimeTypes.AUDIO_MPEGH_MHA1 : lowerCase.startsWith("mhm1") ? MimeTypes.AUDIO_MPEGH_MHM1 : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? "audio/ac3" : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? "audio/eac3" : lowerCase.startsWith(MimeTypes.CODEC_E_AC3_JOC) ? "audio/eac3-joc" : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? MimeTypes.AUDIO_AC4 : lowerCase.startsWith("dtsc") ? "audio/vnd.dts" : lowerCase.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? "audio/vnd.dts.hd" : lowerCase.startsWith("dtsx") ? MimeTypes.AUDIO_DTS_X : lowerCase.startsWith("opus") ? "audio/opus" : lowerCase.startsWith("vorbis") ? "audio/vorbis" : lowerCase.startsWith("flac") ? "audio/flac" : lowerCase.startsWith("stpp") ? "application/ttml+xml" : lowerCase.startsWith("wvtt") ? "text/vtt" : lowerCase.contains("cea708") ? "application/cea-708" : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : a(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (aVarC = c(lowerCase)) != null) {
            strA = a(aVarC.f363a);
        }
        return strA == null ? "audio/mp4a-latm" : strA;
    }
}
