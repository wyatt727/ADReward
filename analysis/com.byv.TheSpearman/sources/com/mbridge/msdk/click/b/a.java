package com.mbridge.msdk.click.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.json.t2;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* compiled from: DspFilterUtils.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f2525a = 1;
    public static int b = 2;
    public static int c = 1500;
    private static String d = "2000109";
    private static String e = "DspFilterUtils";

    public static boolean a(CampaignEx campaignEx, String str, int i) {
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            z = campaignEx.getFac() != 0;
            try {
                Context contextC = c.m().c();
                if (contextC != null && campaignEx != null) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace(AdPayload.FILE_SCHEME, ""));
                        if (file.exists()) {
                            str = ab.b(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + d + t2.i.c);
                    stringBuffer.append("type=" + i + t2.i.c);
                    stringBuffer.append("html=" + str + t2.i.c);
                    stringBuffer.append("network_type=" + z.l(contextC) + t2.i.c);
                    stringBuffer.append("unit_id=" + campaignEx.getCampaignUnitId() + t2.i.c);
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append(t2.i.c);
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=");
                        stringBuffer.append("1");
                        stringBuffer.append(t2.i.c);
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append(t2.i.c);
                    }
                    stringBuffer.append("cid=" + campaignEx.getId());
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        k.b(contextC, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                ad.b(e, th.getMessage());
            }
        }
        return z;
    }
}
