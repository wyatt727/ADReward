package com.my.target;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.k7;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.t6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class j6 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeAd f4016a;
    public final d6 d;
    public final t6 f;
    public final NativePromoBanner g;
    public final k7 h;
    public NativeAd.NativeAdMediaListener i;
    public boolean j;
    public final ArrayList<f6> b = new ArrayList<>();
    public final ArrayList<f6> c = new ArrayList<>();
    public final y0 e = y0.a();

    public static class a implements t6.c {

        /* renamed from: a, reason: collision with root package name */
        public final j6 f4017a;
        public final NativeAd b;

        public a(j6 j6Var, NativeAd nativeAd) {
            this.f4017a = j6Var;
            this.b = nativeAd;
        }

        @Override // com.my.target.s6.b
        public void a() {
            this.f4017a.a();
        }

        @Override // com.my.target.z7.a
        public void a(int i, Context context) {
            this.f4017a.a(i, context);
        }

        @Override // com.my.target.t6.c
        public void a(Context context) {
            String str;
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.f4017a.a(context);
                ba.a("NativeAdEngine: there is no NativeAdChoicesOptionListener, default behaviour for closing the ad.");
                return;
            }
            if (adChoicesOptionListener.shouldCloseAutomatically()) {
                this.f4017a.a(context);
                adChoicesOptionListener.onCloseAutomatically(this.b);
                str = "NativeAdEngine: Ad should close automatically.";
            } else {
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.b);
                str = "NativeAdEngine: Ad shouldn't close automatically.";
            }
            ba.a(str);
        }

        @Override // com.my.target.t6.c
        public void a(View view) {
            this.f4017a.b(view);
        }

        @Override // com.my.target.z7.a
        public void a(View view, int i) {
            this.f4017a.a(view, i);
        }

        @Override // com.my.target.i6.a
        public void a(h6 h6Var, String str, Context context) {
            this.f4017a.a(h6Var, str, context);
        }

        @Override // com.my.target.m2.a
        public void a(boolean z) {
            NativeAd.NativeAdChoicesListener adChoicesListener = this.b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.b);
                return;
            }
            NativePromoBanner banner = this.b.getBanner();
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

        @Override // com.my.target.z7.a
        public void a(int[] iArr, Context context) {
            this.f4017a.a(iArr, context);
        }

        @Override // com.my.target.s6.b
        public void b() {
            this.f4017a.d();
        }

        @Override // com.my.target.t6.c
        public void c() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.f4017a.i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onIconLoad(this.b);
            }
        }

        @Override // com.my.target.s6.b
        public void d() {
            this.f4017a.f();
        }

        @Override // com.my.target.s6.b
        public void e() {
            this.f4017a.g();
        }

        @Override // com.my.target.t6.c
        public void f() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.f4017a.i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onImageLoad(this.b);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4017a.a(view);
        }
    }

    public j6(NativeAd nativeAd, d6 d6Var, MenuFactory menuFactory, Context context) {
        this.f4016a = nativeAd;
        this.d = d6Var;
        this.g = NativePromoBanner.newBanner(d6Var);
        b5<VideoData> videoBanner = d6Var.getVideoBanner();
        k7 k7VarA = k7.a(d6Var, videoBanner != null ? 3 : 2, videoBanner, context);
        this.h = k7VarA;
        e7 e7VarA = e7.a(k7VarA, context);
        e7VarA.a(nativeAd.isUseExoPlayer());
        this.f = t6.a(d6Var, new a(this, nativeAd), e7VarA, menuFactory);
    }

    public static j6 a(NativeAd nativeAd, d6 d6Var, MenuFactory menuFactory, Context context) {
        return new j6(nativeAd, d6Var, menuFactory, context);
    }

    public void a() {
        NativeAd.NativeAdListener listener = this.f4016a.getListener();
        if (listener != null) {
            listener.onVideoComplete(this.f4016a);
        }
    }

    public void a(int i, Context context) {
        List<f6> nativeAdCards = this.d.getNativeAdCards();
        f6 f6Var = (i < 0 || i >= nativeAdCards.size()) ? null : nativeAdCards.get(i);
        if (f6Var == null || this.c.contains(f6Var)) {
            return;
        }
        w9.a(f6Var.getStatHolder().b("render"), context);
        this.c.add(f6Var);
    }

    public void a(Context context) {
        this.f.b(context);
    }

    public void a(View view) {
        ba.a("NativeAdEngine: Click received by native ad");
        if (view != null) {
            a(this.d, view.getContext());
        }
    }

    public void a(View view, int i) {
        ba.a("NativeAdEngine: Click on native card received");
        List<f6> nativeAdCards = this.d.getNativeAdCards();
        if (i >= 0 && i < nativeAdCards.size()) {
            a(nativeAdCards.get(i), view.getContext());
        }
        v9 statHolder = this.d.getStatHolder();
        Context context = view.getContext();
        if (context != null) {
            w9.a(statHolder.b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
        }
    }

    @Override // com.my.target.g2
    public void a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        unregisterView();
        k7 k7Var = this.h;
        if (k7Var != null) {
            k7Var.a(view, new k7.b[0]);
        }
        this.f.a(view, list, i, mediaAdView);
    }

    public final void a(b bVar, Context context) {
        a(bVar, (String) null, context);
    }

    public final void a(b bVar, String str, Context context) {
        if (bVar != null) {
            if (str != null) {
                this.e.a(bVar, str, context);
            } else {
                this.e.a(bVar, context);
            }
        }
        NativeAd.NativeAdListener listener = this.f4016a.getListener();
        if (listener != null) {
            listener.onClick(this.f4016a);
        }
    }

    public void a(h6 h6Var, String str, Context context) {
        ba.a("NativeAdEngine: Click on native content received");
        a((b) h6Var, str, context);
        w9.a(this.d.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
    }

    @Override // com.my.target.g2
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        this.i = nativeAdMediaListener;
    }

    public void a(int[] iArr, Context context) {
        if (this.j) {
            String strD = ca.d(context);
            List<f6> nativeAdCards = this.d.getNativeAdCards();
            for (int i : iArr) {
                f6 f6Var = null;
                if (i >= 0 && i < nativeAdCards.size()) {
                    f6Var = nativeAdCards.get(i);
                }
                if (f6Var != null && !this.b.contains(f6Var)) {
                    v9 statHolder = f6Var.getStatHolder();
                    if (strD != null) {
                        w9.a(statHolder.a(strD), context);
                    }
                    w9.a(statHolder.b("playbackStarted"), context);
                    w9.a(statHolder.b(com.json.i1.u), context);
                    this.b.add(f6Var);
                }
            }
        }
    }

    @Override // com.my.target.g2
    public String b() {
        return "myTarget";
    }

    public void b(View view) {
        k7 k7Var = this.h;
        if (k7Var != null) {
            k7Var.c();
        }
        if (this.j) {
            return;
        }
        this.j = true;
        w9.a(this.d.getStatHolder().b("playbackStarted"), view.getContext());
        int[] iArrB = this.f.b();
        if (iArrB != null) {
            a(iArrB, view.getContext());
        }
        NativeAd.NativeAdListener listener = this.f4016a.getListener();
        ba.a("NativeAdEngine: Ad shown, banner id = " + this.d.getId());
        if (listener != null) {
            listener.onShow(this.f4016a);
        }
    }

    @Override // com.my.target.g2
    public float c() {
        return 0.0f;
    }

    public void d() {
        ba.a("NativeAdEngine: Video error");
        this.f.a();
    }

    @Override // com.my.target.g2
    public NativePromoBanner e() {
        return this.g;
    }

    public void f() {
        NativeAd.NativeAdListener listener = this.f4016a.getListener();
        if (listener != null) {
            listener.onVideoPause(this.f4016a);
        }
    }

    public void g() {
        NativeAd.NativeAdListener listener = this.f4016a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.f4016a);
        }
    }

    @Override // com.my.target.g2
    public void handleAdChoicesClick(Context context) {
        this.f.c(context);
    }

    @Override // com.my.target.g2
    public void unregisterView() {
        this.f.g();
        k7 k7Var = this.h;
        if (k7Var != null) {
            k7Var.a();
        }
    }
}
