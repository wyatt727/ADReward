package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class CampaignUnit extends b implements NoProGuard, Serializable {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.b
    public String assembCParams() {
        String str;
        String strValueOf;
        if (this.cParams != null && this.cParams.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String strC = z.c();
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            String strK = z.k(contextC);
            String strJ = z.j(contextC);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                strValueOf = String.valueOf(z.l(contextC));
                str = z.i(contextC) + "x" + z.g(contextC);
            } else {
                str = "";
                strValueOf = str;
            }
            StringBuffer stringBuffer = this.cParams;
            stringBuffer.append(getAdType());
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty("1"));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(z.h()));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(str));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(Integer.valueOf(z.r(com.mbridge.msdk.foundation.controller.c.m().c()))));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(z.s(com.mbridge.msdk.foundation.controller.c.m().c())));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(strValueOf));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(strJ));
            stringBuffer.append(nullToEmpty(strK));
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(strC));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(""));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(z.w()));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(""));
            stringBuffer.append("|");
            stringBuffer.append("");
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(""));
            stringBuffer.append("|");
            stringBuffer.append(nullToEmpty(com.mbridge.msdk.foundation.same.a.U + "," + com.mbridge.msdk.foundation.same.a.g));
            stringBuffer.append("|");
            stringBuffer.append(z.i());
            stringBuffer.append("|");
            this.cParams = stringBuffer;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a(TAG, th.getMessage(), th);
            }
        }
        return this.cParams.toString();
    }
}
