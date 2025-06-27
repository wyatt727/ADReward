package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.d7;
import com.my.target.k7;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* loaded from: classes4.dex */
public final class c7 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBannerAd f3937a;
    public final d6 b;
    public final y0 c = y0.a();
    public final d7 d;
    public final NativeBanner e;
    public final k7 f;
    public NativeBannerAd.NativeBannerAdMediaListener g;

    public static class a implements d7.b {

        /* renamed from: a, reason: collision with root package name */
        public final c7 f3938a;
        public final NativeBannerAd b;

        public a(c7 c7Var, NativeBannerAd nativeBannerAd) {
            this.f3938a = c7Var;
            this.b = nativeBannerAd;
        }

        @Override // com.my.target.d7.b
        public void a(View view) {
            this.f3938a.b(view);
        }

        @Override // com.my.target.m2.a
        public void a(boolean z) {
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = this.b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            NativeBanner banner = this.b.getBanner();
            if (banner == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            ImageData adChoicesIcon = banner.getAdChoicesIcon();
            if (adChoicesIcon == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
            } else {
                adChoicesListener.onAdChoicesIconLoad(adChoicesIcon, true, this.b);
            }
        }

        @Override // com.my.target.d7.b
        public void b(Context context) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.f3938a.a(context);
                ba.a("NativeBannerAdEngine: there is no NativeBannerAdChoicesOptionListener, default behaviour for closing the ad.");
            } else if (!adChoicesOptionListener.shouldCloseAutomatically()) {
                ba.a("NativeBannerAdEngine: Ad shouldn't close automatically.");
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.b);
            } else {
                this.f3938a.a(context);
                adChoicesOptionListener.onCloseAutomatically(this.b);
                ba.a("NativeBannerAdEngine: Ad should close automatically.");
            }
        }

        @Override // com.my.target.d7.b
        public void c() {
            NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener = this.f3938a.g;
            if (nativeBannerAdMediaListener != null) {
                nativeBannerAdMediaListener.onIconLoad(this.b);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f3938a.a(view);
        }
    }

    public c7(NativeBannerAd nativeBannerAd, d6 d6Var, MenuFactory menuFactory, Context context) {
        this.f3937a = nativeBannerAd;
        this.b = d6Var;
        this.e = NativeBanner.newBanner(d6Var);
        this.d = d7.a(d6Var, new a(this, nativeBannerAd), menuFactory);
        this.f = k7.a(d6Var, 2, null, context);
    }

    public static c7 a(NativeBannerAd nativeBannerAd, d6 d6Var, MenuFactory menuFactory, Context context) {
        return new c7(nativeBannerAd, d6Var, menuFactory, context);
    }

    public void a(Context context) {
        this.d.b(context);
    }

    public void a(View view) {
        ba.a("NativeBannerAdEngine: Click received by native banner ad");
        if (view != null) {
            a(this.b, view);
        }
    }

    public final void a(b bVar, View view) {
        Context context;
        if (bVar != null && (context = view.getContext()) != null) {
            this.c.a(bVar, context);
        }
        NativeBannerAd.NativeBannerAdListener listener = this.f3937a.getListener();
        if (listener != null) {
            listener.onClick(this.f3937a);
        }
    }

    @Override // com.my.target.h2
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.g = nativeBannerAdMediaListener;
    }

    @Override // com.my.target.h2
    public String b() {
        return "myTarget";
    }

    public void b(View view) {
        k7 k7Var = this.f;
        if (k7Var != null) {
            k7Var.c();
        }
        w9.a(this.b.getStatHolder().b("playbackStarted"), view.getContext());
        NativeBannerAd.NativeBannerAdListener listener = this.f3937a.getListener();
        ba.a("NativeBannerAdEngine: Ad shown, banner Id = " + this.b.getId());
        if (listener != null) {
            listener.onShow(this.f3937a);
        }
    }

    @Override // com.my.target.h2
    public float c() {
        return 0.0f;
    }

    @Override // com.my.target.h2
    public NativeBanner d() {
        return this.e;
    }

    @Override // com.my.target.h2
    public void handleAdChoicesClick(Context context) {
        this.d.c(context);
    }

    @Override // com.my.target.h2
    public void registerView(View view, List<View> list, int i) {
        unregisterView();
        k7 k7Var = this.f;
        if (k7Var != null) {
            k7Var.a(view, new k7.b[0]);
        }
        this.d.a(view, list, i);
    }

    @Override // com.my.target.h2
    public void unregisterView() {
        this.d.b();
        k7 k7Var = this.f;
        if (k7Var != null) {
            k7Var.a();
        }
    }
}
