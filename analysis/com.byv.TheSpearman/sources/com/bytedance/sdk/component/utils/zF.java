package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;

/* compiled from: ResourceHelp.java */
/* loaded from: classes2.dex */
public final class zF {
    private static Context EYQ = null;
    private static boolean IPb = false;
    private static boolean Kbd = false;
    private static String Pm;
    private static Resources Td;
    private static String mZx;

    public static void EYQ(Context context) {
        EYQ = context;
    }

    public static void EYQ(String str) {
        Pm = str;
    }

    private static String Pm(Context context) {
        if (Pm == null) {
            Pm = context.getPackageName();
        }
        return Pm;
    }

    private static int EYQ(Context context, String str, String str2) {
        int identifier = mZx(context).getIdentifier(str, str2, Pm(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!Kbd) {
            Td(context);
            return mZx(context).getIdentifier(str, str2, Pm(context));
        }
        return context.getResources().getIdentifier(str, str2, Pm(context));
    }

    public static String EYQ(Context context, String str) {
        return mZx(context).getString(mZx(context, str));
    }

    public static int mZx(Context context, String str) {
        return EYQ(context, str, TypedValues.Custom.S_STRING);
    }

    public static Drawable Td(Context context, String str) {
        return mZx(context).getDrawable(Pm(context, str));
    }

    public static int Pm(Context context, String str) {
        return EYQ(context, str, "drawable");
    }

    public static int Kbd(Context context, String str) {
        return EYQ(context, str, "id");
    }

    public static int IPb(Context context, String str) {
        return EYQ(context, str, "style");
    }

    public static int VwS(Context context, String str) {
        return EYQ(context, str, "dimen");
    }

    public static int QQ(Context context, String str) {
        return mZx(context).getColor(HX(context, str));
    }

    public static int HX(Context context, String str) {
        return EYQ(context, str, "color");
    }

    public static int tp(Context context, String str) {
        return EYQ(context, str, "anim");
    }

    public static int MxO(Context context, String str) {
        return EYQ(context, str, TypedValues.Custom.S_INT);
    }

    public static int tsL(Context context, String str) {
        return mZx(context).getInteger(MxO(context, str));
    }

    public static Resources mZx(Context context) {
        Resources resources = Td;
        if (resources == null) {
            resources = null;
        }
        Context context2 = EYQ;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void Td(Context context) {
        try {
            if (TextUtils.isEmpty(mZx)) {
                return;
            }
            Resources resources = context.getResources();
            Td = new Resources(mZx(resources.getAssets(), mZx + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
            Pm = context.getPackageName();
            Kbd = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    private static AssetManager mZx(AssetManager assetManager, String str) throws NoSuchMethodException, SecurityException {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            EYQ(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            EYQ(assetManager, str);
        }
        try {
            rfB.EYQ(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static boolean EYQ(AssetManager assetManager, String str) throws NoSuchMethodException, SecurityException {
        Method methodEYQ = rfB.EYQ((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (methodEYQ == null) {
            methodEYQ = rfB.EYQ((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (methodEYQ != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                }
                if (((Integer) methodEYQ.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }
}
