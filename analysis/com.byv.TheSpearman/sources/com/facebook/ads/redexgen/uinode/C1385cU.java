package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1385cU {
    public InterfaceC1386cV A00;
    public C1372cH A01;
    public final InterfaceC1394ce A03;
    public final InterfaceC1387cW A04;
    public final LinkedHashMap<Integer, Runnable> A05 = new LinkedHashMap<>();
    public final InterfaceC1386cV A02 = new HD(this);

    public C1385cU(InterfaceC1394ce interfaceC1394ce, InterfaceC1387cW interfaceC1387cW) {
        this.A03 = interfaceC1394ce;
        this.A04 = interfaceC1387cW;
    }

    public static C1385cU A01() {
        return new C1385cU(new HH(), null);
    }

    private void A03(AbstractC1388cY abstractC1388cY, InterfaceC1392cc interfaceC1392cc, HB hb) {
        C1372cH c1372cHA00 = C1372cH.A00(abstractC1388cY, interfaceC1392cc, hb);
        this.A01 = c1372cHA00;
        if (0 != 0) {
            c1372cHA00.A01(null);
        }
        this.A01.A02(this.A02);
    }

    private final void A04(DspViewableNode dspViewableNode) {
        C1372cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null) {
            localViewpointWatcher.A03(dspViewableNode);
        }
    }

    private final void A05(DspViewableNode dspViewableNode, C1390ca c1390ca) {
        C1372cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null && c1390ca != null) {
            localViewpointWatcher.A04(dspViewableNode, c1390ca);
        }
    }

    public final void A06(View view) {
        A04(view != null ? ViewpointViewNode.A00(view) : null);
    }

    public final void A07(View view, C1390ca c1390ca) {
        A05(view != null ? ViewpointViewNode.A00(view) : null, c1390ca);
    }

    public final void A08(AbstractC1388cY abstractC1388cY, View view) {
        if (abstractC1388cY != null && view != null) {
            final InterfaceC1387cW interfaceC1387cW = null;
            A03(abstractC1388cY, new HE(view, this.A03), new HB(interfaceC1387cW) { // from class: com.facebook.ads.redexgen.X.6w
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public cX A01;
                public final InterfaceC1387cW A02;
                public final Map<String, C1377cM> A06 = new HashMap();
                public final C1378cN A04 = new C1378cN();
                public final C1378cN A03 = new C1378cN();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, Utf8.REPLACEMENT_BYTE, 36, Base64.padSymbol, Base64.padSymbol, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C05276w.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC1387cW;
                }

                public static Rect A00(C1377cM c1377cM) {
                    if (c1377cM != null && c1377cM.A02.top != Integer.MIN_VALUE && c1377cM.A02.left != Integer.MIN_VALUE) {
                        Rect rect = c1377cM.A02;
                        String[] strArr = A0A;
                        if (strArr[1].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[1] = "p";
                        strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                        if (rect.right != Integer.MIN_VALUE && c1377cM.A02.bottom != Integer.MIN_VALUE) {
                            return c1377cM.A02;
                        }
                    }
                    throw new IllegalStateException(A02(0, Opcodes.D2L, 38));
                }

                private C1377cM A01(C1390ca c1390ca, Rect rect, Rect rect2) {
                    C1377cM c1377cMA03 = this.A06.get(c1390ca.A04);
                    if (this.A04.A06(c1390ca)) {
                        if (c1377cMA03 != null) {
                            c1377cMA03.A01 = EnumC1381cQ.A04;
                        } else {
                            c1377cMA03 = C1377cM.A03(this.A00);
                            this.A06.put(c1390ca.A04, c1377cMA03);
                        }
                    }
                    c1377cMA03.A02.set(rect2);
                    c1377cMA03.A03.add(new Rect(rect));
                    return c1377cMA03;
                }

                private void A04(C1378cN c1378cN) {
                    for (C1390ca c1390ca : c1378cN.A01()) {
                        C1377cM c1377cM = this.A06.get(c1390ca.A04);
                        if (c1377cM == null) {
                            if (0 != 0) {
                                String str = A02(150, 36, 10) + c1390ca.A04;
                                throw new NullPointerException(A02(Opcodes.INVOKEDYNAMIC, 10, 85));
                            }
                        } else {
                            c1377cM.A01 = EnumC1381cQ.A03;
                            c1377cM.A03.clear();
                            c1390ca.A03(this);
                            if (this.A08) {
                                Map<String, C1377cM> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c1377cM);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C1378cN c1378cN) {
                    Iterator it = c1378cN.A00().iterator();
                    while (it.hasNext()) {
                        ((C1390ca) it.next()).A03(this);
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.HB
                public final void A3V(C1390ca c1390ca, Rect rect, Rect rect2) {
                    A01(c1390ca, rect, rect2);
                    C1390ca c1390ca2 = c1390ca.A01;
                    C1390ca parentViewpointData = C1390ca.A08;
                    if (c1390ca2 == parentViewpointData) {
                        return;
                    }
                    boolean zA06 = this.A03.A06(c1390ca2);
                    C1377cM parentViewProperties = this.A06.get(c1390ca2.A04);
                    if (zA06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C1377cM.A03(this.A00);
                            parentViewProperties.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c1390ca2.A04, parentViewProperties);
                        } else {
                            parentViewProperties.A03.clear();
                            if (!this.A07 || c1390ca2.A04()) {
                                parentViewProperties.A01 = EnumC1381cQ.A04;
                            }
                        }
                    }
                    parentViewProperties.A03.add(new Rect(rect));
                }

                @Override // com.facebook.ads.redexgen.uinode.HB
                public final void A41(long j, List<Rect> viewportRects) {
                    this.A00 = j;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    Iterator it2 = this.A04.A01().iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C1390ca) it2.next()).A04);
                    }
                    Iterator it3 = this.A03.A01().iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C1390ca) it3.next()).A04);
                    }
                    Iterator<C1377cM> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        it4.next().A03.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.facebook.ads.redexgen.uinode.HB
                public final void A5Z() {
                    A05(this.A04);
                    A04(this.A04);
                    A05(this.A03);
                    A04(this.A03);
                    if (0 != 0) {
                        new C1376cL(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
                        throw new NullPointerException(A02(Opcodes.D2L, 7, 67));
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC1380cP
                public final void A78(C1390ca c1390ca, Rect rect) {
                    rect.setEmpty();
                    Iterator it = this.A06.get(c1390ca.A04).A03.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC1380cP
                public final EnumC1381cQ A8J(C1390ca c1390ca) {
                    return this.A06.get(c1390ca.A04).A01;
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC1380cP
                public final void A8L(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC1380cP
                public final float A8M(C1390ca c1390ca) {
                    C1377cM c1377cM = this.A06.get(c1390ca.A04);
                    if (c1377cM != null) {
                        Rect rectA00 = A00(c1377cM);
                        int iHeight = rectA00.height() * rectA00.width();
                        int totalVisibleArea = 0;
                        for (Rect rect : c1377cM.A03) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / iHeight;
                    }
                    return 0.0f;
                }

                @Override // com.facebook.ads.redexgen.uinode.HB
                public final void AGH(cX cXVar) {
                    this.A01 = cXVar;
                }
            });
        }
    }
}
