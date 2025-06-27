package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1327bM implements InterfaceC03710p, InterfaceC03891h {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public AnonymousClass10 A02;
    public AnonymousClass11 A03;
    public C03901i A04;
    public C1207Yn A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, Byte.MAX_VALUE, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, Byte.MAX_VALUE, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, Byte.MAX_VALUE, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, Byte.MAX_VALUE, 45, 76, 99, 105, Byte.MAX_VALUE, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, Base64.padSymbol, 83, 91, 90, 87, 95, 74, 87, 81, 80, 122, 95, 74, 95, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 52, 54, 33, 32, 33, 34, 45, 42, 33, 32, 11, 54, 45, 33, 42, 48, 37, 48, 45, 43, 42, 15, 33, Base64.padSymbol, 6, 17, 5, 1, 17, 7, 0, 32, 29, 25, 17, 114, 105, 110, 118, 114, 98, 78, 99, 30, 1, 13, 31, 60, 17, 24, 13, 39, 57, 62, 52, Utf8.REPLACEMENT_BYTE, 39};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(Opcodes.MONITORENTER, 6, 88));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        EnumC0924Nm enumC0924NmA02 = A02();
        if (enumC0924NmA02 == EnumC0924Nm.A06) {
            return -1;
        }
        if (enumC0924NmA02 == EnumC0924Nm.A04) {
            switch (rotation) {
                case 2:
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
        switch (rotation) {
            case 2:
                return 9;
            default:
                String[] strArr = A0C;
                String str = strArr[3];
                String str2 = strArr[7];
                int rotation2 = str.charAt(11);
                if (rotation2 != str2.charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[3] = "CZdwi0h9oyeTk4ywD5LtkOxTOpQ29Yc4";
                strArr2[7] = "yy96Y2PoNFwTE84mLwUlYETryPZgGhEq";
                return 1;
        }
    }

    private final KB A01() {
        return this.A04.A0E();
    }

    private EnumC0924Nm A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C03901i c03901i = this.A04;
        RewardData rewardData = this.A01;
        c03901i.A0I(intent, rewardData, Q7.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C1207Yn c1207Yn, AnonymousClass10 anonymousClass10, C04031v c04031v, EnumSet<CacheFlag> enumSet, String str) {
        C03901i c03901i = new C03901i(c1207Yn, c04031v, this, str);
        C1F c1fA0D = c03901i.A0D();
        if (C0796Ih.A0q(c1207Yn)) {
            boolean z = c1fA0D instanceof AbstractC1310b5;
            String[] strArr = A0C;
            if (strArr[3].charAt(11) == strArr[7].charAt(11)) {
                A0C[2] = "TkuXboGIr4gI6uBXxoSPLVsF8oObr4N9";
                if (z && AbstractC03680l.A06(this.A05, AbstractC03680l.A01(c1207Yn, c04031v.A03(), ((AbstractC1310b5) c1fA0D).A12()), c1207Yn.A09())) {
                    this.A05.A0E().A4K();
                    this.A02.ABp(this, AdError.NO_FILL);
                    String[] strArr2 = A0C;
                    if (strArr2[3].charAt(11) == strArr2[7].charAt(11)) {
                        A0C[1] = "78EqxHXjdVB4uq4fqkQnSqdXUgUnX7wU";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A04 = c03901i;
        A08(c03901i.A0E());
        c03901i.A0J(c1207Yn, enumSet);
    }

    private void A08(KB kb) {
        if (kb.equals(KB.A04)) {
            this.A05.A0E().AGG(EnumC03610e.A04);
            return;
        }
        if (kb.equals(KB.A0A)) {
            this.A05.A0E().AGG(EnumC03610e.A03);
            return;
        }
        if (kb.equals(KB.A0B)) {
            this.A05.A0E().AGG(EnumC03610e.A0A);
            return;
        }
        if (kb.equals(KB.A0D)) {
            this.A05.A0E().AGG(EnumC03610e.A0C);
            return;
        }
        if (kb.equals(KB.A0C)) {
            this.A05.A0E().AGG(EnumC03610e.A0B);
            return;
        }
        boolean zEquals = kb.equals(KB.A06);
        String[] strArr = A0C;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
        if (!zEquals) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0E().AGG(EnumC03610e.A07);
        } else if ((A09() instanceof AbstractC1310b5) && this.A04.A0L((AbstractC1310b5) A09())) {
            this.A05.A0E().AGG(EnumC03610e.A09);
        } else {
            this.A05.A0E().AGG(EnumC03610e.A08);
        }
    }

    public final C1F A09() {
        return this.A04.A0D();
    }

    public final void A0A(C1207Yn c1207Yn, AnonymousClass10 anonymousClass10, C04031v c04031v, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c1207Yn;
        this.A02 = anonymousClass10;
        String strA02 = c04031v.A02();
        this.A08 = strA02;
        this.A06 = strA02 != null ? strA02.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c04031v.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1207Yn, anonymousClass10, c04031v, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            AnonymousClass10 anonymousClass10 = this.A02;
            if (anonymousClass10 != null) {
                anonymousClass10.ABp(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA04 = C0845Kj.A04(this.A05);
        adActivityIntentA04.putExtra(A03(Opcodes.D2L, 24, 76), A00());
        adActivityIntentA04.putExtra(A03(Opcodes.GETSTATIC, 8, 15), this.A0A);
        adActivityIntentA04.putExtra(A03(132, 11, 116), this.A08);
        adActivityIntentA04.putExtra(A03(Opcodes.GOTO, 11, 124), this.A00);
        KB kbA01 = A01();
        A08(kbA01);
        adActivityIntentA04.putExtra(A03(Opcodes.INVOKEDYNAMIC, 8, 96), kbA01);
        String str = this.A07;
        if (str != null) {
            adActivityIntentA04.putExtra(A03(119, 13, 54), str);
        }
        A06(adActivityIntentA04);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "xZPvgBO8krDV4upi6ZXzWcYT2LzaCOyj";
            adActivityIntentA04.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C0845Kj.A0J(this.A05, adActivityIntentA04)) {
                    this.A05.A0E().AF0();
                    AnonymousClass10 anonymousClass102 = this.A02;
                    if (anonymousClass102 != null) {
                        anonymousClass102.ABp(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C0845Kj.A0A(this.A05, adActivityIntentA04);
            return true;
        } catch (C0843Kh e) {
            Throwable cause = e.getCause();
            Throwable cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            this.A05.A07().A9a(A03(108, 11, 76), C8A.A0D, new C8B(cause2));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final String A6T() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final AdPlacementType A7e() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AAe(AdError adError) {
        AnonymousClass10 anonymousClass10 = this.A02;
        if (anonymousClass10 != null) {
            anonymousClass10.ABp(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AAf() {
        A04();
        this.A02.ABo(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AES() {
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.A05, this.A0A, this, this.A02);
        this.A03 = anonymousClass11;
        anonymousClass11.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final boolean AGd() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03891h
    public final void AGm() {
        AnonymousClass11 anonymousClass11 = this.A03;
        if (anonymousClass11 != null) {
            anonymousClass11.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03710p
    public final void onDestroy() {
        C03901i c03901i = this.A04;
        if (c03901i != null) {
            c03901i.A0H();
        }
    }
}
