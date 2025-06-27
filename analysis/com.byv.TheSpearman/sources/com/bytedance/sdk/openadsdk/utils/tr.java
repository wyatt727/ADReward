package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UIUtils.java */
/* loaded from: classes2.dex */
public class tr {
    private static float EYQ = -1.0f;
    private static final Object HX = new Object();
    private static WindowManager IPb = null;
    private static int Kbd = -1;
    private static int Pm = -1;
    private static Boolean QQ = null;
    private static float Td = -1.0f;
    private static float VwS = -1.0f;
    private static int mZx = -1;

    private static boolean EYQ(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private static boolean mZx() {
        return EYQ < 0.0f || mZx < 0 || Td < 0.0f || Pm < 0 || Kbd < 0;
    }

    public static void EYQ(Context context) {
        EYQ(context, false);
    }

    public static void EYQ(Context context, boolean z) {
        Context contextEYQ = context == null ? com.bytedance.sdk.openadsdk.core.hu.EYQ() : context;
        if (contextEYQ == null) {
            return;
        }
        IPb = (WindowManager) contextEYQ.getSystemService("window");
        if (mZx() || z) {
            DisplayMetrics displayMetrics = contextEYQ.getResources().getDisplayMetrics();
            EYQ = displayMetrics.density;
            mZx = displayMetrics.densityDpi;
            Td = displayMetrics.scaledDensity;
            Pm = displayMetrics.widthPixels;
            Kbd = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i = Pm;
            int i2 = Kbd;
            if (i > i2) {
                Pm = i2;
                Kbd = i;
                return;
            }
            return;
        }
        int i3 = Pm;
        int i4 = Kbd;
        if (i3 < i4) {
            Pm = i4;
            Kbd = i3;
        }
    }

    public static int EYQ(Context context, float f) {
        EYQ(context);
        float fIPb = IPb(context);
        if (fIPb <= 0.0f) {
            fIPb = 1.0f;
        }
        return (int) ((f / fIPb) + 0.5f);
    }

    public static int mZx(Context context, float f) {
        return Float.valueOf(EYQ(context, f, true)).intValue();
    }

    public static float EYQ(Context context, float f, boolean z) {
        EYQ(context);
        return (f * Kbd(context)) + (z ? 0.5f : 0.0f);
    }

    public static int Td(Context context, float f) {
        EYQ(context, true);
        float fKbd = Kbd(context);
        if (fKbd <= 0.0f) {
            fKbd = 1.0f;
        }
        return (int) ((f / fKbd) + 0.5f);
    }

    public static int[] mZx(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            return null;
        }
        if (IPb == null) {
            IPb = (WindowManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = IPb;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int iIntValue = displayMetrics.widthPixels;
            int iIntValue2 = displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT < 17) {
                try {
                    iIntValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    iIntValue2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                    iIntValue = point.x;
                    iIntValue2 = point.y;
                } catch (Exception unused2) {
                }
            }
            iArr[0] = iIntValue;
            iArr[1] = iIntValue2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int Td(Context context) {
        EYQ(context);
        return Pm;
    }

    public static int Pm(Context context) {
        EYQ(context);
        return Kbd;
    }

    public static float Kbd(Context context) {
        EYQ(context, true);
        return EYQ;
    }

    public static float IPb(Context context) {
        EYQ(context);
        return Td;
    }

    public static int VwS(Context context) {
        EYQ(context);
        return mZx;
    }

    public static void EYQ(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) view.getParent()).setTouchDelegate(new com.bytedance.sdk.component.utils.VwS(rect, view));
    }

