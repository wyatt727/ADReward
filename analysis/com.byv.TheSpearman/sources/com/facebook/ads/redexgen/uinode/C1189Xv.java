package com.facebook.ads.redexgen.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1189Xv implements InterfaceC0602Ab {
    public static String[] A06 = {"LkLK", "abA9PNMrvscgwbqokpbH2", "wszIi3vfQywtet5OFqyTWUvoUYNS5ktb", "liexkOjxlVrdDutCVl0EvpIg3k3OXdWT", "uDjcyehsvUvWAc8oFKsUcicvrdYrbu", "Yx0xuqb7ConKzBOp6wI44fmqMUTcgjwu", "2AEFdY1ASteFDfy1ihWDcuoiihyMOIox", "2HHuLOzdt0KrTaQRoJg3USXKVGpaMcoz"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = InterfaceC0602Ab.A00;
    public ByteBuffer A04 = InterfaceC0602Ab.A00;

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A4Q(int i, int i2, int i3) throws C0601Aa {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.A02 != i || this.A00 != i2 || this.A01 != i3) {
                this.A02 = i;
                this.A00 = i2;
                this.A01 = i3;
                return true;
            }
            String[] strArr = A06;
            if (strArr[5].charAt(14) == strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[4] = "26RCfMYW5Do9ItFOuFHGepjFl0G7YQ";
            return false;
        }
        throw new C0601Aa(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = InterfaceC0602Ab.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7X() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final int A7Z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A8w() {
        int i = this.A01;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final boolean A91() {
        return this.A05 && this.A04 == InterfaceC0602Ab.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void AEE() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void AEF(ByteBuffer byteBuffer) {
        int limit;
        int i = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i;
        int position = this.A01;
        switch (position) {
            case Integer.MIN_VALUE:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case 1073741824:
                limit = limit2 / 2;
                break;
            default:
                throw new IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
            String[] strArr = A06;
            String str = strArr[5];
            String str2 = strArr[3];
            int limit3 = str.charAt(14);
            int position4 = str2.charAt(14);
            if (limit3 == position4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "hXv0xOe0fZxBP6BjMdwou1g9whaCh4Nv";
            strArr2[7] = "rvzJSg8TnEJLrC3bKKMSDNtobyDED6VD";
            this.A03 = byteBufferOrder;
        } else {
            this.A03.clear();
        }
        int position5 = this.A01;
        switch (position5) {
            case Integer.MIN_VALUE:
                while (i < resampledSize) {
                    int position6 = i + 1;
                    this.A03.put(byteBuffer.get(position6));
                    int position7 = i + 2;
                    this.A03.put(byteBuffer.get(position7));
                    i += 3;
                }
                int position8 = byteBuffer.limit();
                byteBuffer.position(position8);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 3:
                while (i < resampledSize) {
                    this.A03.put((byte) 0);
                    ByteBuffer byteBuffer2 = this.A03;
                    int position9 = byteBuffer.get(i);
                    byte b = (byte) ((position9 & 255) - 128);
                    if (A06[1].length() != 4) {
                        String[] strArr3 = A06;
                        strArr3[5] = "93yfqVEE4BL66fKyhULGxcexfiDPz3ma";
                        strArr3[3] = "pJFS3cGyfO0gWrhajAAEFVsdSj1hVUV9";
                        byteBuffer2.put(b);
                        i++;
                    } else {
                        byteBuffer2.put(b);
                        i++;
                    }
                }
                int position82 = byteBuffer.limit();
                byteBuffer.position(position82);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 1073741824:
                while (i < resampledSize) {
                    int position10 = i + 2;
                    this.A03.put(byteBuffer.get(position10));
                    int position11 = i + 3;
                    this.A03.put(byteBuffer.get(position11));
                    i += 4;
                }
                int position822 = byteBuffer.limit();
                byteBuffer.position(position822);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void flush() {
        this.A04 = InterfaceC0602Ab.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0602Ab
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = InterfaceC0602Ab.A00;
    }
}
