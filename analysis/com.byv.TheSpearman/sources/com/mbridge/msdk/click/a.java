package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.json.m4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CommonClickControl.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2514a = false;
    public static Map<String, Long> b = new HashMap();
    public static Set<String> c = new HashSet();
    private String d;
    private long e;
    private com.mbridge.msdk.foundation.db.h f;
    private Context g;
    private d h;
    private com.mbridge.msdk.foundation.same.report.i j;
    private com.mbridge.msdk.c.g k;
    private boolean l;
    private boolean o;
    private i p;
    private NativeListener.NativeTrackingListener i = null;
    private boolean m = false;
    private boolean n = true;

    static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "2000138" : "2000139" : "2000137" : "2000136";
    }

    public a(Context context, String str) {
        this.f = null;
        this.g = null;
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(str);
        this.k = gVarB;
        if (gVarB == null) {
            com.mbridge.msdk.c.h.a();
            this.k = com.mbridge.msdk.c.i.a();
        }
        this.l = this.k.aJ();
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.d = str;
        if (this.f == null) {
            this.f = com.mbridge.msdk.foundation.db.h.a(applicationContext);
        }
        this.j = new com.mbridge.msdk.foundation.same.report.i(this.g);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context == null) {
            return;
        }
        new d(context.getApplicationContext()).a(str, campaignEx, null, str2, z, z2, com.mbridge.msdk.click.a.a.f);
    }

    public static void a(Context context, final CampaignEx campaignEx, String str, final String str2, boolean z, boolean z2, final int i) {
        if (context == null) {
            return;
        }
        final int i2 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        new d(context.getApplicationContext()).a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.1
            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj) {
            }

            @Override // com.mbridge.msdk.click.f
            public final void b(Object obj) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    dVar.a("net_ty", String.valueOf(i2));
                    if (obj != null && (obj instanceof JumpLoaderResult)) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String str3 = jumpLoaderResult.getStatusCode() + "";
                        dVar.a("status_code", str3);
                        if (str3.startsWith("2")) {
                            dVar.a("result", 1);
                        } else {
                            String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                            if (TextUtils.isEmpty(exceptionMsg)) {
                                exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str3;
                            }
                            dVar.a("failingURL", ao.d(str2));
                            dVar.a("reason", exceptionMsg);
                        }
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a.a(i), campaignEx, dVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj, String str3) {
                try {
                    String strA = a.a(i);
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (!TextUtils.isEmpty(exceptionMsg)) {
                            str3 = exceptionMsg;
                        }
                        dVar.a("reason", str3);
                        dVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                    }
                    dVar.a("code", "");
                    dVar.a("failingURL", ao.d(str2));
                    dVar.a("net_ty", String.valueOf(i2));
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(strA, campaignEx, dVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e.getMessage());
                    }
                }
            }
        }, str2, z, z2, i);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        d dVar = new d(context.getApplicationContext());
        for (String str2 : strArr) {
            dVar.a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.2
                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj, String str3) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void b(Object obj) {
                }
            }, str2, z, z2, com.mbridge.msdk.click.a.a.f);
        }
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.i = nativeTrackingListener;
    }

    public final void a(i iVar) {
        this.p = iVar;
    }

    public final void a(boolean z) {
        this.n = z;
    }

    public final void a() {
        try {
            this.i = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    private boolean b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            Map<String, Long> map = b;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id) && (l = b.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e.printStackTrace();
            return true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            if (b(campaignEx)) {
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f);
                dVarA.a();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.d);
                if (jumpLoaderResultB != null) {
                    if (jumpLoaderResultB.getNoticeurl() != null) {
                        jumpLoaderResultB.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    dVarA.a(campaignEx, this.d);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (ai.b(campaignEx)) {
                    MIMManager.a().a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (c.d(this.g, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.i;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        b.a(this.g, this.d, campaignEx, noticeUrl + "&opdptype=1", -1);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.i;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.a().b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.i;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    b.a(this.g, this.d, campaignEx, str, -1);
                    a(this.g, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = this.i;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (c.d(this.g, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = this.i;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (this.g != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    this.g.sendBroadcast(intent);
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("CommonClickControl", e.getMessage());
                                    }
                                }
                            }
                            b.a(this.g, this.d, campaignEx, str + "&opdptype=1", -1);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = this.i;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = this.i;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(a(this.i, campaignEx, appletsModel, this));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (appletsModel.isRequestTimesMaxPerDay()) {
                                if (campaignEx != null && appletsModel != null && !TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                    campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                                }
                            } else {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = this.i;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, a(this.i, campaignEx, appletsModel, this));
                                return;
                            }
                        }
                    }
                }
                if (com.mbridge.msdk.f.b.b()) {
                    b.a(this.g, this.d, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && c.b(this.g, campaignEx.getPackageName())) {
                    c.a(this.g, campaignEx.getPackageName());
                    if (com.mbridge.msdk.f.b.a()) {
                        b.a(this.g, this.d, campaignEx, str, com.mbridge.msdk.foundation.same.a.M);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = this.i;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (com.mbridge.msdk.f.b.a()) {
                        a(campaignEx, true, (Boolean) true, (List<String>) arrayList);
                    } else {
                        a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = this.i;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        ah.a(this.i);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iB = b();
                if (com.mbridge.msdk.f.b.a() && linkType != 3) {
                    b.a(this.g, this.d, campaignEx, str, -1);
                }
                boolean z = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = this.i;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (ah.a.a(this.g, campaignEx.getClickURL(), this.i)) {
                        a(jumpLoaderResultB, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = this.i;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    a(iB, campaignEx.getClickURL(), campaignEx, this.i, arrayList);
                    a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = this.i;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.f.b.a()) {
                            a(campaignEx, false, (Boolean) true, (List<String>) arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.f.b.a()) {
                            a(campaignEx, false, (Boolean) true, (List<String>) arrayList);
                            a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = this.i;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = this.i;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = this.i;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    ah.a(this.g, clickURL2, this.i, campaignEx, arrayList);
                    if (com.mbridge.msdk.f.b.a()) {
                        a(jumpLoaderResultB, campaignEx, false);
                        return;
                    } else {
                        a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = this.i;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = this.i;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    a(jumpLoaderResultB, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = this.i;
                        if (baseTrackingListener == null && (baseTrackingListener = this.p) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        ah.a(this.g, clickURL3, campaignEx, this, baseTrackingListener, arrayList);
                    } else {
                        ah.a(this.g, clickURL3, campaignEx, this.i, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = this.i;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    a(jumpLoaderResultB, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    ah.a(this.g, clickURL3, this.i, campaignEx, arrayList);
                    a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = this.i;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iB == 2) {
                        ah.a(this.g, clickURL3, campaignEx, this.i, arrayList);
                    } else {
                        ah.a(this.g, clickURL3, this.i, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = this.i;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                a(jumpLoaderResultB, campaignEx, false);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new g(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, 2, "context is null", this.d);
            return;
        }
        boolean z = z.y() == 1;
        boolean z2 = z.u(context) == 1;
        if (!z || !z2) {
            com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, "integrated:" + z + "-hasWx:" + z2, this.d);
            a(campaignEx, list);
            return;
        }
        String ghId = campaignEx.getGhId();
        String ghPath = campaignEx.getGhPath();
        String bindId = campaignEx.getBindId();
        String strH = com.mbridge.msdk.foundation.controller.c.m().h();
        if (!TextUtils.isEmpty(ghId)) {
            try {
                if (!TextUtils.isEmpty(strH)) {
                    bindId = strH;
                }
                Object objB = z.b(bindId);
                Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                Object objNewInstance = cls.newInstance();
                cls.getField("userName").set(objNewInstance, ghId);
                cls.getField("path").set(objNewInstance, ghPath);
                cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objB, objNewInstance);
                com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 1, "", this.d);
                return;
            } catch (Throwable th) {
                com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, th.getMessage(), this.d);
                a(campaignEx, list);
                return;
            }
        }
        a(campaignEx, list);
        com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, "ghid is empty", this.d);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            ah.a(this.g, campaignEx.getClickURL(), campaignEx, this.i, list);
        } else {
            ah.a(this.g, campaignEx.getClickURL(), this.i, campaignEx, list);
        }
    }

    private void a(final CampaignEx campaignEx, final boolean z, final Boolean bool, final List<String> list) {
        final boolean z2;
        try {
            this.e = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.i;
            if (nativeTrackingListener == null || z) {
                z2 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z2 = !this.i.onInterceptDefaultLoadingDialog();
            }
            final boolean z3 = true;
            this.o = false;
            if (campaignEx.getJumpResult() != null) {
                if (!z) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.m, bool, list);
                }
                this.o = true;
                this.m = false;
                z3 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f).a(campaignEx.getId(), this.d) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f);
                dVarA.a();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.d);
                if (jumpLoaderResultB != null && !z) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z3) {
                        a(campaignEx, jumpLoaderResultB, z3, this.m, bool, list);
                        this.o = true;
                        this.m = false;
                        z3 = false;
                    }
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z) {
                        boolean zA = ah.a.a(this.g, "market://details?id=" + campaignEx.getPackageName(), this.i);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.i;
                        if (nativeTrackingListener2 != null && z3) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.i.onFinishRedirection(campaignEx, null);
                        }
                        this.o = true;
                        z3 = false;
                    }
                    if (z) {
                        this.o = true;
                        this.m = false;
                        z3 = false;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.click.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (z2 && !a.f2514a && !a.this.o && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !z) {
                            a.a(a.this, campaignEx);
                        }
                        if (z2 || a.this.i == null || a.f2514a || a.this.o || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                            return;
                        }
                        a.this.i.onShowLoading(campaignEx);
                    }
                });
                d dVar = this.h;
                if (dVar != null) {
                    dVar.a();
                }
                Set<String> set = c;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.i;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.i.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = c;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                d dVar2 = new d(this.g);
                this.h = dVar2;
                final boolean z4 = z2;
                dVar2.a(this.d, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.4
                    @Override // com.mbridge.msdk.click.f
                    public final void a(Object obj) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:22:0x0067, B:24:0x006b, B:26:0x0075, B:27:0x007b, B:29:0x0089, B:30:0x0096), top: B:41:0x0067 }] */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:22:0x0067, B:24:0x006b, B:26:0x0075, B:27:0x007b, B:29:0x0089, B:30:0x0096), top: B:41:0x0067 }] */
                    @Override // com.mbridge.msdk.click.f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void b(java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.c
                            if (r0 == 0) goto Lf
                            java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.c
                            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r2
                            java.lang.String r1 = r1.getId()
                            r0.remove(r1)
                        Lf:
                            r0 = 0
                            java.lang.String r1 = "CommonClickControl"
                            if (r12 == 0) goto L65
                            boolean r2 = r12 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L59
                            if (r2 == 0) goto L65
                            com.mbridge.msdk.click.entity.JumpLoaderResult r12 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r12     // Catch: java.lang.Throwable -> L59
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r2     // Catch: java.lang.Throwable -> L57
                            r0.setJumpResult(r12)     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.click.a r3 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r2     // Catch: java.lang.Throwable -> L57
                            boolean r6 = r3     // Catch: java.lang.Throwable -> L57
                            boolean r7 = com.mbridge.msdk.click.a.c(r3)     // Catch: java.lang.Throwable -> L57
                            java.lang.Boolean r8 = r4     // Catch: java.lang.Throwable -> L57
                            java.util.List r9 = r5     // Catch: java.lang.Throwable -> L57
                            r5 = r12
                            com.mbridge.msdk.click.a.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L57
                            boolean r0 = r12.isjumpDone()     // Catch: java.lang.Throwable -> L57
                            if (r0 == 0) goto L4c
                            com.mbridge.msdk.click.a r0 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.foundation.db.h r0 = com.mbridge.msdk.click.a.d(r0)     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.foundation.db.d r0 = com.mbridge.msdk.foundation.db.d.a(r0)     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.click.a r3 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L57
                            java.lang.String r3 = com.mbridge.msdk.click.a.e(r3)     // Catch: java.lang.Throwable -> L57
                            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L57
                        L4c:
                            com.mbridge.msdk.click.a r0 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L57
                            boolean r2 = r6     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2     // Catch: java.lang.Throwable -> L57
                            com.mbridge.msdk.click.a.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L57
                            r0 = r12
                            goto L65
                        L57:
                            r0 = move-exception
                            goto L5d
                        L59:
                            r12 = move-exception
                            r10 = r0
                            r0 = r12
                            r12 = r10
                        L5d:
                            java.lang.String r0 = r0.getMessage()
                            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
                            goto L66
                        L65:
                            r12 = r0
                        L66:
                            r0 = -1
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2     // Catch: java.lang.Throwable -> Lab
                            if (r2 == 0) goto L7b
                            java.lang.String r2 = r2.getClickURL()     // Catch: java.lang.Throwable -> Lab
                            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lab
                            if (r3 != 0) goto L7b
                            java.lang.String r0 = "tcp"
                            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> Lab
                        L7b:
                            com.mbridge.msdk.foundation.same.report.d.d r2 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Throwable -> Lab
                            r2.<init>()     // Catch: java.lang.Throwable -> Lab
                            java.lang.String r3 = "result"
                            java.lang.String r4 = "1"
                            r2.a(r3, r4)     // Catch: java.lang.Throwable -> Lab
                            if (r12 == 0) goto L96
                            java.lang.String r3 = "status_code"
                            int r12 = r12.getStatusCode()     // Catch: java.lang.Throwable -> Lab
                            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lab
                            r2.a(r3, r12)     // Catch: java.lang.Throwable -> Lab
                        L96:
                            java.lang.String r12 = "net_ty"
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lab
                            r2.a(r12, r0)     // Catch: java.lang.Throwable -> Lab
                            com.mbridge.msdk.foundation.same.report.d.c r12 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Throwable -> Lab
                            java.lang.String r0 = "2000138"
                            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2     // Catch: java.lang.Throwable -> Lab
                            r12.a(r0, r3, r2)     // Catch: java.lang.Throwable -> Lab
                            goto Lb7
                        Lab:
                            r12 = move-exception
                            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
                            if (r0 == 0) goto Lb7
                            java.lang.String r12 = r12.getMessage()
                            com.mbridge.msdk.foundation.tools.ad.b(r1, r12)
                        Lb7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.AnonymousClass4.b(java.lang.Object):void");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:22:0x0050, B:24:0x0054, B:26:0x005e, B:27:0x0064, B:29:0x007b, B:30:0x0088), top: B:37:0x0050 }] */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:22:0x0050, B:24:0x0054, B:26:0x005e, B:27:0x0064, B:29:0x007b, B:30:0x0088), top: B:37:0x0050 }] */
                    @Override // com.mbridge.msdk.click.f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.Object r6, java.lang.String r7) {
                        /*
                            r5 = this;
                            java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.c
                            if (r0 == 0) goto Lf
                            java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.c
                            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r2
                            java.lang.String r1 = r1.getId()
                            r0.remove(r1)
                        Lf:
                            r0 = 0
                            java.lang.String r1 = "CommonClickControl"
                            if (r6 == 0) goto L2a
                            boolean r2 = r6 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L47
                            if (r2 == 0) goto L2a
                            r2 = r6
                            com.mbridge.msdk.click.entity.JumpLoaderResult r2 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r2     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.click.a r0 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L27
                            com.mbridge.msdk.click.entity.JumpLoaderResult r6 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r6     // Catch: java.lang.Throwable -> L27
                            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r2     // Catch: java.lang.Throwable -> L27
                            r4 = 1
                            com.mbridge.msdk.click.a.a(r0, r6, r3, r4)     // Catch: java.lang.Throwable -> L27
                            r0 = r2
                            goto L2a
                        L27:
                            r6 = move-exception
                            r0 = r2
                            goto L48
                        L2a:
                            com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.b(r6)     // Catch: java.lang.Throwable -> L47
                            if (r6 == 0) goto L3d
                            com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.b(r6)     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2     // Catch: java.lang.Throwable -> L47
                            r6.onRedirectionFailed(r2, r7)     // Catch: java.lang.Throwable -> L47
                        L3d:
                            com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L47
                            boolean r7 = r6     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2     // Catch: java.lang.Throwable -> L47
                            com.mbridge.msdk.click.a.a(r6, r7, r2)     // Catch: java.lang.Throwable -> L47
                            goto L4f
                        L47:
                            r6 = move-exception
                        L48:
                            java.lang.String r6 = r6.getMessage()
                            com.mbridge.msdk.foundation.tools.ad.b(r1, r6)
                        L4f:
                            r6 = -1
                            com.mbridge.msdk.foundation.entity.CampaignEx r7 = r2     // Catch: java.lang.Throwable -> L94
                            if (r7 == 0) goto L64
                            java.lang.String r7 = r7.getClickURL()     // Catch: java.lang.Throwable -> L94
                            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L94
                            if (r2 != 0) goto L64
                            java.lang.String r6 = "tcp"
                            boolean r6 = r7.startsWith(r6)     // Catch: java.lang.Throwable -> L94
                        L64:
                            com.mbridge.msdk.foundation.same.report.d.d r7 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Throwable -> L94
                            r7.<init>()     // Catch: java.lang.Throwable -> L94
                            java.lang.String r2 = "result"
                            java.lang.String r3 = "2"
                            r7.a(r2, r3)     // Catch: java.lang.Throwable -> L94
                            java.lang.String r2 = "net_ty"
                            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L94
                            r7.a(r2, r6)     // Catch: java.lang.Throwable -> L94
                            if (r0 == 0) goto L88
                            java.lang.String r6 = "status_code"
                            int r0 = r0.getStatusCode()     // Catch: java.lang.Throwable -> L94
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L94
                            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L94
                        L88:
                            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Throwable -> L94
                            java.lang.String r0 = "2000138"
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2     // Catch: java.lang.Throwable -> L94
                            r6.a(r0, r2, r7)     // Catch: java.lang.Throwable -> L94
                            goto La0
                        L94:
                            r6 = move-exception
                            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
                            if (r7 == 0) goto La0
                            java.lang.String r6 = r6.getMessage()
                            com.mbridge.msdk.foundation.tools.ad.b(r1, r6)
                        La0:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.AnonymousClass4.a(java.lang.Object, java.lang.String):void");
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iL = z.l(this.g);
            eVar.a(iL);
            eVar.c(z.a(this.g, iL));
            eVar.b(campaignEx.getRequestId());
            eVar.k(campaignEx.getRequestIdNotice());
            eVar.b(i);
            eVar.i(jCurrentTimeMillis + "");
            eVar.j(campaignEx.getId());
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), m4.M));
            }
            eVar.e((this.e / 1000) + "");
            eVar.d(Integer.parseInt(campaignEx.getLandingType()));
            eVar.e(campaignEx.getLinkType());
            eVar.a(this.d);
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), m4.M));
            }
            if (this.l) {
                eVar.f(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), m4.M));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.g(URLEncoder.encode(jumpLoaderResult.getContent(), C.UTF8_NAME));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), m4.M));
                }
            }
            if (z) {
                this.j.a("click_jump_error", eVar, this.d);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            String strA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (an.b(strA)) {
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(strA);
                } else {
                    new com.mbridge.msdk.foundation.same.report.i(this.g, 0).a("click_jump_success", strA, null, null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = null;
                if (campaign != null && (campaign instanceof CampaignEx)) {
                    campaignEx = (CampaignEx) campaign;
                }
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || ah.a.a(this.g, str, this.i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    ah.a.a(this.g, "market://details?id=" + campaignEx.getPackageName(), this.i);
                    return;
                }
                if (b() == 2) {
                    ah.a(this.g, campaignEx.getClickURL(), campaignEx, this.i, new ArrayList());
                } else {
                    ah.a(this.g, campaignEx.getClickURL(), this.i, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        a(jumpLoaderResult, campaignEx, 1, z);
    }

    private void a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i == 2) {
                    ah.a(this.g, str, campaignEx, nativeTrackingListener, list);
                } else {
                    ah.a(this.g, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:4:0x0004, B:6:0x000e, B:10:0x001f, B:11:0x002b, B:13:0x0031, B:21:0x005e, B:22:0x006c, B:26:0x007e, B:28:0x0085, B:29:0x008d, B:32:0x0096), top: B:38:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:4:0x0004, B:6:0x000e, B:10:0x001f, B:11:0x002b, B:13:0x0031, B:21:0x005e, B:22:0x006c, B:26:0x007e, B:28:0x0085, B:29:0x008d, B:32:0x0096), top: B:38:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.mbridge.msdk.foundation.entity.CampaignEx r9, com.mbridge.msdk.click.entity.JumpLoaderResult r10, boolean r11, int r12, java.util.List<java.lang.String> r13) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L7c
            java.lang.String r2 = r9.getLandingType()     // Catch: java.lang.Throwable -> L7a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L7a
            if (r2 != r1) goto L1c
            android.content.Context r12 = r8.g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r8.i     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.foundation.tools.ah.a(r12, r2, r3, r9, r13)     // Catch: java.lang.Throwable -> L7a
        L19:
            r0 = r1
            goto L7c
        L1c:
            r3 = 2
            if (r2 != r3) goto L2b
            android.content.Context r12 = r8.g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r8.i     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.foundation.tools.ah.a(r12, r2, r9, r3, r13)     // Catch: java.lang.Throwable -> L7a
            goto L19
        L2b:
            java.lang.String r2 = r9.getPackageName()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L6c
            android.content.Context r2 = r8.g     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r9.getPackageName()     // Catch: java.lang.Throwable -> L7a
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r8.i     // Catch: java.lang.Throwable -> L7a
            boolean r2 = com.mbridge.msdk.foundation.tools.ah.a.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L5e
            if (r13 == 0) goto L57
            java.lang.String r12 = "google_play"
            r13.add(r12)     // Catch: java.lang.Throwable -> L5b
        L57:
            r8.a(r9, r1, r1, r13)     // Catch: java.lang.Throwable -> L5b
            goto L19
        L5b:
            r9 = move-exception
            r0 = r1
            goto L9e
        L5e:
            java.lang.String r4 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r8.i     // Catch: java.lang.Throwable -> L7a
            r2 = r8
            r3 = r12
            r5 = r9
            r7 = r13
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7a
            goto L7c
        L6c:
            java.lang.String r4 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r8.i     // Catch: java.lang.Throwable -> L7a
            r2 = r8
            r3 = r12
            r5 = r9
            r7 = r13
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7a
            goto L7c
        L7a:
            r9 = move-exception
            goto L9e
        L7c:
            if (r0 == 0) goto L8d
            r8.a(r10, r9, r1)     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r11 = r8.i     // Catch: java.lang.Throwable -> L7a
            if (r11 == 0) goto Lab
            java.lang.String r10 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            r11.onFinishRedirection(r9, r10)     // Catch: java.lang.Throwable -> L7a
            goto Lab
        L8d:
            r8.a(r10, r9, r1)     // Catch: java.lang.Throwable -> L7a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r12 = r8.i     // Catch: java.lang.Throwable -> L7a
            if (r12 == 0) goto Lab
            if (r11 == 0) goto Lab
            java.lang.String r10 = r10.getUrl()     // Catch: java.lang.Throwable -> L7a
            r12.onRedirectionFailed(r9, r10)     // Catch: java.lang.Throwable -> L7a
            goto Lab
        L9e:
            boolean r10 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r10 == 0) goto Lab
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = "CommonClickControl"
            com.mbridge.msdk.foundation.tools.ad.a(r11, r10, r9)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, int, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.mbridge.msdk.foundation.entity.CampaignEx r6, com.mbridge.msdk.click.entity.JumpLoaderResult r7, boolean r8, java.util.List<java.lang.String> r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L23
            boolean r8 = com.mbridge.msdk.f.b.a()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L17
            android.content.Context r8 = r5.g     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r6.getNoticeUrl()     // Catch: java.lang.Throwable -> L49
            int r4 = com.mbridge.msdk.foundation.same.a.L     // Catch: java.lang.Throwable -> L49
            com.mbridge.msdk.click.b.a(r8, r2, r6, r3, r4)     // Catch: java.lang.Throwable -> L49
        L17:
            android.content.Context r8 = r5.g     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r6.getClickURL()     // Catch: java.lang.Throwable -> L49
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r5.i     // Catch: java.lang.Throwable -> L49
            com.mbridge.msdk.foundation.tools.ah.a(r8, r2, r3, r6, r9)     // Catch: java.lang.Throwable -> L49
            r1 = r0
        L23:
            r5.a(r7, r6, r0)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L34
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r8 = r5.i     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L57
            java.lang.String r7 = r7.getUrl()     // Catch: java.lang.Throwable -> L49
            r8.onFinishRedirection(r6, r7)     // Catch: java.lang.Throwable -> L49
            goto L57
        L34:
            boolean r8 = com.mbridge.msdk.f.b.a()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L3d
            r5.a(r7, r6, r0)     // Catch: java.lang.Throwable -> L49
        L3d:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r8 = r5.i     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L57
            java.lang.String r7 = r7.getUrl()     // Catch: java.lang.Throwable -> L49
            r8.onRedirectionFailed(r6, r7)     // Catch: java.lang.Throwable -> L49
            goto L57
        L49:
            r6 = move-exception
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto L57
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "CommonClickControl"
            com.mbridge.msdk.foundation.tools.ad.a(r8, r7, r6)
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, java.util.List):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1 A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:3:0x000a, B:10:0x0016, B:12:0x0021, B:14:0x0027, B:16:0x002b, B:19:0x0039, B:21:0x003f, B:24:0x0053, B:26:0x0057, B:28:0x0069, B:31:0x0073, B:33:0x007d, B:35:0x0087, B:38:0x0097, B:46:0x00d1, B:47:0x00e0, B:50:0x00e6, B:73:0x0159, B:75:0x0167, B:77:0x016e, B:81:0x0176, B:76:0x016b, B:42:0x00a8, B:44:0x00b2, B:54:0x00f5, B:56:0x010e, B:59:0x0114, B:62:0x0121, B:64:0x0127, B:66:0x012b, B:68:0x0131, B:70:0x0143, B:72:0x0152, B:84:0x0181, B:86:0x0188), top: B:91:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r17, com.mbridge.msdk.click.entity.JumpLoaderResult r18, boolean r19, boolean r20, java.lang.Boolean r21, java.util.List<java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    private int b() {
        try {
            com.mbridge.msdk.c.g gVar = this.k;
            if (gVar != null) {
                return gVar.X();
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Lc
            boolean r4 = com.mbridge.msdk.foundation.tools.ah.a.b(r5)     // Catch: java.lang.Exception -> L16
            if (r4 == 0) goto L13
            goto L14
        Lc:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L16
            if (r4 != 0) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            r2 = r1
            goto L1a
        L16:
            r4 = move-exception
            r4.printStackTrace()
        L1a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(int, java.lang.String):boolean");
    }

    private void a(CampaignEx campaignEx, int i, int i2, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", Integer.valueOf(i));
            dVar.a("result", Integer.valueOf(i2));
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", e.getMessage());
            }
        }
    }

    static /* synthetic */ void a(a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.g, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.g.startActivity(intent);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", "Exception", e);
            }
        }
    }

    static /* synthetic */ void a(a aVar, final boolean z, final Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.click.a.5
            @Override // java.lang.Runnable
            public final void run() {
                if (z && !a.f2514a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.f(a.this);
                }
                if (a.this.i == null || a.f2514a || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    return;
                }
                a.this.i.onDismissLoading(campaign);
            }
        });
    }

    static /* synthetic */ void f(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.g.sendBroadcast(intent);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", "Exception", e);
            }
        }
    }
}
