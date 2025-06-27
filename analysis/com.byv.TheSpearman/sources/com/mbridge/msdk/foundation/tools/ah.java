package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SameSDKTool.java */
/* loaded from: classes4.dex */
public final class ah extends l {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f2975a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};
    public static boolean b = false;
    public static LinearLayout c;

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File fileB = com.mbridge.msdk.foundation.same.b.e.b(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG);
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.lastIndexOf("/") == -1) {
                str2 = str.hashCode() + "";
            } else {
                str2 = (str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode()) + "";
            }
        }
        return new File(fileB, str2).getAbsolutePath();
    }

    public static void a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = listQueryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    a(context, "market://details?id=" + str.replace("https://play.google.com/store/apps/details?id=", ""), nativeTrackingListener);
                    return;
                }
                return;
            }
            if (!z) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
                return;
            }
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                        intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                        break;
                    }
                }
            }
            try {
                context.startActivity(intent);
                a(nativeTrackingListener);
            } catch (Exception unused) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
            }
        } catch (Exception e) {
            ad.b("SDKUtil", e.getMessage());
        }
    }

    public static void a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    ad.d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    public static void a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        Intent intent;
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (list != null) {
            list.add("web_view");
        }
        if (b) {
            a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            Class.forName("com.mbridge.msdk.activity.MBCommonActivity");
            intent = new Intent(context, Class.forName("com.mbridge.msdk.activity.MBCommonActivity"));
        } catch (Exception unused) {
            dVar.a("result", 2);
            a(context, str, nativeTrackingListener, campaignEx, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (a.a(str)) {
            str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
        }
        intent.putExtra("url", str);
        ad.c("url", "webview url = " + str);
        intent.setFlags(268435456);
        intent.putExtra("mvcommon", campaignEx);
        context.startActivity(intent);
        dVar.a("result", 1);
        dVar.a("type", 9);
        if (list != null) {
            dVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        try {
            if (a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                intent.setClassName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
            }
            context.startActivity(intent);
            a(baseTrackingListener);
            dVar.a("result", 1);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(baseTrackingListener);
                dVar.a("result", 1);
            } catch (Exception e2) {
                e2.printStackTrace();
                dVar.a("result", 2);
            }
        }
        try {
            dVar.a("type", 5);
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception unused) {
        }
    }

    public static void a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    public static void a(Context context, String str, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BaseTrackingListener baseTrackingListener, List<String> list) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("type", 9);
        try {
            BrowserView browserView = new BrowserView(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(z.i(context), z.g(context)));
            browserView.setListener(new com.mbridge.msdk.foundation.webview.a(context, campaignEx, aVar, browserView, baseTrackingListener));
            browserView.loadUrl(str);
            dVar.a("result", "1");
        } catch (Exception e) {
            ad.b("SDKUtil", e.getMessage());
            dVar.a("result", "2");
        }
        if (list != null) {
            dVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
    }

    public static void b(Campaign campaign, ViewGroup viewGroup) {
        a(campaign, viewGroup, 0, 0);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup, int i, int i2) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    ad.d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (c == null) {
                        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (contextC instanceof Activity) {
                            c = (LinearLayout) LayoutInflater.from(contextC.getApplicationContext()).inflate(v.a(contextC.getApplicationContext(), "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        } else {
                            c = (LinearLayout) LayoutInflater.from(contextC).inflate(v.a(contextC, "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        }
                    }
                    int iMin = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int iMin2 = Math.min(Math.max(iMin / 4, 70), iMin);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin2, iMin2);
                        layoutParams.gravity = 17;
                        ar.a(c);
                        viewGroup.addView(c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMin2, iMin2);
                    if (i2 == 0 && i == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i2;
                        layoutParams2.topMargin = i;
                    }
                    ar.a(c);
                    viewGroup.addView(c, layoutParams2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: SameSDKTool.java */
    public static class a {
        public static boolean a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> listA = a(context);
                if (listA != null && listA.size() > 0) {
                    if (!a(str)) {
                        if (c(str)) {
                            str = "market://" + str.substring(str.indexOf("details?id="));
                        } else {
                            str = null;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    Intent intentB = b(context);
                    intentB.setData(Uri.parse(str));
                    intentB.addFlags(268435456);
                    Iterator<ResolveInfo> it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intentB.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(intentB);
                    ah.a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(b(context), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private static Intent b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        public static boolean a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        private static boolean c(String str) {
            Uri uri;
            try {
                if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || TextUtils.isEmpty(uri.getHost())) {
                    return false;
                }
                if (!uri.getHost().equals("play.google.com")) {
                    if (!uri.getHost().equals("market.android.com")) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
            }
            return false;
        }

        public static boolean b(String str) {
            return a(str) || c(str);
        }
    }
}
