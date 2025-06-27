package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.net.Uri;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public class HX {
    public final Td EYQ;
    public final EYQ Td;
    public final List<mZx> mZx;

    public HX(Td td, List<mZx> list, EYQ eyq) {
        this.EYQ = td;
        this.mZx = list;
        this.Td = eyq;
    }

    public static HX EYQ(InputStream inputStream) throws IOException, Pm {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ));
        ArrayList arrayList = new ArrayList();
        Td tdEYQ = null;
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                break;
            }
            String strTrim = line.trim();
            if (tdEYQ == null) {
                tdEYQ = Td.EYQ(strTrim);
            } else {
                arrayList.add(mZx.EYQ(strTrim));
            }
        }
        if (tdEYQ == null) {
            throw new Pm("request line is null");
        }
        return new HX(tdEYQ, arrayList, EYQ.EYQ(tdEYQ, arrayList));
    }

    /* compiled from: Request.java */
    static final class Td {
        final String EYQ;
        final String Td;
        final String mZx;

        private Td(String str, String str2, String str3) {
            this.EYQ = str;
            this.mZx = str2;
            this.Td = str3;
        }

        static Td EYQ(String str) throws Pm {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw new Pm("request line format error, line: ".concat(String.valueOf(str)));
            }
            int iLastIndexOf = str.lastIndexOf(32);
            if (iLastIndexOf <= iIndexOf) {
                throw new Pm("request line format error, line: ".concat(String.valueOf(str)));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            String strTrim2 = str.substring(iIndexOf + 1, iLastIndexOf).trim();
            String strTrim3 = str.substring(iLastIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0 || strTrim3.length() == 0) {
                throw new Pm("request line format error, line: ".concat(String.valueOf(str)));
            }
            return new Td(strTrim, strTrim2, strTrim3);
        }

        public String toString() {
            return "RequestLine{method='" + this.EYQ + "', path='" + this.mZx + "', version='" + this.Td + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: Request.java */
    public static final class mZx {
        public final String EYQ;
        public final String mZx;

        public mZx(String str, String str2) {
            this.EYQ = str;
            this.mZx = str2;
        }

        static mZx EYQ(String str) throws Pm {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf == -1) {
                throw new Pm("request header format error, header: ".concat(String.valueOf(str)));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            String strTrim2 = str.substring(iIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0) {
                throw new Pm("request header format error, header: ".concat(String.valueOf(str)));
            }
            return new mZx(strTrim, strTrim2);
        }

        public String toString() {
            return "Header{name='" + this.EYQ + "', value='" + this.mZx + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: Request.java */
    static final class EYQ {
        final int EYQ;
        final String IPb;
        final int Kbd;
        final int Pm;
        final String Td;
        final List<String> VwS;
        final String mZx;

        private EYQ(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.EYQ = i;
            this.mZx = str;
            this.Td = str2;
            this.Pm = i2;
            this.Kbd = i3;
            this.IPb = str3;
            this.VwS = list;
        }

        static EYQ EYQ(Td td, List<mZx> list) throws NumberFormatException, Pm {
            String str;
            int i;
            int i2;
            int iIndexOf = td.mZx.indexOf("?");
            if (iIndexOf == -1) {
                throw new Pm("path format error, path: " + td.mZx);
            }
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            String strDecode = null;
            String strDecode2 = null;
            int i3 = 0;
            for (String str3 : td.mZx.substring(iIndexOf + 1).split(t2.i.c)) {
                String[] strArrSplit = str3.split(t2.i.b);
                if (strArrSplit.length == 2) {
                    if ("rk".equals(strArrSplit[0])) {
                        strDecode = Uri.decode(strArrSplit[1]);
                    } else if (CampaignEx.JSON_KEY_AD_K.equals(strArrSplit[0])) {
                        strDecode2 = Uri.decode(strArrSplit[1]);
                    } else if (strArrSplit[0].startsWith("u")) {
                        arrayList.add(Uri.decode(strArrSplit[1]));
                    } else if ("f".equals(strArrSplit[0]) && com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx(strArrSplit[1]) == 1) {
                        i3 = 1;
                    }
                }
            }
            if (TextUtils.isEmpty(strDecode) || TextUtils.isEmpty(strDecode2)) {
                throw new Pm("rawKey or key is empty, path: " + td.mZx);
            }
            if (list != null) {
                i2 = 0;
                int i4 = 0;
                for (mZx mzx : list) {
                    if (mzx != null && "Range".equalsIgnoreCase(mzx.EYQ)) {
                        int iIndexOf2 = mzx.mZx.indexOf(t2.i.b);
                        if (iIndexOf2 == -1) {
                            throw new Pm("Range format error, Range: " + mzx.mZx);
                        }
                        if (!"bytes".equalsIgnoreCase(mzx.mZx.substring(0, iIndexOf2).trim())) {
                            throw new Pm("Range format error, Range: " + mzx.mZx);
                        }
                        String strSubstring = mzx.mZx.substring(iIndexOf2 + 1);
                        if (strSubstring.contains(",")) {
                            throw new Pm("Range format error, Range: " + mzx.mZx);
                        }
                        int iIndexOf3 = strSubstring.indexOf("-");
                        if (iIndexOf3 == -1) {
                            throw new Pm("Range format error, Range: " + mzx.mZx);
                        }
                        String strTrim = strSubstring.substring(0, iIndexOf3).trim();
                        String strTrim2 = strSubstring.substring(iIndexOf3 + 1).trim();
                        try {
                            if (strTrim.length() > 0) {
                                i2 = Integer.parseInt(strTrim);
                            }
                            if (strTrim2.length() > 0 && i2 > (i4 = Integer.parseInt(strTrim2))) {
                                throw new Pm("Range format error, Range: " + mzx.mZx);
                            }
                            str2 = mzx.mZx;
                        } catch (NumberFormatException unused) {
                            throw new Pm("Range format error, Range: " + mzx.mZx);
                        }
                    }
                }
                i = i4;
                str = str2;
            } else {
                str = null;
                i = 0;
                i2 = 0;
            }
            if (arrayList.isEmpty()) {
                throw new Pm("no url found: path: " + td.mZx);
            }
            return new EYQ(i3, strDecode, strDecode2, i2, i, str, arrayList);
        }

        public String toString() {
            return "Extra{flag=" + this.EYQ + ", rawKey='" + this.mZx + "', key='" + this.Td + "', from=" + this.Pm + ", to=" + this.Kbd + ", urls=" + this.VwS + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static String EYQ(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String strEYQ = null;
        do {
            if (strEYQ != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            strEYQ = EYQ(sb, str, str2, list);
        } while (strEYQ.length() > 3072);
        return strEYQ;
    }

    private static String EYQ(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=");
        sb.append(Uri.encode(str));
        sb.append("&k=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u");
            sb.append(i);
            sb.append(t2.i.b);
            sb.append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.EYQ + ", headers=" + this.mZx + ", extra=" + this.Td + AbstractJsonLexerKt.END_OBJ;
    }

    /* compiled from: Request.java */
    static final class Pm extends Exception {
        Pm(String str) {
            super(str);
        }
    }
}
