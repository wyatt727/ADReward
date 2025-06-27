package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ActHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static String EYQ = null;
    private static ActServiceConnection IPb = null;
    private static Boolean Kbd = null;
    private static volatile boolean Pm = false;
    private static int Td = -1;
    private static int mZx = -1;

    private EYQ() {
    }

    public static String EYQ(final Context context) {
        String str = EYQ;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                EYQ = null;
            } else if (!TextUtils.isEmpty(str2) && !EYQ(context, intent) && arrayList.contains(str2)) {
                EYQ = str2;
            } else {
                EYQ = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(EYQ)) {
                synchronized (EYQ.class) {
                    if (!Pm) {
                        mZx mzx = new mZx() { // from class: com.bytedance.sdk.openadsdk.core.act.EYQ.1
                            @Override // com.bytedance.sdk.openadsdk.core.act.mZx
                            public void EYQ(final CustomTabsClient customTabsClient) {
                                xt.Pm().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.EYQ.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Throwable th;
                                        boolean z;
                                        boolean zIsEngagementSignalsApiAvailable;
                                        boolean engagementSignalsCallback = false;
                                        try {
                                            CustomTabsCallback customTabsCallback = new CustomTabsCallback();
                                            EngagementSignalsCallback engagementSignalsCallback2 = new EngagementSignalsCallback() { // from class: com.bytedance.sdk.openadsdk.core.act.EYQ.1.1.1
                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onSessionEnded(boolean z2, Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onVerticalScrollEvent(boolean z2, Bundle bundle) {
                                                }
                                            };
                                            CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(customTabsCallback);
                                            zIsEngagementSignalsApiAvailable = customTabsSessionNewSession != null ? customTabsSessionNewSession.isEngagementSignalsApiAvailable(Bundle.EMPTY) : false;
                                            try {
                                                if (zIsEngagementSignalsApiAvailable) {
                                                    int unused = EYQ.mZx = 1;
                                                    engagementSignalsCallback = customTabsSessionNewSession.setEngagementSignalsCallback(engagementSignalsCallback2, Bundle.EMPTY);
                                                    if (engagementSignalsCallback) {
                                                        int unused2 = EYQ.Td = 1;
                                                    }
                                                } else {
                                                    int unused3 = EYQ.mZx = 0;
                                                }
                                                if (!zIsEngagementSignalsApiAvailable || !engagementSignalsCallback) {
                                                    Boolean unused4 = EYQ.Kbd = Boolean.FALSE;
                                                } else {
                                                    Boolean unused5 = EYQ.Kbd = Boolean.TRUE;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z = false;
                                                engagementSignalsCallback = zIsEngagementSignalsApiAvailable;
                                                pi.EYQ("CustomTabsHelper", th.getMessage());
                                                zIsEngagementSignalsApiAvailable = engagementSignalsCallback;
                                                engagementSignalsCallback = z;
                                                Boolean.valueOf(zIsEngagementSignalsApiAvailable);
                                                Boolean.valueOf(engagementSignalsCallback);
                                                ActServiceConnection actServiceConnection = EYQ.IPb;
                                                if (EYQ.Pm) {
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = false;
                                        }
                                        Boolean.valueOf(zIsEngagementSignalsApiAvailable);
                                        Boolean.valueOf(engagementSignalsCallback);
                                        ActServiceConnection actServiceConnection2 = EYQ.IPb;
                                        if (EYQ.Pm || actServiceConnection2 == null) {
                                            return;
                                        }
                                        try {
                                            context.unbindService(actServiceConnection2);
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.act.mZx
                            public void EYQ() {
                                ActServiceConnection unused = EYQ.IPb = null;
                            }
                        };
                        if (IPb == null) {
                            IPb = new ActServiceConnection(mzx);
                        }
                        CustomTabsClient.bindCustomTabsService(context, EYQ, IPb);
                        Pm = true;
                    }
                }
            }
        } catch (Throwable th) {
            pi.EYQ("CustomTabsHelper", th.getMessage());
        }
        return EYQ;
    }

    private static boolean EYQ(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (listQueryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int EYQ() {
        Boolean bool = Kbd;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static int mZx(Context context) {
        return !TextUtils.isEmpty(EYQ(context)) ? 1 : 0;
    }

    public static int mZx() {
        return mZx;
    }

    public static int Td() {
        return Td;
    }

    public static void EYQ(int i) {
        mZx = i;
    }

    public static void mZx(int i) {
        Td = i;
    }
}
