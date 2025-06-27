package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05769a extends AbstractC0982Ps {
    public final /* synthetic */ C1065Sx A00;

    public C05769a(C1065Sx c1065Sx) {
        this.A00 = c1065Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC05698s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0983Pt c0983Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0964Pa(this));
    }
}
