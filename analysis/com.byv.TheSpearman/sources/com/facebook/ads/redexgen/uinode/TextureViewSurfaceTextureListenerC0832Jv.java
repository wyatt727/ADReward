package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC0832Jv extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1009Qt, R9, InterfaceC1011Qv {
    public static byte[] A0O;
    public static String[] A0P = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1207Yn A0A;
    public QM A0B;
    public C1012Qw A0C;
    public RB A0D;
    public RB A0E;
    public RC A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, Byte.MAX_VALUE, 49, 116, 105, 114, 116, 97, 101, 120, 126, Byte.MAX_VALUE, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, Byte.MAX_VALUE, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, Byte.MAX_VALUE, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, Utf8.REPLACEMENT_BYTE, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, Byte.MAX_VALUE, 101, 125, 104, 49, 120, 118, Byte.MAX_VALUE, 126, 99, 116, 49, 120, 101, Utf8.REPLACEMENT_BYTE, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, Byte.MAX_VALUE, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, Byte.MAX_VALUE, 98, 100, 101, 43, 124, 98, Byte.MAX_VALUE, 99, 43, 120, 110, Byte.MAX_VALUE, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, Byte.MAX_VALUE, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, Byte.MAX_VALUE, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, Byte.MAX_VALUE, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0P;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C0796Ih.A1X(this.A0A) && this.A0D != RB.A08) {
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0E().AFY();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            RC rc = this.A0F;
            if (rc != null) {
                rc.ABa(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureViewSurfaceTextureListenerC0832Jv.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0832Jv(C1207Yn c1207Yn) {
        super(c1207Yn);
        this.A0D = RB.A04;
        this.A0E = RB.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = QM.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1207Yn;
    }

    public TextureViewSurfaceTextureListenerC0832Jv(C1207Yn c1207Yn, AttributeSet attributeSet) {
        super(c1207Yn, attributeSet);
        this.A0D = RB.A04;
        this.A0E = RB.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = QM.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1207Yn;
    }

    public TextureViewSurfaceTextureListenerC0832Jv(C1207Yn c1207Yn, AttributeSet attributeSet, int i) {
        super(c1207Yn, attributeSet, i);
        this.A0D = RB.A04;
        this.A0E = RB.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = QM.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1207Yn;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Yn r1 = r5.A0A
            com.facebook.ads.redexgen.X.Qw r0 = new com.facebook.ads.redexgen.X.Qw
            r0.<init>(r1)
            r5.A0C = r0
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.Qw r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.Qw r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L65
            boolean r0 = r5.A0I
            if (r0 != 0) goto L65
            com.facebook.ads.redexgen.X.Yn r0 = r5.A0A
            android.app.Activity r4 = r0.A0D()
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A0P
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A0P
            java.lang.String r1 = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto Lbc
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r4)
            r5.A09 = r1
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L52
            r0 = r5
        L52:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.R2 r0 = new com.facebook.ads.redexgen.X.R2
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L65:
            java.lang.String r4 = r5.A0G
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A0P
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lad
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A0P
            java.lang.String r1 = "7OzxCvlMe7OewOex"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto L8d
        L83:
            int r0 = r4.length()
            if (r0 == 0) goto L8d
            boolean r0 = r5.A0K
            if (r0 == 0) goto L9a
        L8d:
            com.facebook.ads.redexgen.X.Qw r2 = r5.A0C
            com.facebook.ads.redexgen.X.Yn r0 = r5.A0A
            com.facebook.ads.redexgen.X.Ym r1 = r0.A01()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        L9a:
            com.facebook.ads.redexgen.X.RB r0 = com.facebook.ads.redexgen.uinode.RB.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lac
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lac:
            return
        Lad:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A0P
            java.lang.String r1 = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L8d
            goto L83
        Lbc:
            r0 = 0
            r5.A09 = r0
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.TextureViewSurfaceTextureListenerC0832Jv.A04():void");
    }

    private void A05() {
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw == null) {
            return;
        }
        C1010Qu c1010QuA08 = c1012Qw.A08();
        String[] strArr = A0P;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (c1010QuA08 != null) {
            A08(c1010QuA08.A01, c1010QuA08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw != null) {
            c1012Qw.A09();
            if (A0P[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(RB.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (i != 0 && i2 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C1012Qw.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8Q();
        if (A0P[1].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0P;
        strArr[3] = "ibP83lPIHp18E6DzSXuO582r7E";
        strArr[0] = "bqS8XhAkEDMP7WptTe4caNAUJi";
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void A8Q() {
        if (!this.A0H) {
            ADu(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final boolean A8b() {
        C1012Qw c1012Qw = this.A0C;
        return c1012Qw != null && c1012Qw.A0K();
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final boolean A8c() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final boolean A9B() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1009Qt
    public final void ACe(String str, Exception exc) {
        this.A0A.A0E().AAR(str);
        this.A0A.A0E().A37(1);
        setVideoState(RB.A03);
        this.A0A.A07().A9a(A03(219, 7, 124), C8A.A1N, new C8B(exc));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1009Qt
    public final void ACf(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(RB.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                RC rc = this.A0F;
                String[] strArr = A0P;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int seekFrom = str2.length();
                if (length == seekFrom) {
                    throw new RuntimeException();
                }
                A0P[1] = "rrPXv2FoHSgfFGcrQjG2fRVM";
                if (rc == null) {
                    return;
                }
                int seekFrom2 = getCurrentPosition();
                rc.AD3(i2, seekFrom2);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j = this.A05;
                if (j > 0 && j < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z && this.A0N) {
                    setVideoState(RB.A05);
                    return;
                }
                if (z || this.A0D == RB.A06) {
                    return;
                }
                setVideoState(RB.A07);
                if (this.A0E != RB.A0A) {
                    return;
                }
                AGS(this.A0B, 8);
                this.A0E = RB.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(RB.A06);
                }
                C1012Qw c1012Qw = this.A0C;
                if (c1012Qw != null) {
                    c1012Qw.A0I(false);
                    if (!z) {
                        this.A0C.A0A();
                    }
                }
                this.A0N = false;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1011Qv
    public final void ADf(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void ADu(boolean z, int i) {
        this.A0A.A0E().A33(i);
        this.A0E = RB.A05;
        this.A0M = z;
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw != null) {
            c1012Qw.A0I(false);
        } else {
            setVideoState(RB.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void AGN(int i) {
        this.A0A.A0E().AAS(i);
        setVideoState(RB.A09);
        AGZ(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void AGS(QM qm, int i) {
        this.A0A.A0E().A3E(i);
        this.A0M = false;
        this.A0E = RB.A0A;
        this.A0B = qm;
        if (this.A0C == null) {
            setup(this.A06);
        } else {
            if (this.A0D != RB.A07 && this.A0D != RB.A05 && this.A0D != RB.A06) {
                return;
            }
            this.A0C.A0I(true);
            setVideoState(RB.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void AGZ(int i) {
        this.A0A.A0E().A3G(i);
        this.A0E = RB.A04;
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw != null) {
            c1012Qw.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(RB.A04);
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public int getCurrentPosition() {
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw != null) {
            return (int) c1012Qw.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public int getDuration() {
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw == null) {
            return 0;
        }
        return (int) c1012Qw.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public QM getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public RB getState() {
        return this.A0D;
    }

    public RB getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C0796Ih.A2D(getContext()) && !isHardwareAccelerated()) {
            setVideoState(RB.A03);
            AGZ(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.A07 = surface2;
        C1012Qw c1012Qw = this.A0C;
        if (c1012Qw == null) {
            return;
        }
        c1012Qw.A0E(surface2);
        if (this.A0D == RB.A05 && !this.A0M) {
            AGS(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            C1012Qw c1012Qw = this.A0C;
            if (c1012Qw != null) {
                c1012Qw.A0E(null);
            }
        }
        if (this.A0D == RB.A05) {
            return true;
        }
        if (A0P[5].length() != 21) {
            throw new RuntimeException();
        }
        A0P[5] = "TScQzo9LVHiM3saFvXTgi";
        ADu(false, 5);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != RB.A05) {
                if ((this.A0A.A0F().A01() || C0796Ih.A1c(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.R1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A8Q();
                    return;
                }
            }
            return;
        }
        if (this.A0D != RB.A05 || this.A0M) {
            return;
        }
        AGS(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        long j = i;
        String[] strArr = A0P;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0P[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0P[5].length() != 21) {
            throw new RuntimeException();
        }
        A0P[1] = "HF5JdwiOlRNKOfaOH";
        if (!zIsDebugBuild) {
            return;
        }
        Log.w(A0Q, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new R4(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (!AdInternalSettings.isDebugBuild()) {
            return;
        }
        String str = A0Q;
        String[] strArr = A0P;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
        strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
        Log.w(str, A03(102, 94, 79));
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new R3(this));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != RB.A08 && this.A0D != RB.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(RB rb) {
        if (rb != this.A0D) {
            if (this.A0A.A04().A8z()) {
                String str = A03(196, 23, 51) + rb;
            }
            this.A0D = rb;
            if (rb == RB.A0A) {
                this.A0N = true;
            }
            RC rc = this.A0F;
            if (rc != null) {
                rc.ADh(rb);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setVideoStateChangeListener(RC rc) {
        this.A0F = rc;
    }

    @Override // com.facebook.ads.redexgen.uinode.R9
    public void setup(Uri uri) {
        this.A0A.A0E().A36();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
