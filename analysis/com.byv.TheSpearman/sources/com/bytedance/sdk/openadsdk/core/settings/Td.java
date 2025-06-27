package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: AppSetIdAndScope.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile String EYQ = "";
    private static int Pm = 0;
    private static String Td = null;
    private static volatile String mZx = "";

    public static void EYQ() {
        try {
            AppSet.getClient(hu.EYQ()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = Td.EYQ = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = Td.mZx = appSetIdInfo.getId();
                    int unused3 = Td.Pm = 1;
                }
            });
        } catch (Throwable unused) {
            Pm = 2;
        }
    }

    public static String mZx() {
        if (Pm != 0) {
            return EYQ;
        }
        EYQ();
        return EYQ;
    }

    public static String Td() {
        if (Pm != 0) {
            return mZx;
        }
        EYQ();
        return mZx;
    }

    public static String Pm() {
        if (TextUtils.isEmpty(Td)) {
            Td = hu.EYQ().getPackageManager().getInstallerPackageName(FH.Kbd());
        }
        if (Td == null) {
            Td = "";
        }
        return Td;
    }
}
