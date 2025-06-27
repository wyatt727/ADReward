package com.json;

import com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.q6;

/* loaded from: classes4.dex */
public class j1 extends q6.a<ISDemandOnlyBannerListener> {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1818a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f1818a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.a(this.f1818a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.f1818a, this.b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1819a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f1819a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.a(this.f1819a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.f1819a);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1820a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f1820a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.a(this.f1820a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.f1820a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1821a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f1821a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.a(this.f1821a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.f1821a);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1822a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f1822a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.a(this.f1822a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.f1822a);
        }
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new e(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new b(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new c(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
