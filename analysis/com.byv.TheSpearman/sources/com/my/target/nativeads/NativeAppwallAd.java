package com.my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.a7;
import com.my.target.ba;
import com.my.target.common.BaseAd;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.h7;
import com.my.target.m;
import com.my.target.m2;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.nativeads.views.AppwallAdView;
import com.my.target.q;
import com.my.target.u6;
import com.my.target.w6;
import com.my.target.w9;
import com.my.target.x6;
import com.my.target.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class NativeAppwallAd extends BaseAd {
    private static final String DEFAULT_TITLE = "Apps";
    private static final int DEFAULT_TITLE_BACKGROUND_COLOR = -12232093;
    private static final int DEFAULT_TITLE_SUPPLEMENTARY_COLOR = -13220531;
    private static final int DEFAULT_TITLE_TEXT_COLOR = -1;
    private final ArrayList<NativeAppwallBanner> banners;
    private final HashMap<NativeAppwallBanner, u6> bannersMap;
    private final y0 clickHandler;
    private final Context context;
    private w6 engine;
    private boolean hideStatusBarInDialog;
    private AppwallAdListener listener;
    private a7 section;
    private String title;
    private int titleBackgroundColor;
    private int titleSupplementaryColor;
    private int titleTextColor;
    private WeakReference<AppwallAdView> viewWeakReference;

    public interface AppwallAdListener {
        void onClick(NativeAppwallBanner nativeAppwallBanner, NativeAppwallAd nativeAppwallAd);

        void onDismiss(NativeAppwallAd nativeAppwallAd);

        void onDisplay(NativeAppwallAd nativeAppwallAd);

        void onLoad(NativeAppwallAd nativeAppwallAd);

        void onNoAd(IAdLoadingError iAdLoadingError, NativeAppwallAd nativeAppwallAd);
    }

    public NativeAppwallAd(int i, Context context) {
        super(i, "appwall");
        this.clickHandler = y0.a();
        this.bannersMap = new HashMap<>();
        this.banners = new ArrayList<>();
        this.title = DEFAULT_TITLE;
        this.titleBackgroundColor = DEFAULT_TITLE_BACKGROUND_COLOR;
        this.titleSupplementaryColor = DEFAULT_TITLE_SUPPLEMENTARY_COLOR;
        this.titleTextColor = -1;
        this.hideStatusBarInDialog = false;
        this.context = context;
        this.adConfig.setCachePolicy(0);
        ba.c("Native appwall ad created. Version - 5.20.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(a7 a7Var, IAdLoadingError iAdLoadingError) {
        AppwallAdListener appwallAdListener = this.listener;
        if (appwallAdListener == null) {
            return;
        }
        if (a7Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.i;
            }
            appwallAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        this.section = a7Var;
        for (u6 u6Var : a7Var.c()) {
            NativeAppwallBanner nativeAppwallBannerNewBanner = NativeAppwallBanner.newBanner(u6Var);
            this.banners.add(nativeAppwallBannerNewBanner);
            this.bannersMap.put(nativeAppwallBannerNewBanner, u6Var);
        }
        this.listener.onLoad(this);
    }

    public static void loadImageToView(ImageData imageData, ImageView imageView) {
        m2.b(imageData, imageView);
    }

    public void destroy() {
        unregisterAppwallAdView();
        w6 w6Var = this.engine;
        if (w6Var != null) {
            w6Var.a();
            this.engine = null;
        }
        this.listener = null;
    }

    public void dismiss() {
        w6 w6Var = this.engine;
        if (w6Var != null) {
            w6Var.b();
        }
    }

    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.banners;
    }

    public long getCachePeriod() {
        return this.adConfig.getCachePeriod();
    }

    public AppwallAdListener getListener() {
        return this.listener;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    public int getTitleSupplementaryColor() {
        return this.titleSupplementaryColor;
    }

    public int getTitleTextColor() {
        return this.titleTextColor;
    }

    public void handleBannerClick(NativeAppwallBanner nativeAppwallBanner) {
        u6 u6Var = this.bannersMap.get(nativeAppwallBanner);
        if (u6Var == null) {
            ba.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
            return;
        }
        this.clickHandler.a(u6Var, this.context);
        if (this.section != null) {
            nativeAppwallBanner.setHasNotification(false);
            h7.a(this.section, this.adConfig).a(u6Var, false, this.context);
        }
        AppwallAdListener appwallAdListener = this.listener;
        if (appwallAdListener != null) {
            appwallAdListener.onClick(nativeAppwallBanner, this);
        }
    }

    public void handleBannerShow(NativeAppwallBanner nativeAppwallBanner) {
        u6 u6Var = this.bannersMap.get(nativeAppwallBanner);
        if (u6Var != null) {
            w9.a(u6Var.getStatHolder().b("playbackStarted"), this.context);
            return;
        }
        ba.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannersShow(List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner nativeAppwallBanner : list) {
            u6 u6Var = this.bannersMap.get(nativeAppwallBanner);
            if (u6Var != null) {
                ba.a("NativeAppwallAd: Ad shown, banner Id = " + nativeAppwallBanner.getId());
                arrayList.addAll(u6Var.getStatHolder().b("playbackStarted"));
            } else {
                ba.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
            }
        }
        if (arrayList.size() > 0) {
            w9.a(arrayList, this.context);
        }
    }

    public boolean hasNotifications() {
        Iterator<NativeAppwallBanner> it = this.bannersMap.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int cachePolicy = this.adConfig.getCachePolicy();
        return cachePolicy == 0 || cachePolicy == 1;
    }

    public boolean isHideStatusBarInDialog() {
        return this.hideStatusBarInDialog;
    }

    public void load() {
        if (isLoadCalled()) {
            ba.a("NativeAppwallAd: Appwall ad doesn't support multiple load");
            handleResult(null, m.t);
        } else {
            x6.a(this.adConfig, this.metricFactory).a(new x6.b() { // from class: com.my.target.nativeads.NativeAppwallAd$$ExternalSyntheticLambda0
                @Override // com.my.target.l.b
                public final void a(q qVar, m mVar) {
                    this.f$0.handleResult((a7) qVar, mVar);
                }
            }).a(this.metricFactory.a(), this.context);
        }
    }

    public String prepareBannerClickLink(NativeAppwallBanner nativeAppwallBanner) {
        u6 u6Var = this.bannersMap.get(nativeAppwallBanner);
        if (u6Var != null) {
            w9.a(u6Var.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), this.context);
            a7 a7Var = this.section;
            if (a7Var != null) {
                h7.a(a7Var, this.adConfig).a(u6Var, false, this.context);
            }
            return u6Var.getTrackingLink();
        }
        ba.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
        return null;
    }

    public void registerAppwallAdView(AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.viewWeakReference = new WeakReference<>(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new AppwallAdView.AppwallAdViewListener() { // from class: com.my.target.nativeads.NativeAppwallAd.1
            @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
            public void onBannerClick(NativeAppwallBanner nativeAppwallBanner) {
                AppwallAdView appwallAdView2;
                NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
                WeakReference weakReference = NativeAppwallAd.this.viewWeakReference;
                if (weakReference == null || (appwallAdView2 = (AppwallAdView) weakReference.get()) == null) {
                    return;
                }
                appwallAdView2.notifyDataSetChanged();
            }

            @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
            public void onBannersShow(List<NativeAppwallBanner> list) {
                NativeAppwallAd.this.handleBannersShow(list);
            }
        });
    }

    public void setAutoLoadImages(boolean z) {
        this.adConfig.setCachePolicy(0);
    }

    public void setCachePeriod(long j) {
        this.adConfig.setCachePeriod(j);
    }

    public void setHideStatusBarInDialog(boolean z) {
        this.hideStatusBarInDialog = z;
    }

    public void setListener(AppwallAdListener appwallAdListener) {
        this.listener = appwallAdListener;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleBackgroundColor(int i) {
        this.titleBackgroundColor = i;
    }

    public void setTitleSupplementaryColor(int i) {
        this.titleSupplementaryColor = i;
    }

    public void setTitleTextColor(int i) {
        this.titleTextColor = i;
    }

    public void show() {
        if (this.section == null || this.banners.size() <= 0) {
            ba.c("Native appwall ad show - no ad");
            return;
        }
        if (this.engine == null) {
            this.engine = w6.a(this);
        }
        this.engine.a(this.context);
    }

    public void unregisterAppwallAdView() {
        WeakReference<AppwallAdView> weakReference = this.viewWeakReference;
        if (weakReference != null) {
            AppwallAdView appwallAdView = weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener(null);
            }
            this.viewWeakReference.clear();
            this.viewWeakReference = null;
        }
    }
}
