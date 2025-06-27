package com.my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.nearby.messages.Strategy;
import com.my.target.R;
import com.my.target.ba;
import com.my.target.ca;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.f1;
import com.my.target.j;
import com.my.target.l;
import com.my.target.m;
import com.my.target.m9;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.n9;
import com.my.target.o5;
import com.my.target.q;
import com.my.target.q9;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class MyTargetView extends FrameLayout {
    private final j adConfig;
    private AdSize adSize;
    private boolean attached;
    private n9 engine;
    private boolean fixedSize;
    private final AtomicBoolean isLoaded;
    private MyTargetViewListener listener;
    private MyTargetViewRenderCrashListener webViewCrashListener;

    public static final class AdSize {
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;
        private static final float MAX_HEIGHT_PROPORTION = 0.15f;
        private static final int MIN_HEIGHT = 50;
        private final int height;
        private final int heightPixels;
        private final int type;
        private final int width;
        private final int widthPixels;
        public static final AdSize ADSIZE_320x50 = new AdSize(320, 50, 0);
        public static final AdSize ADSIZE_300x250 = new AdSize(Strategy.TTL_SECONDS_DEFAULT, 250, 1);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);

        private AdSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            float fA = ca.a();
            this.widthPixels = (int) (i * fA);
            this.heightPixels = (int) (i2 * fA);
            this.type = i3;
        }

        private AdSize(int i, int i2, int i3, int i4, int i5) {
            this.width = i;
            this.height = i2;
            this.widthPixels = i3;
            this.heightPixels = i4;
            this.type = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AdSize fromInt(int i, Context context) {
            return i != 1 ? i != 2 ? i != 3 ? ADSIZE_320x50 : getAdSizeForCurrentOrientation(context) : ADSIZE_728x90 : ADSIZE_300x250;
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, int i2, Context context) {
            Point pointB = ca.b(context);
            float fA = ca.a();
            return getSize(i * fA, Math.min(i2 * fA, pointB.y * MAX_HEIGHT_PROPORTION));
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, Context context) {
            return getSize(i * ca.a(), ca.b(context).y * MAX_HEIGHT_PROPORTION);
        }

        public static AdSize getAdSizeForCurrentOrientation(Context context) {
            Point pointB = ca.b(context);
            return getSize(pointB.x, pointB.y * MAX_HEIGHT_PROPORTION);
        }

        private static AdSize getSize(float f, float f2) {
            float fA = ca.a();
            float fMax = Math.max(Math.min(f > 524.0f ? (f / 728.0f) * 90.0f : (f / 320.0f) * 50.0f, f2), 50.0f * fA);
            return new AdSize((int) (f / fA), (int) (fMax / fA), (int) f, (int) fMax, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSame(AdSize adSize, AdSize adSize2) {
            return adSize.height == adSize2.height && adSize.width == adSize2.width && adSize.type == adSize2.type;
        }

        public int getHeight() {
            return this.height;
        }

        public int getHeightPixels() {
            return this.heightPixels;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public int getWidthPixels() {
            return this.widthPixels;
        }
    }

    public interface MyTargetViewListener {
        void onClick(MyTargetView myTargetView);

        void onLoad(MyTargetView myTargetView);

        void onNoAd(IAdLoadingError iAdLoadingError, MyTargetView myTargetView);

        void onShow(MyTargetView myTargetView);
    }

    public interface MyTargetViewRenderCrashListener {
        void onViewRenderCrash(MyTargetView myTargetView);
    }

    public MyTargetView(Context context) {
        this(context, null);
    }

    public MyTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLoaded = new AtomicBoolean();
        this.fixedSize = false;
        ba.c("MyTargetView created. Version - 5.20.0");
        this.adConfig = j.newConfig(0, "");
        this.adSize = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MyTargetView);
        } catch (Throwable th) {
            ba.a("MyTargetView: Unable to get view attributes - " + th.getMessage());
        }
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        this.adConfig.setSlotId(typedArrayObtainStyledAttributes.getInt(R.styleable.MyTargetView_myTarget_slotId, 0));
        this.adConfig.setRefreshAd(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MyTargetView_myTarget_isRefreshAd, true));
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.MyTargetView_myTarget_adSize, -1);
        if (i2 >= 0) {
            if (i2 != 3) {
                this.fixedSize = true;
            }
            this.adSize = AdSize.fromInt(i2, context);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResult, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m637lambda$load$0$commytargetadsMyTargetView(q9 q9Var, IAdLoadingError iAdLoadingError, o5.a aVar) {
        MyTargetViewListener myTargetViewListener = this.listener;
        if (myTargetViewListener == null) {
            return;
        }
        if (q9Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.i;
            }
            myTargetViewListener.onNoAd(iAdLoadingError, this);
            return;
        }
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.a();
        }
        n9 n9VarA = n9.a(this, this.adConfig, aVar);
        this.engine = n9VarA;
        n9VarA.a(this.attached);
        this.engine.b(q9Var);
        this.adConfig.setBidId(null);
    }

    private void setFormat() {
        j jVar;
        String str;
        AdSize adSize = this.adSize;
        if (adSize == AdSize.ADSIZE_320x50) {
            jVar = this.adConfig;
            str = "standard_320x50";
        } else if (adSize == AdSize.ADSIZE_300x250) {
            jVar = this.adConfig;
            str = "standard_300x250";
        } else if (adSize == AdSize.ADSIZE_728x90) {
            jVar = this.adConfig;
            str = "standard_728x90";
        } else {
            jVar = this.adConfig;
            str = "standard";
        }
        jVar.setFormat(str);
    }

    private void updateAdaptiveSize() {
        Context context = getContext();
        Point pointB = ca.b(context);
        int i = pointB.x;
        float f = pointB.y;
        if (i != this.adSize.width || r3.height > f * 0.15f) {
            AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
            this.adSize = adSizeForCurrentOrientation;
            n9 n9Var = this.engine;
            if (n9Var != null) {
                n9Var.a(adSizeForCurrentOrientation);
            }
        }
    }

    public void destroy() {
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.a();
            this.engine = null;
        }
        this.listener = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.webViewCrashListener = null;
        }
    }

    public String getAdSource() {
        n9 n9Var = this.engine;
        if (n9Var != null) {
            return n9Var.b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        n9 n9Var = this.engine;
        if (n9Var != null) {
            return n9Var.c();
        }
        return 0.0f;
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public MyTargetViewListener getListener() {
        return this.listener;
    }

    public MyTargetViewRenderCrashListener getRenderCrashListener() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.webViewCrashListener;
        }
        ba.b("Trying to get a MyTargetViewRenderCrashListener on api = " + i + ", but min api = 26, return null");
        return null;
    }

    public AdSize getSize() {
        return this.adSize;
    }

    public final void handleSection(q9 q9Var, AdSize adSize) {
        final o5.a aVarA = o5.a(this.adConfig.getSlotId());
        m9.a(q9Var, this.adConfig, aVarA).a(new l.b() { // from class: com.my.target.ads.MyTargetView$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.m636lambda$handleSection$1$commytargetadsMyTargetView(aVarA, (q9) qVar, mVar);
            }
        }).a(aVarA.a(), getContext());
    }

    @Deprecated
    public void init(int i) {
        init(i, true);
    }

    @Deprecated
    public void init(int i, int i2) {
        init(i, i2, true);
    }

    @Deprecated
    public void init(int i, int i2, boolean z) {
        setAdSize(AdSize.fromInt(i2, getContext()));
        this.adConfig.setSlotId(i);
        this.adConfig.setRefreshAd(z);
        ba.a("MyTargetView: Initialized");
    }

    @Deprecated
    public void init(int i, boolean z) {
        init(i, 0, z);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public final void load() {
        if (!this.isLoaded.compareAndSet(false, true)) {
            ba.a("MyTargetView: Doesn't support multiple load");
            return;
        }
        final o5.a aVarA = o5.a(this.adConfig.getSlotId());
        o5 o5VarA = aVarA.a();
        ba.a("MyTargetView: View load");
        setFormat();
        m9.a(this.adConfig, aVarA).a(new l.b() { // from class: com.my.target.ads.MyTargetView$$ExternalSyntheticLambda1
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.m637lambda$load$0$commytargetadsMyTargetView(aVarA, (q9) qVar, mVar);
            }
        }).a(o5VarA, getContext());
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        this.adConfig.setRefreshAd(false);
        load();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.a(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.fixedSize) {
            updateAdaptiveSize();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.b(z);
        }
    }

    public void setAdNetworkConfig(String str, AdNetworkConfig adNetworkConfig) {
        this.adConfig.setAdNetworkConfig(str, adNetworkConfig);
    }

    public void setAdSize(AdSize adSize) {
        if (adSize == null) {
            ba.a("MyTargetView: AdSize cannot be null");
            return;
        }
        if (this.fixedSize && AdSize.isSame(this.adSize, adSize)) {
            return;
        }
        this.fixedSize = true;
        if (this.isLoaded.get()) {
            AdSize adSize2 = this.adSize;
            AdSize adSize3 = AdSize.ADSIZE_300x250;
            if (AdSize.isSame(adSize2, adSize3) || AdSize.isSame(adSize, adSize3)) {
                ba.a("MyTargetView: unable to switch size to/from 300x250");
                return;
            }
        }
        n9 n9Var = this.engine;
        if (n9Var != null) {
            n9Var.a(adSize);
            View childAt = getChildAt(0);
            if (childAt instanceof f1) {
                childAt.requestLayout();
            }
        }
        this.adSize = adSize;
        setFormat();
    }

    public void setListener(MyTargetViewListener myTargetViewListener) {
        this.listener = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void setRefreshAd(boolean z) {
        this.adConfig.setRefreshAd(z);
    }

    public void setRenderCrashListener(MyTargetViewRenderCrashListener myTargetViewRenderCrashListener) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.webViewCrashListener = myTargetViewRenderCrashListener;
            return;
        }
        ba.b("Can't set MyTargetViewRenderCrashListener: available only on api >= 26, your api = " + i);
    }

    public void setSlotId(int i) {
        if (this.isLoaded.get()) {
            return;
        }
        this.adConfig.setSlotId(i);
    }
}
