package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.json.t2;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.splash.signal.c;
import com.mbridge.msdk.splash.signal.d;
import com.my.target.ads.Reward;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBSplashView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static String f3548a = "MBSplashView";
    private int b;
    private MBSplashWebview c;
    private a d;
    private ViewGroup e;
    private View f;
    private View g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private ViewGroup l;
    private View m;
    private boolean n;
    private boolean o;
    private RelativeLayout.LayoutParams p;
    private c q;
    private DyCountDownListener r;

    public void setH5Ready(boolean z) {
        this.i = z;
    }

    public void setVideoReady(boolean z) {
        this.j = z;
    }

    public void setImageReady(boolean z) {
        this.k = z;
    }

    public boolean isH5Ready() {
        return this.i;
    }

    public boolean isVideoReady() {
        return this.j;
    }

    public boolean isImageReady() {
        return this.k;
    }

    public ViewGroup getDevContainer() {
        return this.l;
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.l = viewGroup;
    }

    public boolean isDynamicView() {
        return this.n;
    }

    public void setDynamicView(boolean z) {
        this.n = z;
    }

    public boolean isAttach() {
        return this.o;
    }

    public void resetLoadState() {
        this.j = false;
        this.i = false;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.r = dyCountDownListener;
    }

    public c getSplashSignalCommunicationImpl() {
        return this.q;
    }

    public void setSplashSignalCommunicationImpl(c cVar) {
        this.q = cVar;
        MBSplashWebview mBSplashWebview = this.c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(cVar);
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
    }

    private void b() {
        setBackgroundColor(0);
        this.b = getResources().getConfiguration().orientation;
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.m = view;
        }
    }

    public MBSplashWebview getSplashWebview() {
        return this.c;
    }

    public void setSplashWebView() {
        if (this.c == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.c = mBSplashWebview;
                c cVar = this.q;
                if (cVar != null) {
                    mBSplashWebview.setObject(cVar);
                }
                a aVar = this.d;
                if (aVar != null) {
                    this.c.setWebViewClient(aVar);
                    return;
                }
                a aVar2 = new a();
                this.d = aVar2;
                this.c.setWebViewClient(aVar2);
            } catch (Throwable th) {
                ad.b(f3548a, th.getMessage());
            }
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public View getCloseView() {
        return this.f;
    }

    public void setCloseView(View view) {
        this.f = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public View getIconVg() {
        return this.g;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.g = view;
        this.p = layoutParams;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.mbridge.msdk.splash.d.a aVarA;
        if (this.q != null && (viewGroup = this.l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.q.a(this.l.getContext());
            a aVar = this.d;
            if (aVar != null && (aVarA = this.q.a()) != null) {
                aVar.f3552a = aVarA;
            }
        }
        if (this.g == null) {
            if (this.n && (view3 = this.m) != null) {
                if (view3.getParent() != null) {
                    ar.a(this.m);
                }
                addView(this.m, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.c;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.c, new ViewGroup.LayoutParams(-1, -1));
                }
                c();
            }
        } else {
            if (this.e == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.e = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.b == 2) {
                this.h = ai.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.e.getId());
                if (this.n && (view2 = this.m) != null) {
                    if (view2.getParent() != null) {
                        ar.a(this.m);
                    }
                    addView(this.m, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.c;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.c, layoutParams);
                    }
                    c();
                }
                ViewGroup viewGroup2 = this.e;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i = this.p.width;
                    ar.a(this.g);
                    int i2 = this.h;
                    if (i > i2 / 4) {
                        i = i2 / 4;
                    }
                    this.e.addView(this.g, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.e, layoutParams2);
                }
            } else {
                this.h = ai.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.e.getId());
                if (this.n && (view = this.m) != null) {
                    if (view.getParent() != null) {
                        ar.a(this.m);
                    }
                    addView(this.m, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.c;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.c, layoutParams3);
                    }
                    c();
                }
                ViewGroup viewGroup3 = this.e;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i3 = this.p.height;
                    int i4 = this.h;
                    if (i3 > i4 / 4) {
                        i3 = i4 / 4;
                    }
                    ar.a(this.g);
                    this.e.addView(this.g, -1, i3);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i3);
                    layoutParams4.addRule(12);
                    addView(this.e, layoutParams4);
                }
            }
        }
        View view4 = this.f;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ai.a(getContext(), 100.0f), ai.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = ai.a(getContext(), 10.0f);
                layoutParams5.topMargin = ai.a(getContext(), 10.0f);
                addView(this.f, layoutParams5);
            } else {
                bringChildToFront(this.f);
            }
        }
        clearResState();
    }

    public void clearResState() {
        this.k = false;
        this.j = false;
        this.i = false;
    }

    public void updateCountdown(int i) throws JSONException {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.c != null && !this.n) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i);
                g.a().a((WebView) this.c, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.n && (view = this.m) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i);
        }
        if (!this.n || (dyCountDownListener = this.r) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i);
    }

    private void c() {
        MBSplashWebview mBSplashWebview = this.c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(this.q);
            this.c.post(new Runnable() { // from class: com.mbridge.msdk.splash.view.MBSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.a(MBSplashView.f3548a, "webviewshow");
                        String string = "";
                        try {
                            int[] iArr = new int[2];
                            MBSplashView.this.c.getLocationOnScreen(iArr);
                            ad.b(MBSplashView.f3548a, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[0]));
                            jSONObject.put("startY", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[1]));
                            string = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBSplashView.f3548a, th.getMessage(), th);
                        }
                        int[] iArr2 = new int[2];
                        MBSplashView.this.c.getLocationInWindow(iArr2);
                        MBSplashView.transInfoForMraid(MBSplashView.this.c, iArr2[0], iArr2[1], MBSplashView.this.c.getWidth(), MBSplashView.this.c.getHeight());
                        g.a().a((WebView) MBSplashView.this.c, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        ad.b(f3548a, "transInfoForMraid");
        try {
            int i5 = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i5 == 2 ? t2.h.C : i5 == 1 ? t2.h.D : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", com.json.mediationsdk.metadata.a.g);
            float fI = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
            float fG = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
            HashMap mapH = z.h(com.mbridge.msdk.foundation.controller.c.m().c());
            int iIntValue = ((Integer) mapH.get("width")).intValue();
            int iIntValue2 = ((Integer) mapH.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", Reward.DEFAULT);
            map.put("viewable", com.json.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fI, fG);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            ad.a(f3548a, "transInfoForMraid", th);
        }
    }

    public void onResume() {
        View view = this.m;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void onPause() {
        View view = this.m;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) throws JSONException {
        View view = this.m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i, i2, i3, i4);
        }
        if (this.c != null) {
            g.a().a((WebView) this.c, "oncutoutfetched", Base64.encodeToString(r.a(-999, i, i2, i3, i4).getBytes(), 0));
        }
    }

    public void setAllowClickSplash(final boolean z) {
        MBSplashWebview mBSplashWebview = this.c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z;
            }
        });
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.c;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.c.finishAdSession();
        d.a(this.c, "onSystemDestory", "");
        this.c.release();
        this.c = null;
    }
}
