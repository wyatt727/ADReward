package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class hp {

    /* renamed from: a, reason: collision with root package name */
    public final String f508a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final kp f;
    private final String[] g;
    public final String h;
    public final String i;
    public final hp j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private hp(String str, String str2, long j, long j2, kp kpVar, String[] strArr, String str3, String str4, hp hpVar) {
        this.f508a = str;
        this.b = str2;
        this.i = str4;
        this.f = kpVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) a1.a((Object) str3);
        this.j = hpVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public void a(hp hpVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(hpVar);
    }

    public String[] c() {
        return this.g;
    }

    private void a(Map map, z4.b bVar, int i, int i2, int i3) {
        kp kpVarA = jp.a(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (kpVarA != null) {
            jp.a(spannableStringBuilder2, i, i2, kpVarA, this.j, map, i3);
            if ("p".equals(this.f508a)) {
                if (kpVarA.j() != Float.MAX_VALUE) {
                    bVar.c((kpVarA.j() * (-90.0f)) / 100.0f);
                }
                if (kpVarA.l() != null) {
                    bVar.b(kpVarA.l());
                }
                if (kpVarA.g() != null) {
                    bVar.a(kpVarA.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (m6 m6Var : (m6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(m6Var), spannableStringBuilder.getSpanEnd(m6Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public hp a(int i) {
        List list = this.m;
        if (list != null) {
            return (hp) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f508a);
        boolean zEquals2 = "div".equals(this.f508a);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((hp) this.m.get(i)).a(treeSet, z || zEquals);
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            z4.b bVar = new z4.b();
            bVar.a(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a1.a(((z4.b) map.get(str)).e());
    }

    public boolean a(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    private void a(long j, String str, List list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && "div".equals(this.f508a) && this.i != null) {
            list.add(new Pair(str, this.i));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j, str, list);
        }
    }

    private void a(long j, Map map, Map map2, String str, Map map3) {
        int i;
        if (a(j)) {
            String str2 = "".equals(this.h) ? str : this.h;
            Iterator it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    a(map, (z4.b) a1.a((z4.b) map3.get(str3)), iIntValue, iIntValue2, ((ip) a1.a((ip) map2.get(str2))).j);
                }
            }
            while (i < a()) {
                a(i).a(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    private void a(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.f508a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            a(str, map).append((CharSequence) a1.a((Object) this.b));
            return;
        }
        if ("br".equals(this.f508a) && z) {
            a(str, map).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) a1.a(((z4.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f508a);
            for (int i = 0; i < a(); i++) {
                a(i).a(j, z || zEquals, str, map);
            }
            if (zEquals) {
                jp.a(a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) a1.a(((z4.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static hp a(String str) {
        return new hp(null, jp.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static hp a(String str, long j, long j2, kp kpVar, String[] strArr, String str2, String str3, hp hpVar) {
        return new hp(str, null, j, j2, kpVar, strArr, str2, str3, hpVar);
    }

    public List a(long j, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        a(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.h, (Map) treeMap);
        a(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                ip ipVar = (ip) a1.a((ip) map2.get(pair.first));
                arrayList2.add(new z4.b().a(bitmapDecodeByteArray).b(ipVar.b).b(0).a(ipVar.c, 0).a(ipVar.e).d(ipVar.f).a(ipVar.g).c(ipVar.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ip ipVar2 = (ip) a1.a((ip) map2.get(entry.getKey()));
            z4.b bVar = (z4.b) entry.getValue();
            a((SpannableStringBuilder) a1.a(bVar.e()));
            bVar.a(ipVar2.c, ipVar2.d);
            bVar.a(ipVar2.e);
            bVar.b(ipVar2.b);
            bVar.d(ipVar2.f);
            bVar.b(ipVar2.i, ipVar2.h);
            bVar.c(ipVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
