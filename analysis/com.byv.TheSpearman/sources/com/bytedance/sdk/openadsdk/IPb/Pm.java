package com.bytedance.sdk.openadsdk.IPb;

import android.content.Context;
import com.bytedance.sdk.component.Pm.KO;
import com.bytedance.sdk.component.Pm.Td.Kbd;
import com.bytedance.sdk.component.Pm.tp;
import com.bytedance.sdk.component.mZx.EYQ.IPb;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.utils.lEs;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageLoaderWrapper.java */
/* loaded from: classes2.dex */
public class Pm {
    public static tp EYQ(String str) {
        return EYQ.mZx(str);
    }

    public static tp EYQ(nWX nwx) {
        return EYQ.mZx(nwx);
    }

    public static InputStream EYQ(String str, String str2) {
        return EYQ.mZx(str, str2);
    }

    public static boolean EYQ(String str, String str2, String str3) {
        return EYQ.mZx(str, str2, str3);
    }

    public static KO EYQ() {
        return EYQ.EYQ;
    }

    /* compiled from: ImageLoaderWrapper.java */
    private static final class EYQ {
        private static final KO EYQ = EYQ(hu.EYQ());

        private static KO EYQ(Context context) {
            return com.bytedance.sdk.component.Pm.Td.mZx.EYQ(context, new Kbd.EYQ().EYQ(new com.bytedance.sdk.component.Pm.Td.EYQ.EYQ(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).EYQ(xt.mZx()).EYQ(new com.bytedance.sdk.component.Pm.Pm() { // from class: com.bytedance.sdk.openadsdk.IPb.Pm.EYQ.1
                @Override // com.bytedance.sdk.component.Pm.Pm
                /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.Pm.mZx.Pm EYQ(com.bytedance.sdk.component.Pm.Kbd kbd) throws IOException {
                    MxO mxOKbd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Kbd();
                    pi piVarMZx = new pi.EYQ().EYQ(kbd.EYQ()).EYQ().mZx();
                    com.bytedance.sdk.component.mZx.EYQ.KO koEYQ = null;
                    com.bytedance.sdk.component.Pm.mZx.Kbd kbd2 = kbd.Td() ? new com.bytedance.sdk.component.Pm.mZx.Kbd() : null;
                    if (kbd2 != null) {
                        kbd2.EYQ(System.currentTimeMillis());
                    }
                    try {
                        koEYQ = mxOKbd.EYQ(piVarMZx).EYQ();
                        if (kbd2 != null) {
                            kbd2.mZx(System.currentTimeMillis());
                        }
                        Map<String, String> mapEYQ = EYQ(kbd, koEYQ);
                        byte[] bArrPm = koEYQ.IPb().Pm();
                        if (kbd2 != null) {
                            kbd2.Td(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.Pm.mZx.Pm pm = new com.bytedance.sdk.component.Pm.mZx.Pm(koEYQ.Td(), bArrPm, "", mapEYQ);
                        pm.EYQ(kbd2);
                        return pm;
                    } catch (Throwable th) {
                        try {
                            return EYQ(kbd2, th);
                        } finally {
                            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(koEYQ);
                        }
                    }
                }

                private Map<String, String> EYQ(com.bytedance.sdk.component.Pm.Kbd kbd, com.bytedance.sdk.component.mZx.EYQ.KO ko) {
                    if (!kbd.mZx()) {
                        return null;
                    }
                    IPb iPbVwS = ko.VwS();
                    HashMap map = new HashMap();
                    int iEYQ = iPbVwS.EYQ();
                    for (int i = 0; i < iEYQ; i++) {
                        String strEYQ = iPbVwS.EYQ(i);
                        String strMZx = iPbVwS.mZx(i);
                        if (strEYQ != null) {
                            map.put(strEYQ, strMZx);
                        }
                    }
                    return map;
                }

                private com.bytedance.sdk.component.Pm.mZx.Pm EYQ(com.bytedance.sdk.component.Pm.mZx.Kbd kbd, Throwable th) {
                    th.getMessage();
                    if (kbd != null) {
                        kbd.Td(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.Pm.mZx.Pm pm = new com.bytedance.sdk.component.Pm.mZx.Pm(98765, th, "net failed");
                    pm.EYQ(kbd);
                    return pm;
                }
            }).EYQ());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static tp mZx(String str) {
            return EYQ(EYQ.EYQ(str).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static tp mZx(nWX nwx) {
            return EYQ(EYQ.EYQ(nwx.EYQ()).EYQ(nwx.mZx()).mZx(nwx.Td()).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).EYQ(nwx.VwS()));
        }

        private static tp EYQ(tp tpVar) {
            return lEs.EYQ() ? tpVar.EYQ(new Kbd()) : tpVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream mZx(String str, String str2) {
            return EYQ.EYQ(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean mZx(String str, String str2, String str3) {
            return EYQ.EYQ(str, str2, str3);
        }
    }
}
