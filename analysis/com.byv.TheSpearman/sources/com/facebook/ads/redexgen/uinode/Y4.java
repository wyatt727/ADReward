package com.facebook.ads.redexgen.uinode;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Y4 implements InterfaceC0792Id, InterfaceC0610Aj, InterfaceC0730Fr, DZ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ EH A00;

    public Y4(EH eh) {
        this.A00 = eh;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAo(String str, long j, long j2) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610Aj) it.next()).AAo(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAp(BC bc) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            InterfaceC0610Aj interfaceC0610Aj = (InterfaceC0610Aj) it.next();
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            interfaceC0610Aj.AAp(bc);
        }
        this.A00.A06 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAq(BC bc) {
        this.A00.A09 = bc;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610Aj) it.next()).AAq(bc);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAr(Format format) {
        this.A00.A06 = format;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610Aj) it.next()).AAr(format);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAs(int i) {
        this.A00.A01 = i;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610Aj) it.next()).AAs(i);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0610Aj
    public final void AAt(int i, long j, long j2) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610Aj) it.next()).AAt(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0730Fr
    public final void ABF(List<C0726Fn> list) {
        this.A00.A0C = list;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0730Fr) it.next()).ABF(list);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ABN(int i, long j) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC0792Id) it.next()).ABN(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.DZ
    public final void ACK(Metadata metadata) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((DZ) it.next()).ACK(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ACt(Surface surface) {
        if (this.A00.A03 == surface) {
            Iterator it = this.A00.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0792Id) it2.next()).ACt(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ADU(String str, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC0792Id) it.next()).ADU(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ADV(BC bc) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC0792Id) it.next()).ADV(bc);
        }
        this.A00.A07 = null;
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ADW(BC bc) {
        this.A00.A0A = bc;
        Iterator it = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (zHasNext) {
                ((InterfaceC0792Id) it.next()).ADW(bc);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ADa(Format format) {
        this.A00.A07 = format;
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC0792Id) it.next()).ADa(format);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0792Id
    public final void ADf(int i, int i2, int i3, float f) {
        Iterator it = this.A00.A0M.iterator();
        while (it.hasNext()) {
            ((IU) it.next()).ADf(i, i2, i3, f);
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (zHasNext) {
                ((InterfaceC0792Id) it2.next()).ADf(i, i2, i3, f);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
