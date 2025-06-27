package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC04061y {
    public static byte[] A03;
    public C04965m A00;
    public C1207Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public ZA(C04965m c04965m, C1207Yn c1207Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c04965m;
        this.A01 = c1207Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04061y
    public final void ABR(C0813Jb c0813Jb) {
        KK.A00(new ZD(this, c0813Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04061y
    public final void ACP(List<C1325bK> list) {
        C05126c manager = new C05126c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1325bK c1325bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1325bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1325bK.A0E().A0G() != null) {
                    manager.A0b(new C05106a(c1325bK.A0E().A0G().getUrl(), c1325bK.A0E().A0G().getHeight(), c1325bK.A0E().A0G().getWidth(), c1325bK.A0G(), A02(0, 6, 2)));
                }
                if (c1325bK.A0E().A0F() != null) {
                    manager.A0b(new C05106a(c1325bK.A0E().A0F().getUrl(), c1325bK.A0E().A0F().getHeight(), c1325bK.A0E().A0F().getWidth(), c1325bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1325bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1325bK.A0E().A0d(), c1325bK.A0G(), A02(0, 6, 2), c1325bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
