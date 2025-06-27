package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC05698s<C9H> A02;
    public final AbstractC05698s<AnonymousClass98> A03;
    public final AbstractC05698s<O8> A04;
    public final AbstractC05698s<AnonymousClass93> A05;
    public final AbstractC05698s<C0903Mr> A06;
    public final AbstractC05698s<C0891Mf> A07;
    public final AbstractC05698s<C0886Ma> A08;
    public final AbstractC05698s<MU> A09;
    public final AbstractC05698s<C0880Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C9I(C1207Yn c1207Yn, J2 j2, SA sa, List<C2P> list, String str) {
        super(c1207Yn, j2, sa, list, str, !sa.A0h(), new QR(c1207Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s7 = new S7(this);
        this.A07 = s7;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C0993Qd c0993Qd = new C0993Qd(this);
        this.A02 = c0993Qd;
        C0992Qc c0992Qc = new C0992Qc(this);
        this.A06 = c0992Qc;
        C0990Qa c0990Qa = new C0990Qa(this);
        this.A09 = c0990Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0925Nn c0925Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A0C = nx;
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s7, rh, s3, c0993Qd, c0992Qc, c0990Qa, qv, nx, s9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C9I(C1207Yn c1207Yn, J2 j2, SA sa, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1207Yn, j2, sa, list, str, !sa.A0h(), bundle, map, new QR(c1207Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s7 = new S7(this);
        this.A07 = s7;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C0993Qd c0993Qd = new C0993Qd(this);
        this.A02 = c0993Qd;
        C0992Qc c0992Qc = new C0992Qc(this);
        this.A06 = c0992Qc;
        C0990Qa c0990Qa = new C0990Qa(this);
        this.A09 = c0990Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0925Nn c0925Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s7, rh, s3, c0993Qd, c0992Qc, c0990Qa, qv, s9);
    }

    public C9I(C1207Yn c1207Yn, J2 j2, SA sa, String str) {
        this(c1207Yn, j2, sa, new ArrayList(), str);
    }

    public C9I(C1207Yn c1207Yn, J2 j2, SA sa, String str, Bundle bundle) {
        this(c1207Yn, j2, sa, new ArrayList(), str, bundle, null);
    }

    public C9I(C1207Yn c1207Yn, J2 j2, SA sa, String str, Map<String, String> extraParams) {
        this(c1207Yn, j2, sa, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s8 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC0868Li.A00(s8);
        } else {
            this.A0B.getStateHandler().post(s8);
        }
    }
}
