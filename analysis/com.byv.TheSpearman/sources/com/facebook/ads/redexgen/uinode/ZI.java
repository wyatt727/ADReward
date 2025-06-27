package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewListener;

/* loaded from: assets/audience_network.dex */
public class ZI implements MP {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ ZH A01;

    public ZI(ZH zh, MediaViewListener mediaViewListener) {
        this.A01 = zh;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void AB8() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ABP() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ABV() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ABc() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ABe() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ACY() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void ADi() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.uinode.MP
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
