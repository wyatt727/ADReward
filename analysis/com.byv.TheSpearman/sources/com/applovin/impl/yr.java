package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.yr;
import com.applovin.impl.z4;
import com.json.t2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public abstract class yr {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1216a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    static z4.b c(String str) {
        e eVar = new e();
        a(str, eVar);
        return eVar.b();
    }

    private static int d(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                kc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int e(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                kc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int g(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        kc.d("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static int f(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                kc.d("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int b(List list, String str, c cVar) {
        List listA = a(list, str, cVar);
        for (int i = 0; i < listA.size(); i++) {
            wr wrVar = ((d) listA.get(i)).b;
            if (wrVar.g() != -1) {
                return wrVar.g();
            }
        }
        return -1;
    }

    private static void c(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.i = e(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.h = as.a(str);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i, int i2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                Map map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static final class e {
        public CharSequence c;

        /* renamed from: a, reason: collision with root package name */
        public long f1220a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float a(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float b(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public z4.b b() {
            float fB = this.h;
            if (fB == -3.4028235E38f) {
                fB = b(this.d);
            }
            int iC = this.i;
            if (iC == Integer.MIN_VALUE) {
                iC = c(this.d);
            }
            z4.b bVarC = new z4.b().b(a(this.d)).a(a(this.e, this.f), this.f).a(this.g).b(fB).b(iC).d(Math.min(this.j, a(iC, fB))).c(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                bVarC.a(charSequence);
            }
            return bVarC;
        }

        private static Layout.Alignment a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                kc.d("WebvttCueParser", "Unknown textAlignment: " + i);
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float a(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public xr a() {
            return new xr(b().a(), this.f1220a, this.b);
        }
    }

    private static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f1219a;
        public final wr b;

        public d(int i, wr wrVar) {
            this.f1219a = i;
            this.b = wrVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f1219a, dVar.f1219a);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f1218a;
        public final int b;
        public final String c;
        public final Set d;

        private c(String str, int i, String str2, Set set) {
            this.b = i;
            this.f1218a = str;
            this.c = str2;
            this.d = set;
        }

        public static c a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            a1.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrA = yp.a(strTrim, "\\.");
            String str3 = strArrA[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrA.length; i2++) {
                hashSet.add(strArrA[i2]);
            }
            return new c(str3, i, str2, hashSet);
        }

        public static c a() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static final Comparator c = new Comparator() { // from class: com.applovin.impl.yr$b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yr.b.a((yr.b) obj, (yr.b) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final c f1217a;
        private final int b;

        private b(c cVar, int i) {
            this.f1217a = cVar;
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            return Integer.compare(bVar.f1217a.b, bVar2.f1217a.b);
        }
    }

    private static boolean b(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(Typography.greater);
                break;
            case "lt":
                spannableStringBuilder.append(Typography.less);
                break;
            case "amp":
                spannableStringBuilder.append(Typography.amp);
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                kc.d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void b(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.g = d(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = as.a(str);
            eVar.f = 0;
        } else {
            eVar.e = Integer.parseInt(str);
            eVar.f = 1;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int iB = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.c);
        int i = cVar.b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (com.json.i5.D.equals(((b) arrayList.get(i2)).f1217a.f1218a)) {
                b bVar = (b) arrayList.get(i2);
                int iA = a(b(list2, str, bVar.f1217a), iB, 1);
                int i3 = bVar.f1217a.b - length;
                int i4 = bVar.b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new ui(charSequenceSubSequence.toString(), iA), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static void a(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        i = cVar.b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f1218a;
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List listA = a(list2, str, cVar);
        for (int i2 = 0; i2 < listA.size(); i2++) {
            a(spannableStringBuilder, ((d) listA.get(i2)).b, i, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, wr wrVar, int i, int i2) {
        if (wrVar == null) {
            return;
        }
        if (wrVar.h() != -1) {
            mk.a(spannableStringBuilder, new StyleSpan(wrVar.h()), i, i2, 33);
        }
        if (wrVar.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (wrVar.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (wrVar.j()) {
            mk.a(spannableStringBuilder, new ForegroundColorSpan(wrVar.c()), i, i2, 33);
        }
        if (wrVar.i()) {
            mk.a(spannableStringBuilder, new BackgroundColorSpan(wrVar.a()), i, i2, 33);
        }
        if (wrVar.d() != null) {
            mk.a(spannableStringBuilder, new TypefaceSpan(wrVar.d()), i, i2, 33);
        }
        int iF = wrVar.f();
        if (iF == 1) {
            mk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) wrVar.e(), true), i, i2, 33);
        } else if (iF == 2) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e()), i, i2, 33);
        } else if (iF == 3) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e() / 100.0f), i, i2, 33);
        }
        if (wrVar.b()) {
            spannableStringBuilder.setSpan(new la(), i, i2, 33);
        }
    }

    private static int a(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static String a(String str) {
        String strTrim = str.trim();
        a1.a(!strTrim.isEmpty());
        return yp.b(strTrim, "[ \\.]")[0];
    }

    public static xr a(yg ygVar, List list) {
        String strL = ygVar.l();
        if (strL == null) {
            return null;
        }
        Pattern pattern = f1216a;
        Matcher matcher = pattern.matcher(strL);
        if (matcher.matches()) {
            return a((String) null, matcher, ygVar, list);
        }
        String strL2 = ygVar.l();
        if (strL2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strL2);
        if (matcher2.matches()) {
            return a(strL.trim(), matcher2, ygVar, list);
        }
        return null;
    }

    private static xr a(String str, Matcher matcher, yg ygVar, List list) {
        e eVar = new e();
        try {
            eVar.f1220a = as.b((String) a1.a((Object) matcher.group(1)));
            eVar.b = as.b((String) a1.a((Object) matcher.group(2)));
            a((String) a1.a((Object) matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String strL = ygVar.l();
            while (!TextUtils.isEmpty(strL)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strL.trim());
                strL = ygVar.l();
            }
            eVar.c = a(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            kc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static z4 a(CharSequence charSequence) {
        e eVar = new e();
        eVar.c = charSequence;
        return eVar.b().a();
    }

    static SpannedString a(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iA = i + 1;
                if (iA < str2.length()) {
                    boolean z = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i2 = iA - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iA - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strA = a(strSubstring);
                        if (b(strA)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    a(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f1218a.equals(strA)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iA;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(String str, e eVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) a1.a((Object) matcher.group(1));
            String str3 = (String) a1.a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = f(str3);
                } else if (t2.h.L.equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.j = as.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.k = g(str3);
                } else {
                    kc.d("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                kc.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static List a(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            wr wrVar = (wr) list.get(i);
            int iA = wrVar.a(str, cVar.f1218a, cVar.d, cVar.c);
            if (iA > 0) {
                arrayList.add(new d(iA, wrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
