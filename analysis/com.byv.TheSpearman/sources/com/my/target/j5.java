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
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.mediation.MediationNativeBannerAdConfig;
import com.my.target.mediation.MyTargetNativeBannerAdAdapter;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.o5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class j5 extends g5<MediationNativeBannerAdAdapter> implements h2, NativeBannerAd.NativeBannerAdChoicesOptionListener {
    public final NativeBannerAd k;
    public final MenuFactory l;
    public NativeBanner m;
    public WeakReference<IconAdView> n;
    public WeakReference<View> o;

    public class a implements MediationNativeBannerAdAdapter.MediationNativeBannerAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f4015a;

        public a(f5 f5Var) {
            this.f4015a = f5Var;
        }

        public final boolean a() {
            return ("myTarget".equals(this.f4015a.b()) || "0".equals(this.f4015a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = j5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(j5.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            StringBuilder sb;
            String str;
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = j5.this.k.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            String strB = this.f4015a.b();
            if (z) {
                sb = new StringBuilder();
                sb.append("MediationNativeBannerAdEngine: AdChoices icon from");
                sb.append(strB);
                str = " ad network loaded successfully";
            } else {
                sb = new StringBuilder();
                sb.append("MediationNativeBannerAdEngine: AdChoices icon from");
                sb.append(strB);
                str = " hasn't loaded";
            }
            sb.append(str);
            ba.a(sb.toString());
            adChoicesListener.onAdChoicesIconLoad(imageData, z, j5.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            j5 j5Var = j5.this;
            if (j5Var.d != mediationNativeBannerAdAdapter) {
                return;
            }
            Context contextH = j5Var.h();
            if (contextH != null) {
                w9.a(this.f4015a.h().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), contextH);
            }
            NativeBannerAd.NativeBannerAdListener listener = j5.this.k.getListener();
            if (listener != null) {
                listener.onClick(j5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onCloseAutomatically(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = j5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(j5.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (j5.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            String strB = this.f4015a.b();
            ba.a("MediationNativeBannerAdEngine: Data from " + strB + " ad network loaded successfully");
            Context contextH = j5.this.h();
            if (a() && contextH != null) {
                l6.b(strB, nativeBanner, contextH);
            }
            j5.this.a(this.f4015a, true);
            j5 j5Var = j5.this;
            j5Var.m = nativeBanner;
            NativeBannerAd.NativeBannerAdListener listener = j5Var.k.getListener();
            if (listener != null) {
                listener.onLoad(nativeBanner, j5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (j5.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            ba.a("MediationNativeBannerAdEngine: No data from " + this.f4015a.b() + " ad network - " + iAdLoadingError);
            j5.this.a(this.f4015a, false);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            j5 j5Var = j5.this;
            if (j5Var.d != mediationNativeBannerAdAdapter) {
                return;
            }
            Context contextH = j5Var.h();
            if (contextH != null) {
                w9.a(this.f4015a.h().b("playbackStarted"), contextH);
            }
            NativeBannerAd.NativeBannerAdListener listener = j5.this.k.getListener();
            if (listener != null) {
                listener.onShow(j5.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public boolean shouldCloseAutomatically() {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = j5.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    public static class b extends g5.a implements MediationNativeBannerAdConfig {
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

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getAdChoicesPlacement() {
            return this.i;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getCachePolicy() {
            return this.h;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public MenuFactory getMenuFactory() {
            return this.j;
        }
    }

    public j5(NativeBannerAd nativeBannerAd, e5 e5Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        super(e5Var, jVar, aVar);
        this.k = nativeBannerAd;
        this.l = menuFactory;
    }

    public static j5 a(NativeBannerAd nativeBannerAd, e5 e5Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        return new j5(nativeBannerAd, e5Var, jVar, aVar, menuFactory);
    }

    public final void a(ImageData imageData, i9 i9Var) {
        if (imageData != null) {
            m2.a(imageData, i9Var);
        }
        i9Var.setImageData(null);
    }

    @Override // com.my.target.g5
    public void a(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter, f5 f5Var, Context context) {
        b bVarA = b.a(f5Var.e(), f5Var.d(), f5Var.c(), this.f3982a.getCustomParams().getAge(), this.f3982a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f3982a.getCachePolicy(), this.k.getAdChoicesPlacement(), TextUtils.isEmpty(this.h) ? null : this.f3982a.getAdNetworkConfig(this.h), this.l);
        if (mediationNativeBannerAdAdapter instanceof MyTargetNativeBannerAdAdapter) {
            q qVarG = f5Var.g();
            if (qVarG instanceof q6) {
                ((MyTargetNativeBannerAdAdapter) mediationNativeBannerAdAdapter).setSection((q6) qVarG);
            }
        }
        try {
            mediationNativeBannerAdAdapter.load(bVarA, new a(f5Var), context);
        } catch (Throwable th) {
            ba.b("MediationNativeBannerAdEngine error: " + th);
        }
    }

    @Override // com.my.target.h2
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        ba.a("MediationNativeBannerAdEngine: NativeBannerAdMediaListener is not currently supported for mediation");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.my.target.nativeads.views.IconAdView r3, android.view.View r4, com.my.target.common.models.ImageData r5, java.util.List<android.view.View> r6) {
        /*
            r2 = this;
            if (r5 != 0) goto L7
            r0 = 0
        L3:
            r3.setPlaceHolderDimension(r0, r0)
            goto L21
        L7:
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L1f
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L1f
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r3.setPlaceHolderDimension(r0, r1)
            goto L21
        L1f:
            r0 = 1
            goto L3
        L21:
            if (r4 == 0) goto L38
            java.lang.String r5 = "MediationNativeBannerAdEngine: Got IconView from adapter"
            com.my.target.ba.a(r5)
            r3.addView(r4)
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L41
            r6.remove(r3)
            r6.add(r4)
            goto L41
        L38:
            android.widget.ImageView r3 = r3.getImageView()
            com.my.target.i9 r3 = (com.my.target.i9) r3
            r2.b(r5, r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.j5.a(com.my.target.nativeads.views.IconAdView, android.view.View, com.my.target.common.models.ImageData, java.util.List):void");
    }

    @Override // com.my.target.g5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeBannerAdAdapter;
    }

    public final void b(ImageData imageData, i9 i9Var) {
        i9Var.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        m2.b(imageData, i9Var);
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.k);
    }

    @Override // com.my.target.h2
    public NativeBanner d() {
        return this.m;
    }

    @Override // com.my.target.g5
    public void f() {
        NativeBannerAd.NativeBannerAdListener listener = this.k.getListener();
        if (listener != null) {
            listener.onNoAd(m.u, this.k);
        }
    }

    @Override // com.my.target.h2
    public void handleAdChoicesClick(Context context) {
        T t = this.d;
        if (t instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) t).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.g5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MediationNativeBannerAdAdapter g() {
        return new MyTargetNativeBannerAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.k);
    }

    @Override // com.my.target.h2
    public void registerView(View view, List<View> list, int i) {
        String str;
        if (this.d == 0) {
            str = "MediationNativeBannerAdEngine error: Can't register view, adapter is not set";
        } else {
            if (this.m != null) {
                unregisterView();
                List<View> arrayList = list != null ? new ArrayList<>(list) : Collections.EMPTY_LIST;
                if (!(this.d instanceof MyTargetNativeBannerAdAdapter) && (view instanceof ViewGroup)) {
                    IconAdView iconAdViewD = f7.c((ViewGroup) view).d();
                    if (iconAdViewD != null) {
                        this.n = new WeakReference<>(iconAdViewD);
                        View iconView = null;
                        try {
                            iconView = ((MediationNativeBannerAdAdapter) this.d).getIconView(view.getContext());
                        } catch (Throwable th) {
                            ba.b("MediationNativeBannerAdEngine: Error - " + th);
                        }
                        if (iconView != null) {
                            this.o = new WeakReference<>(iconView);
                        }
                        a(iconAdViewD, iconView, this.m.getIcon(), arrayList);
                    } else {
                        str = "MediationNativeBannerAdEngine: IconView component not found in ad view  " + view + ". It's required";
                    }
                }
                try {
                    ((MediationNativeBannerAdAdapter) this.d).registerView(view, arrayList, i);
                    return;
                } catch (Throwable th2) {
                    ba.b("MediationNativeBannerAdEngine: Error - " + th2);
                    return;
                }
            }
            str = "MediationNativeBannerAdEngine error: Can't register view, banner is null or not loaded yet";
        }
        ba.b(str);
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.h2
    public void unregisterView() {
        if (this.d == 0) {
            ba.b("MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
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
        WeakReference<IconAdView> weakReference2 = this.n;
        IconAdView iconAdView = weakReference2 != null ? weakReference2.get() : null;
        if (iconAdView != null) {
            this.n.clear();
            NativeBanner nativeBanner = this.m;
            a(nativeBanner != null ? nativeBanner.getIcon() : null, (i9) iconAdView.getImageView());
        }
        this.o = null;
        this.n = null;
        try {
            ((MediationNativeBannerAdAdapter) this.d).unregisterView();
        } catch (Throwable th) {
            ba.b("MediationNativeBannerAdEngine error: " + th);
        }
    }
}
