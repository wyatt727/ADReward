package com.bytedance.sdk.openadsdk.MxO;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.Map;

/* compiled from: TTAdNetDepend.java */
/* loaded from: classes2.dex */
public class mZx implements com.bytedance.sdk.component.IPb.Td.mZx {
    public static String EYQ = "sp_multi_ttadnet_config";
    private final Context mZx;

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public Address EYQ(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public int Pm() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public String Td() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public String mZx() {
        return "pangle_sdk";
    }

    public mZx(Context context) {
        this.mZx = context;
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public int EYQ() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public String Kbd() {
        return MxO.EYQ(this.mZx);
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public String EYQ(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx(EYQ, str, str2);
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public void EYQ(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ(EYQ, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ(EYQ, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ(EYQ, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ(EYQ, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ(EYQ, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.IPb.Td.mZx
    public String[] IPb() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String strVD = hu.Pm().vD();
        if (!TextUtils.isEmpty(strVD)) {
            return ("SG".equals(strVD) || "CN".equals(strVD)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int iHu = FH.hu();
        return (iHu == 2 || iHu == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
