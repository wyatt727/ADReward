package com.json.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.k1;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.sdk.BannerListener;
import com.json.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes4.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f1901a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private boolean f;
    private b g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f1902a;
        final /* synthetic */ boolean b;

        a(IronSourceError ironSourceError, boolean z) {
            this.f1902a = ironSourceError;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1 k1VarA;
            IronSourceError ironSourceError;
            boolean z;
            if (IronSourceBannerLayout.this.f) {
                k1VarA = k1.a();
                ironSourceError = this.f1902a;
                z = true;
            } else {
                if (IronSourceBannerLayout.this.f1901a != null) {
                    IronSourceBannerLayout ironSourceBannerLayout = IronSourceBannerLayout.this;
                    ironSourceBannerLayout.removeView(ironSourceBannerLayout.f1901a);
                    IronSourceBannerLayout.this.f1901a = null;
                }
                k1VarA = k1.a();
                ironSourceError = this.f1902a;
                z = this.b;
            }
            k1VarA.a(ironSourceError, z);
        }
    }

    public interface b {
        void onWindowFocusChanged(boolean z);
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.f = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.e = false;
        this.f = false;
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.f1901a = null;
        this.g = null;
        removeBannerListener();
    }

    @Deprecated
    void a(View view, FrameLayout.LayoutParams layoutParams) {
        this.f1901a = view;
        l.a(this, view, layoutParams);
    }

    @Deprecated
    void a(AdInfo adInfo, boolean z) {
        k1.a().a(adInfo, z);
        this.f = true;
    }

    @Deprecated
    void a(IronSourceError ironSourceError, boolean z) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ironSourceError, z));
    }

    protected IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.d, this.b);
        ironSourceBannerLayout.setPlacementName(this.c);
        return ironSourceBannerLayout;
    }

    public Activity getActivity() {
        return this.d;
    }

    public BannerListener getBannerListener() {
        return k1.a().c();
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return k1.a().b();
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public b getWindowFocusChangedListener() {
        return this.g;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b bVar = this.g;
        if (bVar != null) {
            bVar.onWindowFocusChanged(z);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        k1.a().a((BannerListener) null);
        k1.a().a((LevelPlayBannerListener) null);
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info();
        k1.a().a(bannerListener);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.b = iSBannerSize;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        k1.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.c = str;
    }

    public void setWindowFocusChangedListener(b bVar) {
        this.g = bVar;
    }
}
