package com.applovin.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.wk;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class uk extends bk {
    private static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean o;
    private final vk p;
    private Map q;
    private float r;
    private float s;

    private static float b(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public uk(List list) {
        super("SsaDecoder");
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.o = true;
            String strA = yp.a((byte[]) list.get(0));
            a1.a(strA.startsWith("Format:"));
            this.p = (vk) a1.a(vk.a(strA));
            a(new yg((byte[]) list.get(1)));
            return;
        }
        this.o = false;
        this.p = null;
    }

    private void b(yg ygVar) {
        while (true) {
            String strL = ygVar.l();
            if (strL == null) {
                return;
            }
            if (ygVar.a() != 0 && ygVar.g() == 91) {
                return;
            }
            String[] strArrSplit = strL.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.r = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Layout.Alignment e(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                kc.d("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int c(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                kc.d("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Map c(yg ygVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wk.a aVarA = null;
        while (true) {
            String strL = ygVar.l();
            if (strL == null || (ygVar.a() != 0 && ygVar.g() == 91)) {
                break;
            }
            if (strL.startsWith("Format:")) {
                aVarA = wk.a.a(strL);
            } else if (strL.startsWith("Style:")) {
                if (aVarA == null) {
                    kc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strL);
                } else {
                    wk wkVarA = wk.a(strL, aVarA);
                    if (wkVarA != null) {
                        linkedHashMap.put(wkVarA.f1133a, wkVarA);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int d(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                kc.d("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int a(long j, List list, List list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static z4 a(String str, wk wkVar, wk.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        z4.b bVarA = new z4.b().a(spannableString);
        if (wkVar != null) {
            if (wkVar.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(wkVar.c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = wkVar.d;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                bVarA.b(f3 / f2, 1);
            }
            boolean z = wkVar.e;
            if (z && wkVar.f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (wkVar.f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (wkVar.g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (wkVar.h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f1135a;
        if (i == -1) {
            i = wkVar != null ? wkVar.b : -1;
        }
        bVarA.b(e(i)).b(d(i)).a(c(i));
        PointF pointF = bVar.b;
        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            bVarA.b(pointF.x / f);
            bVarA.a(bVar.b.y / f2, 0);
        } else {
            bVarA.b(b(bVarA.d()));
            bVarA.a(b(bVarA.c()), 0);
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yg ygVar = new yg(bArr, i);
        if (!this.o) {
            a(ygVar);
        }
        a(ygVar, arrayList, arrayList2);
        return new xk(arrayList, arrayList2);
    }

    private void a(String str, vk vkVar, List list, List list2) {
        int i;
        a1.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", vkVar.e);
        if (strArrSplit.length != vkVar.e) {
            kc.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jA = a(strArrSplit[vkVar.f1100a]);
        if (jA == -9223372036854775807L) {
            kc.d("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jA2 = a(strArrSplit[vkVar.b]);
        if (jA2 == -9223372036854775807L) {
            kc.d("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.q;
        wk wkVar = (map == null || (i = vkVar.c) == -1) ? null : (wk) map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[vkVar.d];
        z4 z4VarA = a(wk.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), wkVar, wk.b.b(str2), this.r, this.s);
        int iA = a(jA2, list2, list);
        for (int iA2 = a(jA, list2, list); iA2 < iA; iA2++) {
            ((List) list.get(iA2)).add(z4VarA);
        }
    }

    private void a(yg ygVar, List list, List list2) {
        vk vkVarA = this.o ? this.p : null;
        while (true) {
            String strL = ygVar.l();
            if (strL == null) {
                return;
            }
            if (strL.startsWith("Format:")) {
                vkVarA = vk.a(strL);
            } else if (strL.startsWith("Dialogue:")) {
                if (vkVarA == null) {
                    kc.d("SsaDecoder", "Skipping dialogue line before complete format: " + strL);
                } else {
                    a(strL, vkVarA, list, list2);
                }
            }
        }
    }

    private void a(yg ygVar) {
        while (true) {
            String strL = ygVar.l();
            if (strL == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strL)) {
                b(ygVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strL)) {
                this.q = c(ygVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strL)) {
                kc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strL)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) yp.a((Object) matcher.group(1))) * 3600000000L) + (Long.parseLong((String) yp.a((Object) matcher.group(2))) * 60000000) + (Long.parseLong((String) yp.a((Object) matcher.group(3))) * 1000000) + (Long.parseLong((String) yp.a((Object) matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }
}
