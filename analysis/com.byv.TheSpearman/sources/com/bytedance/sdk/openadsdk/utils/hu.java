package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: OpenUtils.java */
/* loaded from: classes2.dex */
public class hu {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.tp.EYQ.EYQ mZx(String str, int i, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
        eyq.EYQ(str);
        eyq.EYQ(ub);
        eyq.mZx(FH.EYQ(ub));
        eyq.EYQ(i);
        eyq.EYQ(false);
        eyq.mZx(ub.Pf());
        return eyq;
    }

    public static boolean EYQ(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.UB ub, final String str2) {
        if (context instanceof Activity) {
            if (!EYQ((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityMZx = com.bytedance.sdk.openadsdk.core.nWX.EYQ().Kbd().mZx();
            if (activityMZx != null && EYQ(activityMZx)) {
                context = activityMZx;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        }
        if (context == null) {
            return false;
        }
        final String strEYQ = FH.EYQ(ub);
        if (!com.bytedance.sdk.component.utils.hu.EYQ(str)) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(mZx(str2, 5, ub));
            return false;
        }
        final String strMZx = com.bytedance.sdk.openadsdk.core.model.UB.mZx(context, ub);
        if (!TextUtils.isEmpty(strMZx)) {
            try {
                final CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                if (Build.VERSION.SDK_INT >= 21 && (context instanceof Activity)) {
                    builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(((Activity) context).getWindow().getNavigationBarColor()).build());
                }
                final Context context2 = context;
                new AdActAction(context, ub, str2, str).EYQ(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.hu.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(CustomTabsSession customTabsSession) throws JSONException {
                        if (customTabsSession != null) {
                            try {
                                builder.setSession(customTabsSession);
                            } catch (Throwable th) {
                                String message = th.getMessage();
                                com.bytedance.sdk.component.utils.pi.EYQ("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx = hu.mZx(str2, 13, ub);
                                eyqMZx.Td(message);
                                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx);
                                hu.mZx(context2, str, ub, str2, strEYQ);
                                return;
                            }
                        }
                        CustomTabsIntent customTabsIntentBuild = builder.build();
                        if (!(context2 instanceof Activity)) {
                            customTabsIntentBuild.intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.Td.EYQ(context2, strMZx, customTabsIntentBuild, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).EYQ(true);
                        }
                        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx2 = hu.mZx(str2, 100, ub);
                        eyqMZx2.EYQ(true);
                        eyqMZx2.mZx(8);
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i, String str3) throws JSONException {
                        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx = hu.mZx(str2, i, ub);
                        eyqMZx.Td(str3);
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx);
                        hu.mZx(context2, str, ub, str2, strEYQ);
                    }
                });
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.pi.EYQ("OpenUtils", message);
                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx = mZx(str2, 12, ub);
                eyqMZx.Td(message);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx);
                return mZx(context, str, ub, str2, strEYQ);
            }
        }
        return mZx(context, str, ub, str2, strEYQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mZx(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, String str2, String str3) throws JSONException {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx = mZx(str2, 100, ub);
                eyqMZx.EYQ(true);
                eyqMZx.mZx(2);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx2 = mZx(str2, 7, ub);
                eyqMZx2.Td(message);
                eyqMZx2.mZx(2);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyqMZx3 = mZx(str2, 6, ub);
            eyqMZx3.Td(message2);
            eyqMZx3.mZx(2);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyqMZx3);
            return false;
        }
    }

    public static boolean mZx(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, String str2) throws JSONException {
        if (context instanceof Activity) {
            if (!EYQ((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityMZx = com.bytedance.sdk.openadsdk.core.nWX.EYQ().Kbd().mZx();
            if (activityMZx != null && EYQ(activityMZx)) {
                context = activityMZx;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        }
        if (context == null || !EYQ(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        if (FH.QQ(context)) {
            if (FH.EYQ(context, intent)) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str2, "open_url_app", map);
                try {
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.mZx.MxO.EYQ().EYQ(map).EYQ(ub, str2);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str2, "open_url_app", map);
            context.startActivity(intent);
            com.bytedance.sdk.openadsdk.mZx.MxO.EYQ().EYQ(map).EYQ(ub, str2);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean EYQ(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean EYQ(Activity activity) {
        if (activity == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) && !activity.isFinishing();
    }
}
