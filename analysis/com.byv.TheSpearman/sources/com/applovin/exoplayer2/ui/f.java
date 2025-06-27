package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.ui.f;
import com.applovin.impl.a1;
import com.applovin.impl.cb;
import com.applovin.impl.la;
import com.applovin.impl.ui;
import com.applovin.impl.yp;
import com.applovin.impl.zn;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f224a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f225a;
        public final Map b;

        private b(String str, Map map) {
            this.f225a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        private static final Comparator e = new Comparator() { // from class: com.applovin.exoplayer2.ui.f$c$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.c.a((f.c) obj, (f.c) obj2);
            }
        };
        private static final Comparator f = new Comparator() { // from class: com.applovin.exoplayer2.ui.f$c$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.c.b((f.c) obj, (f.c) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f226a;
        public final int b;
        public final String c;
        public final String d;

        private c(int i, int i2, String str, String str2) {
            this.f226a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.b, cVar.b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.c.compareTo(cVar2.c);
            return iCompareTo != 0 ? iCompareTo : cVar.d.compareTo(cVar2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f226a, cVar.f226a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.c.compareTo(cVar.c);
            return iCompareTo != 0 ? iCompareTo : cVar2.d.compareTo(cVar.d);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f227a = new ArrayList();
        private final List b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", cb.h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(a(charSequence), cb.h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(com.applovin.exoplayer2.ui.c.a("bg_" + iIntValue), yp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(iIntValue)));
        }
        SparseArray sparseArrayA = a(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayA.size()) {
            int iKeyAt = sparseArrayA.keyAt(i);
            sb.append(a(spanned.subSequence(i2, iKeyAt)));
            d dVar = (d) sparseArrayA.get(iKeyAt);
            Collections.sort(dVar.b, c.f);
            Iterator it2 = dVar.b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).d);
            }
            Collections.sort(dVar.f227a, c.e);
            Iterator it3 = dVar.f227a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(a(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), map);
    }

    private static String a(int i) {
        return i != 2 ? "over right" : "under left";
    }

    private static SparseArray a(Spanned spanned, float f) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strA = a(obj, f);
            String strA2 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strA != null) {
                a1.a((Object) strA2);
                c cVar = new c(spanStart, spanEnd, strA, strA2);
                a(sparseArray, spanStart).f227a.add(cVar);
                a(sparseArray, spanEnd).b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return yp.a("<span style='color:%s;'>", com.applovin.exoplayer2.ui.c.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return yp.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof la) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return yp.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return yp.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return yp.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof ui) {
            int i = ((ui) obj).b;
            if (i == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof zn)) {
            return null;
        }
        zn znVar = (zn) obj;
        return yp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(znVar.f1251a, znVar.b), a(znVar.c));
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof la) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof zn)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof ui) {
                return "<rt>" + a((CharSequence) ((ui) obj).f1068a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (i == 2) {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_DOT);
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        }
        return sb.toString();
    }

    private static d a(SparseArray sparseArray, int i) {
        d dVar = (d) sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    private static String a(CharSequence charSequence) {
        return f224a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
