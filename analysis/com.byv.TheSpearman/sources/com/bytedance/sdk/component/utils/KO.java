package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeDetector.java */
/* loaded from: classes2.dex */
public class KO {
    private static volatile KO Td;
    private Map<String, String> EYQ;
    private Context Pm;
    private volatile boolean mZx = false;

    public static String EYQ(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith(ProxyConfig.MATCH_HTTP) && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return EYQ(context).EYQ(str);
    }

    static KO EYQ(Context context) {
        if (Td == null) {
            synchronized (KO.class) {
                if (Td == null) {
                    Td = new KO(context);
                }
            }
        }
        return Td;
    }

    private KO(Context context) {
        if (context != null && this.Pm == null) {
            this.Pm = context.getApplicationContext();
            EYQ();
        }
        this.Pm = context;
    }

    public final String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strPm = Pm(str);
        if (TextUtils.isEmpty(strPm)) {
            return null;
        }
        return mZx(strPm);
    }

    private static String mZx(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0) {
            return null;
        }
        String lowerCase = str.substring(0, iIndexOf).trim().toLowerCase(Locale.ENGLISH);
        if (!Td(lowerCase)) {
            return null;
        }
        int i = iIndexOf + 1;
        if (iIndexOf2 < 0) {
            strSubstring = str.substring(i);
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        String lowerCase2 = strSubstring.trim().toLowerCase(Locale.ENGLISH);
        if (!Td(lowerCase2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    private static boolean EYQ(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    private static boolean Td(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!EYQ(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private String Pm(String str) {
        String str2;
        String strKbd = Kbd(str);
        if (strKbd.isEmpty()) {
            return null;
        }
        EYQ();
        Map<String, String> map = this.EYQ;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.EYQ.get(strKbd);
            if (str2 == null) {
                strKbd = Kbd(strKbd);
            }
            if (str2 != null) {
                break;
            }
        } while (!strKbd.isEmpty());
        return str2;
    }

    private static String Kbd(String str) {
        int iIndexOf;
        return (str == null || str.isEmpty() || (iIndexOf = str.indexOf(46)) < 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(iIndexOf + 1);
    }

    private void EYQ() {
        if (this.Pm == null || this.mZx) {
            return;
        }
        synchronized (this) {
            if (!this.mZx) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.KO.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream inputStreamOpen = KO.this.Pm.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        if (!TextUtils.isEmpty(line)) {
                                            arrayList.add(line);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = inputStreamOpen;
                                        try {
                                            List<String> listEmptyList = Collections.emptyList();
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            return listEmptyList;
                                        } finally {
                                        }
                                    }
                                }
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused5) {
                                }
                                return arrayList;
                            } catch (Throwable unused6) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused7) {
                            bufferedReader = null;
                        }
                    }
                });
                this.EYQ = new HashMap(list.size());
                String strSubstring = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = strSubstring + ((String) it.next());
                    if (str.endsWith("\\")) {
                        strSubstring = str.substring(0, str.length() - 1);
                    } else {
                        IPb(str);
                        strSubstring = "";
                    }
                }
                if (!strSubstring.isEmpty()) {
                    IPb(strSubstring);
                }
                this.mZx = true;
            }
        }
    }

    private void IPb(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        if (strTrim.charAt(0) == '#') {
            return;
        }
        String strReplaceAll = strTrim.replaceAll("\\s*#.*", "");
        if (strReplaceAll.indexOf(61) > 0) {
            Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(strReplaceAll);
            if (matcher.find()) {
                String strSubstring = matcher.group().substring(5);
                if (strSubstring.charAt(0) == '\"') {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(strReplaceAll);
                if (matcher2.find()) {
                    String strSubstring2 = matcher2.group().substring(5);
                    if (strSubstring2.charAt(0) == '\"') {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    }
                    for (String str2 : strSubstring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                        EYQ(str2, strSubstring);
                    }
                    return;
                }
                return;
            }
            return;
        }
        String[] strArrSplit = strReplaceAll.split("\\s+");
        for (int i = 1; i < strArrSplit.length; i++) {
            EYQ(strArrSplit[i], strArrSplit[0]);
        }
    }

    private void EYQ(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.EYQ.containsKey(str)) {
            return;
        }
        this.EYQ.put(str, str2);
    }
}
