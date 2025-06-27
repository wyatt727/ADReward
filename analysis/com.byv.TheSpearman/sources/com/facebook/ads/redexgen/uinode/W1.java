package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0753Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0752Go A07;
    public final InterfaceC0766Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, 2000, InterfaceC0766Hd.A00);
    }

    public W1(Handler handler, InterfaceC0752Go interfaceC0752Go, long j, int i, InterfaceC0766Hd interfaceC0766Hd) {
        this.A06 = handler;
        this.A07 = interfaceC0752Go;
        this.A09 = new IA(i);
        this.A08 = interfaceC0766Hd;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0753Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void AB1(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC0763Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i = (int) (nowMs - this.A03);
        this.A05 += i;
        long j = this.A04;
        long j2 = this.A02;
        this.A04 = j + j2;
        if (i > 0) {
            this.A09.A03((int) Math.sqrt(j2), (RtspMediaSource.DEFAULT_TIMEOUT_MS * j2) / i);
            if (this.A05 >= 2000 || this.A04 >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.HG
    public final synchronized void ADP(Object obj, C0762Gy c0762Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}