    public static int[] EYQ(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] mZx(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] Td(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void EYQ(View view, int i) {
        if (view == null || view.getVisibility() == i || !EYQ(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean Pm(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void EYQ(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void mZx(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        EYQ(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void EYQ(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap EYQ(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static void Kbd(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.tr.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    tr.EYQ(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void IPb(View view) {
        if (view == null) {
            return;
        }
        EYQ(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.tr.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static Pair<Integer, Integer> QQ(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int HX(Context context) {
        return ((Integer) QQ(context).second).intValue();
    }

    public static int tp(Context context) {
        return ((Integer) QQ(context).first).intValue();
    }

    public static float EYQ() {
        float f = VwS;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.hu.EYQ().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        VwS = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void EYQ(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8);
            } else if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(3846);
                activity.getWindow().addFlags(1792);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e.getMessage());
        }
    }

    public static void mZx(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static boolean Td(Activity activity) {
        if (QQ == null) {
            synchronized (HX) {
                if (QQ == null) {
                    boolean z = true;
                    if (!Pm(activity) && EYQ("ro.miui.notch", activity) != 1 && !MxO(activity) && !KO(activity) && !tsL(activity) && !pi(activity) && !nWX(activity)) {
                        z = false;
                    }
                    QQ = Boolean.valueOf(z);
                }
            }
        }
        return QQ.booleanValue();
    }

    public static boolean Pm(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e.getMessage());
            return false;
        }
    }

    public static int EYQ(String str, Activity activity) throws ClassNotFoundException {
        if (!WU.Kbd()) {
            return 0;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e.getMessage());
            return 0;
        } catch (IllegalAccessException e2) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e2.getMessage());
            return 0;
        } catch (IllegalArgumentException e3) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e3.getMessage());
            return 0;
        } catch (NoSuchMethodException e4) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e4.getMessage());
            return 0;
        } catch (InvocationTargetException e5) {
            com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", e5.getMessage());
            return 0;
        }
    }

    public static boolean MxO(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean tsL(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean pi(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean nWX(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean KO(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void EYQ(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.pi.EYQ("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void EYQ(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.pi.EYQ("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void EYQ(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void EYQ(TextView textView, TTRatingBar2 tTRatingBar2, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        EYQ(textView, tTRatingBar2, (ub == null || ub.xh() == null) ? -1.0d : ub.xh().Pm());
    }

    public static void EYQ(TextView textView, TTRatingBar2 tTRatingBar2, double d) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            EYQ(tTRatingBar2, d, 0, 14);
        }
    }

    public static void EYQ(TTRatingBar2 tTRatingBar2, double d, int i, int i2) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            tTRatingBar2.setVisibility(8);
        } else {
            tTRatingBar2.setVisibility(0);
            tTRatingBar2.EYQ(d, i, i2);
        }
    }

    public static void EYQ(TextView textView, com.bytedance.sdk.openadsdk.core.model.UB ub, Context context, String str) {
        EYQ(textView, ub.xh() != null ? ub.xh().Kbd() : -1, context, str);
    }

    public static void EYQ(TextView textView, int i, Context context, String str) {
        String strValueOf;
        String strEYQ = com.bytedance.sdk.component.utils.zF.EYQ(context, str);
        if (i > 10000) {
            strValueOf = (i / 1000) + CampaignEx.JSON_KEY_AD_K;
        } else {
            strValueOf = String.valueOf(i);
        }
        textView.setText(String.format(strEYQ, strValueOf));
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    public static Bitmap EYQ(SSWebView sSWebView) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapMZx = mZx(sSWebView);
        if (bitmapMZx == null) {
            bitmapMZx = EYQ(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapMZx == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.Pm.EYQ(bitmapMZx, bitmapMZx.getWidth() / 6, bitmapMZx.getHeight() / 6);
    }

    public static void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        xt.mZx(new com.bytedance.sdk.component.VwS.QQ("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.tr.3
            @Override // java.lang.Runnable
            public void run() {
                tr.Td(ub, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td(com.bytedance.sdk.openadsdk.core.model.UB ub, String str, String str2, Bitmap bitmap, String str3, long j) {
        JSONObject jSONObject;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    int iEYQ = EYQ(bitmap);
                    JSONObject jSONObject2 = null;
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("url", str3);
                        if (j != -1) {
                            jSONObject3.put("page_id", j);
                        }
                        jSONObject3.put("render_type", "h5");
                        jSONObject3.put("render_type_2", 0);
                        jSONObject3.put("is_blank", iEYQ == 100 ? 1 : 0);
                        jSONObject3.put("is_playable", com.bytedance.sdk.openadsdk.core.model.zF.mZx(ub) ? 1 : 0);
                        jSONObject3.put("usecache", com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(ub) ? 1 : 0);
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ad_extra_data", jSONObject3.toString());
                        } catch (JSONException unused) {
                            jSONObject2 = jSONObject;
                            jSONObject = jSONObject2;
                            com.bytedance.sdk.openadsdk.mZx.Td.Td(ub, str, str2, jSONObject);
                        }
                    } catch (JSONException unused2) {
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.Td(ub, str, str2, jSONObject);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static Bitmap mZx(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int EYQ(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListMZx = mZx(bitmap);
            if (arrayListMZx == null) {
                return -1;
            }
            HashMap map = new HashMap();
            Iterator<Integer> it = arrayListMZx.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (map.containsKey(next)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(next)).intValue() + 1);
                    map.remove(next);
                    map.put(next, numValueOf);
                } else {
                    map.put(next, 1);
                }
            }
            int iIntValue = 0;
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static ArrayList<Integer> mZx(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void mZx(View view, final float f) {
        if (view != null && f > 0.0f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.tr.4
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        if (outline == null) {
                            return;
                        }
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                    }
                });
                view.setClipToOutline(true);
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(ViewCompat.MEASURED_STATE_MASK);
            gradientDrawable.setCornerRadius(f);
            view.setBackground(gradientDrawable);
        }
    }
}
