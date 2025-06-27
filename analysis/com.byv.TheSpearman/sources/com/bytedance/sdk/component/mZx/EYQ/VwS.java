package com.bytedance.sdk.component.mZx.EYQ;

import androidx.webkit.ProxyConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* compiled from: HttpUrl.java */
/* loaded from: classes2.dex */
public final class VwS {
    private static final char[] Pm = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String EYQ;
    private final String HX;
    private final String IPb;
    private final String Kbd;
    private final List<String> QQ;
    final int Td;
    private final List<String> VwS;
    final String mZx;
    private final String tp;

    VwS(EYQ eyq) {
        this.EYQ = eyq.EYQ;
        this.Kbd = EYQ(eyq.mZx, false);
        this.IPb = EYQ(eyq.Td, false);
        this.mZx = eyq.Pm;
        this.Td = eyq.EYQ();
        this.VwS = EYQ(eyq.IPb, false);
        this.QQ = eyq.VwS != null ? EYQ(eyq.VwS, true) : null;
        this.HX = eyq.QQ != null ? EYQ(eyq.QQ, false) : null;
        this.tp = eyq.toString();
    }

    public URL EYQ() {
        try {
            return new URL(this.tp);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String mZx() {
        if (this.Kbd.isEmpty()) {
            return "";
        }
        int length = this.EYQ.length() + 3;
        String str = this.tp;
        return this.tp.substring(length, com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, length, str.length(), ":@"));
    }

    public String Td() {
        if (this.IPb.isEmpty()) {
            return "";
        }
        return this.tp.substring(this.tp.indexOf(58, this.EYQ.length() + 3) + 1, this.tp.indexOf(64));
    }

    public static int EYQ(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void EYQ(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public List<String> Pm() {
        int iIndexOf = this.tp.indexOf(47, this.EYQ.length() + 3);
        String str = this.tp;
        int iEYQ = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iEYQ) {
            int i = iIndexOf + 1;
            int iEYQ2 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(this.tp, i, iEYQ, '/');
            arrayList.add(this.tp.substring(i, iEYQ2));
            iIndexOf = iEYQ2;
        }
        return arrayList;
    }

    public String Kbd() {
        if (this.QQ == null) {
            return null;
        }
        int iIndexOf = this.tp.indexOf(63) + 1;
        String str = this.tp;
        return this.tp.substring(iIndexOf, com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, iIndexOf, str.length(), '#'));
    }

    static void mZx(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> mZx(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public static VwS Td(String str) {
        EYQ eyq = new EYQ();
        if (eyq.EYQ((VwS) null, str) == EYQ.EnumC0099EYQ.SUCCESS) {
            return eyq.mZx();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof VwS) && ((VwS) obj).tp.equals(this.tp);
    }

    public int hashCode() {
        return this.tp.hashCode();
    }

    public String toString() {
        return this.tp;
    }

    /* compiled from: HttpUrl.java */
    public static final class EYQ {
        String EYQ;
        final List<String> IPb;
        String Pm;
        String QQ;
        List<String> VwS;
        String mZx = "";
        String Td = "";
        int Kbd = -1;

        /* compiled from: HttpUrl.java */
        /* renamed from: com.bytedance.sdk.component.mZx.EYQ.VwS$EYQ$EYQ, reason: collision with other inner class name */
        enum EnumC0099EYQ {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public EYQ() {
            ArrayList arrayList = new ArrayList();
            this.IPb = arrayList;
            arrayList.add("");
        }

        public EYQ EYQ(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.EYQ = ProxyConfig.MATCH_HTTP;
            } else if (str.equalsIgnoreCase("https")) {
                this.EYQ = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            return this;
        }

        public EYQ mZx(String str) {
            Objects.requireNonNull(str, "host == null");
            String strKbd = Kbd(str, 0, str.length());
            if (strKbd == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.Pm = strKbd;
            return this;
        }

        int EYQ() {
            int i = this.Kbd;
            return i != -1 ? i : VwS.EYQ(this.EYQ);
        }

        public EYQ Td(String str) {
            Objects.requireNonNull(str, "encodedPathSegments == null");
            return EYQ(str, true);
        }

        private EYQ EYQ(String str, boolean z) {
            int i = 0;
            do {
                int iEYQ = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, i, str.length(), "/\\");
                EYQ(str, i, iEYQ, iEYQ < str.length(), z);
                i = iEYQ + 1;
            } while (i <= str.length());
            return this;
        }

        public EYQ Pm(String str) {
            this.VwS = str != null ? VwS.mZx(VwS.EYQ(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public EYQ EYQ(String str, String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.VwS == null) {
                this.VwS = new ArrayList();
            }
            this.VwS.add(VwS.EYQ(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
            this.VwS.add(str2 != null ? VwS.EYQ(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
            return this;
        }

        public VwS mZx() {
            if (this.EYQ == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.Pm == null) {
                throw new IllegalStateException("host == null");
            }
            return new VwS(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.EYQ);
            sb.append("://");
            if (!this.mZx.isEmpty() || !this.Td.isEmpty()) {
                sb.append(this.mZx);
                if (!this.Td.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.Td);
                }
                sb.append('@');
            }
            if (this.Pm.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.Pm);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.Pm);
            }
            int iEYQ = EYQ();
            if (iEYQ != VwS.EYQ(this.EYQ)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(iEYQ);
            }
            VwS.EYQ(sb, this.IPb);
            if (this.VwS != null) {
                sb.append('?');
                VwS.mZx(sb, this.VwS);
            }
            if (this.QQ != null) {
                sb.append('#');
                sb.append(this.QQ);
            }
            return sb.toString();
        }

        EnumC0099EYQ EYQ(VwS vwS, String str) throws NumberFormatException {
            int iEYQ;
            int i;
            int iEYQ2 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, 0, str.length());
            int iMZx = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.mZx(str, iEYQ2, str.length());
            if (mZx(str, iEYQ2, iMZx) != -1) {
                if (str.regionMatches(true, iEYQ2, "https:", 0, 6)) {
                    this.EYQ = "https";
                    iEYQ2 += 6;
                } else if (str.regionMatches(true, iEYQ2, "http:", 0, 5)) {
                    this.EYQ = ProxyConfig.MATCH_HTTP;
                    iEYQ2 += 5;
                } else {
                    return EnumC0099EYQ.UNSUPPORTED_SCHEME;
                }
            } else if (vwS != null) {
                this.EYQ = vwS.EYQ;
            } else {
                return EnumC0099EYQ.MISSING_SCHEME;
            }
            int iTd = Td(str, iEYQ2, iMZx);
            char c = '?';
            char c2 = '#';
            if (iTd >= 2 || vwS == null || !vwS.EYQ.equals(this.EYQ)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = iEYQ2 + iTd;
                while (true) {
                    iEYQ = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, i2, iMZx, "@/\\?#");
                    char cCharAt = iEYQ != iMZx ? str.charAt(iEYQ) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c2 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z) {
                            int iEYQ3 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, i2, iEYQ, AbstractJsonLexerKt.COLON);
                            i = iEYQ;
                            String strEYQ = VwS.EYQ(str, i2, iEYQ3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strEYQ = this.mZx + "%40" + strEYQ;
                            }
                            this.mZx = strEYQ;
                            if (iEYQ3 != i) {
                                this.Td = VwS.EYQ(str, iEYQ3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = iEYQ;
                            this.Td += "%40" + VwS.EYQ(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int iPm = Pm(str, i2, iEYQ);
                int i3 = iPm + 1;
                if (i3 < iEYQ) {
                    this.Pm = Kbd(str, i2, iPm);
                    int iIPb = IPb(str, i3, iEYQ);
                    this.Kbd = iIPb;
                    if (iIPb == -1) {
                        return EnumC0099EYQ.INVALID_PORT;
                    }
                } else {
                    this.Pm = Kbd(str, i2, iPm);
                    this.Kbd = VwS.EYQ(this.EYQ);
                }
                if (this.Pm == null) {
                    return EnumC0099EYQ.INVALID_HOST;
                }
                iEYQ2 = iEYQ;
            } else {
                this.mZx = vwS.mZx();
                this.Td = vwS.Td();
                this.Pm = vwS.mZx;
                this.Kbd = vwS.Td;
                this.IPb.clear();
                this.IPb.addAll(vwS.Pm());
                if (iEYQ2 == iMZx || str.charAt(iEYQ2) == '#') {
                    Pm(vwS.Kbd());
                }
            }
            int iEYQ4 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, iEYQ2, iMZx, "?#");
            EYQ(str, iEYQ2, iEYQ4);
            if (iEYQ4 < iMZx && str.charAt(iEYQ4) == '?') {
                int iEYQ5 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, iEYQ4, iMZx, '#');
                this.VwS = VwS.mZx(VwS.EYQ(str, iEYQ4 + 1, iEYQ5, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iEYQ4 = iEYQ5;
            }
            if (iEYQ4 < iMZx && str.charAt(iEYQ4) == '#') {
                this.QQ = VwS.EYQ(str, 1 + iEYQ4, iMZx, "", true, false, false, false, null);
            }
            return EnumC0099EYQ.SUCCESS;
        }

        private void EYQ(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.IPb.clear();
                this.IPb.add("");
                i++;
            } else {
                List<String> list = this.IPb;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str, i3, i2, "/\\");
                boolean z = i < i2;
                EYQ(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void EYQ(String str, int i, int i2, boolean z, boolean z2) {
            String strEYQ = VwS.EYQ(str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true, null);
            if (Kbd(strEYQ)) {
                return;
            }
            if (IPb(strEYQ)) {
                Td();
                return;
            }
            if (this.IPb.get(r11.size() - 1).isEmpty()) {
                this.IPb.set(r11.size() - 1, strEYQ);
            } else {
                this.IPb.add(strEYQ);
            }
            if (z) {
                this.IPb.add("");
            }
        }

        private boolean Kbd(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean IPb(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void Td() {
            if (this.IPb.remove(r0.size() - 1).isEmpty() && !this.IPb.isEmpty()) {
                this.IPb.set(r0.size() - 1, "");
            } else {
                this.IPb.add("");
            }
        }

        private static int mZx(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int Td(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int Pm(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String Kbd(String str, int i, int i2) {
            return com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(VwS.EYQ(str, i, i2, false));
        }

        private static int IPb(String str, int i, int i2) throws NumberFormatException {
            int i3;
            try {
                i3 = Integer.parseInt(VwS.EYQ(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i3 <= 0 || i3 > 65535) {
                return -1;
            }
            return i3;
        }
    }

    static String EYQ(String str, boolean z) {
        return EYQ(str, 0, str.length(), z);
    }

    private List<String> EYQ(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? EYQ(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String EYQ(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ eyq = new com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ();
                eyq.EYQ(str, i, i3);
                EYQ(eyq, str, i3, i2, z);
                return eyq.Td();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.mZx(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.mZx(r1)
            goto L3c
        L39:
            r5.EYQ(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mZx.EYQ.VwS.EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ, java.lang.String, int, int, boolean):void");
    }

    static boolean EYQ(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ(str.charAt(i3)) != -1;
    }

    static String EYQ(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || EYQ(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += Character.charCount(iCodePointAt);
                } else {
                    com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ eyq = new com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ();
                    eyq.EYQ(str, i, iCharCount);
                    EYQ(eyq, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                    return eyq.Td();
                }
            } else {
                com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ eyq2 = new com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ();
                eyq2.EYQ(str, i, iCharCount);
                EYQ(eyq2, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return eyq2.Td();
            }
        }
        return str.substring(i, i2);
    }

    static void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ eyq, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ eyq2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    eyq.EYQ(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !EYQ(str, i, i2)))))) {
                    if (eyq2 == null) {
                        eyq2 = new com.bytedance.sdk.component.mZx.EYQ.mZx.EYQ();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ)) {
                        eyq2.EYQ(iCodePointAt);
                    } else {
                        eyq2.EYQ(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!eyq2.EYQ()) {
                        int iMZx = eyq2.mZx() & 255;
                        eyq.mZx(37);
                        char[] cArr = Pm;
                        eyq.mZx((int) cArr[(iMZx >> 4) & 15]);
                        eyq.mZx((int) cArr[iMZx & 15]);
                    }
                } else {
                    eyq.EYQ(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    static String EYQ(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return EYQ(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
