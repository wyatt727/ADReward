package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1325bK implements InterfaceC03670k, InterfaceC03710p {
    public static byte[] A0C;
    public static String[] A0D = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0E;
    public int A00;
    public AnonymousClass14 A01;
    public AnonymousClass15 A02;
    public AnonymousClass16 A03;
    public JO A04;
    public List<V2> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1207Yn A0A;
    public final String A0B;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{124, 89, 92, 77, 73, 88, 79, 29, 92, 81, 79, 88, 92, 89, 68, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, Byte.MAX_VALUE, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, Byte.MAX_VALUE, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 11, 9, 4, 4, 13, 26, 60, 17, 24, 13, 64, 66, 81, 71, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 37, 42, 47, 55, 38, 49, 38, 39, 28, 32, 47, 42, 32, 40, 28, 39, 38, 47, 34, 58, 28, 46, 48, 93, 71, 107, 87, 70, 81, 85, 64, 93, 66, 81, 107, 85, 71, 107, 87, 64, 85, 107, 66, 6, 79, 82, 93, 76, 79, 84, 83, 72, 23, 12, 11, 19, 23, 7, 43, 6, 94, 65, 77, 95};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C1326bL(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1325bK.A0M(java.util.Map):void");
    }

    static {
        A04();
        A0E = C1325bK.class.getSimpleName();
    }

    public C1325bK(C1207Yn c1207Yn) {
        this(c1207Yn, new AnonymousClass14());
    }

    public C1325bK(C1207Yn c1207Yn, AnonymousClass14 anonymousClass14) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = anonymousClass14;
        this.A0A = c1207Yn;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(156, 4, 66);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA022 = A02(140, 8, 86);
        if (map.containsKey(strA022)) {
            map2.put(strA022, map.get(strA022));
        }
        return map2;
    }

    private void A05(AnonymousClass14 anonymousClass14) {
        if (!this.A06) {
            this.A01 = anonymousClass14;
            List<AnonymousClass14> listA0f = anonymousClass14.A0f();
            if (listA0f != null && listA0f.size() > 0) {
                int size = listA0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C1325bK adapter = new C1325bK(this.A0A);
                    adapter.A05(listA0f.get(i));
                    arrayList.add(new V2(this.A0A, adapter, (C8T) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            JP jpA0F = this.A01.A0F();
            if (A0D[2].length() != 10) {
                throw new RuntimeException();
            }
            A0D[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (jpA0F != null || A7e() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA06 = this.A01.A06();
        if (iA06 < 0 || iA06 > 100) {
            return 0;
        }
        return iA06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final AnonymousClass14 A0E() {
        return this.A01;
    }

    public final AnonymousClass15 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    public final List<V2> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String strA0b = A0E().A0b();
            if (A0D[2].length() != 10) {
                throw new RuntimeException();
            }
            A0D[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (strA0b != null) {
                this.A0A.A09().AE1(strA0b);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        Iterator<V2> it;
        List<V2> list = this.A05;
        if (list == null) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A0D[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0D[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!zIsEmpty) {
            List<V2> list2 = this.A05;
            if (A0D[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0D[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A0D[2].length() != 10) {
                    A0D[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!zHasNext) {
                        return;
                    }
                } else {
                    A0D[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!zHasNext) {
                        return;
                    }
                }
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass15 anonymousClass15) {
        this.A02 = anonymousClass15;
    }

    public final void A0L(C1207Yn c1207Yn, AnonymousClass15 anonymousClass15, J2 j2, C04031v c04031v, JO jo) {
        int iA06;
        this.A02 = anonymousClass15;
        this.A04 = jo;
        JSONObject jSONObjectA03 = c04031v.A03();
        C8T c8tA01 = c04031v.A01();
        if (c8tA01 != null) {
            iA06 = c8tA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(AnonymousClass17.A00(c1207Yn, jSONObjectA03, LJ.A02(jSONObjectA03, A02(94, 2, 85))));
        if (AbstractC03680l.A06(c1207Yn, this, j2)) {
            c1207Yn.A0E().A4K();
            anonymousClass15.ACQ(this, C0813Jb.A00(AdErrorType.NO_FILL));
            return;
        }
        if (anonymousClass15 != null) {
            anonymousClass15.ACN(this);
        }
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(c1207Yn, this.A0B, this, anonymousClass15);
        this.A03 = anonymousClass16;
        anonymousClass16.A02();
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A09().A9W(this.A01.A0Y(), extraData);
    }

    public final void A0O(Map<String, String> map) {
        if (A0R() && !this.A08) {
            AnonymousClass15 anonymousClass15 = this.A02;
            if (anonymousClass15 != null) {
                anonymousClass15.ACO(this);
            }
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A01.A0h()) {
                map2.put(A02(87, 7, 63), String.valueOf(A0E().A04()));
                map2.put(A02(80, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A6T())) {
                if (!this.A01.A0h()) {
                    this.A0A.A0E().A2k();
                    C2O.A00(this.A01.A0Z());
                }
                this.A0A.A09().A9g(A6T(), map2);
            }
            if (A0T() || A0U()) {
                A06(map, map2);
            }
            this.A08 = true;
        }
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0g();
    }

    public final boolean A0T() {
        if (C0796Ih.A1B(this.A0A) && A0R()) {
            boolean zA0i = this.A01.A0i();
            if (A0D[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0D[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (zA0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0U() {
        if (C0796Ih.A1B(this.A0A) && A0R()) {
            boolean zA0j = this.A01.A0j();
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0D[2] = "qputmJyOXU";
            if (zA0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final String A6T() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final Collection<String> A6n() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03670k
    public final EnumC03660j A7E() {
        return A0E().A0C();
    }

    public AdPlacementType A7e() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final boolean AGd() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final void onDestroy() {
        AnonymousClass16 anonymousClass16 = this.A03;
        if (anonymousClass16 != null) {
            anonymousClass16.A03();
        }
    }
}
