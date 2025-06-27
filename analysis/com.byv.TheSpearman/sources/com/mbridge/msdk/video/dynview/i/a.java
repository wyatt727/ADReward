package com.mbridge.msdk.video.dynview.i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: UIControlUtil.java */
/* loaded from: classes4.dex */
public final class a {
    public static String a(Context context, int i) {
        String str = i == 1 ? "_por" : "_land";
        String strS = z.s(context);
        if (strS.startsWith("zh")) {
            return (strS.contains("TW") || strS.contains("HK")) ? "mbridge_reward_two_title_zh_trad" : "mbridge_reward_two_title_zh";
        }
        if (strS.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        }
        if (strS.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        }
        if (strS.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        }
        if (strS.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        }
        if (strS.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        }
        if (strS.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        }
        return "mbridge_reward_two_title_en" + str;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    public static int a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
            int iF = campaignEx.getRewardTemplateMode().f();
            if (iF == 302 || iF == 802 || iF == 902) {
                return -3;
            }
            if (iF == 904) {
                return !a(campaignEx.getRewardTemplateMode().e()) ? -1 : -3;
            }
        }
        return 100;
    }
}
