package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1285ag implements K3 {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    public InterfaceC04061y A00;
    public C8S A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C03760u A07;
    public final C1207Yn A08;
    public final J2 A09;
    public final EnumC0817Jg A0A;
    public final K4 A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, Utf8.REPLACEMENT_BYTE, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        AbstractC0876Lq.A02();
    }

    public C1285ag(C1207Yn c1207Yn, String str, EnumC0817Jg enumC0817Jg, AdSize adSize, int i) {
        this.A08 = c1207Yn;
        this.A0D = str;
        this.A0A = enumC0817Jg;
        this.A06 = adSize;
        this.A04 = i;
        K4 k4 = new K4(c1207Yn);
        this.A0B = k4;
        k4.A0P(this);
        this.A07 = new C03760u();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FH(this);
        this.A09 = c1207Yn.A09();
        DynamicLoaderFactory.makeLoader(c1207Yn).getInitApi().onAdLoadInvoked(c1207Yn);
    }

    private List<C1325bK> A04() {
        C8S c8s = this.A01;
        ArrayList arrayList = new ArrayList(c8s.A02());
        for (C8Q c8qA04 = c8s.A04(); c8qA04 != null; c8qA04 = c8s.A04()) {
            InterfaceC03710p interfaceC03710pA00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (interfaceC03710pA00 != null && interfaceC03710pA00.A7e() == AdPlacementType.NATIVE) {
                C1325bK nativeAdapter = (C1325bK) interfaceC03710pA00;
                nativeAdapter.A0L(this.A08, new FI(this, arrayList, nativeAdapter), this.A09, new C04031v(c8qA04.A04(), c8s.A05(), this.A0D, c8s.A05().A0C()), V2.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            C0822Jl c0822Jl = new C0822Jl(this.A08, null, null, null);
            C1207Yn c1207Yn = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new K1(c1207Yn, str, adSize != null ? new LQ(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, c0822Jl, LW.A01(C0796Ih.A0J(this.A08)), this.A02, null, new C1278aZ()));
        } catch (C0814Jc e) {
            ABR(C0813Jb.A02(e));
        }
    }

    public final void A08(InterfaceC04061y interfaceC04061y) {
        this.A00 = interfaceC04061y;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C8S c8s = this.A01;
        return c8s == null || c8s.A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final void ABR(C0813Jb c0813Jb) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC04061y interfaceC04061y = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC04061y != null) {
            interfaceC04061y.ABR(c0813Jb);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final void ADG(C1109Up c1109Up) {
        C8S c8sA00 = c1109Up.A00();
        if (c8sA00 != null) {
            if (this.A03) {
                long jA0A = c8sA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c8sA00;
            List<C1325bK> listA04 = A04();
            if (this.A00 != null) {
                if (listA04.isEmpty()) {
                    this.A00.ABR(C0813Jb.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ACP(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
