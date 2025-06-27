package com.json;

import android.app.Activity;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceBannerLayout;
import com.json.mediationsdk.testSuite.TestSuiteActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\fJ&\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0005\u001a\u00020\fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006&"}, d2 = {"Lcom/ironsource/yc;", "", "Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "activity", "Landroid/widget/RelativeLayout;", "a", "", "marginPercentageFromTop", "Landroid/widget/FrameLayout$LayoutParams;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/ed;", "loadAdConfig", "", "", "c", "e", "d", "f", "", "description", "", "width", "height", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "mTestSuiteActivityWeakReference", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Landroid/widget/RelativeLayout;", "mBannerContainer", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "mBannerLayout", "handler", "<init>", "(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class yc {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<TestSuiteActivity> mTestSuiteActivityWeakReference;

    /* renamed from: b, reason: from kotlin metadata */
    private final Handler mHandler;

    /* renamed from: c, reason: from kotlin metadata */
    private RelativeLayout mBannerContainer;

    /* renamed from: d, reason: from kotlin metadata */
    private IronSourceBannerLayout mBannerLayout;

    public yc(TestSuiteActivity activity, Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.mTestSuiteActivityWeakReference = new WeakReference<>(activity);
        this.mHandler = handler;
    }

    private final RelativeLayout a(TestSuiteActivity activity) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yc this$0) {
        RelativeLayout container;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity testSuiteActivityB = this$0.b();
        if (testSuiteActivityB != null && (container = testSuiteActivityB.getContainer()) != null) {
            container.removeView(this$0.mBannerContainer);
        }
        this$0.mBannerContainer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yc this$0, TestSuiteActivity testSuiteActivity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.mBannerLayout);
        }
        testSuiteActivity.getContainer().addView(this$0.mBannerContainer);
    }

    private final FrameLayout.LayoutParams b(double marginPercentageFromTop) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (gd.f1795a.a() * marginPercentageFromTop);
        return layoutParams;
    }

    private final TestSuiteActivity b() {
        return this.mTestSuiteActivityWeakReference.get();
    }

    public final void a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
        if (ironSourceBannerLayout != null) {
            gd.f1795a.a(ironSourceBannerLayout);
        }
        this.mHandler.post(new Runnable() { // from class: com.ironsource.yc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yc.a(this.f$0);
            }
        });
        this.mBannerLayout = null;
    }

    public final void a(double marginPercentageFromTop) {
        if (this.mBannerContainer == null) {
            IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.setLayoutParams(b(marginPercentageFromTop));
            }
            final TestSuiteActivity testSuiteActivityB = b();
            if (testSuiteActivityB != null) {
                this.mBannerContainer = a(testSuiteActivityB);
                this.mHandler.post(new Runnable() { // from class: com.ironsource.yc$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        yc.a(this.f$0, testSuiteActivityB);
                    }
                });
            }
        }
    }

    public final void a(ed loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        gd gdVar = gd.f1795a;
        gdVar.a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        gdVar.g();
    }

    public final void a(ed loadAdConfig, String description, int width, int height) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        a();
        gd gdVar = gd.f1795a;
        gdVar.a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            IronSourceBannerLayout ironSourceBannerLayoutA = gdVar.a(testSuiteActivityB, gdVar.a(description, width, height));
            this.mBannerLayout = ironSourceBannerLayoutA;
            gdVar.b(ironSourceBannerLayoutA);
        }
    }

    public final void b(ed loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        gd gdVar = gd.f1795a;
        gdVar.a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        gdVar.h();
    }

    public final boolean c() {
        return gd.f1795a.e();
    }

    public final boolean d() {
        return gd.f1795a.f();
    }

    public final void e() {
        gd.f1795a.a((Activity) this.mTestSuiteActivityWeakReference.get());
    }

    public final void f() {
        gd.f1795a.b((Activity) this.mTestSuiteActivityWeakReference.get());
    }
}
