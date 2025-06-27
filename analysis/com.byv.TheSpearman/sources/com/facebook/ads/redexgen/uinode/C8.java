package com.facebook.ads.redexgen.uinode;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class C8 extends AbstractC1183Xp<C5, AbstractC0644Br, C0728Fp> implements WL {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract InterfaceC0727Fo A0b(byte[] bArr, int i, boolean z) throws C0728Fp;

    public C8(String str) throws IllegalStateException {
        super(new C5[2], new AbstractC0644Br[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1183Xp
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6Q A0V() {
        return new AbstractC0644Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC0644Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1183Xp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0728Fp A0W(C5 c5, AbstractC0644Br abstractC0644Br, boolean z) {
        try {
            ByteBuffer inputData = c5.A01;
            abstractC0644Br.A09(((C1185Xr) c5).A00, A0b(inputData.array(), inputData.limit(), z), c5.A00);
            abstractC0644Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0728Fp e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1183Xp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0728Fp A0X(Throwable th) {
        return new C0728Fp(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1183Xp
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C5 A0T() {
        return new C5();
    }

    public final void A0c(AbstractC0644Br abstractC0644Br) {
        super.A0a(abstractC0644Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.WL
    public final void AGB(long j) {
    }
}
