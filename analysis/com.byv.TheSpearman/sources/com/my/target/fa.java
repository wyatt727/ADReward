package com.my.target;

import android.text.TextUtils;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.VideoData;
import com.my.target.core.models.a;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class fa<T extends com.my.target.core.models.a> {
    public static final String[] l = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};
    public static final String[] m = {"AdVerifications", "linkTxt"};

    /* renamed from: a, reason: collision with root package name */
    public final j f3972a;
    public final s b;
    public final ArrayList<u9> c = new ArrayList<>();
    public final ArrayList<u9> d = new ArrayList<>();
    public final ArrayList<t7> e = new ArrayList<>();
    public final ArrayList<e1> f = new ArrayList<>();
    public final ArrayList<b5<T>> g = new ArrayList<>();
    public boolean h;
    public String i;
    public s j;
    public i7 k;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3973a;
        public c b;
        public String c;
        public String d;

        public a(String str) {
            this.f3973a = str;
        }

        public void a(String str) {
            String str2;
            fa faVar;
            String str3;
            String str4;
            if (TextUtils.isEmpty(str)) {
                faVar = fa.this;
                str3 = this.f3973a;
                str2 = "Bad value";
                str4 = "VAST adChoices declared but it's content is empty";
            } else {
                str2 = "Json error";
                if (this.b == null) {
                    try {
                        this.b = ea.a().a(new JSONObject(str));
                        ba.a("VastParser: Parsed adChoices for creative (id = " + this.f3973a + ")");
                        return;
                    } catch (JSONException e) {
                        fa.this.a(this.f3973a, "Json error", "VAST adChoices json error: " + e.getMessage());
                        this.b = null;
                        return;
                    }
                }
                faVar = fa.this;
                str3 = this.f3973a;
                str4 = "VAST duplicate adChoices for creativeId = " + this.f3973a;
            }
            faVar.a(str3, str2, str4);
        }

        public void b(String str) {
            if (TextUtils.isEmpty(str)) {
                fa.this.a(this.f3973a, "Bad value", "VAST adDisclaimer declared but it's content is empty");
                return;
            }
            if (this.c == null) {
                this.c = str;
                return;
            }
            fa.this.a(this.f3973a, "Json error", "VAST duplicate adDisclaimer for creativeId = " + this.f3973a);
        }

        public void c(String str) {
            if (TextUtils.isEmpty(str)) {
                fa.this.a(this.f3973a, "Bad value", "VAST ageRestrictions declared but it's content is empty");
                return;
            }
            if (this.d == null) {
                this.d = str;
                return;
            }
            fa.this.a(this.f3973a, "Json error", "VAST duplicate ageRestrictions for creativeId = " + this.f3973a);
        }
    }

    public fa(j jVar, s sVar) {
        this.f3972a = jVar;
        this.b = sVar;
        this.k = sVar.v();
    }

    public static <T extends com.my.target.core.models.a> fa<T> a(j jVar, s sVar) {
        return new fa<>(jVar, sVar);
    }

    public static String a(String str) {
        return str.replaceAll("&amp;", t2.i.c).replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    public static String a(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, b bVar) {
        a(bVar, (fa<T>.a) aVar);
    }

    public static int j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th) {
            ba.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static int k(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th) {
            ba.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static int l(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th) {
            ba.a("VastParser: Error - " + th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static String m(XmlPullParser xmlPullParser) {
        String text;
        if (k(xmlPullParser) == 4) {
            text = xmlPullParser.getText();
            l(xmlPullParser);
        } else {
            ba.a("VastParser: No text - " + xmlPullParser.getName());
            text = "";
        }
        return text.trim();
    }

    public static void n(XmlPullParser xmlPullParser) {
        if (j(xmlPullParser) != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int iK = k(xmlPullParser);
            if (iK == 2) {
                i++;
            } else if (iK == 3) {
                i--;
            }
        }
    }

    public final void a() {
        ArrayList<u9> arrayListT = this.b.t();
        if (arrayListT != null) {
            this.c.addAll(arrayListT);
        }
        ArrayList<e1> arrayListO = this.b.o();
        if (arrayListO != null) {
            this.f.addAll(arrayListO);
        }
    }

    public final void a(float f, String str, b bVar) {
        t7 t7VarA = t7.a(str);
        if (bVar == null || bVar.getDuration() <= 0.0f) {
            t7VarA.a(f);
            this.e.add(t7VarA);
        } else {
            t7VarA.b(bVar.getDuration() * (f / 100.0f));
            bVar.getStatHolder().a(t7VarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.my.target.b5 r4, java.lang.String r5) throws java.lang.NumberFormatException {
        /*
            r3 = this;
            if (r5 == 0) goto L63
            java.lang.String r0 = "%"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L3c
            int r0 = r5.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "VastParser: Linear skipoffset is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " [%]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.my.target.ba.a(r5)
            float r5 = r4.getDuration()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 * r0
            goto L65
        L3c:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L63
            float r5 = r3.b(r5)     // Catch: java.lang.Throwable -> L49
            goto L65
        L49:
            java.lang.String r0 = r4.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to convert ISO time skipoffset string "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "Bad value"
            r3.a(r0, r1, r5)
        L63:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L65:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r4.setAllowCloseDelay(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.fa.a(com.my.target.b5, java.lang.String):void");
    }

    public final void a(b bVar, fa<T>.a aVar) {
        c cVar = aVar.b;
        if (cVar != null) {
            bVar.setAdChoices(cVar);
        }
        String str = aVar.c;
        if (str != null) {
            bVar.setDisclaimer(str);
        }
        String str2 = aVar.d;
        if (str2 != null) {
            bVar.setAgeRestrictions(str2);
        }
    }

    public final void a(String str, String str2, b bVar) {
        float fB;
        try {
            fB = b(str);
        } catch (Throwable unused) {
            fB = -1.0f;
        }
        if (fB < 0.0f) {
            ba.a("VastParser: Unable to parse progress stat with value " + str);
            return;
        }
        t7 t7VarA = t7.a(str2);
        t7VarA.b(fB);
        if (bVar != null) {
            bVar.getStatHolder().a(t7VarA);
        } else {
            this.d.add(t7VarA);
        }
    }

    public void a(String str, String str2, String str3) {
        ba.b("VastParser: Error " + str2 + " with banner id " + str + " - " + str3);
    }

    public final void a(XmlPullParser xmlPullParser) throws NumberFormatException {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Wrapper".equals(name)) {
                    this.h = true;
                    ba.a("VastParser: VAST file contains wrapped ad information");
                    int iB = this.b.B();
                    if (iB < 5) {
                        a(xmlPullParser, iB);
                    } else {
                        ba.a("VastParser: Got VAST wrapper, but max redirects limit exceeded");
                        n(xmlPullParser);
                    }
                } else if ("InLine".equals(name)) {
                    this.h = false;
                    ba.a("VastParser: VAST file contains inline ad information.");
                    g(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, int i) throws NumberFormatException {
        String strM = null;
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    e(xmlPullParser);
                } else if ("VASTAdTagURI".equals(name)) {
                    strM = m(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    b(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
        if (strM == null) {
            ba.a("VastParser: Got VAST wrapper, but no vastAdTagUri");
            return;
        }
        String strP = this.b.p();
        s sVarB = s.b(strM);
        this.j = sVarB;
        sVarB.e(i + 1);
        this.j.c(this.c);
        this.j.a(this.k);
        s sVar = this.j;
        if (TextUtils.isEmpty(strP)) {
            strP = this.i;
        }
        sVar.d(strP);
        this.j.b(this.f);
        this.j.b(this.b.d());
        this.j.c(this.b.f());
        this.j.e(this.b.h());
        this.j.f(this.b.i());
        this.j.g(this.b.j());
        this.j.j(this.b.q());
        this.j.l(this.b.x());
        this.j.a(this.b.e());
        this.j.d(this.b.g());
        this.j.a(this.b.a());
        this.j.c(this.b.b());
        v9 v9VarM = this.j.m();
        v9VarM.a(this.d);
        v9VarM.a(this.e);
        v9VarM.a(this.b.m(), -1.0f);
        this.b.a(this.j);
    }

    public final void a(XmlPullParser xmlPullParser, b5 b5Var, String str) throws NumberFormatException {
        while (l(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (j(xmlPullParser) == 2) {
                if ("Duration".equals(name)) {
                    if (b5Var == null) {
                        continue;
                    } else if (!a(xmlPullParser, b5Var)) {
                        return;
                    } else {
                        a(b5Var, str);
                    }
                } else if ("TrackingEvents".equals(name)) {
                    a(xmlPullParser, (b) b5Var);
                } else if ("MediaFiles".equals(name)) {
                    if (b5Var == null) {
                        continue;
                    } else {
                        b(xmlPullParser, b5Var);
                        if (b5Var.getMediaData() == null) {
                            ba.a("VastParser: Unable to find valid mediafile!");
                            return;
                        }
                    }
                } else if ("VideoClicks".equals(name)) {
                    c(xmlPullParser, b5Var);
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, b bVar) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String strA = a(NotificationCompat.CATEGORY_EVENT, xmlPullParser);
                    String strA2 = a(TypedValues.CycleType.S_WAVE_OFFSET, xmlPullParser);
                    if (strA != null) {
                        if (!"progress".equals(strA) || TextUtils.isEmpty(strA2)) {
                            c(strA, m(xmlPullParser), bVar);
                        } else if (strA2.endsWith("%")) {
                            try {
                                a(Integer.parseInt(strA2.replace("%", "")), m(xmlPullParser), bVar);
                            } catch (Throwable unused) {
                                ba.a("VastParser: Unable to parse progress stat with value " + strA2);
                            }
                        } else {
                            a(strA2, m(xmlPullParser), bVar);
                        }
                    }
                    ba.a("VastParser: Added VAST tracking \"" + strA + "\"");
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(XmlPullParser xmlPullParser, fa<T>.a aVar) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("type", xmlPullParser), (fa<T>.a) aVar);
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str) throws NumberFormatException {
        String id;
        String str2;
        final fa<T>.a aVar = new a(str);
        boolean z = false;
        int size = 0;
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("CreativeExtensions".equals(name)) {
                    a(xmlPullParser, aVar);
                } else {
                    b5 b5VarNewBanner = null;
                    String str3 = null;
                    if ("Linear".equals(name)) {
                        if (!this.h) {
                            b5VarNewBanner = b5.newBanner();
                            b5VarNewBanner.setId(str != null ? str : "");
                        }
                        a(xmlPullParser, b5VarNewBanner, a("skipoffset", xmlPullParser));
                        if (b5VarNewBanner != null) {
                            if (b5VarNewBanner.getDuration() <= 0.0f) {
                                id = b5VarNewBanner.getId();
                                str2 = "VAST has no valid Duration";
                            } else if (b5VarNewBanner.getMediaData() != null) {
                                this.g.add(b5VarNewBanner);
                                z = true;
                            } else {
                                id = b5VarNewBanner.getId();
                                str2 = "VAST has no valid mediaData";
                            }
                            a(id, "Required field", str2);
                        }
                    } else if (name == null || !name.equals("CompanionAds")) {
                        n(xmlPullParser);
                    } else {
                        String strA = a("required", xmlPullParser);
                        if (strA == null || TtmlNode.COMBINE_ALL.equals(strA) || "any".equals(strA) || "none".equals(strA)) {
                            str3 = strA;
                        } else {
                            a(str, "Bad value", "Wrong companion required attribute:" + strA);
                        }
                        int size2 = this.f.size();
                        b(xmlPullParser, str, str3);
                        size = this.f.size() - size2;
                        ba.a("VastParser: parsed " + size + " companion banners");
                    }
                }
            }
        }
        a(z, size, new Consumer() { // from class: com.my.target.fa$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.a(aVar, (b) obj);
            }
        });
    }

    public final void a(XmlPullParser xmlPullParser, String str, fa<T>.a aVar) {
        if ("adChoices".equals(str)) {
            ba.a("VastParser: Found adChoices for creative (id = " + aVar.f3973a + ")");
            aVar.a(a(m(xmlPullParser)));
            return;
        }
        if ("adDisclaimer".equals(str)) {
            ba.a("VastParser: Found adDisclaimer for creative (id = " + aVar.f3973a + ")");
            aVar.b(m(xmlPullParser));
            return;
        }
        if (!"adAgeRestriction".equals(str)) {
            n(xmlPullParser);
            return;
        }
        ba.a("VastParser: Found adAgeRestrictions for creative (id = " + aVar.f3973a + ")");
        aVar.c(m(xmlPullParser));
    }

    public final void a(XmlPullParser xmlPullParser, String str, String str2) {
        if (j(xmlPullParser) != 2) {
            return;
        }
        String name = xmlPullParser.getName();
        if (name == null || !name.equals("Companion")) {
            n(xmlPullParser);
            return;
        }
        String strA = a("width", xmlPullParser);
        String strA2 = a("height", xmlPullParser);
        String strA3 = a("id", xmlPullParser);
        e1 e1VarNewBanner = e1.newBanner();
        if (strA3 == null) {
            strA3 = "";
        }
        e1VarNewBanner.setId(strA3);
        try {
            e1VarNewBanner.setWidth(Integer.parseInt(strA));
            e1VarNewBanner.setHeight(Integer.parseInt(strA2));
        } catch (Throwable unused) {
            a(str, "Bad value", "Unable  to convert required companion attributes, width = " + strA + " height = " + strA2);
        }
        e1VarNewBanner.setRequired(str2);
        String strA4 = a("assetWidth", xmlPullParser);
        String strA5 = a("assetHeight", xmlPullParser);
        try {
            if (!TextUtils.isEmpty(strA4)) {
                e1VarNewBanner.setAssetWidth(Integer.parseInt(strA4));
            }
            if (!TextUtils.isEmpty(strA5)) {
                e1VarNewBanner.setAssetHeight(Integer.parseInt(strA5));
            }
        } catch (Throwable th) {
            ba.a("VastParser: Wrong VAST asset dimensions - " + th.getMessage());
        }
        String strA6 = a("expandedWidth", xmlPullParser);
        String strA7 = a("expandedHeight", xmlPullParser);
        try {
            if (!TextUtils.isEmpty(strA6)) {
                e1VarNewBanner.setExpandedWidth(Integer.parseInt(strA6));
            }
            if (!TextUtils.isEmpty(strA7)) {
                e1VarNewBanner.setExpandedHeight(Integer.parseInt(strA7));
            }
        } catch (Throwable th2) {
            ba.a("VastParser: Wrong VAST expanded dimensions " + th2.getMessage());
        }
        e1VarNewBanner.setAdSlotID(a("adSlotID", xmlPullParser));
        e1VarNewBanner.setApiFramework(a("apiFramework", xmlPullParser));
        this.f.add(e1VarNewBanner);
        while (l(xmlPullParser) == 2) {
            String name2 = xmlPullParser.getName();
            if ("StaticResource".equals(name2)) {
                e1VarNewBanner.setStaticResource(da.a(m(xmlPullParser)));
            } else if ("HTMLResource".equals(name2)) {
                e1VarNewBanner.setHtmlResource(da.a(m(xmlPullParser)));
            } else if ("IFrameResource".equals(name2)) {
                e1VarNewBanner.setIframeResource(da.a(m(xmlPullParser)));
            } else if ("CompanionClickThrough".equals(name2)) {
                String strM = m(xmlPullParser);
                if (!TextUtils.isEmpty(strM)) {
                    e1VarNewBanner.setTrackingLink(a(strM));
                }
            } else if ("CompanionClickTracking".equals(name2)) {
                String strM2 = m(xmlPullParser);
                if (!TextUtils.isEmpty(strM2)) {
                    e1VarNewBanner.getStatHolder().a(u9.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, strM2));
                }
            } else if ("TrackingEvents".equals(name2)) {
                a(xmlPullParser, e1VarNewBanner);
            } else {
                n(xmlPullParser);
            }
        }
    }

    public final void a(boolean z, int i, Consumer<b> consumer) {
        if (z) {
            consumer.accept(this.g.get(r1.size() - 1));
        } else {
            for (int size = this.f.size() - i; size < this.f.size(); size++) {
                consumer.accept(this.f.get(size));
            }
        }
    }

    public final boolean a(XmlPullParser xmlPullParser, b5 b5Var) {
        float fB;
        try {
            fB = b(m(xmlPullParser));
        } catch (Throwable unused) {
            fB = 0.0f;
        }
        if (fB <= 0.0f) {
            return false;
        }
        b5Var.setDuration(fB);
        return true;
    }

    public float b(String str) {
        long j;
        String strSubstring = str;
        try {
            if (strSubstring.contains(".")) {
                int iIndexOf = strSubstring.indexOf(".");
                j = Long.parseLong(strSubstring.substring(iIndexOf + 1));
                if (j > 1000) {
                    return -1.0f;
                }
                strSubstring = strSubstring.substring(0, iIndexOf);
            } else {
                j = 0;
            }
            String[] strArrSplit = strSubstring.split(":", 3);
            long j2 = Integer.parseInt(strArrSplit[0]);
            long j3 = Integer.parseInt(strArrSplit[1]);
            long j4 = Integer.parseInt(strArrSplit[2]);
            if (j2 >= 24 || j3 >= 60 || j4 >= 60) {
                return -1.0f;
            }
            Long.signum(j4);
            return (((j + (j4 * 1000)) + (j3 * 60000)) + (j2 * 3600000)) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public final void b() {
        for (int i = 0; i < this.g.size(); i++) {
            b5<T> b5Var = this.g.get(i);
            v9 statHolder = b5Var.getStatHolder();
            statHolder.a(this.b.m(), b5Var.getDuration());
            String strP = this.b.p();
            if (TextUtils.isEmpty(strP)) {
                strP = this.i;
            }
            b5Var.setCtaText(strP);
            Iterator<t7> it = this.e.iterator();
            while (it.hasNext()) {
                t7 next = it.next();
                a(next.d(), next.b(), b5Var);
            }
            statHolder.a(this.d);
            Iterator<e1> it2 = this.f.iterator();
            while (it2.hasNext()) {
                b5Var.addCompanion(it2.next());
            }
            if (i == 0) {
                statHolder.a(this.c);
            }
            b5Var.setOmData(this.k);
        }
    }

    public final void b(String str, String str2, b bVar) {
        if (bVar == null) {
            this.d.add(u9.a(str, str2));
        } else {
            bVar.getStatHolder().a(u9.a(str, str2));
        }
    }

    public final void b(XmlPullParser xmlPullParser) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    i(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void b(XmlPullParser xmlPullParser, b5 b5Var) {
        if ("instreamads".equals(this.f3972a.getFormat()) || "fullscreen".equals(this.f3972a.getFormat()) || "rewarded".equals(this.f3972a.getFormat())) {
            e(xmlPullParser, b5Var);
        } else if ("instreamaudioads".equals(this.f3972a.getFormat())) {
            d(xmlPullParser, b5Var);
        }
    }

    public final void b(XmlPullParser xmlPullParser, String str, String str2) {
        while (l(xmlPullParser) == 2) {
            a(xmlPullParser, str, str2);
        }
    }

    public ArrayList<b5<T>> c() {
        return this.g;
    }

    public void c(String str) throws NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            a();
            for (int iJ = j(xmlPullParserNewPullParser); iJ != 1 && iJ != Integer.MIN_VALUE; iJ = k(xmlPullParserNewPullParser)) {
                if (iJ == 2 && "VAST".equalsIgnoreCase(xmlPullParserNewPullParser.getName())) {
                    h(xmlPullParserNewPullParser);
                }
            }
        } catch (Throwable th) {
            ba.a("VastParser: Unable to parse VAST - " + th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r3, java.lang.String r4, com.my.target.b r5) {
        /*
            r2 = this;
            java.lang.String r0 = "start"
            boolean r0 = r0.equalsIgnoreCase(r3)
            java.lang.String r1 = "error"
            if (r0 == 0) goto Lb
            goto L43
        Lb:
            java.lang.String r0 = "firstQuartile"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1a
            r3 = 1103626240(0x41c80000, float:25.0)
        L15:
            r2.a(r3, r4, r5)
            goto Lbb
        L1a:
            java.lang.String r0 = "midpoint"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L25
            r3 = 1112014848(0x42480000, float:50.0)
            goto L15
        L25:
            java.lang.String r0 = "thirdQuartile"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L30
            r3 = 1117126656(0x42960000, float:75.0)
            goto L15
        L30:
            java.lang.String r0 = "complete"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L3b
            r3 = 1120403456(0x42c80000, float:100.0)
            goto L15
        L3b:
            java.lang.String r0 = "creativeView"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L47
        L43:
            java.lang.String r1 = "playbackStarted"
            goto Lb8
        L47:
            java.lang.String r0 = "mute"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L53
            java.lang.String r1 = "volumeOff"
            goto Lb8
        L53:
            java.lang.String r0 = "unmute"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L5e
            java.lang.String r1 = "volumeOn"
            goto Lb8
        L5e:
            java.lang.String r0 = "pause"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L69
            java.lang.String r1 = "playbackPaused"
            goto Lb8
        L69:
            java.lang.String r0 = "resume"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L74
            java.lang.String r1 = "playbackResumed"
            goto Lb8
        L74:
            java.lang.String r0 = "fullscreen"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L7f
            java.lang.String r1 = "fullscreenOn"
            goto Lb8
        L7f:
            java.lang.String r0 = "exitFullscreen"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L8a
            java.lang.String r1 = "fullscreenOff"
            goto Lb8
        L8a:
            java.lang.String r0 = "skip"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L93
            goto Lb6
        L93:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L9a
            goto Lb8
        L9a:
            java.lang.String r0 = "ClickTracking"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto La5
            java.lang.String r1 = "click"
            goto Lb8
        La5:
            java.lang.String r0 = "close"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto Lae
            goto Lb6
        Lae:
            java.lang.String r0 = "closeLinear"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto Lbb
        Lb6:
            java.lang.String r1 = "closedByUser"
        Lb8:
            r2.b(r1, r4, r5)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.fa.c(java.lang.String, java.lang.String, com.my.target.b):void");
    }

    public final void c(XmlPullParser xmlPullParser) throws NumberFormatException {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Creative".equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("id", xmlPullParser));
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void c(XmlPullParser xmlPullParser, b5 b5Var) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    if (b5Var != null) {
                        String strM = m(xmlPullParser);
                        if (!TextUtils.isEmpty(strM)) {
                            b5Var.setTrackingLink(a(strM));
                        }
                    }
                } else if ("ClickTracking".equals(name)) {
                    String strM2 = m(xmlPullParser);
                    if (!TextUtils.isEmpty(strM2)) {
                        this.d.add(u9.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, strM2));
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public s d() {
        return this.j;
    }

    public final void d(XmlPullParser xmlPullParser) {
        String strA = a("type", xmlPullParser);
        if (strA == null || Arrays.binarySearch(m, strA) < 0) {
            n(xmlPullParser);
            return;
        }
        if (!"linkTxt".equals(strA)) {
            while (l(xmlPullParser) == 2) {
                if (j(xmlPullParser) == 2) {
                    if ("AdVerifications".equals(xmlPullParser.getName())) {
                        b(xmlPullParser);
                    } else {
                        n(xmlPullParser);
                    }
                }
            }
            return;
        }
        String strM = m(xmlPullParser);
        this.i = da.a(strM);
        ba.a("VastParser: VAST linkTxt raw text: " + strM);
        n(xmlPullParser);
    }

    public final void d(XmlPullParser xmlPullParser, b5<AudioData> b5Var) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("MediaFile".equals(xmlPullParser.getName())) {
                    String strA = a("type", xmlPullParser);
                    String strA2 = a("bitrate", xmlPullParser);
                    String strA3 = a(m(xmlPullParser));
                    AudioData audioData = null;
                    if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA3) && strA.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                        int i = 0;
                        if (strA2 != null) {
                            try {
                                i = Integer.parseInt(strA2);
                            } catch (Throwable unused) {
                            }
                        }
                        AudioData audioDataNewAudioData = AudioData.newAudioData(strA3);
                        audioDataNewAudioData.setBitrate(i);
                        audioData = audioDataNewAudioData;
                    }
                    if (audioData == null) {
                        ba.a("VastParser: Skipping unsupported VAST file (mimetype=" + strA + ",url=" + strA3);
                    } else {
                        b5Var.setMediaData(audioData);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void e(XmlPullParser xmlPullParser) {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    d(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void e(XmlPullParser xmlPullParser, b5<VideoData> b5Var) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("MediaFile".equals(xmlPullParser.getName())) {
                    String strA = a("type", xmlPullParser);
                    String strA2 = a("bitrate", xmlPullParser);
                    String strA3 = a("width", xmlPullParser);
                    String strA4 = a("height", xmlPullParser);
                    String strA5 = a(m(xmlPullParser));
                    VideoData videoDataNewVideoData = null;
                    if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA5)) {
                        String[] strArr = l;
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            if (strArr[i4].equals(strA)) {
                                if (strA3 != null) {
                                    try {
                                        i = Integer.parseInt(strA3);
                                    } catch (Throwable unused) {
                                        i = 0;
                                        i2 = 0;
                                    }
                                } else {
                                    i = 0;
                                }
                                if (strA4 != null) {
                                    try {
                                        i2 = Integer.parseInt(strA4);
                                    } catch (Throwable unused2) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (strA2 != null) {
                                    try {
                                        i3 = Integer.parseInt(strA2);
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (i > 0 && i2 > 0) {
                                    videoDataNewVideoData = VideoData.newVideoData(strA5, i, i2);
                                    videoDataNewVideoData.setBitrate(i3);
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (videoDataNewVideoData == null) {
                        ba.a("VastParser: Skipping unsupported VAST file (mimeType=" + strA + ",width=" + strA3 + ",height=" + strA4 + ",url=" + strA5);
                    } else {
                        arrayList.add(videoDataNewVideoData);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
        b5Var.setMediaData(VideoData.chooseBest(arrayList, this.f3972a.getVideoQuality()));
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strM = m(xmlPullParser);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        this.c.add(u9.a("playbackStarted", strM));
        ba.a("VastParser: Impression tracker url for wrapper - " + strM);
    }

    public final void g(XmlPullParser xmlPullParser) throws NumberFormatException {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    e(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    b(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
        b();
    }

    public final void h(XmlPullParser xmlPullParser) throws NumberFormatException {
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2 && "Ad".equals(xmlPullParser.getName())) {
                a(xmlPullParser);
            }
        }
    }

    public final void i(XmlPullParser xmlPullParser) {
        String strA = a("vendor", xmlPullParser);
        String strM = null;
        String strM2 = null;
        while (l(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    strM = m(xmlPullParser);
                } else if ("VerificationParameters".equals(name)) {
                    strM2 = m(xmlPullParser);
                } else {
                    n(xmlPullParser);
                }
            }
        }
        if (strM == null) {
            return;
        }
        if (this.k == null) {
            this.k = i7.a(null, null);
        }
        this.k.c.add((TextUtils.isEmpty(strA) || TextUtils.isEmpty(strM2)) ? ga.a(strM) : ga.a(strM, strA, strM2));
    }
}
