package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6W extends EM implements Handler.Callback {
    public static String[] A0B = {"0qSWVCRp", "8n", "TBzABSyg8R7UC4ujRNxCq", "jQt0eIY", "v3jD5iBy36", "AYhXU50alurSLkI0yvRIZkZn8z1ow4xX", "qUGfoy2tLuPBRFk8hkXJpZQuwVi5LQ1p", "rA70SaLYISjIKcft86AFQfJkzoYA33nr"};
    public int A00;
    public int A01;
    public DW A02;
    public boolean A03;
    public final Handler A04;
    public final C05909p A05;
    public final DY A06;
    public final E3 A07;
    public final DZ A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public C6W(DZ dz, Looper looper) {
        this(dz, looper, DY.A00);
    }

    public C6W(DZ dz, Looper looper, DY dy) {
        super(4);
        this.A08 = (DZ) AbstractC0763Ha.A01(dz);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (DY) AbstractC0763Ha.A01(dy);
        this.A05 = new C05909p();
        this.A07 = new E3();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(0, metadata);
            String[] strArr = A0B;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "HjLXVjnhMu7EB58lvrXa8leW0c4xSFXO";
            strArr2[6] = "qIzVCSliCuvFWhZzcfJ3ccTrGvRVj8IV";
            messageObtainMessage.sendToTarget();
            return;
        }
        A02(metadata);
    }

    private void A02(Metadata metadata) {
        this.A08.ACK(metadata);
    }

    @Override // com.facebook.ads.redexgen.uinode.EM
    public final void A15() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.EM
    public final void A16(long j, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.EM
    public final void A18(Format[] formatArr, long j) throws C05789c {
        this.A02 = this.A06.A4Y(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final boolean A91() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final boolean A9C() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.Y5
    public final void AFB(long j, long j2) throws C05789c {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A11(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else {
                    boolean zA03 = this.A07.A03();
                    String[] strArr = A0B;
                    if (strArr[3].length() == strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0B[7] = "LGLHrgLhu9uRK5PVWOv1cuvTksuxgVhV";
                    if (!zA03) {
                        this.A07.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                        try {
                            int i = (this.A01 + this.A00) % 5;
                            this.A0A[i] = this.A02.A51(this.A07);
                            this.A09[i] = ((C1185Xr) this.A07).A00;
                            this.A00++;
                        } catch (DX e) {
                            throw C05789c.A01(e, A0z());
                        }
                    }
                }
            }
        }
        int i2 = this.A00;
        if (A0B[1].length() == 1) {
            throw new RuntimeException();
        }
        A0B[1] = "3VtXKAcUijLRyWZ1CGRxfS";
        if (i2 > 0) {
            long[] jArr = this.A09;
            int i3 = this.A01;
            if (jArr[i3] <= j) {
                A01(this.A0A[i3]);
                Metadata[] metadataArr = this.A0A;
                int i4 = this.A01;
                metadataArr[i4] = null;
                this.A01 = (i4 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AA
    public final int AGe(Format format) {
        if (this.A06.AGf(format)) {
            return EM.A0y(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A02((Metadata) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
