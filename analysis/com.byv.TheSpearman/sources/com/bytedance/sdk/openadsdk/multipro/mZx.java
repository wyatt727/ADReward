package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* compiled from: MultiGlobalInfo.java */
/* loaded from: classes2.dex */
public class mZx {
    public static Boolean EYQ;

    public static void EYQ() {
        EYQ = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_info", "is_support_multi_process", Boolean.TRUE);
    }

    public static void mZx() {
        EYQ = Boolean.FALSE;
        BinderPoolService.EYQ = true;
    }

    public static boolean Td() {
        Boolean bool = EYQ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!pi.Kbd()) {
            return false;
        }
        if (EYQ == null) {
            EYQ = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_info", "is_support_multi_process", false));
        }
        return EYQ.booleanValue();
    }
}
