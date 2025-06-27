package com.mbridge.msdk.video.module.a.a;

import android.net.Uri;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: ContainerViewStatisticsListener.java */
/* loaded from: classes4.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        if (this.f3755a) {
            try {
                if (this.b != null && this.b.getDynamicTempCode() == 5) {
                    b(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i != 105 && i != 106 && i != 113) {
                if (i != 122) {
                    switch (i) {
                        case 109:
                            b(2);
                            a(2);
                            break;
                        case 110:
                            b(1);
                            a(1);
                            break;
                        case 111:
                            a(1);
                            break;
                    }
                }
                a();
                return;
            }
            com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
            if (i != 105) {
                String noticeUrl = this.b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(com.mbridge.msdk.foundation.same.a.m)) {
                        noticeUrl = noticeUrl + t2.i.c + com.mbridge.msdk.foundation.same.a.m + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(com.mbridge.msdk.foundation.same.a.m + t2.i.b + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.m), com.mbridge.msdk.foundation.same.a.m + "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.g, noticeUrl, true, false, com.mbridge.msdk.click.a.a.i);
            }
        }
    }
}
