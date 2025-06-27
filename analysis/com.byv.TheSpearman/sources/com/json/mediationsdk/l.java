package com.json.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.json.environment.ContextProvider;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.l4;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.o8;
import com.json.r1;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1961a = "BANNER";
    public static final String b = "LARGE";
    public static final String c = "RECTANGLE";
    public static final String d = "LEADERBOARD";
    public static final String e = "SMART";
    public static final String f = "CUSTOM";
    public static final String g = "bannerAdSize";
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = -1;
    public static final String n = "Adaptive=true";

    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    interface b {
        void a();

        void a(String str);
    }

    public static int a(int i2) throws JSONException {
        int i3 = -1;
        if (p.p().H()) {
            for (AbstractAdapter abstractAdapter : c.b().a().values()) {
                try {
                    int adaptiveHeight = abstractAdapter.getAdaptiveHeight(i2);
                    if (adaptiveHeight > i3) {
                        i3 = adaptiveHeight;
                    }
                } catch (Throwable unused) {
                    IronLog.INTERNAL.error("exception while calling getAdaptiveHeight for adapter - " + abstractAdapter.getProviderName());
                }
            }
        } else {
            IronLog.API.error("The mediation must be successfully initiated before calling this API");
        }
        a(i2, i3);
        IronLog.API.verbose("maximal height - " + i3 + " for width - " + i2);
        return i3;
    }

    static long a(long j2, long j3) {
        return j3 - (new Date().getTime() - j2);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(d, 728, 90);
    }

    public static ISBannerSize a(String str, int i2, int i3) {
        return new ISBannerSize(str, i2, i3);
    }

    private static void a(int i2, int i3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (i3 == -1) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i2 + ",h:" + i3);
            }
            o8.i().a(new l4(IronSourceConstants.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.a();
        }
    }

    private static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(final IronSourceBannerLayout ironSourceBannerLayout, final View view, final FrameLayout.LayoutParams layoutParams) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = ironSourceBannerLayout.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l.a(ironSourceBannerLayout, view, size, applicationContext, layoutParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(IronSourceBannerLayout ironSourceBannerLayout, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams) {
        try {
            ironSourceBannerLayout.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e2));
        }
    }

    static void a(IronSourceBannerLayout ironSourceBannerLayout, b bVar) {
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            bVar.a();
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        bVar.a(String.format("can't destroy banner - %s", objArr));
    }

    static void a(IronSourceBannerLayout ironSourceBannerLayout, r1 r1Var, b bVar) {
        String str;
        if (c(ironSourceBannerLayout)) {
            str = null;
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        }
        if (r1Var == null || TextUtils.isEmpty(r1Var.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = r1Var == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:4:0x0004, B:5:0x0011, B:30:0x0054, B:31:0x0079, B:36:0x0092, B:38:0x0098, B:41:0x00a0, B:42:0x00b8, B:32:0x007d, B:33:0x0083, B:34:0x0088, B:35:0x008d, B:7:0x0015, B:10:0x001f, B:13:0x0029, B:16:0x0033, B:19:0x003d), top: B:47:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.util.Map<java.lang.String, java.lang.Object> r8, com.json.mediationsdk.ISBannerSize r9) {
        /*
            java.lang.String r0 = "ext1"
            if (r9 == 0) goto Lc6
            java.lang.String r1 = r9.getDescription()     // Catch: java.lang.Exception -> Lbc
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.Exception -> Lbc
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -387072689: goto L3d;
                case 72205083: goto L33;
                case 79011241: goto L29;
                case 1951953708: goto L1f;
                case 1999208305: goto L15;
                default: goto L14;
            }     // Catch: java.lang.Exception -> Lbc
        L14:
            goto L46
        L15:
            java.lang.String r3 = "CUSTOM"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 == 0) goto L46
            r2 = r4
            goto L46
        L1f:
            java.lang.String r3 = "BANNER"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 == 0) goto L46
            r2 = 0
            goto L46
        L29:
            java.lang.String r3 = "SMART"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 == 0) goto L46
            r2 = r5
            goto L46
        L33:
            java.lang.String r3 = "LARGE"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 == 0) goto L46
            r2 = r7
            goto L46
        L3d:
            java.lang.String r3 = "RECTANGLE"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 == 0) goto L46
            r2 = r6
        L46:
            java.lang.String r1 = "bannerAdSize"
            if (r2 == 0) goto L8d
            if (r2 == r7) goto L88
            if (r2 == r6) goto L83
            if (r2 == r5) goto L7d
            if (r2 == r4) goto L53
            goto L92
        L53:
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lbc
            r8.put(r1, r2)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = "custom_banner_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r2.<init>()     // Catch: java.lang.Exception -> Lbc
            int r3 = r9.getWidth()     // Catch: java.lang.Exception -> Lbc
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            int r3 = r9.getHeight()     // Catch: java.lang.Exception -> Lbc
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbc
        L79:
            r8.put(r1, r2)     // Catch: java.lang.Exception -> Lbc
            goto L92
        L7d:
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lbc
            goto L79
        L83:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> Lbc
            goto L79
        L88:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Lbc
            goto L79
        L8d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lbc
            goto L79
        L92:
            boolean r9 = r9.isAdaptive()     // Catch: java.lang.Exception -> Lbc
            if (r9 == 0) goto Lc6
            boolean r9 = r8.containsKey(r0)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = "Adaptive=true"
            if (r9 == 0) goto Lb8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r9.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r2 = r8.get(r0)     // Catch: java.lang.Exception -> Lbc
            r9.append(r2)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = " , "
            r9.append(r2)     // Catch: java.lang.Exception -> Lbc
            r9.append(r1)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> Lbc
        Lb8:
            r8.put(r0, r1)     // Catch: java.lang.Exception -> Lbc
            goto Lc6
        Lbc:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r9 = com.json.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.l.a(java.util.Map, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    public static boolean a(ISContainerParams iSContainerParams, int i2, int i3) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (iSContainerParams.getWidth() >= i2 && iSContainerParams.getHeight() >= i3) {
            return true;
        }
        IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a("SMART", 728, 90);
        }
        return a("SMART", 320, 50);
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        iSBannerSizeB.setContainerParams(size.containerParams);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(iSBannerSizeB);
    }

    static boolean c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }
}
