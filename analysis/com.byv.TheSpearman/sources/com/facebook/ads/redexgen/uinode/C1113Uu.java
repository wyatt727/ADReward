package com.facebook.ads.redexgen.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1113Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        if (AbstractC0863Ld.A00(this.A01.A04) == EnumC0862Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA00 = A00(13, 21, 92);
            this.A01.A04.A0E().A2v(C0865Lf.A01(this.A01.A00), adErrorType.getErrorCode(), strA00, adErrorType.isPublicError());
            this.A01.A0D(new C0813Jb(adErrorType, strA00));
            return;
        }
        C8J.A08(this.A01.A04);
        C6E.A07(this.A01.A04);
        boolean z = true;
        Map<String, String> mapA09 = this.A00.A09(C05628l.A00().A01(this.A01.A04, true).A6w(this.A00.A05()));
        this.A01.A02 = mapA09;
        try {
            PackageManager packageManager = this.A01.A04.getPackageManager();
            if (packageManager != null) {
                mapA09.put(A00(1, 12, 113), new String(Base64.encode((this.A01.A04.getPackageName() + A00(0, 1, 93) + packageManager.getInstallerPackageName(this.A01.A04.getPackageName())).getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC0817Jg.A03 && this.A00.A06() != EnumC0817Jg.A05 && this.A00.A06() != EnumC0817Jg.A04 && this.A00.A06() != null) {
                z = false;
            }
            C1018Rc.A02(z, this.A01.A04).AE0(this.A01.A06, new RY().A05(this.A01.A02).A08(), this.A01.A02(C0865Lf.A00(), this.A00));
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            this.A01.A04.A0E().A2v(C0865Lf.A01(this.A01.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C0813Jb.A01(adErrorType2, message));
        }
    }

    public C1113Uu(K4 k4, K1 k1) {
        this.A01 = k4;
        this.A00 = k1;
    }
}
