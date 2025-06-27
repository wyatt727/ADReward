package com.bytedance.adsdk.lottie.Pm;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.lottie.MxO;
import com.json.m4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes2.dex */
public class QQ {
    private final VwS EYQ;
    private final IPb mZx;

    public QQ(VwS vwS, IPb iPb) {
        this.EYQ = vwS;
        this.mZx = iPb;
    }

    public MxO<com.bytedance.adsdk.lottie.IPb> EYQ(Context context, String str, String str2) {
        com.bytedance.adsdk.lottie.IPb iPbMZx = mZx(context, str, str2);
        if (iPbMZx != null) {
            return new MxO<>(iPbMZx);
        }
        return Td(context, str, str2);
    }

    private com.bytedance.adsdk.lottie.IPb mZx(Context context, String str, String str2) throws IOException {
        VwS vwS;
        Pair<Td, InputStream> pairEYQ;
        MxO<com.bytedance.adsdk.lottie.IPb> mxOMZx;
        if (str2 == null || (vwS = this.EYQ) == null || (pairEYQ = vwS.EYQ(str)) == null) {
            return null;
        }
        Td td = (Td) pairEYQ.first;
        InputStream inputStream = (InputStream) pairEYQ.second;
        if (td == Td.ZIP) {
            mxOMZx = com.bytedance.adsdk.lottie.VwS.EYQ(context, new ZipInputStream(inputStream), str2);
        } else {
            mxOMZx = com.bytedance.adsdk.lottie.VwS.mZx(inputStream, str2);
        }
        if (mxOMZx.EYQ() != null) {
            return mxOMZx.EYQ();
        }
        return null;
    }

    private MxO<com.bytedance.adsdk.lottie.IPb> Td(Context context, String str, String str2) {
        Pm pm = null;
        try {
            try {
                Pm pmEYQ = this.mZx.EYQ(str);
                if (pmEYQ.EYQ()) {
                    MxO<com.bytedance.adsdk.lottie.IPb> mxOEYQ = EYQ(context, str, pmEYQ.mZx(), pmEYQ.Td(), str2);
                    mxOEYQ.EYQ();
                    if (pmEYQ != null) {
                        try {
                            pmEYQ.close();
                        } catch (IOException unused) {
                        }
                    }
                    return mxOEYQ;
                }
                MxO<com.bytedance.adsdk.lottie.IPb> mxO = new MxO<>(new IllegalArgumentException(pmEYQ.Pm()));
                if (pmEYQ != null) {
                    try {
                        pmEYQ.close();
                    } catch (IOException unused2) {
                    }
                }
                return mxO;
            } catch (Exception e) {
                MxO<com.bytedance.adsdk.lottie.IPb> mxO2 = new MxO<>(e);
                if (0 != 0) {
                    try {
                        pm.close();
                    } catch (IOException unused3) {
                    }
                }
                return mxO2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    pm.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private MxO<com.bytedance.adsdk.lottie.IPb> EYQ(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        MxO<com.bytedance.adsdk.lottie.IPb> mxOEYQ;
        Td td;
        VwS vwS;
        if (str2 == null) {
            str2 = m4.K;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            Td td2 = Td.ZIP;
            mxOEYQ = EYQ(context, str, inputStream, str3);
            td = td2;
        } else {
            td = Td.JSON;
            mxOEYQ = EYQ(str, inputStream, str3);
        }
        if (str3 != null && mxOEYQ.EYQ() != null && (vwS = this.EYQ) != null) {
            vwS.EYQ(str, td);
        }
        return mxOEYQ;
    }

    private MxO<com.bytedance.adsdk.lottie.IPb> EYQ(Context context, String str, InputStream inputStream, String str2) throws IOException {
        VwS vwS;
        if (str2 == null || (vwS = this.EYQ) == null) {
            return com.bytedance.adsdk.lottie.VwS.EYQ(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.lottie.VwS.EYQ(context, new ZipInputStream(new FileInputStream(vwS.EYQ(str, inputStream, Td.ZIP))), str);
    }

    private MxO<com.bytedance.adsdk.lottie.IPb> EYQ(String str, InputStream inputStream, String str2) throws IOException {
        VwS vwS;
        if (str2 == null || (vwS = this.EYQ) == null) {
            return com.bytedance.adsdk.lottie.VwS.mZx(inputStream, (String) null);
        }
        return com.bytedance.adsdk.lottie.VwS.mZx(new FileInputStream(vwS.EYQ(str, inputStream, Td.JSON).getAbsolutePath()), str);
    }
}
