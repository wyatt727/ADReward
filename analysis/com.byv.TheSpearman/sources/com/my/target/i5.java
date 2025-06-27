package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.g5;
import com.my.target.mediation.AdChoicesClickHandler;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.mediation.MediationNativeAdConfig;
import com.my.target.mediation.MyTargetNativeAdAdapter;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.o5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class i5 extends g5<MediationNativeAdAdapter> implements g2, NativeAd.NativeAdChoicesOptionListener {
    public final NativeAd k;
    public final MenuFactory l;
    public NativePromoBanner m;
    public WeakReference<MediaAdView> n;
    public WeakReference<View> o;
    public WeakReference<IconAdView> p;

    public class a implements MediationNativeAdAdapter.MediationNativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f3999a;

        public a(f5 f5Var) {
            this.f3999a = f5Var;
        }

        public final boolean a() {
            return ("myTarget".equals(this.f3999a.b()) || "0".equals(this.f3999a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = i5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(i5.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesListener adChoicesListener;
            StringBuilder sb;
            String str;
            i5 i5Var = i5.this;
            if (i5Var.d == mediationNativeAdAdapter && (adChoicesListener = i5Var.k.getAdChoicesListener()) != null) {
                String strB = this.f3999a.b();
                if (z) {
                    sb = new StringBuilder();
                    sb.append("MediationNativeAdEngine: AdChoices icon from");
                    sb.append(strB);
                    str = " ad network loaded successfully";
                } else {
                    sb = new StringBuilder();
                    sb.append("MediationNativeAdEngine: AdChoices icon from");
                    sb.append(strB);
                    str = " hasn't loaded";
                }
                sb.append(str);
                ba.a(sb.toString());
                adChoicesListener.onAdChoicesIconLoad(imageData, z, i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onClick(MediationNativeAdAdapter mediationNativeAdAdapter) {
            i5 i5Var = i5.this;
            if (i5Var.d != mediationNativeAdAdapter) {
                return;
            }
            Context contextH = i5Var.h();
            if (contextH != null) {
                w9.a(this.f3999a.h().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), contextH);
            }
            NativeAd.NativeAdListener listener = i5.this.k.getListener();
            if (listener != null) {
                listener.onClick(i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onCloseAutomatically(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = i5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(i5.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (i5.this.d != mediationNativeAdAdapter) {
                return;
            }
            String strB = this.f3999a.b();
            ba.a("MediationNativeAdEngine: Data from " + strB + " ad network loaded successfully");
            Context contextH = i5.this.h();
            if (a() && contextH != null) {
                l6.b(strB, nativePromoBanner, contextH);
            }
            i5.this.a(this.f3999a, true);
            i5 i5Var = i5.this;
            i5Var.m = nativePromoBanner;
            NativeAd.NativeAdListener listener = i5Var.k.getListener();
            if (listener != null) {
                listener.onLoad(nativePromoBanner, i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (i5.this.d != mediationNativeAdAdapter) {
                return;
            }
            ba.a("MediationNativeAdEngine: No data from " + this.f3999a.b() + " ad network - " + iAdLoadingError);
            i5.this.a(this.f3999a, false);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onShow(MediationNativeAdAdapter mediationNativeAdAdapter) {
            i5 i5Var = i5.this;
            if (i5Var.d != mediationNativeAdAdapter) {
                return;
            }
            Context contextH = i5Var.h();
            if (contextH != null) {
                w9.a(this.f3999a.h().b("playbackStarted"), contextH);
            }
            NativeAd.NativeAdListener listener = i5.this.k.getListener();
            if (listener != null) {
                listener.onShow(i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            i5 i5Var = i5.this;
            if (i5Var.d == mediationNativeAdAdapter && (listener = i5Var.k.getListener()) != null) {
                listener.onVideoComplete(i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            i5 i5Var = i5.this;
            if (i5Var.d == mediationNativeAdAdapter && (listener = i5Var.k.getListener()) != null) {
                listener.onVideoPause(i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            i5 i5Var = i5.this;
            if (i5Var.d == mediationNativeAdAdapter && (listener = i5Var.k.getListener()) != null) {
                listener.onVideoPlay(i5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public boolean shouldCloseAutomatically() {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = i5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    public static class b extends g5.a implements MediationNativeAdConfig {
        public final int h;
        public final int i;
        public final MenuFactory j;

        public b(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            super(str, str2, map, i, i2, myTargetPrivacy, adNetworkConfig);
            this.h = i3;
            this.i = i4;
            this.j = menuFactory;
        }

        public static b a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            return new b(str, str2, map, i, i2, myTargetPrivacy, i3, i4, adNetworkConfig, menuFactory);
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getAdChoicesPlacement() {
            return this.i;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getCachePolicy() {
            return this.h;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public MenuFactory getMenuFactory() {
            return this.j;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        @Deprecated
        public boolean isAutoLoadImages() {
            int i = this.h;
            return i == 0 || i == 1;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        @Deprecated
        public boolean isAutoLoadVideo() {
            int i = this.h;
            return i == 0 || i == 2;
        }
    }

    public i5(NativeAd nativeAd, e5 e5Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        super(e5Var, jVar, aVar);
        this.k = nativeAd;
        this.l = menuFactory;
    }

    public static final i5 a(NativeAd nativeAd, e5 e5Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        return new i5(nativeAd, e5Var, jVar, aVar, menuFactory);
    }

    @Override // com.my.target.g2
    public void a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        ArrayList arrayList;
        String str;
        if (this.d == 0) {
            str = "MediationNativeAdEngine error: can't register view, adapter is not set";
        } else {
            if (this.m != null) {
                unregisterView();
                View mediaView = null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (View view2 : list) {
                        if (view2 != null) {
                            arrayList.add(view2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (!(this.d instanceof MyTargetNativeAdAdapter) && (view instanceof ViewGroup)) {
                    f7 f7VarA = f7.a((ViewGroup) view, mediaAdView);
                    MediaAdView mediaAdViewE = f7VarA.e();
                    if (mediaAdViewE != null) {
                        this.n = new WeakReference<>(mediaAdViewE);
                        try {
                            mediaView = ((MediationNativeAdAdapter) this.d).getMediaView(view.getContext());
                        } catch (Throwable th) {
                            ba.b("MediationNativeAdEngine error: " + th);
                        }
                        View view3 = mediaView;
                        if (view3 != null) {
                            this.o = new WeakReference<>(view3);
                        }
                        a(mediaAdViewE, view3, this.m.getImage(), this.m.hasVideo(), arrayList);
                    }
                    IconAdView iconAdViewD = f7VarA.d();
                    ImageData icon = this.m.getIcon();
                    if (iconAdViewD != null && icon != null) {
                        this.p = new WeakReference<>(iconAdViewD);
                        b(icon, (i9) iconAdViewD.getImageView());
                    }
                }
                try {
                    ((MediationNativeAdAdapter) this.d).registerView(view, arrayList, i);
                    return;
                } catch (Throwable th2) {
                    ba.b("MediationNativeAdEngine error: " + th2);
                    return;
                }
            }
            str = "MediationNativeAdEngine error: can't register view, banner is null or not loaded yet";
        }
        ba.b(str);
    }

    public final void a(ImageData imageData, i9 i9Var) {
        if (imageData != null) {
            m2.a(imageData, i9Var);
        }
        i9Var.setImageData(null);
    }

    @Override // com.my.target.g5
    public void a(MediationNativeAdAdapter mediationNativeAdAdapter, f5 f5Var, Context context) {
        b bVarA = b.a(f5Var.e(), f5Var.d(), f5Var.c(), this.f3982a.getCustomParams().getAge(), this.f3982a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f3982a.getCachePolicy(), this.k.getAdChoicesPlacement(), TextUtils.isEmpty(this.h) ? null : this.f3982a.getAdNetworkConfig(this.h), this.l);
        if (mediationNativeAdAdapter instanceof MyTargetNativeAdAdapter) {
            q qVarG = f5Var.g();
            if (qVarG instanceof q6) {
                ((MyTargetNativeAdAdapter) mediationNativeAdAdapter).setSection((q6) qVarG);
            }
        }
        try {
            mediationNativeAdAdapter.load(bVarA, new a(f5Var), context);
        } catch (Throwable th) {
            ba.b("MediationNativeAdEngine error: " + th);
        }
    }

    @Override // com.my.target.g2
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        ba.a("MediationNativeAdEngine: NativeAdMediaListener is not currently supported for mediation");
    }

    public final void a(MediaAdView mediaAdView, View view, ImageData imageData, boolean z, List<View> list) {
        int width;
        int height;
        int iIndexOf;
        if (imageData != null || z) {
            if (imageData == null || imageData.getWidth() <= 0 || imageData.getHeight() <= 0) {
                width = 16;
                height = 10;
            } else {
                width = imageData.getWidth();
                height = imageData.getHeight();
            }
            mediaAdView.setPlaceHolderDimension(width, height);
        } else {
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        if (view == null) {
            b(imageData, (i9) mediaAdView.getImageView());
            return;
        }
        ba.a("MediationNativeAdEngine: Got MediaView from adapter");
        mediaAdView.addView(view);
        if (list == null || (iIndexOf = list.indexOf(mediaAdView)) < 0) {
            return;
        }
        list.remove(iIndexOf);
        list.add(view);
    }

    @Override // com.my.target.g5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeAdAdapter;
    }

    public final void b(ImageData imageData, i9 i9Var) {
        i9Var.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        m2.b(imageData, i9Var);
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.k);
    }

    @Override // com.my.target.g2
    public NativePromoBanner e() {
        return this.m;
    }

    @Override // com.my.target.g5
    public void f() {
        NativeAd.NativeAdListener listener = this.k.getListener();
        if (listener != null) {
            listener.onNoAd(m.u, this.k);
        }
    }

    @Override // com.my.target.g2
    public void handleAdChoicesClick(Context context) {
        T t = this.d;
        if (t instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) t).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.g5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MediationNativeAdAdapter g() {
        return new MyTargetNativeAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void onCloseAutomatically(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.k);
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.g2
    public void unregisterView() {
        if (this.d == 0) {
            ba.b("MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference<View> weakReference = this.o;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            this.o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<MediaAdView> weakReference2 = this.n;
        MediaAdView mediaAdView = weakReference2 != null ? weakReference2.get() : null;
        if (mediaAdView != null) {
            this.n.clear();
            NativePromoBanner nativePromoBanner = this.m;
            a(nativePromoBanner != null ? nativePromoBanner.getImage() : null, (i9) mediaAdView.getImageView());
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        WeakReference<IconAdView> weakReference3 = this.p;
        IconAdView iconAdView = weakReference3 != null ? weakReference3.get() : null;
        if (iconAdView != null) {
            this.p.clear();
            NativePromoBanner nativePromoBanner2 = this.m;
            a(nativePromoBanner2 != null ? nativePromoBanner2.getIcon() : null, (i9) iconAdView.getImageView());
        }
        this.o = null;
        this.n = null;
        try {
            ((MediationNativeAdAdapter) this.d).unregisterView();
        } catch (Throwable th) {
            ba.b("MediationNativeAdEngine error: " + th);
        }
    }
}
