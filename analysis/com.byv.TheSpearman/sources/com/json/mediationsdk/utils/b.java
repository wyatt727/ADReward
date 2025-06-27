package com.json.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.json.la;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.Placement;
import com.json.ob;
import com.json.pb;
import com.json.r1;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2002a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final String c = "CappingManager.IS_PACING_ENABLED";
    private static final String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final String e = "CappingManager.CAPPING_TYPE";
    private static final String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2003a;

        static {
            int[] iArr = new int[pb.values().length];
            f2003a = iArr;
            try {
                iArr[pb.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2003a[pb.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.b$b, reason: collision with other inner class name */
    public enum EnumC0239b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private static long a(pb pbVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i2 = a.f2003a[pbVar.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private static String a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    private static String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public static synchronized void a(Context context, la laVar) {
        if (context == null || laVar == null) {
            return;
        }
        ob placementAvailabilitySettings = laVar.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, IronSourceConstants.NATIVE_AD_UNIT, laVar.getPlacementName(), placementAvailabilitySettings);
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        if (context == null || interstitialPlacement == null) {
            return;
        }
        ob placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, "Interstitial", interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
    }

    public static synchronized void a(Context context, Placement placement) {
        if (context == null || placement == null) {
            return;
        }
        ob placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
    }

    public static synchronized void a(Context context, r1 r1Var) {
        if (context == null || r1Var == null) {
            return;
        }
        ob placementAvailabilitySettings = r1Var.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, "Banner", r1Var.getPlacementName(), placementAvailabilitySettings);
    }

    public static synchronized void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(context, "Banner", str);
        }
    }

    public static synchronized void a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        a(context, a(ad_unit), str);
    }

    private static void a(Context context, String str, String str2) {
        int i2 = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, b, str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, a(str, d, str2), 0);
            String strA = a(str, g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, e, str2), pb.PER_DAY.toString());
                pb pbVar = null;
                pb[] pbVarArrValues = pb.values();
                int length = pbVarArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    pb pbVar2 = pbVarArrValues[i2];
                    if (pbVar2.f2063a.equals(stringFromSharedPrefs)) {
                        pbVar = pbVar2;
                        break;
                    }
                    i2++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, h, str2), a(pbVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, strA, intFromSharedPrefs + 1);
        }
    }

    private static void a(Context context, String str, String str2, ob obVar) {
        boolean zE = obVar.e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f2002a, str2), zE);
        if (zE) {
            boolean zD = obVar.d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, b, str2), zD);
            if (zD) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, d, str2), obVar.b());
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, e, str2), obVar.a().toString());
            }
            boolean zF = obVar.f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, c, str2), zF);
            if (zF) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f, str2), obVar.c());
            }
        }
    }

    private static EnumC0239b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f2002a, str2), true)) {
            return EnumC0239b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, f, str2), 0) * 1000) {
                return EnumC0239b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, b, str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, d, str2), 0);
            String strA = a(str, g, str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            String strA2 = a(str, h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, strA2, 0L)) {
                IronSourceUtils.saveIntToSharedPrefs(context, strA, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, strA2, 0L);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return EnumC0239b.CAPPED_PER_COUNT;
            }
        }
        return EnumC0239b.NOT_CAPPED;
    }

    public static synchronized void b(Context context, InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            a(context, "Interstitial", interstitialPlacement.getPlacementName());
        }
    }

    public static synchronized void b(Context context, Placement placement) {
        if (placement != null) {
            a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
        }
    }

    public static synchronized void b(Context context, String str) {
        a(context, "Interstitial", str);
    }

    public static synchronized boolean b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        return b(context, a(ad_unit), str) != EnumC0239b.NOT_CAPPED;
    }

    public static synchronized EnumC0239b c(Context context, InterstitialPlacement interstitialPlacement) {
        if (context != null && interstitialPlacement != null) {
            if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                return b(context, "Interstitial", interstitialPlacement.getPlacementName());
            }
        }
        return EnumC0239b.NOT_CAPPED;
    }

    public static synchronized EnumC0239b c(Context context, Placement placement) {
        if (context != null && placement != null) {
            if (placement.getPlacementAvailabilitySettings() != null) {
                return b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
        return EnumC0239b.NOT_CAPPED;
    }

    public static synchronized void c(Context context, String str) {
        a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
    }

    public static synchronized boolean d(Context context, String str) {
        return b(context, "Banner", str) != EnumC0239b.NOT_CAPPED;
    }

    public static synchronized boolean e(Context context, String str) {
        return b(context, "Interstitial", str) != EnumC0239b.NOT_CAPPED;
    }

    public static synchronized boolean f(Context context, String str) {
        return b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != EnumC0239b.NOT_CAPPED;
    }
}
