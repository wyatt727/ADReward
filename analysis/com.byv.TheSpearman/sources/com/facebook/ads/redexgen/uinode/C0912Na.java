package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0912Na {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = C0912Na.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<InterfaceC0913Nb> A04;
    public final WeakReference<RE> A05;
    public final WeakReference<C1086Ts> A06;

    public C0912Na(C1086Ts c1086Ts, InterfaceC0913Nb interfaceC0913Nb, RE re, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1207Yn c1207Yn) {
        this.A06 = new WeakReference<>(c1086Ts);
        this.A04 = new WeakReference<>(interfaceC0913Nb);
        this.A05 = new WeakReference<>(re);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1207Yn.A0E());
    }

    private C0S A00() {
        C0S funnel = this.A03.get();
        if (funnel == null) {
            return new C1342bb();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return LJ.A01(C8J.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AGz(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AH0();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().AH1();
            if (this.A06.get().isShown()) {
                A00().AH2();
                new Handler(Looper.getMainLooper()).post(new C1088Tu(this.A05));
            }
            InterfaceC0913Nb interfaceC0913Nb = this.A04.get();
            if (interfaceC0913Nb != null) {
                new Handler(Looper.getMainLooper()).post(new NZ(this, interfaceC0913Nb));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1086Ts webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AH3(true);
            return;
        }
        InterfaceC0913Nb listener = this.A04.get();
        if (listener == null) {
            A00().AH3(true);
        } else {
            A00().AH3(false);
            listener.ACU();
        }
    }
}
